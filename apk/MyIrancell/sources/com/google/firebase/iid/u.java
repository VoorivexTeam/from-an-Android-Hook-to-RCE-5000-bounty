package com.google.firebase.iid;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class u {
    private static final long d = TimeUnit.DAYS.toMillis(7);
    final String a;
    private final String b;
    private final long c;

    private u(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            sb.toString();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new u(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new u(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            sb.toString();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(String str) {
        return System.currentTimeMillis() > this.c + d || !str.equals(this.b);
    }
}
