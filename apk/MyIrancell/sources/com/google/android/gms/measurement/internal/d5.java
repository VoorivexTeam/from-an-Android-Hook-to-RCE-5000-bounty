package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.o0;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class d5 extends p9 implements na {
    private static int j = 65535;
    private static int k = 2;
    private final Map<String, Map<String, String>> d;
    private final Map<String, Map<String, Boolean>> e;
    private final Map<String, Map<String, Boolean>> f;
    private final Map<String, com.google.android.gms.internal.measurement.o0> g;
    private final Map<String, Map<String, Integer>> h;
    private final Map<String, String> i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d5(o9 o9Var) {
        super(o9Var);
        this.d = new defpackage.c0();
        this.e = new defpackage.c0();
        this.f = new defpackage.c0();
        this.g = new defpackage.c0();
        this.i = new defpackage.c0();
        this.h = new defpackage.c0();
    }

    private final com.google.android.gms.internal.measurement.o0 a(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.o0.x();
        }
        try {
            o0.a w = com.google.android.gms.internal.measurement.o0.w();
            v9.a(w, bArr);
            com.google.android.gms.internal.measurement.o0 o0Var = (com.google.android.gms.internal.measurement.o0) ((com.google.android.gms.internal.measurement.o4) w.i());
            k().B().a("Parsed config. version, gmp_app_id", o0Var.zza() ? Long.valueOf(o0Var.p()) : null, o0Var.q() ? o0Var.r() : null);
            return o0Var;
        } catch (com.google.android.gms.internal.measurement.w4 | RuntimeException e) {
            k().w().a("Unable to merge remote config. appId", f4.a(str), e);
            return com.google.android.gms.internal.measurement.o0.x();
        }
    }

    private static Map<String, String> a(com.google.android.gms.internal.measurement.o0 o0Var) {
        defpackage.c0 c0Var = new defpackage.c0();
        if (o0Var != null) {
            for (com.google.android.gms.internal.measurement.p0 p0Var : o0Var.s()) {
                c0Var.put(p0Var.zza(), p0Var.p());
            }
        }
        return c0Var;
    }

    private final void a(String str, o0.a aVar) {
        defpackage.c0 c0Var = new defpackage.c0();
        defpackage.c0 c0Var2 = new defpackage.c0();
        defpackage.c0 c0Var3 = new defpackage.c0();
        if (aVar != null) {
            for (int i = 0; i < aVar.zza(); i++) {
                n0.a l = aVar.a(i).l();
                if (TextUtils.isEmpty(l.zza())) {
                    k().w().a("EventConfig contained null event name");
                } else {
                    String a = j6.a(l.zza());
                    if (!TextUtils.isEmpty(a)) {
                        l.a(a);
                        aVar.a(i, l);
                    }
                    c0Var.put(l.zza(), Boolean.valueOf(l.n()));
                    c0Var2.put(l.zza(), Boolean.valueOf(l.o()));
                    if (l.p()) {
                        if (l.q() < k || l.q() > j) {
                            k().w().a("Invalid sampling rate. Event name, sample rate", l.zza(), Integer.valueOf(l.q()));
                        } else {
                            c0Var3.put(l.zza(), Integer.valueOf(l.q()));
                        }
                    }
                }
            }
        }
        this.e.put(str, c0Var);
        this.f.put(str, c0Var2);
        this.h.put(str, c0Var3);
    }

    private final void i(String str) {
        r();
        c();
        com.google.android.gms.common.internal.u.b(str);
        if (this.g.get(str) == null) {
            byte[] d = o().d(str);
            if (d != null) {
                o0.a l = a(str, d).l();
                a(str, l);
                this.d.put(str, a((com.google.android.gms.internal.measurement.o0) ((com.google.android.gms.internal.measurement.o4) l.i())));
                this.g.put(str, (com.google.android.gms.internal.measurement.o0) ((com.google.android.gms.internal.measurement.o4) l.i()));
                this.i.put(str, null);
                return;
            }
            this.d.put(str, null);
            this.e.put(str, null);
            this.f.put(str, null);
            this.g.put(str, null);
            this.i.put(str, null);
            this.h.put(str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final com.google.android.gms.internal.measurement.o0 a(String str) {
        r();
        c();
        com.google.android.gms.common.internal.u.b(str);
        i(str);
        return this.g.get(str);
    }

    @Override // com.google.android.gms.measurement.internal.na
    public final String a(String str, String str2) {
        c();
        i(str);
        Map<String, String> map = this.d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(String str, byte[] bArr, String str2) {
        r();
        c();
        com.google.android.gms.common.internal.u.b(str);
        o0.a l = a(str, bArr).l();
        if (l == null) {
            return false;
        }
        a(str, l);
        this.g.put(str, (com.google.android.gms.internal.measurement.o0) ((com.google.android.gms.internal.measurement.o4) l.i()));
        this.i.put(str, str2);
        this.d.put(str, a((com.google.android.gms.internal.measurement.o0) ((com.google.android.gms.internal.measurement.o4) l.i())));
        o().b(str, new ArrayList(l.n()));
        try {
            l.o();
            bArr = ((com.google.android.gms.internal.measurement.o0) ((com.google.android.gms.internal.measurement.o4) l.i())).e();
        } catch (RuntimeException e) {
            k().w().a("Unable to serialize reduced-size config. Storing full config instead. appId", f4.a(str), e);
        }
        d o = o();
        com.google.android.gms.common.internal.u.b(str);
        o.c();
        o.r();
        new ContentValues().put("remote_config", bArr);
        try {
            if (o.v().update("apps", r2, "app_id = ?", new String[]{str}) == 0) {
                o.k().t().a("Failed to update remote config (got 0). appId", f4.a(str));
            }
        } catch (SQLiteException e2) {
            o.k().t().a("Error storing remote config. appId", f4.a(str), e2);
        }
        this.g.put(str, (com.google.android.gms.internal.measurement.o0) ((com.google.android.gms.internal.measurement.o4) l.i()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b(String str) {
        c();
        return this.i.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(String str, String str2) {
        Boolean bool;
        c();
        i(str);
        if (g(str) && z9.f(str2)) {
            return true;
        }
        if (h(str) && z9.e(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.e.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(String str) {
        c();
        this.i.put(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(String str, String str2) {
        Boolean bool;
        c();
        i(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(String str, String str2) {
        Integer num;
        c();
        i(str);
        Map<String, Integer> map = this.h.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str) {
        c();
        this.g.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(String str) {
        c();
        com.google.android.gms.internal.measurement.o0 a = a(str);
        if (a == null) {
            return false;
        }
        return a.v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long f(String str) {
        String a = a(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(a)) {
            return 0L;
        }
        try {
            return Long.parseLong(a);
        } catch (NumberFormatException e) {
            k().w().a("Unable to parse timezone offset. appId", f4.a(str), e);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.measurement.internal.p9
    protected final boolean t() {
        return false;
    }
}
