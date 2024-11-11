package defpackage;

import defpackage.qa0;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* loaded from: classes.dex */
final class sa0 extends qa0.a {
    static final qa0.a a = new sa0();

    @IgnoreJRERequirement
    /* loaded from: classes.dex */
    private static final class a<R> implements qa0<R, CompletableFuture<R>> {
        private final Type a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: sa0$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0080a extends CompletableFuture<R> {
            final /* synthetic */ pa0 b;

            C0080a(a aVar, pa0 pa0Var) {
                this.b = pa0Var;
            }

            @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
            public boolean cancel(boolean z) {
                if (z) {
                    this.b.cancel();
                }
                return super.cancel(z);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b implements ra0<R> {
            final /* synthetic */ CompletableFuture a;

            b(a aVar, CompletableFuture completableFuture) {
                this.a = completableFuture;
            }

            @Override // defpackage.ra0
            public void onFailure(pa0<R> pa0Var, Throwable th) {
                this.a.completeExceptionally(th);
            }

            @Override // defpackage.ra0
            public void onResponse(pa0<R> pa0Var, fb0<R> fb0Var) {
                if (fb0Var.e()) {
                    this.a.complete(fb0Var.a());
                } else {
                    this.a.completeExceptionally(new wa0(fb0Var));
                }
            }
        }

        a(Type type) {
            this.a = type;
        }

        @Override // defpackage.qa0
        public Type a() {
            return this.a;
        }

        @Override // defpackage.qa0
        public CompletableFuture<R> a(pa0<R> pa0Var) {
            C0080a c0080a = new C0080a(this, pa0Var);
            pa0Var.a(new b(this, c0080a));
            return c0080a;
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes.dex */
    private static final class b<R> implements qa0<R, CompletableFuture<fb0<R>>> {
        private final Type a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends CompletableFuture<fb0<R>> {
            final /* synthetic */ pa0 b;

            a(b bVar, pa0 pa0Var) {
                this.b = pa0Var;
            }

            @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
            public boolean cancel(boolean z) {
                if (z) {
                    this.b.cancel();
                }
                return super.cancel(z);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: sa0$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0081b implements ra0<R> {
            final /* synthetic */ CompletableFuture a;

            C0081b(b bVar, CompletableFuture completableFuture) {
                this.a = completableFuture;
            }

            @Override // defpackage.ra0
            public void onFailure(pa0<R> pa0Var, Throwable th) {
                this.a.completeExceptionally(th);
            }

            @Override // defpackage.ra0
            public void onResponse(pa0<R> pa0Var, fb0<R> fb0Var) {
                this.a.complete(fb0Var);
            }
        }

        b(Type type) {
            this.a = type;
        }

        @Override // defpackage.qa0
        public Type a() {
            return this.a;
        }

        @Override // defpackage.qa0
        public CompletableFuture<fb0<R>> a(pa0<R> pa0Var) {
            a aVar = new a(this, pa0Var);
            pa0Var.a(new C0081b(this, aVar));
            return aVar;
        }
    }

    sa0() {
    }

    @Override // qa0.a
    @Nullable
    public qa0<?, ?> a(Type type, Annotation[] annotationArr, gb0 gb0Var) {
        if (qa0.a.a(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type a2 = qa0.a.a(0, (ParameterizedType) type);
        if (qa0.a.a(a2) != fb0.class) {
            return new a(a2);
        }
        if (a2 instanceof ParameterizedType) {
            return new b(qa0.a.a(0, (ParameterizedType) a2));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
