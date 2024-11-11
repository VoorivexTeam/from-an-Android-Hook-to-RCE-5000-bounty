package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.comviva.webaxn.utils.x1;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes.dex */
public class w {
    private Context a;
    private wj b;
    private lj c;
    private mj d;
    private yj e;
    private e f;
    private String g;
    private String h;
    private HashMap<String, String> i;
    private String l;
    private boolean j = false;
    private boolean k = false;
    private final x1.o m = new a();

    /* loaded from: classes.dex */
    class a implements x1.o {
        a() {
        }

        @Override // com.comviva.webaxn.utils.x1.o
        public void a(boolean z) {
            if (z) {
                w.this.f();
            }
        }
    }

    public w(Context context) {
        this.a = context;
    }

    private void e() {
        if (m1.a(this.a, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
            f();
            return;
        }
        if (j1.a(this.a).d("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            m1.a((Activity) this.a, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 9);
        } else {
            if (!m1.a(this.a, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                x1.d(this.a, "msg.rpStorage");
                return;
            }
            m1.a((Activity) this.a, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 9);
        }
        this.b.n().a(this.m);
        x1.v = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            r7 = this;
            java.lang.String r0 = r7.g
            java.util.HashMap r0 = com.comviva.webaxn.utils.x1.f(r0)
            r7.i = r0
            int r0 = r0.size()
            r1 = -1
            if (r0 <= 0) goto L8e
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r7.i
            java.lang.String r3 = "bgreq"
            java.lang.Object r0 = r0.get(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r4 = 1
            java.lang.String r5 = "true"
            if (r0 != 0) goto L33
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r7.i
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L33
            r7.j = r4
        L33:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r7.i
            java.lang.String r3 = "save"
            java.lang.Object r0 = r0.get(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L53
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r7.i
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L53
            r7.k = r4
        L53:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r7.i
            java.lang.String r3 = "url"
            java.lang.Object r0 = r0.get(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L76
            android.content.Context r0 = r7.a
            com.comviva.webaxn.utils.n r0 = com.comviva.webaxn.utils.n.a(r0)
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r7.i
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r3 = r0.a(r3)
            goto L8f
        L76:
            java.lang.String r0 = r7.b()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L8e
            r3 = 1511(0x5e7, double:7.465E-321)
            android.content.Context r0 = r7.a
            java.lang.String r5 = r7.b()
            r6 = 1511(0x5e7, float:2.117E-42)
            com.comviva.webaxn.utils.p1.a(r0, r5, r6)
            goto L8f
        L8e:
            r3 = r1
        L8f:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L9c
            android.content.Context r0 = r7.a
            com.comviva.webaxn.utils.n r0 = com.comviva.webaxn.utils.n.a(r0)
            r0.a(r3, r7)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.w.f():void");
    }

    public void a() {
        try {
            if (this.k || TextUtils.isEmpty(this.l)) {
                return;
            }
            File file = new File(Uri.parse(this.l).getPath());
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    public void a(String str) {
        this.l = str;
    }

    public void a(String str, wj wjVar, mj mjVar, lj ljVar, yj yjVar, e eVar, com.comviva.webaxn.ui.o1 o1Var, boolean z) {
        String str2;
        this.g = str;
        this.b = wjVar;
        this.d = mjVar;
        this.c = ljVar;
        this.e = yjVar;
        this.f = eVar;
        if (yjVar == null) {
            if (eVar != null) {
                str2 = eVar.j;
            }
            this.j = false;
            this.k = false;
            e();
        }
        str2 = yjVar.j;
        this.h = str2;
        this.j = false;
        this.k = false;
        e();
    }

    public String b() {
        return this.i.get("appid");
    }

    public com.comviva.webaxn.ui.o1 c() {
        wj wjVar = this.b;
        if (wjVar != null) {
            return wjVar.t();
        }
        return null;
    }

    public void d() {
        if (TextUtils.isEmpty(this.i.get("action")) || this.b.a(this.i.get("action"), this.j, this.e, this.f, this.d, this.c)) {
            return;
        }
        xj a2 = x1.a(this.i.get("action"), this.d.i());
        if (a2 != null) {
            this.d.a(a2);
        }
        if (this.b.a(this.i.get("action"), false, this.j, this.d, false, false, this.h, this.c) > 0) {
            this.b.E();
        }
    }
}
