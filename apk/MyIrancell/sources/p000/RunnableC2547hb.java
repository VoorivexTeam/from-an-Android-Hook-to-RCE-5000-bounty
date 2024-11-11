package p000;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C0560e;
import com.bumptech.glide.C0563h;
import com.bumptech.glide.EnumC0562g;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.EnumC0567a;
import com.bumptech.glide.load.EnumC0569c;
import com.bumptech.glide.load.InterfaceC0573g;
import com.bumptech.glide.load.InterfaceC0577k;
import com.bumptech.glide.load.InterfaceC0578l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.C2586ib;
import p000.C2898li;
import p000.InterfaceC2467fb;

/* renamed from: hb */
/* loaded from: classes.dex */
class RunnableC2547hb<R> implements InterfaceC2467fb.a, Runnable, Comparable<RunnableC2547hb<?>>, C2898li.f {

    /* renamed from: A */
    private Object f10424A;

    /* renamed from: B */
    private EnumC0567a f10425B;

    /* renamed from: C */
    private InterfaceC2853ka<?> f10426C;

    /* renamed from: D */
    private volatile InterfaceC2467fb f10427D;

    /* renamed from: E */
    private volatile boolean f10428E;

    /* renamed from: F */
    private volatile boolean f10429F;

    /* renamed from: e */
    private final e f10433e;

    /* renamed from: f */
    private final InterfaceC3283u1<RunnableC2547hb<?>> f10434f;

    /* renamed from: i */
    private C0560e f10437i;

    /* renamed from: j */
    private InterfaceC0573g f10438j;

    /* renamed from: k */
    private EnumC0562g f10439k;

    /* renamed from: l */
    private C2983nb f10440l;

    /* renamed from: m */
    private int f10441m;

    /* renamed from: n */
    private int f10442n;

    /* renamed from: o */
    private AbstractC2809jb f10443o;

    /* renamed from: p */
    private C0575i f10444p;

    /* renamed from: q */
    private b<R> f10445q;

    /* renamed from: r */
    private int f10446r;

    /* renamed from: s */
    private h f10447s;

    /* renamed from: t */
    private g f10448t;

    /* renamed from: u */
    private long f10449u;

    /* renamed from: v */
    private boolean f10450v;

    /* renamed from: w */
    private Object f10451w;

    /* renamed from: x */
    private Thread f10452x;

    /* renamed from: y */
    private InterfaceC0573g f10453y;

    /* renamed from: z */
    private InterfaceC0573g f10454z;

    /* renamed from: b */
    private final C2505gb<R> f10430b = new C2505gb<>();

    /* renamed from: c */
    private final List<Throwable> f10431c = new ArrayList();

    /* renamed from: d */
    private final AbstractC2990ni f10432d = AbstractC2990ni.m14334b();

    /* renamed from: g */
    private final d<?> f10435g = new d<>();

    /* renamed from: h */
    private final f f10436h = new f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hb$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10455a;

        /* renamed from: b */
        static final /* synthetic */ int[] f10456b;

        /* renamed from: c */
        static final /* synthetic */ int[] f10457c;

