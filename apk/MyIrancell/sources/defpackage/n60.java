package defpackage;

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
    private static n60 i;
    private static final Semaphore j = new Semaphore(1);
    private final Object a;
    private final ExecutorService b;
    private final Map<String, o60> c;
    private final ServerSocket d;
    private final int e;
    private final Thread f;
    private final k60 g;
    private final s60 h;

    /* loaded from: classes.dex */
    public static final class b {
        private File a;
        private i60 d;
        private u50 c = new b60(536870912);
        private w50 b = new z50();
        private e60 e = new d60();

        public b(Context context) {
            this.d = j60.a(context);
            this.a = z60.a(context);
        }

        private k60 b() {
            return new k60(this.a, this.b, this.c, this.d, this.e);
        }

        public b a(int i) {
            this.c = new a60(i);
            return this;
        }

        public b a(File file) {
            t60.a(file);
            this.a = file;
            return this;
        }

        public n60 a() {
            return new n60(b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements Runnable {
        private final Socket b;

        public c(Socket socket) {
            this.b = socket;
        }

        @Override // java.lang.Runnable
        public void run() {
            n60.this.a(this.b);
        }
    }

    /* loaded from: classes.dex */
    private final class d implements Runnable {
        private final CountDownLatch b;

        public d(CountDownLatch countDownLatch) {
            this.b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.countDown();
            n60.this.b();
        }
    }

    private n60(k60 k60Var) {
        this.a = new Object();
        this.b = Executors.newFixedThreadPool(8);
        this.c = new ConcurrentHashMap();
        t60.a(k60Var);
        this.g = k60Var;
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.d = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.e = localPort;
            q60.a("127.0.0.1", localPort);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new d(countDownLatch));
            this.f = thread;
            thread.start();
            countDownLatch.await();
            this.h = new s60("127.0.0.1", this.e);
            i50.b("Proxy cache server started. Is it alive? " + a());
        } catch (IOException | InterruptedException e) {
            this.b.shutdown();
            throw new IllegalStateException("Error starting local proxy server", e);
        }
    }

    public static n60 a(Context context) {
        if (i == null) {
            try {
                j.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            b bVar = new b(context);
            bVar.a(10);
            bVar.a(new File(context.getFilesDir(), "videos"));
            i = bVar.a();
            j.release();
        }
        return i;
    }

    private void a(File file) {
        try {
            this.g.c.a(file);
        } catch (IOException e) {
            i50.a("Error touching file " + file);
            e.printStackTrace();
        }
    }

    private void a(Throwable th) {
        i50.a("HttpProxyCacheServer error");
        th.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Socket socket) {
        StringBuilder sb;
        try {
            try {
                l60 a2 = l60.a(socket.getInputStream());
                i50.d("Request to cache proxy:" + a2);
                String c2 = w60.c(a2.a);
                if (this.h.a(c2)) {
                    this.h.a(socket);
                } else {
                    e(c2).a(a2, socket);
                }
                b(socket);
                sb = new StringBuilder();
            } catch (SocketException unused) {
                i50.d("Closing socket… Socket is closed by client.");
                b(socket);
                sb = new StringBuilder();
            } catch (IOException e) {
                e = e;
                a(new v60("Error processing request", e));
                b(socket);
                sb = new StringBuilder();
            } catch (v60 e2) {
                e = e2;
                a(new v60("Error processing request", e));
                b(socket);
                sb = new StringBuilder();
            }
            sb.append("Opened connections: ");
            sb.append(c());
            i50.d(sb.toString());
        } catch (Throwable th) {
            b(socket);
            i50.d("Opened connections: " + c());
            throw th;
        }
    }

    private boolean a() {
        return this.h.a(3, 70);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Socket accept = this.d.accept();
                i50.d("Accept new socket " + accept);
                this.b.submit(new c(accept));
            } catch (IOException e) {
                a(new v60("Error during waiting connection", e));
                return;
            }
        }
    }

    private void b(Socket socket) {
        c(socket);
        d(socket);
        e(socket);
    }

    private int c() {
        int i2;
        synchronized (this.a) {
            i2 = 0;
            Iterator<o60> it = this.c.values().iterator();
            while (it.hasNext()) {
                i2 += it.next().a();
            }
        }
        return i2;
    }

    private String c(String str) {
        return String.format(Locale.US, "http://%s:%d/%s", "127.0.0.1", Integer.valueOf(this.e), w60.b(str));
    }

    private void c(Socket socket) {
        try {
            if (socket.isInputShutdown()) {
                return;
            }
            socket.shutdownInput();
        } catch (SocketException unused) {
            i50.d("Releasing input stream… Socket is closed by client.");
        } catch (IOException e) {
            a(new v60("Error closing socket input stream", e));
        }
    }

    private File d(String str) {
        k60 k60Var = this.g;
        return new File(k60Var.a, k60Var.b.a(str));
    }

    private void d(Socket socket) {
        try {
            if (socket.isOutputShutdown()) {
                return;
            }
            socket.shutdownOutput();
        } catch (IOException e) {
            i50.c("Failed to close socket on proxy side: {}. It seems client have already closed connection.", e.getMessage());
        }
    }

    private o60 e(String str) {
        o60 o60Var;
        synchronized (this.a) {
            o60Var = this.c.get(str);
            if (o60Var == null) {
                o60Var = new o60(str, this.g);
                this.c.put(str, o60Var);
            }
        }
        return o60Var;
    }

    private void e(Socket socket) {
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.close();
        } catch (IOException e) {
            a(new v60("Error closing socket", e));
        }
    }

    public String a(String str) {
        return a(str, true);
    }

    public String a(String str, boolean z) {
        if (!z || !b(str)) {
            return a() ? c(str) : str;
        }
        File d2 = d(str);
        a(d2);
        return Uri.fromFile(d2).toString();
    }

    public boolean b(String str) {
        t60.a(str, "Url can't be null!");
        return d(str).exists();
    }
}
