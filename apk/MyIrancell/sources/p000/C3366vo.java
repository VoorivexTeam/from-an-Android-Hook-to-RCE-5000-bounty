package p000;

import android.util.Log;
import com.google.android.gms.common.internal.C1034k;
import java.util.Locale;

/* renamed from: vo */
/* loaded from: classes.dex */
public class C3366vo {

    /* renamed from: a */
    private final String f13702a;

    /* renamed from: b */
    private final String f13703b;

    /* renamed from: c */
    private final int f13704c;

    private C3366vo(String str, String str2) {
        this.f13703b = str2;
        this.f13702a = str;
        new C1034k(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f13702a, i)) {
            i++;
        }
        this.f13704c = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3366vo(java.lang.String r7, java.lang.String... r8) {
        /*
            r6 = this;
            int r0 = r8.length
            if (r0 != 0) goto L6
            java.lang.String r8 = ""
            goto L36
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            int r1 = r8.length
            r2 = 0
        L12:
            if (r2 >= r1) goto L28
            r3 = r8[r2]
            int r4 = r0.length()
            r5 = 1
            if (r4 <= r5) goto L22
            java.lang.String r4 = ","
            r0.append(r4)
        L22:
            r0.append(r3)
            int r2 = r2 + 1
            goto L12
        L28:
            r8 = 93
            r0.append(r8)
            r8 = 32
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        L36:
            r6.<init>(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3366vo.<init>(java.lang.String, java.lang.String[]):void");
    }

    /* renamed from: a */
    public void m16040a(String str, Object... objArr) {
        if (m16041a(3)) {
            m16043c(str, objArr);
        }
    }

    /* renamed from: a */
    public boolean m16041a(int i) {
        return this.f13704c <= i;
    }

    /* renamed from: b */
    public void m16042b(String str, Object... objArr) {
        m16043c(str, objArr);
    }

    /* renamed from: c */
    protected String m16043c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f13703b.concat(str);
    }
}
