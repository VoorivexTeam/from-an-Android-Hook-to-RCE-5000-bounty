package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.C1057u;
import p000.HandlerC2824jq;

/* renamed from: com.google.android.gms.common.api.internal.k */
/* loaded from: classes.dex */
public final class C0915k<L> {

    /* renamed from: a */
    private final c f5873a;

    /* renamed from: b */
    private volatile L f5874b;

    /* renamed from: c */
    private final a<L> f5875c;

    /* renamed from: com.google.android.gms.common.api.internal.k$a */
    /* loaded from: classes.dex */
    public static final class a<L> {

        /* renamed from: a */
        private final L f5876a;

        /* renamed from: b */
        private final String f5877b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(L l, String str) {
            this.f5876a = l;
            this.f5877b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5876a == aVar.f5876a && this.f5877b.equals(aVar.f5877b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f5876a) * 31) + this.f5877b.hashCode();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.k$b */
    /* loaded from: classes.dex */
    public interface b<L> {
        /* renamed from: a */
        void mo6791a();

        /* renamed from: a */
        void mo6792a(L l);
    }

    /* renamed from: com.google.android.gms.common.api.internal.k$c */
    /* loaded from: classes.dex */
    private final class c extends HandlerC2824jq {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1057u.m7293a(message.what == 1);
            C0915k.this.m6790b((b) message.obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0915k(Looper looper, L l, String str) {
        this.f5873a = new c(looper);
        C1057u.m7287a(l, "Listener must not be null");
        this.f5874b = l;
        C1057u.m7296b(str);
        this.f5875c = new a<>(l, str);
    }

    /* renamed from: a */
    public final void m6787a() {
        this.f5874b = null;
    }

    /* renamed from: a */
    public final void m6788a(b<? super L> bVar) {
        C1057u.m7287a(bVar, "Notifier must not be null");
        this.f5873a.sendMessage(this.f5873a.obtainMessage(1, bVar));
    }

    /* renamed from: b */
    public final a<L> m6789b() {
        return this.f5875c;
    }

    /* renamed from: b */
    final void m6790b(b<? super L> bVar) {
        L l = this.f5874b;
        if (l == null) {
            bVar.mo6791a();
            return;
        }
        try {
            bVar.mo6792a(l);
        } catch (RuntimeException e) {
            bVar.mo6791a();
            throw e;
        }
    }
}
