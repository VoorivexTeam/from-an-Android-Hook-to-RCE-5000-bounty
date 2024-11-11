package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o5 implements p6 {
    private static final y5 b = new n5();
    private final y5 a;

    public o5() {
        this(new q5(m4.a(), a()));
    }

    private o5(y5 y5Var) {
        r4.a(y5Var, "messageInfoFactory");
        this.a = y5Var;
    }

    private static y5 a() {
        try {
            return (y5) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    private static boolean a(v5 v5Var) {
        return v5Var.zza() == o4.f.i;
    }

    @Override // com.google.android.gms.internal.measurement.p6
    public final <T> q6<T> a(Class<T> cls) {
        s6.a((Class<?>) cls);
        v5 b2 = this.a.b(cls);
        if (b2.zzb()) {
            return o4.class.isAssignableFrom(cls) ? d6.a(s6.c(), e4.a(), b2.b()) : d6.a(s6.a(), e4.b(), b2.b());
        }
        if (!o4.class.isAssignableFrom(cls)) {
            boolean a = a(b2);
            f6 a2 = h6.a();
            g5 a3 = g5.a();
            return a ? b6.a(cls, b2, a2, a3, s6.a(), e4.b(), w5.a()) : b6.a(cls, b2, a2, a3, s6.b(), (c4<?>) null, w5.a());
        }
        boolean a4 = a(b2);
        f6 b3 = h6.b();
        g5 b4 = g5.b();
        i7<?, ?> c = s6.c();
        return a4 ? b6.a(cls, b2, b3, b4, c, e4.a(), w5.b()) : b6.a(cls, b2, b3, b4, c, (c4<?>) null, w5.b());
    }
}
