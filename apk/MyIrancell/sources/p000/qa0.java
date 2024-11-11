package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public interface qa0<R, T> {

    /* renamed from: qa0$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3120a {
        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public static Class<?> m15038a(Type type) {
            return ib0.m12444c(type);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public static Type m15039a(int i, ParameterizedType parameterizedType) {
            return ib0.m12433a(i, parameterizedType);
        }

        @Nullable
        /* renamed from: a */
        public abstract qa0<?, ?> mo15040a(Type type, Annotation[] annotationArr, gb0 gb0Var);
    }

    /* renamed from: a */
    T mo15036a(pa0<R> pa0Var);

    /* renamed from: a */
    Type mo15037a();
}
