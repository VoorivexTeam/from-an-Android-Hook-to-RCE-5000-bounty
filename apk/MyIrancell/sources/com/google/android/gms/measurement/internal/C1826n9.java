package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.n9 */
/* loaded from: classes.dex */
public final class C1826n9 extends AbstractC1732g {

    /* renamed from: e */
    private final /* synthetic */ C1838o9 f7796e;

    /* renamed from: f */
    private final /* synthetic */ C1790k9 f7797f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1826n9(C1790k9 c1790k9, InterfaceC1751h6 interfaceC1751h6, C1838o9 c1838o9) {
        super(interfaceC1751h6);
        this.f7797f = c1790k9;
        this.f7796e = c1838o9;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1732g
    /* renamed from: a */
    public final void mo9329a() {
        this.f7797f.m9463u();
        this.f7797f.mo9324k().m9304B().m9365a("Starting upload from DelayedRunnable");
        this.f7796e.m9696q();
    }
}
