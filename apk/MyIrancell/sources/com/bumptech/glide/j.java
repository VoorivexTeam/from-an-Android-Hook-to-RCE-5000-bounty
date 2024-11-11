package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import defpackage.dh;
import defpackage.fg;
import defpackage.fh;
import defpackage.gg;
import defpackage.hh;
import defpackage.ih;
import defpackage.jb;
import defpackage.kg;
import defpackage.ki;
import defpackage.lg;
import defpackage.of;
import defpackage.pg;
import defpackage.qg;
import defpackage.sg;
import defpackage.th;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class j implements lg {
    private static final ih l;
    protected final c a;
    protected final Context b;
    final kg c;
    private final qg d;
    private final pg e;
    private final sg f;
    private final Runnable g;
    private final Handler h;
    private final fg i;
    private final CopyOnWriteArrayList<hh<Object>> j;
    private ih k;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            jVar.c.a(jVar);
        }
    }

    /* loaded from: classes.dex */
    private class b implements fg.a {
        private final qg a;

        b(qg qgVar) {
            this.a = qgVar;
        }

        @Override // fg.a
        public void a(boolean z) {
            if (z) {
                synchronized (j.this) {
                    this.a.c();
                }
            }
        }
    }

    static {
        ih b2 = ih.b((Class<?>) Bitmap.class);
        b2.G();
        l = b2;
        ih.b((Class<?>) of.class).G();
        ih.b(jb.b).a(g.LOW).a(true);
    }

    public j(c cVar, kg kgVar, pg pgVar, Context context) {
        this(cVar, kgVar, pgVar, new qg(), cVar.d(), context);
    }

    j(c cVar, kg kgVar, pg pgVar, qg qgVar, gg ggVar, Context context) {
        this.f = new sg();
        this.g = new a();
        this.h = new Handler(Looper.getMainLooper());
        this.a = cVar;
        this.c = kgVar;
        this.e = pgVar;
        this.d = qgVar;
        this.b = context;
        this.i = ggVar.a(context.getApplicationContext(), new b(qgVar));
        if (ki.b()) {
            this.h.post(this.g);
        } else {
            kgVar.a(this);
        }
        kgVar.a(this.i);
        this.j = new CopyOnWriteArrayList<>(cVar.f().b());
        a(cVar.f().c());
        cVar.a(this);
    }

    private void c(th<?> thVar) {
        if (b(thVar) || this.a.a(thVar) || thVar.c() == null) {
            return;
        }
        fh c = thVar.c();
        thVar.a((fh) null);
        c.clear();
    }

    public <ResourceType> i<ResourceType> a(Class<ResourceType> cls) {
        return new i<>(this.a, this, cls, this.b);
    }

    public i<Drawable> a(String str) {
        i<Drawable> f = f();
        f.a(str);
        return f;
    }

    @Override // defpackage.lg
    public synchronized void a() {
        j();
        this.f.a();
    }

    protected synchronized void a(ih ihVar) {
        ih mo1clone = ihVar.mo1clone();
        mo1clone.a();
        this.k = mo1clone;
    }

    public synchronized void a(th<?> thVar) {
        if (thVar == null) {
            return;
        }
        c(thVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(th<?> thVar, fh fhVar) {
        this.f.a(thVar);
        this.d.b(fhVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> k<?, T> b(Class<T> cls) {
        return this.a.f().a(cls);
    }

    @Override // defpackage.lg
    public synchronized void b() {
        i();
        this.f.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean b(th<?> thVar) {
        fh c = thVar.c();
        if (c == null) {
            return true;
        }
        if (!this.d.a(c)) {
            return false;
        }
        this.f.b(thVar);
        thVar.a((fh) null);
        return true;
    }

    @Override // defpackage.lg
    public synchronized void d() {
        this.f.d();
        Iterator<th<?>> it = this.f.f().iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        this.f.e();
        this.d.a();
        this.c.b(this);
        this.c.b(this.i);
        this.h.removeCallbacks(this.g);
        this.a.b(this);
    }

    public i<Bitmap> e() {
        return a(Bitmap.class).a((dh<?>) l);
    }

    public i<Drawable> f() {
        return a(Drawable.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<hh<Object>> g() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ih h() {
        return this.k;
    }

    public synchronized void i() {
        this.d.b();
    }

    public synchronized void j() {
        this.d.d();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.d + ", treeNode=" + this.e + "}";
    }
}
