package p000;

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
import p000.i80;
import p000.y70;

/* loaded from: classes.dex */
public final class m90 implements d90 {

    /* renamed from: a */
    final d80 f12110a;

    /* renamed from: b */
    final a90 f12111b;

    /* renamed from: c */
    final BufferedSource f12112c;

    /* renamed from: d */
    final BufferedSink f12113d;

    /* renamed from: e */
    int f12114e = 0;

    /* renamed from: f */
    private long f12115f = 262144;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m90$b */
    /* loaded from: classes.dex */
    public abstract class AbstractC2930b implements Source {

        /* renamed from: b */
        protected final ForwardingTimeout f12116b;

        /* renamed from: c */
        protected boolean f12117c;

        /* renamed from: d */
        protected long f12118d;

        private AbstractC2930b() {
            this.f12116b = new ForwardingTimeout(m90.this.f12112c.timeout());
            this.f12118d = 0L;
        }

        /* renamed from: a */
        protected final void m14094a(boolean z, IOException iOException) {
            m90 m90Var = m90.this;
            int i = m90Var.f12114e;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                throw new IllegalStateException("state: " + m90.this.f12114e);
            }
            m90Var.m14088a(this.f12116b);
            m90 m90Var2 = m90.this;
            m90Var2.f12114e = 6;
            a90 a90Var = m90Var2.f12111b;
            if (a90Var != null) {
                a90Var.m113a(!z, m90Var2, this.f12118d, iOException);
            }
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) {
            try {
                long read = m90.this.f12112c.read(buffer, j);
                if (read > 0) {
                    this.f12118d += read;
                }
                return read;
            } catch (IOException e) {
                m14094a(false, e);
                throw e;
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.f12116b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m90$c */
    /* loaded from: classes.dex */
    public final class C2931c implements Sink {

        /* renamed from: b */
        private final ForwardingTimeout f12120b;

        /* renamed from: c */
        private boolean f12121c;

        C2931c() {
            this.f12120b = new ForwardingTimeout(m90.this.f12113d.timeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f12121c) {
                return;
            }
            this.f12121c = true;
            m90.this.f12113d.writeUtf8("0\r\n\r\n");
            m90.this.m14088a(this.f12120b);
            m90.this.f12114e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() {
            if (this.f12121c) {
                return;
            }
            m90.this.f12113d.flush();
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.f12120b;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) {
            if (this.f12121c) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            m90.this.f12113d.writeHexadecimalUnsignedLong(j);
            m90.this.f12113d.writeUtf8("\r\n");
            m90.this.f12113d.write(buffer, j);
            m90.this.f12113d.writeUtf8("\r\n");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m90$d */
    /* loaded from: classes.dex */
    public class C2932d extends AbstractC2930b {

        /* renamed from: f */
        private final z70 f12123f;

        /* renamed from: g */
        private long f12124g;

        /* renamed from: h */
        private boolean f12125h;

        C2932d(z70 z70Var) {
            super();
            this.f12124g = -1L;
            this.f12125h = true;
            this.f12123f = z70Var;
        }

        /* renamed from: a */
        private void m14095a() {
            if (this.f12124g != -1) {
                m90.this.f12112c.readUtf8LineStrict();
            }
            try {
                this.f12124g = m90.this.f12112c.readHexadecimalUnsignedLong();
                String trim = m90.this.f12112c.readUtf8LineStrict().trim();
                if (this.f12124g < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f12124g + trim + "\"");
                }
                if (this.f12124g == 0) {
                    this.f12125h = false;
                    f90.m11718a(m90.this.f12110a.m11305k(), this.f12123f, m90.this.m14093e());
                    m14094a(true, null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f12117c) {
                return;
            }
            if (this.f12125h && !o80.m14463a(this, 100, TimeUnit.MILLISECONDS)) {
                m14094a(false, null);
            }
            this.f12117c = true;
        }

        @Override // p000.m90.AbstractC2930b, okio.Source
        public long read(Buffer buffer, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.f12117c) {
                throw new IllegalStateException("closed");
            }
            if (!this.f12125h) {
                return -1L;
            }
            long j2 = this.f12124g;
            if (j2 == 0 || j2 == -1) {
                m14095a();
                if (!this.f12125h) {
                    return -1L;
                }
            }
            long read = super.read(buffer, Math.min(j, this.f12124g));
            if (read != -1) {
                this.f12124g -= read;
                return read;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m14094a(false, protocolException);
            throw protocolException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m90$e */
    /* loaded from: classes.dex */
    public final class C2933e implements Sink {

        /* renamed from: b */
        private final ForwardingTimeout f12127b;

        /* renamed from: c */
        private boolean f12128c;

        /* renamed from: d */
        private long f12129d;

        C2933e(long j) {
            this.f12127b = new ForwardingTimeout(m90.this.f12113d.timeout());
            this.f12129d = j;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f12128c) {
                return;
            }
            this.f12128c = true;
            if (this.f12129d > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            m90.this.m14088a(this.f12127b);
            m90.this.f12114e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            if (this.f12128c) {
                return;
            }
            m90.this.f12113d.flush();
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.f12127b;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) {
            if (this.f12128c) {
                throw new IllegalStateException("closed");
            }
            o80.m14456a(buffer.size(), 0L, j);
            if (j <= this.f12129d) {
                m90.this.f12113d.write(buffer, j);
                this.f12129d -= j;
                return;
            }
            throw new ProtocolException("expected " + this.f12129d + " bytes but received " + j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m90$f */
    /* loaded from: classes.dex */
    public class C2934f extends AbstractC2930b {

        /* renamed from: f */
        private long f12131f;

        C2934f(m90 m90Var, long j) {
            super();
            this.f12131f = j;
            if (j == 0) {
                m14094a(true, null);
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f12117c) {
                return;
            }
            if (this.f12131f != 0 && !o80.m14463a(this, 100, TimeUnit.MILLISECONDS)) {
                m14094a(false, null);
            }
            this.f12117c = true;
        }

        @Override // p000.m90.AbstractC2930b, okio.Source
        public long read(Buffer buffer, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.f12117c) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.f12131f;
            if (j2 == 0) {
                return -1L;
            }
            long read = super.read(buffer, Math.min(j2, j));
            if (read == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m14094a(false, protocolException);
                throw protocolException;
            }
            long j3 = this.f12131f - read;
            this.f12131f = j3;
            if (j3 == 0) {
                m14094a(true, null);
            }
            return read;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m90$g */
    /* loaded from: classes.dex */
    public class C2935g extends AbstractC2930b {

        /* renamed from: f */
        private boolean f12132f;

        C2935g(m90 m90Var) {
            super();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f12117c) {
                return;
            }
            if (!this.f12132f) {
                m14094a(false, null);
            }
            this.f12117c = true;
        }

        @Override // p000.m90.AbstractC2930b, okio.Source
        public long read(Buffer buffer, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.f12117c) {
                throw new IllegalStateException("closed");
            }
            if (this.f12132f) {
                return -1L;
            }
            long read = super.read(buffer, j);
            if (read != -1) {
                return read;
            }
            this.f12132f = true;
            m14094a(true, null);
            return -1L;
        }
    }

    public m90(d80 d80Var, a90 a90Var, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        this.f12110a = d80Var;
        this.f12111b = a90Var;
        this.f12112c = bufferedSource;
        this.f12113d = bufferedSink;
    }

    /* renamed from: f */
    private String m14085f() {
        String readUtf8LineStrict = this.f12112c.readUtf8LineStrict(this.f12115f);
        this.f12115f -= readUtf8LineStrict.length();
        return readUtf8LineStrict;
    }

    @Override // p000.d90
    /* renamed from: a */
    public i80.C2583a mo11341a(boolean z) {
        int i = this.f12114e;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.f12114e);
        }
        try {
            l90 m13833a = l90.m13833a(m14085f());
            i80.C2583a c2583a = new i80.C2583a();
            c2583a.m12403a(m13833a.f11830a);
            c2583a.m12401a(m13833a.f11831b);
            c2583a.m12407a(m13833a.f11832c);
            c2583a.m12410a(m14093e());
            if (z && m13833a.f11831b == 100) {
                return null;
            }
            if (m13833a.f11831b == 100) {
                this.f12114e = 3;
                return c2583a;
            }
            this.f12114e = 4;
            return c2583a;
        } catch (EOFException e) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f12111b);
            iOException.initCause(e);
            throw iOException;
        }
    }

    @Override // p000.d90
    /* renamed from: a */
    public j80 mo11342a(i80 i80Var) {
        a90 a90Var = this.f12111b;
        a90Var.f67f.m15966e(a90Var.f66e);
        String m12386a = i80Var.m12386a("Content-Type");
        if (!f90.m11720b(i80Var)) {
            return new i90(m12386a, 0L, Okio.buffer(m14090b(0L)));
        }
        if ("chunked".equalsIgnoreCase(i80Var.m12386a("Transfer-Encoding"))) {
            return new i90(m12386a, -1L, Okio.buffer(m14087a(i80Var.m12397m().m11925g())));
        }
        long m11715a = f90.m11715a(i80Var);
        return m11715a != -1 ? new i90(m12386a, m11715a, Okio.buffer(m14090b(m11715a))) : new i90(m12386a, -1L, Okio.buffer(m14092d()));
    }

    /* renamed from: a */
    public Sink m14086a(long j) {
        if (this.f12114e == 1) {
            this.f12114e = 2;
            return new C2933e(j);
        }
        throw new IllegalStateException("state: " + this.f12114e);
    }

    @Override // p000.d90
    /* renamed from: a */
    public Sink mo11343a(g80 g80Var, long j) {
        if ("chunked".equalsIgnoreCase(g80Var.m11919a("Transfer-Encoding"))) {
            return m14091c();
        }
        if (j != -1) {
            return m14086a(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    /* renamed from: a */
    public Source m14087a(z70 z70Var) {
        if (this.f12114e == 4) {
            this.f12114e = 5;
            return new C2932d(z70Var);
        }
        throw new IllegalStateException("state: " + this.f12114e);
    }

    @Override // p000.d90
    /* renamed from: a */
    public void mo11344a() {
        this.f12113d.flush();
    }

    @Override // p000.d90
    /* renamed from: a */
    public void mo11345a(g80 g80Var) {
        m14089a(g80Var.m11921c(), j90.m13429a(g80Var, this.f12111b.m115c().m16172e().m13628b().type()));
    }

    /* renamed from: a */
    void m14088a(ForwardingTimeout forwardingTimeout) {
        Timeout delegate = forwardingTimeout.delegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    /* renamed from: a */
    public void m14089a(y70 y70Var, String str) {
        if (this.f12114e != 0) {
            throw new IllegalStateException("state: " + this.f12114e);
        }
        this.f12113d.writeUtf8(str).writeUtf8("\r\n");
        int m16595b = y70Var.m16595b();
        for (int i = 0; i < m16595b; i++) {
            this.f12113d.writeUtf8(y70Var.m16592a(i)).writeUtf8(": ").writeUtf8(y70Var.m16596b(i)).writeUtf8("\r\n");
        }
        this.f12113d.writeUtf8("\r\n");
        this.f12114e = 1;
    }

    /* renamed from: b */
    public Source m14090b(long j) {
        if (this.f12114e == 4) {
            this.f12114e = 5;
            return new C2934f(this, j);
        }
        throw new IllegalStateException("state: " + this.f12114e);
    }

    @Override // p000.d90
    /* renamed from: b */
    public void mo11346b() {
        this.f12113d.flush();
    }

    /* renamed from: c */
    public Sink m14091c() {
        if (this.f12114e == 1) {
            this.f12114e = 2;
            return new C2931c();
        }
        throw new IllegalStateException("state: " + this.f12114e);
    }

    @Override // p000.d90
    public void cancel() {
        w80 m115c = this.f12111b.m115c();
        if (m115c != null) {
            m115c.m16169b();
        }
    }

    /* renamed from: d */
    public Source m14092d() {
        if (this.f12114e != 4) {
            throw new IllegalStateException("state: " + this.f12114e);
        }
        a90 a90Var = this.f12111b;
        if (a90Var == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.f12114e = 5;
        a90Var.m117e();
        return new C2935g(this);
    }

    /* renamed from: e */
    public y70 m14093e() {
        y70.C3476a c3476a = new y70.C3476a();
        while (true) {
            String m14085f = m14085f();
            if (m14085f.length() == 0) {
                return c3476a.m16600a();
            }
            m80.f12098a.mo11327a(c3476a, m14085f);
        }
    }
}
