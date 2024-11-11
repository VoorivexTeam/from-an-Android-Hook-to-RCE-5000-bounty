package p000;

import android.util.Log;
import com.bumptech.glide.C0560e;
import com.bumptech.glide.EnumC0562g;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.EnumC0567a;
import com.bumptech.glide.load.InterfaceC0573g;
import com.bumptech.glide.load.InterfaceC0578l;
import java.util.Map;
import java.util.concurrent.Executor;
import p000.C2898li;
import p000.C3079pb;
import p000.InterfaceC3030oc;
import p000.InterfaceC3354vc;
import p000.RunnableC2547hb;

/* renamed from: kb */
/* loaded from: classes.dex */
public class C2854kb implements InterfaceC2937mb, InterfaceC3354vc.a, C3079pb.a {

    /* renamed from: i */
    private static final boolean f11678i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    private final C3204sb f11679a;

    /* renamed from: b */
    private final C3029ob f11680b;

    /* renamed from: c */
    private final InterfaceC3354vc f11681c;

    /* renamed from: d */
    private final b f11682d;

    /* renamed from: e */
    private final C3481yb f11683e;

    /* renamed from: f */
    private final c f11684f;

    /* renamed from: g */
    private final a f11685g;

    /* renamed from: h */
    private final C0014ab f11686h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kb$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final RunnableC2547hb.e f11687a;

        /* renamed from: b */
        final InterfaceC3283u1<RunnableC2547hb<?>> f11688b = C2898li.m13868a(150, new C3572a());

        /* renamed from: c */
        private int f11689c;

