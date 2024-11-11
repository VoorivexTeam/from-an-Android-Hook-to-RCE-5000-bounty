package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.AbstractC1406o4;
import com.google.android.gms.internal.measurement.C1337ja;
import com.google.android.gms.internal.measurement.C1472t0;
import com.google.android.gms.internal.measurement.C1500v0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ha */
/* loaded from: classes.dex */
public final class C1755ha {

    /* renamed from: a */
    private C1472t0 f7605a;

    /* renamed from: b */
    private Long f7606b;

    /* renamed from: c */
    private long f7607c;

    /* renamed from: d */
    private final /* synthetic */ C1695ca f7608d;

    private C1755ha(C1695ca c1695ca) {
        this.f7608d = c1695ca;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1755ha(C1695ca c1695ca, C1731fa c1731fa) {
        this(c1695ca);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1472t0 m9371a(String str, C1472t0 c1472t0) {
        Object obj;
        String m8453q = c1472t0.m8453q();
        List<C1500v0> zza = c1472t0.zza();
        this.f7608d.m9503n();
        Long l = (Long) C1915v9.m9823b(c1472t0, "_eid");
        boolean z = l != null;
        if (z && m8453q.equals("_ep")) {
            this.f7608d.m9503n();
            String str2 = (String) C1915v9.m9823b(c1472t0, "_en");
            if (TextUtils.isEmpty(str2)) {
                ((C1337ja.m7940a() && this.f7608d.m9326m().m9486d(str, C1828o.f7847Y0)) ? this.f7608d.mo9324k().m9310u() : this.f7608d.mo9324k().m9309t()).m9366a("Extra parameter without an event name. eventId", l);
                return null;
            }
            if (this.f7605a == null || this.f7606b == null || l.longValue() != this.f7606b.longValue()) {
                Pair<C1472t0, Long> m9154a = this.f7608d.m9504o().m9154a(str, l);
                if (m9154a == null || (obj = m9154a.first) == null) {
                    ((C1337ja.m7940a() && this.f7608d.m9326m().m9486d(str, C1828o.f7847Y0)) ? this.f7608d.mo9324k().m9310u() : this.f7608d.mo9324k().m9309t()).m9367a("Extra parameter without existing main event. eventName, eventId", str2, l);
                    return null;
                }
                this.f7605a = (C1472t0) obj;
                this.f7607c = ((Long) m9154a.second).longValue();
                this.f7608d.m9503n();
                this.f7606b = (Long) C1915v9.m9823b(this.f7605a, "_eid");
            }
            long j = this.f7607c - 1;
            this.f7607c = j;
            if (j <= 0) {
                C1696d m9504o = this.f7608d.m9504o();
                m9504o.mo9194c();
                m9504o.mo9324k().m9304B().m9366a("Clearing complex main event info. appId", str);
                try {
                    m9504o.m9188v().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e) {
                    m9504o.mo9324k().m9309t().m9366a("Error clearing complex main event", e);
                }
            } else {
                this.f7608d.m9504o().m9170a(str, l, this.f7607c, this.f7605a);
            }
            ArrayList arrayList = new ArrayList();
            for (C1500v0 c1500v0 : this.f7605a.zza()) {
                this.f7608d.m9503n();
                if (C1915v9.m9811a(c1472t0, c1500v0.m8513p()) == null) {
                    arrayList.add(c1500v0);
                }
            }
            if (arrayList.isEmpty()) {
                ((C1337ja.m7940a() && this.f7608d.m9326m().m9486d(str, C1828o.f7847Y0)) ? this.f7608d.mo9324k().m9310u() : this.f7608d.mo9324k().m9312w()).m9366a("No unique parameters in main event. eventName", str2);
            } else {
                arrayList.addAll(zza);
                zza = arrayList;
            }
            m8453q = str2;
        } else if (z) {
            this.f7606b = l;
            this.f7605a = c1472t0;
            this.f7608d.m9503n();
            Object m9823b = C1915v9.m9823b(c1472t0, "_epc");
            long longValue = ((Long) (m9823b != null ? m9823b : 0L)).longValue();
            this.f7607c = longValue;
            if (longValue <= 0) {
                ((C1337ja.m7940a() && this.f7608d.m9326m().m9486d(str, C1828o.f7847Y0)) ? this.f7608d.mo9324k().m9310u() : this.f7608d.mo9324k().m9312w()).m9366a("Complex event with zero extra param count. eventName", m8453q);
            } else {
                this.f7608d.m9504o().m9170a(str, l, this.f7607c, c1472t0);
            }
        }
        C1472t0.a m8099l = c1472t0.m8099l();
        m8099l.m8466a(m8453q);
        m8099l.m8471o();
        m8099l.m8465a(zza);
        return (C1472t0) ((AbstractC1406o4) m8099l.mo7537i());
    }
}
