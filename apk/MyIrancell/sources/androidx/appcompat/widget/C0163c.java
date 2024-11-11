package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.R$attr;
import androidx.core.widget.C0257i;
import p000.C0000a;
import p000.InterfaceC3068p2;

/* renamed from: androidx.appcompat.widget.c */
/* loaded from: classes.dex */
public class C0163c extends AutoCompleteTextView implements InterfaceC3068p2 {

    /* renamed from: d */
    private static final int[] f966d = {R.attr.popupBackground};

    /* renamed from: b */
    private final C0165d f967b;

    /* renamed from: c */
    private final C0203w f968c;

    public C0163c(Context context) {
        this(context, null);
    }

    public C0163c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.autoCompleteTextViewStyle);
    }

    public C0163c(Context context, AttributeSet attributeSet, int i) {
        super(C0192q0.m1129b(context), attributeSet, i);
        C0198t0 m1133a = C0198t0.m1133a(getContext(), attributeSet, f966d, i, 0);
        if (m1133a.m1152g(0)) {
            setDropDownBackgroundDrawable(m1133a.m1142b(0));
        }
        m1133a.m1138a();
        C0165d c0165d = new C0165d(this);
        this.f967b = c0165d;
        c0165d.m947a(attributeSet, i);
        C0203w c0203w = new C0203w(this);
        this.f968c = c0203w;
        c0203w.m1186a(attributeSet, i);
        this.f968c.m1181a();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0165d c0165d = this.f967b;
        if (c0165d != null) {
            c0165d.m942a();
        }
        C0203w c0203w = this.f968c;
        if (c0203w != null) {
            c0203w.m1181a();
        }
    }

    @Override // p000.InterfaceC3068p2
    public ColorStateList getSupportBackgroundTintList() {
        C0165d c0165d = this.f967b;
        if (c0165d != null) {
            return c0165d.m948b();
        }
        return null;
    }

    @Override // p000.InterfaceC3068p2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0165d c0165d = this.f967b;
        if (c0165d != null) {
            return c0165d.m950c();
        }
        return null;
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
        C0165d c0165d = this.f967b;
        if (c0165d != null) {
            c0165d.m946a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0165d c0165d = this.f967b;
        if (c0165d != null) {
            c0165d.m943a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0257i.m1591a(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0000a.m4c(getContext(), i));
    }

    @Override // p000.InterfaceC3068p2
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0165d c0165d = this.f967b;
        if (c0165d != null) {
            c0165d.m949b(colorStateList);
        }
    }

    @Override // p000.InterfaceC3068p2
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0165d c0165d = this.f967b;
        if (c0165d != null) {
            c0165d.m945a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0203w c0203w = this.f968c;
        if (c0203w != null) {
            c0203w.m1185a(context, i);
        }
    }
}
