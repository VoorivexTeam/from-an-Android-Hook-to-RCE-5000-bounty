package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.i;
import com.bumptech.glide.j;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class sf {
    private final ca a;
    private final Handler b;
    private final List<b> c;
    final j d;
    private final ec e;
    private boolean f;
    private boolean g;
    private boolean h;
    private i<Bitmap> i;
    private a j;
    private boolean k;
    private a l;
    private Bitmap m;
    private a n;
    private d o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends rh<Bitmap> {
        private final Handler d;
        final int e;
        private final long f;
        private Bitmap g;

        a(Handler handler, int i, long j) {
            this.d = handler;
            this.e = i;
            this.f = j;
        }

        public void a(Bitmap bitmap, wh<? super Bitmap> whVar) {
            this.g = bitmap;
            this.d.sendMessageAtTime(this.d.obtainMessage(1, this), this.f);
        }

        @Override // defpackage.th
        public /* bridge */ /* synthetic */ void a(Object obj, wh whVar) {
            a((Bitmap) obj, (wh<? super Bitmap>) whVar);
        }

        Bitmap e() {
            return this.g;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                sf.this.a((a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            sf.this.d.a((a) message.obj);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public sf(com.bumptech.glide.c cVar, ca caVar, int i, int i2, l<Bitmap> lVar, Bitmap bitmap) {
        this(cVar.c(), com.bumptech.glide.c.e(cVar.e()), caVar, null, a(com.bumptech.glide.c.e(cVar.e()), i, i2), lVar, bitmap);
    }

    sf(ec ecVar, j jVar, ca caVar, Handler handler, i<Bitmap> iVar, l<Bitmap> lVar, Bitmap bitmap) {
        this.c = new ArrayList();
        this.d = jVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.e = ecVar;
        this.b = handler;
        this.i = iVar;
        this.a = caVar;
        a(lVar, bitmap);
    }

    private static i<Bitmap> a(j jVar, int i, int i2) {
        return jVar.e().a((dh<?>) ih.b(jb.a).b(true).a(true).a(i, i2));
    }

    private static g j() {
        return new zh(Double.valueOf(Math.random()));
    }

    private int k() {
        return ki.a(c().getWidth(), c().getHeight(), c().getConfig());
    }

    private void l() {
        if (!this.f || this.g) {
            return;
        }
        if (this.h) {
            ji.a(this.n == null, "Pending target must be null when starting from the first frame");
            this.a.h();
            this.h = false;
        }
        a aVar = this.n;
        if (aVar != null) {
            this.n = null;
            a(aVar);
            return;
        }
        this.g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.a.e();
        this.a.c();
        this.l = new a(this.b, this.a.a(), uptimeMillis);
        i<Bitmap> a2 = this.i.a((dh<?>) ih.b(j()));
        a2.a(this.a);
        a2.a((i<Bitmap>) this.l);
    }

    private void m() {
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.e.a(bitmap);
            this.m = null;
        }
    }

    private void n() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.k = false;
        l();
    }

    private void o() {
        this.f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.c.clear();
        m();
        o();
        a aVar = this.j;
        if (aVar != null) {
            this.d.a(aVar);
            this.j = null;
        }
        a aVar2 = this.l;
        if (aVar2 != null) {
            this.d.a(aVar2);
            this.l = null;
        }
        a aVar3 = this.n;
        if (aVar3 != null) {
            this.d.a(aVar3);
            this.n = null;
        }
        this.a.clear();
        this.k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(l<Bitmap> lVar, Bitmap bitmap) {
        ji.a(lVar);
        ji.a(bitmap);
        this.m = bitmap;
        this.i = this.i.a((dh<?>) new ih().a(lVar));
    }

    void a(a aVar) {
        d dVar = this.o;
        if (dVar != null) {
            dVar.a();
        }
        this.g = false;
        if (this.k) {
            this.b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f) {
            this.n = aVar;
            return;
        }
        if (aVar.e() != null) {
            m();
            a aVar2 = this.j;
            this.j = aVar;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                this.c.get(size).a();
            }
            if (aVar2 != null) {
                this.b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(b bVar) {
        if (this.k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = this.c.isEmpty();
        this.c.add(bVar);
        if (isEmpty) {
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteBuffer b() {
        return this.a.g().asReadOnlyBuffer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(b bVar) {
        this.c.remove(bVar);
        if (this.c.isEmpty()) {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap c() {
        a aVar = this.j;
        return aVar != null ? aVar.e() : this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        a aVar = this.j;
        if (aVar != null) {
            return aVar.e;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap e() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.a.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return c().getHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return this.a.f() + k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return c().getWidth();
    }
}
