// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-20 16:28:41 +0000
package jnr.constants.platform;
public enum Fcntl implements jnr.constants.Constant {
FAPPEND,
FREAD,
FWRITE,
FASYNC,
FFSYNC,
FNONBLOCK,
FNDELAY,
F_DUPFD,
F_GETFD,
F_SETFD,
F_GETFL,
F_SETFL,
F_GETOWN,
F_SETOWN,
F_GETLK,
F_SETLK,
F_SETLKW,
F_CHKCLEAN,
F_PREALLOCATE,
F_SETSIZE,
F_RDADVISE,
F_RDAHEAD,
F_READBOOTSTRAP,
F_WRITEBOOTSTRAP,
F_NOCACHE,
F_LOG2PHYS,
F_GETPATH,
F_FULLFSYNC,
F_PATHPKG_CHECK,
F_FREEZE_FS,
F_THAW_FS,
F_GLOBAL_NOCACHE,
F_ADDSIGS,
F_MARKDEPENDENCY,
F_RDLCK,
F_UNLCK,
F_WRLCK,
F_ALLOCATECONTIG,
F_ALLOCATEALL,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<Fcntl> resolver = 
ConstantResolver.getResolver(Fcntl.class, 20000, 20999);
public final int value() { return (int) resolver.longValue(this); }
public final int intValue() { return (int) resolver.longValue(this); }
public final long longValue() { return resolver.longValue(this); }
public final String description() { return resolver.description(this); }
public final boolean defined() { return resolver.defined(this); }
public final String toString() { return description(); }
public static Fcntl valueOf(long value) { 
    return resolver.valueOf(value);
}
}
