package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.appcompat.R$attr;
import androidx.core.widget.C0257i;
import androidx.core.widget.InterfaceC0250b;
import p000.InterfaceC3068p2;

/* renamed from: androidx.appcompat.widget.e */
/* loaded from: classes.dex */
public class C0167e extends Button implements InterfaceC3068p2, InterfaceC0250b {

    /* renamed from: b */
    private final C0165d f991b;

    /* renamed from: c */
    private final C0203w f992c;

    public C0167e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.buttonStyle);
    }

    public C0167e(Context context, AttributeSet attributeSet, int i) {
        super(C0192q0.m1129b(context), attributeSet, i);
        C0165d c0165d = new C0165d(this);
        this.f991b = c0165d;
        c0165d.m947a(attributeSet, i);
        C0203w c0203w = new C0203w(this);
        this.f992c = c0203w;
        c0203w.m1186a(attributeSet, i);
        this.f992c.m1181a();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0165d c0165d = this.f991b;
        if (c0165d != null) {
            c0165d.m942a();
        }
        C0203w c0203w = this.f992c;
        if (c0203w != null) {
            c0203w.m1181a();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0250b.f1550a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0203w c0203w = this.f992c;
        if (c0203w != null) {
            return c0203w.m1192c();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC0250b.f1550a) {
            return super.getAutoSizeMinTextSize();
        }
        C0203w c0203w = this.f992c;
        if (c0203w != null) {
            return c0203w.m1193d();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC0250b.f1550a) {
            return super.getAutoSizeStepGranularity();
        }
        C0203w c0203w = this.f992c;
        if (c0203w != null) {
            return c0203w.m1194e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0250b.f1550a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0203w c0203w = this.f992c;
        return c0203w != null ? c0203w.m1195f() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (InterfaceC0250b.f1550a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0203w c0203w = this.f992c;
        if (c0203w != null) {
            return c0203w.m1196g();
        }
        return 0;
    }

    @Override // p000.InterfaceC3068p2
    public ColorStateList getSupportBackgroundTintList() {
        C0165d c0165d = this.f991b;
        if (c0165d != null) {
            return c0165d.m948b();
        }
        return null;
    }

    @Override // p000.InterfaceC3068p2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0165d c0165d = this.f991b;
        if (c0165d != null) {
            return c0165d.m950c();
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0203w c0203w = this.f992c;
        if (c0203w != null) {
            c0203w.m1189a(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0203w c0203w = this.f992c;
        if (c0203w == null || InterfaceC0250b.f1550a || !c0203w.m1197h()) {
            return;
        }
        this.f992c.m1191b();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC0250b.f1550a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0203w c0203w = this.f992c;
        if (c0203w != null) {
            c0203w.m1184a(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (InterfaceC0250b.f1550a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0203w c0203w = this.f992c;
        if (c0203w != null) {
            c0203w.m1190a(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (InterfaceC0250b.f1550a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0203w c0203w = this.f992c;
        if (c0203w != null) {
            c0203w.m1182a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0165d c0165d = this.f991b;
        if (c0165d != null) {
            c0165d.m946a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0165d c0165d = this.f991b;
        if (c0165d != null) {
            c0165d.m943a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0257i.m1591a(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0203w c0203w = this.f992c;
        if (c0203w != null) {
            c0203w.m1188a(z);
        }
    }

    @Override // p000.InterfaceC3068p2
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0165d c0165d = this.f991b;
        if (c0165d != null) {
            c0165d.m949b(colorStateList);
        }
    }

    @Override // p000.InterfaceC3068p2
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0165d c0165d = this.f991b;
        if (c0165d != null) {
            c0165d.m945a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0203w c0203w = this.f992c;
        if (c0203w != null) {
            c0203w.m1185a(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (InterfaceC0250b.f1550a) {
            super.setTextSize(i, f);
            return;
        }
        C0203w c0203w = this.f992c;
        if (c0203w != null) {
            c0203w.m1183a(i, f);
        }
    }
}
