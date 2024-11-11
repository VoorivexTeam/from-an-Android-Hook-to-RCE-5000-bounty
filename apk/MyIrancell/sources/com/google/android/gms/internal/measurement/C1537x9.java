package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x9 */
/* loaded from: classes.dex */
public final class C1537x9 implements InterfaceC1374m2<InterfaceC1202aa> {

    /* renamed from: c */
    private static C1537x9 f7005c = new C1537x9();

    /* renamed from: b */
    private final InterfaceC1374m2<InterfaceC1202aa> f7006b;

    public C1537x9() {
        this(C1359l2.m7959a(new C1565z9()));
    }

    private C1537x9(InterfaceC1374m2<InterfaceC1202aa> interfaceC1374m2) {
        this.f7006b = C1359l2.m7958a((InterfaceC1374m2) interfaceC1374m2);
    }

    /* renamed from: a */
    public static boolean m8884a() {
        return ((InterfaceC1202aa) f7005c.zza()).zza();
    }

    /* renamed from: b */
    public static boolean m8885b() {
        return ((InterfaceC1202aa) f7005c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1374m2
    public final /* synthetic */ InterfaceC1202aa zza() {
        return this.f7006b.zza();
    }
}
