// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-10-25 19:05:09 +0000
package jnr.constants.platform.fake;
public enum PRIO implements jnr.constants.Constant {
PRIO_MIN(1),
PRIO_PROCESS(2),
PRIO_PGRP(3),
PRIO_USER(4),
PRIO_MAX(5);
private final long value;
private PRIO(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 5L;
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
