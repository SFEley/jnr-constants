// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2017-05-18 11:46:30 -0700
package jnr.constants.platform.sparcv9.linux;
public enum WaitFlags implements jnr.constants.Constant {
WNOHANG(0x1L),
WUNTRACED(0x2L),
WSTOPPED(0x2L),
WEXITED(0x4L),
WCONTINUED(0x8L),
WNOWAIT(0x1000000L);
private final long value;
private WaitFlags(long value) { this.value = value; }
public static final long MIN_VALUE = 0x1L;
public static final long MAX_VALUE = 0x1000000L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}