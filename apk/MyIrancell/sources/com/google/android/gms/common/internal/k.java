package com.google.android.gms.common.internal;

import android.util.Log;

/* loaded from: classes.dex */
public final class k {
    private final String a;
    private final String b;

    public k(String str) {
        this(str, null);
    }

    public k(String str, String str2) {
        u.a(str, (Object) "log tag cannot be null");
        u.a(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.a = str;
        if (str2 == null || str2.length() <= 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    private final String a(String str) {
        String str2 = this.b;
        return str2 == null ? str : str2.concat(str);
    }

    public final void a(String str, String str2) {
        if (a(3)) {
            a(str2);
        }
    }

    public final void a(String str, String str2, Throwable th) {
        if (a(6)) {
            a(str2);
        }
    }

    public final boolean a(int i) {
        return Log.isLoggable(this.a, i);
    }

    public final void b(String str, String str2) {
        if (a(2)) {
            a(str2);
        }
    }

    public final void c(String str, String str2) {
        if (a(5)) {
            a(str2);
        }
    }
}
