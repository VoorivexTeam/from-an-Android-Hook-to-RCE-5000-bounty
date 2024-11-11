package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC2389dh;
import p000.AbstractC2809jb;
import p000.C2595ih;
import p000.C2861ki;
import p000.C3033of;
import p000.C3126qg;
import p000.C3209sg;
import p000.InterfaceC2472fg;
import p000.InterfaceC2473fh;
import p000.InterfaceC2512gg;
import p000.InterfaceC2553hh;
import p000.InterfaceC2859kg;
import p000.InterfaceC2896lg;
import p000.InterfaceC3084pg;
import p000.InterfaceC3262th;

/* renamed from: com.bumptech.glide.j */
/* loaded from: classes.dex */
public class C0565j implements InterfaceC2896lg {

    /* renamed from: l */
    private static final C2595ih f3262l;

    /* renamed from: a */
    protected final ComponentCallbacks2C0558c f3263a;

    /* renamed from: b */
    protected final Context f3264b;

    /* renamed from: c */
    final InterfaceC2859kg f3265c;

    /* renamed from: d */
    private final C3126qg f3266d;

    /* renamed from: e */
    private final InterfaceC3084pg f3267e;

    /* renamed from: f */
    private final C3209sg f3268f;

    /* renamed from: g */
    private final Runnable f3269g;

    /* renamed from: h */
    private final Handler f3270h;

    /* renamed from: i */
    private final InterfaceC2472fg f3271i;

    /* renamed from: j */
    private final CopyOnWriteArrayList<InterfaceC2553hh<Object>> f3272j;

    /* renamed from: k */
    private C2595ih f3273k;

    /* renamed from: com.bumptech.glide.j$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0565j c0565j = C0565j.this;
            c0565j.f3265c.mo11366a(c0565j);
        }
    }

    /* renamed from: com.bumptech.glide.j$b */
    /* loaded from: classes.dex */
    private class b implements InterfaceC2472fg.a {

        /* renamed from: a */
        private final C3126qg f3275a;

        b(C3126qg c3126qg) {
            this.f3275a = c3126qg;
        }

        @Override // p000.InterfaceC2472fg.a
        /* renamed from: a */
        public void mo3945a(boolean z) {
            if (z) {
                synchronized (C0565j.this) {
                    this.f3275a.m15094c();
                }
            }
        }
    }

    static {
        C2595ih m12456b = C2595ih.m12456b((Class<?>) Bitmap.class);
        m12456b.m11383G();
        f3262l = m12456b;
        C2595ih.m12456b((Class<?>) C3033of.class).m11383G();
        C2595ih.m12457b(AbstractC2809jb.f11500b).m11390a(EnumC0562g.LOW).m11400a(true);
    }

    public C0565j(ComponentCallbacks2C0558c componentCallbacks2C0558c, InterfaceC2859kg interfaceC2859kg, InterfaceC3084pg interfaceC3084pg, Context context) {
        this(componentCallbacks2C0558c, interfaceC2859kg, interfaceC3084pg, new C3126qg(), componentCallbacks2C0558c.m3878d(), context);
    }

    C0565j(ComponentCallbacks2C0558c componentCallbacks2C0558c, InterfaceC2859kg interfaceC2859kg, InterfaceC3084pg interfaceC3084pg, C3126qg c3126qg, InterfaceC2512gg interfaceC2512gg, Context context) {
        this.f3268f = new C3209sg();
        this.f3269g = new a();
        this.f3270h = new Handler(Looper.getMainLooper());
        this.f3263a = componentCallbacks2C0558c;
        this.f3265c = interfaceC2859kg;
        this.f3267e = interfaceC3084pg;
        this.f3266d = c3126qg;
        this.f3264b = context;
        this.f3271i = interfaceC2512gg.mo11999a(context.getApplicationContext(), new b(c3126qg));
        if (C2861ki.m13730b()) {
            this.f3270h.post(this.f3269g);
        } else {
            interfaceC2859kg.mo11366a(this);
        }
        interfaceC2859kg.mo11366a(this.f3271i);
        this.f3272j = new CopyOnWriteArrayList<>(componentCallbacks2C0558c.m3880f().m3888b());
        m3932a(componentCallbacks2C0558c.m3880f().m3889c());
        componentCallbacks2C0558c.m3873a(this);
    }

