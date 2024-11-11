package com.google.firebase.iid;

import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.firebase.iid.w0 */
/* loaded from: classes.dex */
final class C2128w0 {

    /* renamed from: a */
    private final String f8976a;

    /* renamed from: b */
    private final long f8977b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2128w0(String str, long j) {
        C1057u.m7286a(str);
        this.f8976a = str;
        this.f8977b = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final String m10719a() {
        return this.f8976a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2128w0)) {
            return false;
        }
        C2128w0 c2128w0 = (C2128w0) obj;
        return this.f8977b == c2128w0.f8977b && this.f8976a.equals(c2128w0.f8976a);
    }

    public final int hashCode() {
        return C1050s.m7203a(this.f8976a, Long.valueOf(this.f8977b));
    }
}
