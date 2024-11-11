package p000;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C0538d;

/* renamed from: o5 */
/* loaded from: classes.dex */
public class C3014o5 extends C3346v9<PointF> {

    /* renamed from: o */
    private Path f12408o;

    /* renamed from: p */
    private final C3346v9<PointF> f12409p;

    public C3014o5(C0538d c0538d, C3346v9<PointF> c3346v9) {
        super(c0538d, c3346v9.f13631b, c3346v9.f13632c, c3346v9.f13633d, c3346v9.f13634e, c3346v9.f13635f);
        this.f12409p = c3346v9;
        m14425h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public void m14425h() {
        T t;
        T t2 = this.f13632c;
        boolean z = (t2 == 0 || (t = this.f13631b) == 0 || !((PointF) t).equals(((PointF) t2).x, ((PointF) t2).y)) ? false : true;
        T t3 = this.f13632c;
        if (t3 == 0 || z) {
            return;
        }
        C3346v9<PointF> c3346v9 = this.f12409p;
        this.f12408o = C3295u9.m15758a((PointF) this.f13631b, (PointF) t3, c3346v9.f13642m, c3346v9.f13643n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Path m14426i() {
        return this.f12408o;
    }
}
