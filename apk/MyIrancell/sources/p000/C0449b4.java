package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b4 */
/* loaded from: classes.dex */
public class C0449b4 extends ImageView {

    /* renamed from: b */
    private Animation.AnimationListener f2716b;

    /* renamed from: c */
    int f2717c;

    /* renamed from: b4$a */
    /* loaded from: classes.dex */
    private class a extends OvalShape {

        /* renamed from: b */
        private RadialGradient f2718b;

        /* renamed from: c */
        private Paint f2719c = new Paint();

        a(int i) {
            C0449b4.this.f2717c = i;
            m3314a((int) rect().width());
        }

        /* renamed from: a */
        private void m3314a(int i) {
            float f = i / 2;
            RadialGradient radialGradient = new RadialGradient(f, f, C0449b4.this.f2717c, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f2718b = radialGradient;
            this.f2719c.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = C0449b4.this.getWidth() / 2;
            float height = C0449b4.this.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f2719c);
            canvas.drawCircle(width, height, r0 - C0449b4.this.f2717c, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f, float f2) {
            super.onResize(f, f2);
            m3314a((int) f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0449b4(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f2717c = (int) (3.5f * f);
        if (m3312a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C3107q2.m14884a(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this.f2717c));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f2717c, i3, i2, 503316480);
            int i4 = this.f2717c;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        C3107q2.m14891a(this, shapeDrawable);
    }

    /* renamed from: a */
    private boolean m3312a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: a */
    public void m3313a(Animation.AnimationListener animationListener) {
        this.f2716b = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f2716b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f2716b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (m3312a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f2717c * 2), getMeasuredHeight() + (this.f2717c * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
