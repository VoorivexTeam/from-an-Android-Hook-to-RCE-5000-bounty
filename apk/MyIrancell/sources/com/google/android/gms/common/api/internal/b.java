package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;

/* loaded from: classes.dex */
public final class b<O extends a.d> {
    private final boolean a;
    private final int b;
    private final com.google.android.gms.common.api.a<O> c;
    private final O d;

    private b(com.google.android.gms.common.api.a<O> aVar) {
        this.a = true;
        this.c = aVar;
        this.d = null;
        this.b = System.identityHashCode(this);
    }

    private b(com.google.android.gms.common.api.a<O> aVar, O o) {
        this.a = false;
        this.c = aVar;
        this.d = o;
        this.b = com.google.android.gms.common.internal.s.a(aVar, o);
    }

    public static <O extends a.d> b<O> a(com.google.android.gms.common.api.a<O> aVar) {
        return new b<>(aVar);
    }

    public static <O extends a.d> b<O> a(com.google.android.gms.common.api.a<O> aVar, O o) {
        return new b<>(aVar, o);
    }

    public final String a() {
        return this.c.b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return !this.a && !bVar.a && com.google.android.gms.common.internal.s.a(this.c, bVar.c) && com.google.android.gms.common.internal.s.a(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.b;
    }
}
