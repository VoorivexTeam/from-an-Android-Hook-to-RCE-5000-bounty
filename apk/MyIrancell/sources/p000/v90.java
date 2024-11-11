package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p000.p90;

/* loaded from: classes.dex */
public final class v90 {

    /* renamed from: b */
    long f13645b;

    /* renamed from: c */
    final int f13646c;

    /* renamed from: d */
    final t90 f13647d;

    /* renamed from: f */
    private p90.InterfaceC3077a f13649f;

    /* renamed from: g */
    private boolean f13650g;

    /* renamed from: h */
    private final C3348b f13651h;

    /* renamed from: i */
    final C3347a f13652i;

    /* renamed from: a */
    long f13644a = 0;

    /* renamed from: e */
    private final Deque<y70> f13648e = new ArrayDeque();

    /* renamed from: j */
    final C3349c f13653j = new C3349c();

    /* renamed from: k */
    final C3349c f13654k = new C3349c();

    /* renamed from: l */
    o90 f13655l = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v90$a */
    /* loaded from: classes.dex */
    public final class C3347a implements Sink {

        /* renamed from: b */
        private final Buffer f13656b = new Buffer();

        /* renamed from: c */
        boolean f13657c;

        /* renamed from: d */
        boolean f13658d;

        C3347a() {
        }

