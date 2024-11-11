package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import com.comviva.webaxn.utils.C0755x1;
import java.util.Vector;
import p000.C3489yj;
import p000.C3531zj;

/* loaded from: classes.dex */
public class CustomEditText extends EditText {

    /* renamed from: b */
    public C0755x1.p f3332b;

    /* renamed from: c */
    public C3489yj f3333c;

    /* renamed from: d */
    public C3531zj f3334d;

    /* renamed from: com.comviva.webaxn.ui.CustomEditText$a */
    /* loaded from: classes.dex */
    private class C0583a extends InputConnectionWrapper {
        public C0583a(InputConnection inputConnection, boolean z) {
            super(inputConnection, z);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean sendKeyEvent(KeyEvent keyEvent) {
            CustomEditText customEditText;
            C0755x1.p pVar;
            if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && CustomEditText.this.getSelectionStart() == 0 && (pVar = (customEditText = CustomEditText.this).f3332b) != null) {
                C3489yj c3489yj = customEditText.f3333c;
                pVar.mo4848a(c3489yj, c3489yj.f14267z, (String) null);
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

    /* renamed from: a */
    public void m4016a(C0755x1.p pVar, C3489yj c3489yj, C3531zj c3531zj) {
        this.f3333c = c3489yj;
        this.f3332b = pVar;
        this.f3334d = c3531zj;
    }

    @Override // android.widget.TextView
    public boolean isSuggestionsEnabled() {
        C3489yj c3489yj = this.f3333c;
        if (c3489yj == null || c3489yj.f14165K0 != 9) {
            return super.isSuggestionsEnabled();
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new C0583a(super.onCreateInputConnection(editorInfo), true);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        C3489yj c3489yj;
        C3489yj m16930a;
        AbstractC0652n1 abstractC0652n1;
        C0662s m4598m;
        String str;
        if (i != 4 || keyEvent.getAction() != 1 || (c3489yj = this.f3333c) == null || TextUtils.isEmpty(c3489yj.f14181S0)) {
            return false;
        }
        C3489yj c3489yj2 = this.f3333c;
        if (c3489yj2.f14165K0 != 8 || (m16930a = this.f3334d.m16930a(c3489yj2.f14181S0, (Vector<C3489yj>) null)) == null || (abstractC0652n1 = m16930a.f14197a0) == null || !(abstractC0652n1 instanceof C0642k0)) {
            return false;
        }
        C0642k0 c0642k0 = (C0642k0) abstractC0652n1;
        if (c0642k0.m4598m() == null) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(getText().toString())) {
                m4598m = c0642k0.m4598m();
                str = "";
            } else {
                m4598m = c0642k0.m4598m();
                str = getText().toString();
            }
            m4598m.m4946a(str);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        C3489yj c3489yj = this.f3333c;
        if (c3489yj == null || c3489yj.f14165K0 != 9) {
            return super.onTextContextMenuItem(i);
        }
        return false;
    }
}
