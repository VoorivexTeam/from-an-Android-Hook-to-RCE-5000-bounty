package com.comviva.webaxn.ui;

import android.content.Context;
import android.graphics.Rect;
import defpackage.yj;
import java.util.Vector;

/* loaded from: classes.dex */
public class j0 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int i;
    public int j;
    public j0 l;
    public boolean m;
    public n1 n;
    public yj p;
    public v0 q;
    public int g = -2;
    public int k = -1;
    public boolean r = false;
    public Vector<j0> o = new Vector<>();

    public j0(Context context) {
        v0 v0Var = new v0();
        this.q = v0Var;
        v0Var.c = new Rect();
    }

    public int a() {
        yj yjVar;
        Vector<j0> vector = this.o;
        if (vector == null || vector.size() <= 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            j0 elementAt = this.o.elementAt(i2);
            if (elementAt != null && (yjVar = elementAt.p) != null && yjVar.f) {
                i++;
            }
        }
        return i;
    }
}
