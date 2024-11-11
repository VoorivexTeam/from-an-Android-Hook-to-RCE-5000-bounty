package p000;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: aa */
/* loaded from: classes.dex */
public class C0013aa implements Closeable {

    /* renamed from: b */
    private final InputStream f77b;

    /* renamed from: c */
    private final Charset f78c;

    /* renamed from: d */
    private byte[] f79d;

    /* renamed from: e */
    private int f80e;

    /* renamed from: f */
    private int f81f;

    /* renamed from: aa$a */
    /* loaded from: classes.dex */
    class a extends ByteArrayOutputStream {
        a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, (i <= 0 || ((ByteArrayOutputStream) this).buf[i + (-1)] != 13) ? ((ByteArrayOutputStream) this).count : i - 1, C0013aa.this.f78c.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C0013aa(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(C0455ba.f2752a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f77b = inputStream;
        this.f78c = charset;
        this.f79d = new byte[i];
    }

    public C0013aa(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: d */
    private void m121d() {
        InputStream inputStream = this.f77b;
        byte[] bArr = this.f79d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f80e = 0;
        this.f81f = read;
    }

    /* renamed from: a */
    public boolean m122a() {
        return this.f81f == -1;
    }

    /* renamed from: c */
    public String m123c() {
        int i;
        int i2;
        synchronized (this.f77b) {
            if (this.f79d == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f80e >= this.f81f) {
                m121d();
            }
            for (int i3 = this.f80e; i3 != this.f81f; i3++) {
                if (this.f79d[i3] == 10) {
                    if (i3 != this.f80e) {
                        i2 = i3 - 1;
                        if (this.f79d[i2] == 13) {
                            String str = new String(this.f79d, this.f80e, i2 - this.f80e, this.f78c.name());
                            this.f80e = i3 + 1;
                            return str;
                        }
                    }
                    i2 = i3;
                    String str2 = new String(this.f79d, this.f80e, i2 - this.f80e, this.f78c.name());
                    this.f80e = i3 + 1;
                    return str2;
                }
            }
            a aVar = new a((this.f81f - this.f80e) + 80);
            loop1: while (true) {
                aVar.write(this.f79d, this.f80e, this.f81f - this.f80e);
                this.f81f = -1;
                m121d();
                i = this.f80e;
                while (i != this.f81f) {
                    if (this.f79d[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            if (i != this.f80e) {
                aVar.write(this.f79d, this.f80e, i - this.f80e);
            }
            this.f80e = i + 1;
            return aVar.toString();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f77b) {
            if (this.f79d != null) {
                this.f79d = null;
                this.f77b.close();
            }
        }
    }
}
