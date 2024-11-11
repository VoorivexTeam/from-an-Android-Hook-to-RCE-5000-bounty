package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ia extends ja {
    private com.google.android.gms.internal.measurement.g0 g;
    private final /* synthetic */ ca h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(ca caVar, String str, int i, com.google.android.gms.internal.measurement.g0 g0Var) {
        super(str, i);
        this.h = caVar;
        this.g = g0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.ja
    public final int a() {
        return this.g.p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(Long l, Long l2, com.google.android.gms.internal.measurement.b1 b1Var, boolean z) {
        h4 w;
        String c;
        String str;
        Boolean a;
        boolean d = this.h.m().d(this.a, o.l0);
        boolean d2 = this.h.m().d(this.a, o.r0);
        boolean z2 = com.google.android.gms.internal.measurement.q9.a() && this.h.m().d(this.a, o.u0);
        boolean s = this.g.s();
        boolean t = this.g.t();
        boolean z3 = d && this.g.v();
        boolean z4 = s || t || z3;
        Boolean bool = null;
        bool = null;
        if (z && !z4) {
            this.h.k().B().a("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), this.g.zza() ? Integer.valueOf(this.g.p()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.e0 r = this.g.r();
        boolean t2 = r.t();
        if (b1Var.t()) {
            if (r.q()) {
                a = ja.a(b1Var.u(), r.r());
                bool = ja.a(a, t2);
            } else {
                w = this.h.k().w();
                c = this.h.f().c(b1Var.q());
                str = "No number filter for long property. property";
                w.a(str, c);
            }
        } else if (!b1Var.v()) {
            if (b1Var.r()) {
                if (r.zza()) {
                    a = ja.a(b1Var.s(), r.p(), this.h.k());
                } else if (!r.q()) {
                    w = this.h.k().w();
                    c = this.h.f().c(b1Var.q());
                    str = "No string or number filter defined. property";
                } else if (v9.a(b1Var.s())) {
                    a = ja.a(b1Var.s(), r.r());
                } else {
                    this.h.k().w().a("Invalid user property value for Numeric number filter. property, value", this.h.f().c(b1Var.q()), b1Var.s());
                }
                bool = ja.a(a, t2);
            } else {
                w = this.h.k().w();
                c = this.h.f().c(b1Var.q());
                str = "User property has no value, property";
            }
            w.a(str, c);
        } else if (r.q()) {
            a = ja.a(b1Var.w(), r.r());
            bool = ja.a(a, t2);
        } else {
            w = this.h.k().w();
            c = this.h.f().c(b1Var.q());
            str = "No number filter for double property. property";
            w.a(str, c);
        }
        this.h.k().B().a("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.c = true;
        if (d && z3 && !bool.booleanValue()) {
            return true;
        }
        if (!z || this.g.s()) {
            this.d = bool;
        }
        if (bool.booleanValue() && z4 && b1Var.zza()) {
            long p = b1Var.p();
            if (d2 && l != null) {
                p = l.longValue();
            }
            if (z2 && this.g.s() && !this.g.t() && l2 != null) {
                p = l2.longValue();
            }
            if (this.g.t()) {
                this.f = Long.valueOf(p);
            } else {
                this.e = Long.valueOf(p);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.ja
    public final boolean b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.ja
    public final boolean c() {
        return false;
    }
}
