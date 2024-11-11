package com.google.android.gms.auth.api.signin.internal;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
/* loaded from: classes.dex */
public class C0833a {

    /* renamed from: b */
    private static int f5636b = 31;

    /* renamed from: a */
    private int f5637a = 1;

    /* renamed from: a */
    public int m6438a() {
        return this.f5637a;
    }

    /* renamed from: a */
    public C0833a m6439a(Object obj) {
        this.f5637a = (f5636b * this.f5637a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: a */
    public final C0833a m6440a(boolean z) {
        this.f5637a = (f5636b * this.f5637a) + (z ? 1 : 0);
        return this;
    }
}
