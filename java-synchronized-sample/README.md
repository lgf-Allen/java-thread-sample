#### 1. DeadLock log
```text
.java:682)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.
java:1149)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor
.java:624)
        at java.lang.Thread.run(Thread.java:748)

   Locked ownable synchronizers:
        - <0x00000000ec4fd240> (a java.util.concurrent.ThreadPoolExecutor$Worker
)

"RMI TCP Connection(4)-192.168.147.1" #21 daemon prio=5 os_prio=0 tid=0x00000000
0794b800 nid=0x1524 runnable [0x000000000a4cd000]
   java.lang.Thread.State: RUNNABLE
        at java.net.SocketInputStream.socketRead0(Native Method)
        at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
        at java.net.SocketInputStream.read(SocketInputStream.java:171)
        at java.net.SocketInputStream.read(SocketInputStream.java:141)
        at java.io.BufferedInputStream.fill(BufferedInputStream.java:246)
        at java.io.BufferedInputStream.read(BufferedInputStream.java:265)
        - locked <0x00000000ec55e0e8> (a java.io.BufferedInputStream)
        at java.io.FilterInputStream.read(FilterInputStream.java:83)
        at sun.rmi.transport.tcp.TCPTransport.handleMessages(TCPTransport.java:5
50)
        at sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run0(TCPTranspor
t.java:826)
        at sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.lambda$run$0(TCP
Transport.java:683)
        at sun.rmi.transport.tcp.TCPTransport$ConnectionHandler$$Lambda$3/505831
948.run(Unknown Source)
        at java.security.AccessController.doPrivileged(Native Method)
        at sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run(TCPTransport
.java:682)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.
java:1149)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor
.java:624)
        at java.lang.Thread.run(Thread.java:748)

   Locked ownable synchronizers:
        - <0x00000000ec4fde78> (a java.util.concurrent.ThreadPoolExecutor$Worker
)

"RMI TCP Connection(2)-192.168.147.1" #19 daemon prio=5 os_prio=0 tid=0x00000000
08fe9000 nid=0x1f94 runnable [0x000000000a00d000]
   java.lang.Thread.State: RUNNABLE
        at java.net.SocketInputStream.socketRead0(Native Method)
        at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
        at java.net.SocketInputStream.read(SocketInputStream.java:171)
        at java.net.SocketInputStream.read(SocketInputStream.java:141)
        at java.io.BufferedInputStream.fill(BufferedInputStream.java:246)
        at java.io.BufferedInputStream.read(BufferedInputStream.java:265)
        - locked <0x00000000ec5643f8> (a java.io.BufferedInputStream)
        at java.io.FilterInputStream.read(FilterInputStream.java:83)
        at sun.rmi.transport.tcp.TCPTransport.handleMessages(TCPTransport.java:5
50)
        at sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run0(TCPTranspor
t.java:826)
        at sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.lambda$run$0(TCP
Transport.java:683)
        at sun.rmi.transport.tcp.TCPTransport$ConnectionHandler$$Lambda$3/505831
948.run(Unknown Source)
        at java.security.AccessController.doPrivileged(Native Method)
        at sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run(TCPTransport
.java:682)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.
java:1149)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor
.java:624)
        at java.lang.Thread.run(Thread.java:748)

   Locked ownable synchronizers:
        - <0x00000000ec4fd400> (a java.util.concurrent.ThreadPoolExecutor$Worker
)

"JMX server connection timeout 18" #18 daemon prio=5 os_prio=0 tid=0x00000000079
ff000 nid=0x730 in Object.wait() [0x0000000009e1f000]
   java.lang.Thread.State: TIMED_WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        - waiting on <0x00000000ec4e6a28> (a [I)
        at com.sun.jmx.remote.internal.ServerCommunicatorAdmin$Timeout.run(Serve
rCommunicatorAdmin.java:168)
        - locked <0x00000000ec4e6a28> (a [I)
        at java.lang.Thread.run(Thread.java:748)

   Locked ownable synchronizers:
        - None

"RMI Scheduler(0)" #17 daemon prio=5 os_prio=0 tid=0x000000000904a000 nid=0x14e0
 waiting on condition [0x0000000009c6e000]
   java.lang.Thread.State: TIMED_WAITING (parking)
        at sun.misc.Unsafe.park(Native Method)
        - parking to wait for  <0x00000000ec4ff6e8> (a java.util.concurrent.lock
s.AbstractQueuedSynchronizer$ConditionObject)
        at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215
)
        at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject
.awaitNanos(AbstractQueuedSynchronizer.java:2078)
        at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.tak
e(ScheduledThreadPoolExecutor.java:1093)
        at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.tak
e(ScheduledThreadPoolExecutor.java:809)
        at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.ja
va:1074)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.
java:1134)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor
.java:624)
        at java.lang.Thread.run(Thread.java:748)

   Locked ownable synchronizers:
        - None

"RMI TCP Accept-0" #15 daemon prio=5 os_prio=0 tid=0x0000000008fd4000 nid=0x1e48
 runnable [0x000000000994f000]
   java.lang.Thread.State: RUNNABLE
        at java.net.DualStackPlainSocketImpl.accept0(Native Method)
        at java.net.DualStackPlainSocketImpl.socketAccept(DualStackPlainSocketIm
pl.java:131)
        at java.net.AbstractPlainSocketImpl.accept(AbstractPlainSocketImpl.java:
409)
        at java.net.PlainSocketImpl.accept(PlainSocketImpl.java:199)
        - locked <0x00000000ec4e6ed0> (a java.net.SocksSocketImpl)
        at java.net.ServerSocket.implAccept(ServerSocket.java:545)
        at java.net.ServerSocket.accept(ServerSocket.java:513)
        at sun.management.jmxremote.LocalRMIServerSocketFactory$1.accept(LocalRM
IServerSocketFactory.java:52)
        at sun.rmi.transport.tcp.TCPTransport$AcceptLoop.executeAcceptLoop(TCPTr
ansport.java:400)
        at sun.rmi.transport.tcp.TCPTransport$AcceptLoop.run(TCPTransport.java:3
72)
        at java.lang.Thread.run(Thread.java:748)

   Locked ownable synchronizers:
        - None

"DestroyJavaVM" #13 prio=5 os_prio=0 tid=0x00000000023d8000 nid=0x24c8 waiting o
n condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"Thread-1" #12 prio=5 os_prio=0 tid=0x000000000788b000 nid=0x1220 waiting for mo
nitor entry [0x0000000008d2f000]
   java.lang.Thread.State: BLOCKED (on object monitor)
        at sync.DeadLock$2.run(DeadLock.java:38)
        - waiting to lock <0x00000000ec48c0d8> (a java.lang.Object)
        - locked <0x00000000ec48c0c8> (a java.lang.Object)

   Locked ownable synchronizers:
        - None

"Thread-0" #11 prio=5 os_prio=0 tid=0x0000000007886000 nid=0x1fe4 waiting for mo
nitor entry [0x00000000083de000]
   java.lang.Thread.State: BLOCKED (on object monitor)
        at sync.DeadLock$1.run(DeadLock.java:27)
        - waiting to lock <0x00000000ec48c0c8> (a java.lang.Object)
        - locked <0x00000000ec48c0d8> (a java.lang.Object)

   Locked ownable synchronizers:
        - None

"Service Thread" #10 daemon prio=9 os_prio=0 tid=0x000000000783e800 nid=0x1810 r
unnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"C1 CompilerThread2" #9 daemon prio=9 os_prio=2 tid=0x00000000077d1000 nid=0x12e
0 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"C2 CompilerThread1" #8 daemon prio=9 os_prio=2 tid=0x00000000077c6800 nid=0x1f7
c waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"C2 CompilerThread0" #7 daemon prio=9 os_prio=2 tid=0x00000000077c6000 nid=0x1f0
0 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"Monitor Ctrl-Break" #6 daemon prio=5 os_prio=0 tid=0x00000000077ae800 nid=0x1eb
8 runnable [0x000000000809e000]
   java.lang.Thread.State: RUNNABLE
        at java.net.SocketInputStream.socketRead0(Native Method)
        at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
        at java.net.SocketInputStream.read(SocketInputStream.java:171)
        at java.net.SocketInputStream.read(SocketInputStream.java:141)
        at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:284)
        at sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:326)
        at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:178)
        - locked <0x00000000ec566ff8> (a java.io.InputStreamReader)
        at java.io.InputStreamReader.read(InputStreamReader.java:184)
        at java.io.BufferedReader.fill(BufferedReader.java:161)
        at java.io.BufferedReader.readLine(BufferedReader.java:324)
        - locked <0x00000000ec566ff8> (a java.io.InputStreamReader)
        at java.io.BufferedReader.readLine(BufferedReader.java:389)
        at com.intellij.rt.execution.application.AppMainV2$1.run(AppMainV2.java:
64)

   Locked ownable synchronizers:
        - None

"Attach Listener" #5 daemon prio=5 os_prio=2 tid=0x00000000063c8800 nid=0x119c w
aiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"Signal Dispatcher" #4 daemon prio=9 os_prio=2 tid=0x00000000063c4000 nid=0x1aa4
 runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"Finalizer" #3 daemon prio=8 os_prio=1 tid=0x00000000063ae000 nid=0x1a54 in Obje
ct.wait() [0x000000000749f000]
   java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        - waiting on <0x00000000ec567228> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:143)
        - locked <0x00000000ec567228> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:164)
        at java.lang.ref.Finalizer$FinalizerThread.run(Finalizer.java:209)

   Locked ownable synchronizers:
        - None

"Reference Handler" #2 daemon prio=10 os_prio=2 tid=0x0000000006367000 nid=0x1b2
4 in Object.wait() [0x000000000774e000]
   java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        - waiting on <0x00000000ec567268> (a java.lang.ref.Reference$Lock)
        at java.lang.Object.wait(Object.java:502)
        at java.lang.ref.Reference.tryHandlePending(Reference.java:191)
        - locked <0x00000000ec567268> (a java.lang.ref.Reference$Lock)
        at java.lang.ref.Reference$ReferenceHandler.run(Reference.java:153)

   Locked ownable synchronizers:
        - None

"VM Thread" os_prio=2 tid=0x000000000635b800 nid=0x1d84 runnable

"GC task thread#0 (ParallelGC)" os_prio=0 tid=0x00000000023ed800 nid=0xd7c runna
ble

"GC task thread#1 (ParallelGC)" os_prio=0 tid=0x00000000023ef000 nid=0x1bc4 runn
able

"GC task thread#2 (ParallelGC)" os_prio=0 tid=0x00000000023f0800 nid=0x1f10 runn
able

"GC task thread#3 (ParallelGC)" os_prio=0 tid=0x00000000023f2000 nid=0x1b40 runn
able

"VM Periodic Task Thread" os_prio=2 tid=0x0000000007849800 nid=0x19e0 waiting on
 condition

JNI global references: 266


Found one Java-level deadlock:
=============================
"Thread-1":
  waiting to lock monitor 0x00000000063698b8 (object 0x00000000ec48c0d8, a java.
lang.Object),
  which is held by "Thread-0"
"Thread-0":
  waiting to lock monitor 0x000000000636d958 (object 0x00000000ec48c0c8, a java.
lang.Object),
  which is held by "Thread-1"

Java stack information for the threads listed above:
===================================================
"Thread-1":
        at sync.DeadLock$2.run(DeadLock.java:38)
        - waiting to lock <0x00000000ec48c0d8> (a java.lang.Object)
        - locked <0x00000000ec48c0c8> (a java.lang.Object)
"Thread-0":
        at sync.DeadLock$1.run(DeadLock.java:27)
        - waiting to lock <0x00000000ec48c0c8> (a java.lang.Object)
        - locked <0x00000000ec48c0d8> (a java.lang.Object)

Found 1 deadlock.

```