package com.comviva.webaxn.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import p000.C2991nj;

/* renamed from: com.comviva.webaxn.utils.u */
/* loaded from: classes.dex */
public class C0744u {

    /* renamed from: a */
    Context f5172a;

    /* renamed from: h */
    private float f5179h;

    /* renamed from: i */
    private float f5180i;

    /* renamed from: j */
    private String f5181j;

    /* renamed from: e */
    public float f5176e = -1.0f;

    /* renamed from: f */
    private int f5177f = -16777216;

    /* renamed from: b */
    private boolean f5173b = false;

    /* renamed from: k */
    private int f5182k = 0;

    /* renamed from: g */
    private int f5178g = -1;

    /* renamed from: l */
    private boolean f5183l = false;

    /* renamed from: c */
    private boolean f5174c = false;

    /* renamed from: d */
    private boolean f5175d = false;

    /* renamed from: m */
    private String f5184m = "Poppins-Regular.ttf";

    public C0744u(Context context, float f) {
        this.f5172a = context;
    }

    /* renamed from: a */
    public String m6052a() {
        return this.f5181j;
    }

    /* renamed from: a */
    public void m6053a(float f) {
        if (-1.0f == f) {
            f = C0713j1.m5563a(this.f5172a).m5598J();
            if (-1.0f == f) {
                f = C0713j1.m5563a(this.f5172a).m5730u();
            }
        }
        this.f5179h = f;
    }

    /* renamed from: a */
    public void m6054a(int i) {
        this.f5183l = true;
        this.f5182k = C0755x1.m6113a(i);
    }

    /* renamed from: a */
    public void m6055a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f5181j = null;
        } else {
            this.f5181j = new String(str);
        }
    }

    /* renamed from: a */
    public void m6056a(boolean z) {
        this.f5183l = z;
    }

    /* renamed from: b */
    public int m6057b() {
        return this.f5182k;
    }

    /* renamed from: b */
    public void m6058b(float f) {
        if (-1.0f == f) {
            f = C0713j1.m5563a(this.f5172a).m5601K();
            if (-1.0f == f) {
                f = C0713j1.m5563a(this.f5172a).m5734v();
            }
        }
        this.f5180i = f;
    }

    /* renamed from: b */
    public void m6059b(int i) {
        this.f5177f = C0755x1.m6113a(i);
        this.f5173b = true;
    }

    /* renamed from: b */
    public void m6060b(String str) {
        this.f5184m = str;
    }

    /* renamed from: b */
    public void m6061b(boolean z) {
        this.f5173b = z;
    }

    /* renamed from: c */
    public int m6062c() {
        return this.f5177f;
    }

    /* renamed from: c */
    public void m6063c(int i) {
        if (-1 == i && -1 == (i = C0713j1.m5563a(this.f5172a).m5604L())) {
            i = C0713j1.m5563a(this.f5172a).m5738w();
        }
        if (-1 == i) {
            i = C2991nj.f12339a;
        }
        this.f5174c = true;
        this.f5176e = i;
    }

    /* renamed from: d */
    public float m6064d() {
        return this.f5179h;
    }

    /* renamed from: d */
    public void m6065d(int i) {
        if (-1 == i && -1 == (i = C0713j1.m5563a(this.f5172a).m5606M())) {
            i = C0713j1.m5563a(this.f5172a).m5742x();
        }
        if (-1 == i) {
            i = 0;
        }
        this.f5175d = true;
        this.f5178g = i;
    }

    /* renamed from: e */
    public float m6066e() {
        return this.f5180i;
    }

    /* renamed from: f */
    public float m6067f() {
        return C0755x1.m6114a(this.f5172a, this.f5176e);
    }

    /* renamed from: g */
    public int m6068g() {
        return this.f5178g;
    }

    /* renamed from: h */
    public Typeface m6069h() {
        if (TextUtils.isEmpty(this.f5184m)) {
            String m5608N = C0713j1.m5563a(this.f5172a).m5608N();
            this.f5184m = m5608N;
            if (TextUtils.isEmpty(m5608N)) {
                this.f5184m = C0713j1.m5563a(this.f5172a).m5745y();
            }
        }
        if (!TextUtils.isEmpty(this.f5184m)) {
            try {
                return C0747v.m6081a(this.f5184m);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: i */
    public String m6070i() {
        return this.f5184m;
    }

    /* renamed from: j */
    public boolean m6071j() {
        return this.f5183l;
    }

    /* renamed from: k */
    public boolean m6072k() {
        return this.f5173b;
    }

    /* renamed from: l */
    public boolean m6073l() {
        return this.f5174c;
    }

    /* renamed from: m */
    public boolean m6074m() {
        return this.f5175d;
    }
}
