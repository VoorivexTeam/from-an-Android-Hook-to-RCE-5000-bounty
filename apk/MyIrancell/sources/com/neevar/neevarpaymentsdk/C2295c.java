package com.neevar.neevarpaymentsdk;

import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.neevar.neevarpaymentsdk.c */
/* loaded from: classes.dex */
public class C2295c {

    /* renamed from: a */
    public String f9268a;

    /* renamed from: b */
    public String f9269b;

    /* renamed from: c */
    public String f9270c;

    /* renamed from: a */
    public boolean m10996a() {
        return !TextUtils.isEmpty(this.f9270c) && this.f9270c.length() == 4 && Integer.valueOf(this.f9270c.trim()).intValue() > 0;
    }

    public String toString() {
        return this.f9268a;
    }
}
