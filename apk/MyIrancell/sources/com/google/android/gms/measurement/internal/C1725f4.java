package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.android.gms.measurement.internal.f4 */
/* loaded from: classes.dex */
public final class C1725f4 extends AbstractC1703d6 {

    /* renamed from: c */
    private char f7538c;

    /* renamed from: d */
    private long f7539d;

    /* renamed from: e */
    private String f7540e;

    /* renamed from: f */
    private final C1749h4 f7541f;

    /* renamed from: g */
    private final C1749h4 f7542g;

    /* renamed from: h */
    private final C1749h4 f7543h;

    /* renamed from: i */
    private final C1749h4 f7544i;

    /* renamed from: j */
    private final C1749h4 f7545j;

    /* renamed from: k */
    private final C1749h4 f7546k;

    /* renamed from: l */
    private final C1749h4 f7547l;

    /* renamed from: m */
    private final C1749h4 f7548m;

    /* renamed from: n */
    private final C1749h4 f7549n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1725f4(C1774j5 c1774j5) {
        super(c1774j5);
        this.f7538c = (char) 0;
        this.f7539d = -1L;
        this.f7541f = new C1749h4(this, 6, false, false);
        this.f7542g = new C1749h4(this, 6, true, false);
        this.f7543h = new C1749h4(this, 6, false, true);
        this.f7544i = new C1749h4(this, 5, false, false);
        this.f7545j = new C1749h4(this, 5, true, false);
        this.f7546k = new C1749h4(this, 5, false, true);
        this.f7547l = new C1749h4(this, 4, false, false);
        this.f7548m = new C1749h4(this, 3, false, false);
        this.f7549n = new C1749h4(this, 2, false, false);
    }

    /* renamed from: D */
    private final String m9294D() {
        String str;
        String str2;
        synchronized (this) {
            if (this.f7540e == null) {
                if (this.f7550a.m9398C() != null) {
                    str2 = this.f7550a.m9398C();
                } else {
                    m9326m().mo9317d();
                    str2 = "FA";
                }
                this.f7540e = str2;
            }
            str = this.f7540e;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static Object m9298a(String str) {
        if (str == null) {
            return null;
        }
        return new C1785k4(str);
    }

    /* renamed from: a */
    private static String m9299a(boolean z, Object obj) {
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
            if (!(obj instanceof C1785k4)) {
                return z ? "-" : String.valueOf(obj);
            }
            str = ((C1785k4) obj).f7709a;
            return str;
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String m9302b = m9302b(C1774j5.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m9302b(className).equals(m9302b)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i++;
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m9300a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String m9299a = m9299a(z, obj);
        String m9299a2 = m9299a(z, obj2);
        String m9299a3 = m9299a(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(m9299a)) {
            sb.append(str2);
            sb.append(m9299a);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(m9299a2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(m9299a2);
        }
        if (!TextUtils.isEmpty(m9299a3)) {
            sb.append(str3);
            sb.append(m9299a3);
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static String m9302b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* renamed from: A */
    public final C1749h4 m9303A() {
        return this.f7548m;
    }

    /* renamed from: B */
    public final C1749h4 m9304B() {
        return this.f7549n;
    }

    /* renamed from: C */
    public final String m9305C() {
        Pair<String, Long> m9839a = m9323j().f8022d.m9839a();
        if (m9839a == null || m9839a == C1877s4.f8018C) {
            return null;
        }
        String valueOf = String.valueOf(m9839a.second);
        String str = (String) m9839a.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m9306a(int i, String str) {
        Log.println(i, m9294D(), str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m9307a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z && m9308a(i)) {
            m9306a(i, m9300a(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        C1057u.m7286a(str);
        C1738g5 m9424u = this.f7550a.m9424u();
        if (m9424u == null) {
            str2 = "Scheduler not set. Not logging error/warn";
        } else {
            if (m9424u.m9223s()) {
                if (i < 0) {
                    i = 0;
                }
                m9424u.m9344a(new RunnableC1761i4(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
                return;
            }
            str2 = "Scheduler not initialized. Not logging error/warn";
        }
        m9306a(6, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean m9308a(int i) {
        return Log.isLoggable(m9294D(), i);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1703d6
    /* renamed from: r */
    protected final boolean mo9123r() {
        return false;
    }

    /* renamed from: t */
    public final C1749h4 m9309t() {
        return this.f7541f;
    }

    /* renamed from: u */
    public final C1749h4 m9310u() {
        return this.f7542g;
    }

    /* renamed from: v */
    public final C1749h4 m9311v() {
        return this.f7543h;
    }

    /* renamed from: w */
    public final C1749h4 m9312w() {
        return this.f7544i;
    }

    /* renamed from: x */
    public final C1749h4 m9313x() {
        return this.f7545j;
    }

    /* renamed from: y */
    public final C1749h4 m9314y() {
        return this.f7546k;
    }

    /* renamed from: z */
    public final C1749h4 m9315z() {
        return this.f7547l;
    }
}
