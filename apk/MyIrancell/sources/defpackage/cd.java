package defpackage;

import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.ka;
import defpackage.od;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class cd<Data> implements od<byte[], Data> {
    private final b<Data> a;

    /* loaded from: classes.dex */
    public static class a implements pd<byte[], ByteBuffer> {

        /* renamed from: cd$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0025a implements b<ByteBuffer> {
            C0025a(a aVar) {
            }

            @Override // cd.b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // cd.b
            public ByteBuffer a(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // defpackage.pd
        public od<byte[], ByteBuffer> a(sd sdVar) {
            return new cd(new C0025a(this));
        }
    }

    /* loaded from: classes.dex */
    public interface b<Data> {
        Class<Data> a();

        Data a(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c<Data> implements ka<Data> {
        private final byte[] b;
        private final b<Data> c;

        c(byte[] bArr, b<Data> bVar) {
            this.b = bArr;
            this.c = bVar;
        }

        @Override // defpackage.ka
        public Class<Data> a() {
            return this.c.a();
        }

        @Override // defpackage.ka
        public void a(g gVar, ka.a<? super Data> aVar) {
            aVar.a((ka.a<? super Data>) this.c.a(this.b));
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

    /* loaded from: classes.dex */
    public static class d implements pd<byte[], InputStream> {

        /* loaded from: classes.dex */
        class a implements b<InputStream> {
            a(d dVar) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cd.b
            public InputStream a(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }

            @Override // cd.b
            public Class<InputStream> a() {
                return InputStream.class;
            }
        }

        @Override // defpackage.pd
        public od<byte[], InputStream> a(sd sdVar) {
            return new cd(new a(this));
        }
    }

    public cd(b<Data> bVar) {
        this.a = bVar;
    }

    @Override // defpackage.od
    public od.a<Data> a(byte[] bArr, int i, int i2, i iVar) {
        return new od.a<>(new zh(bArr), new c(bArr, this.a));
    }

    @Override // defpackage.od
    public boolean a(byte[] bArr) {
        return true;
    }
}
