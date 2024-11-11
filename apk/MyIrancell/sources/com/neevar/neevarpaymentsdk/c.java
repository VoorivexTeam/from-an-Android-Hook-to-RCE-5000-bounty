package com.neevar.neevarpaymentsdk;

import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c {
    public String a;
    public String b;
    public String c;

    public boolean a() {
        return !TextUtils.isEmpty(this.c) && this.c.length() == 4 && Integer.valueOf(this.c.trim()).intValue() > 0;
    }

    public String toString() {
        return this.a;
    }
}
