package com.google.firebase.components;

/* renamed from: com.google.firebase.components.n */
/* loaded from: classes.dex */
public final class C2066n {

    /* renamed from: a */
    private final Class<?> f8837a;

    /* renamed from: b */
    private final int f8838b;

    /* renamed from: c */
    private final int f8839c;

    private C2066n(Class<?> cls, int i, int i2) {
        C2073u.m10585a(cls, "Null dependency anInterface.");
        this.f8837a = cls;
        this.f8838b = i;
        this.f8839c = i2;
    }

    /* renamed from: a */
    public static C2066n m10570a(Class<?> cls) {
        return new C2066n(cls, 0, 0);
    }

    /* renamed from: b */
    public static C2066n m10571b(Class<?> cls) {
        return new C2066n(cls, 1, 0);
    }

    /* renamed from: c */
    public static C2066n m10572c(Class<?> cls) {
        return new C2066n(cls, 2, 0);
    }

    /* renamed from: a */
    public Class<?> m10573a() {
        return this.f8837a;
    }

    /* renamed from: b */
    public boolean m10574b() {
        return this.f8839c == 0;
    }

    /* renamed from: c */
    public boolean m10575c() {
        return this.f8838b == 1;
    }

    /* renamed from: d */
    public boolean m10576d() {
        return this.f8838b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2066n)) {
            return false;
        }
        C2066n c2066n = (C2066n) obj;
        return this.f8837a == c2066n.f8837a && this.f8838b == c2066n.f8838b && this.f8839c == c2066n.f8839c;
    }

    public int hashCode() {
        return ((((this.f8837a.hashCode() ^ 1000003) * 1000003) ^ this.f8838b) * 1000003) ^ this.f8839c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f8837a);
        sb.append(", type=");
        int i = this.f8838b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", direct=");
        sb.append(this.f8839c == 0);
        sb.append("}");
        return sb.toString();
    }
}
