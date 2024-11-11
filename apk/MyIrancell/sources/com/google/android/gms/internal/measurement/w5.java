package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class w5 {
    private static final u5 a = c();
    private static final u5 b = new t5();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u5 a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u5 b() {
        return b;
    }

    private static u5 c() {
        try {
            return (u5) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
