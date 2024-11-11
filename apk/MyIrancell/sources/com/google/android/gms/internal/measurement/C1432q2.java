package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.measurement.q2 */
/* loaded from: classes.dex */
final class C1432q2<T> implements InterfaceC1374m2<T>, Serializable {

    /* renamed from: b */
    @NullableDecl
    private final T f6844b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1432q2(@NullableDecl T t) {
        this.f6844b = t;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof C1432q2)) {
            return false;
        }
        T t = this.f6844b;
        T t2 = ((C1432q2) obj).f6844b;
        if (t != t2) {
            return t != null && t.equals(t2);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6844b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6844b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1374m2
    public final T zza() {
        return this.f6844b;
    }
}
