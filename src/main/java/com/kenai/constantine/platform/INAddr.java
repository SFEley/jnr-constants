// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Sat May 02 18:23:30 +1000 2009
package com.kenai.constantine.platform;
@Deprecated
public enum INAddr implements com.kenai.constantine.Constant {
INADDR_ANY,
INADDR_BROADCAST,
INADDR_NONE,
INADDR_LOOPBACK,
INADDR_UNSPEC_GROUP,
INADDR_ALLHOSTS_GROUP,
INADDR_ALLRTRS_GROUP,
INADDR_MAX_LOCAL_GROUP,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<INAddr> resolver = 
ConstantResolver.getResolver(INAddr.class, 20000, 29999);
public final int value() { return resolver.intValue(this); }
public final int intValue() { return (int) resolver.longValue(this); }
public final long longValue() { return resolver.longValue(this); }
public final String description() { return resolver.description(this); }
public final boolean defined() { return true; }
public final String toString() { return description(); }
public final static INAddr valueOf(int value) { 
    return resolver.valueOf(value);
}
}
