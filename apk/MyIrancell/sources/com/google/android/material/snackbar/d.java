package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import com.google.android.material.R$styleable;
import defpackage.a3;
import defpackage.q2;

/* loaded from: classes.dex */
public class d extends FrameLayout {
    private final AccessibilityManager b;
    private final a3.a c;
    private c d;
    private b e;

    /* loaded from: classes.dex */
    class a implements a3.a {
        a() {
        }

        @Override // a3.a
        public void onTouchExplorationStateChanged(boolean z) {
            d.this.setClickableOrFocusableBasedOnAccessibility(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SnackbarLayout);
        if (obtainStyledAttributes.hasValue(R$styleable.SnackbarLayout_elevation)) {
            q2.a(this, obtainStyledAttributes.getDimensionPixelSize(R$styleable.SnackbarLayout_elevation, 0));
        }
        obtainStyledAttributes.recycle();
        this.b = (AccessibilityManager) context.getSystemService("accessibility");
        a aVar = new a();
        this.c = aVar;
        a3.a(this.b, aVar);
        setClickableOrFocusableBasedOnAccessibility(this.b.isTouchExplorationEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickableOrFocusableBasedOnAccessibility(boolean z) {
        setClickable(!z);
        setFocusable(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.e;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        q2.B(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.e;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
        a3.b(this.b, this.c);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c cVar = this.d;
        if (cVar != null) {
            cVar.a(this, i, i2, i3, i4);
        }
    }

    void setOnAttachStateChangeListener(b bVar) {
        this.e = bVar;
    }

    void setOnLayoutChangeListener(c cVar) {
        this.d = cVar;
    }
}
