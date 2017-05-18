// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2017-05-18 11:46:30 -0700
package jnr.constants.platform.sparcv9.linux;
public enum AddressFamily implements jnr.constants.Constant {
AF_UNSPEC(0L),
AF_LOCAL(1L),
AF_UNIX(1L),
AF_INET(2L),
// AF_IMPLINK not defined
// AF_PUP not defined
// AF_CHAOS not defined
// AF_NS not defined
// AF_ISO not defined
// AF_OSI not defined
// AF_ECMA not defined
// AF_DATAKIT not defined
// AF_CCITT not defined
AF_SNA(22L),
AF_DECnet(12L),
// AF_DLI not defined
// AF_LAT not defined
// AF_HYLINK not defined
AF_APPLETALK(5L),
AF_ROUTE(16L),
// AF_LINK not defined
// pseudo_AF_XTP not defined
// AF_COIP not defined
// AF_CNT not defined
// pseudo_AF_RTIP not defined
AF_IPX(4L),
// AF_SIP not defined
// pseudo_AF_PIP not defined
// AF_NDRV not defined
AF_ISDN(34L),
// AF_E164 not defined
// pseudo_AF_KEY not defined
AF_INET6(10L),
// AF_NATM not defined
// AF_SYSTEM not defined
// AF_NETBIOS not defined
// AF_PPP not defined
// AF_ATM not defined
// pseudo_AF_HDRCMPLT not defined
// AF_NETGRAPH not defined
AF_AX25(3L),
AF_MAX(37L);
private final long value;
private AddressFamily(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 37L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}