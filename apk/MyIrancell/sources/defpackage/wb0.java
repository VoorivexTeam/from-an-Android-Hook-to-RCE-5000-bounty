package defpackage;

import defpackage.ta0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class wb0 extends ta0.a {
    private wb0() {
    }

    public static wb0 a() {
        return new wb0();
    }

    @Override // ta0.a
    @Nullable
    public ta0<j80, ?> a(Type type, Annotation[] annotationArr, gb0 gb0Var) {
        if (type == String.class) {
            return vb0.a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return nb0.a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return ob0.a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return pb0.a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return qb0.a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return rb0.a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return sb0.a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return tb0.a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return ub0.a;
        }
        return null;
    }

    @Override // ta0.a
    @Nullable
    public ta0<?, h80> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, gb0 gb0Var) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return mb0.a;
        }
        return null;
    }
}
