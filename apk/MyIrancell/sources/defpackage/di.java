package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: classes.dex */
public class di extends InputStream {
    private static final Queue<di> d = ki.a(0);
    private InputStream b;
    private IOException c;

    di() {
    }

    public static di b(InputStream inputStream) {
        di poll;
        synchronized (d) {
            poll = d.poll();
        }
        if (poll == null) {
            poll = new di();
        }
        poll.a(inputStream);
        return poll;
    }

    public IOException a() {
        return this.c;
    }

    void a(InputStream inputStream) {
        this.b = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.b.available();
    }

    public void c() {
        this.c = null;
        this.b = null;
        synchronized (d) {
            d.offer(this);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.b.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.b.read();
        } catch (IOException e) {
            this.c = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.b.read(bArr);
        } catch (IOException e) {
            this.c = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.b.read(bArr, i, i2);
        } catch (IOException e) {
            this.c = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.b.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.b.skip(j);
        } catch (IOException e) {
            this.c = e;
            return 0L;
        }
    }
}
