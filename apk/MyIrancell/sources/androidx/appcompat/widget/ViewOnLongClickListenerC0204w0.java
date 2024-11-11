package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p000.C3107q2;
import p000.C3149r2;

/* renamed from: androidx.appcompat.widget.w0 */
/* loaded from: classes.dex */
class ViewOnLongClickListenerC0204w0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k */
    private static ViewOnLongClickListenerC0204w0 f1282k;

    /* renamed from: l */
    private static ViewOnLongClickListenerC0204w0 f1283l;

    /* renamed from: b */
    private final View f1284b;

    /* renamed from: c */
    private final CharSequence f1285c;

    /* renamed from: d */
    private final int f1286d;

    /* renamed from: e */
    private final Runnable f1287e = new a();

    /* renamed from: f */
    private final Runnable f1288f = new b();

    /* renamed from: g */
    private int f1289g;

    /* renamed from: h */
    private int f1290h;

    /* renamed from: i */
    private C0206x0 f1291i;

    /* renamed from: j */
    private boolean f1292j;

    /* renamed from: androidx.appcompat.widget.w0$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerC0204w0.this.m1207a(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.w0$b */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerC0204w0.this.m1206a();
        }
    }

    private ViewOnLongClickListenerC0204w0(View view, CharSequence charSequence) {
        this.f1284b = view;
        this.f1285c = charSequence;
        this.f1286d = C3149r2.m15169a(ViewConfiguration.get(view.getContext()));
        m1204c();
        this.f1284b.setOnLongClickListener(this);
        this.f1284b.setOnHoverListener(this);
    }

    /* renamed from: a */
    public static void m1200a(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC0204w0 viewOnLongClickListenerC0204w0 = f1282k;
        if (viewOnLongClickListenerC0204w0 != null && viewOnLongClickListenerC0204w0.f1284b == view) {
            m1201a((ViewOnLongClickListenerC0204w0) null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC0204w0(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0204w0 viewOnLongClickListenerC0204w02 = f1283l;
        if (viewOnLongClickListenerC0204w02 != null && viewOnLongClickListenerC0204w02.f1284b == view) {
            viewOnLongClickListenerC0204w02.m1206a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* renamed from: a */
    private static void m1201a(ViewOnLongClickListenerC0204w0 viewOnLongClickListenerC0204w0) {
        ViewOnLongClickListenerC0204w0 viewOnLongClickListenerC0204w02 = f1282k;
        if (viewOnLongClickListenerC0204w02 != null) {
            viewOnLongClickListenerC0204w02.m1203b();
        }
        f1282k = viewOnLongClickListenerC0204w0;
        if (viewOnLongClickListenerC0204w0 != null) {
            viewOnLongClickListenerC0204w0.m1205d();
        }
    }

    /* renamed from: a */
    private boolean m1202a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f1289g) <= this.f1286d && Math.abs(y - this.f1290h) <= this.f1286d) {
            return false;
        }
        this.f1289g = x;
        this.f1290h = y;
        return true;
    }

    /* renamed from: b */
    private void m1203b() {
        this.f1284b.removeCallbacks(this.f1287e);
    }

    /* renamed from: c */
    private void m1204c() {
        this.f1289g = Integer.MAX_VALUE;
        this.f1290h = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m1205d() {
        this.f1284b.postDelayed(this.f1287e, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: a */
    void m1206a() {
        if (f1283l == this) {
            f1283l = null;
            C0206x0 c0206x0 = this.f1291i;
            if (c0206x0 != null) {
                c0206x0.m1211a();
                this.f1291i = null;
                m1204c();
                this.f1284b.removeOnAttachStateChangeListener(this);
            }
        }
        if (f1282k == this) {
            m1201a((ViewOnLongClickListenerC0204w0) null);
        }
        this.f1284b.removeCallbacks(this.f1288f);
    }

    /* renamed from: a */
    void m1207a(boolean z) {
        long longPressTimeout;
        if (C3107q2.m14931w(this.f1284b)) {
            m1201a((ViewOnLongClickListenerC0204w0) null);
            ViewOnLongClickListenerC0204w0 viewOnLongClickListenerC0204w0 = f1283l;
            if (viewOnLongClickListenerC0204w0 != null) {
                viewOnLongClickListenerC0204w0.m1206a();
            }
            f1283l = this;
            this.f1292j = z;
            C0206x0 c0206x0 = new C0206x0(this.f1284b.getContext());
            this.f1291i = c0206x0;
            c0206x0.m1212a(this.f1284b, this.f1289g, this.f1290h, this.f1292j, this.f1285c);
            this.f1284b.addOnAttachStateChangeListener(this);
            if (this.f1292j) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((C3107q2.m14925q(this.f1284b) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f1284b.removeCallbacks(this.f1288f);
            this.f1284b.postDelayed(this.f1288f, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1291i != null && this.f1292j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1284b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1204c();
                m1206a();
            }
        } else if (this.f1284b.isEnabled() && this.f1291i == null && m1202a(motionEvent)) {
            m1201a(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1289g = view.getWidth() / 2;
        this.f1290h = view.getHeight() / 2;
        m1207a(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m1206a();
    }
}
