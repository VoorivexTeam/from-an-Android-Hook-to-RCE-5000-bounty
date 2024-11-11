package com.comviva.webaxn.utils;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0668v;
import com.comviva.webaxn.p002ui.C0670w;
import com.comviva.webaxn.utils.C0755x1;
import java.util.HashMap;
import java.util.Vector;
import p000.AbstractC2871ks;
import p000.C2439eo;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;
import p000.InterfaceC2524gs;
import p000.InterfaceC2564hs;

/* renamed from: com.comviva.webaxn.utils.n0 */
/* loaded from: classes.dex */
public class C0724n0 {

    /* renamed from: n */
    private static C0724n0 f5015n;

    /* renamed from: a */
    private Context f5016a;

    /* renamed from: b */
    private HashMap<String, String> f5017b;

    /* renamed from: c */
    private C3400wj f5018c;

    /* renamed from: d */
    private C3489yj f5019d;

    /* renamed from: e */
    private C0696e f5020e;

    /* renamed from: f */
    private C2945mj f5021f;

    /* renamed from: g */
    private C2899lj f5022g;

    /* renamed from: i */
    private String f5024i;

    /* renamed from: k */
    private C0752w1 f5026k;

    /* renamed from: h */
    private boolean f5023h = false;

    /* renamed from: j */
    private int f5025j = 0;

    /* renamed from: l */
    private boolean f5027l = false;

    /* renamed from: m */
    private final C0755x1.m f5028m = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.n0$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC2564hs<Void> {
        a(C0724n0 c0724n0) {
        }

        @Override // p000.InterfaceC2564hs
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo3190a(Void r1) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.n0$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC2524gs {
        b(C0724n0 c0724n0) {
        }

        @Override // p000.InterfaceC2524gs
        /* renamed from: a */
        public void mo3189a(Exception exc) {
        }
    }

    /* renamed from: com.comviva.webaxn.utils.n0$c */
    /* loaded from: classes.dex */
    class c implements C0755x1.m {
        c() {
        }

        @Override // com.comviva.webaxn.utils.C0755x1.m
        /* renamed from: a */
        public void mo5914a() {
            C0724n0.this.f5023h = false;
            C0724n0.this.m5910b(Uri.decode((String) C0724n0.this.f5017b.get("timeout_act")));
            C0724n0.this.m5903i();
        }

        @Override // com.comviva.webaxn.utils.C0755x1.m
        /* renamed from: a */
        public void mo5915a(String str) {
            C0724n0.this.f5023h = false;
            C0724n0.this.m5905a(str);
            if (C0724n0.this.f5027l) {
                C0757y0.m6204a(C0724n0.this.f5016a).m6218a(false);
            }
            C0724n0.this.m5903i();
        }
    }

    private C0724n0(Context context) {
        this.f5016a = context;
    }

    /* renamed from: a */
    public static C0724n0 m5893a(Context context) {
        if (f5015n == null) {
            f5015n = new C0724n0(context);
        }
        return f5015n;
    }

    /* renamed from: c */
    private void m5898c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f5018c.m16298a(Uri.decode(str), false, this.f5019d, this.f5020e, this.f5021f, this.f5022g);
        this.f5027l = true;
    }

    /* renamed from: f */
    private void m5900f() {
        m5902h();
        m5898c(this.f5017b.get("ctimer"));
        if (!TextUtils.isEmpty(this.f5017b.get("receive_act"))) {
            m5910b(this.f5017b.get("action"));
        }
        this.f5023h = true;
        if (!TextUtils.isEmpty(this.f5017b.get("delimeter"))) {
            this.f5024i = this.f5017b.get("delimeter");
        }
        if (TextUtils.isEmpty(this.f5017b.get("len"))) {
            return;
        }
        try {
            this.f5025j = Integer.parseInt(this.f5017b.get("len"));
        } catch (NumberFormatException unused) {
        }
    }

