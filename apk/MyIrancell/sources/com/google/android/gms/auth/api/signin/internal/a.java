package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes.dex */
public class a {
    private static int b = 31;
    private int a = 1;

    public int a() {
        return this.a;
    }

    public a a(Object obj) {
        this.a = (b * this.a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public final a a(boolean z) {
        this.a = (b * this.a) + (z ? 1 : 0);
        return this;
    }
}
