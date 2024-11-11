package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o60 {
    private final String b;
    private volatile m60 c;
    private final f60 e;
    private final k60 f;
    private final AtomicInteger a = new AtomicInteger(0);
    private final List<f60> d = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    private static final class a extends Handler implements f60 {
        private final String a;
        private final List<f60> b;

        public a(String str, List<f60> list) {
            super(Looper.getMainLooper());
            this.a = str;
            this.b = list;
        }

        @Override // defpackage.f60
        public void a(File file, String str, int i) {
            Message obtainMessage = obtainMessage();
            obtainMessage.arg1 = i;
            obtainMessage.obj = file;
            sendMessage(obtainMessage);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Iterator<f60> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().a((File) message.obj, this.a, message.arg1);
            }
        }
    }

    public o60(String str, k60 k60Var) {
        t60.a(str);
        this.b = str;
        t60.a(k60Var);
        this.f = k60Var;
        this.e = new a(str, this.d);
    }

    private synchronized void b() {
        this.c = this.c == null ? d() : this.c;
    }

    private synchronized void c() {
        if (this.a.decrementAndGet() <= 0) {
            this.c.a();
            this.c = null;
        }
    }

    private m60 d() {
        String str = this.b;
        k60 k60Var = this.f;
        m60 m60Var = new m60(new p60(str, k60Var.d, k60Var.e), new v50(this.f.a(this.b), this.f.c));
        m60Var.a(this.e);
        return m60Var;
    }

    public int a() {
        return this.a.get();
    }

    public void a(l60 l60Var, Socket socket) {
        b();
        try {
            this.a.incrementAndGet();
            this.c.a(l60Var, socket);
        } finally {
            c();
        }
    }
}
