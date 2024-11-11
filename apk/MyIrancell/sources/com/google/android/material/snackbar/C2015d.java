package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import com.google.android.material.R$styleable;
import p000.C0004a3;
import p000.C3107q2;

/* renamed from: com.google.android.material.snackbar.d */
/* loaded from: classes.dex */
public class C2015d extends FrameLayout {

    /* renamed from: b */
    private final AccessibilityManager f8564b;

    /* renamed from: c */
    private final C0004a3.a f8565c;

    /* renamed from: d */
    private InterfaceC2014c f8566d;

    /* renamed from: e */
    private InterfaceC2013b f8567e;

    /* renamed from: com.google.android.material.snackbar.d$a */
    /* loaded from: classes.dex */
    class a implements C0004a3.a {
        a() {
        }

        @Override // p000.C0004a3.a
        public void onTouchExplorationStateChanged(boolean z) {
            C2015d.this.setClickableOrFocusableBasedOnAccessibility(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C2015d(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C2015d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SnackbarLayout);
        if (obtainStyledAttributes.hasValue(R$styleable.SnackbarLayout_elevation)) {
            C3107q2.m14884a(this, obtainStyledAttributes.getDimensionPixelSize(R$styleable.SnackbarLayout_elevation, 0));
        }
        obtainStyledAttributes.recycle();
        this.f8564b = (AccessibilityManager) context.getSystemService("accessibility");
        a aVar = new a();
        this.f8565c = aVar;
        C0004a3.m41a(this.f8564b, aVar);
        setClickableOrFocusableBasedOnAccessibility(this.f8564b.isTouchExplorationEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickableOrFocusableBasedOnAccessibility(boolean z) {
        setClickable(!z);
        setFocusable(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2013b interfaceC2013b = this.f8567e;
        if (interfaceC2013b != null) {
            interfaceC2013b.onViewAttachedToWindow(this);
        }
        C3107q2.m14878B(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC2013b interfaceC2013b = this.f8567e;
        if (interfaceC2013b != null) {
            interfaceC2013b.onViewDetachedFromWindow(this);
        }
        C0004a3.m42b(this.f8564b, this.f8565c);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC2014c interfaceC2014c = this.f8566d;
        if (interfaceC2014c != null) {
            interfaceC2014c.m10282a(this, i, i2, i3, i4);
        }
    }

    void setOnAttachStateChangeListener(InterfaceC2013b interfaceC2013b) {
        this.f8567e = interfaceC2013b;
    }

    void setOnLayoutChangeListener(InterfaceC2014c interfaceC2014c) {
        this.f8566d = interfaceC2014c;
    }
}
