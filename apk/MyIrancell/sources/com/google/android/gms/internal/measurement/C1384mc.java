package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.mc */
/* loaded from: classes.dex */
public final class C1384mc implements InterfaceC1374m2<InterfaceC1369lc> {

    /* renamed from: c */
    private static C1384mc f6755c = new C1384mc();

    /* renamed from: b */
    private final InterfaceC1374m2<InterfaceC1369lc> f6756b;

    public C1384mc() {
        this(C1359l2.m7959a(new C1414oc()));
    }

    private C1384mc(InterfaceC1374m2<InterfaceC1369lc> interfaceC1374m2) {
        this.f6756b = C1359l2.m7958a((InterfaceC1374m2) interfaceC1374m2);
    }

    /* renamed from: a */
    public static boolean m8032a() {
        return ((InterfaceC1369lc) f6755c.zza()).zza();
    }

    /* renamed from: b */
    public static boolean m8033b() {
        return ((InterfaceC1369lc) f6755c.zza()).zzb();
    }

    /* renamed from: c */
    public static boolean m8034c() {
        return ((InterfaceC1369lc) f6755c.zza()).mo7972b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1374m2
    public final /* synthetic */ InterfaceC1369lc zza() {
        return this.f6756b.zza();
    }
}
