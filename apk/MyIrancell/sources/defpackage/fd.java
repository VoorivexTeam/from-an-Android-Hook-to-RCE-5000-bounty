package defpackage;

import android.util.Base64;
import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.ka;
import defpackage.od;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class fd<Model, Data> implements od<Model, Data> {
    private final a<Data> a;

    /* loaded from: classes.dex */
    public interface a<Data> {
        Class<Data> a();

        Data a(String str);

        void a(Data data);
    }

    /* loaded from: classes.dex */
    private static final class b<Data> implements ka<Data> {
        private final String b;
        private final a<Data> c;
        private Data d;

        b(String str, a<Data> aVar) {
            this.b = str;
            this.c = aVar;
        }

        @Override // defpackage.ka
        public Class<Data> a() {
            return this.c.a();
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, Data] */
        @Override // defpackage.ka
        public void a(g gVar, ka.a<? super Data> aVar) {
            try {
                Data a = this.c.a(this.b);
                this.d = a;
                aVar.a((ka.a<? super Data>) a);
            } catch (IllegalArgumentException e) {
                aVar.a((Exception) e);
            }
        }

        @Override // defpackage.ka
        public void b() {
            try {
                this.c.a((a<Data>) this.d);
            } catch (IOException unused) {
            }
        }

        @Override // defpackage.ka
        public com.bumptech.glide.load.a c() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // defpackage.ka
        public void cancel() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c<Model> implements pd<Model, InputStream> {
        private final a<InputStream> a = new a(this);

        /* loaded from: classes.dex */
        class a implements a<InputStream> {
            a(c cVar) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // fd.a
            public InputStream a(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }

            @Override // fd.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // fd.a
            public void a(InputStream inputStream) {
                inputStream.close();
            }
        }

        @Override // defpackage.pd
        public od<Model, InputStream> a(sd sdVar) {
            return new fd(this.a);
        }
    }

    public fd(a<Data> aVar) {
        this.a = aVar;
    }

    @Override // defpackage.od
    public od.a<Data> a(Model model, int i, int i2, i iVar) {
        return new od.a<>(new zh(model), new b(model.toString(), this.a));
    }

    @Override // defpackage.od
    public boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }
}
