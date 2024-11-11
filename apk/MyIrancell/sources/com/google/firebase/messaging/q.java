package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.a;
import defpackage.gk;
import defpackage.jk;
import defpackage.lu;
import defpackage.pu;
import defpackage.qu;
import defpackage.xu;

/* loaded from: classes.dex */
public final class q {
    private static final pu a;

    static {
        xu xuVar = new xu();
        xuVar.a(a.c.class, new a.b());
        xuVar.a(a.class, new a.C0053a());
        a = xuVar.a();
    }

    public static void a(Intent intent) {
        if (intent != null) {
            if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                lu luVar = (lu) com.google.firebase.c.i().a(lu.class);
                Log.isLoggable("FirebaseMessaging", 3);
                if (luVar != null) {
                    String stringExtra = intent.getStringExtra("google.c.a.c_id");
                    luVar.a("fcm", "_ln", stringExtra);
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "Firebase");
                    bundle.putString("medium", "notification");
                    bundle.putString("campaign", stringExtra);
                    luVar.a("fcm", "_cmp", bundle);
                }
            } else {
                Log.isLoggable("FirebaseMessaging", 3);
            }
        }
        a("_no", intent);
    }

    public static void a(Intent intent, jk<String> jkVar) {
        a("_nr", intent);
        if (jkVar != null) {
            try {
                jkVar.a(gk.a(a.a(new a.c(new a("MESSAGE_DELIVERED", intent)))));
            } catch (qu unused) {
            }
        }
    }

    private static void a(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            bundle.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            bundle.putString("message_channel", stringExtra4);
        }
        String l = l(intent);
        if (l != null) {
            bundle.putString("_nt", l);
        }
        String stringExtra5 = intent.getStringExtra("google.c.a.ts");
        if (stringExtra5 != null) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(stringExtra5));
            } catch (NumberFormatException unused) {
            }
        }
        String stringExtra6 = intent.hasExtra("google.c.a.udt") ? intent.getStringExtra("google.c.a.udt") : null;
        if (stringExtra6 != null) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(stringExtra6));
            } catch (NumberFormatException unused2) {
            }
        }
        String str2 = (intent.getExtras() == null || !p.a(intent.getExtras())) ? "data" : "display";
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", str2);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(valueOf).length());
            sb.append("Logging to scion event=");
            sb.append(str);
            sb.append(" scionPayload=");
            sb.append(valueOf);
            sb.toString();
        }
        lu luVar = (lu) com.google.firebase.c.i().a(lu.class);
        if (luVar != null) {
            luVar.a("fcm", str, bundle);
        }
    }

    static boolean a() {
        Context a2;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        try {
            com.google.firebase.c.i();
            a2 = com.google.firebase.c.i().a();
            sharedPreferences = a2.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = a2.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(a2.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b() {
        return com.google.firebase.c.i().a().getPackageName();
    }

    public static void b(Intent intent) {
        a("_nd", intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c() {
        return FirebaseInstanceId.getInstance(com.google.firebase.c.i()).a();
    }

    public static void c(Intent intent) {
        a("_nf", intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d() {
        com.google.firebase.c i = com.google.firebase.c.i();
        String b = i.c().b();
        if (b != null) {
            return b;
        }
        String a2 = i.c().a();
        if (!a2.startsWith("1:")) {
            return a2;
        }
        String[] split = a2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static boolean d(Intent intent) {
        if (intent == null || n(intent)) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    public static boolean e(Intent intent) {
        if (intent == null || n(intent)) {
            return false;
        }
        return a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(Intent intent) {
        Object obj = intent.getExtras().get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(valueOf);
            sb.toString();
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(Intent intent) {
        return intent.getStringExtra("collapse_key");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h(Intent intent) {
        return intent.getStringExtra("google.c.a.c_l");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String i(Intent intent) {
        return intent.getStringExtra("google.c.a.m_l");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String j(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String k(Intent intent) {
        return (intent.getExtras() == null || !p.a(intent.getExtras())) ? "DATA_MESSAGE" : "DISPLAY_NOTIFICATION";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String l(Intent intent) {
        String stringExtra = intent.getStringExtra("from");
        if (stringExtra == null || !stringExtra.startsWith("/topics/")) {
            return null;
        }
        return stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(Intent intent) {
        String stringExtra = intent.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            if ("1".equals(intent.getStringExtra("google.priority_reduced"))) {
                return 2;
            }
            stringExtra = intent.getStringExtra("google.priority");
        }
        if ("high".equals(stringExtra)) {
            return 1;
        }
        return "normal".equals(stringExtra) ? 2 : 0;
    }

    private static boolean n(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }
}
