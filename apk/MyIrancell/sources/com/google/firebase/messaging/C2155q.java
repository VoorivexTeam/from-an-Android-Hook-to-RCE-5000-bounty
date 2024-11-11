package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.C2052c;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.C2139a;
import p000.AbstractC2516gk;
import p000.C3140qu;
import p000.C3451xu;
import p000.InterfaceC2818jk;
import p000.InterfaceC2910lu;
import p000.InterfaceC3098pu;

/* renamed from: com.google.firebase.messaging.q */
/* loaded from: classes.dex */
public final class C2155q {

    /* renamed from: a */
    private static final InterfaceC3098pu f9033a;

    static {
        C3451xu c3451xu = new C3451xu();
        c3451xu.m16515a(C2139a.c.class, new C2139a.b());
        c3451xu.m16515a(C2139a.class, new C2139a.a());
        f9033a = c3451xu.m16514a();
    }

    /* renamed from: a */
    public static void m10795a(Intent intent) {
        if (intent != null) {
            if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                InterfaceC2910lu interfaceC2910lu = (InterfaceC2910lu) C2052c.m10501i().m10504a(InterfaceC2910lu.class);
                Log.isLoggable("FirebaseMessaging", 3);
                if (interfaceC2910lu != null) {
                    String stringExtra = intent.getStringExtra("google.c.a.c_id");
                    interfaceC2910lu.mo13932a("fcm", "_ln", stringExtra);
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "Firebase");
                    bundle.putString("medium", "notification");
                    bundle.putString("campaign", stringExtra);
                    interfaceC2910lu.mo13931a("fcm", "_cmp", bundle);
                }
            } else {
                Log.isLoggable("FirebaseMessaging", 3);
            }
        }
        m10797a("_no", intent);
    }

    /* renamed from: a */
    public static void m10796a(Intent intent, InterfaceC2818jk<String> interfaceC2818jk) {
        m10797a("_nr", intent);
        if (interfaceC2818jk != null) {
            try {
                interfaceC2818jk.mo10741a(AbstractC2516gk.m12029a(f9033a.mo14825a(new C2139a.c(new C2139a("MESSAGE_DELIVERED", intent)))));
            } catch (C3140qu unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m10797a(String str, Intent intent) {
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
        String m10812l = m10812l(intent);
        if (m10812l != null) {
            bundle.putString("_nt", m10812l);
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
        String str2 = (intent.getExtras() == null || !C2154p.m10777a(intent.getExtras())) ? "data" : "display";
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
        InterfaceC2910lu interfaceC2910lu = (InterfaceC2910lu) C2052c.m10501i().m10504a(InterfaceC2910lu.class);
        if (interfaceC2910lu != null) {
            interfaceC2910lu.mo13931a("fcm", str, bundle);
        }
    }

    /* renamed from: a */
    static boolean m10798a() {
        Context m10503a;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        try {
            C2052c.m10501i();
            m10503a = C2052c.m10501i().m10503a();
            sharedPreferences = m10503a.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = m10503a.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(m10503a.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m10799b() {
        return C2052c.m10501i().m10503a().getPackageName();
    }

    /* renamed from: b */
    public static void m10800b(Intent intent) {
        m10797a("_nd", intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m10801c() {
        return FirebaseInstanceId.getInstance(C2052c.m10501i()).m10604a();
    }

    /* renamed from: c */
    public static void m10802c(Intent intent) {
        m10797a("_nf", intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m10803d() {
        C2052c m10501i = C2052c.m10501i();
        String m10590b = m10501i.m10506c().m10590b();
        if (m10590b != null) {
            return m10590b;
        }
        String m10589a = m10501i.m10506c().m10589a();
        if (!m10589a.startsWith("1:")) {
            return m10589a;
        }
        String[] split = m10589a.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: d */
    public static boolean m10804d(Intent intent) {
        if (intent == null || m10814n(intent)) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    /* renamed from: e */
    public static boolean m10805e(Intent intent) {
        if (intent == null || m10814n(intent)) {
            return false;
        }
        return m10798a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m10806f(Intent intent) {
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
    /* renamed from: g */
    public static String m10807g(Intent intent) {
        return intent.getStringExtra("collapse_key");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static String m10808h(Intent intent) {
        return intent.getStringExtra("google.c.a.c_l");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static String m10809i(Intent intent) {
        return intent.getStringExtra("google.c.a.m_l");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static String m10810j(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static String m10811k(Intent intent) {
        return (intent.getExtras() == null || !C2154p.m10777a(intent.getExtras())) ? "DATA_MESSAGE" : "DISPLAY_NOTIFICATION";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static String m10812l(Intent intent) {
        String stringExtra = intent.getStringExtra("from");
        if (stringExtra == null || !stringExtra.startsWith("/topics/")) {
            return null;
        }
        return stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m10813m(Intent intent) {
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

    /* renamed from: n */
    private static boolean m10814n(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }
}
