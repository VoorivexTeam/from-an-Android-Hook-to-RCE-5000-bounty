package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import okio.Buffer;
import okio.BufferedSource;

/* loaded from: classes.dex */
public abstract class j80 implements Closeable {

    @Nullable
    private Reader b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends j80 {
        final /* synthetic */ b80 c;
        final /* synthetic */ long d;
        final /* synthetic */ BufferedSource e;

        a(b80 b80Var, long j, BufferedSource bufferedSource) {
            this.c = b80Var;
            this.d = j;
            this.e = bufferedSource;
        }

        @Override // defpackage.j80
        public long c() {
            return this.d;
        }

        @Override // defpackage.j80
        @Nullable
        public b80 d() {
            return this.c;
        }

        @Override // defpackage.j80
        public BufferedSource e() {
            return this.e;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends Reader {
        private final BufferedSource b;
        private final Charset c;
        private boolean d;

        @Nullable
        private Reader e;

        b(BufferedSource bufferedSource, Charset charset) {
            this.b = bufferedSource;
            this.c = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.d = true;
            Reader reader = this.e;
            if (reader != null) {
                reader.close();
            } else {
                this.b.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            if (this.d) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.e;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.b.inputStream(), o80.a(this.b, this.c));
                this.e = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }
    }

    public static j80 a(@Nullable b80 b80Var, long j, BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            return new a(b80Var, j, bufferedSource);
        }
        throw new NullPointerException("source == null");
    }

    public static j80 a(@Nullable b80 b80Var, byte[] bArr) {
        return a(b80Var, bArr.length, new Buffer().write(bArr));
    }

    private Charset h() {
        b80 d = d();
        return d != null ? d.a(o80.i) : o80.i;
    }

    public final Reader a() {
        Reader reader = this.b;
        if (reader != null) {
            return reader;
        }
        b bVar = new b(e(), h());
        this.b = bVar;
        return bVar;
    }

    public abstract long c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        o80.a(e());
    }

    @Nullable
    public abstract b80 d();

    public abstract BufferedSource e();

    public final String f() {
        BufferedSource e = e();
        try {
            return e.readString(o80.a(e, h()));
        } finally {
            o80.a(e);
        }
    }
}
