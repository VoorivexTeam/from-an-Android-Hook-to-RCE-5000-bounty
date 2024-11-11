package p000;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import p000.qa0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class va0 extends qa0.AbstractC3120a {

    /* renamed from: a */
    final Executor f13667a;

    /* renamed from: va0$a */
    /* loaded from: classes.dex */
    class C3351a implements qa0<Object, pa0<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f13668a;

        C3351a(Type type) {
            this.f13668a = type;
        }

        @Override // p000.qa0
        /* renamed from: a */
        public Type mo15037a() {
            return this.f13668a;
        }

        @Override // p000.qa0
        /* renamed from: a, reason: avoid collision after fix types in other method */
        public pa0<?> mo15036a(pa0<Object> pa0Var) {
            return new C3352b(va0.this.f13667a, pa0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: va0$b */
    /* loaded from: classes.dex */
    public static final class C3352b<T> implements pa0<T> {

        /* renamed from: b */
        final Executor f13670b;

        /* renamed from: c */
        final pa0<T> f13671c;

        /* renamed from: va0$b$a */
        /* loaded from: classes.dex */
        class a implements ra0<T> {

            /* renamed from: a */
            final /* synthetic */ ra0 f13672a;

            /* renamed from: va0$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class RunnableC3577a implements Runnable {

                /* renamed from: b */
                final /* synthetic */ fb0 f13674b;

                RunnableC3577a(fb0 fb0Var) {
                    this.f13674b = fb0Var;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (C3352b.this.f13671c.mo14743f()) {
                        a aVar = a.this;
                        aVar.f13672a.onFailure(C3352b.this, new IOException("Canceled"));
                    } else {
                        a aVar2 = a.this;
                        aVar2.f13672a.onResponse(C3352b.this, this.f13674b);
                    }
                }
            }

            /* renamed from: va0$b$a$b */
            /* loaded from: classes.dex */
            class b implements Runnable {

                /* renamed from: b */
                final /* synthetic */ Throwable f13676b;

                b(Throwable th) {
                    this.f13676b = th;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a aVar = a.this;
                    aVar.f13672a.onFailure(C3352b.this, this.f13676b);
                }
            }

            a(ra0 ra0Var) {
                this.f13672a = ra0Var;
            }

            @Override // p000.ra0
            public void onFailure(pa0<T> pa0Var, Throwable th) {
                C3352b.this.f13670b.execute(new b(th));
            }

            @Override // p000.ra0
            public void onResponse(pa0<T> pa0Var, fb0<T> fb0Var) {
                C3352b.this.f13670b.execute(new RunnableC3577a(fb0Var));
            }
        }

        C3352b(Executor executor, pa0<T> pa0Var) {
            this.f13670b = executor;
            this.f13671c = pa0Var;
        }

        @Override // p000.pa0
        /* renamed from: a */
        public void mo14741a(ra0<T> ra0Var) {
            ib0.m12428a(ra0Var, "callback == null");
            this.f13671c.mo14741a(new a(ra0Var));
        }

        @Override // p000.pa0
        public void cancel() {
            this.f13671c.cancel();
        }

        @Override // p000.pa0
        public pa0<T> clone() {
            return new C3352b(this.f13670b, this.f13671c.clone());
        }

        @Override // p000.pa0
        /* renamed from: e */
        public fb0<T> mo14742e() {
            return this.f13671c.mo14742e();
        }

        @Override // p000.pa0
        /* renamed from: f */
        public boolean mo14743f() {
            return this.f13671c.mo14743f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public va0(Executor executor) {
        this.f13667a = executor;
    }

    @Override // p000.qa0.AbstractC3120a
    @Nullable
    /* renamed from: a */
    public qa0<?, ?> mo15040a(Type type, Annotation[] annotationArr, gb0 gb0Var) {
        if (qa0.AbstractC3120a.m15038a(type) != pa0.class) {
            return null;
        }
        return new C3351a(ib0.m12442b(type));
    }
}
