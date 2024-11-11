package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import defpackage.jq;

/* loaded from: classes.dex */
public final class k<L> {
    private final c a;
    private volatile L b;
    private final a<L> c;

    /* loaded from: classes.dex */
    public static final class a<L> {
        private final L a;
        private final String b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(L l, String str) {
            this.a = l;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public interface b<L> {
        void a();

        void a(L l);
    }

    /* loaded from: classes.dex */
    private final class c extends jq {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            com.google.android.gms.common.internal.u.a(message.what == 1);
            k.this.b((b) message.obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Looper looper, L l, String str) {
        this.a = new c(looper);
        com.google.android.gms.common.internal.u.a(l, "Listener must not be null");
        this.b = l;
        com.google.android.gms.common.internal.u.b(str);
        this.c = new a<>(l, str);
    }

    public final void a() {
        this.b = null;
    }

    public final void a(b<? super L> bVar) {
        com.google.android.gms.common.internal.u.a(bVar, "Notifier must not be null");
        this.a.sendMessage(this.a.obtainMessage(1, bVar));
    }

    public final a<L> b() {
        return this.c;
    }

    final void b(b<? super L> bVar) {
        L l = this.b;
        if (l == null) {
            bVar.a();
            return;
        }
        try {
            bVar.a(l);
        } catch (RuntimeException e) {
            bVar.a();
            throw e;
        }
    }
}
