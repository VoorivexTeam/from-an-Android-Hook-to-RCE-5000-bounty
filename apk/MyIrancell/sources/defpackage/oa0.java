package defpackage;

import defpackage.ta0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.Unit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class oa0 extends ta0.a {
    private boolean a = true;

    /* loaded from: classes.dex */
    static final class a implements ta0<j80, j80> {
        static final a a = new a();

        a() {
        }

        @Override // defpackage.ta0
        public j80 a(j80 j80Var) {
            try {
                return ib0.a(j80Var);
            } finally {
                j80Var.close();
            }
        }
    }

    /* loaded from: classes.dex */
    static final class b implements ta0<h80, h80> {
        static final b a = new b();

        b() {
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        public h80 a2(h80 h80Var) {
            return h80Var;
        }

        @Override // defpackage.ta0
        public /* bridge */ /* synthetic */ h80 a(h80 h80Var) {
            h80 h80Var2 = h80Var;
            a2(h80Var2);
            return h80Var2;
        }
    }

    /* loaded from: classes.dex */
    static final class c implements ta0<j80, j80> {
        static final c a = new c();

        c() {
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        public j80 a2(j80 j80Var) {
            return j80Var;
        }

        @Override // defpackage.ta0
        public /* bridge */ /* synthetic */ j80 a(j80 j80Var) {
            j80 j80Var2 = j80Var;
            a2(j80Var2);
            return j80Var2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d implements ta0<Object, String> {
        static final d a = new d();

        d() {
        }

        @Override // defpackage.ta0
        public String a(Object obj) {
            return obj.toString();
        }
    }

    /* loaded from: classes.dex */
    static final class e implements ta0<j80, Unit> {
        static final e a = new e();

        e() {
        }

        @Override // defpackage.ta0
        public Unit a(j80 j80Var) {
            j80Var.close();
            return Unit.INSTANCE;
        }
    }

    /* loaded from: classes.dex */
    static final class f implements ta0<j80, Void> {
        static final f a = new f();

        f() {
        }

        @Override // defpackage.ta0
        public Void a(j80 j80Var) {
            j80Var.close();
            return null;
        }
    }

    @Override // ta0.a
    @Nullable
    public ta0<j80, ?> a(Type type, Annotation[] annotationArr, gb0 gb0Var) {
        if (type == j80.class) {
            return ib0.a(annotationArr, (Class<? extends Annotation>) rc0.class) ? c.a : a.a;
        }
        if (type == Void.class) {
            return f.a;
        }
        if (!this.a || type != Unit.class) {
            return null;
        }
        try {
            return e.a;
        } catch (NoClassDefFoundError unused) {
            this.a = false;
            return null;
        }
    }

    @Override // ta0.a
    @Nullable
    public ta0<?, h80> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, gb0 gb0Var) {
        if (h80.class.isAssignableFrom(ib0.c(type))) {
            return b.a;
        }
        return null;
    }
}
