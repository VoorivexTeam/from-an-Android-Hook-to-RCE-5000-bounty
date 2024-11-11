package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import defpackage.b0;

/* loaded from: classes.dex */
class v extends x {

    /* loaded from: classes.dex */
    class a implements b0.a {
        a(v vVar) {
        }

        @Override // b0.a
        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // defpackage.x, defpackage.z
    public void a() {
        b0.r = new a(this);
    }
}
