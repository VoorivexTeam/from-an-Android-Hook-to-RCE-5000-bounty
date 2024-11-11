package com.comviva.webaxn.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.HashMap;
import p000.C0023aj;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.x */
/* loaded from: classes.dex */
public class C0753x {

    /* renamed from: j */
    private static C0753x f5216j;

    /* renamed from: a */
    private Context f5217a;

    /* renamed from: b */
    private C3400wj f5218b;

    /* renamed from: c */
    private C2899lj f5219c;

    /* renamed from: d */
    private C2945mj f5220d;

    /* renamed from: e */
    private C3489yj f5221e;

    /* renamed from: f */
    private C0696e f5222f;

    /* renamed from: g */
    private String f5223g;

    /* renamed from: h */
    private HashMap<String, String> f5224h;

    /* renamed from: i */
    private boolean f5225i = false;

    private C0753x(Context context) {
        this.f5217a = context;
    }

    /* renamed from: a */
    public static C0753x m6099a(Context context) {
        if (f5216j == null) {
            f5216j = new C0753x(context);
        }
        return f5216j;
    }

    /* renamed from: a */
    public void m6100a() {
        if (TextUtils.isEmpty(this.f5224h.get("action")) || this.f5218b.m16298a(this.f5224h.get("action"), this.f5225i, this.f5221e, this.f5222f, this.f5220d, this.f5219c)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(this.f5224h.get("action"), this.f5220d.m14145i());
        if (m6134a != null) {
            this.f5220d.m14121a(m6134a);
        }
        if (this.f5218b.m16263a(this.f5224h.get("action"), false, this.f5225i, this.f5220d, false, false, this.f5223g, this.f5219c) > 0) {
            this.f5218b.m16258E();
        }
    }

    /* renamed from: a */
    public void m6101a(String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            String[] split = str.split(";");
            for (int i = 0; i < split.length; i++) {
                if (!TextUtils.isEmpty(split[i])) {
                    try {
                        PackageInfo packageInfo = this.f5217a.getPackageManager().getPackageInfo(split[i], 1);
                        sb.append(split[i] + ":1");
                        sb2.append(split[i] + ":" + packageInfo.versionName);
                        if (i != split.length - 1) {
                            sb.append(",");
                            sb2.append(",");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        sb.append(split[i] + ":0");
                        if (i != split.length - 1) {
                            sb.append(",");
                        }
                    }
                }
            }
            String str2 = this.f5224h.get("statusid");
            String str3 = this.f5224h.get("verid");
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                if (this.f5219c.m13901f().f14519r != null) {
                    if (this.f5219c.m13901f().f14519r.containsKey(str2)) {
                        this.f5219c.m13901f().m16931a(str2, sb.toString());
                    }
                    if (this.f5219c.m13901f().f14519r.containsKey(str3)) {
                        this.f5219c.m13901f().m16931a(str3, sb2.toString());
                    }
                } else {
                    if (C0023aj.m160a(this.f5217a).m207j(str2)) {
                        C0023aj.m160a(this.f5217a).m202h(str2, sb.toString());
                    }
                    if (C0023aj.m160a(this.f5217a).m207j(str3)) {
                        C0023aj.m160a(this.f5217a).m202h(str3, sb2.toString());
                    }
                }
            }
        }
        m6100a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m6102a(java.lang.String r1, p000.C3400wj r2, p000.C2945mj r3, p000.C2899lj r4, p000.C3489yj r5, com.comviva.webaxn.utils.C0696e r6, com.comviva.webaxn.p002ui.C0655o1 r7) {
        /*
            r0 = this;
            r0.f5218b = r2
            r0.f5220d = r3
            r0.f5219c = r4
            r0.f5221e = r5
            r0.f5222f = r6
            if (r5 == 0) goto L11
            java.lang.String r2 = r5.f14223j
        Le:
            r0.f5223g = r2
            goto L16
        L11:
            if (r6 == 0) goto L16
            java.lang.String r2 = r6.f4718j
            goto Le
        L16:
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r0.f5224h
            if (r2 == 0) goto L20
            r2.clear()
            r2 = 0
            r0.f5225i = r2
        L20:
            java.util.HashMap r1 = com.comviva.webaxn.utils.C0755x1.m6188f(r1)
            r0.f5224h = r1
            int r1 = r1.size()
            if (r1 <= 0) goto L5c
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f5224h
            java.lang.String r2 = "bgreq"
            java.lang.Object r1 = r1.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L4f
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f5224h
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "true"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4f
            r1 = 1
            r0.f5225i = r1
        L4f:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f5224h
            java.lang.String r2 = "appid"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.m6101a(r1)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0753x.m6102a(java.lang.String, wj, mj, lj, yj, com.comviva.webaxn.utils.e, com.comviva.webaxn.ui.o1):void");
    }
}
