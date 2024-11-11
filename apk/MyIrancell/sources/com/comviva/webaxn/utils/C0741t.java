package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.comviva.webaxn.p002ui.C0655o1;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.t */
/* loaded from: classes.dex */
public class C0741t {

    /* renamed from: c */
    private static C0741t f5153c;

    /* renamed from: a */
    private FirebaseAnalytics f5154a;

    /* renamed from: b */
    private Context f5155b;

    private C0741t(Context context) {
        this.f5155b = context;
    }

    /* renamed from: a */
    private Bundle m6033a(String str, String str2, Bundle bundle) {
        boolean z;
        try {
            try {
                bundle.putLong(str, Long.parseLong(str2));
                return bundle;
            } catch (NumberFormatException unused) {
                bundle.putDouble(str, Double.parseDouble(str2));
                return bundle;
            }
        } catch (NumberFormatException unused2) {
            if (str2.equalsIgnoreCase("true")) {
                z = true;
            } else {
                if (!str2.equalsIgnoreCase("false")) {
                    bundle.putString(str, str2);
                    return bundle;
                }
                z = false;
            }
            bundle.putBoolean(str, z);
            return bundle;
        }
    }

    /* renamed from: a */
    private Bundle m6034a(String str, String str2, Bundle bundle, C0655o1 c0655o1) {
        if (TextUtils.isEmpty(str2)) {
            bundle.putString(str, str2);
            return bundle;
        }
        if (str2.startsWith("$")) {
            m6033a(str, C0755x1.m6132a(c0655o1.m4815i(), str2.substring(1, str2.endsWith("$") ? str2.length() - 1 : str2.length()), c0655o1, false), bundle);
            return bundle;
        }
        m6033a(str, str2, bundle);
        return bundle;
    }

    /* renamed from: a */
    public static C0741t m6035a(Context context) {
        if (f5153c == null) {
            f5153c = new C0741t(context);
        }
        return f5153c;
    }

    /* renamed from: a */
    private String m6036a(String str, C0655o1 c0655o1) {
        if (str.startsWith("$")) {
            return C0755x1.m6132a(c0655o1.m4815i(), str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length()), c0655o1, false);
        }
        return str;
    }

    /* renamed from: a */
    private void m6037a(JSONObject jSONObject, C0655o1 c0655o1) {
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString("name");
                JSONArray jSONArray = jSONObject.getJSONArray("params");
                Bundle bundle = null;
                if (jSONArray.length() > 0) {
                    bundle = new Bundle();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (!TextUtils.isEmpty(next)) {
                                m6034a(next, jSONObject2.getString(next), bundle, c0655o1);
                            }
                        }
                    }
                }
                m6041a(string, bundle);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: b */
    private void m6038b(JSONObject jSONObject, C0655o1 c0655o1) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (!TextUtils.isEmpty(next)) {
                        m6043a(next, m6036a(jSONObject.getString(next), c0655o1));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public void m6039a(FirebaseAnalytics firebaseAnalytics) {
        this.f5154a = firebaseAnalytics;
    }

    /* renamed from: a */
    public void m6040a(String str) {
        if (this.f5154a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f5154a.setCurrentScreen((Activity) this.f5155b, str, null);
    }

    /* renamed from: a */
    public void m6041a(String str, Bundle bundle) {
        if (this.f5154a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f5154a.m10482a(str.toLowerCase(), bundle);
    }

    /* renamed from: a */
    public void m6042a(String str, C0655o1 c0655o1, C3489yj c3489yj) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            m6044b(jSONObject.getString("userid"));
            m6040a(jSONObject.getString("screenname"));
            m6038b(jSONObject.getJSONObject("userprop"), c0655o1);
            JSONArray jSONArray = jSONObject.getJSONArray("events");
            for (int i = 0; i < jSONArray.length(); i++) {
                m6037a(jSONArray.getJSONObject(i), c0655o1);
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public void m6043a(String str, String str2) {
        if (this.f5154a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f5154a.m10483a(str.toLowerCase(), str2);
    }

    /* renamed from: b */
    public void m6044b(String str) {
        if (this.f5154a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f5154a.m10481a(str);
    }
}
