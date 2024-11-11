package defpackage;

import defpackage.u90;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;

/* loaded from: classes.dex */
public final class t90 implements Closeable {
    private static final ExecutorService v = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), o80.a("OkHttp Http2Connection", true));
    final boolean b;
    final h c;
    final String e;
    int f;
    int g;
    boolean h;
    private final ScheduledExecutorService i;
    private final ExecutorService j;
    final y90 k;
    private boolean l;
    long n;
    final Socket r;
    final w90 s;
    final j t;
    final Map<Integer, v90> d = new LinkedHashMap();
    long m = 0;
    z90 o = new z90();
    final z90 p = new z90();
    boolean q = false;
    final Set<Integer> u = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends n80 {
        final /* synthetic */ int c;
        final /* synthetic */ o90 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i, o90 o90Var) {
            super(str, objArr);
            this.c = i;
            this.d = o90Var;
        }

        @Override // defpackage.n80
        public void b() {
            try {
                t90.this.b(this.c, this.d);
            } catch (IOException unused) {
                t90.this.f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends n80 {
        final /* synthetic */ int c;
        final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.c = i;
            this.d = j;
        }

        @Override // defpackage.n80
        public void b() {
            try {
                t90.this.s.a(this.c, this.d);
            } catch (IOException unused) {
                t90.this.f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends n80 {
        final /* synthetic */ int c;
        final /* synthetic */ List d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.c = i;
            this.d = list;
        }

        @Override // defpackage.n80
        public void b() {
            if (t90.this.k.a(this.c, this.d)) {
                try {
                    t90.this.s.a(this.c, o90.CANCEL);
                    synchronized (t90.this) {
                        t90.this.u.remove(Integer.valueOf(this.c));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends n80 {
        final /* synthetic */ int c;
        final /* synthetic */ List d;
        final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.c = i;
            this.d = list;
            this.e = z;
        }

        @Override // defpackage.n80
        public void b() {
            boolean a = t90.this.k.a(this.c, this.d, this.e);
            if (a) {
                try {
                    t90.this.s.a(this.c, o90.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (a || this.e) {
                synchronized (t90.this) {
                    t90.this.u.remove(Integer.valueOf(this.c));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends n80 {
        final /* synthetic */ int c;
        final /* synthetic */ Buffer d;
        final /* synthetic */ int e;
        final /* synthetic */ boolean f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Object[] objArr, int i, Buffer buffer, int i2, boolean z) {
            super(str, objArr);
            this.c = i;
            this.d = buffer;
            this.e = i2;
            this.f = z;
        }

        @Override // defpackage.n80
        public void b() {
            try {
                boolean a = t90.this.k.a(this.c, this.d, this.e, this.f);
                if (a) {
                    t90.this.s.a(this.c, o90.CANCEL);
                }
                if (a || this.f) {
                    synchronized (t90.this) {
                        t90.this.u.remove(Integer.valueOf(this.c));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends n80 {
        final /* synthetic */ int c;
        final /* synthetic */ o90 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Object[] objArr, int i, o90 o90Var) {
            super(str, objArr);
            this.c = i;
            this.d = o90Var;
        }

        @Override // defpackage.n80
        public void b() {
            t90.this.k.a(this.c, this.d);
            synchronized (t90.this) {
                t90.this.u.remove(Integer.valueOf(this.c));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        Socket a;
        String b;
        BufferedSource c;
        BufferedSink d;
        h e = h.a;
        y90 f = y90.a;
        boolean g;
        int h;

        public g(boolean z) {
            this.g = z;
        }

        public g a(int i) {
            this.h = i;
            return this;
        }

        public g a(Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.a = socket;
            this.b = str;
            this.c = bufferedSource;
            this.d = bufferedSink;
            return this;
        }

        public g a(h hVar) {
            this.e = hVar;
            return this;
        }

        public t90 a() {
            return new t90(this);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class h {
        public static final h a = new a();

        /* loaded from: classes.dex */
        class a extends h {
            a() {
            }

            @Override // t90.h
            public void a(v90 v90Var) {
                v90Var.a(o90.REFUSED_STREAM);
            }
        }

        public void a(t90 t90Var) {
        }

        public abstract void a(v90 v90Var);
    }

    /* loaded from: classes.dex */
    final class i extends n80 {
        final boolean c;
        final int d;
        final int e;

        i(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", t90.this.e, Integer.valueOf(i), Integer.valueOf(i2));
            this.c = z;
            this.d = i;
            this.e = i2;
        }

        @Override // defpackage.n80
        public void b() {
            t90.this.a(this.c, this.d, this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j extends n80 implements u90.b {
        final u90 c;

        /* loaded from: classes.dex */
        class a extends n80 {
            final /* synthetic */ v90 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Object[] objArr, v90 v90Var) {
                super(str, objArr);
                this.c = v90Var;
            }

            @Override // defpackage.n80
            public void b() {
                try {
                    t90.this.c.a(this.c);
                } catch (IOException e) {
                    ga0.c().a(4, "Http2Connection.Listener failure for " + t90.this.e, e);
                    try {
                        this.c.a(o90.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        class b extends n80 {
            b(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // defpackage.n80
            public void b() {
                t90 t90Var = t90.this;
                t90Var.c.a(t90Var);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class c extends n80 {
            final /* synthetic */ z90 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr, z90 z90Var) {
                super(str, objArr);
                this.c = z90Var;
            }

            @Override // defpackage.n80
            public void b() {
                try {
                    t90.this.s.a(this.c);
                } catch (IOException unused) {
                    t90.this.f();
                }
            }
        }

        j(u90 u90Var) {
            super("OkHttp %s", t90.this.e);
            this.c = u90Var;
        }

        private void a(z90 z90Var) {
            try {
                t90.this.i.execute(new c("OkHttp %s ACK Settings", new Object[]{t90.this.e}, z90Var));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // u90.b
        public void a() {
        }

        @Override // u90.b
        public void a(int i, int i2, int i3, boolean z) {
        }

        @Override // u90.b
        public void a(int i, int i2, List<p90> list) {
            t90.this.a(i2, list);
        }

        @Override // u90.b
        public void a(int i, long j) {
            t90 t90Var = t90.this;
            if (i == 0) {
                synchronized (t90Var) {
                    t90.this.n += j;
                    t90.this.notifyAll();
                }
                return;
            }
            v90 a2 = t90Var.a(i);
            if (a2 != null) {
                synchronized (a2) {
                    a2.a(j);
                }
            }
        }

        @Override // u90.b
        public void a(int i, o90 o90Var) {
            if (t90.this.b(i)) {
                t90.this.a(i, o90Var);
                return;
            }
            v90 c2 = t90.this.c(i);
            if (c2 != null) {
                c2.c(o90Var);
            }
        }

        @Override // u90.b
        public void a(int i, o90 o90Var, ByteString byteString) {
            v90[] v90VarArr;
            byteString.size();
            synchronized (t90.this) {
                v90VarArr = (v90[]) t90.this.d.values().toArray(new v90[t90.this.d.size()]);
                t90.this.h = true;
            }
            for (v90 v90Var : v90VarArr) {
                if (v90Var.c() > i && v90Var.f()) {
                    v90Var.c(o90.REFUSED_STREAM);
                    t90.this.c(v90Var.c());
                }
            }
        }

        @Override // u90.b
        public void a(boolean z, int i, int i2) {
            if (!z) {
                try {
                    t90.this.i.execute(new i(true, i, i2));
                } catch (RejectedExecutionException unused) {
                }
            } else {
                synchronized (t90.this) {
                    t90.this.l = false;
                    t90.this.notifyAll();
                }
            }
        }

        @Override // u90.b
        public void a(boolean z, int i, int i2, List<p90> list) {
            if (t90.this.b(i)) {
                t90.this.a(i, list, z);
                return;
            }
            synchronized (t90.this) {
                v90 a2 = t90.this.a(i);
                if (a2 != null) {
                    a2.a(list);
                    if (z) {
                        a2.i();
                        return;
                    }
                    return;
                }
                if (t90.this.h) {
                    return;
                }
                if (i <= t90.this.f) {
                    return;
                }
                if (i % 2 == t90.this.g % 2) {
                    return;
                }
                v90 v90Var = new v90(i, t90.this, false, z, o80.b(list));
                t90.this.f = i;
                t90.this.d.put(Integer.valueOf(i), v90Var);
                t90.v.execute(new a("OkHttp %s stream %d", new Object[]{t90.this.e, Integer.valueOf(i)}, v90Var));
            }
        }

        @Override // u90.b
        public void a(boolean z, int i, BufferedSource bufferedSource, int i2) {
            if (t90.this.b(i)) {
                t90.this.a(i, bufferedSource, i2, z);
                return;
            }
            v90 a2 = t90.this.a(i);
            if (a2 == null) {
                t90.this.c(i, o90.PROTOCOL_ERROR);
                long j = i2;
                t90.this.a(j);
                bufferedSource.skip(j);
                return;
            }
            a2.a(bufferedSource, i2);
            if (z) {
                a2.i();
            }
        }

        @Override // u90.b
        public void a(boolean z, z90 z90Var) {
            v90[] v90VarArr;
            long j;
            int i;
            synchronized (t90.this) {
                int c2 = t90.this.p.c();
                if (z) {
                    t90.this.p.a();
                }
                t90.this.p.a(z90Var);
                a(z90Var);
                int c3 = t90.this.p.c();
                v90VarArr = null;
                if (c3 == -1 || c3 == c2) {
                    j = 0;
                } else {
                    j = c3 - c2;
                    if (!t90.this.q) {
                        t90.this.q = true;
                    }
                    if (!t90.this.d.isEmpty()) {
                        v90VarArr = (v90[]) t90.this.d.values().toArray(new v90[t90.this.d.size()]);
                    }
                }
                t90.v.execute(new b("OkHttp %s settings", t90.this.e));
            }
            if (v90VarArr == null || j == 0) {
                return;
            }
            for (v90 v90Var : v90VarArr) {
                synchronized (v90Var) {
                    v90Var.a(j);
                }
            }
        }

        @Override // defpackage.n80
        protected void b() {
            o90 o90Var;
            t90 t90Var;
            o90 o90Var2 = o90.INTERNAL_ERROR;
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    this.c.a(this);
                    do {
                    } while (this.c.a(false, (u90.b) this));
                    o90Var = o90.NO_ERROR;
                } catch (IOException unused) {
                }
                try {
                    o90Var2 = o90.CANCEL;
                    t90Var = t90.this;
                } catch (IOException unused2) {
                    o90Var = o90.PROTOCOL_ERROR;
                    o90Var2 = o90.PROTOCOL_ERROR;
                    t90Var = t90.this;
                    t90Var.a(o90Var, o90Var2);
                    o80.a(this.c);
                }
            } catch (IOException unused3) {
            } catch (Throwable th2) {
                th = th2;
                o90Var = o90Var2;
                try {
                    t90.this.a(o90Var, o90Var2);
                } catch (IOException unused4) {
                }
                o80.a(this.c);
                throw th;
            }
            t90Var.a(o90Var, o90Var2);
            o80.a(this.c);
        }
    }

    t90(g gVar) {
        this.k = gVar.f;
        boolean z = gVar.g;
        this.b = z;
        this.c = gVar.e;
        int i2 = z ? 1 : 2;
        this.g = i2;
        if (gVar.g) {
            this.g = i2 + 2;
        }
        if (gVar.g) {
            this.o.a(7, 16777216);
        }
        this.e = gVar.b;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, o80.a(o80.a("OkHttp %s Writer", this.e), false));
        this.i = scheduledThreadPoolExecutor;
        if (gVar.h != 0) {
            i iVar = new i(false, 0, 0);
            int i3 = gVar.h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, i3, i3, TimeUnit.MILLISECONDS);
        }
        this.j = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), o80.a(o80.a("OkHttp %s Push Observer", this.e), true));
        this.p.a(7, 65535);
        this.p.a(5, 16384);
        this.n = this.p.c();
        this.r = gVar.a;
        this.s = new w90(gVar.d, this.b);
        this.t = new j(new u90(gVar.c, this.b));
    }

    private synchronized void a(n80 n80Var) {
        if (!a()) {
            this.j.execute(n80Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[Catch: all -> 0x0075, TryCatch #0 {, blocks: (B:6:0x0007, B:8:0x000e, B:9:0x0013, B:11:0x0017, B:13:0x002b, B:15:0x0033, B:19:0x003d, B:21:0x0043, B:22:0x004c, B:36:0x006f, B:37:0x0074), top: B:5:0x0007, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private defpackage.v90 b(int r11, java.util.List<defpackage.p90> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            w90 r7 = r10.s
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L78
            int r0 = r10.g     // Catch: java.lang.Throwable -> L75
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L13
            o90 r0 = defpackage.o90.REFUSED_STREAM     // Catch: java.lang.Throwable -> L75
            r10.a(r0)     // Catch: java.lang.Throwable -> L75
        L13:
            boolean r0 = r10.h     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L6f
            int r8 = r10.g     // Catch: java.lang.Throwable -> L75
            int r0 = r10.g     // Catch: java.lang.Throwable -> L75
            int r0 = r0 + 2
            r10.g = r0     // Catch: java.lang.Throwable -> L75
            v90 r9 = new v90     // Catch: java.lang.Throwable -> L75
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L75
            if (r13 == 0) goto L3c
            long r0 = r10.n     // Catch: java.lang.Throwable -> L75
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L3c
            long r0 = r9.b     // Catch: java.lang.Throwable -> L75
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L3a
            goto L3c
        L3a:
            r13 = 0
            goto L3d
        L3c:
            r13 = 1
        L3d:
            boolean r0 = r9.g()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L4c
            java.util.Map<java.lang.Integer, v90> r0 = r10.d     // Catch: java.lang.Throwable -> L75
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L75
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L75
        L4c:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L75
            if (r11 != 0) goto L55
            w90 r0 = r10.s     // Catch: java.lang.Throwable -> L78
            r0.a(r6, r8, r11, r12)     // Catch: java.lang.Throwable -> L78
            goto L5e
        L55:
            boolean r0 = r10.b     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L67
            w90 r0 = r10.s     // Catch: java.lang.Throwable -> L78
            r0.a(r11, r8, r12)     // Catch: java.lang.Throwable -> L78
        L5e:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L78
            if (r13 == 0) goto L66
            w90 r11 = r10.s
            r11.flush()
        L66:
            return r9
        L67:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L78
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L78
            throw r11     // Catch: java.lang.Throwable -> L78
        L6f:
            n90 r11 = new n90     // Catch: java.lang.Throwable -> L75
            r11.<init>()     // Catch: java.lang.Throwable -> L75
            throw r11     // Catch: java.lang.Throwable -> L75
        L75:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L75
            throw r11     // Catch: java.lang.Throwable -> L78
        L78:
            r11 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L78
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t90.b(int, java.util.List, boolean):v90");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        try {
            a(o90.PROTOCOL_ERROR, o90.PROTOCOL_ERROR);
        } catch (IOException unused) {
        }
    }

    synchronized v90 a(int i2) {
        return this.d.get(Integer.valueOf(i2));
    }

    public v90 a(List<p90> list, boolean z) {
        return b(0, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i2, long j2) {
        try {
            this.i.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.e, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }

    void a(int i2, List<p90> list) {
        synchronized (this) {
            if (this.u.contains(Integer.valueOf(i2))) {
                c(i2, o90.PROTOCOL_ERROR);
                return;
            }
            this.u.add(Integer.valueOf(i2));
            try {
                a(new c("OkHttp %s Push Request[%s]", new Object[]{this.e, Integer.valueOf(i2)}, i2, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    void a(int i2, List<p90> list, boolean z) {
        try {
            a(new d("OkHttp %s Push Headers[%s]", new Object[]{this.e, Integer.valueOf(i2)}, i2, list, z));
        } catch (RejectedExecutionException unused) {
        }
    }

    void a(int i2, o90 o90Var) {
        a(new f("OkHttp %s Push Reset[%s]", new Object[]{this.e, Integer.valueOf(i2)}, i2, o90Var));
    }

    void a(int i2, BufferedSource bufferedSource, int i3, boolean z) {
        Buffer buffer = new Buffer();
        long j2 = i3;
        bufferedSource.require(j2);
        bufferedSource.read(buffer, j2);
        if (buffer.size() == j2) {
            a(new e("OkHttp %s Push Data[%s]", new Object[]{this.e, Integer.valueOf(i2)}, i2, buffer, i3, z));
            return;
        }
        throw new IOException(buffer.size() + " != " + i3);
    }

    public void a(int i2, boolean z, Buffer buffer, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.s.a(z, i2, buffer, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (this.n <= 0) {
                    try {
                        if (!this.d.containsKey(Integer.valueOf(i2))) {
                            throw new IOException("stream closed");
                        }
                        wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j2, this.n), this.s.c());
                j3 = min;
                this.n -= j3;
            }
            j2 -= j3;
            this.s.a(z && j2 == 0, i2, buffer, min);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(long j2) {
        long j3 = this.m + j2;
        this.m = j3;
        if (j3 >= this.o.c() / 2) {
            a(0, this.m);
            this.m = 0L;
        }
    }

    public void a(o90 o90Var) {
        synchronized (this.s) {
            synchronized (this) {
                if (this.h) {
                    return;
                }
                this.h = true;
                this.s.a(this.f, o90Var, o80.a);
            }
        }
    }

    void a(o90 o90Var, o90 o90Var2) {
        v90[] v90VarArr = null;
        try {
            a(o90Var);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            if (!this.d.isEmpty()) {
                v90VarArr = (v90[]) this.d.values().toArray(new v90[this.d.size()]);
                this.d.clear();
            }
        }
        if (v90VarArr != null) {
            for (v90 v90Var : v90VarArr) {
                try {
                    v90Var.a(o90Var2);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.s.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.r.close();
        } catch (IOException e5) {
            e = e5;
        }
        this.i.shutdown();
        this.j.shutdown();
        if (e != null) {
            throw e;
        }
    }

    void a(boolean z) {
        if (z) {
            this.s.a();
            this.s.b(this.o);
            if (this.o.c() != 65535) {
                this.s.a(0, r6 - 65535);
            }
        }
        new Thread(this.t).start();
    }

    void a(boolean z, int i2, int i3) {
        boolean z2;
        if (!z) {
            synchronized (this) {
                z2 = this.l;
                this.l = true;
            }
            if (z2) {
                f();
                return;
            }
        }
        try {
            this.s.a(z, i2, i3);
        } catch (IOException unused) {
            f();
        }
    }

    public synchronized boolean a() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i2, o90 o90Var) {
        this.s.a(i2, o90Var);
    }

    boolean b(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public synchronized int c() {
        return this.p.b(Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized v90 c(int i2) {
        v90 remove;
        remove = this.d.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i2, o90 o90Var) {
        try {
            this.i.execute(new a("OkHttp %s stream %d", new Object[]{this.e, Integer.valueOf(i2)}, i2, o90Var));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a(o90.NO_ERROR, o90.CANCEL);
    }

    public void d() {
        a(true);
    }

    public void flush() {
        this.s.flush();
    }
}
