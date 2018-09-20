// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-20 16:28:34 +0000
package jnr.constants.platform.linux;
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
AF_MAX(41L);
private final long value;
private AddressFamily(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 41L;

static final class StringTable {
  public static final java.util.Map<AddressFamily, String> descriptions = generateTable();
  public static final java.util.Map<AddressFamily, String> generateTable() {
    java.util.Map<AddressFamily, String> map = new java.util.EnumMap<AddressFamily, String>(AddressFamily.class);
  map.put(AF_UNSPEC, "AF_UNSPEC");
  map.put(AF_LOCAL, "AF_LOCAL");
  map.put(AF_UNIX, "AF_UNIX");
  map.put(AF_INET, "AF_INET");
  map.put(AF_SNA, "AF_SNA");
  map.put(AF_DECnet, "AF_DECnet");
  map.put(AF_APPLETALK, "AF_APPLETALK");
  map.put(AF_ROUTE, "AF_ROUTE");
  map.put(AF_IPX, "AF_IPX");
  map.put(AF_ISDN, "AF_ISDN");
  map.put(AF_INET6, "AF_INET6");
  map.put(AF_AX25, "AF_AX25");
  map.put(AF_MAX, "AF_MAX");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
