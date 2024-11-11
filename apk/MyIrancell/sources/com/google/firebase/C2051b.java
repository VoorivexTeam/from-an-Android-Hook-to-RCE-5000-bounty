package com.google.firebase;

import android.content.Context;
import p000.InterfaceC2789iv;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C2051b implements InterfaceC2789iv {

    /* renamed from: a */
    private final C2052c f8789a;

    /* renamed from: b */
    private final Context f8790b;

    private C2051b(C2052c c2052c, Context context) {
        this.f8789a = c2052c;
        this.f8790b = context;
    }

    /* renamed from: a */
    public static InterfaceC2789iv m10489a(C2052c c2052c, Context context) {
        return new C2051b(c2052c, context);
    }

    @Override // p000.InterfaceC2789iv
    public Object get() {
        return C2052c.m10494a(this.f8789a, this.f8790b);
    }
}
