#### 1. DeadLock log

- jps:查找到对应的java进程的pid
- jstack -l pid：查看该java进程的lock info
```text
Full thread dump Java HotSpot(TM) 64-Bit Server VM (25.151-b12 mixed mode):

"DestroyJavaVM" #13 prio=5 os_prio=0 tid=0x0000000002458000 nid=0x1b40 waiting o
n condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"Thread-1" #12 prio=5 os_prio=0 tid=0x00000000077f4800 nid=0x1bdc waiting for mo
nitor entry [0x00000000086bf000]
   java.lang.Thread.State: BLOCKED (on object monitor)
        at com.allen.thread.DeadLock.lambda$main$1(DeadLock.java:35)
        - waiting to lock <0x00000000eb398b48> (a java.lang.Object)
        - locked <0x00000000eb398b58> (a java.lang.Object)
        at com.allen.thread.DeadLock$$Lambda$2/1096979270.run(Unknown Source)
        at java.lang.Thread.run(Thread.java:748)

   Locked ownable synchronizers:
        - None

"Thread-0" #11 prio=5 os_prio=0 tid=0x00000000077ee800 nid=0x534 waiting for mon
itor entry [0x00000000087de000]
   java.lang.Thread.State: BLOCKED (on object monitor)
        at com.allen.thread.DeadLock.lambda$main$0(DeadLock.java:27)
        - waiting to lock <0x00000000eb398b58> (a java.lang.Object)
        - locked <0x00000000eb398b48> (a java.lang.Object)
        at com.allen.thread.DeadLock$$Lambda$1/2003749087.run(Unknown Source)
        at java.lang.Thread.run(Thread.java:748)

   Locked ownable synchronizers:
        - None

"Service Thread" #10 daemon prio=9 os_prio=0 tid=0x0000000007551000 nid=0x594 ru
nnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"C1 CompilerThread2" #9 daemon prio=9 os_prio=2 tid=0x00000000074be000 nid=0xd5c
 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"C2 CompilerThread1" #8 daemon prio=9 os_prio=2 tid=0x00000000074bd000 nid=0x115
c waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"C2 CompilerThread0" #7 daemon prio=9 os_prio=2 tid=0x00000000074a5800 nid=0xec0
 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"Monitor Ctrl-Break" #6 daemon prio=5 os_prio=0 tid=0x00000000074a3800 nid=0x418
 runnable [0x0000000007e8e000]
   java.lang.Thread.State: RUNNABLE
        at java.net.SocketInputStream.socketRead0(Native Method)
        at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
        at java.net.SocketInputStream.read(SocketInputStream.java:171)
        at java.net.SocketInputStream.read(SocketInputStream.java:141)
        at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:284)
        at sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:326)
        at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:178)
        - locked <0x00000000eb3dc6c0> (a java.io.InputStreamReader)
        at java.io.InputStreamReader.read(InputStreamReader.java:184)
        at java.io.BufferedReader.fill(BufferedReader.java:161)
        at java.io.BufferedReader.readLine(BufferedReader.java:324)
        - locked <0x00000000eb3dc6c0> (a java.io.InputStreamReader)
        at java.io.BufferedReader.readLine(BufferedReader.java:389)
        at com.intellij.rt.execution.application.AppMainV2$1.run(AppMainV2.java:
64)

   Locked ownable synchronizers:
        - None

"Attach Listener" #5 daemon prio=5 os_prio=2 tid=0x0000000005fed800 nid=0x1510 w
aiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"Signal Dispatcher" #4 daemon prio=9 os_prio=2 tid=0x0000000005fe1000 nid=0x9f4
runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

   Locked ownable synchronizers:
        - None

"Finalizer" #3 daemon prio=8 os_prio=1 tid=0x0000000005fca800 nid=0xfbc in Objec
t.wait() [0x000000000744e000]
   java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        - waiting on <0x00000000eb208ec8> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:143)
        - locked <0x00000000eb208ec8> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:164)
        at java.lang.ref.Finalizer$FinalizerThread.run(Finalizer.java:209)

   Locked ownable synchronizers:
        - None

"Reference Handler" #2 daemon prio=10 os_prio=2 tid=0x0000000005f83800 nid=0x1be
0 in Object.wait() [0x000000000730e000]
   java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        - waiting on <0x00000000eb206b68> (a java.lang.ref.Reference$Lock)
        at java.lang.Object.wait(Object.java:502)
        at java.lang.ref.Reference.tryHandlePending(Reference.java:191)
        - locked <0x00000000eb206b68> (a java.lang.ref.Reference$Lock)
        at java.lang.ref.Reference$ReferenceHandler.run(Reference.java:153)

   Locked ownable synchronizers:
        - None

"VM Thread" os_prio=2 tid=0x0000000005f7b800 nid=0x1538 runnable

"GC task thread#0 (ParallelGC)" os_prio=0 tid=0x000000000246d800 nid=0xd4 runnab
le

"GC task thread#1 (ParallelGC)" os_prio=0 tid=0x000000000246f000 nid=0x19ec runn
able

"GC task thread#2 (ParallelGC)" os_prio=0 tid=0x0000000002470800 nid=0x1930 runn
able

"GC task thread#3 (ParallelGC)" os_prio=0 tid=0x0000000002472000 nid=0x17b8 runn
able

"VM Periodic Task Thread" os_prio=2 tid=0x0000000007562000 nid=0x1ab8 waiting on
 condition

JNI global references: 336


Found one Java-level deadlock:
=============================
"Thread-1":
  waiting to lock monitor 0x0000000005f87588 (object 0x00000000eb398b48, a java.
lang.Object),
  which is held by "Thread-0"
"Thread-0":
  waiting to lock monitor 0x0000000005f89f78 (object 0x00000000eb398b58, a java.
lang.Object),
  which is held by "Thread-1"

Java stack information for the threads listed above:
===================================================
"Thread-1":
        at com.allen.thread.DeadLock.lambda$main$1(DeadLock.java:35)
        - waiting to lock <0x00000000eb398b48> (a java.lang.Object)
        - locked <0x00000000eb398b58> (a java.lang.Object)
        at com.allen.thread.DeadLock$$Lambda$2/1096979270.run(Unknown Source)
        at java.lang.Thread.run(Thread.java:748)
"Thread-0":
        at com.allen.thread.DeadLock.lambda$main$0(DeadLock.java:27)
        - waiting to lock <0x00000000eb398b58> (a java.lang.Object)
        - locked <0x00000000eb398b48> (a java.lang.Object)
        at com.allen.thread.DeadLock$$Lambda$1/2003749087.run(Unknown Source)
        at java.lang.Thread.run(Thread.java:748)

Found 1 deadlock.

```