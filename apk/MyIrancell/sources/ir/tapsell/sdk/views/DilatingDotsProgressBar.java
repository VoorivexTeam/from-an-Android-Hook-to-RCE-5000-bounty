package ir.tapsell.sdk.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import ir.tapsell.sdk.NoProguard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class DilatingDotsProgressBar extends View implements NoProguard {
    private static final int MIN_DELAY = 500;
    private static final int MIN_SHOW_TIME = 500;
    public static final double START_DELAY_FACTOR = 0.35d;
    public static final String TAG = DilatingDotsProgressBar.class.getSimpleName();
    private boolean mAnimateColors;
    private int mAnimationDuration;
    private final List<Animator> mAnimations;
    private final Runnable mDelayedHide;
    private final Runnable mDelayedShow;
    private boolean mDismissed;
    private int mDotColor;
    private int mDotEndColor;
    private float mDotMaxRadius;
    private float mDotRadius;
    private float mDotScaleMultiplier;
    private ArrayList<DilatingDotDrawable> mDrawables;
    private float mHorizontalSpacing;
    private boolean mIsRunning;
    private int mNumberDots;
    private boolean mShouldAnimate;
    private long mStartTime;
    private int mWidthBetweenDotCenters;

    /* renamed from: ir.tapsell.sdk.views.DilatingDotsProgressBar$a */
    /* loaded from: classes.dex */
    class RunnableC2777a implements Runnable {
        RunnableC2777a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (DilatingDotsProgressBar.this.mDismissed) {
                return;
            }
            DilatingDotsProgressBar.this.mStartTime = System.currentTimeMillis();
            DilatingDotsProgressBar.this.setVisibility(0);
            DilatingDotsProgressBar.this.startAnimations();
        }
    }

    /* renamed from: ir.tapsell.sdk.views.DilatingDotsProgressBar$b */
    /* loaded from: classes.dex */
    class RunnableC2778b implements Runnable {
        RunnableC2778b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DilatingDotsProgressBar.this.mStartTime = -1L;
            DilatingDotsProgressBar.this.mIsRunning = false;
            DilatingDotsProgressBar.this.setVisibility(8);
            DilatingDotsProgressBar.this.stopAnimations();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.views.DilatingDotsProgressBar$c */
    /* loaded from: classes.dex */
    public class C2779c extends AnimatorListenerAdapter {
        C2779c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (DilatingDotsProgressBar.this.shouldAnimate()) {
                DilatingDotsProgressBar.this.startAnimations();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.views.DilatingDotsProgressBar$d */
    /* loaded from: classes.dex */
    public class C2780d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ DilatingDotDrawable f11294a;

        C2780d(DilatingDotsProgressBar dilatingDotsProgressBar, DilatingDotDrawable dilatingDotDrawable) {
            this.f11294a = dilatingDotDrawable;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f11294a.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.views.DilatingDotsProgressBar$e */
    /* loaded from: classes.dex */
    public class C2781e extends AnimatorListenerAdapter {
        C2781e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (DilatingDotsProgressBar.this.shouldAnimate()) {
                DilatingDotsProgressBar.this.startAnimations();
            }
        }
    }

    /* renamed from: ir.tapsell.sdk.views.DilatingDotsProgressBar$f */
    /* loaded from: classes.dex */
    public static class C2782f {

        /* renamed from: o */
        private static final Boolean f11296o = true;

        /* renamed from: p */
        private static final Boolean f11297p = false;

        /* renamed from: q */
        private static final Boolean f11298q = false;

        /* renamed from: r */
        private static final Boolean f11299r = true;

        /* renamed from: a */
        public Integer f11300a;

        /* renamed from: b */
        public Integer f11301b;

        /* renamed from: c */
        public Integer f11302c;

        /* renamed from: d */
        public Integer f11303d;

        /* renamed from: e */
        public Integer f11304e;

        /* renamed from: f */
        public Float f11305f;

        /* renamed from: g */
        public Float f11306g;

        /* renamed from: h */
        public Float f11307h;

        /* renamed from: i */
        public Float f11308i;

        /* renamed from: j */
        public Long f11309j;

        /* renamed from: k */
        public Boolean f11310k;

        /* renamed from: l */
        public Boolean f11311l;

        /* renamed from: m */
        public Boolean f11312m;

        /* renamed from: n */
        public Boolean f11313n;

        public C2782f() {
            this.f11300a = 587202559;
            this.f11301b = -1;
            this.f11302c = 800;
            this.f11303d = 3;
            this.f11304e = 3;
            this.f11305f = Float.valueOf(12.0f);
            this.f11306g = Float.valueOf(1.4f);
            this.f11307h = Float.valueOf(3.0f);
            this.f11308i = Float.valueOf(6.0f);
            this.f11309j = -1L;
            this.f11310k = f11296o;
            this.f11311l = f11297p;
            this.f11312m = f11298q;
            this.f11313n = f11299r;
        }

        public C2782f(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Float f, Float f2, Float f3, Float f4, Long l, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
            this.f11300a = num == null ? 587202559 : num;
            if (num2 != null) {
                this.f11301b = num2;
            } else {
                this.f11301b = -1;
            }
            if (num3 != null) {
                this.f11302c = num3;
            } else {
                this.f11302c = 800;
            }
            if (num4 != null) {
                this.f11303d = num4;
            } else {
                this.f11303d = 3;
            }
            if (num5 != null) {
                this.f11304e = num5;
            } else {
                this.f11304e = 3;
            }
            if (f != null) {
                this.f11305f = f;
            } else {
                this.f11305f = Float.valueOf(12.0f);
            }
            if (f2 != null) {
                this.f11306g = f2;
            } else {
                this.f11306g = Float.valueOf(1.4f);
            }
            if (f3 != null) {
                this.f11307h = f3;
            } else {
                this.f11307h = Float.valueOf(3.0f);
            }
            if (f4 != null) {
                this.f11308i = f4;
            } else {
                this.f11308i = Float.valueOf(6.0f);
            }
            if (l != null) {
                this.f11309j = l;
            } else {
                this.f11309j = -1L;
            }
            if (bool != null) {
                this.f11310k = bool;
            } else {
                this.f11310k = f11296o;
            }
            if (bool2 != null) {
                this.f11311l = bool2;
            } else {
                this.f11311l = f11297p;
            }
            if (bool3 != null) {
                this.f11312m = bool3;
            } else {
                this.f11312m = f11298q;
            }
            if (l != null) {
                this.f11313n = bool4;
            } else {
                this.f11313n = f11299r;
            }
        }
    }

    public DilatingDotsProgressBar(Context context) {
        this(context, null);
    }

    public DilatingDotsProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null);
    }

    public DilatingDotsProgressBar(Context context, AttributeSet attributeSet, int i, C2782f c2782f) {
        super(context, attributeSet, i);
        this.mAnimations = new ArrayList();
        this.mDelayedShow = new RunnableC2777a();
        this.mDelayedHide = new RunnableC2778b();
        this.mDrawables = new ArrayList<>();
        init(c2782f);
    }

    private void calculateMaxRadius() {
        this.mDotMaxRadius = this.mDotRadius * this.mDotScaleMultiplier;
    }

    private void calculateWidthBetweenDotCenters() {
        this.mWidthBetweenDotCenters = ((int) (this.mDotRadius * 2.0f)) + ((int) this.mHorizontalSpacing);
    }

    private float computeMaxHeight() {
        return this.mDotMaxRadius * 2.0f;
    }

    private float computeMaxWidth() {
        return computeWidth() + ((this.mDotMaxRadius - this.mDotRadius) * 2.0f);
    }

    private float computeWidth() {
        return (((this.mDotRadius * 2.0f) + this.mHorizontalSpacing) * this.mDrawables.size()) - this.mHorizontalSpacing;
    }

    private void init(C2782f c2782f) {
        if (c2782f == null) {
            c2782f = new C2782f();
        }
        this.mDotColor = c2782f.f11300a.intValue();
        this.mDotEndColor = c2782f.f11301b.intValue();
        this.mAnimationDuration = c2782f.f11302c.intValue();
        this.mWidthBetweenDotCenters = c2782f.f11303d.intValue();
        this.mNumberDots = c2782f.f11304e.intValue();
        this.mDotRadius = c2782f.f11305f.floatValue();
        this.mDotScaleMultiplier = c2782f.f11306g.floatValue();
        this.mDotMaxRadius = c2782f.f11307h.floatValue();
        this.mHorizontalSpacing = c2782f.f11308i.floatValue();
        this.mStartTime = c2782f.f11309j.longValue();
        this.mShouldAnimate = c2782f.f11310k.booleanValue();
        this.mDismissed = c2782f.f11311l.booleanValue();
        this.mIsRunning = c2782f.f11312m.booleanValue();
        this.mAnimateColors = c2782f.f11313n.booleanValue();
        calculateMaxRadius();
        calculateWidthBetweenDotCenters();
        initDots();
        updateDots();
    }

    private void initDots() {
        this.mDrawables.clear();
        this.mAnimations.clear();
        for (int i = 1; i <= this.mNumberDots; i++) {
            DilatingDotDrawable dilatingDotDrawable = new DilatingDotDrawable(this.mDotColor, this.mDotRadius, this.mDotMaxRadius);
            dilatingDotDrawable.setCallback(this);
            this.mDrawables.add(dilatingDotDrawable);
            double d = this.mAnimationDuration;
            Double.isNaN(d);
            long j = (i - 1) * ((int) (d * 0.35d));
            float f = this.mDotRadius;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dilatingDotDrawable, "radius", f, this.mDotMaxRadius, f);
            ofFloat.setDuration(this.mAnimationDuration);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            if (i == this.mNumberDots) {
                ofFloat.addListener(new C2779c());
            }
            ofFloat.setStartDelay(j);
            this.mAnimations.add(ofFloat);
            if (this.mAnimateColors) {
                ValueAnimator ofInt = ValueAnimator.ofInt(this.mDotEndColor, this.mDotColor);
                ofInt.setDuration(this.mAnimationDuration);
                ofInt.setEvaluator(new ArgbEvaluator());
                ofInt.addUpdateListener(new C2780d(this, dilatingDotDrawable));
                if (i == this.mNumberDots) {
                    ofInt.addListener(new C2781e());
                }
                ofInt.setStartDelay(j);
                this.mAnimations.add(ofInt);
            }
        }
    }

    private void removeCallbacks() {
        removeCallbacks(this.mDelayedHide);
        removeCallbacks(this.mDelayedShow);
    }

    private void setupDots() {
        initDots();
        updateDots();
        showNow();
    }

    private void updateDots() {
        if (this.mDotRadius <= 0.0f) {
            this.mDotRadius = (getHeight() / 2) / this.mDotScaleMultiplier;
        }
        float f = this.mDotMaxRadius;
        float f2 = this.mDotRadius;
        int i = (int) (f - f2);
        int i2 = ((int) (i + (f2 * 2.0f))) + 2;
        int i3 = ((int) (f * 2.0f)) + 2;
        for (int i4 = 0; i4 < this.mDrawables.size(); i4++) {
            DilatingDotDrawable dilatingDotDrawable = this.mDrawables.get(i4);
            dilatingDotDrawable.setRadius(this.mDotRadius);
            dilatingDotDrawable.setBounds(i, 0, i2, i3);
            ValueAnimator valueAnimator = (ValueAnimator) this.mAnimations.get(i4);
            float f3 = this.mDotRadius;
            valueAnimator.setFloatValues(f3, this.mDotScaleMultiplier * f3, f3);
            int i5 = this.mWidthBetweenDotCenters;
            i += i5;
            i2 += i5;
        }
    }

    public int getDotGrowthSpeed() {
        return this.mAnimationDuration;
    }

    public float getDotRadius() {
        return this.mDotRadius;
    }

    public float getDotScaleMultiplier() {
        return this.mDotScaleMultiplier;
    }

    public float getHorizontalSpacing() {
        return this.mHorizontalSpacing;
    }

    public int getNumberOfDots() {
        return this.mNumberDots;
    }

    public void hide() {
        hide(500);
    }

    public void hide(int i) {
        this.mDismissed = true;
        removeCallbacks(this.mDelayedShow);
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.mStartTime;
        long j2 = currentTimeMillis - j;
        long j3 = i;
        if (j2 < j3 && j != -1) {
            long j4 = j3 - j2;
            if (j4 > 0) {
                postDelayed(this.mDelayedHide, j4);
                return;
            }
        }
        this.mDelayedHide.run();
    }

    public void hideNow() {
        hide(0);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (shouldAnimate()) {
            Iterator<DilatingDotDrawable> it = this.mDrawables.iterator();
            while (it.hasNext()) {
                it.next().draw(canvas);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension((int) computeMaxWidth(), (int) computeMaxHeight());
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (computeMaxHeight() == i2 && i == computeMaxWidth()) {
            return;
        }
        updateDots();
    }

    public void reset() {
        hideNow();
    }

    public void setDotColor(int i) {
        if (i != this.mDotColor) {
            if (!this.mAnimateColors) {
                this.mDotColor = i;
                Iterator<DilatingDotDrawable> it = this.mDrawables.iterator();
                while (it.hasNext()) {
                    it.next().setColor(this.mDotColor);
                }
                return;
            }
            reset();
            this.mDotColor = i;
            this.mDotEndColor = i;
            this.mAnimateColors = false;
            setupDots();
        }
    }

    public void setDotColors(int i, int i2) {
        if (this.mDotColor == i && this.mDotEndColor == i2) {
            return;
        }
        if (this.mAnimateColors) {
            reset();
        }
        this.mDotColor = i;
        this.mDotEndColor = i2;
        this.mAnimateColors = i != i2;
        setupDots();
    }

    public void setDotRadius(float f) {
        reset();
        this.mDotRadius = f;
        calculateMaxRadius();
        calculateWidthBetweenDotCenters();
        setupDots();
    }

    public void setDotScaleMultiplier(float f) {
        reset();
        this.mDotScaleMultiplier = f;
        calculateMaxRadius();
        setupDots();
    }

    public void setDotSpacing(float f) {
        reset();
        this.mHorizontalSpacing = f;
        calculateWidthBetweenDotCenters();
        setupDots();
    }

    public void setGrowthSpeed(int i) {
        reset();
        this.mAnimationDuration = i;
        setupDots();
    }

    public void setNumberOfDots(int i) {
        reset();
        this.mNumberDots = i;
        setupDots();
    }

    protected boolean shouldAnimate() {
        return this.mShouldAnimate;
    }

    public void show() {
        show(500);
    }

    public void show(int i) {
        if (this.mIsRunning) {
            return;
        }
        this.mIsRunning = true;
        this.mStartTime = -1L;
        this.mDismissed = false;
        removeCallbacks(this.mDelayedHide);
        if (i == 0) {
            this.mDelayedShow.run();
        } else {
            postDelayed(this.mDelayedShow, i);
        }
    }

    public void showNow() {
        show(0);
    }

    protected void startAnimations() {
        this.mShouldAnimate = true;
        Iterator<Animator> it = this.mAnimations.iterator();
        while (it.hasNext()) {
            it.next().start();
        }
    }

    protected void stopAnimations() {
        this.mShouldAnimate = false;
        removeCallbacks();
        Iterator<Animator> it = this.mAnimations.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        try {
            return shouldAnimate() ? this.mDrawables.contains(drawable) : super.verifyDrawable(drawable);
        } catch (Exception unused) {
            return false;
        }
    }
}
