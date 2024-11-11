package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.C0181l;
import p000.C0448b3;
import p000.C3107q2;
import p000.C3508z1;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0181l implements Checkable {

    /* renamed from: e */
    private static final int[] f8475e = {R.attr.state_checked};

    /* renamed from: d */
    private boolean f8476d;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    /* loaded from: classes.dex */
    class C1999a extends C3508z1 {
        C1999a() {
        }

        @Override // p000.C3508z1
        /* renamed from: a */
        public void mo1538a(View view, C0448b3 c0448b3) {
            super.mo1538a(view, c0448b3);
            c0448b3.m3283a(true);
            c0448b3.m3288b(CheckableImageButton.this.isChecked());
        }

        @Override // p000.C3508z1
        /* renamed from: b */
        public void mo1540b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1540b(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C3107q2.m14897a(this, new C1999a());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f8476d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        return this.f8476d ? ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + f8475e.length), f8475e) : super.onCreateDrawableState(i);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f8476d != z) {
            this.f8476d = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f8476d);
    }
}
