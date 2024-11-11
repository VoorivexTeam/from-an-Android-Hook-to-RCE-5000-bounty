package com.google.android.material.appbar;

import android.view.View;
import defpackage.q2;

/* loaded from: classes.dex */
class d {
    private final View a;
    private int b;
    private int c;
    private int d;
    private int e;

    public d(View view) {
        this.a = view;
    }

    private void c() {
        View view = this.a;
        q2.d(view, this.d - (view.getTop() - this.b));
        View view2 = this.a;
        q2.c(view2, this.e - (view2.getLeft() - this.c));
    }

    public int a() {
        return this.d;
    }

    public boolean a(int i) {
        if (this.e == i) {
            return false;
        }
        this.e = i;
        c();
        return true;
    }

    public void b() {
        this.b = this.a.getTop();
        this.c = this.a.getLeft();
        c();
    }

    public boolean b(int i) {
        if (this.d == i) {
            return false;
        }
        this.d = i;
        c();
        return true;
    }
}