        static {
            int[] iArr = new int[EnumC0569c.values().length];
            f10457c = iArr;
            try {
                iArr[EnumC0569c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10457c[EnumC0569c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[h.values().length];
            f10456b = iArr2;
            try {
                iArr2[h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10456b[h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10456b[h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10456b[h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10456b[h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f10455a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10455a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10455a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hb$b */
    /* loaded from: classes.dex */
    public interface b<R> {
        /* renamed from: a */
        void mo12182a(RunnableC2547hb<?> runnableC2547hb);

        /* renamed from: a */
        void mo12183a(C3121qb c3121qb);

        /* renamed from: a */
        void mo12184a(InterfaceC3353vb<R> interfaceC3353vb, EnumC0567a enumC0567a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hb$c */
    /* loaded from: classes.dex */
    public final class c<Z> implements C2586ib.a<Z> {

        /* renamed from: a */
        private final EnumC0567a f10458a;

        c(EnumC0567a enumC0567a) {
            this.f10458a = enumC0567a;
        }

        @Override // p000.C2586ib.a
        /* renamed from: a */
        public InterfaceC3353vb<Z> mo12185a(InterfaceC3353vb<Z> interfaceC3353vb) {
            return RunnableC2547hb.this.m12177a(this.f10458a, interfaceC3353vb);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hb$d */
    /* loaded from: classes.dex */
    public static class d<Z> {

        /* renamed from: a */
        private InterfaceC0573g f10460a;

        /* renamed from: b */
        private InterfaceC0577k<Z> f10461b;

        /* renamed from: c */
        private C3300ub<Z> f10462c;

        d() {
        }

        /* renamed from: a */
        void m12186a() {
            this.f10460a = null;
            this.f10461b = null;
            this.f10462c = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        <X> void m12187a(InterfaceC0573g interfaceC0573g, InterfaceC0577k<X> interfaceC0577k, C3300ub<X> c3300ub) {
            this.f10460a = interfaceC0573g;
            this.f10461b = interfaceC0577k;
            this.f10462c = c3300ub;
        }

        /* renamed from: a */
        void m12188a(e eVar, C0575i c0575i) {
            C2944mi.m14110a("DecodeJob.encode");
            try {
                eVar.mo12190a().mo14481a(this.f10460a, new C2425eb(this.f10461b, this.f10462c, c0575i));
            } finally {
                this.f10462c.m15788a();
                C2944mi.m14109a();
            }
        }

        /* renamed from: b */
        boolean m12189b() {
            return this.f10462c != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hb$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        InterfaceC3030oc mo12190a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hb$f */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        private boolean f10463a;

        /* renamed from: b */
        private boolean f10464b;

        /* renamed from: c */
        private boolean f10465c;

        f() {
        }

        /* renamed from: b */
        private boolean m12191b(boolean z) {
            return (this.f10465c || z || this.f10464b) && this.f10463a;
        }

        /* renamed from: a */
        synchronized boolean m12192a() {
            this.f10464b = true;
            return m12191b(false);
        }

        /* renamed from: a */
        synchronized boolean m12193a(boolean z) {
            this.f10463a = true;
            return m12191b(z);
        }

        /* renamed from: b */
        synchronized boolean m12194b() {
            this.f10465c = true;
            return m12191b(false);
        }

        /* renamed from: c */
        synchronized void m12195c() {
            this.f10464b = false;
            this.f10463a = false;
            this.f10465c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hb$g */
    /* loaded from: classes.dex */
    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hb$h */
    /* loaded from: classes.dex */
    public enum h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2547hb(e eVar, InterfaceC3283u1<RunnableC2547hb<?>> interfaceC3283u1) {
        this.f10433e = eVar;
        this.f10434f = interfaceC3283u1;
    }

    /* renamed from: a */
    private C0575i m12156a(EnumC0567a enumC0567a) {
        C0575i c0575i = this.f10444p;
        if (Build.VERSION.SDK_INT < 26) {
            return c0575i;
        }
        boolean z = enumC0567a == EnumC0567a.RESOURCE_DISK_CACHE || this.f10430b.m11978o();
        Boolean bool = (Boolean) c0575i.m3964a(C3124qe.f12791h);
        if (bool != null && (!bool.booleanValue() || z)) {
            return c0575i;
        }
        C0575i c0575i2 = new C0575i();
        c0575i2.m3965a(this.f10444p);
        c0575i2.m3963a(C3124qe.f12791h, Boolean.valueOf(z));
        return c0575i2;
    }

    /* renamed from: a */
    private h m12157a(h hVar) {
        int i = a.f10456b[hVar.ordinal()];
        if (i == 1) {
            return this.f10443o.mo13435a() ? h.DATA_CACHE : m12157a(h.DATA_CACHE);
        }
        if (i == 2) {
            return this.f10450v ? h.FINISHED : h.SOURCE;
        }
        if (i == 3 || i == 4) {
            return h.FINISHED;
        }
        if (i == 5) {
            return this.f10443o.mo13438b() ? h.RESOURCE_CACHE : m12157a(h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    /* renamed from: a */
    private <Data> InterfaceC3353vb<R> m12158a(Data data, EnumC0567a enumC0567a) {
        return m12159a((RunnableC2547hb<R>) data, enumC0567a, (C3256tb<RunnableC2547hb<R>, ResourceType, R>) this.f10430b.m11958a((Class) data.getClass()));
    }

    /* renamed from: a */
    private <Data, ResourceType> InterfaceC3353vb<R> m12159a(Data data, EnumC0567a enumC0567a, C3256tb<Data, ResourceType, R> c3256tb) {
        C0575i m12156a = m12156a(enumC0567a);
        InterfaceC2890la<Data> m3909b = this.f10437i.m3892f().m3909b((C0563h) data);
        try {
            return c3256tb.m15630a(m3909b, m12156a, this.f10441m, this.f10442n, new c(enumC0567a));
        } finally {
            m3909b.mo11362b();
        }
    }

    /* renamed from: a */
    private <Data> InterfaceC3353vb<R> m12160a(InterfaceC2853ka<?> interfaceC2853ka, Data data, EnumC0567a enumC0567a) {
        if (data == null) {
            return null;
        }
        try {
            long m11768a = C2474fi.m11768a();
            InterfaceC3353vb<R> m12158a = m12158a((RunnableC2547hb<R>) data, enumC0567a);
            if (Log.isLoggable("DecodeJob", 2)) {
                m12161a("Decoded result " + m12158a, m11768a);
            }
            return m12158a;
        } finally {
            interfaceC2853ka.mo3665b();
        }
    }

    /* renamed from: a */
    private void m12161a(String str, long j) {
        m12162a(str, j, (String) null);
    }

    /* renamed from: a */
    private void m12162a(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C2474fi.m11767a(j));
        sb.append(", load key: ");
        sb.append(this.f10440l);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.toString();
    }

    /* renamed from: a */
    private void m12163a(InterfaceC3353vb<R> interfaceC3353vb, EnumC0567a enumC0567a) {
        m12174q();
        this.f10445q.mo12184a(interfaceC3353vb, enumC0567a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private void m12164b(InterfaceC3353vb<R> interfaceC3353vb, EnumC0567a enumC0567a) {
        if (interfaceC3353vb instanceof InterfaceC3160rb) {
            ((InterfaceC3160rb) interfaceC3353vb).mo11998a();
        }
        C3300ub c3300ub = 0;
        if (this.f10435g.m12189b()) {
            interfaceC3353vb = C3300ub.m15786b(interfaceC3353vb);
            c3300ub = interfaceC3353vb;
        }
        m12163a((InterfaceC3353vb) interfaceC3353vb, enumC0567a);
        this.f10447s = h.ENCODE;
        try {
            if (this.f10435g.m12189b()) {
                this.f10435g.m12188a(this.f10433e, this.f10444p);
            }
            m12169l();
        } finally {
            if (c3300ub != 0) {
                c3300ub.m15788a();
            }
        }
    }

    /* renamed from: h */
    private void m12165h() {
        if (Log.isLoggable("DecodeJob", 2)) {
            m12162a("Retrieved data", this.f10449u, "data: " + this.f10424A + ", cache key: " + this.f10453y + ", fetcher: " + this.f10426C);
        }
        InterfaceC3353vb<R> interfaceC3353vb = null;
        try {
            interfaceC3353vb = m12160a(this.f10426C, (InterfaceC2853ka<?>) this.f10424A, this.f10425B);
        } catch (C3121qb e2) {
            e2.m15047a(this.f10454z, this.f10425B);
            this.f10431c.add(e2);
        }
        if (interfaceC3353vb != null) {
            m12164b(interfaceC3353vb, this.f10425B);
        } else {
            m12172o();
        }
    }

    /* renamed from: i */
    private InterfaceC2467fb m12166i() {
        int i = a.f10456b[this.f10447s.ordinal()];
        if (i == 1) {
            return new C3392wb(this.f10430b, this);
        }
        if (i == 2) {
            return new C0514cb(this.f10430b, this);
        }
        if (i == 3) {
            return new C3523zb(this.f10430b, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f10447s);
    }

    /* renamed from: j */
    private int m12167j() {
        return this.f10439k.ordinal();
    }

    /* renamed from: k */
    private void m12168k() {
        m12174q();
        this.f10445q.mo12183a(new C3121qb("Failed to load resource", new ArrayList(this.f10431c)));
        m12170m();
    }

    /* renamed from: l */
    private void m12169l() {
        if (this.f10436h.m12192a()) {
            m12171n();
        }
    }

    /* renamed from: m */
    private void m12170m() {
        if (this.f10436h.m12194b()) {
            m12171n();
        }
    }

    /* renamed from: n */
    private void m12171n() {
        this.f10436h.m12195c();
        this.f10435g.m12186a();
        this.f10430b.m11959a();
        this.f10428E = false;
        this.f10437i = null;
        this.f10438j = null;
        this.f10444p = null;
        this.f10439k = null;
        this.f10440l = null;
        this.f10445q = null;
        this.f10447s = null;
        this.f10427D = null;
        this.f10452x = null;
        this.f10453y = null;
        this.f10424A = null;
        this.f10425B = null;
        this.f10426C = null;
        this.f10449u = 0L;
        this.f10429F = false;
        this.f10451w = null;
        this.f10431c.clear();
        this.f10434f.mo13875a(this);
    }

    /* renamed from: o */
    private void m12172o() {
        this.f10452x = Thread.currentThread();
        this.f10449u = C2474fi.m11768a();
        boolean z = false;
        while (!this.f10429F && this.f10427D != null && !(z = this.f10427D.mo3640a())) {
            this.f10447s = m12157a(this.f10447s);
            this.f10427D = m12166i();
            if (this.f10447s == h.SOURCE) {
                mo11748d();
                return;
            }
        }
        if ((this.f10447s == h.FINISHED || this.f10429F) && !z) {
            m12168k();
        }
    }

    /* renamed from: p */
    private void m12173p() {
        int i = a.f10455a[this.f10448t.ordinal()];
        if (i == 1) {
            this.f10447s = m12157a(h.INITIALIZE);
            this.f10427D = m12166i();
        } else if (i != 2) {
            if (i == 3) {
                m12165h();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f10448t);
        }
        m12172o();
    }

    /* renamed from: q */
    private void m12174q() {
        Throwable th;
        this.f10432d.mo14335a();
        if (!this.f10428E) {
            this.f10428E = true;
            return;
        }
        if (this.f10431c.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.f10431c;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(RunnableC2547hb<?> runnableC2547hb) {
        int m12167j = m12167j() - runnableC2547hb.m12167j();
        return m12167j == 0 ? this.f10446r - runnableC2547hb.f10446r : m12167j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public RunnableC2547hb<R> m12176a(C0560e c0560e, Object obj, C2983nb c2983nb, InterfaceC0573g interfaceC0573g, int i, int i2, Class<?> cls, Class<R> cls2, EnumC0562g enumC0562g, AbstractC2809jb abstractC2809jb, Map<Class<?>, InterfaceC0578l<?>> map, boolean z, boolean z2, boolean z3, C0575i c0575i, b<R> bVar, int i3) {
        this.f10430b.m11960a(c0560e, obj, interfaceC0573g, i, i2, abstractC2809jb, cls, cls2, enumC0562g, c0575i, map, z, z2, this.f10433e);
        this.f10437i = c0560e;
        this.f10438j = interfaceC0573g;
        this.f10439k = enumC0562g;
        this.f10440l = c2983nb;
        this.f10441m = i;
        this.f10442n = i2;
        this.f10443o = abstractC2809jb;
        this.f10450v = z3;
        this.f10444p = c0575i;
        this.f10445q = bVar;
        this.f10446r = i3;
        this.f10448t = g.INITIALIZE;
        this.f10451w = obj;
        return this;
    }

    /* renamed from: a */
    <Z> InterfaceC3353vb<Z> m12177a(EnumC0567a enumC0567a, InterfaceC3353vb<Z> interfaceC3353vb) {
        InterfaceC3353vb<Z> interfaceC3353vb2;
        InterfaceC0578l<Z> interfaceC0578l;
        EnumC0569c enumC0569c;
        InterfaceC0573g c2382db;
        Class<?> cls = interfaceC3353vb.get().getClass();
        InterfaceC0577k<Z> interfaceC0577k = null;
        if (enumC0567a != EnumC0567a.RESOURCE_DISK_CACHE) {
            InterfaceC0578l<Z> m11963b = this.f10430b.m11963b(cls);
            interfaceC0578l = m11963b;
            interfaceC3353vb2 = m11963b.mo3967a(this.f10437i, interfaceC3353vb, this.f10441m, this.f10442n);
        } else {
            interfaceC3353vb2 = interfaceC3353vb;
            interfaceC0578l = null;
        }
        if (!interfaceC3353vb.equals(interfaceC3353vb2)) {
            interfaceC3353vb.mo3383b();
        }
        if (this.f10430b.m11964b((InterfaceC3353vb<?>) interfaceC3353vb2)) {
            interfaceC0577k = this.f10430b.m11956a((InterfaceC3353vb) interfaceC3353vb2);
            enumC0569c = interfaceC0577k.mo3966a(this.f10444p);
        } else {
            enumC0569c = EnumC0569c.NONE;
        }
        InterfaceC0577k interfaceC0577k2 = interfaceC0577k;
        if (!this.f10443o.mo13437a(!this.f10430b.m11961a(this.f10453y), enumC0567a, enumC0569c)) {
            return interfaceC3353vb2;
        }
        if (interfaceC0577k2 == null) {
            throw new C0563h.d(interfaceC3353vb2.get().getClass());
        }
        int i = a.f10457c[enumC0569c.ordinal()];
        if (i == 1) {
            c2382db = new C2382db(this.f10453y, this.f10438j);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + enumC0569c);
            }
            c2382db = new C3432xb(this.f10430b.m11962b(), this.f10453y, this.f10438j, this.f10441m, this.f10442n, interfaceC0578l, cls, this.f10444p);
        }
        C3300ub m15786b = C3300ub.m15786b(interfaceC3353vb2);
        this.f10435g.m12187a(c2382db, interfaceC0577k2, m15786b);
        return m15786b;
    }

    @Override // p000.InterfaceC2467fb.a
    /* renamed from: a */
    public void mo11746a(InterfaceC0573g interfaceC0573g, Exception exc, InterfaceC2853ka<?> interfaceC2853ka, EnumC0567a enumC0567a) {
        interfaceC2853ka.mo3665b();
        C3121qb c3121qb = new C3121qb("Fetching data failed", exc);
        c3121qb.m15048a(interfaceC0573g, enumC0567a, interfaceC2853ka.mo3663a());
        this.f10431c.add(c3121qb);
        if (Thread.currentThread() == this.f10452x) {
            m12172o();
        } else {
            this.f10448t = g.SWITCH_TO_SOURCE_SERVICE;
            this.f10445q.mo12182a((RunnableC2547hb<?>) this);
        }
    }

    @Override // p000.InterfaceC2467fb.a
    /* renamed from: a */
    public void mo11747a(InterfaceC0573g interfaceC0573g, Object obj, InterfaceC2853ka<?> interfaceC2853ka, EnumC0567a enumC0567a, InterfaceC0573g interfaceC0573g2) {
        this.f10453y = interfaceC0573g;
        this.f10424A = obj;
        this.f10426C = interfaceC2853ka;
        this.f10425B = enumC0567a;
        this.f10454z = interfaceC0573g2;
        if (Thread.currentThread() != this.f10452x) {
            this.f10448t = g.DECODE_DATA;
            this.f10445q.mo12182a((RunnableC2547hb<?>) this);
        } else {
            C2944mi.m14110a("DecodeJob.decodeFromRetrievedData");
            try {
                m12165h();
            } finally {
                C2944mi.m14109a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12178a(boolean z) {
        if (this.f10436h.m12193a(z)) {
            m12171n();
        }
    }

    @Override // p000.InterfaceC2467fb.a
    /* renamed from: d */
    public void mo11748d() {
        this.f10448t = g.SWITCH_TO_SOURCE_SERVICE;
        this.f10445q.mo12182a((RunnableC2547hb<?>) this);
    }

    @Override // p000.C2898li.f
    /* renamed from: e */
    public AbstractC2990ni mo12179e() {
        return this.f10432d;
    }

    /* renamed from: f */
    public void m12180f() {
        this.f10429F = true;
        InterfaceC2467fb interfaceC2467fb = this.f10427D;
        if (interfaceC2467fb != null) {
            interfaceC2467fb.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m12181g() {
        h m12157a = m12157a(h.INITIALIZE);
        return m12157a == h.RESOURCE_CACHE || m12157a == h.DATA_CACHE;
    }

    @Override // java.lang.Runnable
    public void run() {
        C2944mi.m14111a("DecodeJob#run(model=%s)", this.f10451w);
        InterfaceC2853ka<?> interfaceC2853ka = this.f10426C;
        try {
            try {
                if (this.f10429F) {
                    m12168k();
                    return;
                }
                m12173p();
                if (interfaceC2853ka != null) {
                    interfaceC2853ka.mo3665b();
                }
                C2944mi.m14109a();
            } finally {
                if (interfaceC2853ka != null) {
                    interfaceC2853ka.mo3665b();
                }
                C2944mi.m14109a();
            }
        } catch (C0459bb e2) {
            throw e2;
        } catch (Throwable th) {
            if (Log.isLoggable("DecodeJob", 3)) {
                String str = "DecodeJob threw unexpectedly, isCancelled: " + this.f10429F + ", stage: " + this.f10447s;
            }
            if (this.f10447s != h.ENCODE) {
                this.f10431c.add(th);
                m12168k();
            }
            if (!this.f10429F) {
                throw th;
            }
            throw th;
        }
    }
}
