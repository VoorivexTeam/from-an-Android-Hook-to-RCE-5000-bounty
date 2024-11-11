package defpackage;

import com.bumptech.glide.load.g;

/* loaded from: classes.dex */
class pb<Z> implements vb<Z> {
    private final boolean b;
    private final boolean c;
    private final vb<Z> d;
    private a e;
    private g f;
    private int g;
    private boolean h;

    /* loaded from: classes.dex */
    interface a {
        void a(g gVar, pb<?> pbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public pb(vb<Z> vbVar, boolean z, boolean z2) {
        ji.a(vbVar);
        this.d = vbVar;
        this.b = z;
        this.c = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a() {
        if (this.h) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.g++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(g gVar, a aVar) {
        this.f = gVar;
        this.e = aVar;
    }

    @Override // defpackage.vb
    public synchronized void b() {
        if (this.g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.h) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.h = true;
        if (this.c) {
            this.d.b();
        }
    }

    @Override // defpackage.vb
    public int c() {
        return this.d.c();
    }

    @Override // defpackage.vb
    public Class<Z> d() {
        return this.d.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public vb<Z> e() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        synchronized (this.e) {
            synchronized (this) {
                if (this.g <= 0) {
                    throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
                }
                int i = this.g - 1;
                this.g = i;
                if (i == 0) {
                    this.e.a(this.f, this);
                }
            }
        }
    }

    @Override // defpackage.vb
    public Z get() {
        return this.d.get();
    }

    public synchronized String toString() {
        return "EngineResource{isCacheable=" + this.b + ", listener=" + this.e + ", key=" + this.f + ", acquired=" + this.g + ", isRecycled=" + this.h + ", resource=" + this.d + '}';
    }
}
