package defpackage;

import defpackage.qa0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ua0 extends qa0.a {
    static final qa0.a a = new ua0();

    /* loaded from: classes.dex */
    class a implements qa0<Object, pa0<?>> {
        final /* synthetic */ Type a;

        a(ua0 ua0Var, Type type) {
            this.a = type;
        }

        @Override // defpackage.qa0
        public /* bridge */ /* synthetic */ pa0<?> a(pa0<Object> pa0Var) {
            a2(pa0Var);
            return pa0Var;
        }

        @Override // defpackage.qa0
        public Type a() {
            return this.a;
        }

        @Override // defpackage.qa0
        /* renamed from: a, reason: avoid collision after fix types in other method */
        public pa0<?> a2(pa0<Object> pa0Var) {
            return pa0Var;
        }
    }

    ua0() {
    }

    @Override // qa0.a
    @Nullable
    public qa0<?, ?> a(Type type, Annotation[] annotationArr, gb0 gb0Var) {
        if (qa0.a.a(type) != pa0.class) {
            return null;
        }
        return new a(this, ib0.b(type));
    }
}
