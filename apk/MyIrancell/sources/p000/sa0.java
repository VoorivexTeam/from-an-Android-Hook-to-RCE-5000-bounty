package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p000.qa0;

@IgnoreJRERequirement
/* loaded from: classes.dex */
final class sa0 extends qa0.AbstractC3120a {

    /* renamed from: a */
    static final qa0.AbstractC3120a f13067a = new sa0();

    @IgnoreJRERequirement
    /* renamed from: sa0$a */
    /* loaded from: classes.dex */
    private static final class C3202a<R> implements qa0<R, CompletableFuture<R>> {

        /* renamed from: a */
        private final Type f13068a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: sa0$a$a */
        /* loaded from: classes.dex */
        public class a extends CompletableFuture<R> {

            /* renamed from: b */
            final /* synthetic */ pa0 f13069b;

            a(C3202a c3202a, pa0 pa0Var) {
                this.f13069b = pa0Var;
            }

            @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
            public boolean cancel(boolean z) {
                if (z) {
                    this.f13069b.cancel();
                }
                return super.cancel(z);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: sa0$a$b */
        /* loaded from: classes.dex */
        public class b implements ra0<R> {

            /* renamed from: a */
            final /* synthetic */ CompletableFuture f13070a;

            b(C3202a c3202a, CompletableFuture completableFuture) {
                this.f13070a = completableFuture;
            }

            @Override // p000.ra0
            public void onFailure(pa0<R> pa0Var, Throwable th) {
                this.f13070a.completeExceptionally(th);
            }

            @Override // p000.ra0
            public void onResponse(pa0<R> pa0Var, fb0<R> fb0Var) {
                if (fb0Var.m11755e()) {
                    this.f13070a.complete(fb0Var.m11751a());
                } else {
                    this.f13070a.completeExceptionally(new wa0(fb0Var));
                }
            }
        }

        C3202a(Type type) {
            this.f13068a = type;
        }

        @Override // p000.qa0
        /* renamed from: a */
        public Type mo15037a() {
            return this.f13068a;
        }

        @Override // p000.qa0
        /* renamed from: a */
        public CompletableFuture<R> mo15036a(pa0<R> pa0Var) {
            a aVar = new a(this, pa0Var);
            pa0Var.mo14741a(new b(this, aVar));
            return aVar;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: sa0$b */
    /* loaded from: classes.dex */
    private static final class C3203b<R> implements qa0<R, CompletableFuture<fb0<R>>> {

        /* renamed from: a */
        private final Type f13071a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: sa0$b$a */
        /* loaded from: classes.dex */
        public class a extends CompletableFuture<fb0<R>> {

            /* renamed from: b */
            final /* synthetic */ pa0 f13072b;

            a(C3203b c3203b, pa0 pa0Var) {
                this.f13072b = pa0Var;
            }

            @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
            public boolean cancel(boolean z) {
                if (z) {
                    this.f13072b.cancel();
                }
                return super.cancel(z);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: sa0$b$b */
        /* loaded from: classes.dex */
        public class b implements ra0<R> {

            /* renamed from: a */
            final /* synthetic */ CompletableFuture f13073a;

            b(C3203b c3203b, CompletableFuture completableFuture) {
                this.f13073a = completableFuture;
            }

            @Override // p000.ra0
            public void onFailure(pa0<R> pa0Var, Throwable th) {
                this.f13073a.completeExceptionally(th);
            }

            @Override // p000.ra0
            public void onResponse(pa0<R> pa0Var, fb0<R> fb0Var) {
                this.f13073a.complete(fb0Var);
            }
        }

        C3203b(Type type) {
            this.f13071a = type;
        }

        @Override // p000.qa0
        /* renamed from: a */
        public Type mo15037a() {
            return this.f13071a;
        }

        @Override // p000.qa0
        /* renamed from: a */
        public CompletableFuture<fb0<R>> mo15036a(pa0<R> pa0Var) {
            a aVar = new a(this, pa0Var);
            pa0Var.mo14741a(new b(this, aVar));
            return aVar;
        }
    }

    sa0() {
    }

    @Override // p000.qa0.AbstractC3120a
    @Nullable
    /* renamed from: a */
    public qa0<?, ?> mo15040a(Type type, Annotation[] annotationArr, gb0 gb0Var) {
        if (qa0.AbstractC3120a.m15038a(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type m15039a = qa0.AbstractC3120a.m15039a(0, (ParameterizedType) type);
        if (qa0.AbstractC3120a.m15038a(m15039a) != fb0.class) {
            return new C3202a(m15039a);
        }
        if (m15039a instanceof ParameterizedType) {
            return new C3203b(qa0.AbstractC3120a.m15039a(0, (ParameterizedType) m15039a));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
