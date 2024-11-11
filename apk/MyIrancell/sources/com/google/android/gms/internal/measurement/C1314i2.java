package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.measurement.i2 */
/* loaded from: classes.dex */
final class C1314i2<T> extends AbstractC1284g2<T> {

    /* renamed from: b */
    private final T f6663b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1314i2(T t) {
        this.f6663b = t;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1284g2
    /* renamed from: a */
    public final boolean mo7789a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1284g2
    /* renamed from: b */
    public final T mo7790b() {
        return this.f6663b;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof C1314i2) {
            return this.f6663b.equals(((C1314i2) obj).f6663b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6663b.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6663b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
