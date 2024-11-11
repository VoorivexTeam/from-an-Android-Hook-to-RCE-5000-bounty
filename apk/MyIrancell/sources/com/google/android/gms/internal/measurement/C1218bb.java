package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bb */
/* loaded from: classes.dex */
public final class C1218bb implements InterfaceC1374m2<InterfaceC1203ab> {

    /* renamed from: c */
    private static C1218bb f6528c = new C1218bb();

    /* renamed from: b */
    private final InterfaceC1374m2<InterfaceC1203ab> f6529b;

    public C1218bb() {
        this(C1359l2.m7959a(new C1248db()));
    }

    private C1218bb(InterfaceC1374m2<InterfaceC1203ab> interfaceC1374m2) {
        this.f6529b = C1359l2.m7958a((InterfaceC1374m2) interfaceC1374m2);
    }

    /* renamed from: a */
    public static boolean m7671a() {
        return ((InterfaceC1203ab) f6528c.zza()).zza();
    }

    /* renamed from: b */
    public static boolean m7672b() {
        return ((InterfaceC1203ab) f6528c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1374m2
    public final /* synthetic */ InterfaceC1203ab zza() {
        return this.f6529b.zza();
    }
}
