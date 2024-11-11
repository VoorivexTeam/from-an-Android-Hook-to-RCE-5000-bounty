package defpackage;

import defpackage.q90;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u90 implements Closeable {
    static final Logger f = Logger.getLogger(r90.class.getName());
    private final BufferedSource b;
    private final a c;
    private final boolean d;
    final q90.a e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements Source {
        private final BufferedSource b;
        int c;
        byte d;
        int e;
        int f;
        short g;

        a(BufferedSource bufferedSource) {
            this.b = bufferedSource;
        }

        private void a() {
            int i = this.e;
            int a = u90.a(this.b);
            this.f = a;
            this.c = a;
            byte readByte = (byte) (this.b.readByte() & 255);
            this.d = (byte) (this.b.readByte() & 255);
            if (u90.f.isLoggable(Level.FINE)) {
                u90.f.fine(r90.a(true, this.e, this.c, readByte, this.d));
            }
            int readInt = this.b.readInt() & Integer.MAX_VALUE;
            this.e = readInt;
            if (readByte != 9) {
                r90.b("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                throw null;
            }
            if (readInt == i) {
                return;
            }
            r90.b("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) {
            while (true) {
                int i = this.f;
                if (i != 0) {
                    long read = this.b.read(buffer, Math.min(j, i));
                    if (read == -1) {
                        return -1L;
                    }
                    this.f = (int) (this.f - read);
                    return read;
                }
                this.b.skip(this.g);
                this.g = (short) 0;
                if ((this.d & 4) != 0) {
                    return -1L;
                }
                a();
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.b.timeout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a();

        void a(int i, int i2, int i3, boolean z);

        void a(int i, int i2, List<p90> list);

        void a(int i, long j);

        void a(int i, o90 o90Var);

        void a(int i, o90 o90Var, ByteString byteString);

        void a(boolean z, int i, int i2);

        void a(boolean z, int i, int i2, List<p90> list);

        void a(boolean z, int i, BufferedSource bufferedSource, int i2);

        void a(boolean z, z90 z90Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u90(BufferedSource bufferedSource, boolean z) {
        this.b = bufferedSource;
        this.d = z;
        a aVar = new a(bufferedSource);
        this.c = aVar;
        this.e = new q90.a(4096, aVar);
    }

    static int a(int i, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        r90.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    static int a(BufferedSource bufferedSource) {
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    private List<p90> a(int i, short s, byte b2, int i2) {
        a aVar = this.c;
        aVar.f = i;
        aVar.c = i;
        aVar.g = s;
        aVar.d = b2;
        aVar.e = i2;
        this.e.c();
        return this.e.a();
    }

    private void a(b bVar, int i) {
        int readInt = this.b.readInt();
        bVar.a(i, readInt & Integer.MAX_VALUE, (this.b.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    private void a(b bVar, int i, byte b2, int i2) {
        if (i2 == 0) {
            r90.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
            throw null;
        }
        boolean z = (b2 & 1) != 0;
        if ((b2 & 32) != 0) {
            r90.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        short readByte = (b2 & 8) != 0 ? (short) (this.b.readByte() & 255) : (short) 0;
        bVar.a(z, i2, this.b, a(i, b2, readByte));
        this.b.skip(readByte);
    }

    private void b(b bVar, int i, byte b2, int i2) {
        if (i < 8) {
            r90.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            r90.b("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        int readInt = this.b.readInt();
        int readInt2 = this.b.readInt();
        int i3 = i - 8;
        o90 fromHttp2 = o90.fromHttp2(readInt2);
        if (fromHttp2 == null) {
            r90.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        }
        ByteString byteString = ByteString.EMPTY;
        if (i3 > 0) {
            byteString = this.b.readByteString(i3);
        }
        bVar.a(readInt, fromHttp2, byteString);
    }

    private void c(b bVar, int i, byte b2, int i2) {
        if (i2 == 0) {
            r90.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z = (b2 & 1) != 0;
        short readByte = (b2 & 8) != 0 ? (short) (this.b.readByte() & 255) : (short) 0;
        if ((b2 & 32) != 0) {
            a(bVar, i2);
            i -= 5;
        }
        bVar.a(z, i2, -1, a(a(i, b2, readByte), readByte, b2, i2));
    }

    private void d(b bVar, int i, byte b2, int i2) {
        if (i != 8) {
            r90.b("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            r90.b("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        bVar.a((b2 & 1) != 0, this.b.readInt(), this.b.readInt());
    }

    private void e(b bVar, int i, byte b2, int i2) {
        if (i != 5) {
            r90.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            a(bVar, i2);
        } else {
            r90.b("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
    }

    private void f(b bVar, int i, byte b2, int i2) {
        if (i2 == 0) {
            r90.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short readByte = (b2 & 8) != 0 ? (short) (this.b.readByte() & 255) : (short) 0;
        bVar.a(i2, this.b.readInt() & Integer.MAX_VALUE, a(a(i - 4, b2, readByte), readByte, b2, i2));
    }

    private void g(b bVar, int i, byte b2, int i2) {
        if (i != 4) {
            r90.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        }
        if (i2 == 0) {
            r90.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int readInt = this.b.readInt();
        o90 fromHttp2 = o90.fromHttp2(readInt);
        if (fromHttp2 != null) {
            bVar.a(i2, fromHttp2);
        } else {
            r90.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            throw null;
        }
    }

    private void h(b bVar, int i, byte b2, int i2) {
        if (i2 != 0) {
            r90.b("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((b2 & 1) != 0) {
            if (i == 0) {
                bVar.a();
                return;
            } else {
                r90.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        }
        if (i % 6 != 0) {
            r90.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
        z90 z90Var = new z90();
        for (int i3 = 0; i3 < i; i3 += 6) {
            int readShort = this.b.readShort() & 65535;
            int readInt = this.b.readInt();
            if (readShort != 2) {
                if (readShort == 3) {
                    readShort = 4;
                } else if (readShort == 4) {
                    readShort = 7;
                    if (readInt < 0) {
                        r90.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        throw null;
                    }
                } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                    r90.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                    throw null;
                }
            } else if (readInt != 0 && readInt != 1) {
                r90.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                throw null;
            }
            z90Var.a(readShort, readInt);
        }
        bVar.a(false, z90Var);
    }

    private void i(b bVar, int i, byte b2, int i2) {
        if (i != 4) {
            r90.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
            throw null;
        }
        long readInt = this.b.readInt() & 2147483647L;
        if (readInt != 0) {
            bVar.a(i2, readInt);
        } else {
            r90.b("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
    }

    public void a(b bVar) {
        if (this.d) {
            if (a(true, bVar)) {
                return;
            }
            r90.b("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        ByteString readByteString = this.b.readByteString(r90.a.size());
        if (f.isLoggable(Level.FINE)) {
            f.fine(o80.a("<< CONNECTION %s", readByteString.hex()));
        }
        if (r90.a.equals(readByteString)) {
            return;
        }
        r90.b("Expected a connection header but was %s", readByteString.utf8());
        throw null;
    }

    public boolean a(boolean z, b bVar) {
        try {
            this.b.require(9L);
            int a2 = a(this.b);
            if (a2 < 0 || a2 > 16384) {
                r90.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a2));
                throw null;
            }
            byte readByte = (byte) (this.b.readByte() & 255);
            if (z && readByte != 4) {
                r90.b("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
                throw null;
            }
            byte readByte2 = (byte) (this.b.readByte() & 255);
            int readInt = this.b.readInt() & Integer.MAX_VALUE;
            if (f.isLoggable(Level.FINE)) {
                f.fine(r90.a(true, readInt, a2, readByte, readByte2));
            }
            switch (readByte) {
                case 0:
                    a(bVar, a2, readByte2, readInt);
                    return true;
                case 1:
                    c(bVar, a2, readByte2, readInt);
                    return true;
                case 2:
                    e(bVar, a2, readByte2, readInt);
                    return true;
                case 3:
                    g(bVar, a2, readByte2, readInt);
                    return true;
                case 4:
                    h(bVar, a2, readByte2, readInt);
                    return true;
                case 5:
                    f(bVar, a2, readByte2, readInt);
                    return true;
                case 6:
                    d(bVar, a2, readByte2, readInt);
                    return true;
                case 7:
                    b(bVar, a2, readByte2, readInt);
                    return true;
                case 8:
                    i(bVar, a2, readByte2, readInt);
                    return true;
                default:
                    this.b.skip(a2);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }
}
