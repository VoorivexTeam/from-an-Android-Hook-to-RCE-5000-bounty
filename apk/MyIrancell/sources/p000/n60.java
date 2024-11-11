package p000;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public class n60 {

    /* renamed from: i */
    private static n60 f12220i;

    /* renamed from: j */
    private static final Semaphore f12221j = new Semaphore(1);

    /* renamed from: a */
    private final Object f12222a;

    /* renamed from: b */
    private final ExecutorService f12223b;

    /* renamed from: c */
    private final Map<String, o60> f12224c;

    /* renamed from: d */
    private final ServerSocket f12225d;

    /* renamed from: e */
    private final int f12226e;

    /* renamed from: f */
    private final Thread f12227f;

    /* renamed from: g */
    private final k60 f12228g;

    /* renamed from: h */
    private final s60 f12229h;

    /* renamed from: n60$b */
    /* loaded from: classes.dex */
    public static final class C2973b {

        /* renamed from: a */
        private File f12230a;

        /* renamed from: d */
        private i60 f12233d;

        /* renamed from: c */
        private u50 f12232c = new b60(536870912);

        /* renamed from: b */
        private w50 f12231b = new z50();

        /* renamed from: e */
        private e60 f12234e = new d60();

        public C2973b(Context context) {
            this.f12233d = j60.m13403a(context);
            this.f12230a = z60.m16785a(context);
        }

        /* renamed from: b */
        private k60 m14256b() {
            return new k60(this.f12230a, this.f12231b, this.f12232c, this.f12233d, this.f12234e);
        }

        /* renamed from: a */
        public C2973b m14257a(int i) {
            this.f12232c = new a60(i);
            return this;
        }

        /* renamed from: a */
        public C2973b m14258a(File file) {
            t60.m15549a(file);
            this.f12230a = file;
            return this;
        }

        /* renamed from: a */
        public n60 m14259a() {
            return new n60(m14256b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n60$c */
    /* loaded from: classes.dex */
    public final class RunnableC2974c implements Runnable {

        /* renamed from: b */
        private final Socket f12235b;

        public RunnableC2974c(Socket socket) {
            this.f12235b = socket;
        }

        @Override // java.lang.Runnable
        public void run() {
            n60.this.m14240a(this.f12235b);
        }
    }

    /* renamed from: n60$d */
    /* loaded from: classes.dex */
    private final class RunnableC2975d implements Runnable {

        /* renamed from: b */
        private final CountDownLatch f12237b;

        public RunnableC2975d(CountDownLatch countDownLatch) {
            this.f12237b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12237b.countDown();
            n60.this.m14244b();
        }
    }

    private n60(k60 k60Var) {
        this.f12222a = new Object();
        this.f12223b = Executors.newFixedThreadPool(8);
        this.f12224c = new ConcurrentHashMap();
        t60.m15549a(k60Var);
        this.f12228g = k60Var;
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.f12225d = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.f12226e = localPort;
            q60.m14956a("127.0.0.1", localPort);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new RunnableC2975d(countDownLatch));
            this.f12227f = thread;
            thread.start();
            countDownLatch.await();
            this.f12229h = new s60("127.0.0.1", this.f12226e);
            i50.m12372b("Proxy cache server started. Is it alive? " + m14243a());
        } catch (IOException | InterruptedException e) {
            this.f12223b.shutdown();
            throw new IllegalStateException("Error starting local proxy server", e);
        }
    }

    /* renamed from: a */
    public static n60 m14237a(Context context) {
        if (f12220i == null) {
            try {
                f12221j.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            C2973b c2973b = new C2973b(context);
            c2973b.m14257a(10);
            c2973b.m14258a(new File(context.getFilesDir(), "videos"));
            f12220i = c2973b.m14259a();
            f12221j.release();
        }
        return f12220i;
    }

    /* renamed from: a */
    private void m14238a(File file) {
        try {
            this.f12228g.f11653c.mo15722a(file);
        } catch (IOException e) {
            i50.m12368a("Error touching file " + file);
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m14239a(Throwable th) {
        i50.m12368a("HttpProxyCacheServer error");
        th.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m14240a(Socket socket) {
        StringBuilder sb;
        try {
            try {
                l60 m13817a = l60.m13817a(socket.getInputStream());
                i50.m12376d("Request to cache proxy:" + m13817a);
                String m16146c = w60.m16146c(m13817a.f11812a);
                if (this.f12229h.m15374a(m16146c)) {
                    this.f12229h.m15372a(socket);
                } else {
                    m14251e(m16146c).m14431a(m13817a, socket);
                }
                m14245b(socket);
                sb = new StringBuilder();
            } catch (SocketException unused) {
                i50.m12376d("Closing socket… Socket is closed by client.");
                m14245b(socket);
                sb = new StringBuilder();
            } catch (IOException e) {
                e = e;
                m14239a(new v60("Error processing request", e));
                m14245b(socket);
                sb = new StringBuilder();
            } catch (v60 e2) {
                e = e2;
                m14239a(new v60("Error processing request", e));
                m14245b(socket);
                sb = new StringBuilder();
            }
            sb.append("Opened connections: ");
            sb.append(m14246c());
            i50.m12376d(sb.toString());
        } catch (Throwable th) {
            m14245b(socket);
            i50.m12376d("Opened connections: " + m14246c());
            throw th;
        }
    }

    /* renamed from: a */
    private boolean m14243a() {
        return this.f12229h.m15373a(3, 70);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m14244b() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Socket accept = this.f12225d.accept();
                i50.m12376d("Accept new socket " + accept);
                this.f12223b.submit(new RunnableC2974c(accept));
            } catch (IOException e) {
                m14239a(new v60("Error during waiting connection", e));
                return;
            }
        }
    }

    /* renamed from: b */
    private void m14245b(Socket socket) {
        m14248c(socket);
        m14250d(socket);
        m14252e(socket);
    }

    /* renamed from: c */
    private int m14246c() {
        int i;
        synchronized (this.f12222a) {
            i = 0;
            Iterator<o60> it = this.f12224c.values().iterator();
            while (it.hasNext()) {
                i += it.next().m14430a();
            }
        }
        return i;
    }

    /* renamed from: c */
    private String m14247c(String str) {
        return String.format(Locale.US, "http://%s:%d/%s", "127.0.0.1", Integer.valueOf(this.f12226e), w60.m16145b(str));
    }

    /* renamed from: c */
    private void m14248c(Socket socket) {
        try {
            if (socket.isInputShutdown()) {
                return;
            }
            socket.shutdownInput();
        } catch (SocketException unused) {
            i50.m12376d("Releasing input stream… Socket is closed by client.");
        } catch (IOException e) {
            m14239a(new v60("Error closing socket input stream", e));
        }
    }

    /* renamed from: d */
    private File m14249d(String str) {
        k60 k60Var = this.f12228g;
        return new File(k60Var.f11651a, k60Var.f11652b.mo16135a(str));
    }

    /* renamed from: d */
    private void m14250d(Socket socket) {
        try {
            if (socket.isOutputShutdown()) {
                return;
            }
            socket.shutdownOutput();
        } catch (IOException e) {
            i50.m12375c("Failed to close socket on proxy side: {}. It seems client have already closed connection.", e.getMessage());
        }
    }

    /* renamed from: e */
    private o60 m14251e(String str) {
        o60 o60Var;
        synchronized (this.f12222a) {
            o60Var = this.f12224c.get(str);
            if (o60Var == null) {
                o60Var = new o60(str, this.f12228g);
                this.f12224c.put(str, o60Var);
            }
        }
        return o60Var;
    }

    /* renamed from: e */
    private void m14252e(Socket socket) {
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.close();
        } catch (IOException e) {
            m14239a(new v60("Error closing socket", e));
        }
    }

    /* renamed from: a */
    public String m14253a(String str) {
        return m14254a(str, true);
    }

    /* renamed from: a */
    public String m14254a(String str, boolean z) {
        if (!z || !m14255b(str)) {
            return m14243a() ? m14247c(str) : str;
        }
        File m14249d = m14249d(str);
        m14238a(m14249d);
        return Uri.fromFile(m14249d).toString();
    }

    /* renamed from: b */
    public boolean m14255b(String str) {
        t60.m15550a(str, "Url can't be null!");
        return m14249d(str).exists();
    }
}
