package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class g2<T> implements Serializable {
    public static <T> g2<T> a(T t) {
        j2.a(t);
        return new i2(t);
    }

    public static <T> g2<T> c() {
        return e2.b;
    }

    public abstract boolean a();

    public abstract T b();
}
