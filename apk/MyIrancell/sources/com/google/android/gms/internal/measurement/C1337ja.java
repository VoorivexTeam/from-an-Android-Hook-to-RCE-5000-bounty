package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ja */
/* loaded from: classes.dex */
public final class C1337ja implements InterfaceC1374m2<InterfaceC1382ma> {

    /* renamed from: c */
    private static C1337ja f6676c = new C1337ja();

    /* renamed from: b */
    private final InterfaceC1374m2<InterfaceC1382ma> f6677b;

    public C1337ja() {
        this(C1359l2.m7959a(new C1367la()));
    }

    private C1337ja(InterfaceC1374m2<InterfaceC1382ma> interfaceC1374m2) {
        this.f6677b = C1359l2.m7958a((InterfaceC1374m2) interfaceC1374m2);
    }

    /* renamed from: a */
    public static boolean m7940a() {
        return ((InterfaceC1382ma) f6676c.zza()).zza();
    }

    /* renamed from: b */
    public static boolean m7941b() {
        return ((InterfaceC1382ma) f6676c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1374m2
    public final /* synthetic */ InterfaceC1382ma zza() {
        return this.f6677b.zza();
    }
}
