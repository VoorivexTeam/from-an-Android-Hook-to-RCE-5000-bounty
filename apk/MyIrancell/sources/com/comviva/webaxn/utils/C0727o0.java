package com.comviva.webaxn.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0668v;
import com.comviva.webaxn.p002ui.C0670w;
import java.util.HashMap;
import java.util.Vector;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.o0 */
/* loaded from: classes.dex */
public class C0727o0 {

    /* renamed from: k */
    private static C0727o0 f5046k;

    /* renamed from: a */
    private Context f5047a;

    /* renamed from: b */
    private C3489yj f5048b;

    /* renamed from: c */
    private C0696e f5049c;

    /* renamed from: d */
    private C2899lj f5050d;

    /* renamed from: e */
    private C2945mj f5051e;

    /* renamed from: f */
    private C3400wj f5052f;

    /* renamed from: g */
    private HashMap<String, String> f5053g;

    /* renamed from: h */
    private int f5054h = -1;

    /* renamed from: i */
    private boolean f5055i = false;

    /* renamed from: j */
    private ProgressDialog f5056j;

    private C0727o0(Context context) {
        this.f5047a = context;
    }

    /* renamed from: a */
    public static C0727o0 m5926a(Context context) {
        if (f5046k == null) {
            f5046k = new C0727o0(context);
        }
        return f5046k;
    }

    /* renamed from: a */
    private void m5927a(String str, String str2) {
        AbstractC0652n1 abstractC0652n1;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.startsWith("$")) {
            str = str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length());
        }
        C3489yj m16930a = this.f5050d.m13901f().m16930a(str, (Vector<C3489yj>) null);
        if (m16930a == null || (abstractC0652n1 = m16930a.f14197a0) == null) {
            if (this.f5050d.m13901f().f14519r == null || !this.f5050d.m13901f().f14519r.containsKey(str)) {
                return;
            }
            this.f5050d.m13901f().m16931a(str, str2);
            return;
        }
        if (abstractC0652n1 instanceof C0668v) {
            ((C0668v) abstractC0652n1).m5029f(str2);
        } else if (abstractC0652n1 instanceof C0670w) {
            ((C0670w) abstractC0652n1).m5093h(str2);
        }
    }

    /* renamed from: a */
    public void m5928a() {
        int i = this.f5054h;
        if (i == 1) {
            C0709i0.m5528b().m5529a(this.f5047a);
        } else if (i == 2) {
            C0718l0.m5848b().m5850a();
        }
        HashMap<String, String> hashMap = this.f5053g;
        if (hashMap != null) {
            hashMap.clear();
            this.f5053g = null;
        }
        this.f5047a = null;
        this.f5052f = null;
        this.f5048b = null;
        this.f5049c = null;
        this.f5050d = null;
        this.f5051e = null;
        if (f5046k != null) {
            f5046k = null;
        }
    }

    /* renamed from: a */
    public void m5929a(int i, int i2, Intent intent, String str, boolean z) {
        if (this.f5055i) {
            if (i != 1) {
                if (this.f5054h == 2) {
                    m5927a(this.f5053g.get("target"), C0718l0.m5848b().m5849a(this.f5047a, i2, intent));
                }
                this.f5055i = false;
            }
            ProgressDialog progressDialog = this.f5056j;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f5056j = null;
            }
            m5927a(this.f5053g.get("target"), str);
            m5931a(z);
            this.f5055i = false;
        }
    }

    /* renamed from: a */
    public void m5930a(C3489yj c3489yj, C0696e c0696e, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, String str, int i) {
        this.f5048b = c3489yj;
        this.f5049c = c0696e;
        this.f5052f = c3400wj;
        this.f5051e = c2945mj;
        this.f5050d = c2899lj;
        HashMap<String, String> hashMap = this.f5053g;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f5054h = i;
        if (i == 1) {
            this.f5055i = C0709i0.m5528b().m5533b(this.f5047a);
        }
        this.f5053g = C0755x1.m6188f(str);
        if (i == 1) {
            this.f5056j = C0709i0.m5528b().m5534c(this.f5047a, this.f5053g);
        } else {
            if (this.f5054h != 2 || this.f5055i) {
                return;
            }
            C0718l0.m5848b().m5851a(this.f5047a, this.f5053g);
            this.f5055i = true;
        }
    }

    /* renamed from: a */
    public void m5931a(boolean z) {
        if (TextUtils.isEmpty(this.f5053g.get("action")) || this.f5052f.m16298a(this.f5053g.get("action"), false, this.f5048b, this.f5049c, this.f5051e, this.f5050d)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(this.f5053g.get("action"), this.f5051e.m14145i());
        if (m6134a != null) {
            this.f5051e.m14121a(m6134a);
        }
        String str = null;
        C3489yj c3489yj = this.f5048b;
        if (c3489yj != null) {
            str = c3489yj.f14223j;
        } else {
            C0696e c0696e = this.f5049c;
            if (c0696e != null) {
                str = c0696e.f4718j;
            }
        }
        if (this.f5052f.m16263a(this.f5053g.get("action"), false, false, this.f5051e, false, false, str, this.f5050d) <= 0 || !z) {
            return;
        }
        this.f5052f.m16258E();
    }

    /* renamed from: b */
    public boolean m5932b() {
        return this.f5055i;
    }

    /* renamed from: c */
    public void m5933c() {
        this.f5055i = false;
    }
}
