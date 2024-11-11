package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.C0859a.d;
import com.google.android.gms.common.internal.C1050s;

/* renamed from: com.google.android.gms.common.api.internal.b */
/* loaded from: classes.dex */
public final class C0875b<O extends C0859a.d> {

    /* renamed from: a */
    private final boolean f5739a;

    /* renamed from: b */
    private final int f5740b;

    /* renamed from: c */
    private final C0859a<O> f5741c;

    /* renamed from: d */
    private final O f5742d;

    private C0875b(C0859a<O> c0859a) {
        this.f5739a = true;
        this.f5741c = c0859a;
        this.f5742d = null;
        this.f5740b = System.identityHashCode(this);
    }

    private C0875b(C0859a<O> c0859a, O o) {
        this.f5739a = false;
        this.f5741c = c0859a;
        this.f5742d = o;
        this.f5740b = C1050s.m7203a(c0859a, o);
    }

    /* renamed from: a */
    public static <O extends C0859a.d> C0875b<O> m6615a(C0859a<O> c0859a) {
        return new C0875b<>(c0859a);
    }

    /* renamed from: a */
    public static <O extends C0859a.d> C0875b<O> m6616a(C0859a<O> c0859a, O o) {
        return new C0875b<>(c0859a, o);
    }

    /* renamed from: a */
    public final String m6617a() {
        return this.f5741c.m6503b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0875b)) {
            return false;
        }
        C0875b c0875b = (C0875b) obj;
        return !this.f5739a && !c0875b.f5739a && C1050s.m7205a(this.f5741c, c0875b.f5741c) && C1050s.m7205a(this.f5742d, c0875b.f5742d);
    }

    public final int hashCode() {
        return this.f5740b;
    }
}