    /* renamed from: c */
    private void m3928c(InterfaceC3262th<?> interfaceC3262th) {
        if (m3937b(interfaceC3262th) || this.f3263a.m3874a(interfaceC3262th) || interfaceC3262th.mo14107c() == null) {
            return;
        }
        InterfaceC2473fh mo14107c = interfaceC3262th.mo14107c();
        interfaceC3262th.mo14105a((InterfaceC2473fh) null);
        mo14107c.clear();
    }

    /* renamed from: a */
    public <ResourceType> C0564i<ResourceType> m3929a(Class<ResourceType> cls) {
        return new C0564i<>(this.f3263a, this, cls, this.f3264b);
    }

    /* renamed from: a */
    public C0564i<Drawable> m3930a(String str) {
        C0564i<Drawable> m3940f = m3940f();
        m3940f.m3924a(str);
        return m3940f;
    }

    @Override // p000.InterfaceC2896lg
    /* renamed from: a */
    public synchronized void mo3931a() {
        m3944j();
        this.f3268f.mo3931a();
    }

    /* renamed from: a */
    protected synchronized void m3932a(C2595ih c2595ih) {
        C2595ih mo16979clone = c2595ih.mo16979clone();
        mo16979clone.m11387a();
        this.f3273k = mo16979clone;
    }

    /* renamed from: a */
    public synchronized void m3933a(InterfaceC3262th<?> interfaceC3262th) {
        if (interfaceC3262th == null) {
            return;
        }
        m3928c(interfaceC3262th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m3934a(InterfaceC3262th<?> interfaceC3262th, InterfaceC2473fh interfaceC2473fh) {
        this.f3268f.m15431a(interfaceC3262th);
        this.f3266d.m15093b(interfaceC2473fh);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> AbstractC0566k<?, T> m3935b(Class<T> cls) {
        return this.f3263a.m3880f().m3886a(cls);
    }

    @Override // p000.InterfaceC2896lg
    /* renamed from: b */
    public synchronized void mo3936b() {
        m3943i();
        this.f3268f.mo3936b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized boolean m3937b(InterfaceC3262th<?> interfaceC3262th) {
        InterfaceC2473fh mo14107c = interfaceC3262th.mo14107c();
        if (mo14107c == null) {
            return true;
        }
        if (!this.f3266d.m15091a(mo14107c)) {
            return false;
        }
        this.f3268f.m15432b(interfaceC3262th);
        interfaceC3262th.mo14105a((InterfaceC2473fh) null);
        return true;
    }

    @Override // p000.InterfaceC2896lg
    /* renamed from: d */
    public synchronized void mo3938d() {
        this.f3268f.mo3938d();
        Iterator<InterfaceC3262th<?>> it = this.f3268f.m15434f().iterator();
        while (it.hasNext()) {
            m3933a(it.next());
        }
        this.f3268f.m15433e();
        this.f3266d.m15090a();
        this.f3265c.mo11368b(this);
        this.f3265c.mo11368b(this.f3271i);
        this.f3270h.removeCallbacks(this.f3269g);
        this.f3263a.m3876b(this);
    }

    /* renamed from: e */
    public C0564i<Bitmap> m3939e() {
        return m3929a(Bitmap.class).mo3921a((AbstractC2389dh<?>) f3262l);
    }

    /* renamed from: f */
    public C0564i<Drawable> m3940f() {
        return m3929a(Drawable.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public List<InterfaceC2553hh<Object>> m3941g() {
        return this.f3272j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public synchronized C2595ih m3942h() {
        return this.f3273k;
    }

    /* renamed from: i */
    public synchronized void m3943i() {
        this.f3266d.m15092b();
    }

    /* renamed from: j */
    public synchronized void m3944j() {
        this.f3266d.m15095d();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f3266d + ", treeNode=" + this.f3267e + "}";
    }
}
