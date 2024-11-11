package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.h0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class ja {
    String a;
    int b;
    Boolean c;
    Boolean d;
    Long e;
    Long f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ja(String str, int i) {
        this.a = str;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean a(double d, com.google.android.gms.internal.measurement.f0 f0Var) {
        try {
            return a(new BigDecimal(d), f0Var, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean a(long j, com.google.android.gms.internal.measurement.f0 f0Var) {
        try {
            return a(new BigDecimal(j), f0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean a(String str, com.google.android.gms.internal.measurement.f0 f0Var) {
        if (!v9.a(str)) {
            return null;
        }
        try {
            return a(new BigDecimal(str), f0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean a(String str, h0.a aVar, boolean z, String str2, List<String> list, String str3, f4 f4Var) {
        boolean startsWith;
        if (str == null) {
            return null;
        }
        if (aVar == h0.a.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && aVar != h0.a.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (fa.a[aVar.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (f4Var != null) {
                        f4Var.w().a("Invalid regular expression in REGEXP audience filter. expression", str3);
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
    public static Boolean a(String str, com.google.android.gms.internal.measurement.h0 h0Var, f4 f4Var) {
        List<String> list;
        com.google.android.gms.common.internal.u.a(h0Var);
        if (str == null || !h0Var.zza() || h0Var.p() == h0.a.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (h0Var.p() == h0.a.IN_LIST) {
            if (h0Var.v() == 0) {
                return null;
            }
        } else if (!h0Var.q()) {
            return null;
        }
        h0.a p = h0Var.p();
        boolean t = h0Var.t();
        String r = (t || p == h0.a.REGEXP || p == h0.a.IN_LIST) ? h0Var.r() : h0Var.r().toUpperCase(Locale.ENGLISH);
        if (h0Var.v() == 0) {
            list = null;
        } else {
            List<String> u = h0Var.u();
            if (!t) {
                ArrayList arrayList = new ArrayList(u.size());
                Iterator<String> it = u.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                u = Collections.unmodifiableList(arrayList);
            }
            list = u;
        }
        return a(str, p, t, r, list, p == h0.a.REGEXP ? r : null, f4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0085, code lost:
    
        if (r2 != null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Boolean a(java.math.BigDecimal r9, com.google.android.gms.internal.measurement.f0 r10, double r11) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ja.a(java.math.BigDecimal, com.google.android.gms.internal.measurement.f0, double):java.lang.Boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean c();
}
