package com.google.android.gms.common.api.internal;

import java.util.Map;
import p000.AbstractC2871ks;
import p000.C2908ls;
import p000.InterfaceC2484fs;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [TResult] */
/* renamed from: com.google.android.gms.common.api.internal.v */
/* loaded from: classes.dex */
public final class C0959v<TResult> implements InterfaceC2484fs<TResult> {

    /* renamed from: a */
    private final /* synthetic */ C2908ls f5977a;

    /* renamed from: b */
    private final /* synthetic */ C0874a3 f5978b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0959v(C0874a3 c0874a3, C2908ls c2908ls) {
        this.f5978b = c0874a3;
        this.f5977a = c2908ls;
    }

    @Override // p000.InterfaceC2484fs
    /* renamed from: a */
    public final void mo5523a(AbstractC2871ks<TResult> abstractC2871ks) {
        Map map;
        map = this.f5978b.f5738b;
        map.remove(this.f5977a);
    }
}
