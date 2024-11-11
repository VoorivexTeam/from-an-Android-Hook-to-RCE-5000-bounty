package p000;

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

    /* renamed from: b */
    private final String f12411b;

    /* renamed from: c */
    private volatile m60 f12412c;

    /* renamed from: e */
    private final f60 f12414e;

    /* renamed from: f */
    private final k60 f12415f;

    /* renamed from: a */
    private final AtomicInteger f12410a = new AtomicInteger(0);

    /* renamed from: d */
    private final List<f60> f12413d = new CopyOnWriteArrayList();

    /* renamed from: o60$a */
    /* loaded from: classes.dex */
    private static final class HandlerC3016a extends Handler implements f60 {

        /* renamed from: a */
        private final String f12416a;

        /* renamed from: b */
        private final List<f60> f12417b;

        public HandlerC3016a(String str, List<f60> list) {
            super(Looper.getMainLooper());
            this.f12416a = str;
            this.f12417b = list;
        }

        @Override // p000.f60
        /* renamed from: a */
        public void mo11692a(File file, String str, int i) {
            Message obtainMessage = obtainMessage();
            obtainMessage.arg1 = i;
            obtainMessage.obj = file;
            sendMessage(obtainMessage);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Iterator<f60> it = this.f12417b.iterator();
            while (it.hasNext()) {
                it.next().mo11692a((File) message.obj, this.f12416a, message.arg1);
            }
        }
    }

    public o60(String str, k60 k60Var) {
        t60.m15549a(str);
        this.f12411b = str;
        t60.m15549a(k60Var);
        this.f12415f = k60Var;
        this.f12414e = new HandlerC3016a(str, this.f12413d);
    }

    /* renamed from: b */
    private synchronized void m14427b() {
        this.f12412c = this.f12412c == null ? m14429d() : this.f12412c;
    }

    /* renamed from: c */
    private synchronized void m14428c() {
        if (this.f12410a.decrementAndGet() <= 0) {
            this.f12412c.m15734a();
            this.f12412c = null;
        }
    }

    /* renamed from: d */
    private m60 m14429d() {
        String str = this.f12411b;
        k60 k60Var = this.f12415f;
        m60 m60Var = new m60(new p60(str, k60Var.f11654d, k60Var.f11655e), new v50(this.f12415f.m13622a(this.f12411b), this.f12415f.f11653c));
        m60Var.m14054a(this.f12414e);
        return m60Var;
    }

    /* renamed from: a */
    public int m14430a() {
        return this.f12410a.get();
    }

    /* renamed from: a */
    public void m14431a(l60 l60Var, Socket socket) {
        m14427b();
        try {
            this.f12410a.incrementAndGet();
            this.f12412c.m14055a(l60Var, socket);
        } finally {
            m14428c();
        }
    }
}
