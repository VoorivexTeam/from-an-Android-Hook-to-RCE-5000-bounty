package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.C1006h;
import com.google.android.gms.common.C1007i;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.util.C1111q;
import com.google.android.gms.internal.measurement.C1337ja;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.measurement.internal.o5 */
/* loaded from: classes.dex */
public final class BinderC1834o5 extends AbstractBinderC1953z3 {

    /* renamed from: a */
    private final C1838o9 f7912a;

    /* renamed from: b */
    private Boolean f7913b;

    /* renamed from: c */
    private String f7914c;

    public BinderC1834o5(C1838o9 c1838o9) {
        this(c1838o9, null);
    }

    private BinderC1834o5(C1838o9 c1838o9, String str) {
        C1057u.m7286a(c1838o9);
        this.f7912a = c1838o9;
        this.f7914c = null;
    }

    /* renamed from: a */
    private final void m9613a(Runnable runnable) {
        C1057u.m7286a(runnable);
        if (this.f7912a.mo9320g().m9347t()) {
            runnable.run();
        } else {
            this.f7912a.mo9320g().m9344a(runnable);
        }
    }

    /* renamed from: a */
    private final void m9614a(String str, boolean z) {
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            this.f7912a.mo9324k().m9309t().m9365a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f7913b == null) {
                    if (!"com.google.android.gms".equals(this.f7914c) && !C1111q.m7410a(this.f7912a.mo9325l(), Binder.getCallingUid()) && !C1007i.m7008a(this.f7912a.mo9325l()).m7012a(Binder.getCallingUid())) {
                        z2 = false;
                        this.f7913b = Boolean.valueOf(z2);
                    }
                    z2 = true;
                    this.f7913b = Boolean.valueOf(z2);
                }
                if (this.f7913b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.f7912a.mo9324k().m9309t().m9366a("Measurement Service called with invalid calling package. appId", C1725f4.m9298a(str));
                throw e;
            }
        }
        if (this.f7914c == null && C1006h.m6997a(this.f7912a.mo9325l(), Binder.getCallingUid(), str)) {
            this.f7914c = str;
        }
        if (str.equals(this.f7914c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    /* renamed from: b */
    private final void m9615b(zzm zzmVar, boolean z) {
        C1057u.m7286a(zzmVar);
        m9614a(zzmVar.f8231b, false);
        this.f7912a.m9694o().m9953a(zzmVar.f8232c, zzmVar.f8248s, zzmVar.f8252w);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final List<zzkq> mo9616a(zzm zzmVar, boolean z) {
        C1749h4 m9309t;
        Object m9298a;
        String str;
        m9615b(zzmVar, false);
        try {
            List<C1926w9> list = (List) this.f7912a.mo9320g().m9343a(new CallableC1667a6(this, zzmVar)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C1926w9 c1926w9 : list) {
                if (z || !C1959z9.m9926f(c1926w9.f8151c)) {
                    arrayList.add(new zzkq(c1926w9));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            if (C1337ja.m7940a() && this.f7912a.m9680b().m9488e(zzmVar.f8231b, C1828o.f7847Y0)) {
                m9309t = this.f7912a.mo9324k().m9309t();
                m9298a = C1725f4.m9298a(zzmVar.f8231b);
                str = "Failed to get user properties. appId";
            } else {
                m9309t = this.f7912a.mo9324k().m9309t();
                m9298a = C1725f4.m9298a(zzmVar.f8231b);
                str = "Failed to get user attributes. appId";
            }
            m9309t.m9367a(str, m9298a, e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final List<zzv> mo9617a(String str, String str2, zzm zzmVar) {
        m9615b(zzmVar, false);
        try {
            return (List) this.f7912a.mo9320g().m9343a(new CallableC1867r5(this, zzmVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f7912a.mo9324k().m9309t().m9366a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final List<zzv> mo9618a(String str, String str2, String str3) {
        C1749h4 m9309t;
        String str4;
        m9614a(str, true);
        try {
            return (List) this.f7912a.mo9320g().m9343a(new CallableC1900u5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            if (C1337ja.m7940a() && this.f7912a.m9680b().m9488e(str, C1828o.f7847Y0)) {
                m9309t = this.f7912a.mo9324k().m9309t();
                str4 = "Failed to get conditional user properties as";
            } else {
                m9309t = this.f7912a.mo9324k().m9309t();
                str4 = "Failed to get conditional user properties";
            }
            m9309t.m9366a(str4, e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final List<zzkq> mo9619a(String str, String str2, String str3, boolean z) {
        C1749h4 m9309t;
        Object m9298a;
        String str4;
        m9614a(str, true);
        try {
            List<C1926w9> list = (List) this.f7912a.mo9320g().m9343a(new CallableC1878s5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C1926w9 c1926w9 : list) {
                if (z || !C1959z9.m9926f(c1926w9.f8151c)) {
                    arrayList.add(new zzkq(c1926w9));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            if (C1337ja.m7940a() && this.f7912a.m9680b().m9488e(str, C1828o.f7847Y0)) {
                m9309t = this.f7912a.mo9324k().m9309t();
                m9298a = C1725f4.m9298a(str);
                str4 = "Failed to get user properties as. appId";
            } else {
                m9309t = this.f7912a.mo9324k().m9309t();
                m9298a = C1725f4.m9298a(str);
                str4 = "Failed to get user attributes. appId";
            }
            m9309t.m9367a(str4, m9298a, e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final List<zzkq> mo9620a(String str, String str2, boolean z, zzm zzmVar) {
        C1749h4 m9309t;
        Object m9298a;
        String str3;
        m9615b(zzmVar, false);
        try {
            List<C1926w9> list = (List) this.f7912a.mo9320g().m9343a(new CallableC1845p5(this, zzmVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C1926w9 c1926w9 : list) {
                if (z || !C1959z9.m9926f(c1926w9.f8151c)) {
                    arrayList.add(new zzkq(c1926w9));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            if (C1337ja.m7940a() && this.f7912a.m9680b().m9488e(zzmVar.f8231b, C1828o.f7847Y0)) {
                m9309t = this.f7912a.mo9324k().m9309t();
                m9298a = C1725f4.m9298a(zzmVar.f8231b);
                str3 = "Failed to query user properties. appId";
            } else {
                m9309t = this.f7912a.mo9324k().m9309t();
                m9298a = C1725f4.m9298a(zzmVar.f8231b);
                str3 = "Failed to get user attributes. appId";
            }
            m9309t.m9367a(str3, m9298a, e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final void mo9621a(long j, String str, String str2, String str3) {
        m9613a(new RunnableC1691c6(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final void mo9622a(zzan zzanVar, zzm zzmVar) {
        C1057u.m7286a(zzanVar);
        m9615b(zzmVar, false);
        m9613a(new RunnableC1922w5(this, zzanVar, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final void mo9623a(zzan zzanVar, String str, String str2) {
        C1057u.m7286a(zzanVar);
        C1057u.m7296b(str);
        m9614a(str, true);
        m9613a(new RunnableC1911v5(this, zzanVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final void mo9624a(zzkq zzkqVar, zzm zzmVar) {
        C1057u.m7286a(zzkqVar);
        m9615b(zzmVar, false);
        m9613a(new RunnableC1933x5(this, zzkqVar, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final void mo9625a(zzm zzmVar) {
        m9615b(zzmVar, false);
        m9613a(new RunnableC1822n5(this, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final void mo9626a(zzv zzvVar) {
        C1057u.m7286a(zzvVar);
        C1057u.m7286a(zzvVar.f8255d);
        m9614a(zzvVar.f8253b, true);
        m9613a(new RunnableC1856q5(this, new zzv(zzvVar)));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final void mo9627a(zzv zzvVar, zzm zzmVar) {
        C1057u.m7286a(zzvVar);
        C1057u.m7286a(zzvVar.f8255d);
        m9615b(zzmVar, false);
        zzv zzvVar2 = new zzv(zzvVar);
        zzvVar2.f8253b = zzmVar.f8231b;
        m9613a(new RunnableC1679b6(this, zzvVar2, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: a */
    public final byte[] mo9628a(zzan zzanVar, String str) {
        C1057u.m7296b(str);
        C1057u.m7286a(zzanVar);
        m9614a(str, true);
        this.f7912a.mo9324k().m9303A().m9366a("Log and bundle. event", this.f7912a.m9693n().m9120a(zzanVar.f8220b));
        long mo7377c = this.f7912a.mo9321h().mo7377c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f7912a.mo9320g().m9345b(new CallableC1944y5(this, zzanVar, str)).get();
            if (bArr == null) {
                this.f7912a.mo9324k().m9309t().m9366a("Log and bundle returned null. appId", C1725f4.m9298a(str));
                bArr = new byte[0];
            }
            this.f7912a.mo9324k().m9303A().m9368a("Log and bundle processed. event, size, time_ms", this.f7912a.m9693n().m9120a(zzanVar.f8220b), Integer.valueOf(bArr.length), Long.valueOf((this.f7912a.mo9321h().mo7377c() / 1000000) - mo7377c));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f7912a.mo9324k().m9309t().m9368a("Failed to log and bundle. appId, event, error", C1725f4.m9298a(str), this.f7912a.m9693n().m9120a(zzanVar.f8220b), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final zzan m9629b(zzan zzanVar, zzm zzmVar) {
        zzam zzamVar;
        boolean z = false;
        if ("_cmp".equals(zzanVar.f8220b) && (zzamVar = zzanVar.f8221c) != null && zzamVar.zza() != 0) {
            String m9970d = zzanVar.f8221c.m9970d("_cis");
            if (!TextUtils.isEmpty(m9970d) && (("referrer broadcast".equals(m9970d) || "referrer API".equals(m9970d)) && this.f7912a.m9680b().m9488e(zzmVar.f8231b, C1828o.f7826O))) {
                z = true;
            }
        }
        if (!z) {
            return zzanVar;
        }
        this.f7912a.mo9324k().m9315z().m9366a("Event has been filtered ", zzanVar.toString());
        return new zzan("_cmpx", zzanVar.f8221c, zzanVar.f8222d, zzanVar.f8223e);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: b */
    public final String mo9630b(zzm zzmVar) {
        m9615b(zzmVar, false);
        return this.f7912a.m9687d(zzmVar);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: c */
    public final void mo9631c(zzm zzmVar) {
        m9614a(zzmVar.f8231b, false);
        m9613a(new RunnableC1889t5(this, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1920w3
    /* renamed from: d */
    public final void mo9632d(zzm zzmVar) {
        m9615b(zzmVar, false);
        m9613a(new RunnableC1955z5(this, zzmVar));
    }
}
