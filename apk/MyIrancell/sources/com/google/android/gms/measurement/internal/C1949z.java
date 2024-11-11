package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C1057u;
import java.util.Iterator;
import java.util.Map;
import p000.C0500c0;

/* renamed from: com.google.android.gms.measurement.internal.z */
/* loaded from: classes.dex */
public final class C1949z extends C1701d4 {

    /* renamed from: b */
    private final Map<String, Long> f8199b;

    /* renamed from: c */
    private final Map<String, Integer> f8200c;

    /* renamed from: d */
    private long f8201d;

    public C1949z(C1774j5 c1774j5) {
        super(c1774j5);
        this.f8200c = new C0500c0();
        this.f8199b = new C0500c0();
    }

    /* renamed from: a */
    private final void m9892a(long j, C1880s7 c1880s7) {
        if (c1880s7 == null) {
            mo9324k().m9304B().m9365a("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            mo9324k().m9304B().m9366a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        C1869r7.m9764a(c1880s7, bundle, true);
        m9197p().m9738a("am", "_xa", bundle);
    }

    /* renamed from: a */
    private final void m9895a(String str, long j, C1880s7 c1880s7) {
        if (c1880s7 == null) {
            mo9324k().m9304B().m9365a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            mo9324k().m9304B().m9366a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        C1869r7.m9764a(c1880s7, bundle, true);
        m9197p().m9738a("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m9896b(long j) {
        Iterator<String> it = this.f8199b.keySet().iterator();
        while (it.hasNext()) {
            this.f8199b.put(it.next(), Long.valueOf(j));
        }
        if (this.f8199b.isEmpty()) {
            return;
        }
        this.f8201d = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m9898c(String str, long j) {
        mo9193a();
        mo9194c();
        C1057u.m7296b(str);
        if (this.f8200c.isEmpty()) {
            this.f8201d = j;
        }
        Integer num = this.f8200c.get(str);
        if (num != null) {
            this.f8200c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f8200c.size() >= 100) {
            mo9324k().m9312w().m9365a("Too many ads visible");
        } else {
            this.f8200c.put(str, 1);
            this.f8199b.put(str, Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m9899d(String str, long j) {
        mo9193a();
        mo9194c();
        C1057u.m7296b(str);
        Integer num = this.f8200c.get(str);
        if (num == null) {
            mo9324k().m9309t().m9366a("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C1880s7 m9767B = m9200s().m9767B();
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            this.f8200c.put(str, Integer.valueOf(intValue));
            return;
        }
        this.f8200c.remove(str);
        Long l = this.f8199b.get(str);
        if (l == null) {
            mo9324k().m9309t().m9365a("First ad unit exposure time was never set");
        } else {
            long longValue = j - l.longValue();
            this.f8199b.remove(str);
            m9895a(str, longValue, m9767B);
        }
        if (this.f8200c.isEmpty()) {
            long j2 = this.f8201d;
            if (j2 == 0) {
                mo9324k().m9309t().m9365a("First ad exposure time was never set");
            } else {
                m9892a(j - j2, m9767B);
                this.f8201d = 0L;
            }
        }
    }

    /* renamed from: a */
    public final void m9900a(long j) {
        C1880s7 m9767B = m9200s().m9767B();
        for (String str : this.f8199b.keySet()) {
            m9895a(str, j - this.f8199b.get(str).longValue(), m9767B);
        }
        if (!this.f8199b.isEmpty()) {
            m9892a(j - this.f8201d, m9767B);
        }
        m9896b(j);
    }

    /* renamed from: a */
    public final void m9901a(String str, long j) {
        if (str == null || str.length() == 0) {
            mo9324k().m9309t().m9365a("Ad unit id must be a non-empty string");
        } else {
            mo9320g().m9344a(new RunnableC1660a(this, str, j));
        }
    }

    /* renamed from: b */
    public final void m9902b(String str, long j) {
        if (str == null || str.length() == 0) {
            mo9324k().m9309t().m9365a("Ad unit id must be a non-empty string");
        } else {
            mo9320g().m9344a(new RunnableC1675b2(this, str, j));
        }
    }
}
