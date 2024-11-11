package com.comviva.webaxn.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0624e0;
import com.comviva.webaxn.p002ui.C0627f0;
import com.comviva.webaxn.p002ui.C0668v;
import com.comviva.webaxn.p002ui.C0670w;
import java.util.HashMap;
import java.util.Vector;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.q0 */
/* loaded from: classes.dex */
public class C0733q0 {

    /* renamed from: h */
    private static C0733q0 f5089h;

    /* renamed from: a */
    private Context f5090a;

    /* renamed from: b */
    private HashMap<String, String> f5091b;

    /* renamed from: c */
    private C3489yj f5092c;

    /* renamed from: d */
    private C0696e f5093d;

    /* renamed from: e */
    private C2899lj f5094e;

    /* renamed from: f */
    private C2945mj f5095f;

    /* renamed from: g */
    private C3400wj f5096g;

    private C0733q0(Context context) {
        this.f5090a = context;
    }

    /* renamed from: a */
    public static C0733q0 m5980a(Context context) {
        if (f5089h == null) {
            f5089h = new C0733q0(context);
        }
        return f5089h;
    }

    /* renamed from: b */
    private void m5981b() {
        AbstractC0652n1 abstractC0652n1;
        String str;
        C3489yj.a aVar;
        ImageView mo4289e;
        String str2 = this.f5091b.get("id");
        String str3 = this.f5091b.get("resimg");
        boolean z = false;
        if (!TextUtils.isEmpty(str3)) {
            if (str3.indexOf(".") != -1) {
                str3 = str3.substring(0, str3.indexOf("."));
            }
            if (str3.equals("trans")) {
                z = true;
            }
        }
        if (!TextUtils.isEmpty(str2) && str2.startsWith("$")) {
            str2 = str2.substring(1, str2.endsWith("$") ? str2.length() - 1 : str2.length());
        }
        C3489yj m16930a = this.f5094e.m13901f().m16930a(str2, (Vector<C3489yj>) null);
        if (m16930a != null && (abstractC0652n1 = m16930a.f14197a0) != null) {
            if (abstractC0652n1 instanceof C0624e0) {
                mo4289e = ((C0624e0) abstractC0652n1).mo4289e();
            } else if (abstractC0652n1 instanceof C0627f0) {
                mo4289e = ((C0627f0) abstractC0652n1).mo4289e();
            } else if (abstractC0652n1 instanceof C0668v) {
                C0668v c0668v = (C0668v) abstractC0652n1;
                if (!TextUtils.isEmpty(str3)) {
                    if (z) {
                        c0668v.m5014a(5, (Drawable) null);
                    } else {
                        c0668v.m5014a(3, C0755x1.m6163b(this.f5090a, str3));
                    }
                }
            } else if (abstractC0652n1 instanceof C0670w) {
                C0670w c0670w = (C0670w) abstractC0652n1;
                if (TextUtils.isEmpty(str3)) {
                    if (!TextUtils.isEmpty(this.f5091b.get("focus"))) {
                        str = this.f5091b.get("focus");
                        if (str.equalsIgnoreCase("true") && m16930a.f14228k1 != null) {
                            aVar = C3489yj.a.FOCUS;
                            c0670w.m5079a(aVar, (String) null);
                        }
                        c0670w.m5079a((C3489yj.a) null, str);
                    } else if (!TextUtils.isEmpty(this.f5091b.get("filled"))) {
                        str = this.f5091b.get("filled");
                        if (str.equalsIgnoreCase("true") && m16930a.f14231l1 != null) {
                            aVar = C3489yj.a.FILLED;
                            c0670w.m5079a(aVar, (String) null);
                        }
                        c0670w.m5079a((C3489yj.a) null, str);
                    } else if (!TextUtils.isEmpty(this.f5091b.get("error"))) {
                        str = this.f5091b.get("error");
                        if (str.equalsIgnoreCase("true") && m16930a.f14234m1 != null) {
                            aVar = C3489yj.a.ERROR;
                            c0670w.m5079a(aVar, (String) null);
                        }
                        c0670w.m5079a((C3489yj.a) null, str);
                    } else if (!TextUtils.isEmpty(this.f5091b.get("normal")) && this.f5091b.get("normal").equalsIgnoreCase("true")) {
                        c0670w.m5079a((C3489yj.a) null, (String) null);
                    }
                } else if (z) {
                    c0670w.m5072a(5, (Drawable) null);
                } else {
                    c0670w.m5072a(3, C0755x1.m6163b(this.f5090a, str3));
                }
            }
            mo4289e.setImageDrawable(C0755x1.m6163b(this.f5090a, str3));
        }
        m5982a();
    }

    /* renamed from: a */
    public void m5982a() {
        if (TextUtils.isEmpty(this.f5091b.get("action")) || this.f5096g.m16298a(this.f5091b.get("action"), false, this.f5092c, this.f5093d, this.f5095f, this.f5094e)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(this.f5091b.get("action"), this.f5095f.m14145i());
        if (m6134a != null) {
            this.f5095f.m14121a(m6134a);
        }
        String str = null;
        C3489yj c3489yj = this.f5092c;
        if (c3489yj != null) {
            str = c3489yj.f14223j;
        } else {
            C0696e c0696e = this.f5093d;
            if (c0696e != null) {
                str = c0696e.f4718j;
            }
        }
        if (this.f5096g.m16263a(this.f5091b.get("action"), false, false, this.f5095f, false, false, str, this.f5094e) > 0) {
            this.f5096g.m16258E();
        }
    }

    /* renamed from: a */
    public void m5983a(C3489yj c3489yj, C0696e c0696e, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, String str) {
        this.f5092c = c3489yj;
        this.f5093d = c0696e;
        this.f5096g = c3400wj;
        this.f5095f = c2945mj;
        this.f5094e = c2899lj;
        HashMap<String, String> hashMap = this.f5091b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f5091b = C0755x1.m6188f(str);
        m5981b();
    }
}