    /* renamed from: g */
    private void m5901g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        C0752w1 c0752w1 = new C0752w1();
        this.f5026k = c0752w1;
        this.f5016a.registerReceiver(c0752w1, intentFilter);
    }

    /* renamed from: h */
    private void m5902h() {
        AbstractC2871ks<Void> mo11795h = C2439eo.m11627a(this.f5016a).mo11795h();
        mo11795h.mo11810a(new a(this));
        mo11795h.mo11809a(new b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m5903i() {
        this.f5016a.unregisterReceiver(this.f5026k);
    }

    /* renamed from: a */
    public void m5904a() {
        if (this.f5023h) {
            this.f5023h = false;
            m5903i();
        }
        if (f5015n != null) {
            f5015n = null;
        }
        HashMap<String, String> hashMap = this.f5017b;
        if (hashMap != null) {
            hashMap.clear();
            this.f5017b = null;
        }
        this.f5016a = null;
        this.f5018c = null;
        this.f5019d = null;
        this.f5020e = null;
        this.f5022g = null;
        this.f5021f = null;
    }

    /* renamed from: a */
    public void m5905a(String str) {
        int i;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (this.f5017b.size() > 0) {
                String[] split = this.f5017b.get("target").trim().split(";");
                String str2 = this.f5017b.get("multi");
                int i2 = 0;
                if (TextUtils.isEmpty(str2)) {
                    int length = split.length;
                    while (i2 < length) {
                        String str3 = split[i2];
                        if (!TextUtils.isEmpty(str3)) {
                            if (str3.startsWith("$") && str3.endsWith("$")) {
                                str3 = str3.substring(1, str3.length() - 1);
                            }
                            m5906a(str3, str);
                        }
                        i2++;
                    }
                } else {
                    try {
                        i = Integer.parseInt(str2);
                    } catch (NumberFormatException unused) {
                        i = 0;
                    }
                    if (i == split.length) {
                        while (i2 < i) {
                            String str4 = split[i2];
                            if (!TextUtils.isEmpty(str4)) {
                                if (str4.startsWith("$") && str4.endsWith("$")) {
                                    str4 = str4.substring(1, str4.length() - 1);
                                }
                                m5906a(str4, str.substring(i2, i2 + 1));
                            }
                            i2++;
                        }
                    }
                }
            }
            m5910b(!TextUtils.isEmpty(this.f5017b.get("receive_act")) ? Uri.decode(this.f5017b.get("receive_act")) : this.f5017b.get("action"));
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    public void m5906a(String str, String str2) {
        AbstractC0652n1 abstractC0652n1;
        if (this.f5022g.m13901f() != null) {
            C3489yj m16930a = this.f5022g.m13901f().m16930a(str, (Vector<C3489yj>) null);
            if (m16930a == null || (abstractC0652n1 = m16930a.f14197a0) == null) {
                if (this.f5022g.m13901f().f14519r == null || !this.f5022g.m13901f().f14519r.containsKey(str)) {
                    return;
                }
                this.f5022g.m13901f().m16931a(str, str2);
                return;
            }
            if (abstractC0652n1 instanceof C0670w) {
                C0670w c0670w = (C0670w) abstractC0652n1;
                c0670w.m5093h(str2);
                c0670w.m5090g(str2.length());
            } else if (abstractC0652n1 instanceof C0668v) {
                C0668v c0668v = (C0668v) abstractC0652n1;
                c0668v.m5029f(str2);
                c0668v.m5030g(str2.length());
            }
        }
    }

    /* renamed from: a */
    public void m5907a(String str, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, C3489yj c3489yj, C0696e c0696e, boolean z) {
        this.f5018c = c3400wj;
        this.f5019d = c3489yj;
        this.f5020e = c0696e;
        this.f5021f = c2945mj;
        this.f5022g = c2899lj;
        if (!TextUtils.isEmpty(str)) {
            HashMap<String, String> hashMap = this.f5017b;
            if (hashMap != null) {
                hashMap.clear();
            }
            this.f5017b = C0755x1.m6188f(str);
            this.f5025j = 0;
            this.f5027l = false;
        }
        if (!z || this.f5017b.size() <= 0) {
            return;
        }
        m5901g();
        m5900f();
    }

    /* renamed from: a */
    public void m5908a(boolean z) {
        if (this.f5023h) {
            this.f5023h = false;
            m5903i();
        }
        if (z) {
            m5910b(this.f5017b.get("action"));
        }
    }

    /* renamed from: b */
    public String m5909b() {
        return this.f5024i;
    }

    /* renamed from: b */
    public void m5910b(String str) {
        if (TextUtils.isEmpty(str) || !C0755x1.f5254l || this.f5018c.m16298a(str, false, this.f5019d, this.f5020e, this.f5021f, this.f5022g)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(str, this.f5021f.m14145i());
        if (m6134a != null) {
            this.f5021f.m14121a(m6134a);
        }
        String str2 = null;
        C3489yj c3489yj = this.f5019d;
        if (c3489yj != null) {
            str2 = c3489yj.f14223j;
        } else {
            C0696e c0696e = this.f5020e;
            if (c0696e != null) {
                str2 = c0696e.f4718j;
            }
        }
        if (this.f5018c.m16263a(str, false, false, this.f5021f, false, false, str2, this.f5022g) > 0) {
            this.f5018c.m16258E();
        }
    }

    /* renamed from: c */
    public int m5911c() {
        return this.f5025j;
    }

    /* renamed from: d */
    public C0755x1.m m5912d() {
        return this.f5028m;
    }

    /* renamed from: e */
    public boolean m5913e() {
        return this.f5023h;
    }
}
