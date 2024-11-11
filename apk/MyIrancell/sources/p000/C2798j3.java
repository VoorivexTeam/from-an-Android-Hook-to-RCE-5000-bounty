package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: j3 */
/* loaded from: classes.dex */
public class C2798j3 {

    /* renamed from: w */
    private static final Interpolator f11432w = new a();

    /* renamed from: a */
    private int f11433a;

    /* renamed from: b */
    private int f11434b;

    /* renamed from: d */
    private float[] f11436d;

    /* renamed from: e */
    private float[] f11437e;

    /* renamed from: f */
    private float[] f11438f;

    /* renamed from: g */
    private float[] f11439g;

    /* renamed from: h */
    private int[] f11440h;

    /* renamed from: i */
    private int[] f11441i;

    /* renamed from: j */
    private int[] f11442j;

    /* renamed from: k */
    private int f11443k;

    /* renamed from: l */
    private VelocityTracker f11444l;

    /* renamed from: m */
    private float f11445m;

    /* renamed from: n */
    private float f11446n;

    /* renamed from: o */
    private int f11447o;

    /* renamed from: p */
    private int f11448p;

    /* renamed from: q */
    private OverScroller f11449q;

    /* renamed from: r */
    private final c f11450r;

    /* renamed from: s */
    private View f11451s;

    /* renamed from: t */
    private boolean f11452t;

    /* renamed from: u */
    private final ViewGroup f11453u;

    /* renamed from: c */
    private int f11435c = -1;

    /* renamed from: v */
    private final Runnable f11454v = new b();

