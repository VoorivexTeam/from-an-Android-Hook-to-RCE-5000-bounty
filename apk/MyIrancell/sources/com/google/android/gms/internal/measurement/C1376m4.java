package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;

/* renamed from: com.google.android.gms.internal.measurement.m4 */
/* loaded from: classes.dex */
final class C1376m4 implements InterfaceC1547y5 {

    /* renamed from: a */
    private static final C1376m4 f6744a = new C1376m4();

    private C1376m4() {
    }

    /* renamed from: a */
    public static C1376m4 m8021a() {
        return f6744a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1547y5
    /* renamed from: a */
    public final boolean mo8022a(Class<?> cls) {
        return AbstractC1406o4.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1547y5
    /* renamed from: b */
    public final InterfaceC1505v5 mo8023b(Class<?> cls) {
        if (!AbstractC1406o4.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (InterfaceC1505v5) AbstractC1406o4.m8080a(cls.asSubclass(AbstractC1406o4.class)).mo7518a(AbstractC1406o4.f.f6795c, (Object) null, (Object) null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
