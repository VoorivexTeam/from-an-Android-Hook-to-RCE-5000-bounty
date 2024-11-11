package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.graphics.Rect;
import java.util.Vector;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.j0 */
/* loaded from: classes.dex */
public class C0639j0 {

    /* renamed from: a */
    public int f3864a;

    /* renamed from: b */
    public int f3865b;

    /* renamed from: c */
    public int f3866c;

    /* renamed from: d */
    public int f3867d;

    /* renamed from: e */
    public int f3868e;

    /* renamed from: f */
    public int f3869f;

    /* renamed from: h */
    public int f3871h;

    /* renamed from: i */
    public int f3872i;

    /* renamed from: j */
    public int f3873j;

    /* renamed from: l */
    public C0639j0 f3875l;

    /* renamed from: m */
    public boolean f3876m;

    /* renamed from: n */
    public AbstractC0652n1 f3877n;

    /* renamed from: p */
    public C3489yj f3879p;

    /* renamed from: q */
    public C0669v0 f3880q;

    /* renamed from: g */
    public int f3870g = -2;

    /* renamed from: k */
    public int f3874k = -1;

    /* renamed from: r */
    public boolean f3881r = false;

    /* renamed from: o */
    public Vector<C0639j0> f3878o = new Vector<>();

    public C0639j0(Context context) {
        C0669v0 c0669v0 = new C0669v0();
        this.f3880q = c0669v0;
        c0669v0.f4397c = new Rect();
    }

    /* renamed from: a */
    public int m4519a() {
        C3489yj c3489yj;
        Vector<C0639j0> vector = this.f3878o;
        if (vector == null || vector.size() <= 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f3878o.size(); i2++) {
            C0639j0 elementAt = this.f3878o.elementAt(i2);
            if (elementAt != null && (c3489yj = elementAt.f3879p) != null && c3489yj.f14211f) {
                i++;
            }
        }
        return i;
    }
}
