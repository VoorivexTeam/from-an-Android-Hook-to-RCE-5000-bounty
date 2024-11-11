package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.appcompat.R$styleable;
import androidx.core.graphics.drawable.C0239a;
import androidx.core.widget.C0251c;
import p000.C0000a;

/* renamed from: androidx.appcompat.widget.h */
/* loaded from: classes.dex */
class C0173h {

    /* renamed from: a */
    private final CompoundButton f1065a;

    /* renamed from: b */
    private ColorStateList f1066b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1067c = null;

    /* renamed from: d */
    private boolean f1068d = false;

    /* renamed from: e */
    private boolean f1069e = false;

    /* renamed from: f */
    private boolean f1070f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0173h(CompoundButton compoundButton) {
        this.f1065a = compoundButton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m1006a(int i) {
        Drawable m1576a;
        return (Build.VERSION.SDK_INT >= 17 || (m1576a = C0251c.m1576a(this.f1065a)) == null) ? i : i + m1576a.getIntrinsicWidth();
    }

    /* renamed from: a */
    void m1007a() {
        Drawable m1576a = C0251c.m1576a(this.f1065a);
        if (m1576a != null) {
            if (this.f1068d || this.f1069e) {
                Drawable mutate = C0239a.m1495i(m1576a).mutate();
                if (this.f1068d) {
                    C0239a.m1480a(mutate, this.f1066b);
                }
                if (this.f1069e) {
                    C0239a.m1483a(mutate, this.f1067c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1065a.getDrawableState());
                }
                this.f1065a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1008a(ColorStateList colorStateList) {
        this.f1066b = colorStateList;
        this.f1068d = true;
        m1007a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1009a(PorterDuff.Mode mode) {
        this.f1067c = mode;
        this.f1069e = true;
        m1007a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1010a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1065a.getContext().obtainStyledAttributes(attributeSet, R$styleable.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(R$styleable.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(R$styleable.CompoundButton_android_button, 0)) != 0) {
                this.f1065a.setButtonDrawable(C0000a.m4c(this.f1065a.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(R$styleable.CompoundButton_buttonTint)) {
                C0251c.m1577a(this.f1065a, obtainStyledAttributes.getColorStateList(R$styleable.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(R$styleable.CompoundButton_buttonTintMode)) {
                C0251c.m1578a(this.f1065a, C0162b0.m921a(obtainStyledAttributes.getInt(R$styleable.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList m1011b() {
        return this.f1066b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode m1012c() {
        return this.f1067c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m1013d() {
        if (this.f1070f) {
            this.f1070f = false;
        } else {
            this.f1070f = true;
            m1007a();
        }
    }
}
