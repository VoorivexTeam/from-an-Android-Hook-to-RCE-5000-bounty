package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.internal.measurement.C1246d9;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.c4 */
/* loaded from: classes.dex */
public final class C1689c4 extends AbstractC1703d6 {

    /* renamed from: c */
    private static final AtomicReference<String[]> f7419c = new AtomicReference<>();

    /* renamed from: d */
    private static final AtomicReference<String[]> f7420d = new AtomicReference<>();

    /* renamed from: e */
    private static final AtomicReference<String[]> f7421e = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1689c4(C1774j5 c1774j5) {
        super(c1774j5);
    }

    /* renamed from: a */
    private final String m9113a(zzam zzamVar) {
        if (zzamVar == null) {
            return null;
        }
        return !m9116t() ? zzamVar.toString() : m9117a(zzamVar.zzb());
    }

    /* renamed from: a */
    private static String m9114a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C1057u.m7286a(strArr);
        C1057u.m7286a(strArr2);
        C1057u.m7286a(atomicReference);
        C1057u.m7293a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (C1959z9.m9924c(str, strArr[i])) {
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

    /* renamed from: a */
    private final String m9115a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String m9117a = obj instanceof Bundle ? m9117a((Bundle) obj) : String.valueOf(obj);
            if (m9117a != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(m9117a);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: t */
    private final boolean m9116t() {
        mo9317d();
        return this.f7550a.m9429z() && this.f7550a.mo9324k().m9308a(3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final String m9117a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!m9116t()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(m9121b(str));
            sb.append("=");
            if (C1246d9.m7769a() && m9326m().m9480a(C1828o.f7849Z0)) {
                Object obj = bundle.get(str);
                sb.append(obj instanceof Bundle ? m9115a(new Object[]{obj}) : obj instanceof Object[] ? m9115a((Object[]) obj) : obj instanceof ArrayList ? m9115a(((ArrayList) obj).toArray()) : String.valueOf(obj));
            } else {
                sb.append(bundle.get(str));
            }
        }
        sb.append("}]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final String m9118a(C1792l c1792l) {
        if (c1792l == null) {
            return null;
        }
        if (!m9116t()) {
            return c1792l.toString();
        }
        return "Event{appId='" + c1792l.f7728a + "', name='" + m9120a(c1792l.f7729b) + "', params=" + m9113a(c1792l.f7733f) + "}";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final String m9119a(zzan zzanVar) {
        if (zzanVar == null) {
            return null;
        }
        if (!m9116t()) {
            return zzanVar.toString();
        }
        return "origin=" + zzanVar.f8222d + ",name=" + m9120a(zzanVar.f8220b) + ",params=" + m9113a(zzanVar.f8221c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final String m9120a(String str) {
        if (str == null) {
            return null;
        }
        return !m9116t() ? str : m9114a(str, C1775j6.f7681b, C1775j6.f7680a, f7419c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final String m9121b(String str) {
        if (str == null) {
            return null;
        }
        return !m9116t() ? str : m9114a(str, C1763i6.f7628b, C1763i6.f7627a, f7420d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final String m9122c(String str) {
        if (str == null) {
            return null;
        }
        if (!m9116t()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m9114a(str, C1799l6.f7741b, C1799l6.f7740a, f7421e);
        }
        return "experiment_id(" + str + ")";
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1703d6
    /* renamed from: r */
    protected final boolean mo9123r() {
        return false;
    }
}
