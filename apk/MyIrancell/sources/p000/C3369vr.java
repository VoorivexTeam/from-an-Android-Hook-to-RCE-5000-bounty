package p000;

import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.internal.C1050s;

/* renamed from: vr */
/* loaded from: classes.dex */
public final class C3369vr implements C0859a.d.f {

    /* renamed from: k */
    public static final C3369vr f13705k;

    /* renamed from: b */
    private final boolean f13706b = false;

    /* renamed from: c */
    private final boolean f13707c = false;

    /* renamed from: d */
    private final String f13708d = null;

    /* renamed from: e */
    private final boolean f13709e = false;

    /* renamed from: h */
    private final boolean f13712h = false;

    /* renamed from: f */
    private final String f13710f = null;

    /* renamed from: g */
    private final String f13711g = null;

    /* renamed from: i */
    private final Long f13713i = null;

    /* renamed from: j */
    private final Long f13714j = null;

    /* renamed from: vr$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    static {
        new a();
        f13705k = new C3369vr(false, false, null, false, null, null, false, null, null);
    }

    private C3369vr(boolean z, boolean z2, String str, boolean z3, String str2, String str3, boolean z4, Long l, Long l2) {
    }

    /* renamed from: a */
    public final Long m16045a() {
        return this.f13713i;
    }

    /* renamed from: b */
    public final String m16046b() {
        return this.f13710f;
    }

    /* renamed from: c */
    public final String m16047c() {
        return this.f13711g;
    }

    /* renamed from: e */
    public final Long m16048e() {
        return this.f13714j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3369vr)) {
            return false;
        }
        C3369vr c3369vr = (C3369vr) obj;
        return this.f13706b == c3369vr.f13706b && this.f13707c == c3369vr.f13707c && C1050s.m7205a(this.f13708d, c3369vr.f13708d) && this.f13709e == c3369vr.f13709e && this.f13712h == c3369vr.f13712h && C1050s.m7205a(this.f13710f, c3369vr.f13710f) && C1050s.m7205a(this.f13711g, c3369vr.f13711g) && C1050s.m7205a(this.f13713i, c3369vr.f13713i) && C1050s.m7205a(this.f13714j, c3369vr.f13714j);
    }

    /* renamed from: f */
    public final String m16049f() {
        return this.f13708d;
    }

    /* renamed from: g */
    public final boolean m16050g() {
        return this.f13709e;
    }

    /* renamed from: h */
    public final boolean m16051h() {
        return this.f13707c;
    }

    public final int hashCode() {
        return C1050s.m7203a(Boolean.valueOf(this.f13706b), Boolean.valueOf(this.f13707c), this.f13708d, Boolean.valueOf(this.f13709e), Boolean.valueOf(this.f13712h), this.f13710f, this.f13711g, this.f13713i, this.f13714j);
    }

    /* renamed from: j */
    public final boolean m16052j() {
        return this.f13706b;
    }

    /* renamed from: k */
    public final boolean m16053k() {
        return this.f13712h;
    }
}
