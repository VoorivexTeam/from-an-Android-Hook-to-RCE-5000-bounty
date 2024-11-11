package p000;

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

    /* renamed from: a */
    private final ExecutorService f13032a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private final String f13033b;

    /* renamed from: c */
    private final int f13034c;

    /* renamed from: s60$b */
    /* loaded from: classes.dex */
    private class CallableC3194b implements Callable<Boolean> {
        private CallableC3194b() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(s60.this.m15370b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s60(String str, int i) {
        t60.m15549a(str);
        this.f13033b = str;
        this.f13034c = i;
    }

    /* renamed from: a */
    private List<Proxy> m15368a() {
        try {
            return ProxySelector.getDefault().select(new URI(m15371c()));
        } catch (URISyntaxException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public boolean m15370b() {
        p60 p60Var = new p60(m15371c());
        try {
            byte[] bytes = "ping ok".getBytes();
            p60Var.mo14725a(0L);
            byte[] bArr = new byte[bytes.length];
            p60Var.mo14723a(bArr);
            boolean equals = Arrays.equals(bytes, bArr);
            i50.m12372b("Ping response: `" + new String(bArr) + "`, pinged? " + equals);
            return equals;
        } catch (v60 e) {
            i50.m12368a("Error reading ping response");
            e.printStackTrace();
            return false;
        } finally {
            p60Var.mo14726b();
        }
    }

    /* renamed from: c */
    private String m15371c() {
        return String.format(Locale.US, "http://%s:%d/%s", this.f13033b, Integer.valueOf(this.f13034c), "ping");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15372a(Socket socket) {
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
        outputStream.write("ping ok".getBytes());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m15373a(int i, int i2) {
        t60.m15551a(i >= 1);
        t60.m15551a(i2 > 0);
        int i3 = 0;
        while (i3 < i) {
            try {
            } catch (InterruptedException e) {
                e = e;
                i50.m12368a("Error pinging server due to unexpected error");
                e.printStackTrace();
            } catch (ExecutionException e2) {
                e = e2;
                i50.m12368a("Error pinging server due to unexpected error");
                e.printStackTrace();
            } catch (TimeoutException unused) {
                i50.m12374c("Error pinging server (attempt: " + i3 + ", timeout: " + i2 + "). ");
            }
            if (((Boolean) this.f13032a.submit(new CallableC3194b()).get(i2, TimeUnit.MILLISECONDS)).booleanValue()) {
                return true;
            }
            i3++;
            i2 *= 2;
        }
        String format = String.format(Locale.US, "Error pinging server (attempts: %d, max timeout: %d). If you see this message, please, report at https://github.com/danikula/AndroidVideoCache/issues/134. Default proxies are: %s", Integer.valueOf(i3), Integer.valueOf(i2 / 2), m15368a());
        i50.m12368a(format);
        new v60(format).printStackTrace();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m15374a(String str) {
        return "ping".equals(str);
    }
}