        /* renamed from: kb$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C3572a implements C2898li.d<RunnableC2547hb<?>> {
            C3572a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.C2898li.d
            /* renamed from: a */
            public RunnableC2547hb<?> mo13672a() {
                a aVar = a.this;
                return new RunnableC2547hb<>(aVar.f11687a, aVar.f11688b);
            }
        }

        a(RunnableC2547hb.e eVar) {
            this.f11687a = eVar;
        }

        /* renamed from: a */
        <R> RunnableC2547hb<R> m13671a(C0560e c0560e, Object obj, C2983nb c2983nb, InterfaceC0573g interfaceC0573g, int i, int i2, Class<?> cls, Class<R> cls2, EnumC0562g enumC0562g, AbstractC2809jb abstractC2809jb, Map<Class<?>, InterfaceC0578l<?>> map, boolean z, boolean z2, boolean z3, C0575i c0575i, RunnableC2547hb.b<R> bVar) {
            RunnableC2547hb mo13874a = this.f11688b.mo13874a();
            C2816ji.m13459a(mo13874a);
            RunnableC2547hb runnableC2547hb = mo13874a;
            int i3 = this.f11689c;
            this.f11689c = i3 + 1;
            runnableC2547hb.m12176a(c0560e, obj, c2983nb, interfaceC0573g, i, i2, cls, cls2, enumC0562g, abstractC2809jb, map, z, z2, z3, c0575i, bVar, i3);
            return runnableC2547hb;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kb$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final ExecutorServiceC3482yc f11691a;

        /* renamed from: b */
        final ExecutorServiceC3482yc f11692b;

        /* renamed from: c */
        final ExecutorServiceC3482yc f11693c;

        /* renamed from: d */
        final ExecutorServiceC3482yc f11694d;

        /* renamed from: e */
        final InterfaceC2937mb f11695e;

        /* renamed from: f */
        final InterfaceC3283u1<C2891lb<?>> f11696f = C2898li.m13868a(150, new a());

        /* renamed from: kb$b$a */
        /* loaded from: classes.dex */
        class a implements C2898li.d<C2891lb<?>> {
            a() {
            }

            @Override // p000.C2898li.d
            /* renamed from: a, reason: avoid collision after fix types in other method */
            public C2891lb<?> mo13672a() {
                b bVar = b.this;
                return new C2891lb<>(bVar.f11691a, bVar.f11692b, bVar.f11693c, bVar.f11694d, bVar.f11695e, bVar.f11696f);
            }
        }

        b(ExecutorServiceC3482yc executorServiceC3482yc, ExecutorServiceC3482yc executorServiceC3482yc2, ExecutorServiceC3482yc executorServiceC3482yc3, ExecutorServiceC3482yc executorServiceC3482yc4, InterfaceC2937mb interfaceC2937mb) {
            this.f11691a = executorServiceC3482yc;
            this.f11692b = executorServiceC3482yc2;
            this.f11693c = executorServiceC3482yc3;
            this.f11694d = executorServiceC3482yc4;
            this.f11695e = interfaceC2937mb;
        }

        /* renamed from: a */
        <R> C2891lb<R> m13673a(InterfaceC0573g interfaceC0573g, boolean z, boolean z2, boolean z3, boolean z4) {
            C2891lb mo13874a = this.f11696f.mo13874a();
            C2816ji.m13459a(mo13874a);
            C2891lb c2891lb = mo13874a;
            c2891lb.m13843a(interfaceC0573g, z, z2, z3, z4);
            return c2891lb;
        }
    }

    /* renamed from: kb$c */
    /* loaded from: classes.dex */
    private static class c implements RunnableC2547hb.e {

        /* renamed from: a */
        private final InterfaceC3030oc.a f11698a;

        /* renamed from: b */
        private volatile InterfaceC3030oc f11699b;

        c(InterfaceC3030oc.a aVar) {
            this.f11698a = aVar;
        }

        @Override // p000.RunnableC2547hb.e
        /* renamed from: a */
        public InterfaceC3030oc mo12190a() {
            if (this.f11699b == null) {
                synchronized (this) {
                    if (this.f11699b == null) {
                        this.f11699b = this.f11698a.mo14482a();
                    }
                    if (this.f11699b == null) {
                        this.f11699b = new C3080pc();
                    }
                }
            }
            return this.f11699b;
        }
    }

    /* renamed from: kb$d */
    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a */
        private final C2891lb<?> f11700a;

        /* renamed from: b */
        private final InterfaceC2815jh f11701b;

        d(InterfaceC2815jh interfaceC2815jh, C2891lb<?> c2891lb) {
            this.f11701b = interfaceC2815jh;
            this.f11700a = c2891lb;
        }

        /* renamed from: a */
        public void m13674a() {
            synchronized (C2854kb.this) {
                this.f11700a.m13852c(this.f11701b);
            }
        }
    }

    C2854kb(InterfaceC3354vc interfaceC3354vc, InterfaceC3030oc.a aVar, ExecutorServiceC3482yc executorServiceC3482yc, ExecutorServiceC3482yc executorServiceC3482yc2, ExecutorServiceC3482yc executorServiceC3482yc3, ExecutorServiceC3482yc executorServiceC3482yc4, C3204sb c3204sb, C3029ob c3029ob, C0014ab c0014ab, b bVar, a aVar2, C3481yb c3481yb, boolean z) {
        this.f11681c = interfaceC3354vc;
        this.f11684f = new c(aVar);
        C0014ab c0014ab2 = c0014ab == null ? new C0014ab(z) : c0014ab;
        this.f11686h = c0014ab2;
        c0014ab2.m128a(this);
        this.f11680b = c3029ob == null ? new C3029ob() : c3029ob;
        this.f11679a = c3204sb == null ? new C3204sb() : c3204sb;
        this.f11682d = bVar == null ? new b(executorServiceC3482yc, executorServiceC3482yc2, executorServiceC3482yc3, executorServiceC3482yc4, this) : bVar;
        this.f11685g = aVar2 == null ? new a(this.f11684f) : aVar2;
        this.f11683e = c3481yb == null ? new C3481yb() : c3481yb;
        interfaceC3354vc.mo15793a(this);
    }

    public C2854kb(InterfaceC3354vc interfaceC3354vc, InterfaceC3030oc.a aVar, ExecutorServiceC3482yc executorServiceC3482yc, ExecutorServiceC3482yc executorServiceC3482yc2, ExecutorServiceC3482yc executorServiceC3482yc3, ExecutorServiceC3482yc executorServiceC3482yc4, boolean z) {
        this(interfaceC3354vc, aVar, executorServiceC3482yc, executorServiceC3482yc2, executorServiceC3482yc3, executorServiceC3482yc4, null, null, null, null, null, null, z);
    }

    /* renamed from: a */
    private C3079pb<?> m13661a(InterfaceC0573g interfaceC0573g) {
        InterfaceC3353vb<?> mo15790a = this.f11681c.mo15790a(interfaceC0573g);
        if (mo15790a == null) {
            return null;
        }
        return mo15790a instanceof C3079pb ? (C3079pb) mo15790a : new C3079pb<>(mo15790a, true, true);
    }

    /* renamed from: a */
    private C3079pb<?> m13662a(InterfaceC0573g interfaceC0573g, boolean z) {
        if (!z) {
            return null;
        }
        C3079pb<?> m129b = this.f11686h.m129b(interfaceC0573g);
        if (m129b != null) {
            m129b.m14744a();
        }
        return m129b;
    }

    /* renamed from: a */
    private static void m13663a(String str, long j, InterfaceC0573g interfaceC0573g) {
        String str2 = str + " in " + C2474fi.m11767a(j) + "ms, key: " + interfaceC0573g;
    }

    /* renamed from: b */
    private C3079pb<?> m13664b(InterfaceC0573g interfaceC0573g, boolean z) {
        if (!z) {
            return null;
        }
        C3079pb<?> m13661a = m13661a(interfaceC0573g);
        if (m13661a != null) {
            m13661a.m14744a();
            this.f11686h.m127a(interfaceC0573g, m13661a);
        }
        return m13661a;
    }

    /* renamed from: a */
    public synchronized <R> d m13665a(C0560e c0560e, Object obj, InterfaceC0573g interfaceC0573g, int i, int i2, Class<?> cls, Class<R> cls2, EnumC0562g enumC0562g, AbstractC2809jb abstractC2809jb, Map<Class<?>, InterfaceC0578l<?>> map, boolean z, boolean z2, C0575i c0575i, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC2815jh interfaceC2815jh, Executor executor) {
        long m11768a = f11678i ? C2474fi.m11768a() : 0L;
        C2983nb m14479a = this.f11680b.m14479a(obj, interfaceC0573g, i, i2, map, cls, cls2, c0575i);
        C3079pb<?> m13662a = m13662a(m14479a, z3);
        if (m13662a != null) {
            interfaceC2815jh.mo13458a(m13662a, EnumC0567a.MEMORY_CACHE);
            if (f11678i) {
                m13663a("Loaded resource from active resources", m11768a, m14479a);
            }
            return null;
        }
        C3079pb<?> m13664b = m13664b(m14479a, z3);
        if (m13664b != null) {
            interfaceC2815jh.mo13458a(m13664b, EnumC0567a.MEMORY_CACHE);
            if (f11678i) {
                m13663a("Loaded resource from cache", m11768a, m14479a);
            }
            return null;
        }
        C2891lb<?> m15391a = this.f11679a.m15391a(m14479a, z6);
        if (m15391a != null) {
            m15391a.m13847a(interfaceC2815jh, executor);
            if (f11678i) {
                m13663a("Added to existing load", m11768a, m14479a);
            }
            return new d(interfaceC2815jh, m15391a);
        }
        C2891lb<R> m13673a = this.f11682d.m13673a(m14479a, z3, z4, z5, z6);
        RunnableC2547hb<R> m13671a = this.f11685g.m13671a(c0560e, obj, m14479a, interfaceC0573g, i, i2, cls, cls2, enumC0562g, abstractC2809jb, map, z, z2, z6, c0575i, m13673a);
        this.f11679a.m15392a((InterfaceC0573g) m14479a, (C2891lb<?>) m13673a);
        m13673a.m13847a(interfaceC2815jh, executor);
        m13673a.m13849b(m13671a);
        if (f11678i) {
            m13663a("Started new load", m11768a, m14479a);
        }
        return new d(interfaceC2815jh, m13673a);
    }

    @Override // p000.C3079pb.a
    /* renamed from: a */
    public synchronized void mo13666a(InterfaceC0573g interfaceC0573g, C3079pb<?> c3079pb) {
        this.f11686h.m126a(interfaceC0573g);
        if (c3079pb.m14747f()) {
            this.f11681c.mo15791a(interfaceC0573g, c3079pb);
        } else {
            this.f11683e.m16616a(c3079pb);
        }
    }

    @Override // p000.InterfaceC2937mb
    /* renamed from: a */
    public synchronized void mo13667a(C2891lb<?> c2891lb, InterfaceC0573g interfaceC0573g) {
        this.f11679a.m15393b(interfaceC0573g, c2891lb);
    }

    @Override // p000.InterfaceC2937mb
    /* renamed from: a */
    public synchronized void mo13668a(C2891lb<?> c2891lb, InterfaceC0573g interfaceC0573g, C3079pb<?> c3079pb) {
        if (c3079pb != null) {
            c3079pb.m14745a(interfaceC0573g, this);
            if (c3079pb.m14747f()) {
                this.f11686h.m127a(interfaceC0573g, c3079pb);
            }
        }
        this.f11679a.m15393b(interfaceC0573g, c2891lb);
    }

    @Override // p000.InterfaceC3354vc.a
    /* renamed from: a */
    public void mo13669a(InterfaceC3353vb<?> interfaceC3353vb) {
        this.f11683e.m16616a(interfaceC3353vb);
    }

    /* renamed from: b */
    public void m13670b(InterfaceC3353vb<?> interfaceC3353vb) {
        if (!(interfaceC3353vb instanceof C3079pb)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C3079pb) interfaceC3353vb).m14748g();
    }
}
