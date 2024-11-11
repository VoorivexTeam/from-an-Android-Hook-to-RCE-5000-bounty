package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class o5 extends z3 {
    private final o9 a;
    private Boolean b;
    private String c;

    public o5(o9 o9Var) {
        this(o9Var, null);
    }

    private o5(o9 o9Var, String str) {
        com.google.android.gms.common.internal.u.a(o9Var);
        this.a = o9Var;
        this.c = null;
    }

    private final void a(Runnable runnable) {
        com.google.android.gms.common.internal.u.a(runnable);
        if (this.a.g().t()) {
            runnable.run();
        } else {
            this.a.g().a(runnable);
        }
    }

    private final void a(String str, boolean z) {
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            this.a.k().t().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.b == null) {
                    if (!"com.google.android.gms".equals(this.c) && !com.google.android.gms.common.util.q.a(this.a.l(), Binder.getCallingUid()) && !com.google.android.gms.common.i.a(this.a.l()).a(Binder.getCallingUid())) {
                        z2 = false;
                        this.b = Boolean.valueOf(z2);
                    }
                    z2 = true;
                    this.b = Boolean.valueOf(z2);
                }
                if (this.b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.a.k().t().a("Measurement Service called with invalid calling package. appId", f4.a(str));
                throw e;
            }
        }
        if (this.c == null && com.google.android.gms.common.h.a(this.a.l(), Binder.getCallingUid(), str)) {
            this.c = str;
        }
        if (str.equals(this.c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    private final void b(zzm zzmVar, boolean z) {
        com.google.android.gms.common.internal.u.a(zzmVar);
        a(zzmVar.b, false);
        this.a.o().a(zzmVar.c, zzmVar.s, zzmVar.w);
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final List<zzkq> a(zzm zzmVar, boolean z) {
        h4 t;
        Object a;
        String str;
        b(zzmVar, false);
        try {
            List<w9> list = (List) this.a.g().a(new a6(this, zzmVar)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (w9 w9Var : list) {
                if (z || !z9.f(w9Var.c)) {
                    arrayList.add(new zzkq(w9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            if (com.google.android.gms.internal.measurement.ja.a() && this.a.b().e(zzmVar.b, o.Y0)) {
                t = this.a.k().t();
                a = f4.a(zzmVar.b);
                str = "Failed to get user properties. appId";
            } else {
                t = this.a.k().t();
                a = f4.a(zzmVar.b);
                str = "Failed to get user attributes. appId";
            }
            t.a(str, a, e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final List<zzv> a(String str, String str2, zzm zzmVar) {
        b(zzmVar, false);
        try {
            return (List) this.a.g().a(new r5(this, zzmVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.k().t().a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final List<zzv> a(String str, String str2, String str3) {
        h4 t;
        String str4;
        a(str, true);
        try {
            return (List) this.a.g().a(new u5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            if (com.google.android.gms.internal.measurement.ja.a() && this.a.b().e(str, o.Y0)) {
                t = this.a.k().t();
                str4 = "Failed to get conditional user properties as";
            } else {
                t = this.a.k().t();
                str4 = "Failed to get conditional user properties";
            }
            t.a(str4, e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final List<zzkq> a(String str, String str2, String str3, boolean z) {
        h4 t;
        Object a;
        String str4;
        a(str, true);
        try {
            List<w9> list = (List) this.a.g().a(new s5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (w9 w9Var : list) {
                if (z || !z9.f(w9Var.c)) {
                    arrayList.add(new zzkq(w9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            if (com.google.android.gms.internal.measurement.ja.a() && this.a.b().e(str, o.Y0)) {
                t = this.a.k().t();
                a = f4.a(str);
                str4 = "Failed to get user properties as. appId";
            } else {
                t = this.a.k().t();
                a = f4.a(str);
                str4 = "Failed to get user attributes. appId";
            }
            t.a(str4, a, e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final List<zzkq> a(String str, String str2, boolean z, zzm zzmVar) {
        h4 t;
        Object a;
        String str3;
        b(zzmVar, false);
        try {
            List<w9> list = (List) this.a.g().a(new p5(this, zzmVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (w9 w9Var : list) {
                if (z || !z9.f(w9Var.c)) {
                    arrayList.add(new zzkq(w9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            if (com.google.android.gms.internal.measurement.ja.a() && this.a.b().e(zzmVar.b, o.Y0)) {
                t = this.a.k().t();
                a = f4.a(zzmVar.b);
                str3 = "Failed to query user properties. appId";
            } else {
                t = this.a.k().t();
                a = f4.a(zzmVar.b);
                str3 = "Failed to get user attributes. appId";
            }
            t.a(str3, a, e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final void a(long j, String str, String str2, String str3) {
        a(new c6(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final void a(zzan zzanVar, zzm zzmVar) {
        com.google.android.gms.common.internal.u.a(zzanVar);
        b(zzmVar, false);
        a(new w5(this, zzanVar, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final void a(zzan zzanVar, String str, String str2) {
        com.google.android.gms.common.internal.u.a(zzanVar);
        com.google.android.gms.common.internal.u.b(str);
        a(str, true);
        a(new v5(this, zzanVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final void a(zzkq zzkqVar, zzm zzmVar) {
        com.google.android.gms.common.internal.u.a(zzkqVar);
        b(zzmVar, false);
        a(new x5(this, zzkqVar, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final void a(zzm zzmVar) {
        b(zzmVar, false);
        a(new n5(this, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final void a(zzv zzvVar) {
        com.google.android.gms.common.internal.u.a(zzvVar);
        com.google.android.gms.common.internal.u.a(zzvVar.d);
        a(zzvVar.b, true);
        a(new q5(this, new zzv(zzvVar)));
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final void a(zzv zzvVar, zzm zzmVar) {
        com.google.android.gms.common.internal.u.a(zzvVar);
        com.google.android.gms.common.internal.u.a(zzvVar.d);
        b(zzmVar, false);
        zzv zzvVar2 = new zzv(zzvVar);
        zzvVar2.b = zzmVar.b;
        a(new b6(this, zzvVar2, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final byte[] a(zzan zzanVar, String str) {
        com.google.android.gms.common.internal.u.b(str);
        com.google.android.gms.common.internal.u.a(zzanVar);
        a(str, true);
        this.a.k().A().a("Log and bundle. event", this.a.n().a(zzanVar.b));
        long c = this.a.h().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.a.g().b(new y5(this, zzanVar, str)).get();
            if (bArr == null) {
                this.a.k().t().a("Log and bundle returned null. appId", f4.a(str));
                bArr = new byte[0];
            }
            this.a.k().A().a("Log and bundle processed. event, size, time_ms", this.a.n().a(zzanVar.b), Integer.valueOf(bArr.length), Long.valueOf((this.a.h().c() / 1000000) - c));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.a.k().t().a("Failed to log and bundle. appId, event, error", f4.a(str), this.a.n().a(zzanVar.b), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzan b(zzan zzanVar, zzm zzmVar) {
        zzam zzamVar;
        boolean z = false;
        if ("_cmp".equals(zzanVar.b) && (zzamVar = zzanVar.c) != null && zzamVar.zza() != 0) {
            String d = zzanVar.c.d("_cis");
            if (!TextUtils.isEmpty(d) && (("referrer broadcast".equals(d) || "referrer API".equals(d)) && this.a.b().e(zzmVar.b, o.O))) {
                z = true;
            }
        }
        if (!z) {
            return zzanVar;
        }
        this.a.k().z().a("Event has been filtered ", zzanVar.toString());
        return new zzan("_cmpx", zzanVar.c, zzanVar.d, zzanVar.e);
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final String b(zzm zzmVar) {
        b(zzmVar, false);
        return this.a.d(zzmVar);
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final void c(zzm zzmVar) {
        a(zzmVar.b, false);
        a(new t5(this, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.w3
    public final void d(zzm zzmVar) {
        b(zzmVar, false);
        a(new z5(this, zzmVar));
    }
}
