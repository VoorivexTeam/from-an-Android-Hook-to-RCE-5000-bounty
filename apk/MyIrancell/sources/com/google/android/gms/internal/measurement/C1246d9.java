package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.d9 */
/* loaded from: classes.dex */
public final class C1246d9 implements InterfaceC1374m2<InterfaceC1231c9> {

    /* renamed from: c */
    private static C1246d9 f6571c = new C1246d9();

    /* renamed from: b */
    private final InterfaceC1374m2<InterfaceC1231c9> f6572b;

    public C1246d9() {
        this(C1359l2.m7959a(new C1276f9()));
    }

    private C1246d9(InterfaceC1374m2<InterfaceC1231c9> interfaceC1374m2) {
        this.f6572b = C1359l2.m7958a((InterfaceC1374m2) interfaceC1374m2);
    }

    /* renamed from: a */
    public static boolean m7769a() {
        return ((InterfaceC1231c9) f6571c.zza()).zza();
    }

    /* renamed from: b */
    public static boolean m7770b() {
        return ((InterfaceC1231c9) f6571c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1374m2
    public final /* synthetic */ InterfaceC1231c9 zza() {
        return this.f6572b.zza();
    }
}
