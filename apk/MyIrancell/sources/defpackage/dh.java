package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.g;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.l;
import defpackage.dh;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class dh<T extends dh<T>> implements Cloneable {
    private boolean A;
    private int b;
    private Drawable f;
    private int g;
    private Drawable h;
    private int i;
    private boolean n;
    private Drawable p;
    private int q;
    private boolean u;
    private Resources.Theme v;
    private boolean w;
    private boolean x;
    private boolean y;
    private float c = 1.0f;
    private jb d = jb.c;
    private g e = g.NORMAL;
    private boolean j = true;
    private int k = -1;
    private int l = -1;
    private com.bumptech.glide.load.g m = yh.a();
    private boolean o = true;
    private i r = new i();
    private Map<Class<?>, l<?>> s = new bi();
    private Class<?> t = Object.class;
    private boolean z = true;

    private T K() {
        return this;
    }

    private T L() {
        if (this.u) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        K();
        return this;
    }

    private T a(pe peVar, l<Bitmap> lVar, boolean z) {
        T b = z ? b(peVar, lVar) : a(peVar, lVar);
        b.z = true;
        return b;
    }

    private boolean a(int i) {
        return b(this.b, i);
    }

    private static boolean b(int i, int i2) {
        return (i & i2) != 0;
    }

    private T c(pe peVar, l<Bitmap> lVar) {
        return a(peVar, lVar, false);
    }

    private T d(pe peVar, l<Bitmap> lVar) {
        return a(peVar, lVar, true);
    }

    public final boolean A() {
        return a(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean B() {
        return this.z;
    }

    public final boolean C() {
        return this.o;
    }

    public final boolean D() {
        return this.n;
    }

    public final boolean E() {
        return a(2048);
    }

    public final boolean F() {
        return ki.b(this.l, this.k);
    }

    public T G() {
        this.u = true;
        K();
        return this;
    }

    public T H() {
        return a(pe.b, new me());
    }

    public T I() {
        return c(pe.c, new ne());
    }

    public T J() {
        return c(pe.a, new ue());
    }

    public T a() {
        if (this.u && !this.w) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.w = true;
        G();
        return this;
    }

    public T a(float f) {
        if (this.w) {
            return (T) mo1clone().a(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.c = f;
        this.b |= 2;
        L();
        return this;
    }

    public T a(int i, int i2) {
        if (this.w) {
            return (T) mo1clone().a(i, i2);
        }
        this.l = i;
        this.k = i2;
        this.b |= 512;
        L();
        return this;
    }

    public T a(g gVar) {
        if (this.w) {
            return (T) mo1clone().a(gVar);
        }
        ji.a(gVar);
        this.e = gVar;
        this.b |= 8;
        L();
        return this;
    }

    public T a(com.bumptech.glide.load.g gVar) {
        if (this.w) {
            return (T) mo1clone().a(gVar);
        }
        ji.a(gVar);
        this.m = gVar;
        this.b |= 1024;
        L();
        return this;
    }

    public <Y> T a(h<Y> hVar, Y y) {
        if (this.w) {
            return (T) mo1clone().a(hVar, y);
        }
        ji.a(hVar);
        ji.a(y);
        this.r.a(hVar, y);
        L();
        return this;
    }

    public T a(l<Bitmap> lVar) {
        return a(lVar, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    T a(l<Bitmap> lVar, boolean z) {
        if (this.w) {
            return (T) mo1clone().a(lVar, z);
        }
        se seVar = new se(lVar, z);
        a(Bitmap.class, lVar, z);
        a(Drawable.class, seVar, z);
        seVar.a();
        a(BitmapDrawable.class, seVar, z);
        a(of.class, new rf(lVar), z);
        L();
        return this;
    }

    public T a(dh<?> dhVar) {
        if (this.w) {
            return (T) mo1clone().a(dhVar);
        }
        if (b(dhVar.b, 2)) {
            this.c = dhVar.c;
        }
        if (b(dhVar.b, 262144)) {
            this.x = dhVar.x;
        }
        if (b(dhVar.b, 1048576)) {
            this.A = dhVar.A;
        }
        if (b(dhVar.b, 4)) {
            this.d = dhVar.d;
        }
        if (b(dhVar.b, 8)) {
            this.e = dhVar.e;
        }
        if (b(dhVar.b, 16)) {
            this.f = dhVar.f;
            this.g = 0;
            this.b &= -33;
        }
        if (b(dhVar.b, 32)) {
            this.g = dhVar.g;
            this.f = null;
            this.b &= -17;
        }
        if (b(dhVar.b, 64)) {
            this.h = dhVar.h;
            this.i = 0;
            this.b &= -129;
        }
        if (b(dhVar.b, 128)) {
            this.i = dhVar.i;
            this.h = null;
            this.b &= -65;
        }
        if (b(dhVar.b, 256)) {
            this.j = dhVar.j;
        }
        if (b(dhVar.b, 512)) {
            this.l = dhVar.l;
            this.k = dhVar.k;
        }
        if (b(dhVar.b, 1024)) {
            this.m = dhVar.m;
        }
        if (b(dhVar.b, 4096)) {
            this.t = dhVar.t;
        }
        if (b(dhVar.b, 8192)) {
            this.p = dhVar.p;
            this.q = 0;
            this.b &= -16385;
        }
        if (b(dhVar.b, 16384)) {
            this.q = dhVar.q;
            this.p = null;
            this.b &= -8193;
        }
        if (b(dhVar.b, 32768)) {
            this.v = dhVar.v;
        }
        if (b(dhVar.b, 65536)) {
            this.o = dhVar.o;
        }
        if (b(dhVar.b, 131072)) {
            this.n = dhVar.n;
        }
        if (b(dhVar.b, 2048)) {
            this.s.putAll(dhVar.s);
            this.z = dhVar.z;
        }
        if (b(dhVar.b, 524288)) {
            this.y = dhVar.y;
        }
        if (!this.o) {
            this.s.clear();
            int i = this.b & (-2049);
            this.b = i;
            this.n = false;
            this.b = i & (-131073);
            this.z = true;
        }
        this.b |= dhVar.b;
        this.r.a(dhVar.r);
        L();
        return this;
    }

    public T a(Class<?> cls) {
        if (this.w) {
            return (T) mo1clone().a(cls);
        }
        ji.a(cls);
        this.t = cls;
        this.b |= 4096;
        L();
        return this;
    }

    <Y> T a(Class<Y> cls, l<Y> lVar, boolean z) {
        if (this.w) {
            return (T) mo1clone().a(cls, lVar, z);
        }
        ji.a(cls);
        ji.a(lVar);
        this.s.put(cls, lVar);
        int i = this.b | 2048;
        this.b = i;
        this.o = true;
        int i2 = i | 65536;
        this.b = i2;
        this.z = false;
        if (z) {
            this.b = i2 | 131072;
            this.n = true;
        }
        L();
        return this;
    }

    public T a(jb jbVar) {
        if (this.w) {
            return (T) mo1clone().a(jbVar);
        }
        ji.a(jbVar);
        this.d = jbVar;
        this.b |= 4;
        L();
        return this;
    }

    public T a(pe peVar) {
        h hVar = pe.f;
        ji.a(peVar);
        return a((h<h>) hVar, (h) peVar);
    }

    final T a(pe peVar, l<Bitmap> lVar) {
        if (this.w) {
            return (T) mo1clone().a(peVar, lVar);
        }
        a(peVar);
        return a(lVar, false);
    }

    public T a(boolean z) {
        if (this.w) {
            return (T) mo1clone().a(true);
        }
        this.j = !z;
        this.b |= 256;
        L();
        return this;
    }

    public T b() {
        return d(pe.c, new ne());
    }

    final T b(pe peVar, l<Bitmap> lVar) {
        if (this.w) {
            return (T) mo1clone().b(peVar, lVar);
        }
        a(peVar);
        return a(lVar);
    }

    public T b(boolean z) {
        if (this.w) {
            return (T) mo1clone().b(z);
        }
        this.A = z;
        this.b |= 1048576;
        L();
        return this;
    }

    public final jb c() {
        return this.d;
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public T mo1clone() {
        try {
            T t = (T) super.clone();
            i iVar = new i();
            t.r = iVar;
            iVar.a(this.r);
            bi biVar = new bi();
            t.s = biVar;
            biVar.putAll(this.s);
            t.u = false;
            t.w = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof dh)) {
            return false;
        }
        dh dhVar = (dh) obj;
        return Float.compare(dhVar.c, this.c) == 0 && this.g == dhVar.g && ki.b(this.f, dhVar.f) && this.i == dhVar.i && ki.b(this.h, dhVar.h) && this.q == dhVar.q && ki.b(this.p, dhVar.p) && this.j == dhVar.j && this.k == dhVar.k && this.l == dhVar.l && this.n == dhVar.n && this.o == dhVar.o && this.x == dhVar.x && this.y == dhVar.y && this.d.equals(dhVar.d) && this.e == dhVar.e && this.r.equals(dhVar.r) && this.s.equals(dhVar.s) && this.t.equals(dhVar.t) && ki.b(this.m, dhVar.m) && ki.b(this.v, dhVar.v);
    }

    public final int g() {
        return this.g;
    }

    public final Drawable h() {
        return this.f;
    }

    public int hashCode() {
        return ki.a(this.v, ki.a(this.m, ki.a(this.t, ki.a(this.s, ki.a(this.r, ki.a(this.e, ki.a(this.d, ki.a(this.y, ki.a(this.x, ki.a(this.o, ki.a(this.n, ki.a(this.l, ki.a(this.k, ki.a(this.j, ki.a(this.p, ki.a(this.q, ki.a(this.h, ki.a(this.i, ki.a(this.f, ki.a(this.g, ki.a(this.c)))))))))))))))))))));
    }

    public final Drawable j() {
        return this.p;
    }

    public final int k() {
        return this.q;
    }

    public final boolean l() {
        return this.y;
    }

    public final i m() {
        return this.r;
    }

    public final int n() {
        return this.k;
    }

    public final int o() {
        return this.l;
    }

    public final Drawable p() {
        return this.h;
    }

    public final int q() {
        return this.i;
    }

    public final g r() {
        return this.e;
    }

    public final Class<?> s() {
        return this.t;
    }

    public final com.bumptech.glide.load.g t() {
        return this.m;
    }

    public final float u() {
        return this.c;
    }

    public final Resources.Theme v() {
        return this.v;
    }

    public final Map<Class<?>, l<?>> w() {
        return this.s;
    }

    public final boolean x() {
        return this.A;
    }

    public final boolean y() {
        return this.x;
    }

    public final boolean z() {
        return this.j;
    }
}
