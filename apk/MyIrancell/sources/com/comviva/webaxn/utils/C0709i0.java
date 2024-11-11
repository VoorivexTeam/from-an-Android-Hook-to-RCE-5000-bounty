package com.comviva.webaxn.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import p000.k40;
import p000.l40;

/* renamed from: com.comviva.webaxn.utils.i0 */
/* loaded from: classes.dex */
public class C0709i0 {

    /* renamed from: e */
    private static C0709i0 f4855e;

    /* renamed from: a */
    private C0695d1 f4856a;

    /* renamed from: b */
    private IntentFilter f4857b;

    /* renamed from: c */
    private k40 f4858c;

    /* renamed from: d */
    private boolean f4859d = false;

    /* renamed from: b */
    public static C0709i0 m5528b() {
        if (f4855e == null) {
            f4855e = new C0709i0();
        }
        return f4855e;
    }

    /* renamed from: a */
    public void m5529a(Context context) {
        this.f4856a = null;
        this.f4857b = null;
        this.f4858c = null;
        if (m5531a()) {
            m5536d(context);
        }
        if (f4855e != null) {
            f4855e = null;
        }
    }

    /* renamed from: a */
    public void m5530a(Context context, HashMap<String, String> hashMap) {
        String str = hashMap.get("hostreq");
        String str2 = hashMap.get("hostreq_signed");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f4858c.m13610b((Activity) context, Uri.decode(str), Uri.decode(str2));
    }

    /* renamed from: a */
    public boolean m5531a() {
        return this.f4856a != null;
    }

    /* renamed from: b */
    public ProgressDialog m5532b(Context context, HashMap<String, String> hashMap) {
        String str = hashMap.get("hostreq");
        String str2 = hashMap.get("hostreq_signed");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Uri.decode(str);
        Uri.decode(str2);
        return this.f4858c.m13608a((Activity) context, hashMap.get("hostreq_signed"), hashMap.get("hostreq"));
    }

    /* renamed from: b */
    public boolean m5533b(Context context) {
        if (this.f4859d) {
            return true;
        }
        if (this.f4856a == null) {
            this.f4856a = new C0695d1();
        }
        m5535c(context);
        return true;
    }

    /* renamed from: c */
    public ProgressDialog m5534c(Context context, HashMap<String, String> hashMap) {
        if (this.f4858c == null) {
            this.f4858c = new k40();
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
                return m5532b(context, hashMap);
            }
            if (str2.equals("capture_payment")) {
                m5530a(context, hashMap);
            }
        }
        return null;
    }

    /* renamed from: c */
    public void m5535c(Context context) {
        if (this.f4857b == null) {
            IntentFilter intentFilter = new IntentFilter();
            this.f4857b = intentFilter;
            intentFilter.addAction(l40.f11805a);
            this.f4857b.addAction(l40.f11806b);
            this.f4857b.addAction(l40.f11807c);
        }
        context.registerReceiver(this.f4856a, this.f4857b);
        this.f4859d = true;
    }

    /* renamed from: d */
    public void m5536d(Context context) {
        context.unregisterReceiver(this.f4856a);
        this.f4859d = false;
    }
}
