package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public interface ta0<F, T> {

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
        public ta0<j80, ?> a(Type type, Annotation[] annotationArr, gb0 gb0Var) {
            return null;
        }

        @Nullable
        public ta0<?, h80> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, gb0 gb0Var) {
            return null;
        }

        @Nullable
        public ta0<?, String> b(Type type, Annotation[] annotationArr, gb0 gb0Var) {
            return null;
        }
    }

    @Nullable
    T a(F f);
}
