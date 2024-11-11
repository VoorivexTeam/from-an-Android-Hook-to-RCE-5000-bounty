package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t2 */
/* loaded from: classes.dex */
final class C1474t2 extends AbstractC1460s2 {

    /* renamed from: a */
    private final C1446r2 f6906a = new C1446r2();

    @Override // com.google.android.gms.internal.measurement.AbstractC1460s2
    /* renamed from: a */
    public final void mo8172a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.f6906a.m8285a(th, true).add(th2);
    }
}
