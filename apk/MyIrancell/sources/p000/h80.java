package p000;

import java.nio.charset.Charset;
import javax.annotation.Nullable;
import okio.BufferedSink;
import okio.ByteString;

/* loaded from: classes.dex */
public abstract class h80 {

    /* renamed from: h80$a */
    /* loaded from: classes.dex */
    class C2543a extends h80 {

        /* renamed from: a */
        final /* synthetic */ b80 f10406a;

        /* renamed from: b */
        final /* synthetic */ ByteString f10407b;

        C2543a(b80 b80Var, ByteString byteString) {
            this.f10406a = b80Var;
            this.f10407b = byteString;
        }

        @Override // p000.h80
        /* renamed from: a */
        public long mo3610a() {
            return this.f10407b.size();
        }

        @Override // p000.h80
        /* renamed from: a */
        public void mo3611a(BufferedSink bufferedSink) {
            bufferedSink.write(this.f10407b);
        }

        @Override // p000.h80
        @Nullable
        /* renamed from: b */
        public b80 mo3612b() {
            return this.f10406a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h80$b */
    /* loaded from: classes.dex */
    public class C2544b extends h80 {

        /* renamed from: a */
        final /* synthetic */ b80 f10408a;

        /* renamed from: b */
        final /* synthetic */ int f10409b;

        /* renamed from: c */
        final /* synthetic */ byte[] f10410c;

        /* renamed from: d */
        final /* synthetic */ int f10411d;

        C2544b(b80 b80Var, int i, byte[] bArr, int i2) {
            this.f10408a = b80Var;
            this.f10409b = i;
            this.f10410c = bArr;
            this.f10411d = i2;
        }

        @Override // p000.h80
        /* renamed from: a */
        public long mo3610a() {
            return this.f10409b;
        }

        @Override // p000.h80
        /* renamed from: a */
        public void mo3611a(BufferedSink bufferedSink) {
            bufferedSink.write(this.f10410c, this.f10411d, this.f10409b);
        }

        @Override // p000.h80
        @Nullable
        /* renamed from: b */
        public b80 mo3612b() {
            return this.f10408a;
        }
    }

    /* renamed from: a */
    public static h80 m12145a(@Nullable b80 b80Var, String str) {
        Charset charset = o80.f12435i;
        if (b80Var != null && (charset = b80Var.m3342a()) == null) {
            charset = o80.f12435i;
            b80Var = b80.m3341b(b80Var + "; charset=utf-8");
        }
        return m12147a(b80Var, str.getBytes(charset));
    }

    /* renamed from: a */
    public static h80 m12146a(@Nullable b80 b80Var, ByteString byteString) {
        return new C2543a(b80Var, byteString);
    }

    /* renamed from: a */
    public static h80 m12147a(@Nullable b80 b80Var, byte[] bArr) {
        return m12148a(b80Var, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static h80 m12148a(@Nullable b80 b80Var, byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        o80.m14456a(bArr.length, i, i2);
        return new C2544b(b80Var, i2, bArr, i);
    }

    /* renamed from: a */
    public long mo3610a() {
        return -1L;
    }

    /* renamed from: a */
    public abstract void mo3611a(BufferedSink bufferedSink);

    @Nullable
    /* renamed from: b */
    public abstract b80 mo3612b();
}
