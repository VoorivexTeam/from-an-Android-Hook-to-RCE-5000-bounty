package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.p */
/* loaded from: classes.dex */
public final class C2154p {

    /* renamed from: a */
    private final Bundle f9032a;

    public C2154p(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f9032a = new Bundle(bundle);
    }

    /* renamed from: a */
    public static boolean m10777a(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m10781i("gcm.n.e"))) || bundle.getString("gcm.n.icon") != null || bundle.getString(m10781i("gcm.n.icon")) != null;
    }

    /* renamed from: b */
    private final String m10778b(Resources resources, String str, String str2) {
        StringBuilder sb;
        String m10792e = m10792e(str2);
        if (TextUtils.isEmpty(m10792e)) {
            return null;
        }
        int identifier = resources.getIdentifier(m10792e, "string", str);
        if (identifier == 0) {
            String valueOf = String.valueOf(str2);
            String m10780h = m10780h("_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
            sb = new StringBuilder(String.valueOf(m10780h).length() + 49 + String.valueOf(str2).length());
            sb.append(m10780h);
            sb.append(" resource not found: ");
            sb.append(str2);
        } else {
            Object[] m10794f = m10794f(str2);
            if (m10794f == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, m10794f);
            } catch (MissingFormatArgumentException unused) {
                String m10780h2 = m10780h(str2);
                String arrays = Arrays.toString(m10794f);
                sb = new StringBuilder(String.valueOf(m10780h2).length() + 58 + String.valueOf(arrays).length());
                sb.append("Missing format argument for ");
                sb.append(m10780h2);
                sb.append(": ");
                sb.append(arrays);
            }
        }
        sb.append(" Default value will be used.");
        sb.toString();
        return null;
    }

    /* renamed from: g */
    private final JSONArray m10779g(String str) {
        String m10784a = m10784a(str);
        if (TextUtils.isEmpty(m10784a)) {
            return null;
        }
        try {
            return new JSONArray(m10784a);
        } catch (JSONException unused) {
            String m10780h = m10780h(str);
            StringBuilder sb = new StringBuilder(String.valueOf(m10780h).length() + 50 + String.valueOf(m10784a).length());
            sb.append("Malformed JSON for key ");
            sb.append(m10780h);
            sb.append(": ");
            sb.append(m10784a);
            sb.append(", falling back to default");
            sb.toString();
            return null;
        }
    }

    /* renamed from: h */
    private static String m10780h(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* renamed from: i */
    private static String m10781i(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: a */
    public final Uri m10782a() {
        String m10784a = m10784a("gcm.n.link_android");
        if (TextUtils.isEmpty(m10784a)) {
            m10784a = m10784a("gcm.n.link");
        }
        if (TextUtils.isEmpty(m10784a)) {
            return null;
        }
        return Uri.parse(m10784a);
    }

    /* renamed from: a */
    public final String m10783a(Resources resources, String str, String str2) {
        String m10784a = m10784a(str2);
        return !TextUtils.isEmpty(m10784a) ? m10784a : m10778b(resources, str, str2);
    }

    /* renamed from: a */
    public final String m10784a(String str) {
        Bundle bundle = this.f9032a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String m10781i = m10781i(str);
            if (this.f9032a.containsKey(m10781i)) {
                str = m10781i;
            }
        }
        return bundle.getString(str);
    }

    /* renamed from: b */
    public final String m10785b() {
        String m10784a = m10784a("gcm.n.sound2");
        return TextUtils.isEmpty(m10784a) ? m10784a("gcm.n.sound") : m10784a;
    }

    /* renamed from: b */
    public final boolean m10786b(String str) {
        String m10784a = m10784a(str);
        return "1".equals(m10784a) || Boolean.parseBoolean(m10784a);
    }

    /* renamed from: c */
    public final Integer m10787c(String str) {
        String m10784a = m10784a(str);
        if (TextUtils.isEmpty(m10784a)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m10784a));
        } catch (NumberFormatException unused) {
            String m10780h = m10780h(str);
            StringBuilder sb = new StringBuilder(String.valueOf(m10780h).length() + 38 + String.valueOf(m10784a).length());
            sb.append("Couldn't parse value of ");
            sb.append(m10780h);
            sb.append("(");
            sb.append(m10784a);
            sb.append(") into an int");
            sb.toString();
            return null;
        }
    }

    /* renamed from: c */
    public final long[] m10788c() {
        JSONArray m10779g = m10779g("gcm.n.vibrate_timings");
        if (m10779g == null) {
            return null;
        }
        try {
            if (m10779g.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = m10779g.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = m10779g.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            String valueOf = String.valueOf(m10779g);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 74);
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(valueOf);
            sb.append(". Skipping setting vibrateTimings.");
            sb.toString();
            return null;
        }
    }

    /* renamed from: d */
    public final Long m10789d(String str) {
        String m10784a = m10784a(str);
        if (TextUtils.isEmpty(m10784a)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(m10784a));
        } catch (NumberFormatException unused) {
            String m10780h = m10780h(str);
            StringBuilder sb = new StringBuilder(String.valueOf(m10780h).length() + 38 + String.valueOf(m10784a).length());
            sb.append("Couldn't parse value of ");
            sb.append(m10780h);
            sb.append("(");
            sb.append(m10784a);
            sb.append(") into a long");
            sb.toString();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final int[] m10790d() {
        JSONArray m10779g = m10779g("gcm.n.light_settings");
        if (m10779g == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (m10779g.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int parseColor = Color.parseColor(m10779g.optString(0));
            if (parseColor == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = parseColor;
            iArr[1] = m10779g.optInt(1);
            iArr[2] = m10779g.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(m10779g);
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 60 + String.valueOf(message).length());
            sb.append("LightSettings is invalid: ");
            sb.append(valueOf);
            sb.append(". ");
            sb.append(message);
            sb.append(". Skipping setting LightSettings");
            sb.toString();
            return null;
        } catch (JSONException unused) {
            String valueOf2 = String.valueOf(m10779g);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 58);
            sb2.append("LightSettings is invalid: ");
            sb2.append(valueOf2);
            sb2.append(". Skipping setting LightSettings");
            sb2.toString();
            return null;
        }
    }

    /* renamed from: e */
    public final Bundle m10791e() {
        Bundle bundle = new Bundle(this.f9032a);
        for (String str : this.f9032a.keySet()) {
            if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: e */
    public final String m10792e(String str) {
        String valueOf = String.valueOf(str);
        return m10784a("_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
    }

    /* renamed from: f */
    public final Bundle m10793f() {
        Bundle bundle = new Bundle(this.f9032a);
        for (String str : this.f9032a.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: f */
    public final Object[] m10794f(String str) {
        String valueOf = String.valueOf(str);
        JSONArray m10779g = m10779g("_loc_args".length() != 0 ? valueOf.concat("_loc_args") : new String(valueOf));
        if (m10779g == null) {
            return null;
        }
        int length = m10779g.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = m10779g.optString(i);
        }
        return strArr;
    }
}
