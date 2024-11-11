package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;

/* loaded from: classes.dex */
final class m4 implements y5 {
    private static final m4 a = new m4();

    private m4() {
    }

    public static m4 a() {
        return a;
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final boolean a(Class<?> cls) {
        return o4.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final v5 b(Class<?> cls) {
        if (!o4.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (v5) o4.a(cls.asSubclass(o4.class)).a(o4.f.c, (Object) null, (Object) null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
