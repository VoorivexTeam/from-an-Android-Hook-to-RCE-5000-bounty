package defpackage;

import defpackage.p90;
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

/* loaded from: classes.dex */
public final class v90 {
    long b;
    final int c;
    final t90 d;
    private p90.a f;
    private boolean g;
    private final b h;
    final a i;
    long a = 0;
    private final Deque<y70> e = new ArrayDeque();
    final c j = new c();
    final c k = new c();
    o90 l = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class a implements Sink {
        private final Buffer b = new Buffer();
        boolean c;
        boolean d;

        a() {
        }

        private void a(boolean z) {
            long min;
            synchronized (v90.this) {
                v90.this.k.enter();
                while (v90.this.b <= 0 && !this.d && !this.c && v90.this.l == null) {
                    try {
                        v90.this.k();
                    } finally {
                    }
                }
                v90.this.k.a();
                v90.this.b();
                min = Math.min(v90.this.b, this.b.size());
                v90.this.b -= min;
            }
            v90.this.k.enter();
            try {
                v90.this.d.a(v90.this.c, z && min == this.b.size(), this.b, min);
            } finally {
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (v90.this) {
                if (this.c) {
                    return;
                }
                if (!v90.this.i.d) {
                    if (this.b.size() > 0) {
                        while (this.b.size() > 0) {
                            a(true);
                        }
                    } else {
                        v90 v90Var = v90.this;
                        v90Var.d.a(v90Var.c, true, (Buffer) null, 0L);
                    }
                }
                synchronized (v90.this) {
                    this.c = true;
                }
                v90.this.d.flush();
                v90.this.a();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            synchronized (v90.this) {
                v90.this.b();
            }
            while (this.b.size() > 0) {
                a(false);
                v90.this.d.flush();
            }
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return v90.this.k;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) {
            this.b.write(buffer, j);
            while (this.b.size() >= 16384) {
                a(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b implements Source {
        private final Buffer b = new Buffer();
        private final Buffer c = new Buffer();
        private final long d;
        boolean e;
        boolean f;

        b(long j) {
            this.d = j;
        }

        private void a(long j) {
            v90.this.d.a(j);
        }

        void a(BufferedSource bufferedSource, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (v90.this) {
                    z = this.f;
                    z2 = true;
                    z3 = this.c.size() + j > this.d;
                }
                if (z3) {
                    bufferedSource.skip(j);
                    v90.this.b(o90.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    bufferedSource.skip(j);
                    return;
                }
                long read = bufferedSource.read(this.b, j);
                if (read == -1) {
                    throw new EOFException();
                }
                j -= read;
                synchronized (v90.this) {
                    if (this.c.size() != 0) {
                        z2 = false;
                    }
                    this.c.writeAll(this.b);
                    if (z2) {
                        v90.this.notifyAll();
                    }
                }
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            p90.a aVar;
            ArrayList arrayList;
            synchronized (v90.this) {
                this.e = true;
                size = this.c.size();
                this.c.clear();
                aVar = null;
                if (v90.this.e.isEmpty() || v90.this.f == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(v90.this.e);
                    v90.this.e.clear();
                    aVar = v90.this.f;
                    arrayList = arrayList2;
                }
                v90.this.notifyAll();
            }
            if (size > 0) {
                a(size);
            }
            v90.this.a();
            if (aVar != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    aVar.a((y70) it.next());
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
        
            if (r11 == (-1)) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
        
            a(r11);
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
        
            throw new defpackage.aa0(r0);
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
            throw new UnsupportedOperationException("Method not decompiled: v90.b.read(okio.Buffer, long):long");
        }

        @Override // okio.Source
        public Timeout timeout() {
            return v90.this.j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends AsyncTimeout {
        c() {
        }

        public void a() {
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
            v90.this.b(o90.CANCEL);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v90(int i, t90 t90Var, boolean z, boolean z2, @Nullable y70 y70Var) {
        if (t90Var == null) {
            throw new NullPointerException("connection == null");
        }
        this.c = i;
        this.d = t90Var;
        this.b = t90Var.p.c();
        this.h = new b(t90Var.o.c());
        a aVar = new a();
        this.i = aVar;
        this.h.f = z2;
        aVar.d = z;
        if (y70Var != null) {
            this.e.add(y70Var);
        }
        if (f() && y70Var != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!f() && y70Var == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private boolean d(o90 o90Var) {
        synchronized (this) {
            if (this.l != null) {
                return false;
            }
            if (this.h.f && this.i.d) {
                return false;
            }
            this.l = o90Var;
            notifyAll();
            this.d.c(this.c);
            return true;
        }
    }

    void a() {
        boolean z;
        boolean g;
        synchronized (this) {
            z = !this.h.f && this.h.e && (this.i.d || this.i.c);
            g = g();
        }
        if (z) {
            a(o90.CANCEL);
        } else {
            if (g) {
                return;
            }
            this.d.c(this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j) {
        this.b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<p90> list) {
        boolean g;
        synchronized (this) {
            this.g = true;
            this.e.add(o80.b(list));
            g = g();
            notifyAll();
        }
        if (g) {
            return;
        }
        this.d.c(this.c);
    }

    public void a(o90 o90Var) {
        if (d(o90Var)) {
            this.d.b(this.c, o90Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(BufferedSource bufferedSource, int i) {
        this.h.a(bufferedSource, i);
    }

    void b() {
        a aVar = this.i;
        if (aVar.c) {
            throw new IOException("stream closed");
        }
        if (aVar.d) {
            throw new IOException("stream finished");
        }
        if (this.l != null) {
            throw new aa0(this.l);
        }
    }

    public void b(o90 o90Var) {
        if (d(o90Var)) {
            this.d.c(this.c, o90Var);
        }
    }

    public int c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void c(o90 o90Var) {
        if (this.l == null) {
            this.l = o90Var;
            notifyAll();
        }
    }

    public Sink d() {
        synchronized (this) {
            if (!this.g && !f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.i;
    }

    public Source e() {
        return this.h;
    }

    public boolean f() {
        return this.d.b == ((this.c & 1) == 1);
    }

    public synchronized boolean g() {
        if (this.l != null) {
            return false;
        }
        if ((this.h.f || this.h.e) && (this.i.d || this.i.c)) {
            if (this.g) {
                return false;
            }
        }
        return true;
    }

    public Timeout h() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        boolean g;
        synchronized (this) {
            this.h.f = true;
            g = g();
            notifyAll();
        }
        if (g) {
            return;
        }
        this.d.c(this.c);
    }

    public synchronized y70 j() {
        this.j.enter();
        while (this.e.isEmpty() && this.l == null) {
            try {
                k();
            } catch (Throwable th) {
                this.j.a();
                throw th;
            }
        }
        this.j.a();
        if (this.e.isEmpty()) {
            throw new aa0(this.l);
        }
        return this.e.removeFirst();
    }

    void k() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public Timeout l() {
        return this.k;
    }
}
