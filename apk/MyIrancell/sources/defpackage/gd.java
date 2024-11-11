package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.ka;
import defpackage.od;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class gd<Data> implements od<File, Data> {
    private final d<Data> a;

    /* loaded from: classes.dex */
    public static class a<Data> implements pd<File, Data> {
        private final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @Override // defpackage.pd
        public final od<File, Data> a(sd sdVar) {
            return new gd(this.a);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* loaded from: classes.dex */
        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // gd.d
            public ParcelFileDescriptor a(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // gd.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // gd.d
            public void a(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }
        }

        public b() {
            super(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c<Data> implements ka<Data> {
        private final File b;
        private final d<Data> c;
        private Data d;

        c(File file, d<Data> dVar) {
            this.b = file;
            this.c = dVar;
        }

        @Override // defpackage.ka
        public Class<Data> a() {
            return this.c.a();
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // defpackage.ka
        public void a(g gVar, ka.a<? super Data> aVar) {
            try {
                Data a = this.c.a(this.b);
                this.d = a;
                aVar.a((ka.a<? super Data>) a);
            } catch (FileNotFoundException e) {
                Log.isLoggable("FileLoader", 3);
                aVar.a((Exception) e);
            }
        }

        @Override // defpackage.ka
        public void b() {
            Data data = this.d;
            if (data != null) {
                try {
                    this.c.a((d<Data>) data);
                } catch (IOException unused) {
                }
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
    public interface d<Data> {
        Class<Data> a();

        Data a(File file);

        void a(Data data);
    }

    /* loaded from: classes.dex */
    public static class e extends a<InputStream> {

        /* loaded from: classes.dex */
        class a implements d<InputStream> {
            a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // gd.d
            public InputStream a(File file) {
                return new FileInputStream(file);
            }

            @Override // gd.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // gd.d
            public void a(InputStream inputStream) {
                inputStream.close();
            }
        }

        public e() {
            super(new a());
        }
    }

    public gd(d<Data> dVar) {
        this.a = dVar;
    }

    @Override // defpackage.od
    public od.a<Data> a(File file, int i, int i2, i iVar) {
        return new od.a<>(new zh(file), new c(file, this.a));
    }

    @Override // defpackage.od
    public boolean a(File file) {
        return true;
    }
}
