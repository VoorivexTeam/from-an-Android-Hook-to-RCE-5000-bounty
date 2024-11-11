package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0668v;
import com.comviva.webaxn.p002ui.C0670w;
import com.comviva.webaxn.utils.C0755x1;
import java.util.HashMap;
import java.util.Vector;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.f */
/* loaded from: classes.dex */
public class C0699f {

    /* renamed from: m */
    private static C0699f f4757m;

    /* renamed from: a */
    private Context f4758a;

    /* renamed from: b */
    private HashMap<String, String> f4759b;

    /* renamed from: c */
    private C3489yj f4760c;

    /* renamed from: d */
    private C0696e f4761d;

    /* renamed from: e */
    private C2945mj f4762e;

    /* renamed from: f */
    private C2899lj f4763f;

    /* renamed from: g */
    private C3400wj f4764g;

    /* renamed from: h */
    private int f4765h;

    /* renamed from: i */
    private int f4766i;

    /* renamed from: j */
    private String f4767j;

    /* renamed from: k */
    private boolean f4768k;

    /* renamed from: l */
    private final C0755x1.o f4769l = new a();

    /* renamed from: com.comviva.webaxn.utils.f$a */
    /* loaded from: classes.dex */
    class a implements C0755x1.o {
        a() {
        }

        @Override // com.comviva.webaxn.utils.C0755x1.o
        /* renamed from: a */
        public void mo4309a(boolean z) {
            if (z) {
                C0699f.this.m5442c();
            }
        }
    }

    private C0699f(Context context) {
        this.f4758a = context;
    }

    /* renamed from: a */
    public static C0699f m5439a(Context context) {
        if (f4757m == null) {
            f4757m = new C0699f(context);
        }
        return f4757m;
    }

    /* renamed from: b */
    private void m5441b() {
        if (C0722m1.m5887a(this.f4758a, new String[]{"android.permission.READ_CONTACTS"})) {
            m5442c();
            return;
        }
        if (C0713j1.m5563a(this.f4758a).m5647d("android.permission.READ_CONTACTS") == -1) {
            C0722m1.m5885a((Activity) this.f4758a, new String[]{"android.permission.READ_CONTACTS"}, 3);
        } else {
            if (!C0722m1.m5886a(this.f4758a, "android.permission.READ_CONTACTS")) {
                C0755x1.m6181d(this.f4758a, "msg.rpCon");
                return;
            }
            C0722m1.m5885a((Activity) this.f4758a, new String[]{"android.permission.READ_CONTACTS"}, 3);
        }
        this.f4764g.m16337n().mo4083a(this.f4769l);
        C0755x1.f5264v = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m5442c() {
        HashMap<String, String> m6188f = C0755x1.m6188f(this.f4767j);
        this.f4759b = m6188f;
        if (!this.f4768k) {
            C0731p1.m5949a(this.f4758a, 2002);
            return;
        }
        this.f4765h = 1;
        this.f4766i = 0;
        if (!TextUtils.isEmpty(m6188f.get("min"))) {
            try {
                int parseInt = Integer.parseInt(this.f4759b.get("min"));
                this.f4765h = parseInt;
                if (parseInt == 0) {
                    this.f4765h = 1;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (!TextUtils.isEmpty(this.f4759b.get("max"))) {
            try {
                this.f4766i = Integer.parseInt(this.f4759b.get("max"));
            } catch (NumberFormatException unused2) {
            }
        }
        C0731p1.m5950a(this.f4758a, this.f4765h, this.f4766i, 2003);
    }

    /* renamed from: a */
    public HashMap<String, String> m5443a() {
        return this.f4759b;
    }

    /* renamed from: a */
    public void m5444a(String str, String str2) {
        AbstractC0652n1 abstractC0652n1;
        if (TextUtils.isEmpty(str) || this.f4759b.size() <= 0) {
            return;
        }
        String str3 = this.f4759b.get("target");
        String str4 = null;
        if (!TextUtils.isEmpty(str3) && str3.startsWith("$") && str3.endsWith("$")) {
            String substring = str3.substring(1, str3.length() - 1);
            if (!TextUtils.isEmpty(this.f4759b.get("len"))) {
                try {
                    int parseInt = Integer.parseInt(this.f4759b.get("len"));
                    int length = str.length();
                    if (length > parseInt) {
                        str = str.substring(length - parseInt, str.length());
                    }
                } catch (NumberFormatException unused) {
                }
            }
            if (this.f4763f.m13901f() != null) {
                C3489yj m16930a = this.f4763f.m13901f().m16930a(substring, (Vector<C3489yj>) null);
                if (m16930a == null || (abstractC0652n1 = m16930a.f14197a0) == null) {
                    if (this.f4763f.m13901f().f14519r != null && this.f4763f.m13901f().f14519r.containsKey(substring)) {
                        this.f4763f.m13901f().m16931a(substring, str);
                    }
                } else if (abstractC0652n1 instanceof C0670w) {
                    C0670w c0670w = (C0670w) abstractC0652n1;
                    c0670w.m5093h(str);
                    c0670w.m5090g(str.length());
                } else if (abstractC0652n1 instanceof C0668v) {
                    C0668v c0668v = (C0668v) abstractC0652n1;
                    c0668v.m5029f(str);
                    c0668v.m5030g(str.length());
                }
            }
        }
        String str5 = this.f4759b.get("action");
        if (TextUtils.isEmpty(str5) || !C0755x1.f5254l || this.f4764g.m16298a(str5, false, this.f4760c, this.f4761d, this.f4762e, this.f4763f)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(str5, this.f4762e.m14145i());
        if (m6134a != null) {
            this.f4762e.m14121a(m6134a);
        }
        C3489yj c3489yj = this.f4760c;
        if (c3489yj != null) {
            str4 = c3489yj.f14223j;
        } else {
            C0696e c0696e = this.f4761d;
            if (c0696e != null) {
                str4 = c0696e.f4718j;
            }
        }
        if (this.f4764g.m16263a(str5, false, false, this.f4762e, false, false, str4, this.f4763f) > 0) {
            this.f4764g.m16258E();
        }
    }

    /* renamed from: a */
    public void m5445a(String str, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, C3489yj c3489yj, C0696e c0696e, boolean z) {
        this.f4767j = str;
        this.f4764g = c3400wj;
        this.f4760c = c3489yj;
        this.f4761d = c0696e;
        this.f4762e = c2945mj;
        this.f4763f = c2899lj;
        this.f4768k = z;
        HashMap<String, String> hashMap = this.f4759b;
        if (hashMap != null) {
            hashMap.clear();
        }
        m5441b();
    }
}
