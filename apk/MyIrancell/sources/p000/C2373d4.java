package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.core.content.C0237b;
import androidx.core.widget.C0255g;

/* renamed from: d4 */
/* loaded from: classes.dex */
public class C2373d4 extends ViewGroup implements InterfaceC2882l2, InterfaceC2575i2 {

    /* renamed from: P */
    private static final String f9646P = C2373d4.class.getSimpleName();

    /* renamed from: Q */
    private static final int[] f9647Q = {R.attr.enabled};

    /* renamed from: A */
    int f9648A;

    /* renamed from: B */
    int f9649B;

    /* renamed from: C */
    C0504c4 f9650C;

    /* renamed from: D */
    private Animation f9651D;

    /* renamed from: E */
    private Animation f9652E;

    /* renamed from: F */
    private Animation f9653F;

    /* renamed from: G */
    private Animation f9654G;

    /* renamed from: H */
    private Animation f9655H;

    /* renamed from: I */
    boolean f9656I;

    /* renamed from: J */
    private int f9657J;

    /* renamed from: K */
    boolean f9658K;

    /* renamed from: L */
    private i f9659L;

    /* renamed from: M */
    private Animation.AnimationListener f9660M;

    /* renamed from: N */
    private final Animation f9661N;

    /* renamed from: O */
    private final Animation f9662O;

    /* renamed from: b */
    private View f9663b;

    /* renamed from: c */
    j f9664c;

    /* renamed from: d */
    boolean f9665d;

    /* renamed from: e */
    private int f9666e;

    /* renamed from: f */
    private float f9667f;

    /* renamed from: g */
    private float f9668g;

    /* renamed from: h */
    private final C2919m2 f9669h;

    /* renamed from: i */
    private final C2797j2 f9670i;

    /* renamed from: j */
    private final int[] f9671j;

    /* renamed from: k */
    private final int[] f9672k;

    /* renamed from: l */
    private boolean f9673l;

    /* renamed from: m */
    private int f9674m;

    /* renamed from: n */
    int f9675n;

    /* renamed from: o */
    private float f9676o;

    /* renamed from: p */
    private float f9677p;

    /* renamed from: q */
    private boolean f9678q;

    /* renamed from: r */
    private int f9679r;

    /* renamed from: s */
    boolean f9680s;

    /* renamed from: t */
    private boolean f9681t;

    /* renamed from: u */
    private final DecelerateInterpolator f9682u;

    /* renamed from: v */
    C0449b4 f9683v;

    /* renamed from: w */
    private int f9684w;

    /* renamed from: x */
    protected int f9685x;

    /* renamed from: y */
    float f9686y;

    /* renamed from: z */
    protected int f9687z;

