package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C0537c;
import com.airbnb.lottie.C0540f;
import com.airbnb.lottie.InterfaceC0545k;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC2538h5;

/* renamed from: u4 */
/* loaded from: classes.dex */
public class C3286u4 implements InterfaceC3190s4, AbstractC2538h5.b, InterfaceC3471y4 {

    /* renamed from: c */
    private final AbstractC2976n7 f13401c;

    /* renamed from: d */
    private final String f13402d;

    /* renamed from: e */
    private final boolean f13403e;

    /* renamed from: g */
    private final AbstractC2538h5<Integer, Integer> f13405g;

    /* renamed from: h */
    private final AbstractC2538h5<Integer, Integer> f13406h;

    /* renamed from: i */
    private AbstractC2538h5<ColorFilter, ColorFilter> f13407i;

    /* renamed from: j */
    private final C0540f f13408j;

    /* renamed from: a */
    private final Path f13399a = new Path();

    /* renamed from: b */
    private final Paint f13400b = new C2967n4(1);

    /* renamed from: f */
    private final List<InterfaceC0006a5> f13404f = new ArrayList();

    public C3286u4(C0540f c0540f, AbstractC2976n7 abstractC2976n7, C2581i7 c2581i7) {
        this.f13401c = abstractC2976n7;
        this.f13402d = c2581i7.m12381c();
        this.f13403e = c2581i7.m12383e();
        this.f13408j = c0540f;
        if (c2581i7.m12379a() == null || c2581i7.m12382d() == null) {
            this.f13405g = null;
            this.f13406h = null;
            return;
        }
        this.f13399a.setFillType(c2581i7.m12380b());
        AbstractC2538h5<Integer, Integer> mo12378a = c2581i7.m12379a().mo12378a();
        this.f13405g = mo12378a;
        mo12378a.m12102a(this);
        abstractC2976n7.m14279a(this.f13405g);
        AbstractC2538h5<Integer, Integer> mo12378a2 = c2581i7.m12382d().mo12378a();
        this.f13406h = mo12378a2;
        mo12378a2.m12102a(this);
        abstractC2976n7.m14279a(this.f13406h);
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public String mo3318a() {
        return this.f13402d;
    }

    @Override // p000.InterfaceC3190s4
    /* renamed from: a */
    public void mo11275a(Canvas canvas, Matrix matrix, int i) {
        if (this.f13403e) {
            return;
        }
        C0537c.m3721a("FillContent#draw");
        this.f13400b.setColor(((C2579i5) this.f13405g).m12367i());
        this.f13400b.setAlpha(C3243t9.m15575a((int) ((((i / 255.0f) * this.f13406h.mo12108f().intValue()) / 100.0f) * 255.0f), 0, 255));
        AbstractC2538h5<ColorFilter, ColorFilter> abstractC2538h5 = this.f13407i;
        if (abstractC2538h5 != null) {
            this.f13400b.setColorFilter(abstractC2538h5.mo12108f());
        }
        this.f13399a.reset();
        for (int i2 = 0; i2 < this.f13404f.size(); i2++) {
            this.f13399a.addPath(this.f13404f.get(i2).mo49c(), matrix);
        }
        canvas.drawPath(this.f13399a, this.f13400b);
        C0537c.m3722b("FillContent#draw");
    }

    @Override // p000.InterfaceC3190s4
    /* renamed from: a */
    public void mo11276a(RectF rectF, Matrix matrix, boolean z) {
        this.f13399a.reset();
        for (int i = 0; i < this.f13404f.size(); i++) {
            this.f13399a.addPath(this.f13404f.get(i).mo49c(), matrix);
        }
        this.f13399a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p000.InterfaceC2418e6
    /* renamed from: a */
    public void mo3319a(C2375d6 c2375d6, int i, List<C2375d6> list, C2375d6 c2375d62) {
        C3243t9.m15577a(c2375d6, i, list, c2375d62, this);
    }

    @Override // p000.InterfaceC2418e6
    /* renamed from: a */
    public <T> void mo3320a(T t, C3429x9<T> c3429x9) {
        AbstractC2538h5<Integer, Integer> abstractC2538h5;
        if (t == InterfaceC0545k.f3155a) {
            abstractC2538h5 = this.f13405g;
        } else {
            if (t != InterfaceC0545k.f3158d) {
                if (t == InterfaceC0545k.f3153C) {
                    if (c3429x9 == null) {
                        this.f13407i = null;
                        return;
                    }
                    C3385w5 c3385w5 = new C3385w5(c3429x9);
                    this.f13407i = c3385w5;
                    c3385w5.m12102a(this);
                    this.f13401c.m14279a(this.f13407i);
                    return;
                }
                return;
            }
            abstractC2538h5 = this.f13406h;
        }
        abstractC2538h5.m12103a((C3429x9<Integer>) c3429x9);
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public void mo3321a(List<InterfaceC3109q4> list, List<InterfaceC3109q4> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC3109q4 interfaceC3109q4 = list2.get(i);
            if (interfaceC3109q4 instanceof InterfaceC0006a5) {
                this.f13404f.add((InterfaceC0006a5) interfaceC3109q4);
            }
        }
    }

    @Override // p000.AbstractC2538h5.b
    /* renamed from: b */
    public void mo3322b() {
        this.f13408j.invalidateSelf();
    }
}
