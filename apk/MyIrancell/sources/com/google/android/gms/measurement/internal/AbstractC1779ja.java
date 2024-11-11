package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.internal.measurement.C1267f0;
import com.google.android.gms.internal.measurement.C1297h0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ja */
/* loaded from: classes.dex */
public abstract class AbstractC1779ja {

    /* renamed from: a */
    String f7688a;

    /* renamed from: b */
    int f7689b;

    /* renamed from: c */
    Boolean f7690c;

    /* renamed from: d */
    Boolean f7691d;

    /* renamed from: e */
    Long f7692e;

    /* renamed from: f */
    Long f7693f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1779ja(String str, int i) {
        this.f7688a = str;
        this.f7689b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Boolean m9444a(double d, C1267f0 c1267f0) {
        try {
            return m9450a(new BigDecimal(d), c1267f0, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Boolean m9445a(long j, C1267f0 c1267f0) {
        try {
            return m9450a(new BigDecimal(j), c1267f0, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Boolean m9446a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Boolean m9447a(String str, C1267f0 c1267f0) {
        if (!C1915v9.m9821a(str)) {
            return null;
        }
        try {
            return m9450a(new BigDecimal(str), c1267f0, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Boolean m9448a(String str, C1297h0.a aVar, boolean z, String str2, List<String> list, String str3, C1725f4 c1725f4) {
        boolean startsWith;
        if (str == null) {
            return null;
        }
        if (aVar == C1297h0.a.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && aVar != C1297h0.a.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (C1731fa.f7556a[aVar.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (c1725f4 != null) {
                        c1725f4.m9312w().m9366a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                startsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Boolean m9449a(String str, C1297h0 c1297h0, C1725f4 c1725f4) {
        List<String> list;
        C1057u.m7286a(c1297h0);
        if (str == null || !c1297h0.zza() || c1297h0.m7860p() == C1297h0.a.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (c1297h0.m7860p() == C1297h0.a.IN_LIST) {
            if (c1297h0.m7866v() == 0) {
                return null;
            }
        } else if (!c1297h0.m7861q()) {
            return null;
        }
        C1297h0.a m7860p = c1297h0.m7860p();
        boolean m7864t = c1297h0.m7864t();
        String m7862r = (m7864t || m7860p == C1297h0.a.REGEXP || m7860p == C1297h0.a.IN_LIST) ? c1297h0.m7862r() : c1297h0.m7862r().toUpperCase(Locale.ENGLISH);
        if (c1297h0.m7866v() == 0) {
            list = null;
        } else {
            List<String> m7865u = c1297h0.m7865u();
            if (!m7864t) {
                ArrayList arrayList = new ArrayList(m7865u.size());
                Iterator<String> it = m7865u.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                m7865u = Collections.unmodifiableList(arrayList);
            }
            list = m7865u;
        }
        return m9448a(str, m7860p, m7864t, m7862r, list, m7860p == C1297h0.a.REGEXP ? m7862r : null, c1725f4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0085, code lost:
    
        if (r2 != null) goto L38;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Boolean m9450a(java.math.BigDecimal r9, com.google.android.gms.internal.measurement.C1267f0 r10, double r11) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AbstractC1779ja.m9450a(java.math.BigDecimal, com.google.android.gms.internal.measurement.f0, double):java.lang.Boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo9357a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo9359b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo9360c();
}
