package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.BufferedSink;
import p000.q90;

/* loaded from: classes.dex */
final class w90 implements Closeable {

    /* renamed from: h */
    private static final Logger f13800h = Logger.getLogger(r90.class.getName());

    /* renamed from: b */
    private final BufferedSink f13801b;

    /* renamed from: c */
    private final boolean f13802c;

    /* renamed from: d */
    private final Buffer f13803d;

    /* renamed from: e */
    private int f13804e;

    /* renamed from: f */
    private boolean f13805f;

    /* renamed from: g */
    final q90.C3118b f13806g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w90(BufferedSink bufferedSink, boolean z) {
        this.f13801b = bufferedSink;
        this.f13802c = z;
        Buffer buffer = new Buffer();
        this.f13803d = buffer;
        this.f13806g = new q90.C3118b(buffer);
        this.f13804e = 16384;
    }

    /* renamed from: a */
    private static void m16175a(BufferedSink bufferedSink, int i) {
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }

    /* renamed from: b */
    private void m16176b(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min(this.f13804e, j);
            long j2 = min;
            j -= j2;
            m16179a(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f13801b.write(this.f13803d, j2);
        }
    }

    /* renamed from: a */
    public synchronized void m16177a() {
        if (this.f13805f) {
            throw new IOException("closed");
        }
        if (this.f13802c) {
            if (f13800h.isLoggable(Level.FINE)) {
                f13800h.fine(o80.m14446a(">> CONNECTION %s", r90.f12940a.hex()));
            }
            this.f13801b.write(r90.f12940a.toByteArray());
            this.f13801b.flush();
        }
    }

    /* renamed from: a */
    void m16178a(int i, byte b, Buffer buffer, int i2) {
        m16179a(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.f13801b.write(buffer, i2);
        }
    }

    /* renamed from: a */
    public void m16179a(int i, int i2, byte b, byte b2) {
        if (f13800h.isLoggable(Level.FINE)) {
            f13800h.fine(r90.m15256a(false, i, i2, b, b2));
        }
        int i3 = this.f13804e;
        if (i2 > i3) {
            r90.m15254a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            r90.m15254a("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
        m16175a(this.f13801b, i2);
        this.f13801b.writeByte(b & 255);
        this.f13801b.writeByte(b2 & 255);
        this.f13801b.writeInt(i & Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public synchronized void m16180a(int i, int i2, List<p90> list) {
        if (this.f13805f) {
            throw new IOException("closed");
        }
        this.f13806g.m15029a(list);
        long size = this.f13803d.size();
        int min = (int) Math.min(this.f13804e - 4, size);
        long j = min;
        m16179a(i, min + 4, (byte) 5, size == j ? (byte) 4 : (byte) 0);
        this.f13801b.writeInt(i2 & Integer.MAX_VALUE);
        this.f13801b.write(this.f13803d, j);
        if (size > j) {
            m16176b(i, size - j);
        }
    }

    /* renamed from: a */
    public synchronized void m16181a(int i, long j) {
        if (this.f13805f) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            r90.m15254a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
        m16179a(i, 4, (byte) 8, (byte) 0);
        this.f13801b.writeInt((int) j);
        this.f13801b.flush();
    }

    /* renamed from: a */
    public synchronized void m16182a(int i, o90 o90Var) {
        if (this.f13805f) {
            throw new IOException("closed");
        }
        if (o90Var.httpCode == -1) {
            throw new IllegalArgumentException();
        }
        m16179a(i, 4, (byte) 3, (byte) 0);
        this.f13801b.writeInt(o90Var.httpCode);
        this.f13801b.flush();
    }

    /* renamed from: a */
    public synchronized void m16183a(int i, o90 o90Var, byte[] bArr) {
        if (this.f13805f) {
            throw new IOException("closed");
        }
        if (o90Var.httpCode == -1) {
            r90.m15254a("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
        m16179a(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f13801b.writeInt(i);
        this.f13801b.writeInt(o90Var.httpCode);
        if (bArr.length > 0) {
            this.f13801b.write(bArr);
        }
        this.f13801b.flush();
    }

    /* renamed from: a */
    public synchronized void m16184a(z90 z90Var) {
        if (this.f13805f) {
            throw new IOException("closed");
        }
        this.f13804e = z90Var.m16907c(this.f13804e);
        if (z90Var.m16904b() != -1) {
            this.f13806g.m15027a(z90Var.m16904b());
        }
        m16179a(0, 0, (byte) 4, (byte) 1);
        this.f13801b.flush();
    }

    /* renamed from: a */
    public synchronized void m16185a(boolean z, int i, int i2) {
        if (this.f13805f) {
            throw new IOException("closed");
        }
        m16179a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.f13801b.writeInt(i);
        this.f13801b.writeInt(i2);
        this.f13801b.flush();
    }

    /* renamed from: a */
    public synchronized void m16186a(boolean z, int i, int i2, List<p90> list) {
        if (this.f13805f) {
            throw new IOException("closed");
        }
        m16187a(z, i, list);
    }

    /* renamed from: a */
    void m16187a(boolean z, int i, List<p90> list) {
        if (this.f13805f) {
            throw new IOException("closed");
        }
        this.f13806g.m15029a(list);
        long size = this.f13803d.size();
        int min = (int) Math.min(this.f13804e, size);
        long j = min;
        byte b = size == j ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        m16179a(i, min, (byte) 1, b);
        this.f13801b.write(this.f13803d, j);
        if (size > j) {
            m16176b(i, size - j);
        }
    }

    /* renamed from: a */
    public synchronized void m16188a(boolean z, int i, Buffer buffer, int i2) {
        if (this.f13805f) {
            throw new IOException("closed");
        }
        m16178a(i, z ? (byte) 1 : (byte) 0, buffer, i2);
    }

    /* renamed from: b */
    public synchronized void m16189b(z90 z90Var) {
        if (this.f13805f) {
            throw new IOException("closed");
        }
        int i = 0;
        m16179a(0, z90Var.m16908d() * 6, (byte) 4, (byte) 0);
        while (i < 10) {
            if (z90Var.m16909d(i)) {
                this.f13801b.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                this.f13801b.writeInt(z90Var.m16900a(i));
            }
            i++;
        }
        this.f13801b.flush();
    }

    /* renamed from: c */
    public int m16190c() {
        return this.f13804e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f13805f = true;
        this.f13801b.close();
    }

    public synchronized void flush() {
        if (this.f13805f) {
            throw new IOException("closed");
        }
        this.f13801b.flush();
    }
}
