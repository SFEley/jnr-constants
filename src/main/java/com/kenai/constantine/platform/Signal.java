// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Sat May 02 18:23:29 +1000 2009
package com.kenai.constantine.platform;
@Deprecated
public enum Signal implements com.kenai.constantine.Constant {
SIGHUP,
SIGINT,
SIGQUIT,
SIGILL,
SIGTRAP,
SIGABRT,
SIGIOT,
SIGBUS,
SIGFPE,
SIGKILL,
SIGUSR1,
SIGSEGV,
SIGUSR2,
SIGPIPE,
SIGALRM,
SIGTERM,
SIGSTKFLT,
SIGCLD,
SIGCHLD,
SIGCONT,
SIGSTOP,
SIGTSTP,
SIGTTIN,
SIGTTOU,
SIGURG,
SIGXCPU,
SIGXFSZ,
SIGVTALRM,
SIGPROF,
SIGWINCH,
SIGPOLL,
SIGIO,
SIGPWR,
SIGSYS,
SIGUNUSED,
SIGRTMIN,
SIGRTMAX,
NSIG,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<Signal> resolver = 
ConstantResolver.getResolver(Signal.class, 20000, 29999);
public final int value() { return resolver.intValue(this); }
public final int intValue() { return (int) resolver.longValue(this); }
public final long longValue() { return resolver.longValue(this); }
public final String description() { return resolver.description(this); }
public final String toString() { return description(); }
public final static Signal valueOf(int value) { 
    return resolver.valueOf(value);
}
}