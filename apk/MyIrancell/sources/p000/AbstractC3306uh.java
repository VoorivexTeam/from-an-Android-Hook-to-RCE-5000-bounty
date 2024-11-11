package p000;

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
/* renamed from: uh */
/* loaded from: classes.dex */
public abstract class AbstractC3306uh<T extends View, Z> extends AbstractC2943mh<Z> {

    /* renamed from: g */
    private static Integer f13468g;

    /* renamed from: b */
    protected final T f13469b;

    /* renamed from: c */
    private final a f13470c;

    /* renamed from: d */
    private View.OnAttachStateChangeListener f13471d;

    /* renamed from: e */
    private boolean f13472e;

    /* renamed from: f */
    private boolean f13473f;

    /* renamed from: uh$a */
    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: e */
        static Integer f13474e;

        /* renamed from: a */
        private final View f13475a;

        /* renamed from: b */
        private final List<InterfaceC3210sh> f13476b = new ArrayList();

        /* renamed from: c */
        boolean f13477c;

        /* renamed from: d */
        private ViewTreeObserverOnPreDrawListenerC3576a f13478d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: uh$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserverOnPreDrawListenerC3576a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b */
            private final WeakReference<a> f13479b;

            ViewTreeObserverOnPreDrawListenerC3576a(a aVar) {
                this.f13479b = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    String str = "OnGlobalLayoutListener called attachStateListener=" + this;
                }
                a aVar = this.f13479b.get();
                if (aVar == null) {
                    return true;
                }
                aVar.m15808a();
                return true;
            }
        }

        a(View view) {
            this.f13475a = view;
        }

        /* renamed from: a */
        private int m15801a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f13477c && this.f13475a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f13475a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            Log.isLoggable("ViewTarget", 4);
            return m15802a(this.f13475a.getContext());
        }

        /* renamed from: a */
        private static int m15802a(Context context) {
            if (f13474e == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                C2816ji.m13459a(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f13474e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f13474e.intValue();
        }

        /* renamed from: a */
        private boolean m15803a(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: a */
        private boolean m15804a(int i, int i2) {
            return m15803a(i) && m15803a(i2);
        }

        /* renamed from: b */
        private void m15805b(int i, int i2) {
            Iterator it = new ArrayList(this.f13476b).iterator();
            while (it.hasNext()) {
                ((InterfaceC3210sh) it.next()).mo13715a(i, i2);
            }
        }

        /* renamed from: c */
        private int m15806c() {
            int paddingTop = this.f13475a.getPaddingTop() + this.f13475a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f13475a.getLayoutParams();
            return m15801a(this.f13475a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: d */
        private int m15807d() {
            int paddingLeft = this.f13475a.getPaddingLeft() + this.f13475a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f13475a.getLayoutParams();
            return m15801a(this.f13475a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: a */
        void m15808a() {
            if (this.f13476b.isEmpty()) {
                return;
            }
            int m15807d = m15807d();
            int m15806c = m15806c();
            if (m15804a(m15807d, m15806c)) {
                m15805b(m15807d, m15806c);
                m15810b();
            }
        }

        /* renamed from: a */
        void m15809a(InterfaceC3210sh interfaceC3210sh) {
            int m15807d = m15807d();
            int m15806c = m15806c();
            if (m15804a(m15807d, m15806c)) {
                interfaceC3210sh.mo13715a(m15807d, m15806c);
                return;
            }
            if (!this.f13476b.contains(interfaceC3210sh)) {
                this.f13476b.add(interfaceC3210sh);
            }
            if (this.f13478d == null) {
                ViewTreeObserver viewTreeObserver = this.f13475a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC3576a viewTreeObserverOnPreDrawListenerC3576a = new ViewTreeObserverOnPreDrawListenerC3576a(this);
                this.f13478d = viewTreeObserverOnPreDrawListenerC3576a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC3576a);
            }
        }

        /* renamed from: b */
        void m15810b() {
            ViewTreeObserver viewTreeObserver = this.f13475a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f13478d);
            }
            this.f13478d = null;
            this.f13476b.clear();
        }

        /* renamed from: b */
        void m15811b(InterfaceC3210sh interfaceC3210sh) {
            this.f13476b.remove(interfaceC3210sh);
        }
    }

    public AbstractC3306uh(T t) {
        C2816ji.m13459a(t);
        this.f13469b = t;
        this.f13470c = new a(t);
    }

    /* renamed from: a */
    private void m15797a(Object obj) {
        Integer num = f13468g;
        if (num == null) {
            this.f13469b.setTag(obj);
        } else {
            this.f13469b.setTag(num.intValue(), obj);
        }
    }

    /* renamed from: e */
    private Object m15798e() {
        Integer num = f13468g;
        return num == null ? this.f13469b.getTag() : this.f13469b.getTag(num.intValue());
    }

    /* renamed from: f */
    private void m15799f() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f13471d;
        if (onAttachStateChangeListener == null || this.f13473f) {
            return;
        }
        this.f13469b.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f13473f = true;
    }

    /* renamed from: g */
    private void m15800g() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f13471d;
        if (onAttachStateChangeListener == null || !this.f13473f) {
            return;
        }
        this.f13469b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f13473f = false;
    }

    @Override // p000.AbstractC2943mh, p000.InterfaceC3262th
    /* renamed from: a */
    public void mo14105a(InterfaceC2473fh interfaceC2473fh) {
        m15797a((Object) interfaceC2473fh);
    }

    @Override // p000.InterfaceC3262th
    /* renamed from: a */
    public void mo15272a(InterfaceC3210sh interfaceC3210sh) {
        this.f13470c.m15811b(interfaceC3210sh);
    }

    @Override // p000.AbstractC2943mh, p000.InterfaceC3262th
    /* renamed from: b */
    public void mo14106b(Drawable drawable) {
        super.mo14106b(drawable);
        m15799f();
    }

    @Override // p000.InterfaceC3262th
    /* renamed from: b */
    public void mo15273b(InterfaceC3210sh interfaceC3210sh) {
        this.f13470c.m15809a(interfaceC3210sh);
    }

    @Override // p000.AbstractC2943mh, p000.InterfaceC3262th
    /* renamed from: c */
    public InterfaceC2473fh mo14107c() {
        Object m15798e = m15798e();
        if (m15798e == null) {
            return null;
        }
        if (m15798e instanceof InterfaceC2473fh) {
            return (InterfaceC2473fh) m15798e;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p000.AbstractC2943mh, p000.InterfaceC3262th
    /* renamed from: c */
    public void mo14108c(Drawable drawable) {
        super.mo14108c(drawable);
        this.f13470c.m15810b();
        if (this.f13472e) {
            return;
        }
        m15800g();
    }

    public String toString() {
        return "Target for: " + this.f13469b;
    }
}
