package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.pa */
/* loaded from: classes.dex */
public final class C1426pa implements InterfaceC1374m2<InterfaceC1412oa> {

    /* renamed from: c */
    private static C1426pa f6834c = new C1426pa();

    /* renamed from: b */
    private final InterfaceC1374m2<InterfaceC1412oa> f6835b;

    public C1426pa() {
        this(C1359l2.m7959a(new C1454ra()));
    }

    private C1426pa(InterfaceC1374m2<InterfaceC1412oa> interfaceC1374m2) {
        this.f6835b = C1359l2.m7958a((InterfaceC1374m2) interfaceC1374m2);
    }

    /* renamed from: a */
    public static boolean m8201a() {
        return ((InterfaceC1412oa) f6834c.zza()).zza();
    }

    /* renamed from: b */
    public static boolean m8202b() {
        return ((InterfaceC1412oa) f6834c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1374m2
    public final /* synthetic */ InterfaceC1412oa zza() {
        return this.f6835b.zza();
    }
}
