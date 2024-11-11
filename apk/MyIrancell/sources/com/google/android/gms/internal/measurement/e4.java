package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class e4 {
    private static final c4<?> a = new b4();
    private static final c4<?> b = c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c4<?> a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c4<?> b() {
        c4<?> c4Var = b;
        if (c4Var != null) {
            return c4Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static c4<?> c() {
        try {
            return (c4) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
