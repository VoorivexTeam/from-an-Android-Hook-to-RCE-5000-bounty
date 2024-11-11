package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.core.content.C0237b;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import p000.C0500c0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.v */
/* loaded from: classes.dex */
public final class C2125v {

    /* renamed from: a */
    private final SharedPreferences f8970a;

    /* renamed from: b */
    private final Context f8971b;

    /* renamed from: c */
    private final C2124u0 f8972c;

    /* renamed from: d */
    private final Map<String, C2128w0> f8973d;

    public C2125v(Context context) {
        this(context, new C2124u0());
    }

    private C2125v(Context context, C2124u0 c2124u0) {
        this.f8973d = new C0500c0();
        this.f8971b = context;
        this.f8970a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f8972c = c2124u0;
        File file = new File(C0237b.m1467c(this.f8971b), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || m10709c()) {
                return;
            }
            m10715b();
            FirebaseInstanceId.m10599i().m10617e();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    "Error creating file in no backup dir: ".concat(valueOf);
                } else {
                    new String("Error creating file in no backup dir: ");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m10707a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    private static String m10708b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: c */
    private final synchronized boolean m10709c() {
        return this.f8970a.getAll().isEmpty();
    }

    /* renamed from: a */
    public final synchronized C2123u m10710a(String str, String str2, String str3) {
        return C2123u.m10691b(this.f8970a.getString(m10708b(str, str2, str3), null));
    }

    /* renamed from: a */
    public final synchronized String m10711a() {
        return this.f8970a.getString("topic_operation_queue", "");
    }

    /* renamed from: a */
    public final synchronized void m10712a(String str) {
        this.f8970a.edit().putString("topic_operation_queue", str).apply();
    }

    /* renamed from: a */
    public final synchronized void m10713a(String str, String str2, String str3, String str4, String str5) {
        String m10690a = C2123u.m10690a(str4, str5, System.currentTimeMillis());
        if (m10690a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f8970a.edit();
        edit.putString(m10708b(str, str2, str3), m10690a);
        edit.commit();
    }

    /* renamed from: b */
    public final synchronized C2128w0 m10714b(String str) {
        C2128w0 m10706b;
        C2128w0 c2128w0 = this.f8973d.get(str);
        if (c2128w0 != null) {
            return c2128w0;
        }
        try {
            m10706b = this.f8972c.m10705a(this.f8971b, str);
        } catch (C2130x0 unused) {
            FirebaseInstanceId.m10599i().m10617e();
            m10706b = this.f8972c.m10706b(this.f8971b, str);
        }
        this.f8973d.put(str, m10706b);
        return m10706b;
    }

    /* renamed from: b */
    public final synchronized void m10715b() {
        this.f8973d.clear();
        C2124u0.m10698a(this.f8971b);
        this.f8970a.edit().clear().commit();
    }

    /* renamed from: c */
    public final synchronized void m10716c(String str) {
        String concat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor edit = this.f8970a.edit();
        for (String str2 : this.f8970a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }
}
