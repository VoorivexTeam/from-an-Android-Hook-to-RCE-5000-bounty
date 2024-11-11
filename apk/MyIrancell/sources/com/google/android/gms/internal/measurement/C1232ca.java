package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ca */
/* loaded from: classes.dex */
public final class C1232ca implements InterfaceC1374m2<InterfaceC1217ba> {

    /* renamed from: c */
    private static C1232ca f6547c = new C1232ca();

    /* renamed from: b */
    private final InterfaceC1374m2<InterfaceC1217ba> f6548b;

    public C1232ca() {
        this(C1359l2.m7959a(new C1262ea()));
    }

    private C1232ca(InterfaceC1374m2<InterfaceC1217ba> interfaceC1374m2) {
        this.f6548b = C1359l2.m7958a((InterfaceC1374m2) interfaceC1374m2);
    }

    /* renamed from: a */
    public static boolean m7700a() {
        return ((InterfaceC1217ba) f6547c.zza()).zza();
    }

    /* renamed from: b */
    public static boolean m7701b() {
        return ((InterfaceC1217ba) f6547c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1374m2
    public final /* synthetic */ InterfaceC1217ba zza() {
        return this.f6548b.zza();
    }
}
