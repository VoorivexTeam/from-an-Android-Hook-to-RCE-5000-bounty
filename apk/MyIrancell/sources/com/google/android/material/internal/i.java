package com.google.android.material.internal;

import android.widget.ImageButton;

/* loaded from: classes.dex */
public class i extends ImageButton {
    private int b;

    public final void a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.b = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        a(i, true);
    }
}