        /* renamed from: a */
        private void m16002a(boolean z) {
            long min;
            synchronized (v90.this) {
                v90.this.f13654k.enter();
                while (v90.this.f13645b <= 0 && !this.f13658d && !this.f13657c && v90.this.f13655l == null) {
                    try {
                        v90.this.m16000k();
                    } finally {
                    }
                }
                v90.this.f13654k.m16005a();
                v90.this.m15989b();
                min = Math.min(v90.this.f13645b, this.f13656b.size());
                v90.this.f13645b -= min;
            }
            v90.this.f13654k.enter();
            try {
                v90.this.f13647d.m15596a(v90.this.f13646c, z && min == this.f13656b.size(), this.f13656b, min);
            } finally {
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (v90.this) {
                if (this.f13657c) {
                    return;
                }
                if (!v90.this.f13652i.f13658d) {
                    if (this.f13656b.size() > 0) {
                        while (this.f13656b.size() > 0) {
                            m16002a(true);
                        }
                    } else {
                        v90 v90Var = v90.this;
                        v90Var.f13647d.m15596a(v90Var.f13646c, true, (Buffer) null, 0L);
                    }
                }
                synchronized (v90.this) {
                    this.f13657c = true;
                }
                v90.this.f13647d.flush();
                v90.this.m15984a();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            synchronized (v90.this) {
                v90.this.m15989b();
            }
            while (this.f13656b.size() > 0) {
                m16002a(false);
                v90.this.f13647d.flush();
            }
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return v90.this.f13654k;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) {
            this.f13656b.write(buffer, j);
            while (this.f13656b.size() >= 16384) {
                m16002a(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v90$b */
    /* loaded from: classes.dex */
    public final class C3348b implements Source {

        /* renamed from: b */
        private final Buffer f13660b = new Buffer();

        /* renamed from: c */
        private final Buffer f13661c = new Buffer();

        /* renamed from: d */
        private final long f13662d;

        /* renamed from: e */
        boolean f13663e;

        /* renamed from: f */
        boolean f13664f;

        C3348b(long j) {
            this.f13662d = j;
        }

        /* renamed from: a */
        private void m16003a(long j) {
            v90.this.f13647d.m15597a(j);
        }

        /* renamed from: a */
        void m16004a(BufferedSource bufferedSource, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (v90.this) {
                    z = this.f13664f;
                    z2 = true;
                    z3 = this.f13661c.size() + j > this.f13662d;
                }
                if (z3) {
                    bufferedSource.skip(j);
                    v90.this.m15990b(o90.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    bufferedSource.skip(j);
                    return;
                }
                long read = bufferedSource.read(this.f13660b, j);
                if (read == -1) {
                    throw new EOFException();
                }
                j -= read;
                synchronized (v90.this) {
                    if (this.f13661c.size() != 0) {
                        z2 = false;
                    }
                    this.f13661c.writeAll(this.f13660b);
                    if (z2) {
                        v90.this.notifyAll();
                    }
                }
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            p90.InterfaceC3077a interfaceC3077a;
            ArrayList arrayList;
            synchronized (v90.this) {
                this.f13663e = true;
                size = this.f13661c.size();
                this.f13661c.clear();
                interfaceC3077a = null;
                if (v90.this.f13648e.isEmpty() || v90.this.f13649f == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(v90.this.f13648e);
                    v90.this.f13648e.clear();
                    interfaceC3077a = v90.this.f13649f;
                    arrayList = arrayList2;
                }
                v90.this.notifyAll();
            }
            if (size > 0) {
                m16003a(size);
            }
            v90.this.m15984a();
            if (interfaceC3077a != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    interfaceC3077a.m14740a((y70) it.next());
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
        
            if (r11 == (-1)) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
        
            m16003a(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
        
            return r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
        
            if (r0 != null) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00d3, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:
        
            throw new p000.aa0(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00e1, code lost:
        
            throw new java.io.IOException("stream closed");
         */
        @Override // okio.Source
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(okio.Buffer r18, long r19) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.v90.C3348b.read(okio.Buffer, long):long");
        }

        @Override // okio.Source
        public Timeout timeout() {
            return v90.this.f13653j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v90$c */
    /* loaded from: classes.dex */
    public class C3349c extends AsyncTimeout {
        C3349c() {
        }

        /* renamed from: a */
        public void m16005a() {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // okio.AsyncTimeout
        protected IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // okio.AsyncTimeout
        protected void timedOut() {
            v90.this.m15990b(o90.CANCEL);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v90(int i, t90 t90Var, boolean z, boolean z2, @Nullable y70 y70Var) {
        if (t90Var == null) {
            throw new NullPointerException("connection == null");
        }
        this.f13646c = i;
        this.f13647d = t90Var;
        this.f13645b = t90Var.f13250p.m16906c();
        this.f13651h = new C3348b(t90Var.f13249o.m16906c());
        C3347a c3347a = new C3347a();
        this.f13652i = c3347a;
        this.f13651h.f13664f = z2;
        c3347a.f13658d = z;
        if (y70Var != null) {
            this.f13648e.add(y70Var);
        }
        if (m15995f() && y70Var != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!m15995f() && y70Var == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    /* renamed from: d */
    private boolean m15983d(o90 o90Var) {
        synchronized (this) {
            if (this.f13655l != null) {
                return false;
            }
            if (this.f13651h.f13664f && this.f13652i.f13658d) {
                return false;
            }
            this.f13655l = o90Var;
            notifyAll();
            this.f13647d.m15606c(this.f13646c);
            return true;
        }
    }

    /* renamed from: a */
    void m15984a() {
        boolean z;
        boolean m15996g;
        synchronized (this) {
            z = !this.f13651h.f13664f && this.f13651h.f13663e && (this.f13652i.f13658d || this.f13652i.f13657c);
            m15996g = m15996g();
        }
        if (z) {
            m15987a(o90.CANCEL);
        } else {
            if (m15996g) {
                return;
            }
            this.f13647d.m15606c(this.f13646c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15985a(long j) {
        this.f13645b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15986a(List<p90> list) {
        boolean m15996g;
        synchronized (this) {
            this.f13650g = true;
            this.f13648e.add(o80.m14467b(list));
            m15996g = m15996g();
            notifyAll();
        }
        if (m15996g) {
            return;
        }
        this.f13647d.m15606c(this.f13646c);
    }

    /* renamed from: a */
    public void m15987a(o90 o90Var) {
        if (m15983d(o90Var)) {
            this.f13647d.m15603b(this.f13646c, o90Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15988a(BufferedSource bufferedSource, int i) {
        this.f13651h.m16004a(bufferedSource, i);
    }

    /* renamed from: b */
    void m15989b() {
        C3347a c3347a = this.f13652i;
        if (c3347a.f13657c) {
            throw new IOException("stream closed");
        }
        if (c3347a.f13658d) {
            throw new IOException("stream finished");
        }
        if (this.f13655l != null) {
            throw new aa0(this.f13655l);
        }
    }

    /* renamed from: b */
    public void m15990b(o90 o90Var) {
        if (m15983d(o90Var)) {
            this.f13647d.m15607c(this.f13646c, o90Var);
        }
    }

    /* renamed from: c */
    public int m15991c() {
        return this.f13646c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void m15992c(o90 o90Var) {
        if (this.f13655l == null) {
            this.f13655l = o90Var;
            notifyAll();
        }
    }

    /* renamed from: d */
    public Sink m15993d() {
        synchronized (this) {
            if (!this.f13650g && !m15995f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f13652i;
    }

    /* renamed from: e */
    public Source m15994e() {
        return this.f13651h;
    }

    /* renamed from: f */
    public boolean m15995f() {
        return this.f13647d.f13236b == ((this.f13646c & 1) == 1);
    }

    /* renamed from: g */
    public synchronized boolean m15996g() {
        if (this.f13655l != null) {
            return false;
        }
        if ((this.f13651h.f13664f || this.f13651h.f13663e) && (this.f13652i.f13658d || this.f13652i.f13657c)) {
            if (this.f13650g) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public Timeout m15997h() {
        return this.f13653j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m15998i() {
        boolean m15996g;
        synchronized (this) {
            this.f13651h.f13664f = true;
            m15996g = m15996g();
            notifyAll();
        }
        if (m15996g) {
            return;
        }
        this.f13647d.m15606c(this.f13646c);
    }

    /* renamed from: j */
    public synchronized y70 m15999j() {
        this.f13653j.enter();
        while (this.f13648e.isEmpty() && this.f13655l == null) {
            try {
                m16000k();
            } catch (Throwable th) {
                this.f13653j.m16005a();
                throw th;
            }
        }
        this.f13653j.m16005a();
        if (this.f13648e.isEmpty()) {
            throw new aa0(this.f13655l);
        }
        return this.f13648e.removeFirst();
    }

    /* renamed from: k */
    void m16000k() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: l */
    public Timeout m16001l() {
        return this.f13654k;
    }
}
