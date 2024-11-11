package com.comviva.webaxn.utils;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: com.comviva.webaxn.utils.r1 */
/* loaded from: classes.dex */
public class C0737r1 {

    /* renamed from: a */
    private C0684a f5144a;

    /* renamed from: b */
    private int f5145b = 0;

    /* renamed from: a */
    public static void m6010a(Context context) {
        C0684a.m5310a(context);
    }

    /* renamed from: a */
    public void m6011a(int i) {
        this.f5145b = i;
    }

    /* renamed from: a */
    public void m6012a(String str) {
        if (str.startsWith("apm://24x7?")) {
            HashMap<String, String> m6188f = C0755x1.m6188f(str.substring(11));
            if (m6188f.size() <= 0 || TextUtils.isEmpty(m6188f.get("name"))) {
                return;
            }
            this.f5144a = new C0684a();
            boolean z = false;
            if (!TextUtils.isEmpty(m6188f.get("component")) && m6188f.get("component").equalsIgnoreCase("true")) {
                z = true;
            }
            this.f5144a.m5311a(m6188f.get("name"), z);
            this.f5145b = 1;
        }
    }

    /* renamed from: a */
    public void m6013a(String str, boolean z) {
        if (this.f5145b != 1) {
            return;
        }
        C0684a c0684a = new C0684a();
        this.f5144a = c0684a;
        c0684a.m5311a(str, z);
    }

    /* renamed from: a */
    public boolean m6014a() {
        C0684a c0684a;
        if (this.f5145b == 1 && (c0684a = this.f5144a) != null) {
            return c0684a.m5315d();
        }
        return false;
    }

    /* renamed from: b */
    public boolean m6015b() {
        C0684a c0684a;
        if (this.f5145b == 1 && (c0684a = this.f5144a) != null) {
            return c0684a.m5312a();
        }
        return false;
    }

    /* renamed from: c */
    public boolean m6016c() {
        C0684a c0684a;
        if (this.f5145b == 1 && (c0684a = this.f5144a) != null) {
            return c0684a.m5313b();
        }
        return false;
    }

    /* renamed from: d */
    public boolean m6017d() {
        C0684a c0684a;
        if (this.f5145b == 1 && (c0684a = this.f5144a) != null) {
            return c0684a.m5314c();
        }
        return false;
    }

    /* renamed from: e */
    public void m6018e() {
        C0684a c0684a;
        if (this.f5145b == 1 && (c0684a = this.f5144a) != null) {
            c0684a.m5316e();
        }
    }

    /* renamed from: f */
    public void m6019f() {
        C0684a c0684a;
        if (this.f5145b == 1 && (c0684a = this.f5144a) != null) {
            c0684a.m5317f();
        }
    }

    /* renamed from: g */
    public void m6020g() {
        C0684a c0684a;
        if (this.f5145b == 1 && (c0684a = this.f5144a) != null) {
            c0684a.m5318g();
        }
    }

    /* renamed from: h */
    public void m6021h() {
        C0684a c0684a;
        if (this.f5145b == 1 && (c0684a = this.f5144a) != null) {
            c0684a.m5319h();
        }
    }

    /* renamed from: i */
    public void m6022i() {
        C0684a c0684a;
        if (this.f5145b == 1 && (c0684a = this.f5144a) != null) {
            c0684a.m5320i();
        }
    }

    /* renamed from: j */
    public void m6023j() {
        C0684a c0684a;
        if (this.f5145b == 1 && (c0684a = this.f5144a) != null) {
            c0684a.m5321j();
            this.f5144a.m5320i();
        }
    }
}
