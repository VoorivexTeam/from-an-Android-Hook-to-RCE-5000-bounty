package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.C0540f;
import com.airbnb.lottie.InterfaceC0545k;

/* renamed from: p7 */
/* loaded from: classes.dex */
public class C3073p7 extends AbstractC2976n7 {

    /* renamed from: w */
    private final Paint f12564w;

    /* renamed from: x */
    private final Rect f12565x;

    /* renamed from: y */
    private final Rect f12566y;

    /* renamed from: z */
    private AbstractC2538h5<ColorFilter, ColorFilter> f12567z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3073p7(C0540f c0540f, C3112q7 c3112q7) {
        super(c0540f, c3112q7);
        this.f12564w = new C2967n4(3);
        this.f12565x = new Rect();
        this.f12566y = new Rect();
    }

    /* renamed from: g */
    private Bitmap m14729g() {
        return this.f12252n.m3776a(this.f12253o.m14968k());
    }

    @Override // p000.AbstractC2976n7, p000.InterfaceC3190s4
    /* renamed from: a */
    public void mo11276a(RectF rectF, Matrix matrix, boolean z) {
        super.mo11276a(rectF, matrix, z);
        if (m14729g() != null) {
            rectF.set(0.0f, 0.0f, r3.getWidth() * C3295u9.m15753a(), r3.getHeight() * C3295u9.m15753a());
            this.f12251m.mapRect(rectF);
        }
    }

    @Override // p000.AbstractC2976n7, p000.InterfaceC2418e6
    /* renamed from: a */
    public <T> void mo3320a(T t, C3429x9<T> c3429x9) {
        super.mo3320a((C3073p7) t, (C3429x9<C3073p7>) c3429x9);
        if (t == InterfaceC0545k.f3153C) {
            this.f12567z = c3429x9 == null ? null : new C3385w5(c3429x9);
        }
    }

    @Override // p000.AbstractC2976n7
    /* renamed from: b */
    public void mo14281b(Canvas canvas, Matrix matrix, int i) {
        Bitmap m14729g = m14729g();
        if (m14729g == null || m14729g.isRecycled()) {
            return;
        }
        float m15753a = C3295u9.m15753a();
        this.f12564w.setAlpha(i);
        AbstractC2538h5<ColorFilter, ColorFilter> abstractC2538h5 = this.f12567z;
        if (abstractC2538h5 != null) {
            this.f12564w.setColorFilter(abstractC2538h5.mo12108f());
        }
        canvas.save();
        canvas.concat(matrix);
        this.f12565x.set(0, 0, m14729g.getWidth(), m14729g.getHeight());
        this.f12566y.set(0, 0, (int) (m14729g.getWidth() * m15753a), (int) (m14729g.getHeight() * m15753a));
        canvas.drawBitmap(m14729g, this.f12565x, this.f12566y, this.f12564w);
        canvas.restore();
    }
}
