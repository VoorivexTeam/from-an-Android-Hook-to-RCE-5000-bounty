package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c4 extends d6 {
    private static final AtomicReference<String[]> c = new AtomicReference<>();
    private static final AtomicReference<String[]> d = new AtomicReference<>();
    private static final AtomicReference<String[]> e = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public c4(j5 j5Var) {
        super(j5Var);
    }

    private final String a(zzam zzamVar) {
        if (zzamVar == null) {
            return null;
        }
        return !t() ? zzamVar.toString() : a(zzamVar.zzb());
    }

    private static String a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        com.google.android.gms.common.internal.u.a(strArr);
        com.google.android.gms.common.internal.u.a(strArr2);
        com.google.android.gms.common.internal.u.a(atomicReference);
        com.google.android.gms.common.internal.u.a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (z9.c(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    private final String a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String a = obj instanceof Bundle ? a((Bundle) obj) : String.valueOf(obj);
            if (a != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(a);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private final boolean t() {
        d();
        return this.a.z() && this.a.k().a(3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!t()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(b(str));
            sb.append("=");
            if (com.google.android.gms.internal.measurement.d9.a() && m().a(o.Z0)) {
                Object obj = bundle.get(str);
                sb.append(obj instanceof Bundle ? a(new Object[]{obj}) : obj instanceof Object[] ? a((Object[]) obj) : obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj));
            } else {
                sb.append(bundle.get(str));
            }
        }
        sb.append("}]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(l lVar) {
        if (lVar == null) {
            return null;
        }
        if (!t()) {
            return lVar.toString();
        }
        return "Event{appId='" + lVar.a + "', name='" + a(lVar.b) + "', params=" + a(lVar.f) + "}";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(zzan zzanVar) {
        if (zzanVar == null) {
            return null;
        }
        if (!t()) {
            return zzanVar.toString();
        }
        return "origin=" + zzanVar.d + ",name=" + a(zzanVar.b) + ",params=" + a(zzanVar.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !t() ? str : a(str, j6.b, j6.a, c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !t() ? str : a(str, i6.b, i6.a, d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!t()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return a(str, l6.b, l6.a, e);
        }
        return "experiment_id(" + str + ")";
    }

    @Override // com.google.android.gms.measurement.internal.d6
    protected final boolean r() {
        return false;
    }
}
