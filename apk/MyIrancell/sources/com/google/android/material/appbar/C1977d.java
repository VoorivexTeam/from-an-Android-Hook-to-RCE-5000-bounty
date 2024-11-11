package com.google.android.material.appbar;

import android.view.View;
import p000.C3107q2;

/* renamed from: com.google.android.material.appbar.d */
/* loaded from: classes.dex */
class C1977d {

    /* renamed from: a */
    private final View f8325a;

    /* renamed from: b */
    private int f8326b;

    /* renamed from: c */
    private int f8327c;

    /* renamed from: d */
    private int f8328d;

    /* renamed from: e */
    private int f8329e;

    public C1977d(View view) {
        this.f8325a = view;
    }

    /* renamed from: c */
    private void m10051c() {
        View view = this.f8325a;
        C3107q2.m14908d(view, this.f8328d - (view.getTop() - this.f8326b));
        View view2 = this.f8325a;
        C3107q2.m14906c(view2, this.f8329e - (view2.getLeft() - this.f8327c));
    }

    /* renamed from: a */
    public int m10052a() {
        return this.f8328d;
    }

    /* renamed from: a */
    public boolean m10053a(int i) {
        if (this.f8329e == i) {
            return false;
        }
        this.f8329e = i;
        m10051c();
        return true;
    }

    /* renamed from: b */
    public void m10054b() {
        this.f8326b = this.f8325a.getTop();
        this.f8327c = this.f8325a.getLeft();
        m10051c();
    }

    /* renamed from: b */
    public boolean m10055b(int i) {
        if (this.f8328d == i) {
            return false;
        }
        this.f8328d = i;
        m10051c();
        return true;
    }
}
