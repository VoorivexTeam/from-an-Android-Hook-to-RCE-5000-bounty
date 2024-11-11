package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.nc */
/* loaded from: classes.dex */
public final class C1399nc implements InterfaceC1374m2<InterfaceC1456rc> {

    /* renamed from: c */
    private static C1399nc f6775c = new C1399nc();

    /* renamed from: b */
    private final InterfaceC1374m2<InterfaceC1456rc> f6776b;

    public C1399nc() {
        this(C1359l2.m7959a(new C1442qc()));
    }

    private C1399nc(InterfaceC1374m2<InterfaceC1456rc> interfaceC1374m2) {
        this.f6776b = C1359l2.m7958a((InterfaceC1374m2) interfaceC1374m2);
    }

    /* renamed from: a */
    public static boolean m8054a() {
        return ((InterfaceC1456rc) f6775c.zza()).zza();
    }

    /* renamed from: b */
    public static boolean m8055b() {
        return ((InterfaceC1456rc) f6775c.zza()).zzb();
    }

    /* renamed from: c */
    public static boolean m8056c() {
        return ((InterfaceC1456rc) f6775c.zza()).mo8257b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1374m2
    public final /* synthetic */ InterfaceC1456rc zza() {
        return this.f6776b.zza();
    }
}
