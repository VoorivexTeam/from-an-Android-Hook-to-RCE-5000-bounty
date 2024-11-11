package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.w9 */
/* loaded from: classes.dex */
public final class C1523w9 implements InterfaceC1374m2<InterfaceC1509v9> {

    /* renamed from: c */
    private static C1523w9 f6985c = new C1523w9();

    /* renamed from: b */
    private final InterfaceC1374m2<InterfaceC1509v9> f6986b;

    public C1523w9() {
        this(C1359l2.m7959a(new C1551y9()));
    }

    private C1523w9(InterfaceC1374m2<InterfaceC1509v9> interfaceC1374m2) {
        this.f6986b = C1359l2.m7958a((InterfaceC1374m2) interfaceC1374m2);
    }

    /* renamed from: a */
    public static boolean m8639a() {
        return ((InterfaceC1509v9) f6985c.zza()).zza();
    }

    /* renamed from: b */
    public static boolean m8640b() {
        return ((InterfaceC1509v9) f6985c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1374m2
    public final /* synthetic */ InterfaceC1509v9 zza() {
        return this.f6986b.zza();
    }
}
