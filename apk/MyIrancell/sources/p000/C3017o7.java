package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.airbnb.lottie.C0537c;
import com.airbnb.lottie.C0538d;
import com.airbnb.lottie.C0540f;
import com.airbnb.lottie.InterfaceC0545k;
import java.util.ArrayList;
import java.util.List;
import p000.C3112q7;

/* renamed from: o7 */
/* loaded from: classes.dex */
public class C3017o7 extends AbstractC2976n7 {

    /* renamed from: A */
    private Paint f12418A;

    /* renamed from: w */
    private AbstractC2538h5<Float, Float> f12419w;

    /* renamed from: x */
    private final List<AbstractC2976n7> f12420x;

    /* renamed from: y */
    private final RectF f12421y;

    /* renamed from: z */
    private final RectF f12422z;

    /* renamed from: o7$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12423a;

        static {
            int[] iArr = new int[C3112q7.b.values().length];
            f12423a = iArr;
            try {
                iArr[C3112q7.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12423a[C3112q7.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C3017o7(C0540f c0540f, C3112q7 c3112q7, List<C3112q7> list, C0538d c0538d) {
        super(c0540f, c3112q7);
        int i;
        AbstractC2976n7 abstractC2976n7;
        this.f12420x = new ArrayList();
        this.f12421y = new RectF();
        this.f12422z = new RectF();
        this.f12418A = new Paint();
        C2801j6 m14976s = c3112q7.m14976s();
        if (m14976s != null) {
            AbstractC2538h5<Float, Float> mo12378a = m14976s.mo12378a();
            this.f12419w = mo12378a;
            m14279a(mo12378a);
            this.f12419w.m12102a(this);
        } else {
            this.f12419w = null;
        }
        C2452f0 c2452f0 = new C2452f0(c0538d.m3739i().size());
        int size = list.size() - 1;
        AbstractC2976n7 abstractC2976n72 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C3112q7 c3112q72 = list.get(size);
            AbstractC2976n7 m14260a = AbstractC2976n7.m14260a(c3112q72, c0540f, c0538d);
            if (m14260a != null) {
                c2452f0.m11656c(m14260a.m14285d().m14959b(), m14260a);
                if (abstractC2976n72 != null) {
                    abstractC2976n72.m14280a(m14260a);
                    abstractC2976n72 = null;
                } else {
                    this.f12420x.add(0, m14260a);
                    int i2 = a.f12423a[c3112q72.m14963f().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        abstractC2976n72 = m14260a;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < c2452f0.m11650b(); i++) {
            AbstractC2976n7 abstractC2976n73 = (AbstractC2976n7) c2452f0.m11655c(c2452f0.m11646a(i));
            if (abstractC2976n73 != null && (abstractC2976n7 = (AbstractC2976n7) c2452f0.m11655c(abstractC2976n73.m14285d().m14965h())) != null) {
                abstractC2976n73.m14284b(abstractC2976n7);
            }
        }
    }

    @Override // p000.AbstractC2976n7
    /* renamed from: a */
    public void mo14278a(float f) {
        super.mo14278a(f);
        if (this.f12419w != null) {
            f = ((this.f12419w.mo12108f().floatValue() * this.f12253o.m14957a().m3737g()) - this.f12253o.m14957a().m3742l()) / (this.f12252n.m3806e().m3734d() + 0.01f);
        }
        if (this.f12253o.m14977t() != 0.0f) {
            f /= this.f12253o.m14977t();
        }
        if (this.f12419w == null) {
            f -= this.f12253o.m14973p();
        }
        for (int size = this.f12420x.size() - 1; size >= 0; size--) {
            this.f12420x.get(size).mo14278a(f);
        }
    }

    @Override // p000.AbstractC2976n7, p000.InterfaceC3190s4
    /* renamed from: a */
    public void mo11276a(RectF rectF, Matrix matrix, boolean z) {
        super.mo11276a(rectF, matrix, z);
        for (int size = this.f12420x.size() - 1; size >= 0; size--) {
            this.f12421y.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f12420x.get(size).mo11276a(this.f12421y, this.f12251m, true);
            rectF.union(this.f12421y);
        }
    }

    @Override // p000.AbstractC2976n7, p000.InterfaceC2418e6
    /* renamed from: a */
    public <T> void mo3320a(T t, C3429x9<T> c3429x9) {
        super.mo3320a((C3017o7) t, (C3429x9<C3017o7>) c3429x9);
        if (t == InterfaceC0545k.f3151A) {
            if (c3429x9 == null) {
                this.f12419w = null;
                return;
            }
            C3385w5 c3385w5 = new C3385w5(c3429x9);
            this.f12419w = c3385w5;
            m14279a(c3385w5);
        }
    }

    @Override // p000.AbstractC2976n7
    /* renamed from: b */
    void mo14281b(Canvas canvas, Matrix matrix, int i) {
        C0537c.m3721a("CompositionLayer#draw");
        this.f12422z.set(0.0f, 0.0f, this.f12253o.m14967j(), this.f12253o.m14966i());
        matrix.mapRect(this.f12422z);
        boolean z = this.f12252n.m3822r() && this.f12420x.size() > 1 && i != 255;
        if (z) {
            this.f12418A.setAlpha(i);
            C3295u9.m15759a(canvas, this.f12422z, this.f12418A);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f12420x.size() - 1; size >= 0; size--) {
            if (!this.f12422z.isEmpty() ? canvas.clipRect(this.f12422z) : true) {
                this.f12420x.get(size).mo11275a(canvas, matrix, i);
            }
        }
        canvas.restore();
        C0537c.m3722b("CompositionLayer#draw");
    }

    @Override // p000.AbstractC2976n7
    /* renamed from: b */
    protected void mo14282b(C2375d6 c2375d6, int i, List<C2375d6> list, C2375d6 c2375d62) {
        for (int i2 = 0; i2 < this.f12420x.size(); i2++) {
            this.f12420x.get(i2).mo3319a(c2375d6, i, list, c2375d62);
        }
    }
}
