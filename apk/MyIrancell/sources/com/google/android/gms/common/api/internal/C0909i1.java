package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.C0859a.d;
import com.google.android.gms.common.api.C0863e;
import com.google.android.gms.common.api.InterfaceC0982m;

/* renamed from: com.google.android.gms.common.api.internal.i1 */
/* loaded from: classes.dex */
public final class C0909i1<O extends C0859a.d> extends C0871a0 {

    /* renamed from: c */
    private final C0863e<O> f5863c;

    public C0909i1(C0863e<O> c0863e) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f5863c = c0863e;
    }

    @Override // com.google.android.gms.common.api.AbstractC0864f
    /* renamed from: a */
    public final <A extends C0859a.b, R extends InterfaceC0982m, T extends AbstractC0885d<R, A>> T mo6552a(T t) {
        this.f5863c.m6535a((C0863e<O>) t);
        return t;
    }

    @Override // com.google.android.gms.common.api.AbstractC0864f
    /* renamed from: a */
    public final void mo6554a(C0965w1 c0965w1) {
    }

    @Override // com.google.android.gms.common.api.AbstractC0864f
    /* renamed from: b */
    public final <A extends C0859a.b, T extends AbstractC0885d<? extends InterfaceC0982m, A>> T mo6558b(T t) {
        this.f5863c.m6541b(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.AbstractC0864f
    /* renamed from: e */
    public final Context mo6562e() {
        return this.f5863c.m6544e();
    }

    @Override // com.google.android.gms.common.api.AbstractC0864f
    /* renamed from: f */
    public final Looper mo6563f() {
        return this.f5863c.m6546g();
    }
}
