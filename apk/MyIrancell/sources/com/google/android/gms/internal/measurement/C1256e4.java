package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e4 */
/* loaded from: classes.dex */
final class C1256e4 {

    /* renamed from: a */
    private static final AbstractC1226c4<?> f6595a = new C1211b4();

    /* renamed from: b */
    private static final AbstractC1226c4<?> f6596b = m7794c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC1226c4<?> m7792a() {
        return f6595a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC1226c4<?> m7793b() {
        AbstractC1226c4<?> abstractC1226c4 = f6596b;
        if (abstractC1226c4 != null) {
            return abstractC1226c4;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: c */
    private static AbstractC1226c4<?> m7794c() {
        try {
            return (AbstractC1226c4) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
