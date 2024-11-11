package p000;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class fb0<T> {

    /* renamed from: a */
    private final i80 f10115a;

    /* renamed from: b */
    @Nullable
    private final T f10116b;

    /* renamed from: c */
    @Nullable
    private final j80 f10117c;

    private fb0(i80 i80Var, @Nullable T t, @Nullable j80 j80Var) {
        this.f10115a = i80Var;
        this.f10116b = t;
        this.f10117c = j80Var;
    }

    /* renamed from: a */
    public static <T> fb0<T> m11749a(j80 j80Var, i80 i80Var) {
        ib0.m12428a(j80Var, "body == null");
        ib0.m12428a(i80Var, "rawResponse == null");
        if (i80Var.m12392h()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new fb0<>(i80Var, null, j80Var);
    }

    /* renamed from: a */
    public static <T> fb0<T> m11750a(@Nullable T t, i80 i80Var) {
        ib0.m12428a(i80Var, "rawResponse == null");
        if (i80Var.m12392h()) {
            return new fb0<>(i80Var, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @Nullable
    /* renamed from: a */
    public T m11751a() {
        return this.f10116b;
    }

    /* renamed from: b */
    public int m11752b() {
        return this.f10115a.m12389d();
    }

    @Nullable
    /* renamed from: c */
    public j80 m11753c() {
        return this.f10117c;
    }

    /* renamed from: d */
    public y70 m11754d() {
        return this.f10115a.m12391f();
    }

    /* renamed from: e */
    public boolean m11755e() {
        return this.f10115a.m12392h();
    }

    /* renamed from: f */
    public String m11756f() {
        return this.f10115a.m12393i();
    }

    /* renamed from: g */
    public i80 m11757g() {
        return this.f10115a;
    }

    public String toString() {
        return this.f10115a.toString();
    }
}
