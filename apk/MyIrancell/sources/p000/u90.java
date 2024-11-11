package p000;

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
import p000.q90;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u90 implements Closeable {

    /* renamed from: f */
    static final Logger f13443f = Logger.getLogger(r90.class.getName());

    /* renamed from: b */
    private final BufferedSource f13444b;

    /* renamed from: c */
    private final C3296a f13445c;

    /* renamed from: d */
    private final boolean f13446d;

    /* renamed from: e */
    final q90.C3117a f13447e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u90$a */
    /* loaded from: classes.dex */
    public static final class C3296a implements Source {

        /* renamed from: b */
        private final BufferedSource f13448b;

        /* renamed from: c */
        int f13449c;

        /* renamed from: d */
        byte f13450d;

        /* renamed from: e */
        int f13451e;

        /* renamed from: f */
        int f13452f;

        /* renamed from: g */
        short f13453g;

        C3296a(BufferedSource bufferedSource) {
            this.f13448b = bufferedSource;
        }

        /* renamed from: a */
        private void m15782a() {
            int i = this.f13451e;
            int m15768a = u90.m15768a(this.f13448b);
            this.f13452f = m15768a;
            this.f13449c = m15768a;
            byte readByte = (byte) (this.f13448b.readByte() & 255);
            this.f13450d = (byte) (this.f13448b.readByte() & 255);
            if (u90.f13443f.isLoggable(Level.FINE)) {
                u90.f13443f.fine(r90.m15256a(true, this.f13451e, this.f13449c, readByte, this.f13450d));
            }
            int readInt = this.f13448b.readInt() & Integer.MAX_VALUE;
            this.f13451e = readInt;
            if (readByte != 9) {
                r90.m15257b("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                throw null;
            }
            if (readInt == i) {
                return;
            }
            r90.m15257b("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) {
            while (true) {
                int i = this.f13452f;
                if (i != 0) {
                    long read = this.f13448b.read(buffer, Math.min(j, i));
                    if (read == -1) {
                        return -1L;
                    }
                    this.f13452f = (int) (this.f13452f - read);
                    return read;
                }
                this.f13448b.skip(this.f13453g);
                this.f13453g = (short) 0;
                if ((this.f13450d & 4) != 0) {
                    return -1L;
                }
                m15782a();
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.f13448b.timeout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u90$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3297b {
        /* renamed from: a */
        void mo15616a();

        /* renamed from: a */
        void mo15617a(int i, int i2, int i3, boolean z);

        /* renamed from: a */
        void mo15618a(int i, int i2, List<p90> list);

        /* renamed from: a */
        void mo15619a(int i, long j);

        /* renamed from: a */
        void mo15620a(int i, o90 o90Var);

        /* renamed from: a */
        void mo15621a(int i, o90 o90Var, ByteString byteString);

        /* renamed from: a */
        void mo15622a(boolean z, int i, int i2);

        /* renamed from: a */
        void mo15623a(boolean z, int i, int i2, List<p90> list);

        /* renamed from: a */
        void mo15624a(boolean z, int i, BufferedSource bufferedSource, int i2);

        /* renamed from: a */
        void mo15625a(boolean z, z90 z90Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u90(BufferedSource bufferedSource, boolean z) {
        this.f13444b = bufferedSource;
        this.f13446d = z;
        C3296a c3296a = new C3296a(bufferedSource);
        this.f13445c = c3296a;
        this.f13447e = new q90.C3117a(4096, c3296a);
    }

    /* renamed from: a */
    static int m15767a(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        r90.m15257b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    /* renamed from: a */
    static int m15768a(BufferedSource bufferedSource) {
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    /* renamed from: a */
    private List<p90> m15769a(int i, short s, byte b, int i2) {
        C3296a c3296a = this.f13445c;
        c3296a.f13452f = i;
        c3296a.f13449c = i;
        c3296a.f13453g = s;
        c3296a.f13450d = b;
        c3296a.f13451e = i2;
        this.f13447e.m15022c();
        return this.f13447e.m15020a();
    }

    /* renamed from: a */
    private void m15770a(InterfaceC3297b interfaceC3297b, int i) {
        int readInt = this.f13444b.readInt();
        interfaceC3297b.mo15617a(i, readInt & Integer.MAX_VALUE, (this.f13444b.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* renamed from: a */
    private void m15771a(InterfaceC3297b interfaceC3297b, int i, byte b, int i2) {
        if (i2 == 0) {
            r90.m15257b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
            throw null;
        }
        boolean z = (b & 1) != 0;
        if ((b & 32) != 0) {
            r90.m15257b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        short readByte = (b & 8) != 0 ? (short) (this.f13444b.readByte() & 255) : (short) 0;
        interfaceC3297b.mo15624a(z, i2, this.f13444b, m15767a(i, b, readByte));
        this.f13444b.skip(readByte);
    }

    /* renamed from: b */
    private void m15772b(InterfaceC3297b interfaceC3297b, int i, byte b, int i2) {
        if (i < 8) {
            r90.m15257b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            r90.m15257b("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        int readInt = this.f13444b.readInt();
        int readInt2 = this.f13444b.readInt();
        int i3 = i - 8;
        o90 fromHttp2 = o90.fromHttp2(readInt2);
        if (fromHttp2 == null) {
            r90.m15257b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        }
        ByteString byteString = ByteString.EMPTY;
        if (i3 > 0) {
            byteString = this.f13444b.readByteString(i3);
        }
        interfaceC3297b.mo15621a(readInt, fromHttp2, byteString);
    }

    /* renamed from: c */
    private void m15773c(InterfaceC3297b interfaceC3297b, int i, byte b, int i2) {
        if (i2 == 0) {
            r90.m15257b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z = (b & 1) != 0;
        short readByte = (b & 8) != 0 ? (short) (this.f13444b.readByte() & 255) : (short) 0;
        if ((b & 32) != 0) {
            m15770a(interfaceC3297b, i2);
            i -= 5;
        }
        interfaceC3297b.mo15623a(z, i2, -1, m15769a(m15767a(i, b, readByte), readByte, b, i2));
    }

    /* renamed from: d */
    private void m15774d(InterfaceC3297b interfaceC3297b, int i, byte b, int i2) {
        if (i != 8) {
            r90.m15257b("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            r90.m15257b("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        interfaceC3297b.mo15622a((b & 1) != 0, this.f13444b.readInt(), this.f13444b.readInt());
    }

    /* renamed from: e */
    private void m15775e(InterfaceC3297b interfaceC3297b, int i, byte b, int i2) {
        if (i != 5) {
            r90.m15257b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            m15770a(interfaceC3297b, i2);
        } else {
            r90.m15257b("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: f */
    private void m15776f(InterfaceC3297b interfaceC3297b, int i, byte b, int i2) {
        if (i2 == 0) {
            r90.m15257b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short readByte = (b & 8) != 0 ? (short) (this.f13444b.readByte() & 255) : (short) 0;
        interfaceC3297b.mo15618a(i2, this.f13444b.readInt() & Integer.MAX_VALUE, m15769a(m15767a(i - 4, b, readByte), readByte, b, i2));
    }

    /* renamed from: g */
    private void m15777g(InterfaceC3297b interfaceC3297b, int i, byte b, int i2) {
        if (i != 4) {
            r90.m15257b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        }
        if (i2 == 0) {
            r90.m15257b("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int readInt = this.f13444b.readInt();
        o90 fromHttp2 = o90.fromHttp2(readInt);
        if (fromHttp2 != null) {
            interfaceC3297b.mo15620a(i2, fromHttp2);
        } else {
            r90.m15257b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            throw null;
        }
    }

    /* renamed from: h */
    private void m15778h(InterfaceC3297b interfaceC3297b, int i, byte b, int i2) {
        if (i2 != 0) {
            r90.m15257b("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((b & 1) != 0) {
            if (i == 0) {
                interfaceC3297b.mo15616a();
                return;
            } else {
                r90.m15257b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        }
        if (i % 6 != 0) {
            r90.m15257b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
        z90 z90Var = new z90();
        for (int i3 = 0; i3 < i; i3 += 6) {
            int readShort = this.f13444b.readShort() & 65535;
            int readInt = this.f13444b.readInt();
            if (readShort != 2) {
                if (readShort == 3) {
                    readShort = 4;
                } else if (readShort == 4) {
                    readShort = 7;
                    if (readInt < 0) {
                        r90.m15257b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        throw null;
                    }
                } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                    r90.m15257b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                    throw null;
                }
            } else if (readInt != 0 && readInt != 1) {
                r90.m15257b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                throw null;
            }
            z90Var.m16901a(readShort, readInt);
        }
        interfaceC3297b.mo15625a(false, z90Var);
    }

    /* renamed from: i */
    private void m15779i(InterfaceC3297b interfaceC3297b, int i, byte b, int i2) {
        if (i != 4) {
            r90.m15257b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
            throw null;
        }
        long readInt = this.f13444b.readInt() & 2147483647L;
        if (readInt != 0) {
            interfaceC3297b.mo15619a(i2, readInt);
        } else {
            r90.m15257b("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
    }

    /* renamed from: a */
    public void m15780a(InterfaceC3297b interfaceC3297b) {
        if (this.f13446d) {
            if (m15781a(true, interfaceC3297b)) {
                return;
            }
            r90.m15257b("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        ByteString readByteString = this.f13444b.readByteString(r90.f12940a.size());
        if (f13443f.isLoggable(Level.FINE)) {
            f13443f.fine(o80.m14446a("<< CONNECTION %s", readByteString.hex()));
        }
        if (r90.f12940a.equals(readByteString)) {
            return;
        }
        r90.m15257b("Expected a connection header but was %s", readByteString.utf8());
        throw null;
    }

    /* renamed from: a */
    public boolean m15781a(boolean z, InterfaceC3297b interfaceC3297b) {
        try {
            this.f13444b.require(9L);
            int m15768a = m15768a(this.f13444b);
            if (m15768a < 0 || m15768a > 16384) {
                r90.m15257b("FRAME_SIZE_ERROR: %s", Integer.valueOf(m15768a));
                throw null;
            }
            byte readByte = (byte) (this.f13444b.readByte() & 255);
            if (z && readByte != 4) {
                r90.m15257b("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
                throw null;
            }
            byte readByte2 = (byte) (this.f13444b.readByte() & 255);
            int readInt = this.f13444b.readInt() & Integer.MAX_VALUE;
            if (f13443f.isLoggable(Level.FINE)) {
                f13443f.fine(r90.m15256a(true, readInt, m15768a, readByte, readByte2));
            }
            switch (readByte) {
                case 0:
                    m15771a(interfaceC3297b, m15768a, readByte2, readInt);
                    return true;
                case 1:
                    m15773c(interfaceC3297b, m15768a, readByte2, readInt);
                    return true;
                case 2:
                    m15775e(interfaceC3297b, m15768a, readByte2, readInt);
                    return true;
                case 3:
                    m15777g(interfaceC3297b, m15768a, readByte2, readInt);
                    return true;
                case 4:
                    m15778h(interfaceC3297b, m15768a, readByte2, readInt);
                    return true;
                case 5:
                    m15776f(interfaceC3297b, m15768a, readByte2, readInt);
                    return true;
                case 6:
                    m15774d(interfaceC3297b, m15768a, readByte2, readInt);
                    return true;
                case 7:
                    m15772b(interfaceC3297b, m15768a, readByte2, readInt);
                    return true;
                case 8:
                    m15779i(interfaceC3297b, m15768a, readByte2, readInt);
                    return true;
                default:
                    this.f13444b.skip(m15768a);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f13444b.close();
    }
}
