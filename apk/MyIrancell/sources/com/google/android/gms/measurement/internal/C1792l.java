package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1057u;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.l */
/* loaded from: classes.dex */
public final class C1792l {

    /* renamed from: a */
    final String f7728a;

    /* renamed from: b */
    final String f7729b;

    /* renamed from: c */
    private final String f7730c;

    /* renamed from: d */
    final long f7731d;

    /* renamed from: e */
    final long f7732e;

    /* renamed from: f */
    final zzam f7733f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1792l(C1774j5 c1774j5, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzam zzamVar;
        C1057u.m7296b(str2);
        C1057u.m7296b(str3);
        this.f7728a = str2;
        this.f7729b = str3;
        this.f7730c = TextUtils.isEmpty(str) ? null : str;
        this.f7731d = j;
        this.f7732e = j2;
        if (j2 != 0 && j2 > j) {
            c1774j5.mo9324k().m9312w().m9366a("Event created with reverse previous/current timestamps. appId", C1725f4.m9298a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzamVar = new zzam(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c1774j5.mo9324k().m9309t().m9365a("Param name can't be null");
                } else {
                    Object m9937a = c1774j5.m9426w().m9937a(next, bundle2.get(next));
                    if (m9937a == null) {
                        c1774j5.mo9324k().m9312w().m9366a("Param value can't be null", c1774j5.m9427x().m9121b(next));
                    } else {
                        c1774j5.m9426w().m9941a(bundle2, next, m9937a);
                    }
                }
                it.remove();
            }
            zzamVar = new zzam(bundle2);
        }
        this.f7733f = zzamVar;
    }

    private C1792l(C1774j5 c1774j5, String str, String str2, String str3, long j, long j2, zzam zzamVar) {
        C1057u.m7296b(str2);
        C1057u.m7296b(str3);
        C1057u.m7286a(zzamVar);
        this.f7728a = str2;
        this.f7729b = str3;
        this.f7730c = TextUtils.isEmpty(str) ? null : str;
        this.f7731d = j;
        this.f7732e = j2;
        if (j2 != 0 && j2 > j) {
            c1774j5.mo9324k().m9312w().m9367a("Event created with reverse previous/current timestamps. appId, name", C1725f4.m9298a(str2), C1725f4.m9298a(str3));
        }
        this.f7733f = zzamVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1792l m9465a(C1774j5 c1774j5, long j) {
        return new C1792l(c1774j5, this.f7730c, this.f7728a, this.f7729b, this.f7731d, j, this.f7733f);
    }

    public final String toString() {
        String str = this.f7728a;
        String str2 = this.f7729b;
        String valueOf = String.valueOf(this.f7733f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
