package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a4 {
    private static volatile a4 b;
    private static volatile a4 c;
    private static final a4 d = new a4(true);
    private final Map<a, o4.d<?, ?>> a;

    /* loaded from: classes.dex */
    static final class a {
        private final Object a;
        private final int b;

        a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    a4() {
        this.a = new HashMap();
    }

    private a4(boolean z) {
        this.a = Collections.emptyMap();
    }

    public static a4 a() {
        a4 a4Var = b;
        if (a4Var == null) {
            synchronized (a4.class) {
                a4Var = b;
                if (a4Var == null) {
                    a4Var = d;
                    b = a4Var;
                }
            }
        }
        return a4Var;
    }

    public static a4 b() {
        a4 a4Var = c;
        if (a4Var != null) {
            return a4Var;
        }
        synchronized (a4.class) {
            a4 a4Var2 = c;
            if (a4Var2 != null) {
                return a4Var2;
            }
            a4 a2 = n4.a(a4.class);
            c = a2;
            return a2;
        }
    }

    public final <ContainingType extends x5> o4.d<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (o4.d) this.a.get(new a(containingtype, i));
    }
}
