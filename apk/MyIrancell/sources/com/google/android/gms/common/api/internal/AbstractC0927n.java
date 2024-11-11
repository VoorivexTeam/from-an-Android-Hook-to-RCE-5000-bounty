package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.C0859a.b;
import com.google.android.gms.common.api.internal.C0915k;
import p000.C2908ls;

/* renamed from: com.google.android.gms.common.api.internal.n */
/* loaded from: classes.dex */
public abstract class AbstractC0927n<A extends C0859a.b, L> {

    /* renamed from: a */
    private final C0915k<L> f5898a;

    /* renamed from: b */
    private final Feature[] f5899b = null;

    /* renamed from: c */
    private final boolean f5900c = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0927n(C0915k<L> c0915k) {
        this.f5898a = c0915k;
    }

    /* renamed from: a */
    public void m6815a() {
        this.f5898a.m6787a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6816a(A a, C2908ls<Void> c2908ls);

    /* renamed from: b */
    public C0915k.a<L> m6817b() {
        return this.f5898a.m6789b();
    }

    /* renamed from: c */
    public Feature[] m6818c() {
        return this.f5899b;
    }

    /* renamed from: d */
    public final boolean m6819d() {
        return this.f5900c;
    }
}
