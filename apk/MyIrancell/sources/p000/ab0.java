package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p000.ta0;

@IgnoreJRERequirement
/* loaded from: classes.dex */
final class ab0 extends ta0.AbstractC3255a {

    /* renamed from: a */
    static final ta0.AbstractC3255a f95a = new ab0();

    @IgnoreJRERequirement
    /* renamed from: ab0$a */
    /* loaded from: classes.dex */
    static final class C0015a<T> implements ta0<j80, Optional<T>> {

        /* renamed from: a */
        final ta0<j80, T> f96a;

        C0015a(ta0<j80, T> ta0Var) {
            this.f96a = ta0Var;
        }

        @Override // p000.ta0
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public Optional<T> mo133a(j80 j80Var) {
            return Optional.ofNullable(this.f96a.mo133a(j80Var));
        }
    }

    ab0() {
    }

    @Override // p000.ta0.AbstractC3255a
    @Nullable
    /* renamed from: a */
    public ta0<j80, ?> mo132a(Type type, Annotation[] annotationArr, gb0 gb0Var) {
        if (ta0.AbstractC3255a.m15626a(type) != Optional.class) {
            return null;
        }
        return new C0015a(gb0Var.m11987b(ta0.AbstractC3255a.m15627a(0, (ParameterizedType) type), annotationArr));
    }
}
