package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C0560e;
import com.bumptech.glide.EnumC0562g;
import com.bumptech.glide.load.EnumC0567a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p000.C2854kb;
import p000.C2898li;

/* renamed from: kh */
/* loaded from: classes.dex */
public final class C2860kh<R> implements InterfaceC2473fh, InterfaceC3210sh, InterfaceC2815jh, C2898li.f {

    /* renamed from: D */
    private static final InterfaceC3283u1<C2860kh<?>> f11723D = C2898li.m13868a(150, new a());

    /* renamed from: E */
    private static final boolean f11724E = Log.isLoggable("Request", 2);

    /* renamed from: A */
    private int f11725A;

    /* renamed from: B */
    private int f11726B;

    /* renamed from: C */
    private RuntimeException f11727C;

    /* renamed from: b */
    private boolean f11728b;

    /* renamed from: c */
    private final String f11729c;

    /* renamed from: d */
    private final AbstractC2990ni f11730d;

    /* renamed from: e */
    private InterfaceC2553hh<R> f11731e;

    /* renamed from: f */
    private InterfaceC2513gh f11732f;

    /* renamed from: g */
    private Context f11733g;

    /* renamed from: h */
    private C0560e f11734h;

    /* renamed from: i */
    private Object f11735i;

    /* renamed from: j */
    private Class<R> f11736j;

    /* renamed from: k */
    private AbstractC2389dh<?> f11737k;

    /* renamed from: l */
    private int f11738l;

    /* renamed from: m */
    private int f11739m;

    /* renamed from: n */
    private EnumC0562g f11740n;

    /* renamed from: o */
    private InterfaceC3262th<R> f11741o;

    /* renamed from: p */
    private List<InterfaceC2553hh<R>> f11742p;

    /* renamed from: q */
    private C2854kb f11743q;

    /* renamed from: r */
    private InterfaceC3438xh<? super R> f11744r;

    /* renamed from: s */
    private Executor f11745s;

    /* renamed from: t */
    private InterfaceC3353vb<R> f11746t;

    /* renamed from: u */
    private C2854kb.d f11747u;

    /* renamed from: v */
    private long f11748v;

    /* renamed from: w */
    private b f11749w;

    /* renamed from: x */
    private Drawable f11750x;

    /* renamed from: y */
    private Drawable f11751y;

    /* renamed from: z */
    private Drawable f11752z;

    /* renamed from: kh$a */
    /* loaded from: classes.dex */
    class a implements C2898li.d<C2860kh<?>> {
        a() {
        }

