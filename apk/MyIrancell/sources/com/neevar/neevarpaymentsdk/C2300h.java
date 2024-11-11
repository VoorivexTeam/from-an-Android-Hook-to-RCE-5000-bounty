package com.neevar.neevarpaymentsdk;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.neevar.neevarpaymentsdk.h */
/* loaded from: classes.dex */
class C2300h implements TextWatcher {
    /* renamed from: a */
    private String m11004a(char[] cArr, int i, char c) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < cArr.length; i2++) {
            if (cArr[i2] != 0) {
                sb.append(cArr[i2]);
                if (i2 > 0 && i2 < cArr.length - 1 && (i2 + 1) % i == 0) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private boolean m11005a(Editable editable, int i, int i2, char c) {
        boolean z = editable.length() <= i;
        for (int i3 = 0; i3 < editable.length(); i3++) {
            if (i3 > 0 && (i3 + 1) % i2 == 0) {
                z &= c == editable.charAt(i3);
            }
        }
        return z;
    }

    /* renamed from: a */
    private char[] m11006a(Editable editable, int i) {
        char[] cArr = new char[i];
        int i2 = 0;
        for (int i3 = 0; i3 < editable.length() && i2 < i; i3++) {
            char charAt = editable.charAt(i3);
            if (Character.isDigit(charAt) || charAt == '*') {
                cArr[i2] = charAt;
                i2++;
            }
        }
        return cArr;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (m11005a(editable, 19, 5, '-')) {
            return;
        }
        editable.replace(0, editable.length(), m11004a(m11006a(editable, 16), 4, '-'));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
