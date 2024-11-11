package p000;

import com.bumptech.glide.EnumC0562g;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.EnumC0567a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.InterfaceC2853ka;
import p000.InterfaceC3031od;

/* renamed from: cd */
/* loaded from: classes.dex */
public class C0518cd<Data> implements InterfaceC3031od<byte[], Data> {

    /* renamed from: a */
    private final b<Data> f2998a;

    /* renamed from: cd$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC3081pd<byte[], ByteBuffer> {

        /* renamed from: cd$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C3553a implements b<ByteBuffer> {
            C3553a(a aVar) {
            }

            @Override // p000.C0518cd.b
            /* renamed from: a */
            public Class<ByteBuffer> mo3661a() {
                return ByteBuffer.class;
            }

            @Override // p000.C0518cd.b
            /* renamed from: a, reason: avoid collision after fix types in other method */
            public ByteBuffer mo3662a(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<byte[], ByteBuffer> mo139a(C3206sd c3206sd) {
            return new C0518cd(new C3553a(this));
        }
    }

    /* renamed from: cd$b */
    /* loaded from: classes.dex */
    public interface b<Data> {
        /* renamed from: a */
        Class<Data> mo3661a();

        /* renamed from: a */
        Data mo3662a(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cd$c */
    /* loaded from: classes.dex */
    public static class c<Data> implements InterfaceC2853ka<Data> {

        /* renamed from: b */
        private final byte[] f2999b;

        /* renamed from: c */
        private final b<Data> f3000c;

        c(byte[] bArr, b<Data> bVar) {
            this.f2999b = bArr;
            this.f3000c = bVar;
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: a */
        public Class<Data> mo3663a() {
            return this.f3000c.mo3661a();
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: a */
        public void mo3664a(EnumC0562g enumC0562g, InterfaceC2853ka.a<? super Data> aVar) {
            aVar.mo3639a((InterfaceC2853ka.a<? super Data>) this.f3000c.mo3662a(this.f2999b));
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: b */
        public void mo3665b() {
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

    /* renamed from: cd$d */
    /* loaded from: classes.dex */
    public static class d implements InterfaceC3081pd<byte[], InputStream> {

        /* renamed from: cd$d$a */
        /* loaded from: classes.dex */
        class a implements b<InputStream> {
            a(d dVar) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.C0518cd.b
            /* renamed from: a */
            public InputStream mo3662a(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }

            @Override // p000.C0518cd.b
            /* renamed from: a */
            public Class<InputStream> mo3661a() {
                return InputStream.class;
            }
        }

        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<byte[], InputStream> mo139a(C3206sd c3206sd) {
            return new C0518cd(new a(this));
        }
    }

    public C0518cd(b<Data> bVar) {
        this.f2998a = bVar;
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC3031od.a<Data> mo137a(byte[] bArr, int i, int i2, C0575i c0575i) {
        return new InterfaceC3031od.a<>(new C3529zh(bArr), new c(bArr, this.f2998a));
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo138a(byte[] bArr) {
        return true;
    }
}
