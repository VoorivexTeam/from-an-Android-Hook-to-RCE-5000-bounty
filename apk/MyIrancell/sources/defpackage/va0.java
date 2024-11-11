package defpackage;

import defpackage.qa0;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class va0 extends qa0.a {
    final Executor a;

    /* loaded from: classes.dex */
    class a implements qa0<Object, pa0<?>> {
        final /* synthetic */ Type a;

        a(Type type) {
            this.a = type;
        }

        @Override // defpackage.qa0
        public Type a() {
            return this.a;
        }

        @Override // defpackage.qa0
        public pa0<?> a(pa0<Object> pa0Var) {
            return new b(va0.this.a, pa0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b<T> implements pa0<T> {
        final Executor b;
        final pa0<T> c;

        /* loaded from: classes.dex */
        class a implements ra0<T> {
            final /* synthetic */ ra0 a;

            /* renamed from: va0$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class RunnableC0083a implements Runnable {
                final /* synthetic */ fb0 b;

                RunnableC0083a(fb0 fb0Var) {
                    this.b = fb0Var;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.c.f()) {
                        a aVar = a.this;
                        aVar.a.onFailure(b.this, new IOException("Canceled"));
                    } else {
                        a aVar2 = a.this;
                        aVar2.a.onResponse(b.this, this.b);
                    }
                }
            }

            /* renamed from: va0$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class RunnableC0084b implements Runnable {
                final /* synthetic */ Throwable b;

                RunnableC0084b(Throwable th) {
                    this.b = th;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a aVar = a.this;
                    aVar.a.onFailure(b.this, this.b);
                }
            }

            a(ra0 ra0Var) {
                this.a = ra0Var;
            }

            @Override // defpackage.ra0
            public void onFailure(pa0<T> pa0Var, Throwable th) {
                b.this.b.execute(new RunnableC0084b(th));
            }

            @Override // defpackage.ra0
            public void onResponse(pa0<T> pa0Var, fb0<T> fb0Var) {
                b.this.b.execute(new RunnableC0083a(fb0Var));
            }
        }

        b(Executor executor, pa0<T> pa0Var) {
            this.b = executor;
            this.c = pa0Var;
        }

        @Override // defpackage.pa0
        public void a(ra0<T> ra0Var) {
            ib0.a(ra0Var, "callback == null");
            this.c.a(new a(ra0Var));
        }

        @Override // defpackage.pa0
        public void cancel() {
            this.c.cancel();
        }

        @Override // defpackage.pa0
        public pa0<T> clone() {
            return new b(this.b, this.c.clone());
        }

        @Override // defpackage.pa0
        public fb0<T> e() {
            return this.c.e();
        }

        @Override // defpackage.pa0
        public boolean f() {
            return this.c.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public va0(Executor executor) {
        this.a = executor;
    }

    @Override // qa0.a
    @Nullable
    public qa0<?, ?> a(Type type, Annotation[] annotationArr, gb0 gb0Var) {
        if (qa0.a.a(type) != pa0.class) {
            return null;
        }
        return new a(ib0.b(type));
    }
}
