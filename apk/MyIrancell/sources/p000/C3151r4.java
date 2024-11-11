package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C0540f;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC2538h5;

/* renamed from: r4 */
/* loaded from: classes.dex */
public class C3151r4 implements InterfaceC3190s4, InterfaceC0006a5, AbstractC2538h5.b, InterfaceC2418e6 {

    /* renamed from: a */
    private Paint f12900a;

    /* renamed from: b */
    private RectF f12901b;

    /* renamed from: c */
    private final Matrix f12902c;

    /* renamed from: d */
    private final Path f12903d;

    /* renamed from: e */
    private final RectF f12904e;

    /* renamed from: f */
    private final String f12905f;

    /* renamed from: g */
    private final boolean f12906g;

    /* renamed from: h */
    private final List<InterfaceC3109q4> f12907h;

    /* renamed from: i */
    private final C0540f f12908i;

    /* renamed from: j */
    private List<InterfaceC0006a5> f12909j;

    /* renamed from: k */
    private C3339v5 f12910k;

    public C3151r4(C0540f c0540f, AbstractC2976n7 abstractC2976n7, C2802j7 c2802j7) {
        this(c0540f, abstractC2976n7, c2802j7.m13405b(), c2802j7.m13406c(), m15197a(c0540f, abstractC2976n7, c2802j7.m13404a()), m15198a(c2802j7.m13404a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3151r4(C0540f c0540f, AbstractC2976n7 abstractC2976n7, String str, boolean z, List<InterfaceC3109q4> list, C3240t6 c3240t6) {
        this.f12900a = new C2967n4();
        this.f12901b = new RectF();
        this.f12902c = new Matrix();
        this.f12903d = new Path();
        this.f12904e = new RectF();
        this.f12905f = str;
        this.f12908i = c0540f;
        this.f12906g = z;
        this.f12907h = list;
        if (c3240t6 != null) {
            C3339v5 m15539a = c3240t6.m15539a();
            this.f12910k = m15539a;
            m15539a.m15941a(abstractC2976n7);
            this.f12910k.m15940a(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC3109q4 interfaceC3109q4 = list.get(size);
            if (interfaceC3109q4 instanceof InterfaceC3422x4) {
                arrayList.add((InterfaceC3422x4) interfaceC3109q4);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC3422x4) arrayList.get(size2)).mo11277a(list.listIterator(list.size()));
        }
    }

    /* renamed from: a */
    private static List<InterfaceC3109q4> m15197a(C0540f c0540f, AbstractC2976n7 abstractC2976n7, List<InterfaceC3426x6> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            InterfaceC3109q4 mo75a = list.get(i).mo75a(c0540f, abstractC2976n7);
            if (mo75a != null) {
                arrayList.add(mo75a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    static C3240t6 m15198a(List<InterfaceC3426x6> list) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC3426x6 interfaceC3426x6 = list.get(i);
            if (interfaceC3426x6 instanceof C3240t6) {
                return (C3240t6) interfaceC3426x6;
            }
        }
        return null;
    }

    /* renamed from: f */
    private boolean m15199f() {
        int i = 0;
        for (int i2 = 0; i2 < this.f12907h.size(); i2++) {
            if ((this.f12907h.get(i2) instanceof InterfaceC3190s4) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public String mo3318a() {
        return this.f12905f;
    }

    @Override // p000.InterfaceC3190s4
    /* renamed from: a */
    public void mo11275a(Canvas canvas, Matrix matrix, int i) {
        if (this.f12906g) {
            return;
        }
        this.f12902c.set(matrix);
        C3339v5 c3339v5 = this.f12910k;
        if (c3339v5 != null) {
            this.f12902c.preConcat(c3339v5.m15943b());
            i = (int) (((((this.f12910k.m15945c() == null ? 100 : this.f12910k.m15945c().mo12108f().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.f12908i.m3822r() && m15199f() && i != 255;
        if (z) {
            this.f12901b.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo11276a(this.f12901b, this.f12902c, true);
            this.f12900a.setAlpha(i);
            C3295u9.m15759a(canvas, this.f12901b, this.f12900a);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f12907h.size() - 1; size >= 0; size--) {
            InterfaceC3109q4 interfaceC3109q4 = this.f12907h.get(size);
            if (interfaceC3109q4 instanceof InterfaceC3190s4) {
                ((InterfaceC3190s4) interfaceC3109q4).mo11275a(canvas, this.f12902c, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // p000.InterfaceC3190s4
    /* renamed from: a */
    public void mo11276a(RectF rectF, Matrix matrix, boolean z) {
        this.f12902c.set(matrix);
        C3339v5 c3339v5 = this.f12910k;
        if (c3339v5 != null) {
            this.f12902c.preConcat(c3339v5.m15943b());
        }
        this.f12904e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f12907h.size() - 1; size >= 0; size--) {
            InterfaceC3109q4 interfaceC3109q4 = this.f12907h.get(size);
            if (interfaceC3109q4 instanceof InterfaceC3190s4) {
                ((InterfaceC3190s4) interfaceC3109q4).mo11276a(this.f12904e, this.f12902c, z);
                rectF.union(this.f12904e);
            }
        }
    }

    @Override // p000.InterfaceC2418e6
    /* renamed from: a */
    public void mo3319a(C2375d6 c2375d6, int i, List<C2375d6> list, C2375d6 c2375d62) {
        if (c2375d6.m11286c(mo3318a(), i)) {
            if (!"__container".equals(mo3318a())) {
                c2375d62 = c2375d62.m11282a(mo3318a());
                if (c2375d6.m11284a(mo3318a(), i)) {
                    list.add(c2375d62.m11281a(this));
                }
            }
            if (c2375d6.m11287d(mo3318a(), i)) {
                int m11285b = i + c2375d6.m11285b(mo3318a(), i);
                for (int i2 = 0; i2 < this.f12907h.size(); i2++) {
                    InterfaceC3109q4 interfaceC3109q4 = this.f12907h.get(i2);
                    if (interfaceC3109q4 instanceof InterfaceC2418e6) {
                        ((InterfaceC2418e6) interfaceC3109q4).mo3319a(c2375d6, m11285b, list, c2375d62);
                    }
                }
            }
        }
    }

    @Override // p000.InterfaceC2418e6
    /* renamed from: a */
    public <T> void mo3320a(T t, C3429x9<T> c3429x9) {
        C3339v5 c3339v5 = this.f12910k;
        if (c3339v5 != null) {
            c3339v5.m15942a(t, c3429x9);
        }
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public void mo3321a(List<InterfaceC3109q4> list, List<InterfaceC3109q4> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f12907h.size());
        arrayList.addAll(list);
        for (int size = this.f12907h.size() - 1; size >= 0; size--) {
            InterfaceC3109q4 interfaceC3109q4 = this.f12907h.get(size);
            interfaceC3109q4.mo3321a(arrayList, this.f12907h.subList(0, size));
            arrayList.add(interfaceC3109q4);
        }
    }

    @Override // p000.AbstractC2538h5.b
    /* renamed from: b */
    public void mo3322b() {
        this.f12908i.invalidateSelf();
    }

    @Override // p000.InterfaceC0006a5
    /* renamed from: c */
    public Path mo49c() {
        this.f12902c.reset();
        C3339v5 c3339v5 = this.f12910k;
        if (c3339v5 != null) {
            this.f12902c.set(c3339v5.m15943b());
        }
        this.f12903d.reset();
        if (this.f12906g) {
            return this.f12903d;
        }
        for (int size = this.f12907h.size() - 1; size >= 0; size--) {
            InterfaceC3109q4 interfaceC3109q4 = this.f12907h.get(size);
            if (interfaceC3109q4 instanceof InterfaceC0006a5) {
                this.f12903d.addPath(((InterfaceC0006a5) interfaceC3109q4).mo49c(), this.f12902c);
            }
        }
        return this.f12903d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public List<InterfaceC0006a5> m15200d() {
        if (this.f12909j == null) {
            this.f12909j = new ArrayList();
            for (int i = 0; i < this.f12907h.size(); i++) {
                InterfaceC3109q4 interfaceC3109q4 = this.f12907h.get(i);
                if (interfaceC3109q4 instanceof InterfaceC0006a5) {
                    this.f12909j.add((InterfaceC0006a5) interfaceC3109q4);
                }
            }
        }
        return this.f12909j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Matrix m15201e() {
        C3339v5 c3339v5 = this.f12910k;
        if (c3339v5 != null) {
            return c3339v5.m15943b();
        }
        this.f12902c.reset();
        return this.f12902c;
    }
}
