package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.t0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ha {
    private com.google.android.gms.internal.measurement.t0 a;
    private Long b;
    private long c;
    private final /* synthetic */ ca d;

    private ha(ca caVar) {
        this.d = caVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ha(ca caVar, fa faVar) {
        this(caVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.gms.internal.measurement.t0 a(String str, com.google.android.gms.internal.measurement.t0 t0Var) {
        Object obj;
        String q = t0Var.q();
        List<com.google.android.gms.internal.measurement.v0> zza = t0Var.zza();
        this.d.n();
        Long l = (Long) v9.b(t0Var, "_eid");
        boolean z = l != null;
        if (z && q.equals("_ep")) {
            this.d.n();
            String str2 = (String) v9.b(t0Var, "_en");
            if (TextUtils.isEmpty(str2)) {
                ((com.google.android.gms.internal.measurement.ja.a() && this.d.m().d(str, o.Y0)) ? this.d.k().u() : this.d.k().t()).a("Extra parameter without an event name. eventId", l);
                return null;
            }
            if (this.a == null || this.b == null || l.longValue() != this.b.longValue()) {
                Pair<com.google.android.gms.internal.measurement.t0, Long> a = this.d.o().a(str, l);
                if (a == null || (obj = a.first) == null) {
                    ((com.google.android.gms.internal.measurement.ja.a() && this.d.m().d(str, o.Y0)) ? this.d.k().u() : this.d.k().t()).a("Extra parameter without existing main event. eventName, eventId", str2, l);
                    return null;
                }
                this.a = (com.google.android.gms.internal.measurement.t0) obj;
                this.c = ((Long) a.second).longValue();
                this.d.n();
                this.b = (Long) v9.b(this.a, "_eid");
            }
            long j = this.c - 1;
            this.c = j;
            if (j <= 0) {
                d o = this.d.o();
                o.c();
                o.k().B().a("Clearing complex main event info. appId", str);
                try {
                    o.v().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e) {
                    o.k().t().a("Error clearing complex main event", e);
                }
            } else {
                this.d.o().a(str, l, this.c, this.a);
            }
            ArrayList arrayList = new ArrayList();
            for (com.google.android.gms.internal.measurement.v0 v0Var : this.a.zza()) {
                this.d.n();
                if (v9.a(t0Var, v0Var.p()) == null) {
                    arrayList.add(v0Var);
                }
            }
            if (arrayList.isEmpty()) {
                ((com.google.android.gms.internal.measurement.ja.a() && this.d.m().d(str, o.Y0)) ? this.d.k().u() : this.d.k().w()).a("No unique parameters in main event. eventName", str2);
            } else {
                arrayList.addAll(zza);
                zza = arrayList;
            }
            q = str2;
        } else if (z) {
            this.b = l;
            this.a = t0Var;
            this.d.n();
            Object b = v9.b(t0Var, "_epc");
            long longValue = ((Long) (b != null ? b : 0L)).longValue();
            this.c = longValue;
            if (longValue <= 0) {
                ((com.google.android.gms.internal.measurement.ja.a() && this.d.m().d(str, o.Y0)) ? this.d.k().u() : this.d.k().w()).a("Complex event with zero extra param count. eventName", q);
            } else {
                this.d.o().a(str, l, this.c, t0Var);
            }
        }
        t0.a l2 = t0Var.l();
        l2.a(q);
        l2.o();
        l2.a(zza);
        return (com.google.android.gms.internal.measurement.t0) ((com.google.android.gms.internal.measurement.o4) l2.i());
    }
}
