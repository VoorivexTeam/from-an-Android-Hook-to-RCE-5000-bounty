package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.C0537c;
import com.airbnb.lottie.C0540f;
import com.airbnb.lottie.InterfaceC0545k;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC2538h5;
import p000.C2924m7;

/* renamed from: o4 */
/* loaded from: classes.dex */
public abstract class AbstractC3013o4 implements AbstractC2538h5.b, InterfaceC3471y4, InterfaceC3190s4 {

    /* renamed from: e */
    private final C0540f f12395e;

    /* renamed from: f */
    protected final AbstractC2976n7 f12396f;

    /* renamed from: h */
    private final float[] f12398h;

    /* renamed from: i */
    final Paint f12399i;

    /* renamed from: j */
    private final AbstractC2538h5<?, Float> f12400j;

    /* renamed from: k */
    private final AbstractC2538h5<?, Integer> f12401k;

    /* renamed from: l */
    private final List<AbstractC2538h5<?, Float>> f12402l;

    /* renamed from: m */
    private final AbstractC2538h5<?, Float> f12403m;

    /* renamed from: n */
    private AbstractC2538h5<ColorFilter, ColorFilter> f12404n;

    /* renamed from: a */
    private final PathMeasure f12391a = new PathMeasure();

    /* renamed from: b */
    private final Path f12392b = new Path();

    /* renamed from: c */
    private final Path f12393c = new Path();

    /* renamed from: d */
    private final RectF f12394d = new RectF();

    /* renamed from: g */
    private final List<b> f12397g = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o4$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final List<InterfaceC0006a5> f12405a;

        /* renamed from: b */
        private final C2498g5 f12406b;

