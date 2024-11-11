package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v {
    private final SharedPreferences a;
    private final Context b;
    private final u0 c;
    private final Map<String, w0> d;

    public v(Context context) {
        this(context, new u0());
    }

    private v(Context context, u0 u0Var) {
        this.d = new defpackage.c0();
        this.b = context;
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.c = u0Var;
        File file = new File(androidx.core.content.b.c(this.b), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || c()) {
                return;
            }
            b();
            FirebaseInstanceId.i().e();
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
    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    private static String b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    private final synchronized boolean c() {
        return this.a.getAll().isEmpty();
    }

    public final synchronized u a(String str, String str2, String str3) {
        return u.b(this.a.getString(b(str, str2, str3), null));
    }

    public final synchronized String a() {
        return this.a.getString("topic_operation_queue", "");
    }

    public final synchronized void a(String str) {
        this.a.edit().putString("topic_operation_queue", str).apply();
    }

    public final synchronized void a(String str, String str2, String str3, String str4, String str5) {
        String a = u.a(str4, str5, System.currentTimeMillis());
        if (a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(b(str, str2, str3), a);
        edit.commit();
    }

    public final synchronized w0 b(String str) {
        w0 b;
        w0 w0Var = this.d.get(str);
        if (w0Var != null) {
            return w0Var;
        }
        try {
            b = this.c.a(this.b, str);
        } catch (x0 unused) {
            FirebaseInstanceId.i().e();
            b = this.c.b(this.b, str);
        }
        this.d.put(str, b);
        return b;
    }

    public final synchronized void b() {
        this.d.clear();
        u0.a(this.b);
        this.a.edit().clear().commit();
    }

    public final synchronized void c(String str) {
        String concat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor edit = this.a.edit();
        for (String str2 : this.a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }
}
