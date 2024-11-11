package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C0540f;
import com.airbnb.lottie.InterfaceC0545k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import p000.AbstractC2538h5;

/* renamed from: d5 */
/* loaded from: classes.dex */
public class C2374d5 implements InterfaceC3190s4, InterfaceC0006a5, InterfaceC3422x4, AbstractC2538h5.b, InterfaceC3471y4 {

    /* renamed from: a */
    private final Matrix f9701a = new Matrix();

    /* renamed from: b */
    private final Path f9702b = new Path();

    /* renamed from: c */
    private final C0540f f9703c;

    /* renamed from: d */
    private final AbstractC2976n7 f9704d;

    /* renamed from: e */
    private final String f9705e;

    /* renamed from: f */
    private final boolean f9706f;

    /* renamed from: g */
    private final AbstractC2538h5<Float, Float> f9707g;

    /* renamed from: h */
    private final AbstractC2538h5<Float, Float> f9708h;

    /* renamed from: i */
    private final C3339v5 f9709i;

    /* renamed from: j */
    private C3151r4 f9710j;

    public C2374d5(C0540f c0540f, AbstractC2976n7 abstractC2976n7, C2500g7 c2500g7) {
        this.f9703c = c0540f;
        this.f9704d = abstractC2976n7;
        this.f9705e = c2500g7.m11902b();
        this.f9706f = c2500g7.m11905e();
        AbstractC2538h5<Float, Float> mo12378a = c2500g7.m11901a().mo12378a();
        this.f9707g = mo12378a;
        abstractC2976n7.m14279a(mo12378a);
        this.f9707g.m12102a(this);
        AbstractC2538h5<Float, Float> mo12378a2 = c2500g7.m11903c().mo12378a();
        this.f9708h = mo12378a2;
        abstractC2976n7.m14279a(mo12378a2);
        this.f9708h.m12102a(this);
        C3339v5 m15539a = c2500g7.m11904d().m15539a();
        this.f9709i = m15539a;
        m15539a.m15941a(abstractC2976n7);
        this.f9709i.m15940a(this);
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public String mo3318a() {
        return this.f9705e;
    }

    @Override // p000.InterfaceC3190s4
    /* renamed from: a */
    public void mo11275a(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f9707g.mo12108f().floatValue();
        float floatValue2 = this.f9708h.mo12108f().floatValue();
        float floatValue3 = this.f9709i.m15946d().mo12108f().floatValue() / 100.0f;
        float floatValue4 = this.f9709i.m15939a().mo12108f().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f9701a.set(matrix);
            float f = i2;
            this.f9701a.preConcat(this.f9709i.m15938a(f + floatValue2));
            this.f9710j.mo11275a(canvas, this.f9701a, (int) (i * C3243t9.m15581c(floatValue3, floatValue4, f / floatValue)));
        }
    }

    @Override // p000.InterfaceC3190s4
    /* renamed from: a */
    public void mo11276a(RectF rectF, Matrix matrix, boolean z) {
        this.f9710j.mo11276a(rectF, matrix, z);
    }

    @Override // p000.InterfaceC2418e6
    /* renamed from: a */
    public void mo3319a(C2375d6 c2375d6, int i, List<C2375d6> list, C2375d6 c2375d62) {
        C3243t9.m15577a(c2375d6, i, list, c2375d62, this);
    }

    @Override // p000.InterfaceC2418e6
    /* renamed from: a */
    public <T> void mo3320a(T t, C3429x9<T> c3429x9) {
        AbstractC2538h5<Float, Float> abstractC2538h5;
        if (this.f9709i.m15942a(t, c3429x9)) {
            return;
        }
        if (t == InterfaceC0545k.f3171q) {
            abstractC2538h5 = this.f9707g;
        } else if (t != InterfaceC0545k.f3172r) {
            return;
        } else {
            abstractC2538h5 = this.f9708h;
        }
        abstractC2538h5.m12103a((C3429x9<Float>) c3429x9);
    }

    @Override // p000.InterfaceC3109q4
    /* renamed from: a */
    public void mo3321a(List<InterfaceC3109q4> list, List<InterfaceC3109q4> list2) {
        this.f9710j.mo3321a(list, list2);
    }

    @Override // p000.InterfaceC3422x4
    /* renamed from: a */
    public void mo11277a(ListIterator<InterfaceC3109q4> listIterator) {
        if (this.f9710j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f9710j = new C3151r4(this.f9703c, this.f9704d, "Repeater", this.f9706f, arrayList, null);
    }

    @Override // p000.AbstractC2538h5.b
    /* renamed from: b */
    public void mo3322b() {
        this.f9703c.invalidateSelf();
    }

    @Override // p000.InterfaceC0006a5
    /* renamed from: c */
    public Path mo49c() {
        Path mo49c = this.f9710j.mo49c();
        this.f9702b.reset();
        float floatValue = this.f9707g.mo12108f().floatValue();
        float floatValue2 = this.f9708h.mo12108f().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f9701a.set(this.f9709i.m15938a(i + floatValue2));
            this.f9702b.addPath(mo49c, this.f9701a);
        }
        return this.f9702b;
    }
}
