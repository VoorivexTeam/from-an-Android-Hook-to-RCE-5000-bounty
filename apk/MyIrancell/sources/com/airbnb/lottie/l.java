package com.airbnb.lottie;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l<V> {
    private final V a;
    private final Throwable b;

    public l(V v) {
        this.a = v;
        this.b = null;
    }

    public l(Throwable th) {
        this.b = th;
        this.a = null;
    }

    public Throwable a() {
        return this.b;
    }

    public V b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (b() != null && b().equals(lVar.b())) {
            return true;
        }
        if (a() == null || lVar.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }
}
