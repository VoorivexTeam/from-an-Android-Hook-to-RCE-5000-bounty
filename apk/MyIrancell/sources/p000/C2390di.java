package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: di */
/* loaded from: classes.dex */
public class C2390di extends InputStream {

    /* renamed from: d */
    private static final Queue<C2390di> f9837d = C2861ki.m13727a(0);

    /* renamed from: b */
    private InputStream f9838b;

    /* renamed from: c */
    private IOException f9839c;

    C2390di() {
    }

    /* renamed from: b */
    public static C2390di m11424b(InputStream inputStream) {
        C2390di poll;
        synchronized (f9837d) {
            poll = f9837d.poll();
        }
        if (poll == null) {
            poll = new C2390di();
        }
        poll.m11426a(inputStream);
        return poll;
    }

    /* renamed from: a */
    public IOException m11425a() {
        return this.f9839c;
    }

    /* renamed from: a */
    void m11426a(InputStream inputStream) {
        this.f9838b = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f9838b.available();
    }

    /* renamed from: c */
    public void m11427c() {
        this.f9839c = null;
        this.f9838b = null;
        synchronized (f9837d) {
            f9837d.offer(this);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9838b.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f9838b.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f9838b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f9838b.read();
        } catch (IOException e) {
            this.f9839c = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f9838b.read(bArr);
        } catch (IOException e) {
            this.f9839c = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f9838b.read(bArr, i, i2);
        } catch (IOException e) {
            this.f9839c = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f9838b.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.f9838b.skip(j);
        } catch (IOException e) {
            this.f9839c = e;
            return 0L;
        }
    }
}
