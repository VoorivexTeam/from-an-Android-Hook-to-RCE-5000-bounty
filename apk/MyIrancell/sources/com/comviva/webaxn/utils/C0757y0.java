package com.comviva.webaxn.utils;

import android.content.Context;
import android.net.Uri;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.widget.TextView;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0630g0;
import com.comviva.webaxn.p002ui.C0633h0;
import com.comviva.webaxn.p002ui.C0636i0;
import com.comviva.webaxn.p002ui.C0668v;
import com.comviva.webaxn.p002ui.C0670w;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.Vector;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.y0 */
/* loaded from: classes.dex */
public class C0757y0 {

    /* renamed from: u */
    private static C0757y0 f5294u;

    /* renamed from: a */
    private Context f5295a;

    /* renamed from: b */
    private HashMap<String, String> f5296b;

    /* renamed from: c */
    private C3400wj f5297c;

    /* renamed from: d */
    private C3489yj f5298d;

    /* renamed from: e */
    private C0696e f5299e;

    /* renamed from: f */
    private C2945mj f5300f;

    /* renamed from: g */
    private C2899lj f5301g;

    /* renamed from: h */
    private boolean f5302h;

    /* renamed from: i */
    private CountDownTimer f5303i;

    /* renamed from: j */
    private long f5304j;

    /* renamed from: l */
    private TextView f5306l;

    /* renamed from: m */
    private String f5307m;

    /* renamed from: n */
    private String f5308n;

    /* renamed from: o */
    private boolean f5309o;

    /* renamed from: q */
    private int f5311q;

    /* renamed from: r */
    private int f5312r;

    /* renamed from: s */
    private String f5313s;

    /* renamed from: t */
    private String f5314t;

    /* renamed from: k */
    private long f5305k = 1000;

