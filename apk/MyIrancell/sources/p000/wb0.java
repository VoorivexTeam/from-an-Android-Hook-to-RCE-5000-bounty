package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p000.ta0;

/* loaded from: classes.dex */
public final class wb0 extends ta0.AbstractC3255a {
    private wb0() {
    }

    /* renamed from: a */
    public static wb0 m16198a() {
        return new wb0();
    }

    @Override // p000.ta0.AbstractC3255a
    @Nullable
    /* renamed from: a */
    public ta0<j80, ?> mo132a(Type type, Annotation[] annotationArr, gb0 gb0Var) {
        if (type == String.class) {
            return vb0.f13678a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return nb0.f12310a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return ob0.f12453a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return pb0.f12594a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return qb0.f12779a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return rb0.f12946a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return sb0.f13076a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return tb0.f13300a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return ub0.f13462a;
        }
        return null;
    }

    @Override // p000.ta0.AbstractC3255a
    @Nullable
    /* renamed from: a */
    public ta0<?, h80> mo13441a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, gb0 gb0Var) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return mb0.f12136a;
        }
        return null;
    }
}
