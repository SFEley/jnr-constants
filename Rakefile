$VERBOSE = true
$verbose = Rake.application.options.trace

require 'rubygems'
require 'ffi'
require 'fileutils'

ICONSTANT = "com.kenai.constantine.Constant"
PLATFORM_PREFIX = "com.kenai.constantine.platform"
PLATFORM_DIR = "src/com/kenai/constantine/platform"
OS = FFI::Platform::OS
ARCH = FFI::Platform::ARCH
IS_WINDOWS = OS =~ /^win/
CONSTANTS = Dir["gen/const/*.rb"].map {|c| File.basename(c, ".rb") }

def gen_platform_constants(name, pkg, file_name, options = {})
  meth = "gen_#{name.downcase}_java".to_sym
  FileUtils.makedirs(File.dirname(file_name))
  File.open(file_name, "w") do |f|
    constants = send(meth, options).constants
    raise ArgumentError, "No constants generated for #{name}" if constants.empty?
    
    f.puts "// WARNING: This file is autogenerated. DO NOT EDIT!"
    f.puts "// Generated #{Time.now}"
    f.puts "package #{pkg};"
    f.puts "public enum #{name} implements #{ICONSTANT} {";
    sep = nil
    comments = []
    sorted = constants.values.reject { |c| c.value.nil? }.sort
    min_value, max_value = sorted.first.value, sorted.last.value
    constants.values.each_with_index do |c, i|
      if c.value.nil?
        comments << "// #{c.name} not defined"
      else
        if sep
          f.puts sep
          comments.each {|comm| f.puts "#{comm}" }
          comments.clear
        else
          sep = ","
        end
        f.print "#{c.name}(#{c.value})"
      end
    end
    f.puts ";"

    comments.each {|comm| f.puts "#{comm}" }
    f.puts "private final int value;"
    f.puts "private #{name}(int value) { this.value = value; }"
    f.puts "public static final long MIN_VALUE = #{min_value};"
    f.puts "public static final long MAX_VALUE = #{max_value};"
    f.puts ""
    # Generate the string description table
    unless constants.values.reject {|c| c.description.nil? }.empty?
      f.puts "static final class StringTable {"
      f.puts "  public static final java.util.Map<#{name}, String> descriptions = generateTable();"
      f.puts "  public static final java.util.Map<#{name}, String> generateTable() {"
      f.puts "    java.util.Map<#{name}, String> map = new java.util.EnumMap<#{name}, String>(#{name}.class);"
      constants.values.each do |c|
        if !c.value.nil?
          f.puts "  map.put(#{c.name}, \"#{c.description.nil? ? c.name : c.description}\");"
        end
      end
      f.puts "    return map;"
      f.puts "  }"
      f.puts "}"
      f.puts "public final String toString() { return StringTable.descriptions.get(this); }"
    end
    f.puts "public final int value() { return value; }"
    f.puts "}"
  end
end
def gen_fake_constants(name, pkg, file_name, options = {})
  meth = "gen_#{name.downcase}_java".to_sym
  FileUtils.makedirs(File.dirname(file_name))
  File.open(file_name, "w") do |f|
    cg = send(meth, options)
    names = cg.names

    f.puts "// WARNING: This file is autogenerated. DO NOT EDIT!"
    f.puts "// Generated #{Time.now}"
    f.puts "package #{pkg};"
    f.puts "public enum #{name} implements #{ICONSTANT} {";

    max_value = 0
    names.each_with_index do |c, i|
      max_value = cg.type ==:bitmask ? "0x#{(1 << i).to_s(16)}" : i + 1
      f.puts "#{c}(#{max_value})#{i < (names.length - 1) ? ',' : ';'}"
    end

    f.puts "private final int value;"
    f.puts "private #{name}(int value) { this.value = value; }"
    f.puts "public static final long MIN_VALUE = 1;"
    f.puts "public static final long MAX_VALUE = #{max_value};"
    f.puts "public final int value() { return value; }"
    f.puts "}"
  end
end
def gen_xplatform_constants(name, pkg, file_name, options = {})
  meth = "gen_#{name.downcase}_java".to_sym
  FileUtils.makedirs(File.dirname(file_name))
  File.open(file_name, "w") do |f|
    cg = send(meth, options)
    names = cg.names

    f.puts "// WARNING: This file is autogenerated. DO NOT EDIT!"
    f.puts "// Generated #{Time.now}"
    f.puts "package #{pkg};"
    f.puts "public enum #{name} implements #{ICONSTANT} {";
    names.each { |n| f.puts "#{n}," }
    f.puts "__UNKNOWN_CONSTANT__;"
    unknown_range = cg.unknown_range
    f.puts "private static final ConstantResolver<#{name}> resolver = "
    if cg.type == :bitmask
      f.puts "ConstantResolver.getBitmaskResolver(#{name}.class);"
    elsif !unknown_range.empty?
      f.puts "ConstantResolver.getResolver(#{name}.class, #{unknown_range[:first]}, #{unknown_range[:last]});"
    else
      f.puts "ConstantResolver.getResolver(#{name}.class);"
    end
    f.puts "public final int value() { return resolver.intValue(this); }"
    f.puts "public final String description() { return resolver.description(this); }"
    f.puts "public final String toString() { return description(); }"
    f.puts "public final static #{name} valueOf(int value) { "
    f.puts "    return resolver.valueOf(value);"
    f.puts "}"
    f.puts "}"
  end
end
xplatform_files = []
platform_files = []
fake_files = []
CONSTANTS.each do |name|
  load File.join(File.dirname(__FILE__), "gen", "const", "#{name}.rb")
  platform_files << File.join(PLATFORM_DIR, OS, "#{name}.java")
  file File.join(PLATFORM_DIR, OS, "#{name}.java") do |t|
    gen_platform_constants(name, "#{PLATFORM_PREFIX}.#{OS}", t.name)
  end
  xplatform_files << File.join(PLATFORM_DIR, "#{name}.java")
  file File.join(PLATFORM_DIR, "#{name}.java") do |t|
    gen_xplatform_constants(name, PLATFORM_PREFIX, t.name)
  end
  fake_files << File.join(PLATFORM_DIR, "fake", "#{name}.java")
  file File.join(PLATFORM_DIR, "fake", "#{name}.java") do |t|
    gen_fake_constants(name, "#{PLATFORM_PREFIX}.fake", t.name)
  end
end unless IS_WINDOWS

task :default => :generate
task :generate => platform_files + xplatform_files + fake_files
task :regen => [ :clean, :generate ]
task :clean => [ "clean:platform", "clean:xplatform", "clean:fake" ]
namespace :clean do
  task :platform do
    FileUtils.rm_f(platform_files)
  end
  task :xplatform do
    FileUtils.rm_f(xplatform_files)
  end
  task :fake do
    FileUtils.rm_f(fake_files)
  end
end
namespace :generate do
  desc "Generate missing architecture constants"
  task :platform => platform_files
  desc "Generate missing platform-independent constants"
  task :xplatform => xplatform_files
  desc "Generate missing fake constants"
  task :fake => fake_files
end
namespace :regen do
  desc "Force regeneration of architecture constants"
  task :platform => [ "clean:platform" ] + platform_files
  desc "Force regeneration of platform-independent constants"
  task :xplatform => [ "clean:xplatform" ] + xplatform_files
  desc "Force regeneration of fake constants"
  task :fake => [ "clean:fake" ] + fake_files
end
