package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.measurement.l2 */
/* loaded from: classes.dex */
public final class C1359l2 {
    /* renamed from: a */
    public static <T> InterfaceC1374m2<T> m7958a(InterfaceC1374m2<T> interfaceC1374m2) {
        return ((interfaceC1374m2 instanceof C1389n2) || (interfaceC1374m2 instanceof C1404o2)) ? interfaceC1374m2 : interfaceC1374m2 instanceof Serializable ? new C1404o2(interfaceC1374m2) : new C1389n2(interfaceC1374m2);
    }

    /* renamed from: a */
    public static <T> InterfaceC1374m2<T> m7959a(@NullableDecl T t) {
        return new C1432q2(t);
    }
}
