package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.internal.measurement.AbstractC1406o4;
import com.google.android.gms.internal.measurement.C1387n0;
import com.google.android.gms.internal.measurement.C1402o0;
import com.google.android.gms.internal.measurement.C1416p0;
import com.google.android.gms.internal.measurement.C1518w4;
import java.util.ArrayList;
import java.util.Map;
import p000.C0500c0;

/* renamed from: com.google.android.gms.measurement.internal.d5 */
/* loaded from: classes.dex */
public final class C1702d5 extends AbstractC1849p9 implements InterfaceC1827na {

    /* renamed from: j */
    private static int f7457j = 65535;

    /* renamed from: k */
    private static int f7458k = 2;

    /* renamed from: d */
    private final Map<String, Map<String, String>> f7459d;

    /* renamed from: e */
    private final Map<String, Map<String, Boolean>> f7460e;

    /* renamed from: f */
    private final Map<String, Map<String, Boolean>> f7461f;

    /* renamed from: g */
    private final Map<String, C1402o0> f7462g;

    /* renamed from: h */
    private final Map<String, Map<String, Integer>> f7463h;

    /* renamed from: i */
    private final Map<String, String> f7464i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1702d5(C1838o9 c1838o9) {
        super(c1838o9);
        this.f7459d = new C0500c0();
        this.f7460e = new C0500c0();
        this.f7461f = new C0500c0();
        this.f7462g = new C0500c0();
        this.f7464i = new C0500c0();
        this.f7463h = new C0500c0();
    }

    /* renamed from: a */
    private final C1402o0 m9203a(String str, byte[] bArr) {
        if (bArr == null) {
            return C1402o0.m8061x();
        }
        try {
            C1402o0.a m8060w = C1402o0.m8060w();
            C1915v9.m9810a(m8060w, bArr);
            C1402o0 c1402o0 = (C1402o0) ((AbstractC1406o4) m8060w.mo7537i());
            mo9324k().m9304B().m9367a("Parsed config. version, gmp_app_id", c1402o0.zza() ? Long.valueOf(c1402o0.m8065p()) : null, c1402o0.m8066q() ? c1402o0.m8067r() : null);
            return c1402o0;
        } catch (C1518w4 | RuntimeException e) {
            mo9324k().m9312w().m9367a("Unable to merge remote config. appId", C1725f4.m9298a(str), e);
            return C1402o0.m8061x();
        }
    }

    /* renamed from: a */
    private static Map<String, String> m9204a(C1402o0 c1402o0) {
        C0500c0 c0500c0 = new C0500c0();
        if (c1402o0 != null) {
            for (C1416p0 c1416p0 : c1402o0.m8068s()) {
                c0500c0.put(c1416p0.zza(), c1416p0.m8169p());
            }
        }
        return c0500c0;
    }

    /* renamed from: a */
    private final void m9205a(String str, C1402o0.a aVar) {
        C0500c0 c0500c0 = new C0500c0();
        C0500c0 c0500c02 = new C0500c0();
        C0500c0 c0500c03 = new C0500c0();
        if (aVar != null) {
            for (int i = 0; i < aVar.zza(); i++) {
                C1387n0.a m8099l = aVar.m8072a(i).m8099l();
                if (TextUtils.isEmpty(m8099l.zza())) {
                    mo9324k().m9312w().m9365a("EventConfig contained null event name");
                } else {
                    String m9430a = C1775j6.m9430a(m8099l.zza());
                    if (!TextUtils.isEmpty(m9430a)) {
                        m8099l.m8042a(m9430a);
                        aVar.m8073a(i, m8099l);
                    }
                    c0500c0.put(m8099l.zza(), Boolean.valueOf(m8099l.m8043n()));
                    c0500c02.put(m8099l.zza(), Boolean.valueOf(m8099l.m8044o()));
                    if (m8099l.m8045p()) {
                        if (m8099l.m8046q() < f7458k || m8099l.m8046q() > f7457j) {
                            mo9324k().m9312w().m9367a("Invalid sampling rate. Event name, sample rate", m8099l.zza(), Integer.valueOf(m8099l.m8046q()));
                        } else {
                            c0500c03.put(m8099l.zza(), Integer.valueOf(m8099l.m8046q()));
                        }
                    }
                }
            }
        }
        this.f7460e.put(str, c0500c0);
        this.f7461f.put(str, c0500c02);
        this.f7463h.put(str, c0500c03);
    }

