package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.C0859a.d;
import com.google.android.gms.common.api.C0863e;
import com.google.android.gms.common.api.internal.C0899g;
import com.google.android.gms.common.internal.C1022e;
import p000.C3369vr;
import p000.InterfaceC3497yr;

/* renamed from: com.google.android.gms.common.api.internal.x2 */
/* loaded from: classes.dex */
public final class C0970x2<O extends C0859a.d> extends C0863e<O> {

    /* renamed from: j */
    private final C0859a.f f6014j;

    /* renamed from: k */
    private final C0942q2 f6015k;

    /* renamed from: l */
    private final C1022e f6016l;

    /* renamed from: m */
    private final C0859a.a<? extends InterfaceC3497yr, C3369vr> f6017m;

    public C0970x2(Context context, C0859a<O> c0859a, Looper looper, C0859a.f fVar, C0942q2 c0942q2, C1022e c1022e, C0859a.a<? extends InterfaceC3497yr, C3369vr> aVar) {
        super(context, c0859a, looper);
        this.f6014j = fVar;
        this.f6015k = c0942q2;
        this.f6016l = c1022e;
        this.f6017m = aVar;
        this.f5690i.m6714a(this);
    }

    @Override // com.google.android.gms.common.api.C0863e
    /* renamed from: a */
    public final C0859a.f mo6533a(Looper looper, C0899g.a<O> aVar) {
        this.f6015k.m6847a(aVar);
        return this.f6014j;
    }

    @Override // com.google.android.gms.common.api.C0863e
    /* renamed from: a */
    public final BinderC0953t1 mo6536a(Context context, Handler handler) {
        return new BinderC0953t1(context, handler, this.f6016l, this.f6017m);
    }

    /* renamed from: h */
    public final C0859a.f m6924h() {
        return this.f6014j;
    }
}
