package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C0540f;
import java.util.Collections;
import java.util.List;

/* renamed from: s7 */
/* loaded from: classes.dex */
public class C3195s7 extends AbstractC2976n7 {

    /* renamed from: w */
    private final C3151r4 f13036w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3195s7(C0540f c0540f, C3112q7 c3112q7) {
        super(c0540f, c3112q7);
        C3151r4 c3151r4 = new C3151r4(c0540f, this, new C2802j7("__container", c3112q7.m14969l(), false));
        this.f13036w = c3151r4;
        c3151r4.mo3321a(Collections.emptyList(), Collections.emptyList());
    }

    @Override // p000.AbstractC2976n7, p000.InterfaceC3190s4
    /* renamed from: a */
    public void mo11276a(RectF rectF, Matrix matrix, boolean z) {
        super.mo11276a(rectF, matrix, z);
        this.f13036w.mo11276a(rectF, this.f12251m, z);
    }

    @Override // p000.AbstractC2976n7
    /* renamed from: b */
    void mo14281b(Canvas canvas, Matrix matrix, int i) {
        this.f13036w.mo11275a(canvas, matrix, i);
    }

    @Override // p000.AbstractC2976n7
    /* renamed from: b */
    protected void mo14282b(C2375d6 c2375d6, int i, List<C2375d6> list, C2375d6 c2375d62) {
        this.f13036w.mo3319a(c2375d6, i, list, c2375d62);
    }
}
