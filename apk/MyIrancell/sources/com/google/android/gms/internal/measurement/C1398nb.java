package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.nb */
/* loaded from: classes.dex */
public final class C1398nb implements InterfaceC1374m2<InterfaceC1383mb> {

    /* renamed from: c */
    private static C1398nb f6773c = new C1398nb();

    /* renamed from: b */
    private final InterfaceC1374m2<InterfaceC1383mb> f6774b;

    public C1398nb() {
        this(C1359l2.m7959a(new C1441qb()));
    }

    private C1398nb(InterfaceC1374m2<InterfaceC1383mb> interfaceC1374m2) {
        this.f6774b = C1359l2.m7958a((InterfaceC1374m2) interfaceC1374m2);
    }

    /* renamed from: a */
    public static boolean m8052a() {
        return ((InterfaceC1383mb) f6773c.zza()).zza();
    }

    /* renamed from: b */
    public static boolean m8053b() {
        return ((InterfaceC1383mb) f6773c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1374m2
    public final /* synthetic */ InterfaceC1383mb zza() {
        return this.f6774b.zza();
    }
}
