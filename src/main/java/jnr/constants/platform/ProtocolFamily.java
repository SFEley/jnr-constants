// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-10-25 19:05:05 +0000
package jnr.constants.platform;
public enum ProtocolFamily implements jnr.constants.Constant {
PF_UNSPEC,
PF_LOCAL,
PF_UNIX,
PF_INET,
PF_IMPLINK,
PF_PUP,
PF_CHAOS,
PF_NS,
PF_ISO,
PF_OSI,
PF_ECMA,
PF_DATAKIT,
PF_CCITT,
PF_SNA,
PF_DECnet,
PF_DLI,
PF_LAT,
PF_HYLINK,
PF_APPLETALK,
PF_ROUTE,
PF_LINK,
PF_XTP,
PF_COIP,
PF_CNT,
PF_SIP,
PF_IPX,
PF_RTIP,
PF_PIP,
PF_NDRV,
PF_ISDN,
PF_KEY,
PF_INET6,
PF_NATM,
PF_SYSTEM,
PF_NETBIOS,
PF_PPP,
PF_ATM,
PF_NETGRAPH,
PF_MAX,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<ProtocolFamily> resolver = 
ConstantResolver.getResolver(ProtocolFamily.class, 20000, 29999);
public final int intValue() { return (int) resolver.longValue(this); }
public final long longValue() { return resolver.longValue(this); }
public final String description() { return resolver.description(this); }
public final boolean defined() { return resolver.defined(this); }
public final String toString() { return description(); }
public static ProtocolFamily valueOf(long value) { 
    return resolver.valueOf(value);
}
}
