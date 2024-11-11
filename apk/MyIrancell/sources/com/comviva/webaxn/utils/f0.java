package com.comviva.webaxn.utils;

import android.content.Context;
import android.text.TextUtils;
import com.comviva.webaxn.utils.x1;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import java.util.HashMap;

/* loaded from: classes.dex */
public class f0 {
    private static f0 l;
    private Context a;
    private wj b;
    private mj c;
    private lj d;
    private yj e;
    private e f;
    private HashMap<String, String> g;
    private String h;
    private long i = 0;
    private boolean j = false;
    public final x1.l k = new a();

    /* loaded from: classes.dex */
    class a implements x1.l {
        a() {
        }

        @Override // com.comviva.webaxn.utils.x1.l
        public void a(boolean z) {
            f0.this.c();
        }
    }

    private f0(Context context) {
        this.a = context;
    }

    public static f0 a(Context context) {
        if (l == null) {
            l = new f0(context);
        }
        return l;
    }

    public void a() {
        if (l != null) {
            l = null;
        }
        HashMap<String, String> hashMap = this.g;
        if (hashMap != null) {
            hashMap.clear();
            this.g = null;
        }
        this.a = null;
        this.b = null;
        this.e = null;
        this.f = null;
        this.c = null;
        this.d = null;
        this.j = false;
    }

    public void a(boolean z) {
        if (z) {
            HashMap<String, String> hashMap = this.g;
            if (hashMap != null) {
                hashMap.clear();
            }
            HashMap<String, String> f = x1.f(this.h);
            this.g = f;
            try {
                if (!TextUtils.isEmpty(f.get("time"))) {
                    this.i = Long.parseLong(this.g.get("time"));
                }
            } catch (NumberFormatException unused) {
            }
            long j = this.i;
            h1.a(this.a).a(j > 0 ? j : -1L, false, true, this.k);
        }
        h1.a(this.a).a(3002);
    }

    public void b(boolean z) {
        if (TextUtils.isEmpty(this.g.get("action")) || this.b.a(this.g.get("action"), false, this.e, this.f, this.c, this.d)) {
            return;
        }
        xj a2 = x1.a(this.g.get("action"), this.c.i());
        if (a2 != null) {
            this.c.a(a2);
        }
        String str = null;
        yj yjVar = this.e;
        if (yjVar != null) {
            str = yjVar.j;
        } else {
            e eVar = this.f;
            if (eVar != null) {
                str = eVar.j;
            }
        }
        if (this.b.a(this.g.get("action"), false, false, this.c, false, false, str, this.d) <= 0 || !z) {
            return;
        }
        this.b.E();
    }

    public boolean b() {
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            r11 = this;
            java.lang.String r0 = "repeat"
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r11.g
            java.lang.String r2 = "state"
            java.lang.Object r1 = r1.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lc0
            android.content.Context r1 = r11.a
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r3 = "alarm"
            java.lang.Object r1 = r1.getSystemService(r3)
            r3 = r1
            android.app.AlarmManager r3 = (android.app.AlarmManager) r3
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r4 = r11.a
            java.lang.Class<com.comviva.webaxn.utils.SyncAlarmReceiver> r5 = com.comviva.webaxn.utils.SyncAlarmReceiver.class
            r1.<init>(r4, r5)
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r11.g
            java.lang.Object r4 = r4.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "on"
            boolean r4 = r4.equalsIgnoreCase(r5)
            r5 = 1010(0x3f2, float:1.415E-42)
            r10 = 1
            if (r4 == 0) goto L8e
            r2 = 0
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r11.g     // Catch: java.lang.NumberFormatException -> L57
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.NumberFormatException -> L57
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.NumberFormatException -> L57
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.NumberFormatException -> L57
            if (r4 != 0) goto L57
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r11.g     // Catch: java.lang.NumberFormatException -> L57
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.NumberFormatException -> L57
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L57
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L57
            goto L58
        L57:
            r0 = 0
        L58:
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r11.g
            java.lang.String r6 = "ontime"
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r6 = "url"
            r1.putExtra(r6, r4)
            java.lang.String r4 = "type"
            r1.putExtra(r4, r10)
            android.content.Context r4 = r11.a
            r6 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r9 = android.app.PendingIntent.getBroadcast(r4, r5, r1, r6)
            if (r0 != r10) goto L81
            r4 = 0
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r11.i
            r3.setInexactRepeating(r4, r5, r7, r9)
            goto Lbd
        L81:
            long r0 = r11.i
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r4
            r11.i = r0
            r3.set(r2, r0, r9)
            goto Lbd
        L8e:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r11.g
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "off"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto Lbd
            android.content.Context r0 = r11.a
            r2 = 268435456(0x10000000, float:2.524355E-29)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r0, r5, r1, r2)
            r3.cancel(r0)
            android.content.Context r0 = r11.a
            com.comviva.webaxn.utils.h1 r0 = com.comviva.webaxn.utils.h1.a(r0)
            r0.f()
            android.content.Context r0 = r11.a
            com.comviva.webaxn.utils.h1 r0 = com.comviva.webaxn.utils.h1.a(r0)
            r0.e()
            r11.j = r10
        Lbd:
            r11.b(r10)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.f0.c():void");
    }
}
