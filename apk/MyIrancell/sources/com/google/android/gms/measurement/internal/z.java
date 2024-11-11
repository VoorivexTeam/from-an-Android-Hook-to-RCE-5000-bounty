package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class z extends d4 {
    private final Map<String, Long> b;
    private final Map<String, Integer> c;
    private long d;

    public z(j5 j5Var) {
        super(j5Var);
        this.c = new defpackage.c0();
        this.b = new defpackage.c0();
    }

    private final void a(long j, s7 s7Var) {
        if (s7Var == null) {
            k().B().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            k().B().a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        r7.a(s7Var, bundle, true);
        p().a("am", "_xa", bundle);
    }

    private final void a(String str, long j, s7 s7Var) {
        if (s7Var == null) {
            k().B().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            k().B().a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        r7.a(s7Var, bundle, true);
        p().a("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(long j) {
        Iterator<String> it = this.b.keySet().iterator();
        while (it.hasNext()) {
            this.b.put(it.next(), Long.valueOf(j));
        }
        if (this.b.isEmpty()) {
            return;
        }
        this.d = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(String str, long j) {
        a();
        c();
        com.google.android.gms.common.internal.u.b(str);
        if (this.c.isEmpty()) {
            this.d = j;
        }
        Integer num = this.c.get(str);
        if (num != null) {
            this.c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.c.size() >= 100) {
            k().w().a("Too many ads visible");
        } else {
            this.c.put(str, 1);
            this.b.put(str, Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(String str, long j) {
        a();
        c();
        com.google.android.gms.common.internal.u.b(str);
        Integer num = this.c.get(str);
        if (num == null) {
            k().t().a("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        s7 B = s().B();
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            this.c.put(str, Integer.valueOf(intValue));
            return;
        }
        this.c.remove(str);
        Long l = this.b.get(str);
        if (l == null) {
            k().t().a("First ad unit exposure time was never set");
        } else {
            long longValue = j - l.longValue();
            this.b.remove(str);
            a(str, longValue, B);
        }
        if (this.c.isEmpty()) {
            long j2 = this.d;
            if (j2 == 0) {
                k().t().a("First ad exposure time was never set");
            } else {
                a(j - j2, B);
                this.d = 0L;
            }
        }
    }

    public final void a(long j) {
        s7 B = s().B();
        for (String str : this.b.keySet()) {
            a(str, j - this.b.get(str).longValue(), B);
        }
        if (!this.b.isEmpty()) {
            a(j - this.d, B);
        }
        b(j);
    }

    public final void a(String str, long j) {
        if (str == null || str.length() == 0) {
            k().t().a("Ad unit id must be a non-empty string");
        } else {
            g().a(new a(this, str, j));
        }
    }

    public final void b(String str, long j) {
        if (str == null || str.length() == 0) {
            k().t().a("Ad unit id must be a non-empty string");
        } else {
            g().a(new b2(this, str, j));
        }
    }
}
