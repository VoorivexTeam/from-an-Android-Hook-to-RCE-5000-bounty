package defpackage;

import defpackage.i80;
import defpackage.y70;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Okio;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* loaded from: classes.dex */
public final class m90 implements d90 {
    final d80 a;
    final a90 b;
    final BufferedSource c;
    final BufferedSink d;
    int e = 0;
    private long f = 262144;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class b implements Source {
        protected final ForwardingTimeout b;
        protected boolean c;
        protected long d;

        private b() {
            this.b = new ForwardingTimeout(m90.this.c.timeout());
            this.d = 0L;
        }

        protected final void a(boolean z, IOException iOException) {
            m90 m90Var = m90.this;
            int i = m90Var.e;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                throw new IllegalStateException("state: " + m90.this.e);
            }
            m90Var.a(this.b);
            m90 m90Var2 = m90.this;
            m90Var2.e = 6;
            a90 a90Var = m90Var2.b;
            if (a90Var != null) {
                a90Var.a(!z, m90Var2, this.d, iOException);
            }
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) {
            try {
                long read = m90.this.c.read(buffer, j);
                if (read > 0) {
                    this.d += read;
                }
                return read;
            } catch (IOException e) {
                a(false, e);
                throw e;
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements Sink {
        private final ForwardingTimeout b;
        private boolean c;

        c() {
            this.b = new ForwardingTimeout(m90.this.d.timeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.c) {
                return;
            }
            this.c = true;
            m90.this.d.writeUtf8("0\r\n\r\n");
            m90.this.a(this.b);
            m90.this.e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() {
            if (this.c) {
                return;
            }
            m90.this.d.flush();
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.b;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            m90.this.d.writeHexadecimalUnsignedLong(j);
            m90.this.d.writeUtf8("\r\n");
            m90.this.d.write(buffer, j);
            m90.this.d.writeUtf8("\r\n");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends b {
        private final z70 f;
        private long g;
        private boolean h;

        d(z70 z70Var) {
            super();
            this.g = -1L;
            this.h = true;
            this.f = z70Var;
        }

        private void a() {
            if (this.g != -1) {
                m90.this.c.readUtf8LineStrict();
            }
            try {
                this.g = m90.this.c.readHexadecimalUnsignedLong();
                String trim = m90.this.c.readUtf8LineStrict().trim();
                if (this.g < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.g + trim + "\"");
                }
                if (this.g == 0) {
                    this.h = false;
                    f90.a(m90.this.a.k(), this.f, m90.this.e());
                    a(true, null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.c) {
                return;
            }
            if (this.h && !o80.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.c = true;
        }

        @Override // m90.b, okio.Source
        public long read(Buffer buffer, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            if (!this.h) {
                return -1L;
            }
            long j2 = this.g;
            if (j2 == 0 || j2 == -1) {
                a();
                if (!this.h) {
                    return -1L;
                }
            }
            long read = super.read(buffer, Math.min(j, this.g));
            if (read != -1) {
                this.g -= read;
                return read;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(false, protocolException);
            throw protocolException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class e implements Sink {
        private final ForwardingTimeout b;
        private boolean c;
        private long d;

        e(long j) {
            this.b = new ForwardingTimeout(m90.this.d.timeout());
            this.d = j;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.c) {
                return;
            }
            this.c = true;
            if (this.d > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            m90.this.a(this.b);
            m90.this.e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            if (this.c) {
                return;
            }
            m90.this.d.flush();
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.b;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            o80.a(buffer.size(), 0L, j);
            if (j <= this.d) {
                m90.this.d.write(buffer, j);
                this.d -= j;
                return;
            }
            throw new ProtocolException("expected " + this.d + " bytes but received " + j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f extends b {
        private long f;

        f(m90 m90Var, long j) {
            super();
            this.f = j;
            if (j == 0) {
                a(true, null);
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.c) {
                return;
            }
            if (this.f != 0 && !o80.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.c = true;
        }

        @Override // m90.b, okio.Source
        public long read(Buffer buffer, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.f;
            if (j2 == 0) {
                return -1L;
            }
            long read = super.read(buffer, Math.min(j2, j));
            if (read == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            }
            long j3 = this.f - read;
            this.f = j3;
            if (j3 == 0) {
                a(true, null);
            }
            return read;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g extends b {
        private boolean f;

        g(m90 m90Var) {
            super();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.c) {
                return;
            }
            if (!this.f) {
                a(false, null);
            }
            this.c = true;
        }

        @Override // m90.b, okio.Source
        public long read(Buffer buffer, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            if (this.f) {
                return -1L;
            }
            long read = super.read(buffer, j);
            if (read != -1) {
                return read;
            }
            this.f = true;
            a(true, null);
            return -1L;
        }
    }

    public m90(d80 d80Var, a90 a90Var, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        this.a = d80Var;
        this.b = a90Var;
        this.c = bufferedSource;
        this.d = bufferedSink;
    }

    private String f() {
        String readUtf8LineStrict = this.c.readUtf8LineStrict(this.f);
        this.f -= readUtf8LineStrict.length();
        return readUtf8LineStrict;
    }

    @Override // defpackage.d90
    public i80.a a(boolean z) {
        int i = this.e;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.e);
        }
        try {
            l90 a2 = l90.a(f());
            i80.a aVar = new i80.a();
            aVar.a(a2.a);
            aVar.a(a2.b);
            aVar.a(a2.c);
            aVar.a(e());
            if (z && a2.b == 100) {
                return null;
            }
            if (a2.b == 100) {
                this.e = 3;
                return aVar;
            }
            this.e = 4;
            return aVar;
        } catch (EOFException e2) {
            IOException iOException = new IOException("unexpected end of stream on " + this.b);
            iOException.initCause(e2);
            throw iOException;
        }
    }

    @Override // defpackage.d90
    public j80 a(i80 i80Var) {
        a90 a90Var = this.b;
        a90Var.f.e(a90Var.e);
        String a2 = i80Var.a("Content-Type");
        if (!f90.b(i80Var)) {
            return new i90(a2, 0L, Okio.buffer(b(0L)));
        }
        if ("chunked".equalsIgnoreCase(i80Var.a("Transfer-Encoding"))) {
            return new i90(a2, -1L, Okio.buffer(a(i80Var.m().g())));
        }
        long a3 = f90.a(i80Var);
        return a3 != -1 ? new i90(a2, a3, Okio.buffer(b(a3))) : new i90(a2, -1L, Okio.buffer(d()));
    }

    public Sink a(long j) {
        if (this.e == 1) {
            this.e = 2;
            return new e(j);
        }
        throw new IllegalStateException("state: " + this.e);
    }

    @Override // defpackage.d90
    public Sink a(g80 g80Var, long j) {
        if ("chunked".equalsIgnoreCase(g80Var.a("Transfer-Encoding"))) {
            return c();
        }
        if (j != -1) {
            return a(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public Source a(z70 z70Var) {
        if (this.e == 4) {
            this.e = 5;
            return new d(z70Var);
        }
        throw new IllegalStateException("state: " + this.e);
    }

    @Override // defpackage.d90
    public void a() {
        this.d.flush();
    }

    @Override // defpackage.d90
    public void a(g80 g80Var) {
        a(g80Var.c(), j90.a(g80Var, this.b.c().e().b().type()));
    }

    void a(ForwardingTimeout forwardingTimeout) {
        Timeout delegate = forwardingTimeout.delegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    public void a(y70 y70Var, String str) {
        if (this.e != 0) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.d.writeUtf8(str).writeUtf8("\r\n");
        int b2 = y70Var.b();
        for (int i = 0; i < b2; i++) {
            this.d.writeUtf8(y70Var.a(i)).writeUtf8(": ").writeUtf8(y70Var.b(i)).writeUtf8("\r\n");
        }
        this.d.writeUtf8("\r\n");
        this.e = 1;
    }

    public Source b(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new f(this, j);
        }
        throw new IllegalStateException("state: " + this.e);
    }

    @Override // defpackage.d90
    public void b() {
        this.d.flush();
    }

    public Sink c() {
        if (this.e == 1) {
            this.e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.e);
    }

    @Override // defpackage.d90
    public void cancel() {
        w80 c2 = this.b.c();
        if (c2 != null) {
            c2.b();
        }
    }

    public Source d() {
        if (this.e != 4) {
            throw new IllegalStateException("state: " + this.e);
        }
        a90 a90Var = this.b;
        if (a90Var == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.e = 5;
        a90Var.e();
        return new g(this);
    }

    public y70 e() {
        y70.a aVar = new y70.a();
        while (true) {
            String f2 = f();
            if (f2.length() == 0) {
                return aVar.a();
            }
            m80.a.a(aVar, f2);
        }
    }
}
