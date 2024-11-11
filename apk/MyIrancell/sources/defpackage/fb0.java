package defpackage;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class fb0<T> {
    private final i80 a;

    @Nullable
    private final T b;

    @Nullable
    private final j80 c;

    private fb0(i80 i80Var, @Nullable T t, @Nullable j80 j80Var) {
        this.a = i80Var;
        this.b = t;
        this.c = j80Var;
    }

    public static <T> fb0<T> a(j80 j80Var, i80 i80Var) {
        ib0.a(j80Var, "body == null");
        ib0.a(i80Var, "rawResponse == null");
        if (i80Var.h()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new fb0<>(i80Var, null, j80Var);
    }

    public static <T> fb0<T> a(@Nullable T t, i80 i80Var) {
        ib0.a(i80Var, "rawResponse == null");
        if (i80Var.h()) {
            return new fb0<>(i80Var, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @Nullable
    public T a() {
        return this.b;
    }

    public int b() {
        return this.a.d();
    }

    @Nullable
    public j80 c() {
        return this.c;
    }

    public y70 d() {
        return this.a.f();
    }

    public boolean e() {
        return this.a.h();
    }

    public String f() {
        return this.a.i();
    }

    public i80 g() {
        return this.a;
    }

    public String toString() {
        return this.a.toString();
    }
}
