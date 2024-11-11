package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.Unit;
import p000.ta0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class oa0 extends ta0.AbstractC3255a {

    /* renamed from: a */
    private boolean f12446a = true;

    /* renamed from: oa0$a */
    /* loaded from: classes.dex */
    static final class C3023a implements ta0<j80, j80> {

        /* renamed from: a */
        static final C3023a f12447a = new C3023a();

        C3023a() {
        }

        @Override // p000.ta0
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public j80 mo133a(j80 j80Var) {
            try {
                return ib0.m12426a(j80Var);
            } finally {
                j80Var.close();
            }
        }
    }

    /* renamed from: oa0$b */
    /* loaded from: classes.dex */
    static final class C3024b implements ta0<h80, h80> {

        /* renamed from: a */
        static final C3024b f12448a = new C3024b();

        C3024b() {
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        public h80 a2(h80 h80Var) {
            return h80Var;
        }

        @Override // p000.ta0
        /* renamed from: a */
        public /* bridge */ /* synthetic */ h80 mo133a(h80 h80Var) {
            h80 h80Var2 = h80Var;
            a2(h80Var2);
            return h80Var2;
        }
    }

    /* renamed from: oa0$c */
    /* loaded from: classes.dex */
    static final class C3025c implements ta0<j80, j80> {

        /* renamed from: a */
        static final C3025c f12449a = new C3025c();

        C3025c() {
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        public j80 a2(j80 j80Var) {
            return j80Var;
        }

        @Override // p000.ta0
        /* renamed from: a */
        public /* bridge */ /* synthetic */ j80 mo133a(j80 j80Var) {
            j80 j80Var2 = j80Var;
            a2(j80Var2);
            return j80Var2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oa0$d */
    /* loaded from: classes.dex */
    public static final class C3026d implements ta0<Object, String> {

        /* renamed from: a */
        static final C3026d f12450a = new C3026d();

        C3026d() {
        }

        @Override // p000.ta0
        /* renamed from: a, reason: avoid collision after fix types in other method */
        public String mo133a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: oa0$e */
    /* loaded from: classes.dex */
    static final class C3027e implements ta0<j80, Unit> {

        /* renamed from: a */
        static final C3027e f12451a = new C3027e();

        C3027e() {
        }

        @Override // p000.ta0
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public Unit mo133a(j80 j80Var) {
            j80Var.close();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: oa0$f */
    /* loaded from: classes.dex */
    static final class C3028f implements ta0<j80, Void> {

        /* renamed from: a */
        static final C3028f f12452a = new C3028f();

        C3028f() {
        }

        @Override // p000.ta0
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public Void mo133a(j80 j80Var) {
            j80Var.close();
            return null;
        }
    }

    @Override // p000.ta0.AbstractC3255a
    @Nullable
    /* renamed from: a */
    public ta0<j80, ?> mo132a(Type type, Annotation[] annotationArr, gb0 gb0Var) {
        if (type == j80.class) {
            return ib0.m12441a(annotationArr, (Class<? extends Annotation>) rc0.class) ? C3025c.f12449a : C3023a.f12447a;
        }
        if (type == Void.class) {
            return C3028f.f12452a;
        }
        if (!this.f12446a || type != Unit.class) {
            return null;
        }
        try {
            return C3027e.f12451a;
        } catch (NoClassDefFoundError unused) {
            this.f12446a = false;
            return null;
        }
    }

    @Override // p000.ta0.AbstractC3255a
    @Nullable
    /* renamed from: a */
    public ta0<?, h80> mo13441a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, gb0 gb0Var) {
        if (h80.class.isAssignableFrom(ib0.m12444c(type))) {
            return C3024b.f12448a;
        }
        return null;
    }
}
