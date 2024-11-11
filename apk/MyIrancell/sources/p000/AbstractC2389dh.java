package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.EnumC0562g;
import com.bumptech.glide.load.C0574h;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.InterfaceC0573g;
import com.bumptech.glide.load.InterfaceC0578l;
import java.util.Map;
import p000.AbstractC2389dh;

/* renamed from: dh */
/* loaded from: classes.dex */
public abstract class AbstractC2389dh<T extends AbstractC2389dh<T>> implements Cloneable {

    /* renamed from: A */
    private boolean f9811A;

    /* renamed from: b */
    private int f9812b;

    /* renamed from: f */
    private Drawable f9816f;

    /* renamed from: g */
    private int f9817g;

    /* renamed from: h */
    private Drawable f9818h;

    /* renamed from: i */
    private int f9819i;

    /* renamed from: n */
    private boolean f9824n;

    /* renamed from: p */
    private Drawable f9826p;

    /* renamed from: q */
    private int f9827q;

    /* renamed from: u */
    private boolean f9831u;

    /* renamed from: v */
    private Resources.Theme f9832v;

    /* renamed from: w */
    private boolean f9833w;

    /* renamed from: x */
    private boolean f9834x;

    /* renamed from: y */
    private boolean f9835y;

    /* renamed from: c */
    private float f9813c = 1.0f;

    /* renamed from: d */
    private AbstractC2809jb f9814d = AbstractC2809jb.f11501c;

    /* renamed from: e */
    private EnumC0562g f9815e = EnumC0562g.NORMAL;

    /* renamed from: j */
    private boolean f9820j = true;

    /* renamed from: k */
    private int f9821k = -1;

    /* renamed from: l */
    private int f9822l = -1;

    /* renamed from: m */
    private InterfaceC0573g f9823m = C3487yh.m16629a();

    /* renamed from: o */
    private boolean f9825o = true;

    /* renamed from: r */
    private C0575i f9828r = new C0575i();

    /* renamed from: s */
    private Map<Class<?>, InterfaceC0578l<?>> f9829s = new C0481bi();

    /* renamed from: t */
    private Class<?> f9830t = Object.class;

    /* renamed from: z */
    private boolean f9836z = true;

    /* renamed from: K */
    private T m11370K() {
        return this;
    }

    /* renamed from: L */
    private T m11371L() {
        if (this.f9831u) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        m11370K();
        return this;
    }

    /* renamed from: a */
    private T m11372a(AbstractC3082pe abstractC3082pe, InterfaceC0578l<Bitmap> interfaceC0578l, boolean z) {
        T m11402b = z ? m11402b(abstractC3082pe, interfaceC0578l) : m11399a(abstractC3082pe, interfaceC0578l);
        m11402b.f9836z = true;
        return m11402b;
    }

    /* renamed from: a */
    private boolean m11373a(int i) {
        return m11374b(this.f9812b, i);
    }

