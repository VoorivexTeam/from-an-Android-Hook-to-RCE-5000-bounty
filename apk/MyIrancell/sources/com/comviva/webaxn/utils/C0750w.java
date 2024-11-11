package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.comviva.webaxn.p002ui.C0655o1;
import com.comviva.webaxn.utils.C0755x1;
import java.io.File;
import java.util.HashMap;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.w */
/* loaded from: classes.dex */
public class C0750w {

    /* renamed from: a */
    private Context f5193a;

    /* renamed from: b */
    private C3400wj f5194b;

    /* renamed from: c */
    private C2899lj f5195c;

    /* renamed from: d */
    private C2945mj f5196d;

    /* renamed from: e */
    private C3489yj f5197e;

    /* renamed from: f */
    private C0696e f5198f;

    /* renamed from: g */
    private String f5199g;

    /* renamed from: h */
    private String f5200h;

    /* renamed from: i */
    private HashMap<String, String> f5201i;

    /* renamed from: l */
    private String f5204l;

    /* renamed from: j */
    private boolean f5202j = false;

    /* renamed from: k */
    private boolean f5203k = false;

    /* renamed from: m */
    private final C0755x1.o f5205m = new a();

    /* renamed from: com.comviva.webaxn.utils.w$a */
    /* loaded from: classes.dex */
    class a implements C0755x1.o {
        a() {
        }

        @Override // com.comviva.webaxn.utils.C0755x1.o
        /* renamed from: a */
        public void mo4309a(boolean z) {
            if (z) {
                C0750w.this.m6086f();
            }
        }
    }

    public C0750w(Context context) {
        this.f5193a = context;
    }

    /* renamed from: e */
    private void m6085e() {
        if (C0722m1.m5887a(this.f5193a, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
            m6086f();
            return;
        }
        if (C0713j1.m5563a(this.f5193a).m5647d("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            C0722m1.m5885a((Activity) this.f5193a, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 9);
        } else {
            if (!C0722m1.m5886a(this.f5193a, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                C0755x1.m6181d(this.f5193a, "msg.rpStorage");
                return;
            }
            C0722m1.m5885a((Activity) this.f5193a, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 9);
        }
        this.f5194b.m16337n().mo4083a(this.f5205m);
        C0755x1.f5264v = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m6086f() {
        /*
            r7 = this;
            java.lang.String r0 = r7.f5199g
            java.util.HashMap r0 = com.comviva.webaxn.utils.C0755x1.m6188f(r0)
            r7.f5201i = r0
            int r0 = r0.size()
            r1 = -1
            if (r0 <= 0) goto L8e
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r7.f5201i
            java.lang.String r3 = "bgreq"
            java.lang.Object r0 = r0.get(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r4 = 1
            java.lang.String r5 = "true"
            if (r0 != 0) goto L33
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r7.f5201i
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L33
            r7.f5202j = r4
        L33:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r7.f5201i
            java.lang.String r3 = "save"
            java.lang.Object r0 = r0.get(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L53
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r7.f5201i
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L53
            r7.f5203k = r4
        L53:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r7.f5201i
            java.lang.String r3 = "url"
            java.lang.Object r0 = r0.get(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L76
            android.content.Context r0 = r7.f5193a
            com.comviva.webaxn.utils.n r0 = com.comviva.webaxn.utils.C0723n.m5888a(r0)
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r7.f5201i
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r3 = r0.m5889a(r3)
            goto L8f
        L76:
            java.lang.String r0 = r7.m6090b()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L8e
            r3 = 1511(0x5e7, double:7.465E-321)
            android.content.Context r0 = r7.f5193a
            java.lang.String r5 = r7.m6090b()
            r6 = 1511(0x5e7, float:2.117E-42)
            com.comviva.webaxn.utils.C0731p1.m5953a(r0, r5, r6)
            goto L8f
        L8e:
            r3 = r1
        L8f:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L9c
            android.content.Context r0 = r7.f5193a
            com.comviva.webaxn.utils.n r0 = com.comviva.webaxn.utils.C0723n.m5888a(r0)
            r0.m5891a(r3, r7)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0750w.m6086f():void");
    }

    /* renamed from: a */
    public void m6087a() {
        try {
            if (this.f5203k || TextUtils.isEmpty(this.f5204l)) {
                return;
            }
            File file = new File(Uri.parse(this.f5204l).getPath());
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void m6088a(String str) {
        this.f5204l = str;
    }

    /* renamed from: a */
    public void m6089a(String str, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, C3489yj c3489yj, C0696e c0696e, C0655o1 c0655o1, boolean z) {
        String str2;
        this.f5199g = str;
        this.f5194b = c3400wj;
        this.f5196d = c2945mj;
        this.f5195c = c2899lj;
        this.f5197e = c3489yj;
        this.f5198f = c0696e;
        if (c3489yj == null) {
            if (c0696e != null) {
                str2 = c0696e.f4718j;
            }
            this.f5202j = false;
            this.f5203k = false;
            m6085e();
        }
        str2 = c3489yj.f14223j;
        this.f5200h = str2;
        this.f5202j = false;
        this.f5203k = false;
        m6085e();
    }

    /* renamed from: b */
    public String m6090b() {
        return this.f5201i.get("appid");
    }

    /* renamed from: c */
    public C0655o1 m6091c() {
        C3400wj c3400wj = this.f5194b;
        if (c3400wj != null) {
            return c3400wj.m16343t();
        }
        return null;
    }

    /* renamed from: d */
    public void m6092d() {
        if (TextUtils.isEmpty(this.f5201i.get("action")) || this.f5194b.m16298a(this.f5201i.get("action"), this.f5202j, this.f5197e, this.f5198f, this.f5196d, this.f5195c)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(this.f5201i.get("action"), this.f5196d.m14145i());
        if (m6134a != null) {
            this.f5196d.m14121a(m6134a);
        }
        if (this.f5194b.m16263a(this.f5201i.get("action"), false, this.f5202j, this.f5196d, false, false, this.f5200h, this.f5195c) > 0) {
            this.f5194b.m16258E();
        }
    }
}
