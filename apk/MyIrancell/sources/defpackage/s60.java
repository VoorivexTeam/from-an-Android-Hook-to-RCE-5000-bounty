package defpackage;

import java.io.OutputStream;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s60 {
    private final ExecutorService a = Executors.newSingleThreadExecutor();
    private final String b;
    private final int c;

    /* loaded from: classes.dex */
    private class b implements Callable<Boolean> {
        private b() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(s60.this.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s60(String str, int i) {
        t60.a(str);
        this.b = str;
        this.c = i;
    }

    private List<Proxy> a() {
        try {
            return ProxySelector.getDefault().select(new URI(c()));
        } catch (URISyntaxException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        p60 p60Var = new p60(c());
        try {
            byte[] bytes = "ping ok".getBytes();
            p60Var.a(0L);
            byte[] bArr = new byte[bytes.length];
            p60Var.a(bArr);
            boolean equals = Arrays.equals(bytes, bArr);
            i50.b("Ping response: `" + new String(bArr) + "`, pinged? " + equals);
            return equals;
        } catch (v60 e) {
            i50.a("Error reading ping response");
            e.printStackTrace();
            return false;
        } finally {
            p60Var.b();
        }
    }

    private String c() {
        return String.format(Locale.US, "http://%s:%d/%s", this.b, Integer.valueOf(this.c), "ping");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Socket socket) {
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
        outputStream.write("ping ok".getBytes());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(int i, int i2) {
        t60.a(i >= 1);
        t60.a(i2 > 0);
        int i3 = 0;
        while (i3 < i) {
            try {
            } catch (InterruptedException e) {
                e = e;
                i50.a("Error pinging server due to unexpected error");
                e.printStackTrace();
            } catch (ExecutionException e2) {
                e = e2;
                i50.a("Error pinging server due to unexpected error");
                e.printStackTrace();
            } catch (TimeoutException unused) {
                i50.c("Error pinging server (attempt: " + i3 + ", timeout: " + i2 + "). ");
            }
            if (((Boolean) this.a.submit(new b()).get(i2, TimeUnit.MILLISECONDS)).booleanValue()) {
                return true;
            }
            i3++;
            i2 *= 2;
        }
        String format = String.format(Locale.US, "Error pinging server (attempts: %d, max timeout: %d). If you see this message, please, report at https://github.com/danikula/AndroidVideoCache/issues/134. Default proxies are: %s", Integer.valueOf(i3), Integer.valueOf(i2 / 2), a());
        i50.a(format);
        new v60(format).printStackTrace();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        return "ping".equals(str);
    }
}
