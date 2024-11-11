package p000;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.core.R$id;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: q2 */
/* loaded from: classes.dex */
public class C3107q2 {

    /* renamed from: a */
    private static Field f12658a;

    /* renamed from: b */
    private static boolean f12659b;

    /* renamed from: c */
    private static Field f12660c;

    /* renamed from: d */
    private static boolean f12661d;

    /* renamed from: e */
    private static WeakHashMap<View, String> f12662e;

    /* renamed from: f */
    private static WeakHashMap<View, C3284u2> f12663f;

    /* renamed from: g */
    private static Field f12664g;

    /* renamed from: h */
    private static boolean f12665h;

    /* renamed from: i */
    private static ThreadLocal<Rect> f12666i;

    /* renamed from: q2$a */
    /* loaded from: classes.dex */
    static class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2965n2 f12667a;

        a(InterfaceC2965n2 interfaceC2965n2) {
            this.f12667a = interfaceC2965n2;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return (WindowInsets) C3460y2.m16552a(this.f12667a.mo445a(view, C3460y2.m16553a(windowInsets)));
        }
    }

    /* renamed from: q2$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        boolean m14935a(View view, KeyEvent keyEvent);
    }

    /* renamed from: q2$c */
    /* loaded from: classes.dex */
    static class c {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f12668d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f12669a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f12670b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f12671c = null;

        c() {
        }

        /* renamed from: a */
        private SparseArray<WeakReference<View>> m14936a() {
            if (this.f12670b == null) {
                this.f12670b = new SparseArray<>();
            }
            return this.f12670b;
        }

        /* renamed from: a */
        static c m14937a(View view) {
            c cVar = (c) view.getTag(R$id.tag_unhandled_key_event_manager);
            if (cVar != null) {
                return cVar;
            }
            c cVar2 = new c();
            view.setTag(R$id.tag_unhandled_key_event_manager, cVar2);
            return cVar2;
        }

        /* renamed from: b */
        private View m14938b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f12669a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View m14938b = m14938b(viewGroup.getChildAt(childCount), keyEvent);
                        if (m14938b != null) {
                            return m14938b;
                        }
                    }
                }
                if (m14940c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: b */
        private void m14939b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f12669a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (f12668d.isEmpty()) {
                return;
            }
            synchronized (f12668d) {
                if (this.f12669a == null) {
                    this.f12669a = new WeakHashMap<>();
                }
                for (int size = f12668d.size() - 1; size >= 0; size--) {
                    View view = f12668d.get(size).get();
                    if (view == null) {
                        f12668d.remove(size);
                    } else {
                        this.f12669a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f12669a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        private boolean m14940c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R$id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((b) arrayList.get(size)).m14935a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        boolean m14941a(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f12671c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f12671c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> m14936a = m14936a();
            if (keyEvent.getAction() == 1 && (indexOfKey = m14936a.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = m14936a.valueAt(indexOfKey);
                m14936a.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = m14936a.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && C3107q2.m14931w(view)) {
                m14940c(view, keyEvent);
            }
            return true;
        }

        /* renamed from: a */
        boolean m14942a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m14939b();
            }
            View m14938b = m14938b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (m14938b != null && !KeyEvent.isModifierKey(keyCode)) {
                    m14936a().put(keyCode, new WeakReference<>(m14938b));
                }
            }
            return m14938b != null;
        }
    }

    static {
        new AtomicInteger(1);
        f12663f = null;
        f12665h = false;
    }

    /* renamed from: A */
    public static void m14877A(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: B */
    public static void m14878B(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    public static void m14879C(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof InterfaceC2575i2) {
            ((InterfaceC2575i2) view).stopNestedScroll();
        }
    }

    /* renamed from: D */
    private static void m14880D(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: a */
    private static Rect m14881a() {
        if (f12666i == null) {
            f12666i = new ThreadLocal<>();
        }
        Rect rect = f12666i.get();
        if (rect == null) {
            rect = new Rect();
            f12666i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: a */
    public static C3284u2 m14882a(View view) {
        if (f12663f == null) {
            f12663f = new WeakHashMap<>();
        }
        C3284u2 c3284u2 = f12663f.get(view);
        if (c3284u2 != null) {
            return c3284u2;
        }
        C3284u2 c3284u22 = new C3284u2(view);
        f12663f.put(view, c3284u22);
        return c3284u22;
    }

    /* renamed from: a */
    public static C3460y2 m14883a(View view, C3460y2 c3460y2) {
        if (Build.VERSION.SDK_INT < 21) {
            return c3460y2;
        }
        WindowInsets windowInsets = (WindowInsets) C3460y2.m16552a(c3460y2);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (dispatchApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return C3460y2.m16553a(windowInsets);
    }

    /* renamed from: a */
    public static void m14884a(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: a */
    private static void m14885a(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m14880D(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m14880D((View) parent);
            }
        }
    }

    /* renamed from: a */
    public static void m14886a(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: a */
    public static void m14887a(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m14888a(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT < 21) {
            if (view instanceof InterfaceC3068p2) {
                ((InterfaceC3068p2) view).setSupportBackgroundTintList(colorStateList);
                return;
            }
            return;
        }
        view.setBackgroundTintList(colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m14889a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT < 21) {
            if (view instanceof InterfaceC3068p2) {
                ((InterfaceC3068p2) view).setSupportBackgroundTintMode(mode);
                return;
            }
            return;
        }
        view.setBackgroundTintMode(mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* renamed from: a */
    public static void m14890a(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: a */
    public static void m14891a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static void m14892a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: a */
    public static void m14893a(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: a */
    public static void m14894a(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f12662e == null) {
            f12662e = new WeakHashMap<>();
        }
        f12662e.put(view, str);
    }

    /* renamed from: a */
    public static void m14895a(View view, InterfaceC2965n2 interfaceC2965n2) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (interfaceC2965n2 == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new a(interfaceC2965n2));
            }
        }
    }

    /* renamed from: a */
    public static void m14896a(View view, C3011o2 c3011o2) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (c3011o2 != null ? c3011o2.m14414a() : null));
        }
    }

    /* renamed from: a */
    public static void m14897a(View view, C3508z1 c3508z1) {
        view.setAccessibilityDelegate(c3508z1 == null ? null : c3508z1.m16698a());
    }

    @Deprecated
    /* renamed from: a */
    public static void m14898a(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m14899a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return c.m14937a(view).m14942a(view, keyEvent);
    }

    /* renamed from: b */
    public static int m14900b(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: b */
    public static C3460y2 m14901b(View view, C3460y2 c3460y2) {
        if (Build.VERSION.SDK_INT < 21) {
            return c3460y2;
        }
        WindowInsets windowInsets = (WindowInsets) C3460y2.m16552a(c3460y2);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C3460y2.m16553a(windowInsets);
    }

    /* renamed from: b */
    private static void m14902b(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m14880D(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m14880D((View) parent);
            }
        }
    }

    /* renamed from: b */
    public static void m14903b(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m14904b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return c.m14937a(view).m14941a(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static ColorStateList m14905c(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof InterfaceC3068p2) {
            return ((InterfaceC3068p2) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: c */
    public static void m14906c(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        if (i2 < 21) {
            m14885a(view, i);
            return;
        }
        Rect m14881a = m14881a();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m14881a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !m14881a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m14885a(view, i);
        if (z && m14881a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m14881a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static PorterDuff.Mode m14907d(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof InterfaceC3068p2) {
            return ((InterfaceC3068p2) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: d */
    public static void m14908d(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        if (i2 < 21) {
            m14902b(view, i);
            return;
        }
        Rect m14881a = m14881a();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m14881a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !m14881a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m14902b(view, i);
        if (z && m14881a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m14881a);
        }
    }

    /* renamed from: e */
    public static Rect m14909e(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: e */
    public static void m14910e(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: f */
    public static Display m14911f(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m14931w(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: f */
    public static void m14912f(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19) {
            if (i2 < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        view.setImportantForAccessibility(i);
    }

    /* renamed from: g */
    public static float m14913g(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: g */
    public static void m14914g(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static void m14915h(View view, int i) {
        if (view instanceof InterfaceC2535h2) {
            ((InterfaceC2535h2) view).mo1525a(i);
        } else if (i == 0) {
            m14879C(view);
        }
    }

    /* renamed from: h */
    public static boolean m14916h(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: i */
    public static int m14917i(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: j */
    public static int m14918j(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: k */
    public static int m14919k(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: l */
    public static int m14920l(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f12661d) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f12660c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f12661d = true;
        }
        Field field = f12660c;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: m */
    public static int m14921m(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f12659b) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f12658a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f12659b = true;
        }
        Field field = f12658a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: n */
    public static int m14922n(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingEnd() : view.getPaddingRight();
    }

    /* renamed from: o */
    public static int m14923o(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingStart() : view.getPaddingLeft();
    }

    /* renamed from: p */
    public static String m14924p(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f12662e;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: q */
    public static int m14925q(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: r */
    public static float m14926r(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: s */
    public static boolean m14927s(View view) {
        if (f12665h) {
            return false;
        }
        if (f12664g == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f12664g = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f12665h = true;
                return false;
            }
        }
        try {
            return f12664g.get(view) != null;
        } catch (Throwable unused2) {
            f12665h = true;
            return false;
        }
    }

    /* renamed from: t */
    public static boolean m14928t(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: u */
    public static boolean m14929u(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: v */
    public static boolean m14930v(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: w */
    public static boolean m14931w(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    /* renamed from: x */
    public static boolean m14932x(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public static boolean m14933y(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof InterfaceC2575i2) {
            return ((InterfaceC2575i2) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: z */
    public static boolean m14934z(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }
}
