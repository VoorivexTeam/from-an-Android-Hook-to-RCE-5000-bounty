package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h6 */
/* loaded from: classes.dex */
final class C1303h6 {

    /* renamed from: a */
    private static final InterfaceC1273f6 f6640a = m7883c();

    /* renamed from: b */
    private static final InterfaceC1273f6 f6641b = new C1318i6();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC1273f6 m7881a() {
        return f6640a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC1273f6 m7882b() {
        return f6641b;
    }

    /* renamed from: c */
    private static InterfaceC1273f6 m7883c() {
        try {
            return (InterfaceC1273f6) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
