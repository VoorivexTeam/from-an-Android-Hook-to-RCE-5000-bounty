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
import defpackage.p2;

/* loaded from: classes.dex */
public class j extends EditText implements p2 {
    private final d b;
    private final w c;

    public j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.editTextStyle);
    }

    public j(Context context, AttributeSet attributeSet, int i) {
        super(q0.b(context), attributeSet, i);
        d dVar = new d(this);
        this.b = dVar;
        dVar.a(attributeSet, i);
        w wVar = new w(this);
        this.c = wVar;
        wVar.a(attributeSet, i);
        this.c.a();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.b;
        if (dVar != null) {
            dVar.a();
        }
        w wVar = this.c;
        if (wVar != null) {
            wVar.a();
        }
    }

    @Override // defpackage.p2
    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.b;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    @Override // defpackage.p2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.b;
        if (dVar != null) {
            return dVar.c();
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
        k.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.b;
        if (dVar != null) {
            dVar.a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        d dVar = this.b;
        if (dVar != null) {
            dVar.a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.a(this, callback));
    }

    @Override // defpackage.p2
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.b;
        if (dVar != null) {
            dVar.b(colorStateList);
        }
    }

    @Override // defpackage.p2
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.b;
        if (dVar != null) {
            dVar.a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        w wVar = this.c;
        if (wVar != null) {
            wVar.a(context, i);
        }
    }
}