        private b(C2498g5 c2498g5) {
            this.f12405a = new ArrayList();
            this.f12406b = c2498g5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3013o4(C0540f c0540f, AbstractC2976n7 abstractC2976n7, Paint.Cap cap, Paint.Join join, float f, C2886l6 c2886l6, C2801j6 c2801j6, List<C2801j6> list, C2801j6 c2801j62) {
        C2967n4 c2967n4 = new C2967n4(1);
        this.f12399i = c2967n4;
        this.f12395e = c0540f;
        this.f12396f = abstractC2976n7;
        c2967n4.setStyle(Paint.Style.STROKE);
        this.f12399i.setStrokeCap(cap);
        this.f12399i.setStrokeJoin(join);
        this.f12399i.setStrokeMiter(f);
        this.f12401k = c2886l6.mo12378a();
        this.f12400j = c2801j6.mo12378a();
        this.f12403m = c2801j62 == null ? null : c2801j62.mo12378a();
        this.f12402l = new ArrayList(list.size());
        this.f12398h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f12402l.add(list.get(i).mo12378a());
        }
        abstractC2976n7.m14279a(this.f12401k);
        abstractC2976n7.m14279a(this.f12400j);
        for (int i2 = 0; i2 < this.f12402l.size(); i2++) {
            abstractC2976n7.m14279a(this.f12402l.get(i2));
        }
        AbstractC2538h5<?, Float> abstractC2538h5 = this.f12403m;
        if (abstractC2538h5 != null) {
            abstractC2976n7.m14279a(abstractC2538h5);
        }
        this.f12401k.m12102a(this);
        this.f12400j.m12102a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f12402l.get(i3).m12102a(this);
        }
        AbstractC2538h5<?, Float> abstractC2538h52 = this.f12403m;
        if (abstractC2538h52 != null) {
            abstractC2538h52.m12102a(this);
        }
    }

    /* renamed from: a */
    private void m14421a(Canvas canvas, b bVar, Matrix matrix) {
        float f;
        C0537c.m3721a("StrokeContent#applyTrimPath");
        if (bVar.f12406b == null) {
            C0537c.m3722b("StrokeContent#applyTrimPath");
            return;
        }
        this.f12392b.reset();
        for (int size = bVar.f12405a.size() - 1; size >= 0; size--) {
            this.f12392b.addPath(((InterfaceC0006a5) bVar.f12405a.get(size)).mo49c(), matrix);
        }
        this.f12391a.setPath(this.f12392b, false);
        float length = this.f12391a.getLength();
        while (this.f12391a.nextContour()) {
            length += this.f12391a.getLength();
        }
        float floatValue = (bVar.f12406b.m11890e().mo12108f().floatValue() * length) / 360.0f;
        float floatValue2 = ((bVar.f12406b.m11891f().mo12108f().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((bVar.f12406b.m11889d().mo12108f().floatValue() * length) / 100.0f) + floatValue;
        float f2 = 0.0f;
        for (int size2 = bVar.f12405a.size() - 1; size2 >= 0; size2--) {
            this.f12393c.set(((InterfaceC0006a5) bVar.f12405a.get(size2)).mo49c());
            this.f12393c.transform(matrix);
            this.f12391a.setPath(this.f12393c, false);
            float length2 = this.f12391a.getLength();
            float f3 = 1.0f;
            if (floatValue3 > length) {
                float f4 = floatValue3 - length;
                if (f4 < f2 + length2 && f2 < f4) {
                    f = floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f;
                    f3 = Math.min(f4 / length2, 1.0f);
                    C3295u9.m15761a(this.f12393c, f, f3, 0.0f);
                    canvas.drawPath(this.f12393c, this.f12399i);
                    f2 += length2;
                }
            }
            float f5 = f2 + length2;
            if (f5 >= floatValue2 && f2 <= floatValue3) {
                if (f5 > floatValue3 || floatValue2 >= f2) {
                    f = floatValue2 < f2 ? 0.0f : (floatValue2 - f2) / length2;
                    if (floatValue3 <= f5) {
                        f3 = (floatValue3 - f2) / length2;
                    }
                    C3295u9.m15761a(this.f12393c, f, f3, 0.0f);
                }
                canvas.drawPath(this.f12393c, this.f12399i);
            }
            f2 += length2;
        }
        C0537c.m3722b("StrokeContent#applyTrimPath");
    }

    /* renamed from: a */
    private void m14422a(Matrix matrix) {
        C0537c.m3721a("StrokeContent#applyDashPattern");
        if (this.f12402l.isEmpty()) {
            C0537c.m3722b("StrokeContent#applyDashPattern");
            return;
        }
        float m15755a = C3295u9.m15755a(matrix);
        for (int i = 0; i < this.f12402l.size(); i++) {
            this.f12398h[i] = this.f12402l.get(i).mo12108f().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f12398h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f12398h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f12398h;
            fArr3[i] = fArr3[i] * m15755a;
        }
        AbstractC2538h5<?, Float> abstractC2538h5 = this.f12403m;
        this.f12399i.setPathEffect(new DashPathEffect(this.f12398h, abstractC2538h5 == null ? 0.0f : m15755a * abstractC2538h5.mo12108f().floatValue()));
        C0537c.m3722b("StrokeContent#applyDashPattern");
    }

    /* renamed from: a */
    public void mo11275a(Canvas canvas, Matrix matrix, int i) {
        C0537c.m3721a("StrokeContent#draw");
        if (C3295u9.m15766b(matrix)) {
            C0537c.m3722b("StrokeContent#draw");
            return;
        }
        this.f12399i.setAlpha(C3243t9.m15575a((int) ((((i / 255.0f) * ((C2885l5) this.f12401k).m13806i()) / 100.0f) * 255.0f), 0, 255));
        this.f12399i.setStrokeWidth(((C2800j5) this.f12400j).m13400i() * C3295u9.m15755a(matrix));
        if (this.f12399i.getStrokeWidth() <= 0.0f) {
            C0537c.m3722b("StrokeContent#draw");
            return;
        }
        m14422a(matrix);
        AbstractC2538h5<ColorFilter, ColorFilter> abstractC2538h5 = this.f12404n;
        if (abstractC2538h5 != null) {
            this.f12399i.setColorFilter(abstractC2538h5.mo12108f());
        }
        for (int i2 = 0; i2 < this.f12397g.size(); i2++) {
            b bVar = this.f12397g.get(i2);
            if (bVar.f12406b != null) {
                m14421a(canvas, bVar, matrix);
            } else {
                C0537c.m3721a("StrokeContent#buildPath");
                this.f12392b.reset();
                for (int size = bVar.f12405a.size() - 1; size >= 0; size--) {
                    this.f12392b.addPath(((InterfaceC0006a5) bVar.f12405a.get(size)).mo49c(), matrix);
                }
                C0537c.m3722b("StrokeContent#buildPath");
                C0537c.m3721a("StrokeContent#drawPath");
                canvas.drawPath(this.f12392b, this.f12399i);
                C0537c.m3722b("StrokeContent#drawPath");
            }
        }
        C0537c.m3722b("StrokeContent#draw");
    }

    @Override // p000.InterfaceC3190s4
    /* renamed from: a */
    public void mo11276a(RectF rectF, Matrix matrix, boolean z) {
        C0537c.m3721a("StrokeContent#getBounds");
        this.f12392b.reset();
        for (int i = 0; i < this.f12397g.size(); i++) {
            b bVar = this.f12397g.get(i);
            for (int i2 = 0; i2 < bVar.f12405a.size(); i2++) {
                this.f12392b.addPath(((InterfaceC0006a5) bVar.f12405a.get(i2)).mo49c(), matrix);
            }
        }
        this.f12392b.computeBounds(this.f12394d, false);
        float m13400i = ((C2800j5) this.f12400j).m13400i();
        RectF rectF2 = this.f12394d;
        float f = m13400i / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f12394d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C0537c.m3722b("StrokeContent#getBounds");
    }

    @Override // p000.InterfaceC2418e6
    /* renamed from: a */
    public void mo3319a(C2375d6 c2375d6, int i, List<C2375d6> list, C2375d6 c2375d62) {
        C3243t9.m15577a(c2375d6, i, list, c2375d62, this);
    }

    /* renamed from: a */
    public <T> void mo3320a(T t, C3429x9<T> c3429x9) {
        AbstractC2538h5 abstractC2538h5;
        if (t == InterfaceC0545k.f3158d) {
            abstractC2538h5 = this.f12401k;
        } else {
            if (t != InterfaceC0545k.f3169o) {
                if (t == InterfaceC0545k.f3153C) {
                    if (c3429x9 == null) {
                        this.f12404n = null;
                        return;
                    }
                    C3385w5 c3385w5 = new C3385w5(c3429x9);
                    this.f12404n = c3385w5;
                    c3385w5.m12102a(this);
                    this.f12396f.m14279a(this.f12404n);
                    return;
                }
                return;
            }
            abstractC2538h5 = this.f12400j;
        }
        abstractC2538h5.m12103a(c3429x9);
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public void mo3321a(List<InterfaceC3109q4> list, List<InterfaceC3109q4> list2) {
        C2498g5 c2498g5 = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC3109q4 interfaceC3109q4 = list.get(size);
            if (interfaceC3109q4 instanceof C2498g5) {
                C2498g5 c2498g52 = (C2498g5) interfaceC3109q4;
                if (c2498g52.m11892g() == C2924m7.a.INDIVIDUALLY) {
                    c2498g5 = c2498g52;
                }
            }
        }
        if (c2498g5 != null) {
            c2498g5.m11888a(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            InterfaceC3109q4 interfaceC3109q42 = list2.get(size2);
            if (interfaceC3109q42 instanceof C2498g5) {
                C2498g5 c2498g53 = (C2498g5) interfaceC3109q42;
                if (c2498g53.m11892g() == C2924m7.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f12397g.add(bVar);
                    }
                    bVar = new b(c2498g53);
                    c2498g53.m11888a(this);
                }
            }
            if (interfaceC3109q42 instanceof InterfaceC0006a5) {
                if (bVar == null) {
                    bVar = new b(c2498g5);
                }
                bVar.f12405a.add((InterfaceC0006a5) interfaceC3109q42);
            }
        }
        if (bVar != null) {
            this.f12397g.add(bVar);
        }
    }

    @Override // p000.AbstractC2538h5.b
    /* renamed from: b */
    public void mo3322b() {
        this.f12395e.invalidateSelf();
    }
}
