package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class e2<T> extends g2<T> {
    static final e2<Object> b = new e2<>();

    private e2() {
    }

    @Override // com.google.android.gms.internal.measurement.g2
    public final boolean a() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.g2
    public final T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
