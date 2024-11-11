package defpackage;

import defpackage.ta0;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* loaded from: classes.dex */
final class ab0 extends ta0.a {
    static final ta0.a a = new ab0();

    @IgnoreJRERequirement
    /* loaded from: classes.dex */
    static final class a<T> implements ta0<j80, Optional<T>> {
        final ta0<j80, T> a;

        a(ta0<j80, T> ta0Var) {
            this.a = ta0Var;
        }

        @Override // defpackage.ta0
        public Optional<T> a(j80 j80Var) {
            return Optional.ofNullable(this.a.a(j80Var));
        }
    }

    ab0() {
    }

    @Override // ta0.a
    @Nullable
    public ta0<j80, ?> a(Type type, Annotation[] annotationArr, gb0 gb0Var) {
        if (ta0.a.a(type) != Optional.class) {
            return null;
        }
        return new a(gb0Var.b(ta0.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
