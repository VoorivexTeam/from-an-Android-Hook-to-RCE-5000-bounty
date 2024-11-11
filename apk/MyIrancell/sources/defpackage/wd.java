package defpackage;

import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.ka;
import defpackage.od;

/* loaded from: classes.dex */
public class wd<Model> implements od<Model, Model> {
    private static final wd<?> a = new wd<>();

    /* loaded from: classes.dex */
    public static class a<Model> implements pd<Model, Model> {
        private static final a<?> a = new a<>();

        @Deprecated
        public a() {
        }

        public static <T> a<T> a() {
            return (a<T>) a;
        }

        @Override // defpackage.pd
        public od<Model, Model> a(sd sdVar) {
            return wd.a();
        }
    }

    /* loaded from: classes.dex */
    private static class b<Model> implements ka<Model> {
        private final Model b;

        b(Model model) {
            this.b = model;
        }

        @Override // defpackage.ka
        public Class<Model> a() {
            return (Class<Model>) this.b.getClass();
        }

        @Override // defpackage.ka
        public void a(g gVar, ka.a<? super Model> aVar) {
            aVar.a((ka.a<? super Model>) this.b);
        }

        @Override // defpackage.ka
        public void b() {
        }

        @Override // defpackage.ka
        public com.bumptech.glide.load.a c() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // defpackage.ka
        public void cancel() {
        }
    }

    @Deprecated
    public wd() {
    }

    public static <T> wd<T> a() {
        return (wd<T>) a;
    }

    @Override // defpackage.od
    public od.a<Model> a(Model model, int i, int i2, i iVar) {
        return new od.a<>(new zh(model), new b(model));
    }

    @Override // defpackage.od
    public boolean a(Model model) {
        return true;
    }
}
