package com.comviva.webaxn.utils;

import android.content.Context;
import android.text.TextUtils;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0624e0;
import com.comviva.webaxn.p002ui.C0626f;
import com.comviva.webaxn.p002ui.C0627f0;
import com.comviva.webaxn.p002ui.C0629g;
import com.comviva.webaxn.p002ui.C0632h;
import com.comviva.webaxn.p002ui.C0635i;
import com.comviva.webaxn.p002ui.C0641k;
import com.comviva.webaxn.p002ui.C0644l;
import com.comviva.webaxn.p002ui.C0655o1;
import com.comviva.webaxn.p002ui.C0663s0;
import com.comviva.webaxn.p002ui.C0665t0;
import com.comviva.webaxn.p002ui.C0668v;
import com.comviva.webaxn.p002ui.C0670w;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.t1 */
/* loaded from: classes.dex */
public class C0743t1 {

    /* renamed from: h */
    private static C0743t1 f5164h;

    /* renamed from: a */
    private Context f5165a;

    /* renamed from: b */
    private C3400wj f5166b;

    /* renamed from: c */
    private C2945mj f5167c;

    /* renamed from: d */
    C2899lj f5168d;

    /* renamed from: e */
    private C3489yj f5169e;

    /* renamed from: f */
    private C0696e f5170f;

    /* renamed from: g */
    private String f5171g;

    private C0743t1(Context context) {
        this.f5165a = context;
    }

    /* renamed from: a */
    public static C0743t1 m6048a(Context context) {
        if (f5164h == null) {
            f5164h = new C0743t1(context);
        }
        return f5164h;
    }

    /* renamed from: a */
    private boolean m6049a(C3489yj c3489yj, C0655o1 c0655o1) {
        String m5097m;
        int i = c3489yj.f14208e;
        if (i == 4) {
            AbstractC0652n1 abstractC0652n1 = c3489yj.f14197a0;
            if ((abstractC0652n1 instanceof C0663s0) || (abstractC0652n1 instanceof C0665t0)) {
                if (!TextUtils.isEmpty(C0755x1.m6168b(c3489yj, c0655o1))) {
                    return false;
                }
            } else if ((abstractC0652n1 instanceof C0632h) || (abstractC0652n1 instanceof C0635i)) {
                if (!TextUtils.isEmpty(C0755x1.m6131a(c3489yj, c0655o1))) {
                    return false;
                }
            } else if (abstractC0652n1 instanceof C0641k) {
                if (!TextUtils.isEmpty(C0755x1.m6166b(this.f5165a, c3489yj, c0655o1))) {
                    return false;
                }
            } else if (!(abstractC0652n1 instanceof C0644l) || !TextUtils.isEmpty(C0755x1.m6128a(this.f5165a, c3489yj, c0655o1))) {
                return false;
            }
        } else {
            if (i == 3) {
                AbstractC0652n1 abstractC0652n12 = c3489yj.f14197a0;
                if (abstractC0652n12 instanceof C0668v) {
                    m5097m = ((C0668v) abstractC0652n12).m5034m();
                } else {
                    if (!(abstractC0652n12 instanceof C0670w)) {
                        return false;
                    }
                    m5097m = ((C0670w) abstractC0652n12).m5097m();
                }
                return TextUtils.isEmpty(m5097m);
            }
            AbstractC0652n1 abstractC0652n13 = c3489yj.f14197a0;
            if ((abstractC0652n13 instanceof C0626f) || (abstractC0652n13 instanceof C0629g)) {
                if ((c3489yj.f14208e != 10 || c3489yj.f14264x0 != null) && (c3489yj.f14208e != 11 || c3489yj.f14266y0 != null)) {
                    return false;
                }
            } else {
                if (!(abstractC0652n13 instanceof C0624e0) && !(abstractC0652n13 instanceof C0627f0)) {
                    return false;
                }
                if (C0731p1.f5074c) {
                    C0731p1.f5074c = false;
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public void m6050a() {
        if (f5164h != null) {
            f5164h = null;
        }
        this.f5165a = null;
        this.f5166b = null;
        this.f5169e = null;
        this.f5170f = null;
        this.f5168d = null;
        this.f5167c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m6051a(java.lang.String r16, p000.C3400wj r17, p000.C2945mj r18, p000.C2899lj r19, com.comviva.webaxn.p002ui.C0655o1 r20, p000.C3489yj r21, com.comviva.webaxn.utils.C0696e r22) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0743t1.m6051a(java.lang.String, wj, mj, lj, com.comviva.webaxn.ui.o1, yj, com.comviva.webaxn.utils.e):void");
    }
}
