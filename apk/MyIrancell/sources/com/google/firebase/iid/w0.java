package com.google.firebase.iid;

/* loaded from: classes.dex */
final class w0 {
    private final String a;
    private final long b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(String str, long j) {
        com.google.android.gms.common.internal.u.a(str);
        this.a = str;
        this.b = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.b == w0Var.b && this.a.equals(w0Var.a);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.s.a(this.a, Long.valueOf(this.b));
    }
}
