package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p000.qa0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ua0 extends qa0.AbstractC3120a {

    /* renamed from: a */
    static final qa0.AbstractC3120a f13455a = new ua0();

    /* renamed from: ua0$a */
    /* loaded from: classes.dex */
    class C3299a implements qa0<Object, pa0<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f13456a;

        C3299a(ua0 ua0Var, Type type) {
            this.f13456a = type;
        }

        @Override // p000.qa0
        /* renamed from: a */
        public /* bridge */ /* synthetic */ pa0<?> mo15036a(pa0<Object> pa0Var) {
            mo15036a(pa0Var);
            return pa0Var;
        }

        @Override // p000.qa0
        /* renamed from: a */
        public Type mo15037a() {
            return this.f13456a;
        }

        @Override // p000.qa0
        /* renamed from: a, reason: avoid collision after fix types in other method */
        public pa0<?> mo15036a(pa0<Object> pa0Var) {
            return pa0Var;
        }
    }

    ua0() {
    }

    @Override // p000.qa0.AbstractC3120a
    @Nullable
    /* renamed from: a */
    public qa0<?, ?> mo15040a(Type type, Annotation[] annotationArr, gb0 gb0Var) {
        if (qa0.AbstractC3120a.m15038a(type) != pa0.class) {
            return null;
        }
        return new C3299a(this, ib0.m12442b(type));
    }
}
