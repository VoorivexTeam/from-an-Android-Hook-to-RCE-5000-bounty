package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
class c<V extends View> extends CoordinatorLayout.c<V> {
    private d a;
    private int b;
    private int c;

    public c() {
        this.b = 0;
        this.c = 0;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 0;
    }

    public boolean a(int i) {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.b(i);
        }
        this.b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
        b(coordinatorLayout, (CoordinatorLayout) v, i);
        if (this.a == null) {
            this.a = new d(v);
        }
        this.a.b();
        int i2 = this.b;
        if (i2 != 0) {
            this.a.b(i2);
            this.b = 0;
        }
        int i3 = this.c;
        if (i3 == 0) {
            return true;
        }
        this.a.a(i3);
        this.c = 0;
        return true;
    }

    public int b() {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.a();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.c(v, i);
    }
}
