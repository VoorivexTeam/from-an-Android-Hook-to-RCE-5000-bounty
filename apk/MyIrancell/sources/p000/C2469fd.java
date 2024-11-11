package p000;

import android.util.Base64;
import com.bumptech.glide.EnumC0562g;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.EnumC0567a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p000.InterfaceC2853ka;
import p000.InterfaceC3031od;

/* renamed from: fd */
/* loaded from: classes.dex */
public final class C2469fd<Model, Data> implements InterfaceC3031od<Model, Data> {

    /* renamed from: a */
    private final a<Data> f10118a;

    /* renamed from: fd$a */
    /* loaded from: classes.dex */
    public interface a<Data> {
        /* renamed from: a */
        Class<Data> mo11758a();

        /* renamed from: a */
        Data mo11759a(String str);

        /* renamed from: a */
        void mo11760a(Data data);
    }

    /* renamed from: fd$b */
    /* loaded from: classes.dex */
    private static final class b<Data> implements InterfaceC2853ka<Data> {

        /* renamed from: b */
        private final String f10119b;

        /* renamed from: c */
        private final a<Data> f10120c;

        /* renamed from: d */
        private Data f10121d;

        b(String str, a<Data> aVar) {
            this.f10119b = str;
            this.f10120c = aVar;
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: a */
        public Class<Data> mo3663a() {
            return this.f10120c.mo11758a();
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, Data] */
        @Override // p000.InterfaceC2853ka
        /* renamed from: a */
        public void mo3664a(EnumC0562g enumC0562g, InterfaceC2853ka.a<? super Data> aVar) {
            try {
                Data mo11759a = this.f10120c.mo11759a(this.f10119b);
                this.f10121d = mo11759a;
                aVar.mo3639a((InterfaceC2853ka.a<? super Data>) mo11759a);
            } catch (IllegalArgumentException e) {
                aVar.mo3638a((Exception) e);
            }
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: b */
        public void mo3665b() {
            try {
                this.f10120c.mo11760a((a<Data>) this.f10121d);
            } catch (IOException unused) {
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

    /* renamed from: fd$c */
    /* loaded from: classes.dex */
    public static final class c<Model> implements InterfaceC3081pd<Model, InputStream> {

        /* renamed from: a */
        private final a<InputStream> f10122a = new a(this);

        /* renamed from: fd$c$a */
        /* loaded from: classes.dex */
        class a implements a<InputStream> {
            a(c cVar) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.C2469fd.a
            /* renamed from: a */
            public InputStream mo11759a(String str) {
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

            @Override // p000.C2469fd.a
            /* renamed from: a */
            public Class<InputStream> mo11758a() {
                return InputStream.class;
            }

            @Override // p000.C2469fd.a
            /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo11760a(InputStream inputStream) {
                inputStream.close();
            }
        }

        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<Model, InputStream> mo139a(C3206sd c3206sd) {
            return new C2469fd(this.f10122a);
        }
    }

    public C2469fd(a<Data> aVar) {
        this.f10118a = aVar;
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a */
    public InterfaceC3031od.a<Data> mo137a(Model model, int i, int i2, C0575i c0575i) {
        return new InterfaceC3031od.a<>(new C3529zh(model), new b(model.toString(), this.f10118a));
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a */
    public boolean mo138a(Model model) {
        return model.toString().startsWith("data:image");
    }
}
