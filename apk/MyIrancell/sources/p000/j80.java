package p000;

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

    /* renamed from: b */
    @Nullable
    private Reader f11486b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j80$a */
    /* loaded from: classes.dex */
    public class C2805a extends j80 {

        /* renamed from: c */
        final /* synthetic */ b80 f11487c;

        /* renamed from: d */
        final /* synthetic */ long f11488d;

        /* renamed from: e */
        final /* synthetic */ BufferedSource f11489e;

        C2805a(b80 b80Var, long j, BufferedSource bufferedSource) {
            this.f11487c = b80Var;
            this.f11488d = j;
            this.f11489e = bufferedSource;
        }

        @Override // p000.j80
        /* renamed from: c */
        public long mo12416c() {
            return this.f11488d;
        }

        @Override // p000.j80
        @Nullable
        /* renamed from: d */
        public b80 mo12417d() {
            return this.f11487c;
        }

        @Override // p000.j80
        /* renamed from: e */
        public BufferedSource mo12418e() {
            return this.f11489e;
        }
    }

    /* renamed from: j80$b */
    /* loaded from: classes.dex */
    static final class C2806b extends Reader {

        /* renamed from: b */
        private final BufferedSource f11490b;

        /* renamed from: c */
        private final Charset f11491c;

        /* renamed from: d */
        private boolean f11492d;

        /* renamed from: e */
        @Nullable
        private Reader f11493e;

        C2806b(BufferedSource bufferedSource, Charset charset) {
            this.f11490b = bufferedSource;
            this.f11491c = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f11492d = true;
            Reader reader = this.f11493e;
            if (reader != null) {
                reader.close();
            } else {
                this.f11490b.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            if (this.f11492d) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.f11493e;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.f11490b.inputStream(), o80.m14450a(this.f11490b, this.f11491c));
                this.f11493e = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }
    }

    /* renamed from: a */
    public static j80 m13424a(@Nullable b80 b80Var, long j, BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            return new C2805a(b80Var, j, bufferedSource);
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: a */
    public static j80 m13425a(@Nullable b80 b80Var, byte[] bArr) {
        return m13424a(b80Var, bArr.length, new Buffer().write(bArr));
    }

    /* renamed from: h */
    private Charset m13426h() {
        b80 mo12417d = mo12417d();
        return mo12417d != null ? mo12417d.m3343a(o80.f12435i) : o80.f12435i;
    }

    /* renamed from: a */
    public final Reader m13427a() {
        Reader reader = this.f11486b;
        if (reader != null) {
            return reader;
        }
        C2806b c2806b = new C2806b(mo12418e(), m13426h());
        this.f11486b = c2806b;
        return c2806b;
    }

    /* renamed from: c */
    public abstract long mo12416c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        o80.m14457a(mo12418e());
    }

    @Nullable
    /* renamed from: d */
    public abstract b80 mo12417d();

    /* renamed from: e */
    public abstract BufferedSource mo12418e();

    /* renamed from: f */
    public final String m13428f() {
        BufferedSource mo12418e = mo12418e();
        try {
            return mo12418e.readString(o80.m14450a(mo12418e, m13426h()));
        } finally {
            o80.m14457a(mo12418e);
        }
    }
}
