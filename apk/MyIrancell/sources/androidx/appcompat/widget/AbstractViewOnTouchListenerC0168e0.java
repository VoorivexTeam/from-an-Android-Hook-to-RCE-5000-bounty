package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.InterfaceC0110s;

/* renamed from: androidx.appcompat.widget.e0 */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0168e0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    private final float f993b;

    /* renamed from: c */
    private final int f994c;

    /* renamed from: d */
    private final int f995d;

    /* renamed from: e */
    final View f996e;

    /* renamed from: f */
    private Runnable f997f;

    /* renamed from: g */
    private Runnable f998g;

    /* renamed from: h */
    private boolean f999h;

    /* renamed from: i */
    private int f1000i;

    /* renamed from: j */
    private final int[] f1001j = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.e0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC0168e0.this.f996e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.e0$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0168e0.this.m957d();
        }
    }

    public AbstractViewOnTouchListenerC0168e0(View view) {
        this.f996e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f993b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f994c = tapTimeout;
        this.f995d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private boolean m951a(MotionEvent motionEvent) {
        C0164c0 c0164c0;
        View view = this.f996e;
        InterfaceC0110s mo562a = mo562a();
        if (mo562a == null || !mo562a.mo615d() || (c0164c0 = (C0164c0) mo562a.mo609b()) == null || !c0164c0.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m953a(view, obtainNoHistory);
        m955b(c0164c0, obtainNoHistory);
        boolean m936a = c0164c0.m936a(obtainNoHistory, this.f1000i);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return m936a && (actionMasked != 1 && actionMasked != 3);
    }

    /* renamed from: a */
    private static boolean m952a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    private boolean m953a(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1001j);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m954b(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f996e
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1000i
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f993b
            boolean r6 = m952a(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.m956e()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.m956e()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1000i = r6
            java.lang.Runnable r6 = r5.f997f
            if (r6 != 0) goto L52
            androidx.appcompat.widget.e0$a r6 = new androidx.appcompat.widget.e0$a
            r6.<init>()
            r5.f997f = r6
        L52:
            java.lang.Runnable r6 = r5.f997f
            int r1 = r5.f994c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f998g
            if (r6 != 0) goto L65
            androidx.appcompat.widget.e0$b r6 = new androidx.appcompat.widget.e0$b
            r6.<init>()
            r5.f998g = r6
        L65:
            java.lang.Runnable r6 = r5.f998g
            int r1 = r5.f995d
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractViewOnTouchListenerC0168e0.m954b(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    private boolean m955b(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1001j);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    /* renamed from: e */
    private void m956e() {
        Runnable runnable = this.f998g;
        if (runnable != null) {
            this.f996e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f997f;
        if (runnable2 != null) {
            this.f996e.removeCallbacks(runnable2);
        }
    }

    /* renamed from: a */
    public abstract InterfaceC0110s mo562a();

    /* renamed from: b */
    protected abstract boolean mo563b();

    /* renamed from: c */
    protected boolean mo784c() {
        InterfaceC0110s mo562a = mo562a();
        if (mo562a == null || !mo562a.mo615d()) {
            return true;
        }
        mo562a.dismiss();
        return true;
    }

    /* renamed from: d */
    void m957d() {
        m956e();
        View view = this.f996e;
        if (view.isEnabled() && !view.isLongClickable() && mo563b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f999h = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f999h;
        if (z2) {
            z = m951a(motionEvent) || !mo784c();
        } else {
            z = m954b(motionEvent) && mo563b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f996e.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f999h = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f999h = false;
        this.f1000i = -1;
        Runnable runnable = this.f997f;
        if (runnable != null) {
            this.f996e.removeCallbacks(runnable);
        }
    }
}
