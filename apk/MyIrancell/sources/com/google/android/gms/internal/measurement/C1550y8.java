package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.y8 */
/* loaded from: classes.dex */
public final class C1550y8 implements InterfaceC1374m2<InterfaceC1216b9> {

    /* renamed from: c */
    private static C1550y8 f7016c = new C1550y8();

    /* renamed from: b */
    private final InterfaceC1374m2<InterfaceC1216b9> f7017b;

    public C1550y8() {
        this(C1359l2.m7959a(new C1201a9()));
    }

    private C1550y8(InterfaceC1374m2<InterfaceC1216b9> interfaceC1374m2) {
        this.f7017b = C1359l2.m7958a((InterfaceC1374m2) interfaceC1374m2);
    }

    /* renamed from: a */
    public static boolean m8890a() {
        return ((InterfaceC1216b9) f7016c.zza()).zza();
    }

    /* renamed from: b */
    public static boolean m8891b() {
        return ((InterfaceC1216b9) f7016c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1374m2
    public final /* synthetic */ InterfaceC1216b9 zza() {
        return this.f7017b.zza();
    }
}
