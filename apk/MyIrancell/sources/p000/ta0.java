package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public interface ta0<F, T> {

    /* renamed from: ta0$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3255a {
        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public static Class<?> m15626a(Type type) {
            return ib0.m12444c(type);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public static Type m15627a(int i, ParameterizedType parameterizedType) {
            return ib0.m12433a(i, parameterizedType);
        }

        @Nullable
        /* renamed from: a */
        public ta0<j80, ?> mo132a(Type type, Annotation[] annotationArr, gb0 gb0Var) {
            return null;
        }

        @Nullable
        /* renamed from: a */
        public ta0<?, h80> mo13441a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, gb0 gb0Var) {
            return null;
        }

        @Nullable
        /* renamed from: b */
        public ta0<?, String> m15628b(Type type, Annotation[] annotationArr, gb0 gb0Var) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    T mo133a(F f);
}
