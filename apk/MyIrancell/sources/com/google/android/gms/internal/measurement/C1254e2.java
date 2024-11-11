package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.measurement.e2 */
/* loaded from: classes.dex */
final class C1254e2<T> extends AbstractC1284g2<T> {

    /* renamed from: b */
    static final C1254e2<Object> f6594b = new C1254e2<>();

    private C1254e2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1284g2
    /* renamed from: a */
    public final boolean mo7789a() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1284g2
    /* renamed from: b */
    public final T mo7790b() {
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
