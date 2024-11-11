package com.google.android.gms.common.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.k */
/* loaded from: classes.dex */
public final class C1034k {

    /* renamed from: a */
    private final String f6235a;

    /* renamed from: b */
    private final String f6236b;

    public C1034k(String str) {
        this(str, null);
    }

    public C1034k(String str, String str2) {
        C1057u.m7287a(str, (Object) "log tag cannot be null");
        C1057u.m7295a(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f6235a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f6236b = null;
        } else {
            this.f6236b = str2;
        }
    }

    /* renamed from: a */
    private final String m7166a(String str) {
        String str2 = this.f6236b;
        return str2 == null ? str : str2.concat(str);
    }

    /* renamed from: a */
    public final void m7167a(String str, String str2) {
        if (m7169a(3)) {
            m7166a(str2);
        }
    }

    /* renamed from: a */
    public final void m7168a(String str, String str2, Throwable th) {
        if (m7169a(6)) {
            m7166a(str2);
        }
    }

    /* renamed from: a */
    public final boolean m7169a(int i) {
        return Log.isLoggable(this.f6235a, i);
    }

    /* renamed from: b */
    public final void m7170b(String str, String str2) {
        if (m7169a(2)) {
            m7166a(str2);
        }
    }

    /* renamed from: c */
    public final void m7171c(String str, String str2) {
        if (m7169a(5)) {
            m7166a(str2);
        }
    }
}
