package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.C1096b;
import com.google.android.gms.measurement.internal.C1799l6;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.firebase.analytics.connector.internal.a */
/* loaded from: classes.dex */
public final class C2049a {

    /* renamed from: a */
    private static final List<String> f8783a;

    /* renamed from: b */
    private static final List<String> f8784b;

    /* renamed from: c */
    private static final List<String> f8785c;

    /* renamed from: d */
    private static final List<String> f8786d;

    /* renamed from: e */
    private static final List<String> f8787e;

    static {
        new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));
        f8783a = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", "app_open");
        f8784b = Arrays.asList("auto", "app", "am");
        f8785c = Arrays.asList("_r", "_dbg");
        f8786d = Arrays.asList((String[]) C1096b.m7369a(C1799l6.f7740a, C1799l6.f7741b));
        f8787e = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    /* renamed from: a */
    public static boolean m10484a(String str) {
        return !f8784b.contains(str);
    }

    /* renamed from: a */
    public static boolean m10485a(String str, Bundle bundle) {
        if (f8783a.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        Iterator<String> it = f8785c.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m10486a(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f8786d.contains(str2)) {
            return false;
        }
        Iterator<String> it = f8787e.iterator();
        while (it.hasNext()) {
            if (str2.matches(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m10487a(String str, String str2, Bundle bundle) {
        String str3;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!m10484a(str) || bundle == null) {
            return false;
        }
        Iterator<String> it = f8785c.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey(it.next())) {
                return false;
            }
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c = 2;
                }
            } else if (str.equals("fdl")) {
                c = 1;
            }
        } else if (str.equals("fcm")) {
            c = 0;
        }
        if (c == 0) {
            str3 = "fcm_integration";
        } else if (c == 1) {
            str3 = "fdl_integration";
        } else {
            if (c != 2) {
                return false;
            }
            str3 = "fiam_integration";
        }
        bundle.putString("_cis", str3);
        return true;
    }
}
