package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.k9 */
/* loaded from: classes.dex */
public final class C1351k9 implements InterfaceC1374m2<InterfaceC1411o9> {

    /* renamed from: c */
    private static C1351k9 f6700c = new C1351k9();

    /* renamed from: b */
    private final InterfaceC1374m2<InterfaceC1411o9> f6701b;

    public C1351k9() {
        this(C1359l2.m7959a(new C1396n9()));
    }

    private C1351k9(InterfaceC1374m2<InterfaceC1411o9> interfaceC1374m2) {
        this.f6701b = C1359l2.m7958a((InterfaceC1374m2) interfaceC1374m2);
    }

    /* renamed from: a */
    public static boolean m7955a() {
        return ((InterfaceC1411o9) f6700c.zza()).zza();
    }

    /* renamed from: b */
    public static boolean m7956b() {
        return ((InterfaceC1411o9) f6700c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1374m2
    public final /* synthetic */ InterfaceC1411o9 zza() {
        return this.f6701b.zza();
    }
}
