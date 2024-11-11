package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C0564i;
import com.bumptech.glide.C0565j;
import com.bumptech.glide.ComponentCallbacks2C0558c;
import com.bumptech.glide.load.InterfaceC0573g;
import com.bumptech.glide.load.InterfaceC0578l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sf */
/* loaded from: classes.dex */
public class C3208sf {

    /* renamed from: a */
    private final InterfaceC0513ca f13093a;

    /* renamed from: b */
    private final Handler f13094b;

    /* renamed from: c */
    private final List<b> f13095c;

    /* renamed from: d */
    final C0565j f13096d;

    /* renamed from: e */
    private final InterfaceC2427ec f13097e;

    /* renamed from: f */
    private boolean f13098f;

    /* renamed from: g */
    private boolean f13099g;

    /* renamed from: h */
    private boolean f13100h;

    /* renamed from: i */
    private C0564i<Bitmap> f13101i;

    /* renamed from: j */
    private a f13102j;

    /* renamed from: k */
    private boolean f13103k;

    /* renamed from: l */
    private a f13104l;

    /* renamed from: m */
    private Bitmap f13105m;

    /* renamed from: n */
    private a f13106n;

    /* renamed from: o */
    private d f13107o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sf$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC3166rh<Bitmap> {

        /* renamed from: d */
        private final Handler f13108d;

        /* renamed from: e */
        final int f13109e;

        /* renamed from: f */
        private final long f13110f;

        /* renamed from: g */
        private Bitmap f13111g;

        a(Handler handler, int i, long j) {
            this.f13108d = handler;
            this.f13109e = i;
            this.f13110f = j;
        }

        /* renamed from: a */
        public void m15428a(Bitmap bitmap, InterfaceC3398wh<? super Bitmap> interfaceC3398wh) {
            this.f13111g = bitmap;
            this.f13108d.sendMessageAtTime(this.f13108d.obtainMessage(1, this), this.f13110f);
        }

        @Override // p000.InterfaceC3262th
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo14754a(Object obj, InterfaceC3398wh interfaceC3398wh) {
            m15428a((Bitmap) obj, (InterfaceC3398wh<? super Bitmap>) interfaceC3398wh);
        }

        /* renamed from: e */
        Bitmap m15429e() {
            return this.f13111g;
        }
    }

