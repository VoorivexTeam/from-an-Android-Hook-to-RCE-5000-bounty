package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class q2<T> implements m2<T>, Serializable {

    @NullableDecl
    private final T b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q2(@NullableDecl T t) {
        this.b = t;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof q2)) {
            return false;
        }
        T t = this.b;
        T t2 = ((q2) obj).b;
        if (t != t2) {
            return t != null && t.equals(t2);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final T zza() {
        return this.b;
    }
}
