package com.comviva.webaxn.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import com.comviva.webaxn.utils.x1;
import defpackage.yj;
import defpackage.zj;
import java.util.Vector;

/* loaded from: classes.dex */
public class CustomEditText extends EditText {
    public x1.p b;
    public yj c;
    public zj d;

    /* loaded from: classes.dex */
    private class a extends InputConnectionWrapper {
        public a(InputConnection inputConnection, boolean z) {
            super(inputConnection, z);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean sendKeyEvent(KeyEvent keyEvent) {
            CustomEditText customEditText;
            x1.p pVar;
            if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && CustomEditText.this.getSelectionStart() == 0 && (pVar = (customEditText = CustomEditText.this).b) != null) {
                yj yjVar = customEditText.c;
                pVar.a(yjVar, yjVar.z, (String) null);
            }
            return super.sendKeyEvent(keyEvent);
        }
    }

    public CustomEditText(Context context) {
        super(context);
    }

    public CustomEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void a(x1.p pVar, yj yjVar, zj zjVar) {
        this.c = yjVar;
        this.b = pVar;
        this.d = zjVar;
    }

    @Override // android.widget.TextView
    public boolean isSuggestionsEnabled() {
        yj yjVar = this.c;
        if (yjVar == null || yjVar.K0 != 9) {
            return super.isSuggestionsEnabled();
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new a(super.onCreateInputConnection(editorInfo), true);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        yj yjVar;
        yj a2;
        n1 n1Var;
        s m;
        String str;
        if (i != 4 || keyEvent.getAction() != 1 || (yjVar = this.c) == null || TextUtils.isEmpty(yjVar.S0)) {
            return false;
        }
        yj yjVar2 = this.c;
        if (yjVar2.K0 != 8 || (a2 = this.d.a(yjVar2.S0, (Vector<yj>) null)) == null || (n1Var = a2.a0) == null || !(n1Var instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) n1Var;
        if (k0Var.m() == null) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(getText().toString())) {
                m = k0Var.m();
                str = "";
            } else {
                m = k0Var.m();
                str = getText().toString();
            }
            m.a(str);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        yj yjVar = this.c;
        if (yjVar == null || yjVar.K0 != 9) {
            return super.onTextContextMenuItem(i);
        }
        return false;
    }
}
