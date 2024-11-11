package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;

/* loaded from: classes.dex */
public final class f4 extends d6 {
    private char c;
    private long d;
    private String e;
    private final h4 f;
    private final h4 g;
    private final h4 h;
    private final h4 i;
    private final h4 j;
    private final h4 k;
    private final h4 l;
    private final h4 m;
    private final h4 n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f4(j5 j5Var) {
        super(j5Var);
        this.c = (char) 0;
        this.d = -1L;
        this.f = new h4(this, 6, false, false);
        this.g = new h4(this, 6, true, false);
        this.h = new h4(this, 6, false, true);
        this.i = new h4(this, 5, false, false);
        this.j = new h4(this, 5, true, false);
        this.k = new h4(this, 5, false, true);
        this.l = new h4(this, 4, false, false);
        this.m = new h4(this, 3, false, false);
        this.n = new h4(this, 2, false, false);
    }

    private final String D() {
        String str;
        String str2;
        synchronized (this) {
            if (this.e == null) {
                if (this.a.C() != null) {
                    str2 = this.a.C();
                } else {
                    m().d();
                    str2 = "FA";
                }
                this.e = str2;
            }
            str = this.e;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object a(String str) {
        if (str == null) {
            return null;
        }
        return new k4(str);
    }

    private static String a(boolean z, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str2 = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str2.length() + 43 + str2.length());
            sb.append(str2);
            sb.append(round);
            sb.append("...");
            sb.append(str2);
            sb.append(round2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            if (!(obj instanceof k4)) {
                return z ? "-" : String.valueOf(obj);
            }
            str = ((k4) obj).a;
            return str;
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String b = b(j5.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && b(className).equals(b)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i++;
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String a = a(z, obj);
        String a2 = a(z, obj2);
        String a3 = a(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(a2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(a2);
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str3);
            sb.append(a3);
        }
        return sb.toString();
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public final h4 A() {
        return this.m;
    }

    public final h4 B() {
        return this.n;
    }

    public final String C() {
        Pair<String, Long> a = j().d.a();
        if (a == null || a == s4.C) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        String str = (String) a.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i, String str) {
        Log.println(i, D(), str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z && a(i)) {
            a(i, a(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        com.google.android.gms.common.internal.u.a(str);
        g5 u = this.a.u();
        if (u == null) {
            str2 = "Scheduler not set. Not logging error/warn";
        } else {
            if (u.s()) {
                if (i < 0) {
                    i = 0;
                }
                u.a(new i4(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
                return;
            }
            str2 = "Scheduler not initialized. Not logging error/warn";
        }
        a(6, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(int i) {
        return Log.isLoggable(D(), i);
    }

    @Override // com.google.android.gms.measurement.internal.d6
    protected final boolean r() {
        return false;
    }

    public final h4 t() {
        return this.f;
    }

    public final h4 u() {
        return this.g;
    }

    public final h4 v() {
        return this.h;
    }

    public final h4 w() {
        return this.i;
    }

    public final h4 x() {
        return this.j;
    }

    public final h4 y() {
        return this.k;
    }

    public final h4 z() {
        return this.l;
    }
}
