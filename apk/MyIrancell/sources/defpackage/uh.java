package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public abstract class uh<T extends View, Z> extends mh<Z> {
    private static Integer g;
    protected final T b;
    private final a c;
    private View.OnAttachStateChangeListener d;
    private boolean e;
    private boolean f;

    /* loaded from: classes.dex */
    static final class a {
        static Integer e;
        private final View a;
        private final List<sh> b = new ArrayList();
        boolean c;
        private ViewTreeObserverOnPreDrawListenerC0082a d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: uh$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserverOnPreDrawListenerC0082a implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<a> b;

            ViewTreeObserverOnPreDrawListenerC0082a(a aVar) {
                this.b = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    String str = "OnGlobalLayoutListener called attachStateListener=" + this;
                }
                a aVar = this.b.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.a = view;
        }

        private int a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.c && this.a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            Log.isLoggable("ViewTarget", 4);
            return a(this.a.getContext());
        }

        private static int a(Context context) {
            if (e == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                ji.a(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return e.intValue();
        }

        private boolean a(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        private boolean a(int i, int i2) {
            return a(i) && a(i2);
        }

        private void b(int i, int i2) {
            Iterator it = new ArrayList(this.b).iterator();
            while (it.hasNext()) {
                ((sh) it.next()).a(i, i2);
            }
        }

        private int c() {
            int paddingTop = this.a.getPaddingTop() + this.a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return a(this.a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int d() {
            int paddingLeft = this.a.getPaddingLeft() + this.a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return a(this.a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        void a() {
            if (this.b.isEmpty()) {
                return;
            }
            int d = d();
            int c = c();
            if (a(d, c)) {
                b(d, c);
                b();
            }
        }

        void a(sh shVar) {
            int d = d();
            int c = c();
            if (a(d, c)) {
                shVar.a(d, c);
                return;
            }
            if (!this.b.contains(shVar)) {
                this.b.add(shVar);
            }
            if (this.d == null) {
                ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0082a viewTreeObserverOnPreDrawListenerC0082a = new ViewTreeObserverOnPreDrawListenerC0082a(this);
                this.d = viewTreeObserverOnPreDrawListenerC0082a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0082a);
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.d);
            }
            this.d = null;
            this.b.clear();
        }

        void b(sh shVar) {
            this.b.remove(shVar);
        }
    }

    public uh(T t) {
        ji.a(t);
        this.b = t;
        this.c = new a(t);
    }

    private void a(Object obj) {
        Integer num = g;
        if (num == null) {
            this.b.setTag(obj);
        } else {
            this.b.setTag(num.intValue(), obj);
        }
    }

    private Object e() {
        Integer num = g;
        return num == null ? this.b.getTag() : this.b.getTag(num.intValue());
    }

    private void f() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.d;
        if (onAttachStateChangeListener == null || this.f) {
            return;
        }
        this.b.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f = true;
    }

    private void g() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.d;
        if (onAttachStateChangeListener == null || !this.f) {
            return;
        }
        this.b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f = false;
    }

    @Override // defpackage.mh, defpackage.th
    public void a(fh fhVar) {
        a((Object) fhVar);
    }

    @Override // defpackage.th
    public void a(sh shVar) {
        this.c.b(shVar);
    }

    @Override // defpackage.mh, defpackage.th
    public void b(Drawable drawable) {
        super.b(drawable);
        f();
    }

    @Override // defpackage.th
    public void b(sh shVar) {
        this.c.a(shVar);
    }

    @Override // defpackage.mh, defpackage.th
    public fh c() {
        Object e = e();
        if (e == null) {
            return null;
        }
        if (e instanceof fh) {
            return (fh) e;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // defpackage.mh, defpackage.th
    public void c(Drawable drawable) {
        super.c(drawable);
        this.c.b();
        if (this.e) {
            return;
        }
        g();
    }

    public String toString() {
        return "Target for: " + this.b;
    }
}
