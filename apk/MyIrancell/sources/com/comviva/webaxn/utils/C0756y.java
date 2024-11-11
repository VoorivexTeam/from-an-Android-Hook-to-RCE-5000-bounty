package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.y */
/* loaded from: classes.dex */
public class C0756y {

    /* renamed from: j */
    private static C0756y f5284j;

    /* renamed from: a */
    private Context f5285a;

    /* renamed from: b */
    private C3400wj f5286b;

    /* renamed from: c */
    private C2899lj f5287c;

    /* renamed from: d */
    private C2945mj f5288d;

    /* renamed from: e */
    private C3489yj f5289e;

    /* renamed from: f */
    private C0696e f5290f;

    /* renamed from: g */
    private String f5291g;

    /* renamed from: h */
    private HashMap<String, String> f5292h;

    /* renamed from: i */
    private boolean f5293i = false;

    private C0756y(Context context) {
        this.f5285a = context;
    }

    /* renamed from: a */
    public static C0756y m6199a(Context context) {
        if (f5284j == null) {
            f5284j = new C0756y(context);
        }
        return f5284j;
    }

    /* renamed from: a */
    private void m6200a(String str) {
        try {
            ((Activity) this.f5285a).startActivityForResult(new Intent("android.intent.action.DELETE", Uri.parse("package:" + str)), 404);
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public void m6201a() {
        if (TextUtils.isEmpty(this.f5292h.get("action")) || this.f5286b.m16298a(this.f5292h.get("action"), this.f5293i, this.f5289e, this.f5290f, this.f5288d, this.f5287c)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(this.f5292h.get("action"), this.f5288d.m14145i());
        if (m6134a != null) {
            this.f5288d.m14121a(m6134a);
        }
        if (this.f5286b.m16263a(this.f5292h.get("action"), false, this.f5293i, this.f5288d, false, false, this.f5291g, this.f5287c) > 0) {
            this.f5286b.m16258E();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m6202a(java.lang.String r1, p000.C3400wj r2, p000.C2945mj r3, p000.C2899lj r4, p000.C3489yj r5, com.comviva.webaxn.utils.C0696e r6, com.comviva.webaxn.p002ui.C0655o1 r7) {
        /*
            r0 = this;
            r0.f5286b = r2
            r0.f5288d = r3
            r0.f5287c = r4
            r0.f5289e = r5
            r0.f5290f = r6
            if (r5 == 0) goto L11
            java.lang.String r2 = r5.f14223j
        Le:
            r0.f5291g = r2
            goto L16
        L11:
            if (r6 == 0) goto L16
            java.lang.String r2 = r6.f4718j
            goto Le
        L16:
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r0.f5292h
            if (r2 == 0) goto L20
            r2.clear()
            r2 = 0
            r0.f5293i = r2
        L20:
            java.util.HashMap r1 = com.comviva.webaxn.utils.C0755x1.m6188f(r1)
            r0.f5292h = r1
            int r1 = r1.size()
            if (r1 <= 0) goto L5c
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f5292h
            java.lang.String r2 = "bgreq"
            java.lang.Object r1 = r1.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L4f
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f5292h
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "true"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4f
            r1 = 1
            r0.f5293i = r1
        L4f:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f5292h
            java.lang.String r2 = "appid"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.m6200a(r1)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0756y.m6202a(java.lang.String, wj, mj, lj, yj, com.comviva.webaxn.utils.e, com.comviva.webaxn.ui.o1):void");
    }
}
