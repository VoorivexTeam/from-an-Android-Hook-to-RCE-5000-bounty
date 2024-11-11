package com.bumptech.glide;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p000.C0500c0;
import p000.C2468fc;
import p000.C2594ig;
import p000.C2595ih;
import p000.C2810jc;
import p000.C2854kb;
import p000.C2855kc;
import p000.C3034og;
import p000.C3257tc;
import p000.C3301uc;
import p000.C3393wc;
import p000.ExecutorServiceC3482yc;
import p000.InterfaceC0475bc;
import p000.InterfaceC2427ec;
import p000.InterfaceC2512gg;
import p000.InterfaceC2553hh;
import p000.InterfaceC3030oc;
import p000.InterfaceC3354vc;

/* renamed from: com.bumptech.glide.d */
/* loaded from: classes.dex */
public final class C0559d {

    /* renamed from: b */
    private C2854kb f3211b;

    /* renamed from: c */
    private InterfaceC2427ec f3212c;

    /* renamed from: d */
    private InterfaceC0475bc f3213d;

    /* renamed from: e */
    private InterfaceC3354vc f3214e;

    /* renamed from: f */
    private ExecutorServiceC3482yc f3215f;

    /* renamed from: g */
    private ExecutorServiceC3482yc f3216g;

    /* renamed from: h */
    private InterfaceC3030oc.a f3217h;

    /* renamed from: i */
    private C3393wc f3218i;

    /* renamed from: j */
    private InterfaceC2512gg f3219j;

    /* renamed from: m */
    private C3034og.b f3222m;

    /* renamed from: n */
    private ExecutorServiceC3482yc f3223n;

    /* renamed from: o */
    private boolean f3224o;

    /* renamed from: p */
    private List<InterfaceC2553hh<Object>> f3225p;

    /* renamed from: q */
    private boolean f3226q;

    /* renamed from: a */
    private final Map<Class<?>, AbstractC0566k<?, ?>> f3210a = new C0500c0();

    /* renamed from: k */
    private int f3220k = 4;

    /* renamed from: l */
    private C2595ih f3221l = new C2595ih();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ComponentCallbacks2C0558c m3883a(Context context) {
        if (this.f3215f == null) {
            this.f3215f = ExecutorServiceC3482yc.m16623d();
        }
        if (this.f3216g == null) {
            this.f3216g = ExecutorServiceC3482yc.m16622c();
        }
        if (this.f3223n == null) {
            this.f3223n = ExecutorServiceC3482yc.m16620b();
        }
        if (this.f3218i == null) {
            this.f3218i = new C3393wc.a(context).m16205a();
        }
        if (this.f3219j == null) {
            this.f3219j = new C2594ig();
        }
        if (this.f3212c == null) {
            int m16203b = this.f3218i.m16203b();
            if (m16203b > 0) {
                this.f3212c = new C2855kc(m16203b);
            } else {
                this.f3212c = new C2468fc();
            }
        }
        if (this.f3213d == null) {
            this.f3213d = new C2810jc(this.f3218i.m16202a());
        }
        if (this.f3214e == null) {
            this.f3214e = new C3301uc(this.f3218i.m16204c());
        }
        if (this.f3217h == null) {
            this.f3217h = new C3257tc(context);
        }
        if (this.f3211b == null) {
            this.f3211b = new C2854kb(this.f3214e, this.f3217h, this.f3216g, this.f3215f, ExecutorServiceC3482yc.m16624e(), ExecutorServiceC3482yc.m16620b(), this.f3224o);
        }
        List<InterfaceC2553hh<Object>> list = this.f3225p;
        this.f3225p = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        C3034og c3034og = new C3034og(this.f3222m);
        C2854kb c2854kb = this.f3211b;
        InterfaceC3354vc interfaceC3354vc = this.f3214e;
        InterfaceC2427ec interfaceC2427ec = this.f3212c;
        InterfaceC0475bc interfaceC0475bc = this.f3213d;
        InterfaceC2512gg interfaceC2512gg = this.f3219j;
        int i = this.f3220k;
        C2595ih c2595ih = this.f3221l;
        c2595ih.m11383G();
        return new ComponentCallbacks2C0558c(context, c2854kb, interfaceC3354vc, interfaceC2427ec, interfaceC0475bc, c3034og, interfaceC2512gg, i, c2595ih, this.f3210a, this.f3225p, this.f3226q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3884a(C3034og.b bVar) {
        this.f3222m = bVar;
    }
}
