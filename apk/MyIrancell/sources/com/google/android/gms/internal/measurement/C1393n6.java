package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.n6 */
/* loaded from: classes.dex */
public final class C1393n6 {

    /* renamed from: c */
    private static final C1393n6 f6768c = new C1393n6();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, InterfaceC1436q6<?>> f6770b = new ConcurrentHashMap();

    /* renamed from: a */
    private final InterfaceC1422p6 f6769a = new C1407o5();

    private C1393n6() {
    }

    /* renamed from: a */
    public static C1393n6 m8049a() {
        return f6768c;
    }

    /* renamed from: a */
    public final <T> InterfaceC1436q6<T> m8050a(Class<T> cls) {
        C1448r4.m8292a(cls, "messageType");
        InterfaceC1436q6<T> interfaceC1436q6 = (InterfaceC1436q6) this.f6770b.get(cls);
        if (interfaceC1436q6 != null) {
            return interfaceC1436q6;
        }
        InterfaceC1436q6<T> mo8112a = this.f6769a.mo8112a(cls);
        C1448r4.m8292a(cls, "messageType");
        C1448r4.m8292a(mo8112a, "schema");
        InterfaceC1436q6<T> interfaceC1436q62 = (InterfaceC1436q6) this.f6770b.putIfAbsent(cls, mo8112a);
        return interfaceC1436q62 != null ? interfaceC1436q62 : mo8112a;
    }

    /* renamed from: a */
    public final <T> InterfaceC1436q6<T> m8051a(T t) {
        return m8050a((Class) t.getClass());
    }
}
