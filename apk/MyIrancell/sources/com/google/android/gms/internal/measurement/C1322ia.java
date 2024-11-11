package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ia */
/* loaded from: classes.dex */
public final class C1322ia implements InterfaceC1374m2<InterfaceC1307ha> {

    /* renamed from: c */
    private static C1322ia f6665c = new C1322ia();

    /* renamed from: b */
    private final InterfaceC1374m2<InterfaceC1307ha> f6666b;

    public C1322ia() {
        this(C1359l2.m7959a(new C1352ka()));
    }

    private C1322ia(InterfaceC1374m2<InterfaceC1307ha> interfaceC1374m2) {
        this.f6666b = C1359l2.m7958a((InterfaceC1374m2) interfaceC1374m2);
    }

    /* renamed from: a */
    public static boolean m7931a() {
        return ((InterfaceC1307ha) f6665c.zza()).zza();
    }

    /* renamed from: b */
    public static boolean m7932b() {
        return ((InterfaceC1307ha) f6665c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1374m2
    public final /* synthetic */ InterfaceC1307ha zza() {
        return this.f6666b.zza();
    }
}