    /* renamed from: j3$a */
    /* loaded from: classes.dex */
    static class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: j3$b */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2798j3.this.m13384b(0);
        }
    }

    /* renamed from: j3$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        /* renamed from: a */
        public int m13390a(int i) {
            return i;
        }

        /* renamed from: a */
        public int mo10070a(View view) {
            return 0;
        }

        /* renamed from: a */
        public abstract int mo10071a(View view, int i, int i2);

        /* renamed from: a */
        public void m13391a(int i, int i2) {
        }

        /* renamed from: a */
        public abstract void mo10072a(View view, float f, float f2);

        /* renamed from: a */
        public void mo10073a(View view, int i) {
        }

        /* renamed from: a */
        public abstract void mo10074a(View view, int i, int i2, int i3, int i4);

        /* renamed from: b */
        public int mo10131b(View view) {
            return 0;
        }

        /* renamed from: b */
        public abstract int mo10075b(View view, int i, int i2);

        /* renamed from: b */
        public void m13392b(int i, int i2) {
        }

        /* renamed from: b */
        public boolean m13393b(int i) {
            return false;
        }

        /* renamed from: b */
        public abstract boolean mo10076b(View view, int i);

        /* renamed from: c */
        public abstract void mo10077c(int i);
    }

    private C2798j3(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f11453u = viewGroup;
        this.f11450r = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f11447o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f11434b = viewConfiguration.getScaledTouchSlop();
        this.f11445m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f11446n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f11449q = new OverScroller(context, f11432w);
    }

    /* renamed from: a */
    private float m13355a(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: a */
    private float m13356a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: a */
    private int m13357a(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: a */
    private int m13358a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int m13357a = m13357a(i3, (int) this.f11446n, (int) this.f11445m);
        int m13357a2 = m13357a(i4, (int) this.f11446n, (int) this.f11445m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(m13357a);
        int abs4 = Math.abs(m13357a2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (m13357a != 0) {
            f = abs3;
            f2 = i5;
        } else {
            f = abs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (m13357a2 != 0) {
            f3 = abs4;
            f4 = i5;
        } else {
            f3 = abs2;
            f4 = i6;
        }
        return (int) ((m13366b(i, m13357a, this.f11450r.mo10070a(view)) * f5) + (m13366b(i2, m13357a2, this.f11450r.mo10131b(view)) * (f3 / f4)));
    }

    /* renamed from: a */
    public static C2798j3 m13359a(ViewGroup viewGroup, float f, c cVar) {
        C2798j3 m13360a = m13360a(viewGroup, cVar);
        m13360a.f11434b = (int) (m13360a.f11434b * (1.0f / f));
        return m13360a;
    }

    /* renamed from: a */
    public static C2798j3 m13360a(ViewGroup viewGroup, c cVar) {
        return new C2798j3(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: a */
    private void m13361a(float f, float f2) {
        this.f11452t = true;
        this.f11450r.mo10072a(this.f11451s, f, f2);
        this.f11452t = false;
        if (this.f11433a == 1) {
            m13384b(0);
        }
    }

    /* renamed from: a */
    private void m13362a(float f, float f2, int i) {
        int i2 = m13364a(f, f2, i, 1) ? 1 : 0;
        if (m13364a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m13364a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m13364a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f11441i;
            iArr[i] = iArr[i] | i2;
            this.f11450r.m13391a(i2, i);
        }
    }

    /* renamed from: a */
    private void m13363a(int i, int i2, int i3, int i4) {
        int left = this.f11451s.getLeft();
        int top = this.f11451s.getTop();
        if (i3 != 0) {
            i = this.f11450r.mo10071a(this.f11451s, i, i3);
            C3107q2.m14906c(this.f11451s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f11450r.mo10075b(this.f11451s, i2, i4);
            C3107q2.m14908d(this.f11451s, i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.f11450r.mo10074a(this.f11451s, i5, i6, i5 - left, i6 - top);
    }

    /* renamed from: a */
    private boolean m13364a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f11440h[i] & i2) != i2 || (this.f11448p & i2) == 0 || (this.f11442j[i] & i2) == i2 || (this.f11441i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f11434b;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f11450r.m13393b(i2)) {
            return (this.f11441i[i] & i2) == 0 && abs > ((float) this.f11434b);
        }
        int[] iArr = this.f11442j;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    /* renamed from: a */
    private boolean m13365a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f11450r.mo10070a(view) > 0;
        boolean z2 = this.f11450r.mo10131b(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f11434b) : z2 && Math.abs(f2) > ((float) this.f11434b);
        }
        float f3 = (f * f) + (f2 * f2);
        int i = this.f11434b;
        return f3 > ((float) (i * i));
    }

    /* renamed from: b */
    private int m13366b(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f11453u.getWidth();
        float f = width / 2;
        float m13355a = f + (m13355a(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(m13355a / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: b */
    private void m13367b(float f, float f2, int i) {
        m13374d(i);
        float[] fArr = this.f11436d;
        this.f11438f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f11437e;
        this.f11439g[i] = f2;
        fArr2[i] = f2;
        this.f11440h[i] = m13372d((int) f, (int) f2);
        this.f11443k |= 1 << i;
    }

    /* renamed from: b */
    private boolean m13368b(int i, int i2, int i3, int i4) {
        int left = this.f11451s.getLeft();
        int top = this.f11451s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f11449q.abortAnimation();
            m13384b(0);
            return false;
        }
        this.f11449q.startScroll(left, top, i5, i6, m13358a(this.f11451s, i5, i6, i3, i4));
        m13384b(2);
        return true;
    }

    /* renamed from: c */
    private void m13369c() {
        float[] fArr = this.f11436d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f11437e, 0.0f);
        Arrays.fill(this.f11438f, 0.0f);
        Arrays.fill(this.f11439g, 0.0f);
        Arrays.fill(this.f11440h, 0);
        Arrays.fill(this.f11441i, 0);
        Arrays.fill(this.f11442j, 0);
        this.f11443k = 0;
    }

    /* renamed from: c */
    private void m13370c(int i) {
        if (this.f11436d == null || !m13380a(i)) {
            return;
        }
        this.f11436d[i] = 0.0f;
        this.f11437e[i] = 0.0f;
        this.f11438f[i] = 0.0f;
        this.f11439g[i] = 0.0f;
        this.f11440h[i] = 0;
        this.f11441i[i] = 0;
        this.f11442j[i] = 0;
        this.f11443k = ((1 << i) ^ (-1)) & this.f11443k;
    }

    /* renamed from: c */
    private void m13371c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m13375e(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f11438f[pointerId] = x;
                this.f11439g[pointerId] = y;
            }
        }
    }

    /* renamed from: d */
    private int m13372d(int i, int i2) {
        int i3 = i < this.f11453u.getLeft() + this.f11447o ? 1 : 0;
        if (i2 < this.f11453u.getTop() + this.f11447o) {
            i3 |= 4;
        }
        if (i > this.f11453u.getRight() - this.f11447o) {
            i3 |= 2;
        }
        return i2 > this.f11453u.getBottom() - this.f11447o ? i3 | 8 : i3;
    }

    /* renamed from: d */
    private void m13373d() {
        this.f11444l.computeCurrentVelocity(1000, this.f11445m);
        m13361a(m13356a(this.f11444l.getXVelocity(this.f11435c), this.f11446n, this.f11445m), m13356a(this.f11444l.getYVelocity(this.f11435c), this.f11446n, this.f11445m));
    }

    /* renamed from: d */
    private void m13374d(int i) {
        float[] fArr = this.f11436d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            float[] fArr6 = this.f11436d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f11437e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f11438f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f11439g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f11440h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f11441i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f11442j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f11436d = fArr2;
            this.f11437e = fArr3;
            this.f11438f = fArr4;
            this.f11439g = fArr5;
            this.f11440h = iArr;
            this.f11441i = iArr2;
            this.f11442j = iArr3;
        }
    }

    /* renamed from: e */
    private boolean m13375e(int i) {
        if (m13380a(i)) {
            return true;
        }
        String str = "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.";
        return false;
    }

    /* renamed from: a */
    public View m13376a(int i, int i2) {
        for (int childCount = this.f11453u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f11453u;
            this.f11450r.m13390a(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m13377a() {
        this.f11435c = -1;
        m13369c();
        VelocityTracker velocityTracker = this.f11444l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11444l = null;
        }
    }

    /* renamed from: a */
    public void m13378a(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m13377a();
        }
        if (this.f11444l == null) {
            this.f11444l = VelocityTracker.obtain();
        }
        this.f11444l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View m13376a = m13376a((int) x, (int) y);
            m13367b(x, y, pointerId);
            m13387b(m13376a, pointerId);
            int i3 = this.f11440h[pointerId];
            int i4 = this.f11448p;
            if ((i3 & i4) != 0) {
                this.f11450r.m13392b(i3 & i4, pointerId);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f11433a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (m13375e(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f11436d[pointerId2];
                            float f2 = y2 - this.f11437e[pointerId2];
                            m13362a(f, f2, pointerId2);
                            if (this.f11433a != 1) {
                                View m13376a2 = m13376a((int) x2, (int) y2);
                                if (m13365a(m13376a2, f, f2) && m13387b(m13376a2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                } else {
                    if (!m13375e(this.f11435c)) {
                        return;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.f11435c);
                    float x3 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f11438f;
                    int i5 = this.f11435c;
                    int i6 = (int) (x3 - fArr[i5]);
                    int i7 = (int) (y3 - this.f11439g[i5]);
                    m13363a(this.f11451s.getLeft() + i6, this.f11451s.getTop() + i7, i6, i7);
                }
                m13371c(motionEvent);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x4 = motionEvent.getX(actionIndex);
                    float y4 = motionEvent.getY(actionIndex);
                    m13367b(x4, y4, pointerId3);
                    if (this.f11433a != 0) {
                        if (m13385b((int) x4, (int) y4)) {
                            m13387b(this.f11451s, pointerId3);
                            return;
                        }
                        return;
                    } else {
                        m13387b(m13376a((int) x4, (int) y4), pointerId3);
                        int i8 = this.f11440h[pointerId3];
                        int i9 = this.f11448p;
                        if ((i8 & i9) != 0) {
                            this.f11450r.m13392b(i8 & i9, pointerId3);
                            return;
                        }
                        return;
                    }
                }
                if (actionMasked != 6) {
                    return;
                }
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f11433a == 1 && pointerId4 == this.f11435c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount2) {
                            i = -1;
                            break;
                        }
                        int pointerId5 = motionEvent.getPointerId(i2);
                        if (pointerId5 != this.f11435c) {
                            View m13376a3 = m13376a((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f11451s;
                            if (m13376a3 == view && m13387b(view, pointerId5)) {
                                i = this.f11435c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m13373d();
                    }
                }
                m13370c(pointerId4);
                return;
            }
            if (this.f11433a == 1) {
                m13361a(0.0f, 0.0f);
            }
        } else if (this.f11433a == 1) {
            m13373d();
        }
        m13377a();
    }

    /* renamed from: a */
    public void m13379a(View view, int i) {
        if (view.getParent() == this.f11453u) {
            this.f11451s = view;
            this.f11435c = i;
            this.f11450r.mo10073a(view, i);
            m13384b(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f11453u + ")");
    }

    /* renamed from: a */
    public boolean m13380a(int i) {
        return ((1 << i) & this.f11443k) != 0;
    }

    /* renamed from: a */
    public boolean m13381a(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: a */
    public boolean m13382a(boolean z) {
        if (this.f11433a == 2) {
            boolean computeScrollOffset = this.f11449q.computeScrollOffset();
            int currX = this.f11449q.getCurrX();
            int currY = this.f11449q.getCurrY();
            int left = currX - this.f11451s.getLeft();
            int top = currY - this.f11451s.getTop();
            if (left != 0) {
                C3107q2.m14906c(this.f11451s, left);
            }
            if (top != 0) {
                C3107q2.m14908d(this.f11451s, top);
            }
            if (left != 0 || top != 0) {
                this.f11450r.mo10074a(this.f11451s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f11449q.getFinalX() && currY == this.f11449q.getFinalY()) {
                this.f11449q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f11453u.post(this.f11454v);
                } else {
                    m13384b(0);
                }
            }
        }
        return this.f11433a == 2;
    }

    /* renamed from: b */
    public int m13383b() {
        return this.f11434b;
    }

    /* renamed from: b */
    void m13384b(int i) {
        this.f11453u.removeCallbacks(this.f11454v);
        if (this.f11433a != i) {
            this.f11433a = i;
            this.f11450r.mo10077c(i);
            if (this.f11433a == 0) {
                this.f11451s = null;
            }
        }
    }

    /* renamed from: b */
    public boolean m13385b(int i, int i2) {
        return m13381a(this.f11451s, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
    
        if (r12 != r11) goto L54;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m13386b(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2798j3.m13386b(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    boolean m13387b(View view, int i) {
        if (view == this.f11451s && this.f11435c == i) {
            return true;
        }
        if (view == null || !this.f11450r.mo10076b(view, i)) {
            return false;
        }
        this.f11435c = i;
        m13379a(view, i);
        return true;
    }

    /* renamed from: b */
    public boolean m13388b(View view, int i, int i2) {
        this.f11451s = view;
        this.f11435c = -1;
        boolean m13368b = m13368b(i, i2, 0, 0);
        if (!m13368b && this.f11433a == 0 && this.f11451s != null) {
            this.f11451s = null;
        }
        return m13368b;
    }

    /* renamed from: c */
    public boolean m13389c(int i, int i2) {
        if (this.f11452t) {
            return m13368b(i, i2, (int) this.f11444l.getXVelocity(this.f11435c), (int) this.f11444l.getYVelocity(this.f11435c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }
}
