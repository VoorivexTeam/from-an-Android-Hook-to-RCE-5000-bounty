package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import java.util.HashMap;

/* loaded from: classes.dex */
public class y {
    private static y j;
    private Context a;
    private wj b;
    private lj c;
    private mj d;
    private yj e;
    private e f;
    private String g;
    private HashMap<String, String> h;
    private boolean i = false;

    private y(Context context) {
        this.a = context;
    }

    public static y a(Context context) {
        if (j == null) {
            j = new y(context);
        }
        return j;
    }

    private void a(String str) {
        try {
            ((Activity) this.a).startActivityForResult(new Intent("android.intent.action.DELETE", Uri.parse("package:" + str)), 404);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public void a() {
        if (TextUtils.isEmpty(this.h.get("action")) || this.b.a(this.h.get("action"), this.i, this.e, this.f, this.d, this.c)) {
            return;
        }
        xj a = x1.a(this.h.get("action"), this.d.i());
        if (a != null) {
            this.d.a(a);
        }
        if (this.b.a(this.h.get("action"), false, this.i, this.d, false, false, this.g, this.c) > 0) {
            this.b.E();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r1, defpackage.wj r2, defpackage.mj r3, defpackage.lj r4, defpackage.yj r5, com.comviva.webaxn.utils.e r6, com.comviva.webaxn.ui.o1 r7) {
        /*
            r0 = this;
            r0.b = r2
            r0.d = r3
            r0.c = r4
            r0.e = r5
            r0.f = r6
            if (r5 == 0) goto L11
            java.lang.String r2 = r5.j
        Le:
            r0.g = r2
            goto L16
        L11:
            if (r6 == 0) goto L16
            java.lang.String r2 = r6.j
            goto Le
        L16:
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r0.h
            if (r2 == 0) goto L20
            r2.clear()
            r2 = 0
            r0.i = r2
        L20:
            java.util.HashMap r1 = com.comviva.webaxn.utils.x1.f(r1)
            r0.h = r1
            int r1 = r1.size()
            if (r1 <= 0) goto L5c
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.h
            java.lang.String r2 = "bgreq"
            java.lang.Object r1 = r1.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L4f
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.h
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "true"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4f
            r1 = 1
            r0.i = r1
        L4f:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.h
            java.lang.String r2 = "appid"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.a(r1)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.y.a(java.lang.String, wj, mj, lj, yj, com.comviva.webaxn.utils.e, com.comviva.webaxn.ui.o1):void");
    }
}
