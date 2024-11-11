package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.a4 */
/* loaded from: classes.dex */
public class C1196a4 {

    /* renamed from: b */
    private static volatile C1196a4 f6488b;

    /* renamed from: c */
    private static volatile C1196a4 f6489c;

    /* renamed from: d */
    private static final C1196a4 f6490d = new C1196a4(true);

    /* renamed from: a */
    private final Map<a, AbstractC1406o4.d<?, ?>> f6491a;

    /* renamed from: com.google.android.gms.internal.measurement.a4$a */
    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: a */
        private final Object f6492a;

        /* renamed from: b */
        private final int f6493b;

        a(Object obj, int i) {
            this.f6492a = obj;
            this.f6493b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6492a == aVar.f6492a && this.f6493b == aVar.f6493b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f6492a) * 65535) + this.f6493b;
        }
    }

    C1196a4() {
        this.f6491a = new HashMap();
    }

    private C1196a4(boolean z) {
        this.f6491a = Collections.emptyMap();
    }

    /* renamed from: a */
    public static C1196a4 m7530a() {
        C1196a4 c1196a4 = f6488b;
        if (c1196a4 == null) {
            synchronized (C1196a4.class) {
                c1196a4 = f6488b;
                if (c1196a4 == null) {
                    c1196a4 = f6490d;
                    f6488b = c1196a4;
                }
            }
        }
        return c1196a4;
    }

    /* renamed from: b */
    public static C1196a4 m7531b() {
        C1196a4 c1196a4 = f6489c;
        if (c1196a4 != null) {
            return c1196a4;
        }
        synchronized (C1196a4.class) {
            C1196a4 c1196a42 = f6489c;
            if (c1196a42 != null) {
                return c1196a42;
            }
            C1196a4 m8047a = AbstractC1391n4.m8047a(C1196a4.class);
            f6489c = m8047a;
            return m8047a;
        }
    }

    /* renamed from: a */
    public final <ContainingType extends InterfaceC1533x5> AbstractC1406o4.d<ContainingType, ?> m7532a(ContainingType containingtype, int i) {
        return (AbstractC1406o4.d) this.f6491a.get(new a(containingtype, i));
    }
}
