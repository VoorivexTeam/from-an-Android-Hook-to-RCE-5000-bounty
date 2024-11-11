package defpackage;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.s;

/* loaded from: classes.dex */
public final class vr implements a.d.f {
    public static final vr k;
    private final boolean b = false;
    private final boolean c = false;
    private final String d = null;
    private final boolean e = false;
    private final boolean h = false;
    private final String f = null;
    private final String g = null;
    private final Long i = null;
    private final Long j = null;

    /* loaded from: classes.dex */
    public static final class a {
    }

    static {
        new a();
        k = new vr(false, false, null, false, null, null, false, null, null);
    }

    private vr(boolean z, boolean z2, String str, boolean z3, String str2, String str3, boolean z4, Long l, Long l2) {
    }

    public final Long a() {
        return this.i;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.g;
    }

    public final Long e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vr)) {
            return false;
        }
        vr vrVar = (vr) obj;
        return this.b == vrVar.b && this.c == vrVar.c && s.a(this.d, vrVar.d) && this.e == vrVar.e && this.h == vrVar.h && s.a(this.f, vrVar.f) && s.a(this.g, vrVar.g) && s.a(this.i, vrVar.i) && s.a(this.j, vrVar.j);
    }

    public final String f() {
        return this.d;
    }

    public final boolean g() {
        return this.e;
    }

    public final boolean h() {
        return this.c;
    }

    public final int hashCode() {
        return s.a(Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.h), this.f, this.g, this.i, this.j);
    }

    public final boolean j() {
        return this.b;
    }

    public final boolean k() {
        return this.h;
    }
}