    /* renamed from: sf$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo14507a();
    }

    /* renamed from: sf$c */
    /* loaded from: classes.dex */
    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C3208sf.this.m15417a((a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            C3208sf.this.f13096d.m3933a((a) message.obj);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sf$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void m15430a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3208sf(ComponentCallbacks2C0558c componentCallbacks2C0558c, InterfaceC0513ca interfaceC0513ca, int i, int i2, InterfaceC0578l<Bitmap> interfaceC0578l, Bitmap bitmap) {
        this(componentCallbacks2C0558c.m3877c(), ComponentCallbacks2C0558c.m3869e(componentCallbacks2C0558c.m3879e()), interfaceC0513ca, null, m15408a(ComponentCallbacks2C0558c.m3869e(componentCallbacks2C0558c.m3879e()), i, i2), interfaceC0578l, bitmap);
    }

    C3208sf(InterfaceC2427ec interfaceC2427ec, C0565j c0565j, InterfaceC0513ca interfaceC0513ca, Handler handler, C0564i<Bitmap> c0564i, InterfaceC0578l<Bitmap> interfaceC0578l, Bitmap bitmap) {
        this.f13095c = new ArrayList();
        this.f13096d = c0565j;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f13097e = interfaceC2427ec;
        this.f13094b = handler;
        this.f13101i = c0564i;
        this.f13093a = interfaceC0513ca;
        m15416a(interfaceC0578l, bitmap);
    }

    /* renamed from: a */
    private static C0564i<Bitmap> m15408a(C0565j c0565j, int i, int i2) {
        return c0565j.m3939e().mo3921a((AbstractC2389dh<?>) C2595ih.m12457b(AbstractC2809jb.f11499a).m11403b(true).m11400a(true).m11389a(i, i2));
    }

    /* renamed from: j */
    private static InterfaceC0573g m15409j() {
        return new C3529zh(Double.valueOf(Math.random()));
    }

    /* renamed from: k */
    private int m15410k() {
        return C2861ki.m13719a(m15421c().getWidth(), m15421c().getHeight(), m15421c().getConfig());
    }

    /* renamed from: l */
    private void m15411l() {
        if (!this.f13098f || this.f13099g) {
            return;
        }
        if (this.f13100h) {
            C2816ji.m13463a(this.f13106n == null, "Pending target must be null when starting from the first frame");
            this.f13093a.mo3627h();
            this.f13100h = false;
        }
        a aVar = this.f13106n;
        if (aVar != null) {
            this.f13106n = null;
            m15417a(aVar);
            return;
        }
        this.f13099g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f13093a.mo3624e();
        this.f13093a.mo3622c();
        this.f13104l = new a(this.f13094b, this.f13093a.mo3619a(), uptimeMillis);
        C0564i<Bitmap> mo3921a = this.f13101i.mo3921a((AbstractC2389dh<?>) C2595ih.m12455b(m15409j()));
        mo3921a.m3923a(this.f13093a);
        mo3921a.m3925a((C0564i<Bitmap>) this.f13104l);
    }

    /* renamed from: m */
    private void m15412m() {
        Bitmap bitmap = this.f13105m;
        if (bitmap != null) {
            this.f13097e.mo11591a(bitmap);
            this.f13105m = null;
        }
    }

    /* renamed from: n */
    private void m15413n() {
        if (this.f13098f) {
            return;
        }
        this.f13098f = true;
        this.f13103k = false;
        m15411l();
    }

    /* renamed from: o */
    private void m15414o() {
        this.f13098f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15415a() {
        this.f13095c.clear();
        m15412m();
        m15414o();
        a aVar = this.f13102j;
        if (aVar != null) {
            this.f13096d.m3933a(aVar);
            this.f13102j = null;
        }
        a aVar2 = this.f13104l;
        if (aVar2 != null) {
            this.f13096d.m3933a(aVar2);
            this.f13104l = null;
        }
        a aVar3 = this.f13106n;
        if (aVar3 != null) {
            this.f13096d.m3933a(aVar3);
            this.f13106n = null;
        }
        this.f13093a.clear();
        this.f13103k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15416a(InterfaceC0578l<Bitmap> interfaceC0578l, Bitmap bitmap) {
        C2816ji.m13459a(interfaceC0578l);
        C2816ji.m13459a(bitmap);
        this.f13105m = bitmap;
        this.f13101i = this.f13101i.mo3921a((AbstractC2389dh<?>) new C2595ih().m11393a(interfaceC0578l));
    }

    /* renamed from: a */
    void m15417a(a aVar) {
        d dVar = this.f13107o;
        if (dVar != null) {
            dVar.m15430a();
        }
        this.f13099g = false;
        if (this.f13103k) {
            this.f13094b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f13098f) {
            this.f13106n = aVar;
            return;
        }
        if (aVar.m15429e() != null) {
            m15412m();
            a aVar2 = this.f13102j;
            this.f13102j = aVar;
            for (int size = this.f13095c.size() - 1; size >= 0; size--) {
                this.f13095c.get(size).mo14507a();
            }
            if (aVar2 != null) {
                this.f13094b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        m15411l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15418a(b bVar) {
        if (this.f13103k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f13095c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = this.f13095c.isEmpty();
        this.f13095c.add(bVar);
        if (isEmpty) {
            m15413n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ByteBuffer m15419b() {
        return this.f13093a.mo3626g().asReadOnlyBuffer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m15420b(b bVar) {
        this.f13095c.remove(bVar);
        if (this.f13095c.isEmpty()) {
            m15414o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Bitmap m15421c() {
        a aVar = this.f13102j;
        return aVar != null ? aVar.m15429e() : this.f13105m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m15422d() {
        a aVar = this.f13102j;
        if (aVar != null) {
            return aVar.f13109e;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Bitmap m15423e() {
        return this.f13105m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m15424f() {
        return this.f13093a.mo3623d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m15425g() {
        return m15421c().getHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m15426h() {
        return this.f13093a.mo3625f() + m15410k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m15427i() {
        return m15421c().getWidth();
    }
}
