package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.o5 */
/* loaded from: classes.dex */
public final class C1407o5 implements InterfaceC1422p6 {

    /* renamed from: b */
    private static final InterfaceC1547y5 f6805b = new C1392n5();

    /* renamed from: a */
    private final InterfaceC1547y5 f6806a;

    public C1407o5() {
        this(new C1435q5(C1376m4.m8021a(), m8110a()));
    }

    private C1407o5(InterfaceC1547y5 interfaceC1547y5) {
        C1448r4.m8292a(interfaceC1547y5, "messageInfoFactory");
        this.f6806a = interfaceC1547y5;
    }

    /* renamed from: a */
    private static InterfaceC1547y5 m8110a() {
        try {
            return (InterfaceC1547y5) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f6805b;
        }
    }

    /* renamed from: a */
    private static boolean m8111a(InterfaceC1505v5 interfaceC1505v5) {
        return interfaceC1505v5.zza() == AbstractC1406o4.f.f6801i;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1422p6
    /* renamed from: a */
    public final <T> InterfaceC1436q6<T> mo8112a(Class<T> cls) {
        C1464s6.m8386a((Class<?>) cls);
        InterfaceC1505v5 mo8023b = this.f6806a.mo8023b(cls);
        if (mo8023b.zzb()) {
            return AbstractC1406o4.class.isAssignableFrom(cls) ? C1243d6.m7767a(C1464s6.m8398c(), C1256e4.m7792a(), mo8023b.mo7630b()) : C1243d6.m7767a(C1464s6.m8376a(), C1256e4.m7793b(), mo8023b.mo7630b());
        }
        if (!AbstractC1406o4.class.isAssignableFrom(cls)) {
            boolean m8111a = m8111a(mo8023b);
            InterfaceC1273f6 m7881a = C1303h6.m7881a();
            AbstractC1287g5 m7848a = AbstractC1287g5.m7848a();
            return m8111a ? C1213b6.m7590a(cls, mo8023b, m7881a, m7848a, C1464s6.m8376a(), C1256e4.m7793b(), C1519w5.m8636a()) : C1213b6.m7590a(cls, mo8023b, m7881a, m7848a, C1464s6.m8392b(), (AbstractC1226c4<?>) null, C1519w5.m8636a());
        }
        boolean m8111a2 = m8111a(mo8023b);
        InterfaceC1273f6 m7882b = C1303h6.m7882b();
        AbstractC1287g5 m7849b = AbstractC1287g5.m7849b();
        AbstractC1319i7<?, ?> m8398c = C1464s6.m8398c();
        return m8111a2 ? C1213b6.m7590a(cls, mo8023b, m7882b, m7849b, m8398c, C1256e4.m7792a(), C1519w5.m8637b()) : C1213b6.m7590a(cls, mo8023b, m7882b, m7849b, m8398c, (AbstractC1226c4<?>) null, C1519w5.m8637b());
    }
}
