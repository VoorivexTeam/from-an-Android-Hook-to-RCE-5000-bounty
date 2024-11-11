package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C0257i;
import p000.C0000a;

/* renamed from: androidx.appcompat.widget.g */
/* loaded from: classes.dex */
public class C0171g extends CheckedTextView {

    /* renamed from: c */
    private static final int[] f1022c = {R.attr.checkMark};

    /* renamed from: b */
    private final C0203w f1023b;

    public C0171g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public C0171g(Context context, AttributeSet attributeSet, int i) {
        super(C0192q0.m1129b(context), attributeSet, i);
        C0203w c0203w = new C0203w(this);
        this.f1023b = c0203w;
        c0203w.m1186a(attributeSet, i);
        this.f1023b.m1181a();
        C0198t0 m1133a = C0198t0.m1133a(getContext(), attributeSet, f1022c, i, 0);
        setCheckMarkDrawable(m1133a.m1142b(0));
        m1133a.m1138a();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0203w c0203w = this.f1023b;
        if (c0203w != null) {
            c0203w.m1181a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0179k.m1052a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0000a.m4c(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0257i.m1591a(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0203w c0203w = this.f1023b;
        if (c0203w != null) {
            c0203w.m1185a(context, i);
        }
    }
}
