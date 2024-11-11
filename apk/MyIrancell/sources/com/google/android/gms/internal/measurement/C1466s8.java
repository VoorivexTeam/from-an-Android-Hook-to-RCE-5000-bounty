package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.s8 */
/* loaded from: classes.dex */
public final class C1466s8 implements InterfaceC1374m2<InterfaceC1508v8> {

    /* renamed from: c */
    private static C1466s8 f6894c = new C1466s8();

    /* renamed from: b */
    private final InterfaceC1374m2<InterfaceC1508v8> f6895b;

    public C1466s8() {
        this(C1359l2.m7959a(new C1494u8()));
    }

    private C1466s8(InterfaceC1374m2<InterfaceC1508v8> interfaceC1374m2) {
        this.f6895b = C1359l2.m7958a((InterfaceC1374m2) interfaceC1374m2);
    }

    /* renamed from: a */
    public static boolean m8428a() {
        return ((InterfaceC1508v8) f6894c.zza()).zza();
    }

    /* renamed from: b */
    public static boolean m8429b() {
        return ((InterfaceC1508v8) f6894c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1374m2
    public final /* synthetic */ InterfaceC1508v8 zza() {
        return this.f6895b.zza();
    }
}
