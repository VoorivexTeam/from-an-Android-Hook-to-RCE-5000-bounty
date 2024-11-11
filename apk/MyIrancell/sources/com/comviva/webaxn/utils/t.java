package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.yj;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t {
    private static t c;
    private FirebaseAnalytics a;
    private Context b;

    private t(Context context) {
        this.b = context;
    }

    private Bundle a(String str, String str2, Bundle bundle) {
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

    private Bundle a(String str, String str2, Bundle bundle, com.comviva.webaxn.ui.o1 o1Var) {
        if (TextUtils.isEmpty(str2)) {
            bundle.putString(str, str2);
            return bundle;
        }
        if (str2.startsWith("$")) {
            a(str, x1.a(o1Var.i(), str2.substring(1, str2.endsWith("$") ? str2.length() - 1 : str2.length()), o1Var, false), bundle);
            return bundle;
        }
        a(str, str2, bundle);
        return bundle;
    }

    public static t a(Context context) {
        if (c == null) {
            c = new t(context);
        }
        return c;
    }

    private String a(String str, com.comviva.webaxn.ui.o1 o1Var) {
        if (str.startsWith("$")) {
            return x1.a(o1Var.i(), str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length()), o1Var, false);
        }
        return str;
    }

    private void a(JSONObject jSONObject, com.comviva.webaxn.ui.o1 o1Var) {
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
                                a(next, jSONObject2.getString(next), bundle, o1Var);
                            }
                        }
                    }
                }
                a(string, bundle);
            } catch (JSONException unused) {
            }
        }
    }

    private void b(JSONObject jSONObject, com.comviva.webaxn.ui.o1 o1Var) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (!TextUtils.isEmpty(next)) {
                        a(next, a(jSONObject.getString(next), o1Var));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void a(FirebaseAnalytics firebaseAnalytics) {
        this.a = firebaseAnalytics;
    }

    public void a(String str) {
        if (this.a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.a.setCurrentScreen((Activity) this.b, str, null);
    }

    public void a(String str, Bundle bundle) {
        if (this.a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(str.toLowerCase(), bundle);
    }

    public void a(String str, com.comviva.webaxn.ui.o1 o1Var, yj yjVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            b(jSONObject.getString("userid"));
            a(jSONObject.getString("screenname"));
            b(jSONObject.getJSONObject("userprop"), o1Var);
            JSONArray jSONArray = jSONObject.getJSONArray("events");
            for (int i = 0; i < jSONArray.length(); i++) {
                a(jSONArray.getJSONObject(i), o1Var);
            }
        } catch (JSONException unused) {
        }
    }

    public void a(String str, String str2) {
        if (this.a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(str.toLowerCase(), str2);
    }

    public void b(String str) {
        if (this.a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(str);
    }
}
