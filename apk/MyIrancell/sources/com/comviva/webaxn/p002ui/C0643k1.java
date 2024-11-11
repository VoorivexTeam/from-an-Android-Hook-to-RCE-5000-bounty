package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.comviva.webaxn.utils.C0696e;
import com.comviva.webaxn.utils.C0719l1;
import com.comviva.webaxn.utils.C0731p1;
import com.comviva.webaxn.utils.C0755x1;
import p000.C3489yj;
import p000.C3531zj;

/* renamed from: com.comviva.webaxn.ui.k1 */
/* loaded from: classes.dex */
public class C0643k1 {

    /* renamed from: h */
    private C0755x1.p f3930h;

    /* renamed from: i */
    private C0696e f3931i;

    /* renamed from: j */
    public C0719l1 f3932j;

    /* renamed from: k */
    public Context f3933k;

    /* renamed from: l */
    public C3531zj f3934l;

    /* renamed from: m */
    public C0655o1 f3935m;

    /* renamed from: q */
    public String f3939q;

    /* renamed from: r */
    public String f3940r;

    /* renamed from: a */
    public boolean f3923a = false;

    /* renamed from: b */
    public boolean f3924b = false;

    /* renamed from: c */
    public boolean f3925c = false;

    /* renamed from: d */
    public boolean f3926d = false;

    /* renamed from: e */
    public long f3927e = -1;

    /* renamed from: f */
    public String f3928f = null;

    /* renamed from: g */
    Handler f3929g = null;

    /* renamed from: n */
    public boolean f3936n = false;

    /* renamed from: o */
    Runnable f3937o = null;

    /* renamed from: p */
    public int f3938p = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.k1$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0643k1.this.f3931i = new C0696e();
            C0643k1 c0643k1 = C0643k1.this;
            if (!c0643k1.f3923a) {
                c0643k1.f3931i.f4730v = true;
            }
            C0643k1.this.f3931i.f4715g = "ok";
            if (C0643k1.this.f3928f.startsWith("#")) {
                C0643k1.this.f3931i.f4716h = "Menulist:";
                C0643k1.this.f3931i.f4717i = C0643k1.this.f3928f.substring(1);
            } else {
                C0643k1.this.f3931i.f4716h = C0643k1.this.f3928f;
            }
            C0755x1.f5239C = true;
            C0755x1.p pVar = C0643k1.this.f3930h;
            C0696e c0696e = C0643k1.this.f3931i;
            C0643k1 c0643k12 = C0643k1.this;
            pVar.mo4838a(c0696e, c0643k12.f3935m.f4137e, c0643k12.f3934l, true);
            C0643k1 c0643k13 = C0643k1.this;
            c0643k13.f3938p = 0;
            if (TextUtils.isEmpty(c0643k13.f3939q)) {
                return;
            }
            C0643k1 c0643k14 = C0643k1.this;
            C0731p1.m5954a(c0643k14.f3933k, c0643k14.f3939q, c0643k14.f3935m, (C3489yj) null);
        }
    }

    public C0643k1(Context context, C3531zj c3531zj) {
        this.f3933k = context;
        this.f3934l = c3531zj;
    }

    /* renamed from: a */
    public void m4605a() {
        Handler handler = this.f3929g;
        if (handler != null) {
            handler.removeCallbacks(this.f3937o);
        }
        this.f3936n = false;
        this.f3938p = -1;
        this.f3929g = null;
    }

    /* renamed from: a */
    public void m4606a(long j) {
        a aVar = new a();
        this.f3937o = aVar;
        this.f3938p = 1;
        this.f3929g.postDelayed(aVar, j);
    }

    /* renamed from: a */
    public void m4607a(C0755x1.p pVar) {
        this.f3930h = pVar;
    }

    /* renamed from: a */
    public void m4608a(boolean z, boolean z2, C0655o1 c0655o1) {
        try {
            if (this.f3929g == null) {
                this.f3929g = new Handler();
            }
            this.f3935m = c0655o1;
            if (-1 < this.f3927e) {
                if (this.f3924b || this.f3925c || this.f3926d) {
                    if (!z2 || this.f3936n) {
                        return;
                    }
                    if (this.f3926d) {
                        this.f3936n = true;
                    } else if (z) {
                        if (!this.f3924b) {
                            return;
                        } else {
                            this.f3936n = true;
                        }
                    } else if (!this.f3925c) {
                        return;
                    } else {
                        this.f3936n = true;
                    }
                }
                m4606a(this.f3927e);
            }
        } catch (Exception unused) {
        }
    }
}
