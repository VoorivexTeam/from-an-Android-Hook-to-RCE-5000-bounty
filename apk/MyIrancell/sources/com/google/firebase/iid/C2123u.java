package com.google.firebase.iid;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.u */
/* loaded from: classes.dex */
final class C2123u {

    /* renamed from: d */
    private static final long f8966d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    final String f8967a;

    /* renamed from: b */
    private final String f8968b;

    /* renamed from: c */
    private final long f8969c;

    private C2123u(String str, String str2, long j) {
        this.f8967a = str;
        this.f8968b = str2;
        this.f8969c = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m10690a(String str, String str2, long j) {
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
    /* renamed from: b */
    public static C2123u m10691b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C2123u(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C2123u(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
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
    /* renamed from: a */
    public final boolean m10692a(String str) {
        return System.currentTimeMillis() > this.f8969c + f8966d || !str.equals(this.f8968b);
    }
}
