package com.comviva.webaxn.utils;

import android.content.Context;
import android.net.Uri;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.widget.TextView;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.Vector;

/* loaded from: classes.dex */
public class y0 {
    private static y0 u;
    private Context a;
    private HashMap<String, String> b;
    private wj c;
    private yj d;
    private e e;
    private mj f;
    private lj g;
    private boolean h;
    private CountDownTimer i;
    private long j;
    private TextView l;
    private String m;
    private String n;
    private boolean o;
    private int q;
    private int r;
    private String s;
    private String t;
    private long k = 1000;
    private String p = "ss";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends CountDownTimer {
        a(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            y0.this.h = false;
            if (y0.this.o) {
                y0.this.b(true);
            }
            y0 y0Var = y0.this;
            y0Var.b(Uri.decode((String) y0Var.b.get("timeout")));
            y0.this.e();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            if (y0.this.o) {
                y0.this.b(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y0.this.l.setText(" ");
        }
    }

    private y0(Context context) {
        this.a = context;
    }

    private long a(String str) {
        com.comviva.webaxn.ui.n1 n1Var;
        if (str.startsWith("$")) {
            str = str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length());
            yj a2 = this.g.f().a(str, (Vector<yj>) null);
            if (a2 == null || (n1Var = a2.a0) == null) {
                if (this.g.f().r != null) {
                    str = this.g.f().r.get(str);
                }
            } else if (n1Var instanceof com.comviva.webaxn.ui.w) {
                str = ((com.comviva.webaxn.ui.w) n1Var).m();
            } else if (n1Var instanceof com.comviva.webaxn.ui.v) {
                str = ((com.comviva.webaxn.ui.v) n1Var).m();
            }
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return -1L;
            }
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static y0 a(Context context) {
        if (u == null) {
            u = new y0(context);
        }
        return u;
    }

    private String a(long j) {
        Date date = new Date(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.p);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (TextUtils.isEmpty(str) || this.c.a(str, false, this.d, this.e, this.f, this.g)) {
            return;
        }
        xj a2 = x1.a(str, this.f.i());
        if (a2 != null) {
            this.f.a(a2);
        }
        if (this.c.a(str, false, false, this.f, false, false, null, this.g) > 0) {
            this.c.E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(boolean r7) {
        /*
            r6 = this;
            android.widget.TextView r0 = r6.l
            if (r0 == 0) goto Ld5
            java.lang.String r0 = r6.n
            java.lang.String r1 = "dec_time"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r6.m
            r0.append(r2)
            long r2 = r6.j
            java.lang.String r2 = r6.a(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            long r2 = r6.j
            long r4 = r6.k
            long r2 = r2 - r4
        L2b:
            r6.j = r2
            goto La7
        L2f:
            java.lang.String r0 = r6.n
            java.lang.String r2 = "inc_time"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L56
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r6.m
            r0.append(r2)
            long r2 = r6.j
            java.lang.String r2 = r6.a(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            long r2 = r6.j
            long r4 = r6.k
            long r2 = r2 + r4
            goto L2b
        L56:
            java.lang.String r0 = r6.n
            java.lang.String r2 = "dec_count"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L7f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r6.m
            r0.append(r2)
            int r2 = r6.q
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r2 = r6.q
            int r3 = r6.r
            int r2 = r2 - r3
        L7c:
            r6.q = r2
            goto La7
        L7f:
            java.lang.String r0 = r6.n
            java.lang.String r2 = "inc_count"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto La6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r6.m
            r0.append(r2)
            int r2 = r6.q
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r2 = r6.q
            int r3 = r6.r
            int r2 = r2 + r3
            goto L7c
        La6:
            r0 = r1
        La7:
            java.lang.String r2 = r6.s
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto Lc0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = r6.s
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        Lc0:
            android.widget.TextView r2 = r6.l
            r2.setText(r0)
            if (r7 == 0) goto Ld5
            android.widget.TextView r7 = r6.l
            com.comviva.webaxn.utils.y0$b r0 = new com.comviva.webaxn.utils.y0$b
            r0.<init>()
            r2 = 250(0xfa, double:1.235E-321)
            r7.postDelayed(r0, r2)
            r6.i = r1
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.y0.b(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (TextUtils.isEmpty(this.t) || !this.t.equals("otp")) {
            return;
        }
        n0.a(this.a).a(false);
    }

    public void a() {
        if (u != null) {
            u = null;
        }
        a(false);
        HashMap<String, String> hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
            this.b = null;
        }
        this.c = null;
        this.d = null;
        this.e = null;
        this.g = null;
        this.f = null;
        this.i = null;
    }

    public void a(String str, wj wjVar, mj mjVar, lj ljVar, yj yjVar, e eVar, boolean z) {
        this.c = wjVar;
        this.d = yjVar;
        this.e = eVar;
        this.f = mjVar;
        this.g = ljVar;
        if (!TextUtils.isEmpty(str)) {
            HashMap<String, String> hashMap = this.b;
            if (hashMap != null) {
                hashMap.clear();
            }
            this.b = x1.f(str);
        }
        if (!z) {
            a(true);
            b(this.b.get("action"));
            return;
        }
        this.h = false;
        this.n = null;
        this.l = null;
        this.m = null;
        this.o = false;
        this.q = 0;
        this.r = 1;
        this.s = null;
        this.t = null;
        if (TextUtils.isEmpty(this.b.get("time")) || TextUtils.isEmpty(this.b.get("timeout"))) {
            return;
        }
        this.t = this.b.get("source");
        String str2 = this.b.get("count_display");
        this.n = str2;
        if (!TextUtils.isEmpty(str2)) {
            this.o = true;
            b();
            if (!TextUtils.isEmpty(this.b.get("format"))) {
                this.p = this.b.get("format");
            }
            if (!TextUtils.isEmpty(this.b.get("min"))) {
                try {
                    this.q = Integer.parseInt(this.b.get("min"));
                } catch (NumberFormatException unused) {
                }
            }
            if (!TextUtils.isEmpty(this.b.get("max"))) {
                try {
                    this.q = Integer.parseInt(this.b.get("max"));
                } catch (NumberFormatException unused2) {
                }
            }
            if (!TextUtils.isEmpty(this.b.get("inc_dec_value"))) {
                try {
                    if (!TextUtils.isEmpty(this.b.get("inc_dec_value"))) {
                        this.r = Integer.parseInt(this.b.get("inc_dec_value"));
                    }
                } catch (NumberFormatException unused3) {
                }
            }
            if (!TextUtils.isEmpty(this.b.get("suffix"))) {
                this.s = this.b.get("suffix");
            }
        }
        long a2 = a(this.b.get("time"));
        this.j = a2;
        if (a2 != -1) {
            d();
        }
        String decode = Uri.decode(this.b.get("ontime"));
        if (TextUtils.isEmpty(decode) || this.c.a(decode, false, this.d, this.e, this.f, this.g)) {
            return;
        }
        xj a3 = x1.a(decode, this.f.i());
        if (a3 != null) {
            this.f.a(a3);
        }
        if (this.c.a(decode, false, false, this.f, false, false, null, this.g) > 0) {
            this.c.E();
        }
    }

    public void a(boolean z) {
        if (this.h) {
            this.h = false;
            this.i.cancel();
            this.i = null;
            if (z) {
                e();
            }
        }
    }

    public void b() {
        com.comviva.webaxn.ui.n1 n1Var;
        TextView n;
        String str = this.b.get("target");
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("$")) {
                str = str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length());
            }
            yj a2 = this.g.f().a(str, (Vector<yj>) null);
            if (a2 != null && (n1Var = a2.a0) != null) {
                if ((n1Var instanceof com.comviva.webaxn.ui.h0) || (n1Var instanceof com.comviva.webaxn.ui.g0)) {
                    n = ((com.comviva.webaxn.ui.g0) a2.a0).n();
                } else if (n1Var instanceof com.comviva.webaxn.ui.i0) {
                    n = ((com.comviva.webaxn.ui.i0) n1Var).m();
                }
                this.l = n;
                this.m = n.getText().toString();
            }
        }
        if (TextUtils.isEmpty(this.m) || !this.m.equals(" ")) {
            return;
        }
        this.m = "";
    }

    public boolean c() {
        return this.h;
    }

    public void d() {
        this.i = new a(this.j, this.k).start();
        if (this.o && this.n.equals("inc_time")) {
            this.j = 0L;
        }
        this.h = true;
    }
}
