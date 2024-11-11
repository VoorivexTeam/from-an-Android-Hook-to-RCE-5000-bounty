package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public class f5 {
    private volatile x5 a;
    private volatile h3 b;

    static {
        a4.a();
    }

    private final x5 b(x5 x5Var) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = x5Var;
                        this.b = h3.c;
                    } catch (w4 unused) {
                        this.a = x5Var;
                        this.b = h3.c;
                    }
                }
            }
        }
        return this.a;
    }

    public final int a() {
        if (this.b != null) {
            return this.b.zza();
        }
        if (this.a != null) {
            return this.a.c();
        }
        return 0;
    }

    public final x5 a(x5 x5Var) {
        x5 x5Var2 = this.a;
        this.b = null;
        this.a = x5Var;
        return x5Var2;
    }

    public final h3 b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            this.b = this.a == null ? h3.c : this.a.h();
            return this.b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj;
        x5 x5Var = this.a;
        x5 x5Var2 = f5Var.a;
        return (x5Var == null && x5Var2 == null) ? b().equals(f5Var.b()) : (x5Var == null || x5Var2 == null) ? x5Var != null ? x5Var.equals(f5Var.b(x5Var.b())) : b(x5Var2.b()).equals(x5Var2) : x5Var.equals(x5Var2);
    }

    public int hashCode() {
        return 1;
    }
}
