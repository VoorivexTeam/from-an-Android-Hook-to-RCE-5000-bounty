package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public interface qa0<R, T> {

    /* loaded from: classes.dex */
    public static abstract class a {
        /* JADX INFO: Access modifiers changed from: protected */
        public static Class<?> a(Type type) {
            return ib0.c(type);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public static Type a(int i, ParameterizedType parameterizedType) {
            return ib0.a(i, parameterizedType);
        }

        @Nullable
        public abstract qa0<?, ?> a(Type type, Annotation[] annotationArr, gb0 gb0Var);
    }

    T a(pa0<R> pa0Var);

    Type a();
}
