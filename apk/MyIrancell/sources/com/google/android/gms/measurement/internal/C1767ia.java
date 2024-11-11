package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1208b1;
import com.google.android.gms.internal.measurement.C1252e0;
import com.google.android.gms.internal.measurement.C1282g0;
import com.google.android.gms.internal.measurement.C1439q9;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ia */
/* loaded from: classes.dex */
public final class C1767ia extends AbstractC1779ja {

    /* renamed from: g */
    private C1282g0 f7638g;

    /* renamed from: h */
    private final /* synthetic */ C1695ca f7639h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1767ia(C1695ca c1695ca, String str, int i, C1282g0 c1282g0) {
        super(str, i);
        this.f7639h = c1695ca;
        this.f7638g = c1282g0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC1779ja
    /* renamed from: a */
    public final int mo9357a() {
        return this.f7638g.m7838p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m9382a(Long l, Long l2, C1208b1 c1208b1, boolean z) {
        C1749h4 m9312w;
        String m9122c;
        String str;
        Boolean m9449a;
        boolean m9486d = this.f7639h.m9326m().m9486d(this.f7688a, C1828o.f7873l0);
        boolean m9486d2 = this.f7639h.m9326m().m9486d(this.f7688a, C1828o.f7885r0);
        boolean z2 = C1439q9.m8248a() && this.f7639h.m9326m().m9486d(this.f7688a, C1828o.f7891u0);
        boolean m7841s = this.f7638g.m7841s();
        boolean m7842t = this.f7638g.m7842t();
        boolean z3 = m9486d && this.f7638g.m7844v();
        boolean z4 = m7841s || m7842t || z3;
        Boolean bool = null;
        bool = null;
        if (z && !z4) {
            this.f7639h.mo9324k().m9304B().m9367a("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f7689b), this.f7638g.zza() ? Integer.valueOf(this.f7638g.m7838p()) : null);
            return true;
        }
        C1252e0 m7840r = this.f7638g.m7840r();
        boolean m7781t = m7840r.m7781t();
        if (c1208b1.m7563t()) {
            if (m7840r.m7778q()) {
                m9449a = AbstractC1779ja.m9445a(c1208b1.m7564u(), m7840r.m7779r());
                bool = AbstractC1779ja.m9446a(m9449a, m7781t);
            } else {
                m9312w = this.f7639h.mo9324k().m9312w();
                m9122c = this.f7639h.m9319f().m9122c(c1208b1.m7560q());
                str = "No number filter for long property. property";
                m9312w.m9366a(str, m9122c);
            }
        } else if (!c1208b1.m7565v()) {
            if (c1208b1.m7561r()) {
                if (m7840r.zza()) {
                    m9449a = AbstractC1779ja.m9449a(c1208b1.m7562s(), m7840r.m7777p(), this.f7639h.mo9324k());
                } else if (!m7840r.m7778q()) {
                    m9312w = this.f7639h.mo9324k().m9312w();
                    m9122c = this.f7639h.m9319f().m9122c(c1208b1.m7560q());
                    str = "No string or number filter defined. property";
                } else if (C1915v9.m9821a(c1208b1.m7562s())) {
                    m9449a = AbstractC1779ja.m9447a(c1208b1.m7562s(), m7840r.m7779r());
                } else {
                    this.f7639h.mo9324k().m9312w().m9367a("Invalid user property value for Numeric number filter. property, value", this.f7639h.m9319f().m9122c(c1208b1.m7560q()), c1208b1.m7562s());
                }
                bool = AbstractC1779ja.m9446a(m9449a, m7781t);
            } else {
                m9312w = this.f7639h.mo9324k().m9312w();
                m9122c = this.f7639h.m9319f().m9122c(c1208b1.m7560q());
                str = "User property has no value, property";
            }
            m9312w.m9366a(str, m9122c);
        } else if (m7840r.m7778q()) {
            m9449a = AbstractC1779ja.m9444a(c1208b1.m7566w(), m7840r.m7779r());
            bool = AbstractC1779ja.m9446a(m9449a, m7781t);
        } else {
            m9312w = this.f7639h.mo9324k().m9312w();
            m9122c = this.f7639h.m9319f().m9122c(c1208b1.m7560q());
            str = "No number filter for double property. property";
            m9312w.m9366a(str, m9122c);
        }
        this.f7639h.mo9324k().m9304B().m9366a("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f7690c = true;
        if (m9486d && z3 && !bool.booleanValue()) {
            return true;
        }
        if (!z || this.f7638g.m7841s()) {
            this.f7691d = bool;
        }
        if (bool.booleanValue() && z4 && c1208b1.zza()) {
            long m7559p = c1208b1.m7559p();
            if (m9486d2 && l != null) {
                m7559p = l.longValue();
            }
            if (z2 && this.f7638g.m7841s() && !this.f7638g.m7842t() && l2 != null) {
                m7559p = l2.longValue();
            }
            if (this.f7638g.m7842t()) {
                this.f7693f = Long.valueOf(m7559p);
            } else {
                this.f7692e = Long.valueOf(m7559p);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC1779ja
    /* renamed from: b */
    public final boolean mo9359b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC1779ja
    /* renamed from: c */
    public final boolean mo9360c() {
        return false;
    }
}
