package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class t2 extends s2 {
    private final r2 a = new r2();

    @Override // com.google.android.gms.internal.measurement.s2
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.a.a(th, true).add(th2);
    }
}
