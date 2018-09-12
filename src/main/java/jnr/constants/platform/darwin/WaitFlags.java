// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-11 20:18:37 -0500
package jnr.constants.platform.darwin;
public enum WaitFlags implements jnr.constants.Constant {
WNOHANG(0x1L),
WUNTRACED(0x2L),
WSTOPPED(0x8L),
WEXITED(0x4L),
WCONTINUED(0x10L),
WNOWAIT(0x20L);
private final long value;
private WaitFlags(long value) { this.value = value; }
public static final long MIN_VALUE = 0x1L;
public static final long MAX_VALUE = 0x20L;

static final class StringTable {
  public static final java.util.Map<WaitFlags, String> descriptions = generateTable();
  public static final java.util.Map<WaitFlags, String> generateTable() {
    java.util.Map<WaitFlags, String> map = new java.util.EnumMap<WaitFlags, String>(WaitFlags.class);
  map.put(WNOHANG, "WNOHANG");
  map.put(WUNTRACED, "WUNTRACED");
  map.put(WSTOPPED, "WSTOPPED");
  map.put(WEXITED, "WEXITED");
  map.put(WCONTINUED, "WCONTINUED");
  map.put(WNOWAIT, "WNOWAIT");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
