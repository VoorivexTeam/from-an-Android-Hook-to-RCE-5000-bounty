package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.w5 */
/* loaded from: classes.dex */
final class C1519w5 {

    /* renamed from: a */
    private static final InterfaceC1491u5 f6981a = m8638c();

    /* renamed from: b */
    private static final InterfaceC1491u5 f6982b = new C1477t5();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC1491u5 m8636a() {
        return f6981a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC1491u5 m8637b() {
        return f6982b;
    }

    /* renamed from: c */
    private static InterfaceC1491u5 m8638c() {
        try {
            return (InterfaceC1491u5) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
