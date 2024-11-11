package defpackage;

import defpackage.q90;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.BufferedSink;

/* loaded from: classes.dex */
final class w90 implements Closeable {
    private static final Logger h = Logger.getLogger(r90.class.getName());
    private final BufferedSink b;
    private final boolean c;
    private final Buffer d;
    private int e;
    private boolean f;
    final q90.b g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w90(BufferedSink bufferedSink, boolean z) {
        this.b = bufferedSink;
        this.c = z;
        Buffer buffer = new Buffer();
        this.d = buffer;
        this.g = new q90.b(buffer);
        this.e = 16384;
    }

    private static void a(BufferedSink bufferedSink, int i) {
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }

    private void b(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min(this.e, j);
            long j2 = min;
            j -= j2;
            a(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.b.write(this.d, j2);
        }
    }

    public synchronized void a() {
        if (this.f) {
            throw new IOException("closed");
        }
        if (this.c) {
            if (h.isLoggable(Level.FINE)) {
                h.fine(o80.a(">> CONNECTION %s", r90.a.hex()));
            }
            this.b.write(r90.a.toByteArray());
            this.b.flush();
        }
    }

    void a(int i, byte b, Buffer buffer, int i2) {
        a(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.b.write(buffer, i2);
        }
    }

    public void a(int i, int i2, byte b, byte b2) {
        if (h.isLoggable(Level.FINE)) {
            h.fine(r90.a(false, i, i2, b, b2));
        }
        int i3 = this.e;
        if (i2 > i3) {
            r90.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            r90.a("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
        a(this.b, i2);
        this.b.writeByte(b & 255);
        this.b.writeByte(b2 & 255);
        this.b.writeInt(i & Integer.MAX_VALUE);
    }

    public synchronized void a(int i, int i2, List<p90> list) {
        if (this.f) {
            throw new IOException("closed");
        }
        this.g.a(list);
        long size = this.d.size();
        int min = (int) Math.min(this.e - 4, size);
        long j = min;
        a(i, min + 4, (byte) 5, size == j ? (byte) 4 : (byte) 0);
        this.b.writeInt(i2 & Integer.MAX_VALUE);
        this.b.write(this.d, j);
        if (size > j) {
            b(i, size - j);
        }
    }

    public synchronized void a(int i, long j) {
        if (this.f) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            r90.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
        a(i, 4, (byte) 8, (byte) 0);
        this.b.writeInt((int) j);
        this.b.flush();
    }

    public synchronized void a(int i, o90 o90Var) {
        if (this.f) {
            throw new IOException("closed");
        }
        if (o90Var.httpCode == -1) {
            throw new IllegalArgumentException();
        }
        a(i, 4, (byte) 3, (byte) 0);
        this.b.writeInt(o90Var.httpCode);
        this.b.flush();
    }

    public synchronized void a(int i, o90 o90Var, byte[] bArr) {
        if (this.f) {
            throw new IOException("closed");
        }
        if (o90Var.httpCode == -1) {
            r90.a("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
        a(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.b.writeInt(i);
        this.b.writeInt(o90Var.httpCode);
        if (bArr.length > 0) {
            this.b.write(bArr);
        }
        this.b.flush();
    }

    public synchronized void a(z90 z90Var) {
        if (this.f) {
            throw new IOException("closed");
        }
        this.e = z90Var.c(this.e);
        if (z90Var.b() != -1) {
            this.g.a(z90Var.b());
        }
        a(0, 0, (byte) 4, (byte) 1);
        this.b.flush();
    }

    public synchronized void a(boolean z, int i, int i2) {
        if (this.f) {
            throw new IOException("closed");
        }
        a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.b.writeInt(i);
        this.b.writeInt(i2);
        this.b.flush();
    }

    public synchronized void a(boolean z, int i, int i2, List<p90> list) {
        if (this.f) {
            throw new IOException("closed");
        }
        a(z, i, list);
    }

    void a(boolean z, int i, List<p90> list) {
        if (this.f) {
            throw new IOException("closed");
        }
        this.g.a(list);
        long size = this.d.size();
        int min = (int) Math.min(this.e, size);
        long j = min;
        byte b = size == j ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        a(i, min, (byte) 1, b);
        this.b.write(this.d, j);
        if (size > j) {
            b(i, size - j);
        }
    }

    public synchronized void a(boolean z, int i, Buffer buffer, int i2) {
        if (this.f) {
            throw new IOException("closed");
        }
        a(i, z ? (byte) 1 : (byte) 0, buffer, i2);
    }

    public synchronized void b(z90 z90Var) {
        if (this.f) {
            throw new IOException("closed");
        }
        int i = 0;
        a(0, z90Var.d() * 6, (byte) 4, (byte) 0);
        while (i < 10) {
            if (z90Var.d(i)) {
                this.b.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                this.b.writeInt(z90Var.a(i));
            }
            i++;
        }
        this.b.flush();
    }

    public int c() {
        return this.e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f = true;
        this.b.close();
    }

    public synchronized void flush() {
        if (this.f) {
            throw new IOException("closed");
        }
        this.b.flush();
    }
}