    /* renamed from: b */
    private static boolean m11374b(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: c */
    private T m11375c(AbstractC3082pe abstractC3082pe, InterfaceC0578l<Bitmap> interfaceC0578l) {
        return m11372a(abstractC3082pe, interfaceC0578l, false);
    }

    /* renamed from: d */
    private T m11376d(AbstractC3082pe abstractC3082pe, InterfaceC0578l<Bitmap> interfaceC0578l) {
        return m11372a(abstractC3082pe, interfaceC0578l, true);
    }

    /* renamed from: A */
    public final boolean m11377A() {
        return m11373a(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean m11378B() {
        return this.f9836z;
    }

    /* renamed from: C */
    public final boolean m11379C() {
        return this.f9825o;
    }

    /* renamed from: D */
    public final boolean m11380D() {
        return this.f9824n;
    }

    /* renamed from: E */
    public final boolean m11381E() {
        return m11373a(2048);
    }

    /* renamed from: F */
    public final boolean m11382F() {
        return C2861ki.m13732b(this.f9822l, this.f9821k);
    }

    /* renamed from: G */
    public T m11383G() {
        this.f9831u = true;
        m11370K();
        return this;
    }

    /* renamed from: H */
    public T m11384H() {
        return m11399a(AbstractC3082pe.f12596b, new C2940me());
    }

    /* renamed from: I */
    public T m11385I() {
        return m11375c(AbstractC3082pe.f12597c, new C2986ne());
    }

    /* renamed from: J */
    public T m11386J() {
        return m11375c(AbstractC3082pe.f12595a, new C3303ue());
    }

    /* renamed from: a */
    public T m11387a() {
        if (this.f9831u && !this.f9833w) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f9833w = true;
        m11383G();
        return this;
    }

    /* renamed from: a */
    public T m11388a(float f) {
        if (this.f9833w) {
            return (T) mo16979clone().m11388a(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f9813c = f;
        this.f9812b |= 2;
        m11371L();
        return this;
    }

    /* renamed from: a */
    public T m11389a(int i, int i2) {
        if (this.f9833w) {
            return (T) mo16979clone().m11389a(i, i2);
        }
        this.f9822l = i;
        this.f9821k = i2;
        this.f9812b |= 512;
        m11371L();
        return this;
    }

    /* renamed from: a */
    public T m11390a(EnumC0562g enumC0562g) {
        if (this.f9833w) {
            return (T) mo16979clone().m11390a(enumC0562g);
        }
        C2816ji.m13459a(enumC0562g);
        this.f9815e = enumC0562g;
        this.f9812b |= 8;
        m11371L();
        return this;
    }

    /* renamed from: a */
    public T m11391a(InterfaceC0573g interfaceC0573g) {
        if (this.f9833w) {
            return (T) mo16979clone().m11391a(interfaceC0573g);
        }
        C2816ji.m13459a(interfaceC0573g);
        this.f9823m = interfaceC0573g;
        this.f9812b |= 1024;
        m11371L();
        return this;
    }

    /* renamed from: a */
    public <Y> T m11392a(C0574h<Y> c0574h, Y y) {
        if (this.f9833w) {
            return (T) mo16979clone().m11392a(c0574h, y);
        }
        C2816ji.m13459a(c0574h);
        C2816ji.m13459a(y);
        this.f9828r.m3963a(c0574h, y);
        m11371L();
        return this;
    }

    /* renamed from: a */
    public T m11393a(InterfaceC0578l<Bitmap> interfaceC0578l) {
        return m11394a(interfaceC0578l, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    T m11394a(InterfaceC0578l<Bitmap> interfaceC0578l, boolean z) {
        if (this.f9833w) {
            return (T) mo16979clone().m11394a(interfaceC0578l, z);
        }
        C3207se c3207se = new C3207se(interfaceC0578l, z);
        m11396a(Bitmap.class, interfaceC0578l, z);
        m11396a(Drawable.class, c3207se, z);
        c3207se.m15407a();
        m11396a(BitmapDrawable.class, c3207se, z);
        m11396a(C3033of.class, new C3164rf(interfaceC0578l), z);
        m11371L();
        return this;
    }

    /* renamed from: a */
    public T mo3921a(AbstractC2389dh<?> abstractC2389dh) {
        if (this.f9833w) {
            return (T) mo16979clone().mo3921a(abstractC2389dh);
        }
        if (m11374b(abstractC2389dh.f9812b, 2)) {
            this.f9813c = abstractC2389dh.f9813c;
        }
        if (m11374b(abstractC2389dh.f9812b, 262144)) {
            this.f9834x = abstractC2389dh.f9834x;
        }
        if (m11374b(abstractC2389dh.f9812b, 1048576)) {
            this.f9811A = abstractC2389dh.f9811A;
        }
        if (m11374b(abstractC2389dh.f9812b, 4)) {
            this.f9814d = abstractC2389dh.f9814d;
        }
        if (m11374b(abstractC2389dh.f9812b, 8)) {
            this.f9815e = abstractC2389dh.f9815e;
        }
        if (m11374b(abstractC2389dh.f9812b, 16)) {
            this.f9816f = abstractC2389dh.f9816f;
            this.f9817g = 0;
            this.f9812b &= -33;
        }
        if (m11374b(abstractC2389dh.f9812b, 32)) {
            this.f9817g = abstractC2389dh.f9817g;
            this.f9816f = null;
            this.f9812b &= -17;
        }
        if (m11374b(abstractC2389dh.f9812b, 64)) {
            this.f9818h = abstractC2389dh.f9818h;
            this.f9819i = 0;
            this.f9812b &= -129;
        }
        if (m11374b(abstractC2389dh.f9812b, 128)) {
            this.f9819i = abstractC2389dh.f9819i;
            this.f9818h = null;
            this.f9812b &= -65;
        }
        if (m11374b(abstractC2389dh.f9812b, 256)) {
            this.f9820j = abstractC2389dh.f9820j;
        }
        if (m11374b(abstractC2389dh.f9812b, 512)) {
            this.f9822l = abstractC2389dh.f9822l;
            this.f9821k = abstractC2389dh.f9821k;
        }
        if (m11374b(abstractC2389dh.f9812b, 1024)) {
            this.f9823m = abstractC2389dh.f9823m;
        }
        if (m11374b(abstractC2389dh.f9812b, 4096)) {
            this.f9830t = abstractC2389dh.f9830t;
        }
        if (m11374b(abstractC2389dh.f9812b, 8192)) {
            this.f9826p = abstractC2389dh.f9826p;
            this.f9827q = 0;
            this.f9812b &= -16385;
        }
        if (m11374b(abstractC2389dh.f9812b, 16384)) {
            this.f9827q = abstractC2389dh.f9827q;
            this.f9826p = null;
            this.f9812b &= -8193;
        }
        if (m11374b(abstractC2389dh.f9812b, 32768)) {
            this.f9832v = abstractC2389dh.f9832v;
        }
        if (m11374b(abstractC2389dh.f9812b, 65536)) {
            this.f9825o = abstractC2389dh.f9825o;
        }
        if (m11374b(abstractC2389dh.f9812b, 131072)) {
            this.f9824n = abstractC2389dh.f9824n;
        }
        if (m11374b(abstractC2389dh.f9812b, 2048)) {
            this.f9829s.putAll(abstractC2389dh.f9829s);
            this.f9836z = abstractC2389dh.f9836z;
        }
        if (m11374b(abstractC2389dh.f9812b, 524288)) {
            this.f9835y = abstractC2389dh.f9835y;
        }
        if (!this.f9825o) {
            this.f9829s.clear();
            int i = this.f9812b & (-2049);
            this.f9812b = i;
            this.f9824n = false;
            this.f9812b = i & (-131073);
            this.f9836z = true;
        }
        this.f9812b |= abstractC2389dh.f9812b;
        this.f9828r.m3965a(abstractC2389dh.f9828r);
        m11371L();
        return this;
    }

    /* renamed from: a */
    public T m11395a(Class<?> cls) {
        if (this.f9833w) {
            return (T) mo16979clone().m11395a(cls);
        }
        C2816ji.m13459a(cls);
        this.f9830t = cls;
        this.f9812b |= 4096;
        m11371L();
        return this;
    }

    /* renamed from: a */
    <Y> T m11396a(Class<Y> cls, InterfaceC0578l<Y> interfaceC0578l, boolean z) {
        if (this.f9833w) {
            return (T) mo16979clone().m11396a(cls, interfaceC0578l, z);
        }
        C2816ji.m13459a(cls);
        C2816ji.m13459a(interfaceC0578l);
        this.f9829s.put(cls, interfaceC0578l);
        int i = this.f9812b | 2048;
        this.f9812b = i;
        this.f9825o = true;
        int i2 = i | 65536;
        this.f9812b = i2;
        this.f9836z = false;
        if (z) {
            this.f9812b = i2 | 131072;
            this.f9824n = true;
        }
        m11371L();
        return this;
    }

    /* renamed from: a */
    public T m11397a(AbstractC2809jb abstractC2809jb) {
        if (this.f9833w) {
            return (T) mo16979clone().m11397a(abstractC2809jb);
        }
        C2816ji.m13459a(abstractC2809jb);
        this.f9814d = abstractC2809jb;
        this.f9812b |= 4;
        m11371L();
        return this;
    }

    /* renamed from: a */
    public T m11398a(AbstractC3082pe abstractC3082pe) {
        C0574h c0574h = AbstractC3082pe.f12600f;
        C2816ji.m13459a(abstractC3082pe);
        return m11392a((C0574h<C0574h>) c0574h, (C0574h) abstractC3082pe);
    }

    /* renamed from: a */
    final T m11399a(AbstractC3082pe abstractC3082pe, InterfaceC0578l<Bitmap> interfaceC0578l) {
        if (this.f9833w) {
            return (T) mo16979clone().m11399a(abstractC3082pe, interfaceC0578l);
        }
        m11398a(abstractC3082pe);
        return m11394a(interfaceC0578l, false);
    }

    /* renamed from: a */
    public T m11400a(boolean z) {
        if (this.f9833w) {
            return (T) mo16979clone().m11400a(true);
        }
        this.f9820j = !z;
        this.f9812b |= 256;
        m11371L();
        return this;
    }

    /* renamed from: b */
    public T m11401b() {
        return m11376d(AbstractC3082pe.f12597c, new C2986ne());
    }

    /* renamed from: b */
    final T m11402b(AbstractC3082pe abstractC3082pe, InterfaceC0578l<Bitmap> interfaceC0578l) {
        if (this.f9833w) {
            return (T) mo16979clone().m11402b(abstractC3082pe, interfaceC0578l);
        }
        m11398a(abstractC3082pe);
        return m11393a(interfaceC0578l);
    }

    /* renamed from: b */
    public T m11403b(boolean z) {
        if (this.f9833w) {
            return (T) mo16979clone().m11403b(z);
        }
        this.f9811A = z;
        this.f9812b |= 1048576;
        m11371L();
        return this;
    }

    /* renamed from: c */
    public final AbstractC2809jb m11404c() {
        return this.f9814d;
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public T mo16979clone() {
        try {
            T t = (T) super.clone();
            C0575i c0575i = new C0575i();
            t.f9828r = c0575i;
            c0575i.m3965a(this.f9828r);
            C0481bi c0481bi = new C0481bi();
            t.f9829s = c0481bi;
            c0481bi.putAll(this.f9829s);
            t.f9831u = false;
            t.f9833w = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC2389dh)) {
            return false;
        }
        AbstractC2389dh abstractC2389dh = (AbstractC2389dh) obj;
        return Float.compare(abstractC2389dh.f9813c, this.f9813c) == 0 && this.f9817g == abstractC2389dh.f9817g && C2861ki.m13733b(this.f9816f, abstractC2389dh.f9816f) && this.f9819i == abstractC2389dh.f9819i && C2861ki.m13733b(this.f9818h, abstractC2389dh.f9818h) && this.f9827q == abstractC2389dh.f9827q && C2861ki.m13733b(this.f9826p, abstractC2389dh.f9826p) && this.f9820j == abstractC2389dh.f9820j && this.f9821k == abstractC2389dh.f9821k && this.f9822l == abstractC2389dh.f9822l && this.f9824n == abstractC2389dh.f9824n && this.f9825o == abstractC2389dh.f9825o && this.f9834x == abstractC2389dh.f9834x && this.f9835y == abstractC2389dh.f9835y && this.f9814d.equals(abstractC2389dh.f9814d) && this.f9815e == abstractC2389dh.f9815e && this.f9828r.equals(abstractC2389dh.f9828r) && this.f9829s.equals(abstractC2389dh.f9829s) && this.f9830t.equals(abstractC2389dh.f9830t) && C2861ki.m13733b(this.f9823m, abstractC2389dh.f9823m) && C2861ki.m13733b(this.f9832v, abstractC2389dh.f9832v);
    }

    /* renamed from: g */
    public final int m11405g() {
        return this.f9817g;
    }

    /* renamed from: h */
    public final Drawable m11406h() {
        return this.f9816f;
    }

    public int hashCode() {
        return C2861ki.m13722a(this.f9832v, C2861ki.m13722a(this.f9823m, C2861ki.m13722a(this.f9830t, C2861ki.m13722a(this.f9829s, C2861ki.m13722a(this.f9828r, C2861ki.m13722a(this.f9815e, C2861ki.m13722a(this.f9814d, C2861ki.m13723a(this.f9835y, C2861ki.m13723a(this.f9834x, C2861ki.m13723a(this.f9825o, C2861ki.m13723a(this.f9824n, C2861ki.m13718a(this.f9822l, C2861ki.m13718a(this.f9821k, C2861ki.m13723a(this.f9820j, C2861ki.m13722a(this.f9826p, C2861ki.m13718a(this.f9827q, C2861ki.m13722a(this.f9818h, C2861ki.m13718a(this.f9819i, C2861ki.m13722a(this.f9816f, C2861ki.m13718a(this.f9817g, C2861ki.m13716a(this.f9813c)))))))))))))))))))));
    }

    /* renamed from: j */
    public final Drawable m11407j() {
        return this.f9826p;
    }

    /* renamed from: k */
    public final int m11408k() {
        return this.f9827q;
    }

    /* renamed from: l */
    public final boolean m11409l() {
        return this.f9835y;
    }

    /* renamed from: m */
    public final C0575i m11410m() {
        return this.f9828r;
    }

    /* renamed from: n */
    public final int m11411n() {
        return this.f9821k;
    }

    /* renamed from: o */
    public final int m11412o() {
        return this.f9822l;
    }

    /* renamed from: p */
    public final Drawable m11413p() {
        return this.f9818h;
    }

    /* renamed from: q */
    public final int m11414q() {
        return this.f9819i;
    }

    /* renamed from: r */
    public final EnumC0562g m11415r() {
        return this.f9815e;
    }

    /* renamed from: s */
    public final Class<?> m11416s() {
        return this.f9830t;
    }

    /* renamed from: t */
    public final InterfaceC0573g m11417t() {
        return this.f9823m;
    }

    /* renamed from: u */
    public final float m11418u() {
        return this.f9813c;
    }

    /* renamed from: v */
    public final Resources.Theme m11419v() {
        return this.f9832v;
    }

    /* renamed from: w */
    public final Map<Class<?>, InterfaceC0578l<?>> m11420w() {
        return this.f9829s;
    }

    /* renamed from: x */
    public final boolean m11421x() {
        return this.f9811A;
    }

    /* renamed from: y */
    public final boolean m11422y() {
        return this.f9834x;
    }

    /* renamed from: z */
    public final boolean m11423z() {
        return this.f9820j;
    }
}
