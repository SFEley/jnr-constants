// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2016-11-03 14:14:21 -0500
package jnr.constants.platform.solaris;
public enum SocketOption implements jnr.constants.Constant {
SO_DEBUG(0x1L),
SO_ACCEPTCONN(0x2L),
SO_REUSEADDR(0x4L),
SO_KEEPALIVE(0x8L),
SO_DONTROUTE(0x10L),
SO_BROADCAST(0x20L),
SO_USELOOPBACK(0x40L),
SO_LINGER(0x80L),
SO_OOBINLINE(0x100L),
SO_REUSEPORT(0x100eL),
SO_TIMESTAMP(0x1013L),
// SO_ACCEPTFILTER not defined
// SO_DONTTRUNC not defined
// SO_WANTMORE not defined
// SO_WANTOOBFLAG not defined
SO_SNDBUF(0x1001L),
SO_RCVBUF(0x1002L),
SO_SNDLOWAT(0x1003L),
SO_RCVLOWAT(0x1004L),
SO_SNDTIMEO(0x1005L),
SO_RCVTIMEO(0x1006L),
SO_ERROR(0x1007L),
SO_TYPE(0x1008L),
// SO_NREAD not defined
// SO_NKE not defined
// SO_NOSIGPIPE not defined
// SO_NOADDRERR not defined
// SO_NWRITE not defined
// SO_REUSESHAREUID not defined
// SO_LABEL not defined
// SO_PEERLABEL not defined
SO_ATTACH_FILTER(0x40000001L),
// SO_BINDTODEVICE not defined
SO_DETACH_FILTER(0x40000002L);
// SO_NO_CHECK not defined
// SO_PASSCRED not defined
// SO_PEERCRED not defined
// SO_PEERNAME not defined
// SO_PRIORITY not defined
// SO_SECURITY_AUTHENTICATION not defined
// SO_SECURITY_ENCRYPTION_NETWORK not defined
// SO_SECURITY_ENCRYPTION_TRANSPORT not defined
private final long value;
private SocketOption(long value) { this.value = value; }
public static final long MIN_VALUE = 0x1L;
public static final long MAX_VALUE = 0x40000002L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}