package com.comviva.webaxn.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import defpackage.k40;
import defpackage.l40;
import java.util.HashMap;

/* loaded from: classes.dex */
public class i0 {
    private static i0 e;
    private d1 a;
    private IntentFilter b;
    private k40 c;
    private boolean d = false;

    public static i0 b() {
        if (e == null) {
            e = new i0();
        }
        return e;
    }

    public void a(Context context) {
        this.a = null;
        this.b = null;
        this.c = null;
        if (a()) {
            d(context);
        }
        if (e != null) {
            e = null;
        }
    }

    public void a(Context context, HashMap<String, String> hashMap) {
        String str = hashMap.get("hostreq");
        String str2 = hashMap.get("hostreq_signed");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.c.b((Activity) context, Uri.decode(str), Uri.decode(str2));
    }

    public boolean a() {
        return this.a != null;
    }

    public ProgressDialog b(Context context, HashMap<String, String> hashMap) {
        String str = hashMap.get("hostreq");
        String str2 = hashMap.get("hostreq_signed");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Uri.decode(str);
        Uri.decode(str2);
        return this.c.a((Activity) context, hashMap.get("hostreq_signed"), hashMap.get("hostreq"));
    }

    public boolean b(Context context) {
        if (this.d) {
            return true;
        }
        if (this.a == null) {
            this.a = new d1();
        }
        c(context);
        return true;
    }

    public ProgressDialog c(Context context, HashMap<String, String> hashMap) {
        if (this.c == null) {
            this.c = new k40();
        }
        if (!TextUtils.isEmpty(hashMap.get("parameters"))) {
            for (String str : hashMap.get("parameters").split("\\|")) {
                if (!TextUtils.isEmpty(str)) {
                    String[] split = str.split(":");
                    if (!TextUtils.isEmpty(split[0])) {
                        if (TextUtils.isEmpty(split[1])) {
                            split[1] = "";
                        }
                        hashMap.put(split[0], split[1]);
                    }
                }
            }
        }
        String str2 = hashMap.get("type");
        if (!TextUtils.isEmpty(str2)) {
            if (str2.equals("payment_modelist")) {
                return b(context, hashMap);
            }
            if (str2.equals("capture_payment")) {
                a(context, hashMap);
            }
        }
        return null;
    }

    public void c(Context context) {
        if (this.b == null) {
            IntentFilter intentFilter = new IntentFilter();
            this.b = intentFilter;
            intentFilter.addAction(l40.a);
            this.b.addAction(l40.b);
            this.b.addAction(l40.c);
        }
        context.registerReceiver(this.a, this.b);
        this.d = true;
    }

    public void d(Context context) {
        context.unregisterReceiver(this.a);
        this.d = false;
    }
}