    /* renamed from: p */
    private String f5310p = "ss";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.y0$a */
    /* loaded from: classes.dex */
    public class a extends CountDownTimer {
        a(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            C0757y0.this.f5302h = false;
            if (C0757y0.this.f5309o) {
                C0757y0.this.m6211b(true);
            }
            C0757y0 c0757y0 = C0757y0.this;
            c0757y0.m6210b(Uri.decode((String) c0757y0.f5296b.get("timeout")));
            C0757y0.this.m6215e();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            if (C0757y0.this.f5309o) {
                C0757y0.this.m6211b(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.y0$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0757y0.this.f5306l.setText(" ");
        }
    }

    private C0757y0(Context context) {
        this.f5295a = context;
    }

    /* renamed from: a */
    private long m6203a(String str) {
        AbstractC0652n1 abstractC0652n1;
        if (str.startsWith("$")) {
            str = str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length());
            C3489yj m16930a = this.f5301g.m13901f().m16930a(str, (Vector<C3489yj>) null);
            if (m16930a == null || (abstractC0652n1 = m16930a.f14197a0) == null) {
                if (this.f5301g.m13901f().f14519r != null) {
                    str = this.f5301g.m13901f().f14519r.get(str);
                }
            } else if (abstractC0652n1 instanceof C0670w) {
                str = ((C0670w) abstractC0652n1).m5097m();
            } else if (abstractC0652n1 instanceof C0668v) {
                str = ((C0668v) abstractC0652n1).m5034m();
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

    /* renamed from: a */
    public static C0757y0 m6204a(Context context) {
        if (f5294u == null) {
            f5294u = new C0757y0(context);
        }
        return f5294u;
    }

    /* renamed from: a */
    private String m6205a(long j) {
        Date date = new Date(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.f5310p);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m6210b(String str) {
        if (TextUtils.isEmpty(str) || this.f5297c.m16298a(str, false, this.f5298d, this.f5299e, this.f5300f, this.f5301g)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(str, this.f5300f.m14145i());
        if (m6134a != null) {
            this.f5300f.m14121a(m6134a);
        }
        if (this.f5297c.m16263a(str, false, false, this.f5300f, false, false, null, this.f5301g) > 0) {
            this.f5297c.m16258E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00af  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m6211b(boolean r7) {
        /*
            r6 = this;
            android.widget.TextView r0 = r6.f5306l
            if (r0 == 0) goto Ld5
            java.lang.String r0 = r6.f5308n
            java.lang.String r1 = "dec_time"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r6.f5307m
            r0.append(r2)
            long r2 = r6.f5304j
            java.lang.String r2 = r6.m6205a(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            long r2 = r6.f5304j
            long r4 = r6.f5305k
            long r2 = r2 - r4
        L2b:
            r6.f5304j = r2
            goto La7
        L2f:
            java.lang.String r0 = r6.f5308n
            java.lang.String r2 = "inc_time"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L56
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r6.f5307m
            r0.append(r2)
            long r2 = r6.f5304j
            java.lang.String r2 = r6.m6205a(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            long r2 = r6.f5304j
            long r4 = r6.f5305k
            long r2 = r2 + r4
            goto L2b
        L56:
            java.lang.String r0 = r6.f5308n
            java.lang.String r2 = "dec_count"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L7f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r6.f5307m
            r0.append(r2)
            int r2 = r6.f5311q
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r2 = r6.f5311q
            int r3 = r6.f5312r
            int r2 = r2 - r3
        L7c:
            r6.f5311q = r2
            goto La7
        L7f:
            java.lang.String r0 = r6.f5308n
            java.lang.String r2 = "inc_count"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto La6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r6.f5307m
            r0.append(r2)
            int r2 = r6.f5311q
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r2 = r6.f5311q
            int r3 = r6.f5312r
            int r2 = r2 + r3
            goto L7c
        La6:
            r0 = r1
        La7:
            java.lang.String r2 = r6.f5313s
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto Lc0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = r6.f5313s
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        Lc0:
            android.widget.TextView r2 = r6.f5306l
            r2.setText(r0)
            if (r7 == 0) goto Ld5
            android.widget.TextView r7 = r6.f5306l
            com.comviva.webaxn.utils.y0$b r0 = new com.comviva.webaxn.utils.y0$b
            r0.<init>()
            r2 = 250(0xfa, double:1.235E-321)
            r7.postDelayed(r0, r2)
            r6.f5303i = r1
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0757y0.m6211b(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m6215e() {
        if (TextUtils.isEmpty(this.f5314t) || !this.f5314t.equals("otp")) {
            return;
        }
        C0724n0.m5893a(this.f5295a).m5908a(false);
    }

    /* renamed from: a */
    public void m6216a() {
        if (f5294u != null) {
            f5294u = null;
        }
        m6218a(false);
        HashMap<String, String> hashMap = this.f5296b;
        if (hashMap != null) {
            hashMap.clear();
            this.f5296b = null;
        }
        this.f5297c = null;
        this.f5298d = null;
        this.f5299e = null;
        this.f5301g = null;
        this.f5300f = null;
        this.f5303i = null;
    }

    /* renamed from: a */
    public void m6217a(String str, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, C3489yj c3489yj, C0696e c0696e, boolean z) {
        this.f5297c = c3400wj;
        this.f5298d = c3489yj;
        this.f5299e = c0696e;
        this.f5300f = c2945mj;
        this.f5301g = c2899lj;
        if (!TextUtils.isEmpty(str)) {
            HashMap<String, String> hashMap = this.f5296b;
            if (hashMap != null) {
                hashMap.clear();
            }
            this.f5296b = C0755x1.m6188f(str);
        }
        if (!z) {
            m6218a(true);
            m6210b(this.f5296b.get("action"));
            return;
        }
        this.f5302h = false;
        this.f5308n = null;
        this.f5306l = null;
        this.f5307m = null;
        this.f5309o = false;
        this.f5311q = 0;
        this.f5312r = 1;
        this.f5313s = null;
        this.f5314t = null;
        if (TextUtils.isEmpty(this.f5296b.get("time")) || TextUtils.isEmpty(this.f5296b.get("timeout"))) {
            return;
        }
        this.f5314t = this.f5296b.get("source");
        String str2 = this.f5296b.get("count_display");
        this.f5308n = str2;
        if (!TextUtils.isEmpty(str2)) {
            this.f5309o = true;
            m6219b();
            if (!TextUtils.isEmpty(this.f5296b.get("format"))) {
                this.f5310p = this.f5296b.get("format");
            }
            if (!TextUtils.isEmpty(this.f5296b.get("min"))) {
                try {
                    this.f5311q = Integer.parseInt(this.f5296b.get("min"));
                } catch (NumberFormatException unused) {
                }
            }
            if (!TextUtils.isEmpty(this.f5296b.get("max"))) {
                try {
                    this.f5311q = Integer.parseInt(this.f5296b.get("max"));
                } catch (NumberFormatException unused2) {
                }
            }
            if (!TextUtils.isEmpty(this.f5296b.get("inc_dec_value"))) {
                try {
                    if (!TextUtils.isEmpty(this.f5296b.get("inc_dec_value"))) {
                        this.f5312r = Integer.parseInt(this.f5296b.get("inc_dec_value"));
                    }
                } catch (NumberFormatException unused3) {
                }
            }
            if (!TextUtils.isEmpty(this.f5296b.get("suffix"))) {
                this.f5313s = this.f5296b.get("suffix");
            }
        }
        long m6203a = m6203a(this.f5296b.get("time"));
        this.f5304j = m6203a;
        if (m6203a != -1) {
            m6221d();
        }
        String decode = Uri.decode(this.f5296b.get("ontime"));
        if (TextUtils.isEmpty(decode) || this.f5297c.m16298a(decode, false, this.f5298d, this.f5299e, this.f5300f, this.f5301g)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(decode, this.f5300f.m14145i());
        if (m6134a != null) {
            this.f5300f.m14121a(m6134a);
        }
        if (this.f5297c.m16263a(decode, false, false, this.f5300f, false, false, null, this.f5301g) > 0) {
            this.f5297c.m16258E();
        }
    }

    /* renamed from: a */
    public void m6218a(boolean z) {
        if (this.f5302h) {
            this.f5302h = false;
            this.f5303i.cancel();
            this.f5303i = null;
            if (z) {
                m6215e();
            }
        }
    }

    /* renamed from: b */
    public void m6219b() {
        AbstractC0652n1 abstractC0652n1;
        TextView m4378n;
        String str = this.f5296b.get("target");
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("$")) {
                str = str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length());
            }
            C3489yj m16930a = this.f5301g.m13901f().m16930a(str, (Vector<C3489yj>) null);
            if (m16930a != null && (abstractC0652n1 = m16930a.f14197a0) != null) {
                if ((abstractC0652n1 instanceof C0633h0) || (abstractC0652n1 instanceof C0630g0)) {
                    m4378n = ((C0630g0) m16930a.f14197a0).m4378n();
                } else if (abstractC0652n1 instanceof C0636i0) {
                    m4378n = ((C0636i0) abstractC0652n1).m4500m();
                }
                this.f5306l = m4378n;
                this.f5307m = m4378n.getText().toString();
            }
        }
        if (TextUtils.isEmpty(this.f5307m) || !this.f5307m.equals(" ")) {
            return;
        }
        this.f5307m = "";
    }

    /* renamed from: c */
    public boolean m6220c() {
        return this.f5302h;
    }

    /* renamed from: d */
    public void m6221d() {
        this.f5303i = new a(this.f5304j, this.f5305k).start();
        if (this.f5309o && this.f5308n.equals("inc_time")) {
            this.f5304j = 0L;
        }
        this.f5302h = true;
    }
}
