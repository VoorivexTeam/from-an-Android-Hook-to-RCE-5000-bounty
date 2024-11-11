package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.google.android.material.appbar.c */
/* loaded from: classes.dex */
class C1976c<V extends View> extends CoordinatorLayout.AbstractC0214c<V> {

    /* renamed from: a */
    private C1977d f8322a;

    /* renamed from: b */
    private int f8323b;

    /* renamed from: c */
    private int f8324c;

    public C1976c() {
        this.f8323b = 0;
        this.f8324c = 0;
    }

    public C1976c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8323b = 0;
        this.f8324c = 0;
    }

    /* renamed from: a */
    public boolean m10049a(int i) {
        C1977d c1977d = this.f8322a;
        if (c1977d != null) {
            return c1977d.m10055b(i);
        }
        this.f8323b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: a */
    public boolean mo1304a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo10046b(coordinatorLayout, (CoordinatorLayout) v, i);
        if (this.f8322a == null) {
            this.f8322a = new C1977d(v);
        }
        this.f8322a.m10054b();
        int i2 = this.f8323b;
        if (i2 != 0) {
            this.f8322a.m10055b(i2);
            this.f8323b = 0;
        }
        int i3 = this.f8324c;
        if (i3 == 0) {
            return true;
        }
        this.f8322a.m10053a(i3);
        this.f8324c = 0;
        return true;
    }

    /* renamed from: b */
    public int m10050b() {
        C1977d c1977d = this.f8322a;
        if (c1977d != null) {
            return c1977d.m10052a();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10046b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m1289c(v, i);
    }
}
