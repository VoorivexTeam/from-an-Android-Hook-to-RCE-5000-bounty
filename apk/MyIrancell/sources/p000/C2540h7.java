package p000;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: h7 */
/* loaded from: classes.dex */
public class C2540h7 {

    /* renamed from: a */
    private final List<C3512z5> f10400a;

    /* renamed from: b */
    private PointF f10401b;

    /* renamed from: c */
    private boolean f10402c;

    public C2540h7() {
        this.f10400a = new ArrayList();
    }

    public C2540h7(PointF pointF, boolean z, List<C3512z5> list) {
        this.f10401b = pointF;
        this.f10402c = z;
        this.f10400a = new ArrayList(list);
    }

    /* renamed from: a */
    private void m12138a(float f, float f2) {
        if (this.f10401b == null) {
            this.f10401b = new PointF();
        }
        this.f10401b.set(f, f2);
    }

    /* renamed from: a */
    public List<C3512z5> m12139a() {
        return this.f10400a;
    }

    /* renamed from: a */
    public void m12140a(C2540h7 c2540h7, C2540h7 c2540h72, float f) {
        if (this.f10401b == null) {
            this.f10401b = new PointF();
        }
        this.f10402c = c2540h7.m12142c() || c2540h72.m12142c();
        if (c2540h7.m12139a().size() != c2540h72.m12139a().size()) {
            C3116q9.m15002b("Curves must have the same number of control points. Shape 1: " + c2540h7.m12139a().size() + "\tShape 2: " + c2540h72.m12139a().size());
        }
        int min = Math.min(c2540h7.m12139a().size(), c2540h72.m12139a().size());
        if (this.f10400a.size() < min) {
            for (int size = this.f10400a.size(); size < min; size++) {
                this.f10400a.add(new C3512z5());
            }
        } else if (this.f10400a.size() > min) {
            for (int size2 = this.f10400a.size() - 1; size2 >= min; size2--) {
                List<C3512z5> list = this.f10400a;
                list.remove(list.size() - 1);
            }
        }
        PointF m12141b = c2540h7.m12141b();
        PointF m12141b2 = c2540h72.m12141b();
        m12138a(C3243t9.m15581c(m12141b.x, m12141b2.x, f), C3243t9.m15581c(m12141b.y, m12141b2.y, f));
        for (int size3 = this.f10400a.size() - 1; size3 >= 0; size3--) {
            C3512z5 c3512z5 = c2540h7.m12139a().get(size3);
            C3512z5 c3512z52 = c2540h72.m12139a().get(size3);
            PointF m16770a = c3512z5.m16770a();
            PointF m16772b = c3512z5.m16772b();
            PointF m16774c = c3512z5.m16774c();
            PointF m16770a2 = c3512z52.m16770a();
            PointF m16772b2 = c3512z52.m16772b();
            PointF m16774c2 = c3512z52.m16774c();
            this.f10400a.get(size3).m16771a(C3243t9.m15581c(m16770a.x, m16770a2.x, f), C3243t9.m15581c(m16770a.y, m16770a2.y, f));
            this.f10400a.get(size3).m16773b(C3243t9.m15581c(m16772b.x, m16772b2.x, f), C3243t9.m15581c(m16772b.y, m16772b2.y, f));
            this.f10400a.get(size3).m16775c(C3243t9.m15581c(m16774c.x, m16774c2.x, f), C3243t9.m15581c(m16774c.y, m16774c2.y, f));
        }
    }

    /* renamed from: b */
    public PointF m12141b() {
        return this.f10401b;
    }

    /* renamed from: c */
    public boolean m12142c() {
        return this.f10402c;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f10400a.size() + "closed=" + this.f10402c + '}';
    }
}
