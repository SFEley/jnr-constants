// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Fri Nov 14 05:10:54 +0000 2008
package com.kenai.constantine.platform.sunos;
public enum ProtocolFamily implements com.kenai.constantine.Constant {
PF_UNSPEC(0),
// PF_LOCAL not defined
PF_UNIX(1),
PF_INET(2),
PF_IMPLINK(3),
PF_PUP(4),
PF_CHAOS(5),
PF_NS(6),
// PF_ISO not defined
PF_OSI(19),
PF_ECMA(8),
PF_DATAKIT(9),
PF_CCITT(10),
PF_SNA(11),
PF_DECnet(12),
PF_DLI(13),
PF_LAT(14),
PF_HYLINK(15),
PF_APPLETALK(16),
PF_ROUTE(24),
PF_LINK(25),
// PF_XTP not defined
// PF_COIP not defined
// PF_CNT not defined
// PF_SIP not defined
PF_IPX(23),
// PF_RTIP not defined
// PF_PIP not defined
// PF_NDRV not defined
// PF_ISDN not defined
PF_KEY(27),
PF_INET6(26),
// PF_NATM not defined
// PF_SYSTEM not defined
// PF_NETBIOS not defined
// PF_PPP not defined
// PF_ATM not defined
// PF_NETGRAPH not defined
PF_MAX(30);
private final int value;
private ProtocolFamily(int value) { this.value = value; }
public static final long MIN_VALUE = 0;
public static final long MAX_VALUE = 30;

public final int value() { return value; }
}