    /* renamed from: d4$a */
    /* loaded from: classes.dex */
    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            C2373d4 c2373d4 = C2373d4.this;
            if (!c2373d4.f9665d) {
                c2373d4.m11273c();
                return;
            }
            c2373d4.f9650C.setAlpha(255);
            C2373d4.this.f9650C.start();
            C2373d4 c2373d42 = C2373d4.this;
            if (c2373d42.f9656I && (jVar = c2373d42.f9664c) != null) {
                jVar.mo4929a();
            }
            C2373d4 c2373d43 = C2373d4.this;
            c2373d43.f9675n = c2373d43.f9683v.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d4$b */
    /* loaded from: classes.dex */
    public class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            C2373d4.this.setAnimationProgress(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d4$c */
    /* loaded from: classes.dex */
    public class c extends Animation {
        c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            C2373d4.this.setAnimationProgress(1.0f - f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d4$d */
    /* loaded from: classes.dex */
    public class d extends Animation {

        /* renamed from: b */
        final /* synthetic */ int f9691b;

        /* renamed from: c */
        final /* synthetic */ int f9692c;

        d(int i, int i2) {
            this.f9691b = i;
            this.f9692c = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            C2373d4.this.f9650C.setAlpha((int) (this.f9691b + ((this.f9692c - r0) * f)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d4$e */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C2373d4 c2373d4 = C2373d4.this;
            if (c2373d4.f9680s) {
                return;
            }
            c2373d4.m11271a((Animation.AnimationListener) null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: d4$f */
    /* loaded from: classes.dex */
    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            C2373d4 c2373d4 = C2373d4.this;
            int abs = !c2373d4.f9658K ? c2373d4.f9648A - Math.abs(c2373d4.f9687z) : c2373d4.f9648A;
            C2373d4 c2373d42 = C2373d4.this;
            C2373d4.this.setTargetOffsetTopAndBottom((c2373d42.f9685x + ((int) ((abs - r1) * f))) - c2373d42.f9683v.getTop());
            C2373d4.this.f9650C.m3555a(1.0f - f);
        }
    }

    /* renamed from: d4$g */
    /* loaded from: classes.dex */
    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            C2373d4.this.m11270a(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d4$h */
    /* loaded from: classes.dex */
    public class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            C2373d4 c2373d4 = C2373d4.this;
            float f2 = c2373d4.f9686y;
            c2373d4.setAnimationProgress(f2 + ((-f2) * f));
            C2373d4.this.m11270a(f);
        }
    }

    /* renamed from: d4$i */
    /* loaded from: classes.dex */
    public interface i {
        /* renamed from: a */
        boolean m11274a(C2373d4 c2373d4, View view);
    }

    /* renamed from: d4$j */
    /* loaded from: classes.dex */
    public interface j {
        /* renamed from: a */
        void mo4929a();
    }

    public C2373d4(Context context) {
        this(context, null);
    }

    public C2373d4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9665d = false;
        this.f9667f = -1.0f;
        this.f9671j = new int[2];
        this.f9672k = new int[2];
        this.f9679r = -1;
        this.f9684w = -1;
        this.f9660M = new a();
        this.f9661N = new f();
        this.f9662O = new g();
        this.f9666e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f9674m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f9682u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f9657J = (int) (displayMetrics.density * 40.0f);
        m11265d();
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.f9648A = i2;
        this.f9667f = i2;
        this.f9669h = new C2919m2(this);
        this.f9670i = new C2797j2(this);
        setNestedScrollingEnabled(true);
        int i3 = -this.f9657J;
        this.f9675n = i3;
        this.f9687z = i3;
        m11270a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9647Q);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private Animation m11255a(int i2, int i3) {
        d dVar = new d(i2, i3);
        dVar.setDuration(300L);
        this.f9683v.m3313a(null);
        this.f9683v.clearAnimation();
        this.f9683v.startAnimation(dVar);
        return dVar;
    }

    /* renamed from: a */
    private void m11256a(int i2, Animation.AnimationListener animationListener) {
        this.f9685x = i2;
        this.f9661N.reset();
        this.f9661N.setDuration(200L);
        this.f9661N.setInterpolator(this.f9682u);
        if (animationListener != null) {
            this.f9683v.m3313a(animationListener);
        }
        this.f9683v.clearAnimation();
        this.f9683v.startAnimation(this.f9661N);
    }

    /* renamed from: a */
    private void m11257a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9679r) {
            this.f9679r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: a */
    private void m11258a(boolean z, boolean z2) {
        if (this.f9665d != z) {
            this.f9656I = z2;
            m11267e();
            this.f9665d = z;
            if (z) {
                m11256a(this.f9675n, this.f9660M);
            } else {
                m11271a(this.f9660M);
            }
        }
    }

    /* renamed from: a */
    private boolean m11259a(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    /* renamed from: b */
    private void m11260b(float f2) {
        if (f2 > this.f9667f) {
            m11258a(true, true);
            return;
        }
        this.f9665d = false;
        this.f9650C.m3556a(0.0f, 0.0f);
        m11261b(this.f9675n, this.f9680s ? null : new e());
        this.f9650C.m3560a(false);
    }

    /* renamed from: b */
    private void m11261b(int i2, Animation.AnimationListener animationListener) {
        if (this.f9680s) {
            m11264c(i2, animationListener);
            return;
        }
        this.f9685x = i2;
        this.f9662O.reset();
        this.f9662O.setDuration(200L);
        this.f9662O.setInterpolator(this.f9682u);
        if (animationListener != null) {
            this.f9683v.m3313a(animationListener);
        }
        this.f9683v.clearAnimation();
        this.f9683v.startAnimation(this.f9662O);
    }

    /* renamed from: b */
    private void m11262b(Animation.AnimationListener animationListener) {
        this.f9683v.setVisibility(0);
        this.f9650C.setAlpha(255);
        b bVar = new b();
        this.f9651D = bVar;
        bVar.setDuration(this.f9674m);
        if (animationListener != null) {
            this.f9683v.m3313a(animationListener);
        }
        this.f9683v.clearAnimation();
        this.f9683v.startAnimation(this.f9651D);
    }

    /* renamed from: c */
    private void m11263c(float f2) {
        this.f9650C.m3560a(true);
        float min = Math.min(1.0f, Math.abs(f2 / this.f9667f));
        double d2 = min;
        Double.isNaN(d2);
        float max = (((float) Math.max(d2 - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - this.f9667f;
        int i2 = this.f9649B;
        if (i2 <= 0) {
            i2 = this.f9658K ? this.f9648A - this.f9687z : this.f9648A;
        }
        float f3 = i2;
        double max2 = Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f;
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f4 = ((float) (max2 - pow)) * 2.0f;
        int i3 = this.f9687z + ((int) ((f3 * min) + (f3 * f4 * 2.0f)));
        if (this.f9683v.getVisibility() != 0) {
            this.f9683v.setVisibility(0);
        }
        if (!this.f9680s) {
            this.f9683v.setScaleX(1.0f);
            this.f9683v.setScaleY(1.0f);
        }
        if (this.f9680s) {
            setAnimationProgress(Math.min(1.0f, f2 / this.f9667f));
        }
        if (f2 < this.f9667f) {
            if (this.f9650C.getAlpha() > 76 && !m11259a(this.f9653F)) {
                m11269g();
            }
        } else if (this.f9650C.getAlpha() < 255 && !m11259a(this.f9654G)) {
            m11268f();
        }
        this.f9650C.m3556a(0.0f, Math.min(0.8f, max * 0.8f));
        this.f9650C.m3555a(Math.min(1.0f, max));
        this.f9650C.m3562b((((max * 0.4f) - 0.25f) + (f4 * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i3 - this.f9675n);
    }

    /* renamed from: c */
    private void m11264c(int i2, Animation.AnimationListener animationListener) {
        this.f9685x = i2;
        this.f9686y = this.f9683v.getScaleX();
        h hVar = new h();
        this.f9655H = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f9683v.m3313a(animationListener);
        }
        this.f9683v.clearAnimation();
        this.f9683v.startAnimation(this.f9655H);
    }

    /* renamed from: d */
    private void m11265d() {
        this.f9683v = new C0449b4(getContext(), -328966);
        C0504c4 c0504c4 = new C0504c4(getContext());
        this.f9650C = c0504c4;
        c0504c4.m3559a(1);
        this.f9683v.setImageDrawable(this.f9650C);
        this.f9683v.setVisibility(8);
        addView(this.f9683v);
    }

    /* renamed from: d */
    private void m11266d(float f2) {
        float f3 = this.f9677p;
        float f4 = f2 - f3;
        int i2 = this.f9666e;
        if (f4 <= i2 || this.f9678q) {
            return;
        }
        this.f9676o = f3 + i2;
        this.f9678q = true;
        this.f9650C.setAlpha(76);
    }

    /* renamed from: e */
    private void m11267e() {
        if (this.f9663b == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.f9683v)) {
                    this.f9663b = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    private void m11268f() {
        this.f9654G = m11255a(this.f9650C.getAlpha(), 255);
    }

    /* renamed from: g */
    private void m11269g() {
        this.f9653F = m11255a(this.f9650C.getAlpha(), 76);
    }

    private void setColorViewAlpha(int i2) {
        this.f9683v.getBackground().setAlpha(i2);
        this.f9650C.setAlpha(i2);
    }

    /* renamed from: a */
    void m11270a(float f2) {
        setTargetOffsetTopAndBottom((this.f9685x + ((int) ((this.f9687z - r0) * f2))) - this.f9683v.getTop());
    }

    /* renamed from: a */
    void m11271a(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.f9652E = cVar;
        cVar.setDuration(150L);
        this.f9683v.m3313a(animationListener);
        this.f9683v.clearAnimation();
        this.f9683v.startAnimation(this.f9652E);
    }

    /* renamed from: a */
    public boolean mo4927a() {
        i iVar = this.f9659L;
        if (iVar != null) {
            return iVar.m11274a(this, this.f9663b);
        }
        View view = this.f9663b;
        return view instanceof ListView ? C0255g.m1584a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    /* renamed from: b */
    public boolean m11272b() {
        return this.f9665d;
    }

    /* renamed from: c */
    void m11273c() {
        this.f9683v.clearAnimation();
        this.f9650C.stop();
        this.f9683v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f9680s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f9687z - this.f9675n);
        }
        this.f9675n = this.f9683v.getTop();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.f9670i.m13334a(f2, f3, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f9670i.m13333a(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f9670i.m13339a(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f9670i.m13337a(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        int i4 = this.f9684w;
        return i4 < 0 ? i3 : i3 == i2 + (-1) ? i4 : i3 >= i4 ? i3 + 1 : i3;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f9669h.m13994a();
    }

    public int getProgressCircleDiameter() {
        return this.f9657J;
    }

    public int getProgressViewEndOffset() {
        return this.f9648A;
    }

    public int getProgressViewStartOffset() {
        return this.f9687z;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f9670i.m13332a();
    }

    @Override // android.view.View, p000.InterfaceC2575i2
    public boolean isNestedScrollingEnabled() {
        return this.f9670i.m13341b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m11273c();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        m11267e();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f9681t && actionMasked == 0) {
            this.f9681t = false;
        }
        if (!isEnabled() || this.f9681t || mo4927a() || this.f9665d || this.f9673l) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.f9679r;
                    if (i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) < 0) {
                        return false;
                    }
                    m11266d(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m11257a(motionEvent);
                    }
                }
            }
            this.f9678q = false;
            this.f9679r = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f9687z - this.f9683v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f9679r = pointerId;
            this.f9678q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f9677p = motionEvent.getY(findPointerIndex2);
        }
        return this.f9678q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f9663b == null) {
            m11267e();
        }
        View view = this.f9663b;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f9683v.getMeasuredWidth();
        int measuredHeight2 = this.f9683v.getMeasuredHeight();
        int i6 = measuredWidth / 2;
        int i7 = measuredWidth2 / 2;
        int i8 = this.f9675n;
        this.f9683v.layout(i6 - i7, i8, i6 + i7, measuredHeight2 + i8);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f9663b == null) {
            m11267e();
        }
        View view = this.f9663b;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f9683v.measure(View.MeasureSpec.makeMeasureSpec(this.f9657J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f9657J, 1073741824));
        this.f9684w = -1;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4) == this.f9683v) {
                this.f9684w = i4;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return dispatchNestedFling(f2, f3, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (i3 > 0) {
            float f2 = this.f9668g;
            if (f2 > 0.0f) {
                float f3 = i3;
                if (f3 > f2) {
                    iArr[1] = i3 - ((int) f2);
                    this.f9668g = 0.0f;
                } else {
                    this.f9668g = f2 - f3;
                    iArr[1] = i3;
                }
                m11263c(this.f9668g);
            }
        }
        if (this.f9658K && i3 > 0 && this.f9668g == 0.0f && Math.abs(i3 - iArr[1]) > 0) {
            this.f9683v.setVisibility(8);
        }
        int[] iArr2 = this.f9671j;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        dispatchNestedScroll(i2, i3, i4, i5, this.f9672k);
        if (i5 + this.f9672k[1] >= 0 || mo4927a()) {
            return;
        }
        float abs = this.f9668g + Math.abs(r11);
        this.f9668g = abs;
        m11263c(abs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f9669h.m13997a(view, view2, i2);
        startNestedScroll(i2 & 2);
        this.f9668g = 0.0f;
        this.f9673l = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (!isEnabled() || this.f9681t || this.f9665d || (i2 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public void onStopNestedScroll(View view) {
        this.f9669h.m13995a(view);
        this.f9673l = false;
        float f2 = this.f9668g;
        if (f2 > 0.0f) {
            m11260b(f2);
            this.f9668g = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f9681t && actionMasked == 0) {
            this.f9681t = false;
        }
        if (!isEnabled() || this.f9681t || mo4927a() || this.f9665d || this.f9673l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f9679r = motionEvent.getPointerId(0);
            this.f9678q = false;
        } else {
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f9679r);
                if (findPointerIndex < 0) {
                    return false;
                }
                if (this.f9678q) {
                    float y = (motionEvent.getY(findPointerIndex) - this.f9676o) * 0.5f;
                    this.f9678q = false;
                    m11260b(y);
                }
                this.f9679r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f9679r);
                if (findPointerIndex2 < 0) {
                    return false;
                }
                float y2 = motionEvent.getY(findPointerIndex2);
                m11266d(y2);
                if (this.f9678q) {
                    float f2 = (y2 - this.f9676o) * 0.5f;
                    if (f2 <= 0.0f) {
                        return false;
                    }
                    m11263c(f2);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        return false;
                    }
                    this.f9679r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    m11257a(motionEvent);
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.f9663b instanceof AbsListView)) {
            View view = this.f9663b;
            if (view == null || C3107q2.m14933y(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    void setAnimationProgress(float f2) {
        this.f9683v.setScaleX(f2);
        this.f9683v.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m11267e();
        this.f9650C.m3561a(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = C0237b.m1458a(context, iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.f9667f = i2;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m11273c();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f9670i.m13331a(z);
    }

    public void setOnChildScrollUpCallback(i iVar) {
        this.f9659L = iVar;
    }

    public void setOnRefreshListener(j jVar) {
        this.f9664c = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setProgressBackgroundColorSchemeColor(int i2) {
        this.f9683v.setBackgroundColor(i2);
    }

    public void setProgressBackgroundColorSchemeResource(int i2) {
        setProgressBackgroundColorSchemeColor(C0237b.m1458a(getContext(), i2));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f9665d == z) {
            m11258a(z, false);
            return;
        }
        this.f9665d = z;
        setTargetOffsetTopAndBottom((!this.f9658K ? this.f9648A + this.f9687z : this.f9648A) - this.f9675n);
        this.f9656I = false;
        m11262b(this.f9660M);
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            this.f9657J = (int) (getResources().getDisplayMetrics().density * (i2 == 0 ? 56.0f : 40.0f));
            this.f9683v.setImageDrawable(null);
            this.f9650C.m3559a(i2);
            this.f9683v.setImageDrawable(this.f9650C);
        }
    }

    public void setSlingshotDistance(int i2) {
        this.f9649B = i2;
    }

    void setTargetOffsetTopAndBottom(int i2) {
        this.f9683v.bringToFront();
        C3107q2.m14908d(this.f9683v, i2);
        this.f9675n = this.f9683v.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return this.f9670i.m13342b(i2);
    }

    @Override // android.view.View, p000.InterfaceC2575i2
    public void stopNestedScroll() {
        this.f9670i.m13343c();
    }
}
