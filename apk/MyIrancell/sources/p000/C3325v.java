package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import p000.C0443b0;

/* renamed from: v */
/* loaded from: classes.dex */
class C3325v extends C3417x {

    /* renamed from: v$a */
    /* loaded from: classes.dex */
    class a implements C0443b0.a {
        a(C3325v c3325v) {
        }

        @Override // p000.C0443b0.a
        /* renamed from: a */
        public void mo3258a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // p000.C3417x, p000.InterfaceC3506z
    /* renamed from: a */
    public void mo15885a() {
        C0443b0.f2679r = new a(this);
    }
}
