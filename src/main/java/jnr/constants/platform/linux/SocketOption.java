// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-10-25 19:02:59 +0000
package jnr.constants.platform.linux;
public enum SocketOption implements jnr.constants.Constant {
SO_DEBUG(0x1L),
SO_ACCEPTCONN(0x1eL),
SO_REUSEADDR(0x2L),
SO_KEEPALIVE(0x9L),
SO_DONTROUTE(0x5L),
SO_BROADCAST(0x6L),
// SO_USELOOPBACK not defined
SO_LINGER(0xdL),
SO_OOBINLINE(0xaL),
SO_REUSEPORT(0xfL),
SO_TIMESTAMP(0x1dL),
// SO_ACCEPTFILTER not defined
// SO_DONTTRUNC not defined
// SO_WANTMORE not defined
// SO_WANTOOBFLAG not defined
SO_SNDBUF(0x7L),
SO_RCVBUF(0x8L),
SO_SNDLOWAT(0x13L),
SO_RCVLOWAT(0x12L),
SO_SNDTIMEO(0x15L),
SO_RCVTIMEO(0x14L),
SO_ERROR(0x4L),
SO_TYPE(0x3L),
// SO_NREAD not defined
// SO_NKE not defined
// SO_NOSIGPIPE not defined
// SO_NOADDRERR not defined
// SO_NWRITE not defined
// SO_REUSESHAREUID not defined
// SO_LABEL not defined
// SO_PEERLABEL not defined
SO_ATTACH_FILTER(0x1aL),
SO_BINDTODEVICE(0x19L),
SO_DETACH_FILTER(0x1bL),
SO_NO_CHECK(0xbL),
SO_PASSCRED(0x10L),
SO_PEERCRED(0x11L),
SO_PEERNAME(0x1cL),
SO_PRIORITY(0xcL),
SO_SECURITY_AUTHENTICATION(0x16L),
SO_SECURITY_ENCRYPTION_NETWORK(0x18L),
SO_SECURITY_ENCRYPTION_TRANSPORT(0x17L);
private final long value;
private SocketOption(long value) { this.value = value; }
public static final long MIN_VALUE = 0x1L;
public static final long MAX_VALUE = 0x1eL;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
