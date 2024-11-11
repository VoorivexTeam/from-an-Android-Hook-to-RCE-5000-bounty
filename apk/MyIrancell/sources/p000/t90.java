package p000;

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
import p000.u90;

/* loaded from: classes.dex */
public final class t90 implements Closeable {

    /* renamed from: v */
    private static final ExecutorService f13235v = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), o80.m14454a("OkHttp Http2Connection", true));

    /* renamed from: b */
    final boolean f13236b;

    /* renamed from: c */
    final AbstractC3251h f13237c;

    /* renamed from: e */
    final String f13239e;

    /* renamed from: f */
    int f13240f;

    /* renamed from: g */
    int f13241g;

    /* renamed from: h */
    boolean f13242h;

    /* renamed from: i */
    private final ScheduledExecutorService f13243i;

    /* renamed from: j */
    private final ExecutorService f13244j;

    /* renamed from: k */
    final y90 f13245k;

    /* renamed from: l */
    private boolean f13246l;

    /* renamed from: n */
    long f13248n;

    /* renamed from: r */
    final Socket f13252r;

    /* renamed from: s */
    final w90 f13253s;

    /* renamed from: t */
    final C3253j f13254t;

    /* renamed from: d */
    final Map<Integer, v90> f13238d = new LinkedHashMap();

    /* renamed from: m */
    long f13247m = 0;

    /* renamed from: o */
    z90 f13249o = new z90();

    /* renamed from: p */
    final z90 f13250p = new z90();

    /* renamed from: q */
    boolean f13251q = false;

    /* renamed from: u */
    final Set<Integer> f13255u = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t90$a */
    /* loaded from: classes.dex */
    public class C3244a extends n80 {

        /* renamed from: c */
        final /* synthetic */ int f13256c;

        /* renamed from: d */
        final /* synthetic */ o90 f13257d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3244a(String str, Object[] objArr, int i, o90 o90Var) {
            super(str, objArr);
            this.f13256c = i;
            this.f13257d = o90Var;
        }

        @Override // p000.n80
        /* renamed from: b */
        public void mo11709b() {
            try {
                t90.this.m15603b(this.f13256c, this.f13257d);
            } catch (IOException unused) {
                t90.this.m15588f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t90$b */
    /* loaded from: classes.dex */
    public class C3245b extends n80 {

        /* renamed from: c */
        final /* synthetic */ int f13259c;

        /* renamed from: d */
        final /* synthetic */ long f13260d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3245b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f13259c = i;
            this.f13260d = j;
        }

        @Override // p000.n80
        /* renamed from: b */
        public void mo11709b() {
            try {
                t90.this.f13253s.m16181a(this.f13259c, this.f13260d);
            } catch (IOException unused) {
                t90.this.m15588f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t90$c */
    /* loaded from: classes.dex */
    public class C3246c extends n80 {

        /* renamed from: c */
        final /* synthetic */ int f13262c;

        /* renamed from: d */
        final /* synthetic */ List f13263d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3246c(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.f13262c = i;
            this.f13263d = list;
        }

        @Override // p000.n80
        /* renamed from: b */
        public void mo11709b() {
            if (t90.this.f13245k.mo16613a(this.f13262c, this.f13263d)) {
                try {
                    t90.this.f13253s.m16182a(this.f13262c, o90.CANCEL);
                    synchronized (t90.this) {
                        t90.this.f13255u.remove(Integer.valueOf(this.f13262c));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t90$d */
    /* loaded from: classes.dex */
    public class C3247d extends n80 {

        /* renamed from: c */
        final /* synthetic */ int f13265c;

        /* renamed from: d */
        final /* synthetic */ List f13266d;

        /* renamed from: e */
        final /* synthetic */ boolean f13267e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3247d(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.f13265c = i;
            this.f13266d = list;
            this.f13267e = z;
        }

        @Override // p000.n80
        /* renamed from: b */
        public void mo11709b() {
            boolean mo16614a = t90.this.f13245k.mo16614a(this.f13265c, this.f13266d, this.f13267e);
            if (mo16614a) {
                try {
                    t90.this.f13253s.m16182a(this.f13265c, o90.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (mo16614a || this.f13267e) {
                synchronized (t90.this) {
                    t90.this.f13255u.remove(Integer.valueOf(this.f13265c));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t90$e */
    /* loaded from: classes.dex */
    public class C3248e extends n80 {

        /* renamed from: c */
        final /* synthetic */ int f13269c;

        /* renamed from: d */
        final /* synthetic */ Buffer f13270d;

        /* renamed from: e */
        final /* synthetic */ int f13271e;

        /* renamed from: f */
        final /* synthetic */ boolean f13272f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3248e(String str, Object[] objArr, int i, Buffer buffer, int i2, boolean z) {
            super(str, objArr);
            this.f13269c = i;
            this.f13270d = buffer;
            this.f13271e = i2;
            this.f13272f = z;
        }

        @Override // p000.n80
        /* renamed from: b */
        public void mo11709b() {
            try {
                boolean mo16615a = t90.this.f13245k.mo16615a(this.f13269c, this.f13270d, this.f13271e, this.f13272f);
                if (mo16615a) {
                    t90.this.f13253s.m16182a(this.f13269c, o90.CANCEL);
                }
                if (mo16615a || this.f13272f) {
                    synchronized (t90.this) {
                        t90.this.f13255u.remove(Integer.valueOf(this.f13269c));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t90$f */
    /* loaded from: classes.dex */
    public class C3249f extends n80 {

        /* renamed from: c */
        final /* synthetic */ int f13274c;

        /* renamed from: d */
        final /* synthetic */ o90 f13275d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3249f(String str, Object[] objArr, int i, o90 o90Var) {
            super(str, objArr);
            this.f13274c = i;
            this.f13275d = o90Var;
        }

        @Override // p000.n80
        /* renamed from: b */
        public void mo11709b() {
            t90.this.f13245k.mo16612a(this.f13274c, this.f13275d);
            synchronized (t90.this) {
                t90.this.f13255u.remove(Integer.valueOf(this.f13274c));
            }
        }
    }

    /* renamed from: t90$g */
    /* loaded from: classes.dex */
    public static class C3250g {

        /* renamed from: a */
        Socket f13277a;

        /* renamed from: b */
        String f13278b;

        /* renamed from: c */
        BufferedSource f13279c;

        /* renamed from: d */
        BufferedSink f13280d;

        /* renamed from: e */
        AbstractC3251h f13281e = AbstractC3251h.f13285a;

        /* renamed from: f */
        y90 f13282f = y90.f14119a;

        /* renamed from: g */
        boolean f13283g;

        /* renamed from: h */
        int f13284h;

        public C3250g(boolean z) {
            this.f13283g = z;
        }

        /* renamed from: a */
        public C3250g m15609a(int i) {
            this.f13284h = i;
            return this;
        }

        /* renamed from: a */
        public C3250g m15610a(Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.f13277a = socket;
            this.f13278b = str;
            this.f13279c = bufferedSource;
            this.f13280d = bufferedSink;
            return this;
        }

        /* renamed from: a */
        public C3250g m15611a(AbstractC3251h abstractC3251h) {
            this.f13281e = abstractC3251h;
            return this;
        }

        /* renamed from: a */
        public t90 m15612a() {
            return new t90(this);
        }
    }

    /* renamed from: t90$h */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3251h {

        /* renamed from: a */
        public static final AbstractC3251h f13285a = new a();

        /* renamed from: t90$h$a */
        /* loaded from: classes.dex */
        class a extends AbstractC3251h {
            a() {
            }

            @Override // p000.t90.AbstractC3251h
            /* renamed from: a */
            public void mo15614a(v90 v90Var) {
                v90Var.m15987a(o90.REFUSED_STREAM);
            }
        }

        /* renamed from: a */
        public void mo15613a(t90 t90Var) {
        }

        /* renamed from: a */
        public abstract void mo15614a(v90 v90Var);
    }

    /* renamed from: t90$i */
    /* loaded from: classes.dex */
    final class C3252i extends n80 {

        /* renamed from: c */
        final boolean f13286c;

        /* renamed from: d */
        final int f13287d;

        /* renamed from: e */
        final int f13288e;

        C3252i(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", t90.this.f13239e, Integer.valueOf(i), Integer.valueOf(i2));
            this.f13286c = z;
            this.f13287d = i;
            this.f13288e = i2;
        }

        @Override // p000.n80
        /* renamed from: b */
        public void mo11709b() {
            t90.this.m15601a(this.f13286c, this.f13287d, this.f13288e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t90$j */
    /* loaded from: classes.dex */
    public class C3253j extends n80 implements u90.InterfaceC3297b {

        /* renamed from: c */
        final u90 f13290c;

        /* renamed from: t90$j$a */
        /* loaded from: classes.dex */
        class a extends n80 {

            /* renamed from: c */
            final /* synthetic */ v90 f13292c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Object[] objArr, v90 v90Var) {
                super(str, objArr);
                this.f13292c = v90Var;
            }

            @Override // p000.n80
            /* renamed from: b */
            public void mo11709b() {
                try {
                    t90.this.f13237c.mo15614a(this.f13292c);
                } catch (IOException e) {
                    ga0.m11953c().mo3355a(4, "Http2Connection.Listener failure for " + t90.this.f13239e, e);
                    try {
                        this.f13292c.m15987a(o90.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: t90$j$b */
        /* loaded from: classes.dex */
        class b extends n80 {
            b(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // p000.n80
            /* renamed from: b */
            public void mo11709b() {
                t90 t90Var = t90.this;
                t90Var.f13237c.mo15613a(t90Var);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: t90$j$c */
        /* loaded from: classes.dex */
        public class c extends n80 {

            /* renamed from: c */
            final /* synthetic */ z90 f13295c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr, z90 z90Var) {
                super(str, objArr);
                this.f13295c = z90Var;
            }

            @Override // p000.n80
            /* renamed from: b */
            public void mo11709b() {
                try {
                    t90.this.f13253s.m16184a(this.f13295c);
                } catch (IOException unused) {
                    t90.this.m15588f();
                }
            }
        }

        C3253j(u90 u90Var) {
            super("OkHttp %s", t90.this.f13239e);
            this.f13290c = u90Var;
        }

        /* renamed from: a */
        private void m15615a(z90 z90Var) {
            try {
                t90.this.f13243i.execute(new c("OkHttp %s ACK Settings", new Object[]{t90.this.f13239e}, z90Var));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // p000.u90.InterfaceC3297b
        /* renamed from: a */
        public void mo15616a() {
        }

        @Override // p000.u90.InterfaceC3297b
        /* renamed from: a */
        public void mo15617a(int i, int i2, int i3, boolean z) {
        }

        @Override // p000.u90.InterfaceC3297b
        /* renamed from: a */
        public void mo15618a(int i, int i2, List<p90> list) {
            t90.this.m15592a(i2, list);
        }

        @Override // p000.u90.InterfaceC3297b
        /* renamed from: a */
        public void mo15619a(int i, long j) {
            t90 t90Var = t90.this;
            if (i == 0) {
                synchronized (t90Var) {
                    t90.this.f13248n += j;
                    t90.this.notifyAll();
                }
                return;
            }
            v90 m15589a = t90Var.m15589a(i);
            if (m15589a != null) {
                synchronized (m15589a) {
                    m15589a.m15985a(j);
                }
            }
        }

        @Override // p000.u90.InterfaceC3297b
        /* renamed from: a */
        public void mo15620a(int i, o90 o90Var) {
            if (t90.this.m15604b(i)) {
                t90.this.m15594a(i, o90Var);
                return;
            }
            v90 m15606c = t90.this.m15606c(i);
            if (m15606c != null) {
                m15606c.m15992c(o90Var);
            }
        }

        @Override // p000.u90.InterfaceC3297b
        /* renamed from: a */
        public void mo15621a(int i, o90 o90Var, ByteString byteString) {
            v90[] v90VarArr;
            byteString.size();
            synchronized (t90.this) {
                v90VarArr = (v90[]) t90.this.f13238d.values().toArray(new v90[t90.this.f13238d.size()]);
                t90.this.f13242h = true;
            }
            for (v90 v90Var : v90VarArr) {
                if (v90Var.m15991c() > i && v90Var.m15995f()) {
                    v90Var.m15992c(o90.REFUSED_STREAM);
                    t90.this.m15606c(v90Var.m15991c());
                }
            }
        }

        @Override // p000.u90.InterfaceC3297b
        /* renamed from: a */
        public void mo15622a(boolean z, int i, int i2) {
            if (!z) {
                try {
                    t90.this.f13243i.execute(new C3252i(true, i, i2));
                } catch (RejectedExecutionException unused) {
                }
            } else {
                synchronized (t90.this) {
                    t90.this.f13246l = false;
                    t90.this.notifyAll();
                }
            }
        }

        @Override // p000.u90.InterfaceC3297b
        /* renamed from: a */
        public void mo15623a(boolean z, int i, int i2, List<p90> list) {
            if (t90.this.m15604b(i)) {
                t90.this.m15593a(i, list, z);
                return;
            }
            synchronized (t90.this) {
                v90 m15589a = t90.this.m15589a(i);
                if (m15589a != null) {
                    m15589a.m15986a(list);
                    if (z) {
                        m15589a.m15998i();
                        return;
                    }
                    return;
                }
                if (t90.this.f13242h) {
                    return;
                }
                if (i <= t90.this.f13240f) {
                    return;
                }
                if (i % 2 == t90.this.f13241g % 2) {
                    return;
                }
                v90 v90Var = new v90(i, t90.this, false, z, o80.m14467b(list));
                t90.this.f13240f = i;
                t90.this.f13238d.put(Integer.valueOf(i), v90Var);
                t90.f13235v.execute(new a("OkHttp %s stream %d", new Object[]{t90.this.f13239e, Integer.valueOf(i)}, v90Var));
            }
        }

        @Override // p000.u90.InterfaceC3297b
        /* renamed from: a */
        public void mo15624a(boolean z, int i, BufferedSource bufferedSource, int i2) {
            if (t90.this.m15604b(i)) {
                t90.this.m15595a(i, bufferedSource, i2, z);
                return;
            }
            v90 m15589a = t90.this.m15589a(i);
            if (m15589a == null) {
                t90.this.m15607c(i, o90.PROTOCOL_ERROR);
                long j = i2;
                t90.this.m15597a(j);
                bufferedSource.skip(j);
                return;
            }
            m15589a.m15988a(bufferedSource, i2);
            if (z) {
                m15589a.m15998i();
            }
        }

        @Override // p000.u90.InterfaceC3297b
        /* renamed from: a */
        public void mo15625a(boolean z, z90 z90Var) {
            v90[] v90VarArr;
            long j;
            int i;
            synchronized (t90.this) {
                int m16906c = t90.this.f13250p.m16906c();
                if (z) {
                    t90.this.f13250p.m16902a();
                }
                t90.this.f13250p.m16903a(z90Var);
                m15615a(z90Var);
                int m16906c2 = t90.this.f13250p.m16906c();
                v90VarArr = null;
                if (m16906c2 == -1 || m16906c2 == m16906c) {
                    j = 0;
                } else {
                    j = m16906c2 - m16906c;
                    if (!t90.this.f13251q) {
                        t90.this.f13251q = true;
                    }
                    if (!t90.this.f13238d.isEmpty()) {
                        v90VarArr = (v90[]) t90.this.f13238d.values().toArray(new v90[t90.this.f13238d.size()]);
                    }
                }
                t90.f13235v.execute(new b("OkHttp %s settings", t90.this.f13239e));
            }
            if (v90VarArr == null || j == 0) {
                return;
            }
            for (v90 v90Var : v90VarArr) {
                synchronized (v90Var) {
                    v90Var.m15985a(j);
                }
            }
        }

        @Override // p000.n80
        /* renamed from: b */
        protected void mo11709b() {
            o90 o90Var;
            t90 t90Var;
            o90 o90Var2 = o90.INTERNAL_ERROR;
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    this.f13290c.m15780a(this);
                    do {
                    } while (this.f13290c.m15781a(false, (u90.InterfaceC3297b) this));
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
                    t90Var.m15599a(o90Var, o90Var2);
                    o80.m14457a(this.f13290c);
                }
            } catch (IOException unused3) {
            } catch (Throwable th2) {
                th = th2;
                o90Var = o90Var2;
                try {
                    t90.this.m15599a(o90Var, o90Var2);
                } catch (IOException unused4) {
                }
                o80.m14457a(this.f13290c);
                throw th;
            }
            t90Var.m15599a(o90Var, o90Var2);
            o80.m14457a(this.f13290c);
        }
    }

    t90(C3250g c3250g) {
        this.f13245k = c3250g.f13282f;
        boolean z = c3250g.f13283g;
        this.f13236b = z;
        this.f13237c = c3250g.f13281e;
        int i = z ? 1 : 2;
        this.f13241g = i;
        if (c3250g.f13283g) {
            this.f13241g = i + 2;
        }
        if (c3250g.f13283g) {
            this.f13249o.m16901a(7, 16777216);
        }
        this.f13239e = c3250g.f13278b;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, o80.m14454a(o80.m14446a("OkHttp %s Writer", this.f13239e), false));
        this.f13243i = scheduledThreadPoolExecutor;
        if (c3250g.f13284h != 0) {
            C3252i c3252i = new C3252i(false, 0, 0);
            int i2 = c3250g.f13284h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(c3252i, i2, i2, TimeUnit.MILLISECONDS);
        }
        this.f13244j = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), o80.m14454a(o80.m14446a("OkHttp %s Push Observer", this.f13239e), true));
        this.f13250p.m16901a(7, 65535);
        this.f13250p.m16901a(5, 16384);
        this.f13248n = this.f13250p.m16906c();
        this.f13252r = c3250g.f13277a;
        this.f13253s = new w90(c3250g.f13280d, this.f13236b);
        this.f13254t = new C3253j(new u90(c3250g.f13279c, this.f13236b));
    }

    /* renamed from: a */
    private synchronized void m15582a(n80 n80Var) {
        if (!m15602a()) {
            this.f13244j.execute(n80Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[Catch: all -> 0x0075, TryCatch #0 {, blocks: (B:6:0x0007, B:8:0x000e, B:9:0x0013, B:11:0x0017, B:13:0x002b, B:15:0x0033, B:19:0x003d, B:21:0x0043, B:22:0x004c, B:36:0x006f, B:37:0x0074), top: B:5:0x0007, outer: #1 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private p000.v90 m15586b(int r11, java.util.List<p000.p90> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            w90 r7 = r10.f13253s
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L78
            int r0 = r10.f13241g     // Catch: java.lang.Throwable -> L75
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L13
            o90 r0 = p000.o90.REFUSED_STREAM     // Catch: java.lang.Throwable -> L75
            r10.m15598a(r0)     // Catch: java.lang.Throwable -> L75
        L13:
            boolean r0 = r10.f13242h     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L6f
            int r8 = r10.f13241g     // Catch: java.lang.Throwable -> L75
            int r0 = r10.f13241g     // Catch: java.lang.Throwable -> L75
            int r0 = r0 + 2
            r10.f13241g = r0     // Catch: java.lang.Throwable -> L75
            v90 r9 = new v90     // Catch: java.lang.Throwable -> L75
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L75
            if (r13 == 0) goto L3c
            long r0 = r10.f13248n     // Catch: java.lang.Throwable -> L75
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L3c
            long r0 = r9.f13645b     // Catch: java.lang.Throwable -> L75
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L3a
            goto L3c
        L3a:
            r13 = 0
            goto L3d
        L3c:
            r13 = 1
        L3d:
            boolean r0 = r9.m15996g()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L4c
            java.util.Map<java.lang.Integer, v90> r0 = r10.f13238d     // Catch: java.lang.Throwable -> L75
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L75
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L75
        L4c:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L75
            if (r11 != 0) goto L55
            w90 r0 = r10.f13253s     // Catch: java.lang.Throwable -> L78
            r0.m16186a(r6, r8, r11, r12)     // Catch: java.lang.Throwable -> L78
            goto L5e
        L55:
            boolean r0 = r10.f13236b     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L67
            w90 r0 = r10.f13253s     // Catch: java.lang.Throwable -> L78
            r0.m16180a(r11, r8, r12)     // Catch: java.lang.Throwable -> L78
        L5e:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L78
            if (r13 == 0) goto L66
            w90 r11 = r10.f13253s
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
        throw new UnsupportedOperationException("Method not decompiled: p000.t90.m15586b(int, java.util.List, boolean):v90");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m15588f() {
        try {
            m15599a(o90.PROTOCOL_ERROR, o90.PROTOCOL_ERROR);
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    synchronized v90 m15589a(int i) {
        return this.f13238d.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public v90 m15590a(List<p90> list, boolean z) {
        return m15586b(0, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15591a(int i, long j) {
        try {
            this.f13243i.execute(new C3245b("OkHttp Window Update %s stream %d", new Object[]{this.f13239e, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: a */
    void m15592a(int i, List<p90> list) {
        synchronized (this) {
            if (this.f13255u.contains(Integer.valueOf(i))) {
                m15607c(i, o90.PROTOCOL_ERROR);
                return;
            }
            this.f13255u.add(Integer.valueOf(i));
            try {
                m15582a(new C3246c("OkHttp %s Push Request[%s]", new Object[]{this.f13239e, Integer.valueOf(i)}, i, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* renamed from: a */
    void m15593a(int i, List<p90> list, boolean z) {
        try {
            m15582a(new C3247d("OkHttp %s Push Headers[%s]", new Object[]{this.f13239e, Integer.valueOf(i)}, i, list, z));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: a */
    void m15594a(int i, o90 o90Var) {
        m15582a(new C3249f("OkHttp %s Push Reset[%s]", new Object[]{this.f13239e, Integer.valueOf(i)}, i, o90Var));
    }

    /* renamed from: a */
    void m15595a(int i, BufferedSource bufferedSource, int i2, boolean z) {
        Buffer buffer = new Buffer();
        long j = i2;
        bufferedSource.require(j);
        bufferedSource.read(buffer, j);
        if (buffer.size() == j) {
            m15582a(new C3248e("OkHttp %s Push Data[%s]", new Object[]{this.f13239e, Integer.valueOf(i)}, i, buffer, i2, z));
            return;
        }
        throw new IOException(buffer.size() + " != " + i2);
    }

    /* renamed from: a */
    public void m15596a(int i, boolean z, Buffer buffer, long j) {
        int min;
        long j2;
        if (j == 0) {
            this.f13253s.m16188a(z, i, buffer, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (this.f13248n <= 0) {
                    try {
                        if (!this.f13238d.containsKey(Integer.valueOf(i))) {
                            throw new IOException("stream closed");
                        }
                        wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j, this.f13248n), this.f13253s.m16190c());
                j2 = min;
                this.f13248n -= j2;
            }
            j -= j2;
            this.f13253s.m16188a(z && j == 0, i, buffer, min);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m15597a(long j) {
        long j2 = this.f13247m + j;
        this.f13247m = j2;
        if (j2 >= this.f13249o.m16906c() / 2) {
            m15591a(0, this.f13247m);
            this.f13247m = 0L;
        }
    }

    /* renamed from: a */
    public void m15598a(o90 o90Var) {
        synchronized (this.f13253s) {
            synchronized (this) {
                if (this.f13242h) {
                    return;
                }
                this.f13242h = true;
                this.f13253s.m16183a(this.f13240f, o90Var, o80.f12427a);
            }
        }
    }

    /* renamed from: a */
    void m15599a(o90 o90Var, o90 o90Var2) {
        v90[] v90VarArr = null;
        try {
            m15598a(o90Var);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f13238d.isEmpty()) {
                v90VarArr = (v90[]) this.f13238d.values().toArray(new v90[this.f13238d.size()]);
                this.f13238d.clear();
            }
        }
        if (v90VarArr != null) {
            for (v90 v90Var : v90VarArr) {
                try {
                    v90Var.m15987a(o90Var2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f13253s.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f13252r.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.f13243i.shutdown();
        this.f13244j.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: a */
    void m15600a(boolean z) {
        if (z) {
            this.f13253s.m16177a();
            this.f13253s.m16189b(this.f13249o);
            if (this.f13249o.m16906c() != 65535) {
                this.f13253s.m16181a(0, r6 - 65535);
            }
        }
        new Thread(this.f13254t).start();
    }

    /* renamed from: a */
    void m15601a(boolean z, int i, int i2) {
        boolean z2;
        if (!z) {
            synchronized (this) {
                z2 = this.f13246l;
                this.f13246l = true;
            }
            if (z2) {
                m15588f();
                return;
            }
        }
        try {
            this.f13253s.m16185a(z, i, i2);
        } catch (IOException unused) {
            m15588f();
        }
    }

    /* renamed from: a */
    public synchronized boolean m15602a() {
        return this.f13242h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m15603b(int i, o90 o90Var) {
        this.f13253s.m16182a(i, o90Var);
    }

    /* renamed from: b */
    boolean m15604b(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* renamed from: c */
    public synchronized int m15605c() {
        return this.f13250p.m16905b(Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized v90 m15606c(int i) {
        v90 remove;
        remove = this.f13238d.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m15607c(int i, o90 o90Var) {
        try {
            this.f13243i.execute(new C3244a("OkHttp %s stream %d", new Object[]{this.f13239e, Integer.valueOf(i)}, i, o90Var));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m15599a(o90.NO_ERROR, o90.CANCEL);
    }

    /* renamed from: d */
    public void m15608d() {
        m15600a(true);
    }

    public void flush() {
        this.f13253s.flush();
    }
}
