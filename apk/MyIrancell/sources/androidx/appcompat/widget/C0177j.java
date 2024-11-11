package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.appcompat.R$attr;
import androidx.core.widget.C0257i;
import p000.InterfaceC3068p2;

/* renamed from: androidx.appcompat.widget.j */
/* loaded from: classes.dex */
public class C0177j extends EditText implements InterfaceC3068p2 {

    /* renamed from: b */
    private final C0165d f1092b;

    /* renamed from: c */
    private final C0203w f1093c;

    public C0177j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.editTextStyle);
    }

    public C0177j(Context context, AttributeSet attributeSet, int i) {
        super(C0192q0.m1129b(context), attributeSet, i);
        C0165d c0165d = new C0165d(this);
        this.f1092b = c0165d;
        c0165d.m947a(attributeSet, i);
        C0203w c0203w = new C0203w(this);
        this.f1093c = c0203w;
        c0203w.m1186a(attributeSet, i);
        this.f1093c.m1181a();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0165d c0165d = this.f1092b;
        if (c0165d != null) {
            c0165d.m942a();
        }
        C0203w c0203w = this.f1093c;
        if (c0203w != null) {
            c0203w.m1181a();
        }
    }

    @Override // p000.InterfaceC3068p2
    public ColorStateList getSupportBackgroundTintList() {
        C0165d c0165d = this.f1092b;
        if (c0165d != null) {
            return c0165d.m948b();
        }
        return null;
    }

    @Override // p000.InterfaceC3068p2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0165d c0165d = this.f1092b;
        if (c0165d != null) {
            return c0165d.m950c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0179k.m1052a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0165d c0165d = this.f1092b;
        if (c0165d != null) {
            c0165d.m946a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0165d c0165d = this.f1092b;
        if (c0165d != null) {
            c0165d.m943a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0257i.m1591a(this, callback));
    }

    @Override // p000.InterfaceC3068p2
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0165d c0165d = this.f1092b;
        if (c0165d != null) {
            c0165d.m949b(colorStateList);
        }
    }

    @Override // p000.InterfaceC3068p2
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0165d c0165d = this.f1092b;
        if (c0165d != null) {
            c0165d.m945a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0203w c0203w = this.f1093c;
        if (c0203w != null) {
            c0203w.m1185a(context, i);
        }
    }
}
