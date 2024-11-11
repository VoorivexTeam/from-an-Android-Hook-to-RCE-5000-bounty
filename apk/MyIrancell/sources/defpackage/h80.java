package defpackage;

import java.nio.charset.Charset;
import javax.annotation.Nullable;
import okio.BufferedSink;
import okio.ByteString;

/* loaded from: classes.dex */
public abstract class h80 {

    /* loaded from: classes.dex */
    class a extends h80 {
        final /* synthetic */ b80 a;
        final /* synthetic */ ByteString b;

        a(b80 b80Var, ByteString byteString) {
            this.a = b80Var;
            this.b = byteString;
        }

        @Override // defpackage.h80
        public long a() {
            return this.b.size();
        }

        @Override // defpackage.h80
        public void a(BufferedSink bufferedSink) {
            bufferedSink.write(this.b);
        }

        @Override // defpackage.h80
        @Nullable
        public b80 b() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends h80 {
        final /* synthetic */ b80 a;
        final /* synthetic */ int b;
        final /* synthetic */ byte[] c;
        final /* synthetic */ int d;

        b(b80 b80Var, int i, byte[] bArr, int i2) {
            this.a = b80Var;
            this.b = i;
            this.c = bArr;
            this.d = i2;
        }

        @Override // defpackage.h80
        public long a() {
            return this.b;
        }

        @Override // defpackage.h80
        public void a(BufferedSink bufferedSink) {
            bufferedSink.write(this.c, this.d, this.b);
        }

        @Override // defpackage.h80
        @Nullable
        public b80 b() {
            return this.a;
        }
    }

    public static h80 a(@Nullable b80 b80Var, String str) {
        Charset charset = o80.i;
        if (b80Var != null && (charset = b80Var.a()) == null) {
            charset = o80.i;
            b80Var = b80.b(b80Var + "; charset=utf-8");
        }
        return a(b80Var, str.getBytes(charset));
    }

    public static h80 a(@Nullable b80 b80Var, ByteString byteString) {
        return new a(b80Var, byteString);
    }

    public static h80 a(@Nullable b80 b80Var, byte[] bArr) {
        return a(b80Var, bArr, 0, bArr.length);
    }

    public static h80 a(@Nullable b80 b80Var, byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        o80.a(bArr.length, i, i2);
        return new b(b80Var, i2, bArr, i);
    }

    public long a() {
        return -1L;
    }

    public abstract void a(BufferedSink bufferedSink);

    @Nullable
    public abstract b80 b();
}
