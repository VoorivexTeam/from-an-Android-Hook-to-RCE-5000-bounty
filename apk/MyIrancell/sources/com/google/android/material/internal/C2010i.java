package com.google.android.material.internal;

import android.widget.ImageButton;

/* renamed from: com.google.android.material.internal.i */
/* loaded from: classes.dex */
public class C2010i extends ImageButton {

    /* renamed from: b */
    private int f8556b;

    /* renamed from: a */
    public final void m10277a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f8556b = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f8556b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        m10277a(i, true);
    }
}
