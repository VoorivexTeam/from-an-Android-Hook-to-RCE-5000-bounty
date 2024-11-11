package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.tc */
/* loaded from: classes.dex */
public final class C1484tc implements InterfaceC1374m2<InterfaceC1470sc> {

    /* renamed from: c */
    private static C1484tc f6944c = new C1484tc();

    /* renamed from: b */
    private final InterfaceC1374m2<InterfaceC1470sc> f6945b;

    public C1484tc() {
        this(C1359l2.m7959a(new C1512vc()));
    }

    private C1484tc(InterfaceC1374m2<InterfaceC1470sc> interfaceC1374m2) {
        this.f6945b = C1359l2.m7958a((InterfaceC1374m2) interfaceC1374m2);
    }

    /* renamed from: a */
    public static boolean m8488a() {
        return ((InterfaceC1470sc) f6944c.zza()).zza();
    }

    /* renamed from: b */
    public static boolean m8489b() {
        return ((InterfaceC1470sc) f6944c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1374m2
    public final /* synthetic */ InterfaceC1470sc zza() {
        return this.f6945b.zza();
    }
}
