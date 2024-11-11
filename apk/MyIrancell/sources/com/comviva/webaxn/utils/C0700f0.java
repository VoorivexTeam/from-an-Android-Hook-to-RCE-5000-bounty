package com.comviva.webaxn.utils;

import android.content.Context;
import android.text.TextUtils;
import com.comviva.webaxn.utils.C0755x1;
import java.util.HashMap;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.f0 */
/* loaded from: classes.dex */
public class C0700f0 {

    /* renamed from: l */
    private static C0700f0 f4771l;

    /* renamed from: a */
    private Context f4772a;

    /* renamed from: b */
    private C3400wj f4773b;

    /* renamed from: c */
    private C2945mj f4774c;

    /* renamed from: d */
    private C2899lj f4775d;

    /* renamed from: e */
    private C3489yj f4776e;

    /* renamed from: f */
    private C0696e f4777f;

    /* renamed from: g */
    private HashMap<String, String> f4778g;

    /* renamed from: h */
    private String f4779h;

    /* renamed from: i */
    private long f4780i = 0;

    /* renamed from: j */
    private boolean f4781j = false;

    /* renamed from: k */
    public final C0755x1.l f4782k = new a();

    /* renamed from: com.comviva.webaxn.utils.f0$a */
    /* loaded from: classes.dex */
    class a implements C0755x1.l {
        a() {
        }

        @Override // com.comviva.webaxn.utils.C0755x1.l
        /* renamed from: a */
        public void mo5452a(boolean z) {
            C0700f0.this.m5451c();
        }
    }

    private C0700f0(Context context) {
        this.f4772a = context;
    }

    /* renamed from: a */
    public static C0700f0 m5446a(Context context) {
        if (f4771l == null) {
            f4771l = new C0700f0(context);
        }
        return f4771l;
    }

    /* renamed from: a */
    public void m5447a() {
        if (f4771l != null) {
            f4771l = null;
        }
        HashMap<String, String> hashMap = this.f4778g;
        if (hashMap != null) {
            hashMap.clear();
            this.f4778g = null;
        }
        this.f4772a = null;
        this.f4773b = null;
        this.f4776e = null;
        this.f4777f = null;
        this.f4774c = null;
        this.f4775d = null;
        this.f4781j = false;
    }

    /* renamed from: a */
    public void m5448a(boolean z) {
        if (z) {
            HashMap<String, String> hashMap = this.f4778g;
            if (hashMap != null) {
                hashMap.clear();
            }
            HashMap<String, String> m6188f = C0755x1.m6188f(this.f4779h);
            this.f4778g = m6188f;
            try {
                if (!TextUtils.isEmpty(m6188f.get("time"))) {
                    this.f4780i = Long.parseLong(this.f4778g.get("time"));
                }
            } catch (NumberFormatException unused) {
            }
            long j = this.f4780i;
            C0707h1.m5496a(this.f4772a).m5515a(j > 0 ? j : -1L, false, true, this.f4782k);
        }
        C0707h1.m5496a(this.f4772a).m5514a(3002);
    }

    /* renamed from: b */
    public void m5449b(boolean z) {
        if (TextUtils.isEmpty(this.f4778g.get("action")) || this.f4773b.m16298a(this.f4778g.get("action"), false, this.f4776e, this.f4777f, this.f4774c, this.f4775d)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(this.f4778g.get("action"), this.f4774c.m14145i());
        if (m6134a != null) {
            this.f4774c.m14121a(m6134a);
        }
        String str = null;
        C3489yj c3489yj = this.f4776e;
        if (c3489yj != null) {
            str = c3489yj.f14223j;
        } else {
            C0696e c0696e = this.f4777f;
            if (c0696e != null) {
                str = c0696e.f4718j;
            }
        }
        if (this.f4773b.m16263a(this.f4778g.get("action"), false, false, this.f4774c, false, false, str, this.f4775d) <= 0 || !z) {
            return;
        }
        this.f4773b.m16258E();
    }

    /* renamed from: b */
    public boolean m5450b() {
        return this.f4781j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m5451c() {
        /*
            r11 = this;
            java.lang.String r0 = "repeat"
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r11.f4778g
            java.lang.String r2 = "state"
            java.lang.Object r1 = r1.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lc0
            android.content.Context r1 = r11.f4772a
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r3 = "alarm"
            java.lang.Object r1 = r1.getSystemService(r3)
            r3 = r1
            android.app.AlarmManager r3 = (android.app.AlarmManager) r3
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r4 = r11.f4772a
            java.lang.Class<com.comviva.webaxn.utils.SyncAlarmReceiver> r5 = com.comviva.webaxn.utils.SyncAlarmReceiver.class
            r1.<init>(r4, r5)
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r11.f4778g
            java.lang.Object r4 = r4.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "on"
            boolean r4 = r4.equalsIgnoreCase(r5)
            r5 = 1010(0x3f2, float:1.415E-42)
            r10 = 1
            if (r4 == 0) goto L8e
            r2 = 0
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r11.f4778g     // Catch: java.lang.NumberFormatException -> L57
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.NumberFormatException -> L57
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.NumberFormatException -> L57
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.NumberFormatException -> L57
            if (r4 != 0) goto L57
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r11.f4778g     // Catch: java.lang.NumberFormatException -> L57
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.NumberFormatException -> L57
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L57
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L57
            goto L58
        L57:
            r0 = 0
        L58:
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r11.f4778g
            java.lang.String r6 = "ontime"
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r6 = "url"
            r1.putExtra(r6, r4)
            java.lang.String r4 = "type"
            r1.putExtra(r4, r10)
            android.content.Context r4 = r11.f4772a
            r6 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r9 = android.app.PendingIntent.getBroadcast(r4, r5, r1, r6)
            if (r0 != r10) goto L81
            r4 = 0
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r11.f4780i
            r3.setInexactRepeating(r4, r5, r7, r9)
            goto Lbd
        L81:
            long r0 = r11.f4780i
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r4
            r11.f4780i = r0
            r3.set(r2, r0, r9)
            goto Lbd
        L8e:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r11.f4778g
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "off"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto Lbd
            android.content.Context r0 = r11.f4772a
            r2 = 268435456(0x10000000, float:2.524355E-29)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r0, r5, r1, r2)
            r3.cancel(r0)
            android.content.Context r0 = r11.f4772a
            com.comviva.webaxn.utils.h1 r0 = com.comviva.webaxn.utils.C0707h1.m5496a(r0)
            r0.m5520f()
            android.content.Context r0 = r11.f4772a
            com.comviva.webaxn.utils.h1 r0 = com.comviva.webaxn.utils.C0707h1.m5496a(r0)
            r0.m5519e()
            r11.f4781j = r10
        Lbd:
            r11.m5449b(r10)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0700f0.m5451c():void");
    }
}
