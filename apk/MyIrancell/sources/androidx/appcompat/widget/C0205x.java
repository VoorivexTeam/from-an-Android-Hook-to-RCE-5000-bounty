package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.widget.C0257i;
import androidx.core.widget.InterfaceC0250b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p000.C2918m1;
import p000.InterfaceC3068p2;

/* renamed from: androidx.appcompat.widget.x */
/* loaded from: classes.dex */
public class C0205x extends TextView implements InterfaceC3068p2, InterfaceC0250b {

    /* renamed from: b */
    private final C0165d f1295b;

    /* renamed from: c */
    private final C0203w f1296c;

    /* renamed from: d */
    private Future<C2918m1> f1297d;

    public C0205x(Context context) {
        this(context, null);
    }

    public C0205x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public C0205x(Context context, AttributeSet attributeSet, int i) {
        super(C0192q0.m1129b(context), attributeSet, i);
        C0165d c0165d = new C0165d(this);
        this.f1295b = c0165d;
        c0165d.m947a(attributeSet, i);
        C0203w c0203w = new C0203w(this);
        this.f1296c = c0203w;
        c0203w.m1186a(attributeSet, i);
        this.f1296c.m1181a();
    }

    /* renamed from: d */
    private void m1208d() {
        Future<C2918m1> future = this.f1297d;
        if (future != null) {
            try {
                this.f1297d = null;
                C0257i.m1596a(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0165d c0165d = this.f1295b;
        if (c0165d != null) {
            c0165d.m942a();
        }
        C0203w c0203w = this.f1296c;
        if (c0203w != null) {
            c0203w.m1181a();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0250b.f1550a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0203w c0203w = this.f1296c;
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
        C0203w c0203w = this.f1296c;
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
        C0203w c0203w = this.f1296c;
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
        C0203w c0203w = this.f1296c;
        return c0203w != null ? c0203w.m1195f() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (InterfaceC0250b.f1550a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0203w c0203w = this.f1296c;
        if (c0203w != null) {
            return c0203w.m1196g();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return C0257i.m1598b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return C0257i.m1600c(this);
    }

    @Override // p000.InterfaceC3068p2
    public ColorStateList getSupportBackgroundTintList() {
        C0165d c0165d = this.f1295b;
        if (c0165d != null) {
            return c0165d.m948b();
        }
        return null;
    }

    @Override // p000.InterfaceC3068p2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0165d c0165d = this.f1295b;
        if (c0165d != null) {
            return c0165d.m950c();
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m1208d();
        return super.getText();
    }

    public C2918m1.a getTextMetricsParamsCompat() {
        return C0257i.m1605f(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0179k.m1052a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0203w c0203w = this.f1296c;
        if (c0203w != null) {
            c0203w.m1189a(z, i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m1208d();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0203w c0203w = this.f1296c;
        if (c0203w == null || InterfaceC0250b.f1550a || !c0203w.m1197h()) {
            return;
        }
        this.f1296c.m1191b();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC0250b.f1550a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0203w c0203w = this.f1296c;
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
        C0203w c0203w = this.f1296c;
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
        C0203w c0203w = this.f1296c;
        if (c0203w != null) {
            c0203w.m1182a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0165d c0165d = this.f1295b;
        if (c0165d != null) {
            c0165d.m946a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0165d c0165d = this.f1295b;
        if (c0165d != null) {
            c0165d.m943a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0257i.m1591a(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0257i.m1593a(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0257i.m1599b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C0257i.m1601c(this, i);
    }

    public void setPrecomputedText(C2918m1 c2918m1) {
        C0257i.m1596a(this, c2918m1);
    }

    @Override // p000.InterfaceC3068p2
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0165d c0165d = this.f1295b;
        if (c0165d != null) {
            c0165d.m949b(colorStateList);
        }
    }

    @Override // p000.InterfaceC3068p2
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0165d c0165d = this.f1295b;
        if (c0165d != null) {
            c0165d.m945a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0203w c0203w = this.f1296c;
        if (c0203w != null) {
            c0203w.m1185a(context, i);
        }
    }

    public void setTextFuture(Future<C2918m1> future) {
        this.f1297d = future;
        requestLayout();
    }

    public void setTextMetricsParamsCompat(C2918m1.a aVar) {
        C0257i.m1595a(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (InterfaceC0250b.f1550a) {
            super.setTextSize(i, f);
            return;
        }
        C0203w c0203w = this.f1296c;
        if (c0203w != null) {
            c0203w.m1183a(i, f);
        }
    }
}
