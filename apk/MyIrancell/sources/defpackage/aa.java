package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class aa implements Closeable {
    private final InputStream b;
    private final Charset c;
    private byte[] d;
    private int e;
    private int f;

    /* loaded from: classes.dex */
    class a extends ByteArrayOutputStream {
        a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, (i <= 0 || ((ByteArrayOutputStream) this).buf[i + (-1)] != 13) ? ((ByteArrayOutputStream) this).count : i - 1, aa.this.c.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public aa(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(ba.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.b = inputStream;
        this.c = charset;
        this.d = new byte[i];
    }

    public aa(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void d() {
        InputStream inputStream = this.b;
        byte[] bArr = this.d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.e = 0;
        this.f = read;
    }

    public boolean a() {
        return this.f == -1;
    }

    public String c() {
        int i;
        int i2;
        synchronized (this.b) {
            if (this.d == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.e >= this.f) {
                d();
            }
            for (int i3 = this.e; i3 != this.f; i3++) {
                if (this.d[i3] == 10) {
                    if (i3 != this.e) {
                        i2 = i3 - 1;
                        if (this.d[i2] == 13) {
                            String str = new String(this.d, this.e, i2 - this.e, this.c.name());
                            this.e = i3 + 1;
                            return str;
                        }
                    }
                    i2 = i3;
                    String str2 = new String(this.d, this.e, i2 - this.e, this.c.name());
                    this.e = i3 + 1;
                    return str2;
                }
            }
            a aVar = new a((this.f - this.e) + 80);
            loop1: while (true) {
                aVar.write(this.d, this.e, this.f - this.e);
                this.f = -1;
                d();
                i = this.e;
                while (i != this.f) {
                    if (this.d[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            if (i != this.e) {
                aVar.write(this.d, this.e, i - this.e);
            }
            this.e = i + 1;
            return aVar.toString();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.b) {
            if (this.d != null) {
                this.d = null;
                this.b.close();
            }
        }
    }
}