        @Override // p000.C2898li.d
        /* renamed from: a, reason: avoid collision after fix types in other method */
        public C2860kh<?> mo13672a() {
            return new C2860kh<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kh$b */
    /* loaded from: classes.dex */
    public enum b {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    C2860kh() {
        this.f11729c = f11724E ? String.valueOf(super.hashCode()) : null;
        this.f11730d = AbstractC2990ni.m14334b();
    }

    /* renamed from: a */
    private static int m13694a(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * i);
    }

    /* renamed from: a */
    private Drawable m13695a(int i) {
        return C2471ff.m11762a(this.f11734h, i, this.f11737k.m11419v() != null ? this.f11737k.m11419v() : this.f11733g.getTheme());
    }

    /* renamed from: a */
    private synchronized void m13696a(Context context, C0560e c0560e, Object obj, Class<R> cls, AbstractC2389dh<?> abstractC2389dh, int i, int i2, EnumC0562g enumC0562g, InterfaceC3262th<R> interfaceC3262th, InterfaceC2553hh<R> interfaceC2553hh, List<InterfaceC2553hh<R>> list, InterfaceC2513gh interfaceC2513gh, C2854kb c2854kb, InterfaceC3438xh<? super R> interfaceC3438xh, Executor executor) {
        this.f11733g = context;
        this.f11734h = c0560e;
        this.f11735i = obj;
        this.f11736j = cls;
        this.f11737k = abstractC2389dh;
        this.f11738l = i;
        this.f11739m = i2;
        this.f11740n = enumC0562g;
        this.f11741o = interfaceC3262th;
        this.f11731e = interfaceC2553hh;
        this.f11742p = list;
        this.f11732f = interfaceC2513gh;
        this.f11743q = c2854kb;
        this.f11744r = interfaceC3438xh;
        this.f11745s = executor;
        this.f11749w = b.PENDING;
        if (this.f11727C == null && c0560e.m3893g()) {
            this.f11727C = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: a */
    private void m13697a(String str) {
        String str2 = str + " this: " + this.f11729c;
    }

    /* renamed from: a */
    private synchronized void m13698a(C3121qb c3121qb, int i) {
        boolean z;
        this.f11730d.mo14335a();
        c3121qb.m15049a(this.f11727C);
        int m3891e = this.f11734h.m3891e();
        if (m3891e <= i) {
            String str = "Load failed for " + this.f11735i + " with size [" + this.f11725A + "x" + this.f11726B + "]";
            if (m3891e <= 4) {
                c3121qb.m15050a("Glide");
            }
        }
        this.f11747u = null;
        this.f11749w = b.FAILED;
        boolean z2 = true;
        this.f11728b = true;
        try {
            if (this.f11742p != null) {
                Iterator<InterfaceC2553hh<R>> it = this.f11742p.iterator();
                z = false;
                while (it.hasNext()) {
                    z |= it.next().m12220a(c3121qb, this.f11735i, this.f11741o, m13711p());
                }
            } else {
                z = false;
            }
            if (this.f11731e == null || !this.f11731e.m12220a(c3121qb, this.f11735i, this.f11741o, m13711p())) {
                z2 = false;
            }
            if (!(z | z2)) {
                m13714s();
            }
            this.f11728b = false;
            m13712q();
        } catch (Throwable th) {
            this.f11728b = false;
            throw th;
        }
    }

    /* renamed from: a */
    private void m13699a(InterfaceC3353vb<?> interfaceC3353vb) {
        this.f11743q.m13670b(interfaceC3353vb);
        this.f11746t = null;
    }

    /* renamed from: a */
    private synchronized void m13700a(InterfaceC3353vb<R> interfaceC3353vb, R r, EnumC0567a enumC0567a) {
        boolean z;
        boolean m13711p = m13711p();
        this.f11749w = b.COMPLETE;
        this.f11746t = interfaceC3353vb;
        if (this.f11734h.m3891e() <= 3) {
            String str = "Finished loading " + r.getClass().getSimpleName() + " from " + enumC0567a + " for " + this.f11735i + " with size [" + this.f11725A + "x" + this.f11726B + "] in " + C2474fi.m11767a(this.f11748v) + " ms";
        }
        boolean z2 = true;
        this.f11728b = true;
        try {
            if (this.f11742p != null) {
                Iterator<InterfaceC2553hh<R>> it = this.f11742p.iterator();
                z = false;
                while (it.hasNext()) {
                    z |= it.next().m12219a(r, this.f11735i, this.f11741o, enumC0567a, m13711p);
                }
            } else {
                z = false;
            }
            if (this.f11731e == null || !this.f11731e.m12219a(r, this.f11735i, this.f11741o, enumC0567a, m13711p)) {
                z2 = false;
            }
            if (!(z2 | z)) {
                this.f11741o.mo14754a(r, this.f11744r.mo16019a(enumC0567a, m13711p));
            }
            this.f11728b = false;
            m13713r();
        } catch (Throwable th) {
            this.f11728b = false;
            throw th;
        }
    }

    /* renamed from: a */
    private synchronized boolean m13701a(C2860kh<?> c2860kh) {
        boolean z;
        synchronized (c2860kh) {
            z = (this.f11742p == null ? 0 : this.f11742p.size()) == (c2860kh.f11742p == null ? 0 : c2860kh.f11742p.size());
        }
        return z;
    }

    /* renamed from: b */
    public static <R> C2860kh<R> m13702b(Context context, C0560e c0560e, Object obj, Class<R> cls, AbstractC2389dh<?> abstractC2389dh, int i, int i2, EnumC0562g enumC0562g, InterfaceC3262th<R> interfaceC3262th, InterfaceC2553hh<R> interfaceC2553hh, List<InterfaceC2553hh<R>> list, InterfaceC2513gh interfaceC2513gh, C2854kb c2854kb, InterfaceC3438xh<? super R> interfaceC3438xh, Executor executor) {
        C2860kh<R> c2860kh = (C2860kh) f11723D.mo13874a();
        if (c2860kh == null) {
            c2860kh = new C2860kh<>();
        }
        c2860kh.m13696a(context, c0560e, obj, cls, abstractC2389dh, i, i2, enumC0562g, interfaceC3262th, interfaceC2553hh, list, interfaceC2513gh, c2854kb, interfaceC3438xh, executor);
        return c2860kh;
    }

    /* renamed from: h */
    private void m13703h() {
        if (this.f11728b) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: i */
    private boolean m13704i() {
        InterfaceC2513gh interfaceC2513gh = this.f11732f;
        return interfaceC2513gh == null || interfaceC2513gh.mo11610f(this);
    }

    /* renamed from: j */
    private boolean m13705j() {
        InterfaceC2513gh interfaceC2513gh = this.f11732f;
        return interfaceC2513gh == null || interfaceC2513gh.mo11604c(this);
    }

    /* renamed from: k */
    private boolean m13706k() {
        InterfaceC2513gh interfaceC2513gh = this.f11732f;
        return interfaceC2513gh == null || interfaceC2513gh.mo11606d(this);
    }

    /* renamed from: l */
    private void m13707l() {
        m13703h();
        this.f11730d.mo14335a();
        this.f11741o.mo15272a((InterfaceC3210sh) this);
        C2854kb.d dVar = this.f11747u;
        if (dVar != null) {
            dVar.m13674a();
            this.f11747u = null;
        }
    }

    /* renamed from: m */
    private Drawable m13708m() {
        if (this.f11750x == null) {
            Drawable m11406h = this.f11737k.m11406h();
            this.f11750x = m11406h;
            if (m11406h == null && this.f11737k.m11405g() > 0) {
                this.f11750x = m13695a(this.f11737k.m11405g());
            }
        }
        return this.f11750x;
    }

    /* renamed from: n */
    private Drawable m13709n() {
        if (this.f11752z == null) {
            Drawable m11407j = this.f11737k.m11407j();
            this.f11752z = m11407j;
            if (m11407j == null && this.f11737k.m11408k() > 0) {
                this.f11752z = m13695a(this.f11737k.m11408k());
            }
        }
        return this.f11752z;
    }

    /* renamed from: o */
    private Drawable m13710o() {
        if (this.f11751y == null) {
            Drawable m11413p = this.f11737k.m11413p();
            this.f11751y = m11413p;
            if (m11413p == null && this.f11737k.m11414q() > 0) {
                this.f11751y = m13695a(this.f11737k.m11414q());
            }
        }
        return this.f11751y;
    }

    /* renamed from: p */
    private boolean m13711p() {
        InterfaceC2513gh interfaceC2513gh = this.f11732f;
        return interfaceC2513gh == null || !interfaceC2513gh.mo11608e();
    }

    /* renamed from: q */
    private void m13712q() {
        InterfaceC2513gh interfaceC2513gh = this.f11732f;
        if (interfaceC2513gh != null) {
            interfaceC2513gh.mo11599a(this);
        }
    }

    /* renamed from: r */
    private void m13713r() {
        InterfaceC2513gh interfaceC2513gh = this.f11732f;
        if (interfaceC2513gh != null) {
            interfaceC2513gh.mo11607e(this);
        }
    }

    /* renamed from: s */
    private synchronized void m13714s() {
        if (m13705j()) {
            Drawable m13709n = this.f11735i == null ? m13709n() : null;
            if (m13709n == null) {
                m13709n = m13708m();
            }
            if (m13709n == null) {
                m13709n = m13710o();
            }
            this.f11741o.mo14104a(m13709n);
        }
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: a */
    public synchronized void mo11598a() {
        m13703h();
        this.f11730d.mo14335a();
        this.f11748v = C2474fi.m11768a();
        if (this.f11735i == null) {
            if (C2861ki.m13732b(this.f11738l, this.f11739m)) {
                this.f11725A = this.f11738l;
                this.f11726B = this.f11739m;
            }
            m13698a(new C3121qb("Received null model"), m13709n() == null ? 5 : 3);
            return;
        }
        if (this.f11749w == b.RUNNING) {
            throw new IllegalArgumentException("Cannot restart a running request");
        }
        if (this.f11749w == b.COMPLETE) {
            mo13458a((InterfaceC3353vb<?>) this.f11746t, EnumC0567a.MEMORY_CACHE);
            return;
        }
        this.f11749w = b.WAITING_FOR_SIZE;
        if (C2861ki.m13732b(this.f11738l, this.f11739m)) {
            mo13715a(this.f11738l, this.f11739m);
        } else {
            this.f11741o.mo15273b(this);
        }
        if ((this.f11749w == b.RUNNING || this.f11749w == b.WAITING_FOR_SIZE) && m13705j()) {
            this.f11741o.mo14106b(m13710o());
        }
        if (f11724E) {
            m13697a("finished run method in " + C2474fi.m11767a(this.f11748v));
        }
    }

    @Override // p000.InterfaceC3210sh
    /* renamed from: a */
    public synchronized void mo13715a(int i, int i2) {
        try {
            this.f11730d.mo14335a();
            if (f11724E) {
                m13697a("Got onSizeReady in " + C2474fi.m11767a(this.f11748v));
            }
            if (this.f11749w != b.WAITING_FOR_SIZE) {
                return;
            }
            this.f11749w = b.RUNNING;
            float m11418u = this.f11737k.m11418u();
            this.f11725A = m13694a(i, m11418u);
            this.f11726B = m13694a(i2, m11418u);
            if (f11724E) {
                m13697a("finished setup for calling load in " + C2474fi.m11767a(this.f11748v));
            }
            try {
                try {
                    this.f11747u = this.f11743q.m13665a(this.f11734h, this.f11735i, this.f11737k.m11417t(), this.f11725A, this.f11726B, this.f11737k.m11416s(), this.f11736j, this.f11740n, this.f11737k.m11404c(), this.f11737k.m11420w(), this.f11737k.m11380D(), this.f11737k.m11378B(), this.f11737k.m11410m(), this.f11737k.m11423z(), this.f11737k.m11422y(), this.f11737k.m11421x(), this.f11737k.m11409l(), this, this.f11745s);
                    if (this.f11749w != b.RUNNING) {
                        this.f11747u = null;
                    }
                    if (f11724E) {
                        m13697a("finished onSizeReady in " + C2474fi.m11767a(this.f11748v));
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // p000.InterfaceC2815jh
    /* renamed from: a */
    public synchronized void mo13457a(C3121qb c3121qb) {
        m13698a(c3121qb, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC2815jh
    /* renamed from: a */
    public synchronized void mo13458a(InterfaceC3353vb<?> interfaceC3353vb, EnumC0567a enumC0567a) {
        this.f11730d.mo14335a();
        this.f11747u = null;
        if (interfaceC3353vb == null) {
            mo13457a(new C3121qb("Expected to receive a Resource<R> with an object of " + this.f11736j + " inside, but instead got null."));
            return;
        }
        Object obj = interfaceC3353vb.get();
        if (obj != null && this.f11736j.isAssignableFrom(obj.getClass())) {
            if (m13706k()) {
                m13700a(interfaceC3353vb, obj, enumC0567a);
                return;
            } else {
                m13699a(interfaceC3353vb);
                this.f11749w = b.COMPLETE;
                return;
            }
        }
        m13699a(interfaceC3353vb);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to receive an object of ");
        sb.append(this.f11736j);
        sb.append(" but instead got ");
        sb.append(obj != null ? obj.getClass() : "");
        sb.append("{");
        sb.append(obj);
        sb.append("} inside Resource{");
        sb.append(interfaceC3353vb);
        sb.append("}.");
        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
        mo13457a(new C3121qb(sb.toString()));
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: b */
    public synchronized void mo11601b() {
        m13703h();
        this.f11733g = null;
        this.f11734h = null;
        this.f11735i = null;
        this.f11736j = null;
        this.f11737k = null;
        this.f11738l = -1;
        this.f11739m = -1;
        this.f11741o = null;
        this.f11742p = null;
        this.f11731e = null;
        this.f11732f = null;
        this.f11744r = null;
        this.f11747u = null;
        this.f11750x = null;
        this.f11751y = null;
        this.f11752z = null;
        this.f11725A = -1;
        this.f11726B = -1;
        this.f11727C = null;
        f11723D.mo13875a(this);
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: b */
    public synchronized boolean mo11602b(InterfaceC2473fh interfaceC2473fh) {
        boolean z = false;
        if (!(interfaceC2473fh instanceof C2860kh)) {
            return false;
        }
        C2860kh<?> c2860kh = (C2860kh) interfaceC2473fh;
        synchronized (c2860kh) {
            if (this.f11738l == c2860kh.f11738l && this.f11739m == c2860kh.f11739m && C2861ki.m13729a(this.f11735i, c2860kh.f11735i) && this.f11736j.equals(c2860kh.f11736j) && this.f11737k.equals(c2860kh.f11737k) && this.f11740n == c2860kh.f11740n && m13701a(c2860kh)) {
                z = true;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: c */
    public synchronized boolean mo11603c() {
        return this.f11749w == b.FAILED;
    }

    @Override // p000.InterfaceC2473fh
    public synchronized void clear() {
        m13703h();
        this.f11730d.mo14335a();
        if (this.f11749w == b.CLEARED) {
            return;
        }
        m13707l();
        if (this.f11746t != null) {
            m13699a((InterfaceC3353vb<?>) this.f11746t);
        }
        if (m13704i()) {
            this.f11741o.mo14108c(m13710o());
        }
        this.f11749w = b.CLEARED;
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: d */
    public synchronized boolean mo11605d() {
        return this.f11749w == b.CLEARED;
    }

    @Override // p000.C2898li.f
    /* renamed from: e */
    public AbstractC2990ni mo12179e() {
        return this.f11730d;
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: f */
    public synchronized boolean mo11609f() {
        return mo11611g();
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: g */
    public synchronized boolean mo11611g() {
        return this.f11749w == b.COMPLETE;
    }

    @Override // p000.InterfaceC2473fh
    public synchronized boolean isRunning() {
        boolean z;
        if (this.f11749w != b.RUNNING) {
            z = this.f11749w == b.WAITING_FOR_SIZE;
        }
        return z;
    }
}
