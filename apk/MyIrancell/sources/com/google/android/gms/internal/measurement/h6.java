package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class h6 {
    private static final f6 a = c();
    private static final f6 b = new i6();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f6 a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f6 b() {
        return b;
    }

    private static f6 c() {
        try {
            return (f6) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
