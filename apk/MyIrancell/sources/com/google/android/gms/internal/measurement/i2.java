package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class i2<T> extends g2<T> {
    private final T b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i2(T t) {
        this.b = t;
    }

    @Override // com.google.android.gms.internal.measurement.g2
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.g2
    public final T b() {
        return this.b;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof i2) {
            return this.b.equals(((i2) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
