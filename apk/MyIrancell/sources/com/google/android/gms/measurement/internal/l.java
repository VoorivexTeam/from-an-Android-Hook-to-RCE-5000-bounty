package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l {
    final String a;
    final String b;
    private final String c;
    final long d;
    final long e;
    final zzam f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(j5 j5Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzam zzamVar;
        com.google.android.gms.common.internal.u.b(str2);
        com.google.android.gms.common.internal.u.b(str3);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            j5Var.k().w().a("Event created with reverse previous/current timestamps. appId", f4.a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzamVar = new zzam(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    j5Var.k().t().a("Param name can't be null");
                } else {
                    Object a = j5Var.w().a(next, bundle2.get(next));
                    if (a == null) {
                        j5Var.k().w().a("Param value can't be null", j5Var.x().b(next));
                    } else {
                        j5Var.w().a(bundle2, next, a);
                    }
                }
                it.remove();
            }
            zzamVar = new zzam(bundle2);
        }
        this.f = zzamVar;
    }

    private l(j5 j5Var, String str, String str2, String str3, long j, long j2, zzam zzamVar) {
        com.google.android.gms.common.internal.u.b(str2);
        com.google.android.gms.common.internal.u.b(str3);
        com.google.android.gms.common.internal.u.a(zzamVar);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            j5Var.k().w().a("Event created with reverse previous/current timestamps. appId, name", f4.a(str2), f4.a(str3));
        }
        this.f = zzamVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final l a(j5 j5Var, long j) {
        return new l(j5Var, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.f);
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
