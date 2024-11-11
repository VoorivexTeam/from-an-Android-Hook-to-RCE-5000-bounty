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

/* loaded from: classes.dex */
public final class p {
    private final Bundle a;

    public p(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.a = new Bundle(bundle);
    }

    public static boolean a(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(i("gcm.n.e"))) || bundle.getString("gcm.n.icon") != null || bundle.getString(i("gcm.n.icon")) != null;
    }

    private final String b(Resources resources, String str, String str2) {
        StringBuilder sb;
        String e = e(str2);
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        int identifier = resources.getIdentifier(e, "string", str);
        if (identifier == 0) {
            String valueOf = String.valueOf(str2);
            String h = h("_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
            sb = new StringBuilder(String.valueOf(h).length() + 49 + String.valueOf(str2).length());
            sb.append(h);
            sb.append(" resource not found: ");
            sb.append(str2);
        } else {
            Object[] f = f(str2);
            if (f == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, f);
            } catch (MissingFormatArgumentException unused) {
                String h2 = h(str2);
                String arrays = Arrays.toString(f);
                sb = new StringBuilder(String.valueOf(h2).length() + 58 + String.valueOf(arrays).length());
                sb.append("Missing format argument for ");
                sb.append(h2);
                sb.append(": ");
                sb.append(arrays);
            }
        }
        sb.append(" Default value will be used.");
        sb.toString();
        return null;
    }

    private final JSONArray g(String str) {
        String a = a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            return new JSONArray(a);
        } catch (JSONException unused) {
            String h = h(str);
            StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 50 + String.valueOf(a).length());
            sb.append("Malformed JSON for key ");
            sb.append(h);
            sb.append(": ");
            sb.append(a);
            sb.append(", falling back to default");
            sb.toString();
            return null;
        }
    }

    private static String h(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    private static String i(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    public final Uri a() {
        String a = a("gcm.n.link_android");
        if (TextUtils.isEmpty(a)) {
            a = a("gcm.n.link");
        }
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return Uri.parse(a);
    }

    public final String a(Resources resources, String str, String str2) {
        String a = a(str2);
        return !TextUtils.isEmpty(a) ? a : b(resources, str, str2);
    }

    public final String a(String str) {
        Bundle bundle = this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String i = i(str);
            if (this.a.containsKey(i)) {
                str = i;
            }
        }
        return bundle.getString(str);
    }

    public final String b() {
        String a = a("gcm.n.sound2");
        return TextUtils.isEmpty(a) ? a("gcm.n.sound") : a;
    }

    public final boolean b(String str) {
        String a = a(str);
        return "1".equals(a) || Boolean.parseBoolean(a);
    }

    public final Integer c(String str) {
        String a = a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(a));
        } catch (NumberFormatException unused) {
            String h = h(str);
            StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 38 + String.valueOf(a).length());
            sb.append("Couldn't parse value of ");
            sb.append(h);
            sb.append("(");
            sb.append(a);
            sb.append(") into an int");
            sb.toString();
            return null;
        }
    }

    public final long[] c() {
        JSONArray g = g("gcm.n.vibrate_timings");
        if (g == null) {
            return null;
        }
        try {
            if (g.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = g.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = g.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            String valueOf = String.valueOf(g);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 74);
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(valueOf);
            sb.append(". Skipping setting vibrateTimings.");
            sb.toString();
            return null;
        }
    }

    public final Long d(String str) {
        String a = a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(a));
        } catch (NumberFormatException unused) {
            String h = h(str);
            StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 38 + String.valueOf(a).length());
            sb.append("Couldn't parse value of ");
            sb.append(h);
            sb.append("(");
            sb.append(a);
            sb.append(") into a long");
            sb.toString();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int[] d() {
        JSONArray g = g("gcm.n.light_settings");
        if (g == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (g.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int parseColor = Color.parseColor(g.optString(0));
            if (parseColor == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = parseColor;
            iArr[1] = g.optInt(1);
            iArr[2] = g.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(g);
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
            String valueOf2 = String.valueOf(g);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 58);
            sb2.append("LightSettings is invalid: ");
            sb2.append(valueOf2);
            sb2.append(". Skipping setting LightSettings");
            sb2.toString();
            return null;
        }
    }

    public final Bundle e() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final String e(String str) {
        String valueOf = String.valueOf(str);
        return a("_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
    }

    public final Bundle f() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final Object[] f(String str) {
        String valueOf = String.valueOf(str);
        JSONArray g = g("_loc_args".length() != 0 ? valueOf.concat("_loc_args") : new String(valueOf));
        if (g == null) {
            return null;
        }
        int length = g.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = g.optString(i);
        }
        return strArr;
    }
}
