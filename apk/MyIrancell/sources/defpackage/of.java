package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.c;
import com.bumptech.glide.load.l;
import defpackage.f4;
import defpackage.sf;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public class of extends Drawable implements sf.b, Animatable, f4 {
    private final a b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;
    private boolean i;
    private Paint j;
    private Rect k;
    private List<f4.a> l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends Drawable.ConstantState {
        final sf a;

        a(sf sfVar) {
            this.a = sfVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new of(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public of(Context context, ca caVar, l<Bitmap> lVar, int i, int i2, Bitmap bitmap) {
        this(new a(new sf(c.b(context), caVar, i, i2, lVar, bitmap)));
    }

    of(a aVar) {
        this.f = true;
        this.h = -1;
        ji.a(aVar);
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback h() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect i() {
        if (this.k == null) {
            this.k = new Rect();
        }
        return this.k;
    }

    private Paint j() {
        if (this.j == null) {
            this.j = new Paint(2);
        }
        return this.j;
    }

    private void k() {
        List<f4.a> list = this.l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.l.get(i).a(this);
            }
        }
    }

    private void l() {
        this.g = 0;
    }

    private void m() {
        ji.a(!this.e, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.b.a.f() != 1) {
            if (this.c) {
                return;
            }
            this.c = true;
            this.b.a.a(this);
        }
        invalidateSelf();
    }

    private void n() {
        this.c = false;
        this.b.a.b(this);
    }

    @Override // sf.b
    public void a() {
        if (h() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (e() == d() - 1) {
            this.g++;
        }
        int i = this.h;
        if (i == -1 || this.g < i) {
            return;
        }
        k();
        stop();
    }

    public void a(l<Bitmap> lVar, Bitmap bitmap) {
        this.b.a.a(lVar, bitmap);
    }

    public ByteBuffer b() {
        return this.b.a.b();
    }

    public Bitmap c() {
        return this.b.a.e();
    }

    public int d() {
        return this.b.a.f();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.e) {
            return;
        }
        if (this.i) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), i());
            this.i = false;
        }
        canvas.drawBitmap(this.b.a.c(), (Rect) null, i(), j());
    }

    public int e() {
        return this.b.a.d();
    }

    public int f() {
        return this.b.a.h();
    }

    public void g() {
        this.e = true;
        this.b.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.b.a.g();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.b.a.i();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        j().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        j().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        ji.a(!this.e, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f = z;
        if (!z) {
            n();
        } else if (this.d) {
            m();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.d = true;
        l();
        if (this.f) {
            m();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.d = false;
        n();
    }
}