    /* renamed from: i */
    private final void m9206i(String str) {
        m9755r();
        mo9194c();
        C1057u.m7296b(str);
        if (this.f7462g.get(str) == null) {
            byte[] m9178d = m9504o().m9178d(str);
            if (m9178d != null) {
                C1402o0.a m8099l = m9203a(str, m9178d).m8099l();
                m9205a(str, m8099l);
                this.f7459d.put(str, m9204a((C1402o0) ((AbstractC1406o4) m8099l.mo7537i())));
                this.f7462g.put(str, (C1402o0) ((AbstractC1406o4) m8099l.mo7537i()));
                this.f7464i.put(str, null);
                return;
            }
            this.f7459d.put(str, null);
            this.f7460e.put(str, null);
            this.f7461f.put(str, null);
            this.f7462g.put(str, null);
            this.f7464i.put(str, null);
            this.f7463h.put(str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final C1402o0 m9207a(String str) {
        m9755r();
        mo9194c();
        C1057u.m7296b(str);
        m9206i(str);
        return this.f7462g.get(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1827na
    /* renamed from: a */
    public final String mo9098a(String str, String str2) {
        mo9194c();
        m9206i(str);
        Map<String, String> map = this.f7459d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean m9208a(String str, byte[] bArr, String str2) {
        m9755r();
        mo9194c();
        C1057u.m7296b(str);
        C1402o0.a m8099l = m9203a(str, bArr).m8099l();
        if (m8099l == null) {
            return false;
        }
        m9205a(str, m8099l);
        this.f7462g.put(str, (C1402o0) ((AbstractC1406o4) m8099l.mo7537i()));
        this.f7464i.put(str, str2);
        this.f7459d.put(str, m9204a((C1402o0) ((AbstractC1406o4) m8099l.mo7537i())));
        m9504o().m9174b(str, new ArrayList(m8099l.m8074n()));
        try {
            m8099l.m8075o();
            bArr = ((C1402o0) ((AbstractC1406o4) m8099l.mo7537i())).m8880e();
        } catch (RuntimeException e) {
            mo9324k().m9312w().m9367a("Unable to serialize reduced-size config. Storing full config instead. appId", C1725f4.m9298a(str), e);
        }
        C1696d o = m9504o();
        C1057u.m7296b(str);
        o.mo9194c();
        o.m9755r();
        new ContentValues().put("remote_config", bArr);
        try {
            if (o.m9188v().update("apps", r2, "app_id = ?", new String[]{str}) == 0) {
                o.mo9324k().m9309t().m9366a("Failed to update remote config (got 0). appId", C1725f4.m9298a(str));
            }
        } catch (SQLiteException e2) {
            o.mo9324k().m9309t().m9367a("Error storing remote config. appId", C1725f4.m9298a(str), e2);
        }
        this.f7462g.put(str, (C1402o0) ((AbstractC1406o4) m8099l.mo7537i()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final String m9209b(String str) {
        mo9194c();
        return this.f7464i.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m9210b(String str, String str2) {
        Boolean bool;
        mo9194c();
        m9206i(str);
        if (m9217g(str) && C1959z9.m9926f(str2)) {
            return true;
        }
        if (m9218h(str) && C1959z9.m9925e(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f7460e.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m9211c(String str) {
        mo9194c();
        this.f7464i.put(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean m9212c(String str, String str2) {
        Boolean bool;
        mo9194c();
        m9206i(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f7461f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final int m9213d(String str, String str2) {
        Integer num;
        mo9194c();
        m9206i(str);
        Map<String, Integer> map = this.f7463h.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m9214d(String str) {
        mo9194c();
        this.f7462g.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean m9215e(String str) {
        mo9194c();
        C1402o0 m9207a = m9207a(str);
        if (m9207a == null) {
            return false;
        }
        return m9207a.m8071v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final long m9216f(String str) {
        String mo9098a = mo9098a(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(mo9098a)) {
            return 0L;
        }
        try {
            return Long.parseLong(mo9098a);
        } catch (NumberFormatException e) {
            mo9324k().m9312w().m9367a("Unable to parse timezone offset. appId", C1725f4.m9298a(str), e);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean m9217g(String str) {
        return "1".equals(mo9098a(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean m9218h(String str) {
        return "1".equals(mo9098a(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1849p9
    /* renamed from: t */
    protected final boolean mo9129t() {
        return false;
    }
}
