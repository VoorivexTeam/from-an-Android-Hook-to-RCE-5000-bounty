package p000;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.EnumC0562g;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.EnumC0567a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p000.InterfaceC2853ka;
import p000.InterfaceC3031od;

/* renamed from: gd */
/* loaded from: classes.dex */
public class C2509gd<Data> implements InterfaceC3031od<File, Data> {

    /* renamed from: a */
    private final d<Data> f10311a;

    /* renamed from: gd$a */
    /* loaded from: classes.dex */
    public static class a<Data> implements InterfaceC3081pd<File, Data> {

        /* renamed from: a */
        private final d<Data> f10312a;

        public a(d<Data> dVar) {
            this.f10312a = dVar;
        }

        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public final InterfaceC3031od<File, Data> mo139a(C3206sd c3206sd) {
            return new C2509gd(this.f10312a);
        }
    }

    /* renamed from: gd$b */
    /* loaded from: classes.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* renamed from: gd$b$a */
        /* loaded from: classes.dex */
        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.C2509gd.d
            /* renamed from: a */
            public ParcelFileDescriptor mo11995a(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // p000.C2509gd.d
            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo11996a() {
                return ParcelFileDescriptor.class;
            }

            @Override // p000.C2509gd.d
            /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo11997a(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }
        }

        public b() {
            super(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gd$c */
    /* loaded from: classes.dex */
    public static final class c<Data> implements InterfaceC2853ka<Data> {

        /* renamed from: b */
        private final File f10313b;

        /* renamed from: c */
        private final d<Data> f10314c;

        /* renamed from: d */
        private Data f10315d;

        c(File file, d<Data> dVar) {
            this.f10313b = file;
            this.f10314c = dVar;
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: a */
        public Class<Data> mo3663a() {
            return this.f10314c.mo11996a();
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // p000.InterfaceC2853ka
        /* renamed from: a */
        public void mo3664a(EnumC0562g enumC0562g, InterfaceC2853ka.a<? super Data> aVar) {
            try {
                Data mo11995a = this.f10314c.mo11995a(this.f10313b);
                this.f10315d = mo11995a;
                aVar.mo3639a((InterfaceC2853ka.a<? super Data>) mo11995a);
            } catch (FileNotFoundException e) {
                Log.isLoggable("FileLoader", 3);
                aVar.mo3638a((Exception) e);
            }
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: b */
        public void mo3665b() {
            Data data = this.f10315d;
            if (data != null) {
                try {
                    this.f10314c.mo11997a((d<Data>) data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: c */
        public EnumC0567a mo3666c() {
            return EnumC0567a.LOCAL;
        }

        @Override // p000.InterfaceC2853ka
        public void cancel() {
        }
    }

    /* renamed from: gd$d */
    /* loaded from: classes.dex */
    public interface d<Data> {
        /* renamed from: a */
        Class<Data> mo11996a();

        /* renamed from: a */
        Data mo11995a(File file);

        /* renamed from: a */
        void mo11997a(Data data);
    }

    /* renamed from: gd$e */
    /* loaded from: classes.dex */
    public static class e extends a<InputStream> {

        /* renamed from: gd$e$a */
        /* loaded from: classes.dex */
        class a implements d<InputStream> {
            a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.C2509gd.d
            /* renamed from: a */
            public InputStream mo11995a(File file) {
                return new FileInputStream(file);
            }

            @Override // p000.C2509gd.d
            /* renamed from: a */
            public Class<InputStream> mo11996a() {
                return InputStream.class;
            }

            @Override // p000.C2509gd.d
            /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo11997a(InputStream inputStream) {
                inputStream.close();
            }
        }

        public e() {
            super(new a());
        }
    }

    public C2509gd(d<Data> dVar) {
        this.f10311a = dVar;
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3031od.a<Data> mo137a(File file, int i, int i2, C0575i c0575i) {
        return new InterfaceC3031od.a<>(new C3529zh(file), new c(file, this.f10311a));
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo138a(File file) {
        return true;
    }
}
