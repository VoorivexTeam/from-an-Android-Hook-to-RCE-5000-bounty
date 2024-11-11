package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.fragment.app.AbstractC0282f;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0312r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.C2366d0;
import p000.C3106q1;
import p000.C3107q2;
import p000.C3148r1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.g */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0283g extends AbstractC0282f implements LayoutInflater.Factory2 {

    /* renamed from: F */
    static boolean f1734F = false;

    /* renamed from: G */
    static Field f1735G;

    /* renamed from: H */
    static final Interpolator f1736H = new DecelerateInterpolator(2.5f);

    /* renamed from: I */
    static final Interpolator f1737I = new DecelerateInterpolator(1.5f);

    /* renamed from: C */
    ArrayList<n> f1740C;

    /* renamed from: D */
    C0284h f1741D;

    /* renamed from: b */
    ArrayList<l> f1743b;

    /* renamed from: c */
    boolean f1744c;

    /* renamed from: f */
    SparseArray<Fragment> f1747f;

    /* renamed from: g */
    ArrayList<C0277a> f1748g;

    /* renamed from: h */
    ArrayList<Fragment> f1749h;

    /* renamed from: i */
    ArrayList<C0277a> f1750i;

    /* renamed from: j */
    ArrayList<Integer> f1751j;

    /* renamed from: k */
    ArrayList<AbstractC0282f.b> f1752k;

    /* renamed from: n */
    AbstractC0281e f1755n;

    /* renamed from: o */
    AbstractC0279c f1756o;

    /* renamed from: p */
    Fragment f1757p;

    /* renamed from: q */
    Fragment f1758q;

    /* renamed from: r */
    boolean f1759r;

    /* renamed from: s */
    boolean f1760s;

    /* renamed from: t */
    boolean f1761t;

    /* renamed from: u */
    boolean f1762u;

    /* renamed from: v */
    String f1763v;

    /* renamed from: w */
    boolean f1764w;

    /* renamed from: x */
    ArrayList<C0277a> f1765x;

    /* renamed from: y */
    ArrayList<Boolean> f1766y;

    /* renamed from: z */
    ArrayList<Fragment> f1767z;

    /* renamed from: d */
    int f1745d = 0;

    /* renamed from: e */
    final ArrayList<Fragment> f1746e = new ArrayList<>();

    /* renamed from: l */
    private final CopyOnWriteArrayList<j> f1753l = new CopyOnWriteArrayList<>();

    /* renamed from: m */
    int f1754m = 0;

    /* renamed from: A */
    Bundle f1738A = null;

    /* renamed from: B */
    SparseArray<Parcelable> f1739B = null;

    /* renamed from: E */
    Runnable f1742E = new a();

    /* renamed from: androidx.fragment.app.g$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C0283g.this.m1924o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.g$b */
    /* loaded from: classes.dex */
    public class b extends f {

        /* renamed from: c */
        final /* synthetic */ ViewGroup f1769c;

        /* renamed from: d */
        final /* synthetic */ Fragment f1770d;

        /* renamed from: androidx.fragment.app.g$b$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f1770d.m1700h() != null) {
                    b.this.f1770d.m1661a((View) null);
                    b bVar = b.this;
                    LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = LayoutInflaterFactory2C0283g.this;
                    Fragment fragment = bVar.f1770d;
                    layoutInflaterFactory2C0283g.m1869a(fragment, fragment.m1617A(), 0, 0, false);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Animation.AnimationListener animationListener, ViewGroup viewGroup, Fragment fragment) {
            super(animationListener);
            this.f1769c = viewGroup;
            this.f1770d = fragment;
        }

        @Override // androidx.fragment.app.LayoutInflaterFactory2C0283g.f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            super.onAnimationEnd(animation);
            this.f1769c.post(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.g$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f1773a;

        /* renamed from: b */
        final /* synthetic */ View f1774b;

        /* renamed from: c */
        final /* synthetic */ Fragment f1775c;

        c(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f1773a = viewGroup;
            this.f1774b = view;
            this.f1775c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1773a.endViewTransition(this.f1774b);
            Animator m1702i = this.f1775c.m1702i();
            this.f1775c.m1652a((Animator) null);
            if (m1702i == null || this.f1773a.indexOfChild(this.f1774b) >= 0) {
                return;
            }
            LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = LayoutInflaterFactory2C0283g.this;
            Fragment fragment = this.f1775c;
            layoutInflaterFactory2C0283g.m1869a(fragment, fragment.m1617A(), 0, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.g$d */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f1777a;

        /* renamed from: b */
        final /* synthetic */ View f1778b;

        /* renamed from: c */
        final /* synthetic */ Fragment f1779c;

        d(LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f1777a = viewGroup;
            this.f1778b = view;
            this.f1779c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1777a.endViewTransition(this.f1778b);
            animator.removeListener(this);
            View view = this.f1779c.f1598J;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.g$e */
    /* loaded from: classes.dex */
    public static class e extends f {

        /* renamed from: c */
        View f1780c;

        /* renamed from: androidx.fragment.app.g$e$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f1780c.setLayerType(0, null);
            }
        }

        e(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.f1780c = view;
        }

        @Override // androidx.fragment.app.LayoutInflaterFactory2C0283g.f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (C3107q2.m14931w(this.f1780c) || Build.VERSION.SDK_INT >= 24) {
                this.f1780c.post(new a());
            } else {
                this.f1780c.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: androidx.fragment.app.g$f */
    /* loaded from: classes.dex */
    private static class f implements Animation.AnimationListener {

        /* renamed from: b */
        private final Animation.AnimationListener f1782b;

        f(Animation.AnimationListener animationListener) {
            this.f1782b = animationListener;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f1782b;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f1782b;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f1782b;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.g$g */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a */
        public final Animation f1783a;

        /* renamed from: b */
        public final Animator f1784b;

        g(Animator animator) {
            this.f1783a = null;
            this.f1784b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        g(Animation animation) {
            this.f1783a = animation;
            this.f1784b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.g$h */
    /* loaded from: classes.dex */
    public static class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        View f1785a;

        h(View view) {
            this.f1785a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1785a.setLayerType(0, null);
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f1785a.setLayerType(2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.g$i */
    /* loaded from: classes.dex */
    public static class i extends AnimationSet implements Runnable {

        /* renamed from: b */
        private final ViewGroup f1786b;

        /* renamed from: c */
        private final View f1787c;

        /* renamed from: d */
        private boolean f1788d;

        /* renamed from: e */
        private boolean f1789e;

        /* renamed from: f */
        private boolean f1790f;

        i(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1790f = true;
            this.f1786b = viewGroup;
            this.f1787c = view;
            addAnimation(animation);
            this.f1786b.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f1790f = true;
            if (this.f1788d) {
                return !this.f1789e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f1788d = true;
                ViewTreeObserverOnPreDrawListenerC0290n.m2002a(this.f1786b, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f1790f = true;
            if (this.f1788d) {
                return !this.f1789e;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f1788d = true;
                ViewTreeObserverOnPreDrawListenerC0290n.m2002a(this.f1786b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1788d || !this.f1790f) {
                this.f1786b.endViewTransition(this.f1787c);
                this.f1789e = true;
            } else {
                this.f1790f = false;
                this.f1786b.post(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.g$j */
    /* loaded from: classes.dex */
    public static final class j {

        /* renamed from: a */
        final AbstractC0282f.a f1791a;

        /* renamed from: b */
        final boolean f1792b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.g$k */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a */
        public static final int[] f1793a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.g$l */
    /* loaded from: classes.dex */
    public interface l {
        /* renamed from: a */
        boolean mo1764a(ArrayList<C0277a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.g$m */
    /* loaded from: classes.dex */
    private class m implements l {

        /* renamed from: a */
        final String f1794a;

        /* renamed from: b */
        final int f1795b;

        /* renamed from: c */
        final int f1796c;

        m(String str, int i, int i2) {
            this.f1794a = str;
            this.f1795b = i;
            this.f1796c = i2;
        }

        @Override // androidx.fragment.app.LayoutInflaterFactory2C0283g.l
        /* renamed from: a */
        public boolean mo1764a(ArrayList<C0277a> arrayList, ArrayList<Boolean> arrayList2) {
            AbstractC0282f m1637U;
            Fragment fragment = LayoutInflaterFactory2C0283g.this.f1758q;
            if (fragment == null || this.f1795b >= 0 || this.f1794a != null || (m1637U = fragment.m1637U()) == null || !m1637U.mo1815d()) {
                return LayoutInflaterFactory2C0283g.this.m1881a(arrayList, arrayList2, this.f1794a, this.f1795b, this.f1796c);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.g$n */
    /* loaded from: classes.dex */
    public static class n implements Fragment.InterfaceC0270f {

        /* renamed from: a */
        final boolean f1798a;

        /* renamed from: b */
        final C0277a f1799b;

        /* renamed from: c */
        private int f1800c;

        n(C0277a c0277a, boolean z) {
            this.f1798a = z;
            this.f1799b = c0277a;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0270f
        /* renamed from: a */
        public void mo1728a() {
            int i = this.f1800c - 1;
            this.f1800c = i;
            if (i != 0) {
                return;
            }
            this.f1799b.f1694a.m1932w();
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0270f
        /* renamed from: b */
        public void mo1729b() {
            this.f1800c++;
        }

        /* renamed from: c */
        public void m1934c() {
            C0277a c0277a = this.f1799b;
            c0277a.f1694a.m1875a(c0277a, this.f1798a, false, false);
        }

        /* renamed from: d */
        public void m1935d() {
            boolean z = this.f1800c > 0;
            LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = this.f1799b.f1694a;
            int size = layoutInflaterFactory2C0283g.f1746e.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = layoutInflaterFactory2C0283g.f1746e.get(i);
                fragment.m1663a((Fragment.InterfaceC0270f) null);
                if (z && fragment.m1625I()) {
                    fragment.m1693e0();
                }
            }
            C0277a c0277a = this.f1799b;
            c0277a.f1694a.m1875a(c0277a, this.f1798a, !z, true);
        }

        /* renamed from: e */
        public boolean m1936e() {
            return this.f1800c == 0;
        }
    }

    static {
        new AccelerateInterpolator(2.5f);
        new AccelerateInterpolator(1.5f);
    }

    /* renamed from: A */
    private void m1831A() {
        this.f1744c = false;
        this.f1766y.clear();
        this.f1765x.clear();
    }

    /* renamed from: B */
    private void m1832B() {
        SparseArray<Fragment> sparseArray = this.f1747f;
        int size = sparseArray == null ? 0 : sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment valueAt = this.f1747f.valueAt(i2);
            if (valueAt != null) {
                if (valueAt.m1700h() != null) {
                    int m1617A = valueAt.m1617A();
                    View m1700h = valueAt.m1700h();
                    Animation animation = m1700h.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        m1700h.clearAnimation();
                    }
                    valueAt.m1661a((View) null);
                    m1869a(valueAt, m1617A, 0, 0, false);
                } else if (valueAt.m1702i() != null) {
                    valueAt.m1702i().end();
                }
            }
        }
    }

    /* renamed from: C */
    private void m1833C() {
        if (this.f1740C != null) {
            while (!this.f1740C.isEmpty()) {
                this.f1740C.remove(0).m1935d();
            }
        }
    }

    /* renamed from: a */
    private int m1834a(ArrayList<C0277a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, C2366d0<Fragment> c2366d0) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            C0277a c0277a = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (c0277a.m1771e() && !c0277a.m1763a(arrayList, i5 + 1, i3)) {
                if (this.f1740C == null) {
                    this.f1740C = new ArrayList<>();
                }
                n nVar = new n(c0277a, booleanValue);
                this.f1740C.add(nVar);
                c0277a.m1759a(nVar);
                if (booleanValue) {
                    c0277a.m1769c();
                } else {
                    c0277a.m1767b(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, c0277a);
                }
                m1841a(c2366d0);
            }
        }
        return i4;
    }

    /* renamed from: a */
    private static Animation.AnimationListener m1835a(Animation animation) {
        try {
            if (f1735G == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                f1735G = declaredField;
                declaredField.setAccessible(true);
            }
            return (Animation.AnimationListener) f1735G.get(animation);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static g m1836a(Context context, float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(f1737I);
        alphaAnimation.setDuration(220L);
        return new g(alphaAnimation);
    }

    /* renamed from: a */
    static g m1837a(Context context, float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f1736H);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(f1737I);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet);
    }

    /* renamed from: a */
    private static void m1838a(View view, g gVar) {
        if (view == null || gVar == null || !m1851b(view, gVar)) {
            return;
        }
        Animator animator = gVar.f1784b;
        if (animator != null) {
            animator.addListener(new h(view));
            return;
        }
        Animation.AnimationListener m1835a = m1835a(gVar.f1783a);
        view.setLayerType(2, null);
        gVar.f1783a.setAnimationListener(new e(view, m1835a));
    }

    /* renamed from: a */
    private void m1839a(Fragment fragment, g gVar, int i2) {
        View view = fragment.f1598J;
        ViewGroup viewGroup = fragment.f1597I;
        viewGroup.startViewTransition(view);
        fragment.m1670b(i2);
        if (gVar.f1783a != null) {
            i iVar = new i(gVar.f1783a, viewGroup, view);
            fragment.m1661a(fragment.f1598J);
            iVar.setAnimationListener(new b(m1835a(iVar), viewGroup, fragment));
            m1838a(view, gVar);
            fragment.f1598J.startAnimation(iVar);
            return;
        }
        Animator animator = gVar.f1784b;
        fragment.m1652a(animator);
        animator.addListener(new c(viewGroup, view, fragment));
        animator.setTarget(fragment.f1598J);
        m1838a(fragment.f1598J, gVar);
        animator.start();
    }

    /* renamed from: a */
    private static void m1840a(C0284h c0284h) {
        if (c0284h == null) {
            return;
        }
        List<Fragment> m1938b = c0284h.m1938b();
        if (m1938b != null) {
            Iterator<Fragment> it = m1938b.iterator();
            while (it.hasNext()) {
                it.next().f1593E = true;
            }
        }
        List<C0284h> m1937a = c0284h.m1937a();
        if (m1937a != null) {
            Iterator<C0284h> it2 = m1937a.iterator();
            while (it2.hasNext()) {
                m1840a(it2.next());
            }
        }
    }

    /* renamed from: a */
    private void m1841a(C2366d0<Fragment> c2366d0) {
        int i2 = this.f1754m;
        if (i2 < 1) {
            return;
        }
        int min = Math.min(i2, 3);
        int size = this.f1746e.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.f1746e.get(i3);
            if (fragment.f1612b < min) {
                m1869a(fragment, min, fragment.m1716r(), fragment.m1717s(), false);
                if (fragment.f1598J != null && !fragment.f1590B && fragment.f1603O) {
                    c2366d0.add(fragment);
                }
            }
        }
    }

    /* renamed from: a */
    private void m1842a(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C3148r1("FragmentManager"));
        AbstractC0281e abstractC0281e = this.f1755n;
        try {
            if (abstractC0281e != null) {
                abstractC0281e.mo1744a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } else {
                mo1812a("  ", (FileDescriptor) null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    /* renamed from: a */
    private void m1843a(ArrayList<C0277a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<n> arrayList3 = this.f1740C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            n nVar = this.f1740C.get(i2);
            if (arrayList == null || nVar.f1798a || (indexOf2 = arrayList.indexOf(nVar.f1799b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (nVar.m1936e() || (arrayList != null && nVar.f1799b.m1763a(arrayList, 0, arrayList.size()))) {
                    this.f1740C.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || nVar.f1798a || (indexOf = arrayList.indexOf(nVar.f1799b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        nVar.m1935d();
                    }
                }
                i2++;
            }
            nVar.m1934c();
            i2++;
        }
    }

    /* renamed from: a */
    private static void m1844a(ArrayList<C0277a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            C0277a c0277a = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                c0277a.m1758a(-1);
                c0277a.m1767b(i2 == i3 + (-1));
            } else {
                c0277a.m1758a(1);
                c0277a.m1769c();
            }
            i2++;
        }
    }

    /* renamed from: a */
    static boolean m1845a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            for (PropertyValuesHolder propertyValuesHolder : ((ValueAnimator) animator).getValues()) {
                if ("alpha".equals(propertyValuesHolder.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                if (m1845a(childAnimations.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m1846a(g gVar) {
        Animation animation = gVar.f1783a;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return m1845a(gVar.f1784b);
        }
        List<Animation> animations = ((AnimationSet) animation).getAnimations();
        for (int i2 = 0; i2 < animations.size(); i2++) {
            if (animations.get(i2) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m1847a(String str, int i2, int i3) {
        AbstractC0282f m1637U;
        m1924o();
        m1854c(true);
        Fragment fragment = this.f1758q;
        if (fragment != null && i2 < 0 && str == null && (m1637U = fragment.m1637U()) != null && m1637U.mo1815d()) {
            return true;
        }
        boolean m1881a = m1881a(this.f1765x, this.f1766y, str, i2, i3);
        if (m1881a) {
            this.f1744c = true;
            try {
                m1853c(this.f1765x, this.f1766y);
            } finally {
                m1831A();
            }
        }
        m1921n();
        m1858y();
        return m1881a;
    }

    /* renamed from: b */
    public static int m1848b(int i2, boolean z) {
        if (i2 == 4097) {
            return z ? 1 : 2;
        }
        if (i2 == 4099) {
            return z ? 5 : 6;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    /* renamed from: b */
    private void m1849b(C2366d0<Fragment> c2366d0) {
        int size = c2366d0.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment m11229f = c2366d0.m11229f(i2);
            if (!m11229f.f1622l) {
                View m1618B = m11229f.m1618B();
                m11229f.f1605Q = m1618B.getAlpha();
                m1618B.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: b */
    private void m1850b(ArrayList<C0277a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i2;
        boolean z = arrayList.get(i6).f1712s;
        ArrayList<Fragment> arrayList3 = this.f1767z;
        if (arrayList3 == null) {
            this.f1767z = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f1767z.addAll(this.f1746e);
        Fragment m1926q = m1926q();
        boolean z2 = false;
        for (int i7 = i6; i7 < i3; i7++) {
            C0277a c0277a = arrayList.get(i7);
            m1926q = !arrayList2.get(i7).booleanValue() ? c0277a.m1755a(this.f1767z, m1926q) : c0277a.m1766b(this.f1767z, m1926q);
            z2 = z2 || c0277a.f1702i;
        }
        this.f1767z.clear();
        if (!z) {
            C0286j.m1956a(this, arrayList, arrayList2, i2, i3, false);
        }
        m1844a(arrayList, arrayList2, i2, i3);
        if (z) {
            C2366d0<Fragment> c2366d0 = new C2366d0<>();
            m1841a(c2366d0);
            int m1834a = m1834a(arrayList, arrayList2, i2, i3, c2366d0);
            m1849b(c2366d0);
            i4 = m1834a;
        } else {
            i4 = i3;
        }
        if (i4 != i6 && z) {
            C0286j.m1956a(this, arrayList, arrayList2, i2, i4, true);
            m1863a(this.f1754m, true);
        }
        while (i6 < i3) {
            C0277a c0277a2 = arrayList.get(i6);
            if (arrayList2.get(i6).booleanValue() && (i5 = c0277a2.f1705l) >= 0) {
                m1884b(i5);
                c0277a2.f1705l = -1;
            }
            c0277a2.m1772f();
            i6++;
        }
        if (z2) {
            m1928s();
        }
    }

    /* renamed from: b */
    static boolean m1851b(View view, g gVar) {
        return view != null && gVar != null && Build.VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && C3107q2.m14929u(view) && m1846a(gVar);
    }

    /* renamed from: b */
    private boolean m1852b(ArrayList<C0277a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.f1743b != null && this.f1743b.size() != 0) {
                int size = this.f1743b.size();
                boolean z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    z |= this.f1743b.get(i2).mo1764a(arrayList, arrayList2);
                }
                this.f1743b.clear();
                this.f1755n.m1807e().removeCallbacks(this.f1742E);
                return z;
            }
            return false;
        }
    }

    /* renamed from: c */
    private void m1853c(ArrayList<C0277a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m1843a(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).f1712s) {
                if (i3 != i2) {
                    m1850b(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).f1712s) {
                        i3++;
                    }
                }
                m1850b(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            m1850b(arrayList, arrayList2, i3, size);
        }
    }

    /* renamed from: c */
    private void m1854c(boolean z) {
        if (this.f1744c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1755n == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.f1755n.m1807e().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            m1859z();
        }
        if (this.f1765x == null) {
            this.f1765x = new ArrayList<>();
            this.f1766y = new ArrayList<>();
        }
        this.f1744c = true;
        try {
            m1843a((ArrayList<C0277a>) null, (ArrayList<Boolean>) null);
        } finally {
            this.f1744c = false;
        }
    }

    /* renamed from: d */
    private void m1855d(int i2) {
        try {
            this.f1744c = true;
            m1863a(i2, false);
            this.f1744c = false;
            m1924o();
        } catch (Throwable th) {
            this.f1744c = false;
            throw th;
        }
    }

    /* renamed from: e */
    public static int m1856e(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: p */
    private Fragment m1857p(Fragment fragment) {
        ViewGroup viewGroup = fragment.f1597I;
        View view = fragment.f1598J;
        if (viewGroup != null && view != null) {
            for (int indexOf = this.f1746e.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f1746e.get(indexOf);
                if (fragment2.f1597I == viewGroup && fragment2.f1598J != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: y */
    private void m1858y() {
        SparseArray<Fragment> sparseArray = this.f1747f;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.f1747f.valueAt(size) == null) {
                    SparseArray<Fragment> sparseArray2 = this.f1747f;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    /* renamed from: z */
    private void m1859z() {
        if (mo1814c()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f1763v == null) {
            return;
        }
        throw new IllegalStateException("Can not perform this action inside of " + this.f1763v);
    }

    @Override // androidx.fragment.app.AbstractC0282f
    /* renamed from: a */
    public Fragment mo1808a(int i2) {
        for (int size = this.f1746e.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1746e.get(size);
            if (fragment != null && fragment.f1635y == i2) {
                return fragment;
            }
        }
        SparseArray<Fragment> sparseArray = this.f1747f;
        if (sparseArray == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            Fragment valueAt = this.f1747f.valueAt(size2);
            if (valueAt != null && valueAt.f1635y == i2) {
                return valueAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public Fragment m1860a(Bundle bundle, String str) {
        int i2 = bundle.getInt(str, -1);
        if (i2 == -1) {
            return null;
        }
        Fragment fragment = this.f1747f.get(i2);
        if (fragment != null) {
            return fragment;
        }
        m1842a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i2));
        throw null;
    }

    @Override // androidx.fragment.app.AbstractC0282f
    /* renamed from: a */
    public Fragment mo1809a(String str) {
        if (str != null) {
            for (int size = this.f1746e.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f1746e.get(size);
                if (fragment != null && str.equals(fragment.f1589A)) {
                    return fragment;
                }
            }
        }
        SparseArray<Fragment> sparseArray = this.f1747f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            Fragment valueAt = this.f1747f.valueAt(size2);
            if (valueAt != null && str.equals(valueAt.f1589A)) {
                return valueAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    g m1861a(Fragment fragment, int i2, boolean z, int i3) {
        int m1848b;
        int m1716r = fragment.m1716r();
        Animation m1645a = fragment.m1645a(i2, z, m1716r);
        if (m1645a != null) {
            return new g(m1645a);
        }
        Animator m1669b = fragment.m1669b(i2, z, m1716r);
        if (m1669b != null) {
            return new g(m1669b);
        }
        if (m1716r != 0) {
            boolean equals = "anim".equals(this.f1755n.m1805c().getResources().getResourceTypeName(m1716r));
            boolean z2 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f1755n.m1805c(), m1716r);
                    if (loadAnimation != null) {
                        return new g(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f1755n.m1805c(), m1716r);
                    if (loadAnimator != null) {
                        return new g(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (equals) {
                        throw e3;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f1755n.m1805c(), m1716r);
                    if (loadAnimation2 != null) {
                        return new g(loadAnimation2);
                    }
                }
            }
        }
        if (i2 == 0 || (m1848b = m1848b(i2, z)) < 0) {
            return null;
        }
        switch (m1848b) {
            case 1:
                return m1837a(this.f1755n.m1805c(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m1837a(this.f1755n.m1805c(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m1837a(this.f1755n.m1805c(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m1837a(this.f1755n.m1805c(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m1836a(this.f1755n.m1805c(), 0.0f, 1.0f);
            case 6:
                return m1836a(this.f1755n.m1805c(), 1.0f, 0.0f);
            default:
                if (i3 != 0 || !this.f1755n.mo1748h()) {
                    return null;
                }
                this.f1755n.mo1747g();
                return null;
        }
    }

    @Override // androidx.fragment.app.AbstractC0282f
    /* renamed from: a */
    public AbstractC0285i mo1810a() {
        return new C0277a(this);
    }

    @Override // androidx.fragment.app.AbstractC0282f
    /* renamed from: a */
    public void mo1811a(int i2, int i3) {
        if (i2 >= 0) {
            m1877a((l) new m(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    /* renamed from: a */
    public void m1862a(int i2, C0277a c0277a) {
        synchronized (this) {
            if (this.f1750i == null) {
                this.f1750i = new ArrayList<>();
            }
            int size = this.f1750i.size();
            if (i2 < size) {
                if (f1734F) {
                    String str = "Setting back stack index " + i2 + " to " + c0277a;
                }
                this.f1750i.set(i2, c0277a);
            } else {
                while (size < i2) {
                    this.f1750i.add(null);
                    if (this.f1751j == null) {
                        this.f1751j = new ArrayList<>();
                    }
                    if (f1734F) {
                        String str2 = "Adding available back stack index " + size;
                    }
                    this.f1751j.add(Integer.valueOf(size));
                    size++;
                }
                if (f1734F) {
                    String str3 = "Adding back stack index " + i2 + " with " + c0277a;
                }
                this.f1750i.add(c0277a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1863a(int i2, boolean z) {
        AbstractC0281e abstractC0281e;
        if (this.f1755n == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.f1754m) {
            this.f1754m = i2;
            if (this.f1747f != null) {
                int size = this.f1746e.size();
                for (int i3 = 0; i3 < size; i3++) {
                    m1909h(this.f1746e.get(i3));
                }
                int size2 = this.f1747f.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Fragment valueAt = this.f1747f.valueAt(i4);
                    if (valueAt != null && ((valueAt.f1623m || valueAt.f1591C) && !valueAt.f1603O)) {
                        m1909h(valueAt);
                    }
                }
                m1933x();
                if (this.f1759r && (abstractC0281e = this.f1755n) != null && this.f1754m == 4) {
                    abstractC0281e.mo1749i();
                    this.f1759r = false;
                }
            }
        }
    }

    /* renamed from: a */
    public void m1864a(Configuration configuration) {
        for (int i2 = 0; i2 < this.f1746e.size(); i2++) {
            Fragment fragment = this.f1746e.get(i2);
            if (fragment != null) {
                fragment.m1658a(configuration);
            }
        }
    }

    /* renamed from: a */
    public void m1865a(Bundle bundle, String str, Fragment fragment) {
        int i2 = fragment.f1616f;
        if (i2 >= 0) {
            bundle.putInt(str, i2);
            return;
        }
        m1842a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1866a(Parcelable parcelable, C0284h c0284h) {
        List<C0284h> list;
        List<C0312r> list2;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f1676b == null) {
            return;
        }
        if (c0284h != null) {
            List<Fragment> m1938b = c0284h.m1938b();
            list = c0284h.m1937a();
            list2 = c0284h.m1939c();
            int size = m1938b != null ? m1938b.size() : 0;
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = m1938b.get(i2);
                if (f1734F) {
                    String str = "restoreAllState: re-attaching retained " + fragment;
                }
                int i3 = 0;
                while (true) {
                    FragmentState[] fragmentStateArr = fragmentManagerState.f1676b;
                    if (i3 >= fragmentStateArr.length || fragmentStateArr[i3].f1682c == fragment.f1616f) {
                        break;
                    } else {
                        i3++;
                    }
                }
                FragmentState[] fragmentStateArr2 = fragmentManagerState.f1676b;
                if (i3 == fragmentStateArr2.length) {
                    m1842a(new IllegalStateException("Could not find active fragment with index " + fragment.f1616f));
                    throw null;
                }
                FragmentState fragmentState = fragmentStateArr2[i3];
                fragmentState.f1692m = fragment;
                fragment.f1614d = null;
                fragment.f1628r = 0;
                fragment.f1625o = false;
                fragment.f1622l = false;
                fragment.f1619i = null;
                Bundle bundle = fragmentState.f1691l;
                if (bundle != null) {
                    bundle.setClassLoader(this.f1755n.m1805c().getClassLoader());
                    fragment.f1614d = fragmentState.f1691l.getSparseParcelableArray("android:view_state");
                    fragment.f1613c = fragmentState.f1691l;
                }
            }
        } else {
            list = null;
            list2 = null;
        }
        this.f1747f = new SparseArray<>(fragmentManagerState.f1676b.length);
        int i4 = 0;
        while (true) {
            FragmentState[] fragmentStateArr3 = fragmentManagerState.f1676b;
            if (i4 >= fragmentStateArr3.length) {
                break;
            }
            FragmentState fragmentState2 = fragmentStateArr3[i4];
            if (fragmentState2 != null) {
                Fragment m1750a = fragmentState2.m1750a(this.f1755n, this.f1756o, this.f1757p, (list == null || i4 >= list.size()) ? null : list.get(i4), (list2 == null || i4 >= list2.size()) ? null : list2.get(i4));
                if (f1734F) {
                    String str2 = "restoreAllState: active #" + i4 + ": " + m1750a;
                }
                this.f1747f.put(m1750a.f1616f, m1750a);
                fragmentState2.f1692m = null;
            }
            i4++;
        }
        if (c0284h != null) {
            List<Fragment> m1938b2 = c0284h.m1938b();
            int size2 = m1938b2 != null ? m1938b2.size() : 0;
            for (int i5 = 0; i5 < size2; i5++) {
                Fragment fragment2 = m1938b2.get(i5);
                int i6 = fragment2.f1620j;
                if (i6 >= 0) {
                    Fragment fragment3 = this.f1747f.get(i6);
                    fragment2.f1619i = fragment3;
                    if (fragment3 == null) {
                        String str3 = "Re-attaching retained fragment " + fragment2 + " target no longer exists: " + fragment2.f1620j;
                    }
                }
            }
        }
        this.f1746e.clear();
        if (fragmentManagerState.f1677c != null) {
            int i7 = 0;
            while (true) {
                int[] iArr = fragmentManagerState.f1677c;
                if (i7 >= iArr.length) {
                    break;
                }
                Fragment fragment4 = this.f1747f.get(iArr[i7]);
                if (fragment4 == null) {
                    m1842a(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.f1677c[i7]));
                    throw null;
                }
                fragment4.f1622l = true;
                if (f1734F) {
                    String str4 = "restoreAllState: added #" + i7 + ": " + fragment4;
                }
                if (this.f1746e.contains(fragment4)) {
                    throw new IllegalStateException("Already added!");
                }
                synchronized (this.f1746e) {
                    this.f1746e.add(fragment4);
                }
                i7++;
            }
        }
        if (fragmentManagerState.f1678d != null) {
            this.f1748g = new ArrayList<>(fragmentManagerState.f1678d.length);
            int i8 = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.f1678d;
                if (i8 >= backStackStateArr.length) {
                    break;
                }
                C0277a m1613a = backStackStateArr[i8].m1613a(this);
                if (f1734F) {
                    String str5 = "restoreAllState: back stack #" + i8 + " (index " + m1613a.f1705l + "): " + m1613a;
                    PrintWriter printWriter = new PrintWriter(new C3148r1("FragmentManager"));
                    m1613a.m1762a("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1748g.add(m1613a);
                int i9 = m1613a.f1705l;
                if (i9 >= 0) {
                    m1862a(i9, m1613a);
                }
                i8++;
            }
        } else {
            this.f1748g = null;
        }
        int i10 = fragmentManagerState.f1679e;
        if (i10 >= 0) {
            this.f1758q = this.f1747f.get(i10);
        }
        this.f1745d = fragmentManagerState.f1680f;
    }

    /* renamed from: a */
    public void m1867a(Menu menu) {
        if (this.f1754m < 1) {
            return;
        }
        for (int i2 = 0; i2 < this.f1746e.size(); i2++) {
            Fragment fragment = this.f1746e.get(i2);
            if (fragment != null) {
                fragment.m1680c(menu);
            }
        }
    }

    /* renamed from: a */
    public void m1868a(Fragment fragment) {
        if (f1734F) {
            String str = "attach: " + fragment;
        }
        if (fragment.f1591C) {
            fragment.f1591C = false;
            if (fragment.f1622l) {
                return;
            }
            if (this.f1746e.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            if (f1734F) {
                String str2 = "add from attach: " + fragment;
            }
            synchronized (this.f1746e) {
                this.f1746e.add(fragment);
            }
            fragment.f1622l = true;
            if (fragment.f1594F && fragment.f1595G) {
                this.f1759r = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        if (r0 != 3) goto L218;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0285  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1869a(androidx.fragment.app.Fragment r16, int r17, int r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflaterFactory2C0283g.m1869a(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    /* renamed from: a */
    void m1870a(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.f1757p;
        if (fragment2 != null) {
            AbstractC0282f m1714p = fragment2.m1714p();
            if (m1714p instanceof LayoutInflaterFactory2C0283g) {
                ((LayoutInflaterFactory2C0283g) m1714p).m1870a(fragment, context, true);
            }
        }
        Iterator<j> it = this.f1753l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.f1792b) {
                next.f1791a.m1817a(this, fragment, context);
            }
        }
    }

    /* renamed from: a */
    void m1871a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f1757p;
        if (fragment2 != null) {
            AbstractC0282f m1714p = fragment2.m1714p();
            if (m1714p instanceof LayoutInflaterFactory2C0283g) {
                ((LayoutInflaterFactory2C0283g) m1714p).m1871a(fragment, bundle, true);
            }
        }
        Iterator<j> it = this.f1753l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.f1792b) {
                next.f1791a.m1818a(this, fragment, bundle);
            }
        }
    }

    /* renamed from: a */
    void m1872a(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f1757p;
        if (fragment2 != null) {
            AbstractC0282f m1714p = fragment2.m1714p();
            if (m1714p instanceof LayoutInflaterFactory2C0283g) {
                ((LayoutInflaterFactory2C0283g) m1714p).m1872a(fragment, view, bundle, true);
            }
        }
        Iterator<j> it = this.f1753l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.f1792b) {
                next.f1791a.m1819a(this, fragment, view, bundle);
            }
        }
    }

    /* renamed from: a */
    public void m1873a(Fragment fragment, boolean z) {
        if (f1734F) {
            String str = "add: " + fragment;
        }
        m1903f(fragment);
        if (fragment.f1591C) {
            return;
        }
        if (this.f1746e.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f1746e) {
            this.f1746e.add(fragment);
        }
        fragment.f1622l = true;
        fragment.f1623m = false;
        if (fragment.f1598J == null) {
            fragment.f1604P = false;
        }
        if (fragment.f1594F && fragment.f1595G) {
            this.f1759r = true;
        }
        if (z) {
            m1912i(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1874a(C0277a c0277a) {
        if (this.f1748g == null) {
            this.f1748g = new ArrayList<>();
        }
        this.f1748g.add(c0277a);
    }

    /* renamed from: a */
    void m1875a(C0277a c0277a, boolean z, boolean z2, boolean z3) {
        if (z) {
            c0277a.m1767b(z3);
        } else {
            c0277a.m1769c();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0277a);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0286j.m1956a(this, (ArrayList<C0277a>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            m1863a(this.f1754m, true);
        }
        SparseArray<Fragment> sparseArray = this.f1747f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment valueAt = this.f1747f.valueAt(i2);
                if (valueAt != null && valueAt.f1598J != null && valueAt.f1603O && c0277a.m1768b(valueAt.f1636z)) {
                    float f2 = valueAt.f1605Q;
                    if (f2 > 0.0f) {
                        valueAt.f1598J.setAlpha(f2);
                    }
                    if (z3) {
                        valueAt.f1605Q = 0.0f;
                    } else {
                        valueAt.f1605Q = -1.0f;
                        valueAt.f1603O = false;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m1876a(AbstractC0281e abstractC0281e, AbstractC0279c abstractC0279c, Fragment fragment) {
        if (this.f1755n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1755n = abstractC0281e;
        this.f1756o = abstractC0279c;
        this.f1757p = fragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        return;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1877a(androidx.fragment.app.LayoutInflaterFactory2C0283g.l r2, boolean r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L5
            r1.m1859z()
        L5:
            monitor-enter(r1)
            boolean r0 = r1.f1762u     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L24
            androidx.fragment.app.e r0 = r1.f1755n     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto Lf
            goto L24
        Lf:
            java.util.ArrayList<androidx.fragment.app.g$l> r3 = r1.f1743b     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L1a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r3.<init>()     // Catch: java.lang.Throwable -> L30
            r1.f1743b = r3     // Catch: java.lang.Throwable -> L30
        L1a:
            java.util.ArrayList<androidx.fragment.app.g$l> r3 = r1.f1743b     // Catch: java.lang.Throwable -> L30
            r3.add(r2)     // Catch: java.lang.Throwable -> L30
            r1.m1932w()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            return
        L24:
            if (r3 == 0) goto L28
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            return
        L28:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "Activity has been destroyed"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30
            throw r2     // Catch: java.lang.Throwable -> L30
        L30:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflaterFactory2C0283g.m1877a(androidx.fragment.app.g$l, boolean):void");
    }

    @Override // androidx.fragment.app.AbstractC0282f
    /* renamed from: a */
    public void mo1812a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + "    ";
        SparseArray<Fragment> sparseArray = this.f1747f;
        if (sparseArray != null && (size5 = sparseArray.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i2 = 0; i2 < size5; i2++) {
                Fragment valueAt = this.f1747f.valueAt(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(valueAt);
                if (valueAt != null) {
                    valueAt.mo1665a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.f1746e.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size6; i3++) {
                Fragment fragment = this.f1746e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f1749h;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size4; i4++) {
                Fragment fragment2 = this.f1749h.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<C0277a> arrayList2 = this.f1748g;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size3; i5++) {
                C0277a c0277a = this.f1748g.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(c0277a.toString());
                c0277a.m1761a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.f1750i != null && (size2 = this.f1750i.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i6 = 0; i6 < size2; i6++) {
                    Object obj = (C0277a) this.f1750i.get(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            if (this.f1751j != null && this.f1751j.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f1751j.toArray()));
            }
        }
        ArrayList<l> arrayList3 = this.f1743b;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i7 = 0; i7 < size; i7++) {
                Object obj2 = (l) this.f1743b.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1755n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1756o);
        if (this.f1757p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1757p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1754m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1760s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1761t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1762u);
        if (this.f1759r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1759r);
        }
        if (this.f1763v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f1763v);
        }
    }

    /* renamed from: a */
    public void m1878a(boolean z) {
        int size = this.f1746e.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Fragment fragment = this.f1746e.get(size);
            if (fragment != null) {
                fragment.m1686d(z);
            }
        }
    }

    /* renamed from: a */
    public boolean m1879a(Menu menu, MenuInflater menuInflater) {
        if (this.f1754m < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.f1746e.size(); i2++) {
            Fragment fragment = this.f1746e.get(i2);
            if (fragment != null && fragment.m1675b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f1749h != null) {
            for (int i3 = 0; i3 < this.f1749h.size(); i3++) {
                Fragment fragment2 = this.f1749h.get(i3);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.m1630N();
                }
            }
        }
        this.f1749h = arrayList;
        return z;
    }

    /* renamed from: a */
    public boolean m1880a(MenuItem menuItem) {
        if (this.f1754m < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f1746e.size(); i2++) {
            Fragment fragment = this.f1746e.get(i2);
            if (fragment != null && fragment.m1682c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    boolean m1881a(ArrayList<C0277a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<C0277a> arrayList3 = this.f1748g;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1748g.remove(size));
            arrayList2.add(true);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = this.f1748g.size() - 1;
                while (size2 >= 0) {
                    C0277a c0277a = this.f1748g.get(size2);
                    if ((str != null && str.equals(c0277a.m1770d())) || (i2 >= 0 && i2 == c0277a.f1705l)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0277a c0277a2 = this.f1748g.get(size2);
                        if (str == null || !str.equals(c0277a2.m1770d())) {
                            if (i2 < 0 || i2 != c0277a2.f1705l) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.f1748g.size() - 1) {
                return false;
            }
            for (int size3 = this.f1748g.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f1748g.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }

    /* renamed from: b */
    public int m1882b(C0277a c0277a) {
        synchronized (this) {
            if (this.f1751j != null && this.f1751j.size() > 0) {
                int intValue = this.f1751j.remove(this.f1751j.size() - 1).intValue();
                if (f1734F) {
                    String str = "Adding back stack index " + intValue + " with " + c0277a;
                }
                this.f1750i.set(intValue, c0277a);
                return intValue;
            }
            if (this.f1750i == null) {
                this.f1750i = new ArrayList<>();
            }
            int size = this.f1750i.size();
            if (f1734F) {
                String str2 = "Setting back stack index " + size + " to " + c0277a;
            }
            this.f1750i.add(c0277a);
            return size;
        }
    }

    /* renamed from: b */
    public Fragment m1883b(String str) {
        Fragment m1646a;
        SparseArray<Fragment> sparseArray = this.f1747f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            Fragment valueAt = this.f1747f.valueAt(size);
            if (valueAt != null && (m1646a = valueAt.m1646a(str)) != null) {
                return m1646a;
            }
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0282f
    /* renamed from: b */
    public List<Fragment> mo1813b() {
        List<Fragment> list;
        if (this.f1746e.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1746e) {
            list = (List) this.f1746e.clone();
        }
        return list;
    }

    /* renamed from: b */
    public void m1884b(int i2) {
        synchronized (this) {
            this.f1750i.set(i2, null);
            if (this.f1751j == null) {
                this.f1751j = new ArrayList<>();
            }
            if (f1734F) {
                String str = "Freeing back stack index " + i2;
            }
            this.f1751j.add(Integer.valueOf(i2));
        }
    }

    /* renamed from: b */
    void m1885b(Fragment fragment) {
        Animator animator;
        if (fragment.f1598J != null) {
            g m1861a = m1861a(fragment, fragment.m1717s(), !fragment.f1590B, fragment.m1718t());
            if (m1861a == null || (animator = m1861a.f1784b) == null) {
                if (m1861a != null) {
                    m1838a(fragment.f1598J, m1861a);
                    fragment.f1598J.startAnimation(m1861a.f1783a);
                    m1861a.f1783a.start();
                }
                fragment.f1598J.setVisibility((!fragment.f1590B || fragment.m1623G()) ? 0 : 8);
                if (fragment.m1623G()) {
                    fragment.m1698g(false);
                }
            } else {
                animator.setTarget(fragment.f1598J);
                if (!fragment.f1590B) {
                    fragment.f1598J.setVisibility(0);
                } else if (fragment.m1623G()) {
                    fragment.m1698g(false);
                } else {
                    ViewGroup viewGroup = fragment.f1597I;
                    View view = fragment.f1598J;
                    viewGroup.startViewTransition(view);
                    m1861a.f1784b.addListener(new d(this, viewGroup, view, fragment));
                }
                m1838a(fragment.f1598J, m1861a);
                m1861a.f1784b.start();
            }
        }
        if (fragment.f1622l && fragment.f1594F && fragment.f1595G) {
            this.f1759r = true;
        }
        fragment.f1604P = false;
        fragment.m1666a(fragment.f1590B);
    }

    /* renamed from: b */
    void m1886b(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.f1757p;
        if (fragment2 != null) {
            AbstractC0282f m1714p = fragment2.m1714p();
            if (m1714p instanceof LayoutInflaterFactory2C0283g) {
                ((LayoutInflaterFactory2C0283g) m1714p).m1886b(fragment, context, true);
            }
        }
        Iterator<j> it = this.f1753l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.f1792b) {
                next.f1791a.m1821b(this, fragment, context);
            }
        }
    }

    /* renamed from: b */
    void m1887b(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f1757p;
        if (fragment2 != null) {
            AbstractC0282f m1714p = fragment2.m1714p();
            if (m1714p instanceof LayoutInflaterFactory2C0283g) {
                ((LayoutInflaterFactory2C0283g) m1714p).m1887b(fragment, bundle, true);
            }
        }
        Iterator<j> it = this.f1753l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.f1792b) {
                next.f1791a.m1822b(this, fragment, bundle);
            }
        }
    }

    /* renamed from: b */
    void m1888b(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f1757p;
        if (fragment2 != null) {
            AbstractC0282f m1714p = fragment2.m1714p();
            if (m1714p instanceof LayoutInflaterFactory2C0283g) {
                ((LayoutInflaterFactory2C0283g) m1714p).m1888b(fragment, true);
            }
        }
        Iterator<j> it = this.f1753l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.f1792b) {
                next.f1791a.m1816a(this, fragment);
            }
        }
    }

    /* renamed from: b */
    public void m1889b(boolean z) {
        int size = this.f1746e.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Fragment fragment = this.f1746e.get(size);
            if (fragment != null) {
                fragment.m1692e(z);
            }
        }
    }

    /* renamed from: b */
    public boolean m1890b(Menu menu) {
        if (this.f1754m < 1) {
            return false;
        }
        boolean z = false;
        for (int i2 = 0; i2 < this.f1746e.size(); i2++) {
            Fragment fragment = this.f1746e.get(i2);
            if (fragment != null && fragment.m1687d(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public boolean m1891b(MenuItem menuItem) {
        if (this.f1754m < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f1746e.size(); i2++) {
            Fragment fragment = this.f1746e.get(i2);
            if (fragment != null && fragment.m1688d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m1892c(Fragment fragment) {
        if (f1734F) {
            String str = "detach: " + fragment;
        }
        if (fragment.f1591C) {
            return;
        }
        fragment.f1591C = true;
        if (fragment.f1622l) {
            if (f1734F) {
                String str2 = "remove from detach: " + fragment;
            }
            synchronized (this.f1746e) {
                this.f1746e.remove(fragment);
            }
            if (fragment.f1594F && fragment.f1595G) {
                this.f1759r = true;
            }
            fragment.f1622l = false;
        }
    }

    /* renamed from: c */
    void m1893c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f1757p;
        if (fragment2 != null) {
            AbstractC0282f m1714p = fragment2.m1714p();
            if (m1714p instanceof LayoutInflaterFactory2C0283g) {
                ((LayoutInflaterFactory2C0283g) m1714p).m1893c(fragment, bundle, true);
            }
        }
        Iterator<j> it = this.f1753l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.f1792b) {
                next.f1791a.m1824c(this, fragment, bundle);
            }
        }
    }

    /* renamed from: c */
    void m1894c(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f1757p;
        if (fragment2 != null) {
            AbstractC0282f m1714p = fragment2.m1714p();
            if (m1714p instanceof LayoutInflaterFactory2C0283g) {
                ((LayoutInflaterFactory2C0283g) m1714p).m1894c(fragment, true);
            }
        }
        Iterator<j> it = this.f1753l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.f1792b) {
                next.f1791a.m1820b(this, fragment);
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0282f
    /* renamed from: c */
    public boolean mo1814c() {
        return this.f1760s || this.f1761t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m1895c(int i2) {
        return this.f1754m >= i2;
    }

    /* renamed from: d */
    void m1896d(Fragment fragment) {
        if (!fragment.f1624n || fragment.f1627q) {
            return;
        }
        fragment.m1672b(fragment.m1703i(fragment.f1613c), (ViewGroup) null, fragment.f1613c);
        View view = fragment.f1598J;
        if (view == null) {
            fragment.f1599K = null;
            return;
        }
        fragment.f1599K = view;
        view.setSaveFromParentEnabled(false);
        if (fragment.f1590B) {
            fragment.f1598J.setVisibility(8);
        }
        fragment.mo1662a(fragment.f1598J, fragment.f1613c);
        m1872a(fragment, fragment.f1598J, fragment.f1613c, false);
    }

    /* renamed from: d */
    void m1897d(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f1757p;
        if (fragment2 != null) {
            AbstractC0282f m1714p = fragment2.m1714p();
            if (m1714p instanceof LayoutInflaterFactory2C0283g) {
                ((LayoutInflaterFactory2C0283g) m1714p).m1897d(fragment, bundle, true);
            }
        }
        Iterator<j> it = this.f1753l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.f1792b) {
                next.f1791a.m1826d(this, fragment, bundle);
            }
        }
    }

    /* renamed from: d */
    void m1898d(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f1757p;
        if (fragment2 != null) {
            AbstractC0282f m1714p = fragment2.m1714p();
            if (m1714p instanceof LayoutInflaterFactory2C0283g) {
                ((LayoutInflaterFactory2C0283g) m1714p).m1898d(fragment, true);
            }
        }
        Iterator<j> it = this.f1753l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.f1792b) {
                next.f1791a.m1823c(this, fragment);
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0282f
    /* renamed from: d */
    public boolean mo1815d() {
        m1859z();
        return m1847a((String) null, -1, 0);
    }

    /* renamed from: e */
    public void m1899e() {
        this.f1760s = false;
        this.f1761t = false;
        m1855d(2);
    }

    /* renamed from: e */
    public void m1900e(Fragment fragment) {
        if (f1734F) {
            String str = "hide: " + fragment;
        }
        if (fragment.f1590B) {
            return;
        }
        fragment.f1590B = true;
        fragment.f1604P = true ^ fragment.f1604P;
    }

    /* renamed from: e */
    void m1901e(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f1757p;
        if (fragment2 != null) {
            AbstractC0282f m1714p = fragment2.m1714p();
            if (m1714p instanceof LayoutInflaterFactory2C0283g) {
                ((LayoutInflaterFactory2C0283g) m1714p).m1901e(fragment, true);
            }
        }
        Iterator<j> it = this.f1753l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.f1792b) {
                next.f1791a.m1825d(this, fragment);
            }
        }
    }

    /* renamed from: f */
    public void m1902f() {
        this.f1760s = false;
        this.f1761t = false;
        m1855d(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m1903f(Fragment fragment) {
        if (fragment.f1616f >= 0) {
            return;
        }
        int i2 = this.f1745d;
        this.f1745d = i2 + 1;
        fragment.m1650a(i2, this.f1757p);
        if (this.f1747f == null) {
            this.f1747f = new SparseArray<>();
        }
        this.f1747f.put(fragment.f1616f, fragment);
        if (f1734F) {
            String str = "Allocated fragment index " + fragment;
        }
    }

    /* renamed from: f */
    void m1904f(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f1757p;
        if (fragment2 != null) {
            AbstractC0282f m1714p = fragment2.m1714p();
            if (m1714p instanceof LayoutInflaterFactory2C0283g) {
                ((LayoutInflaterFactory2C0283g) m1714p).m1904f(fragment, true);
            }
        }
        Iterator<j> it = this.f1753l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.f1792b) {
                next.f1791a.m1827e(this, fragment);
            }
        }
    }

    /* renamed from: g */
    public void m1905g() {
        this.f1762u = true;
        m1924o();
        m1855d(0);
        this.f1755n = null;
        this.f1756o = null;
        this.f1757p = null;
    }

    /* renamed from: g */
    void m1906g(Fragment fragment) {
        if (fragment.f1616f < 0) {
            return;
        }
        if (f1734F) {
            String str = "Freeing fragment index " + fragment;
        }
        this.f1747f.put(fragment.f1616f, null);
        fragment.m1619C();
    }

    /* renamed from: g */
    void m1907g(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f1757p;
        if (fragment2 != null) {
            AbstractC0282f m1714p = fragment2.m1714p();
            if (m1714p instanceof LayoutInflaterFactory2C0283g) {
                ((LayoutInflaterFactory2C0283g) m1714p).m1907g(fragment, true);
            }
        }
        Iterator<j> it = this.f1753l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.f1792b) {
                next.f1791a.m1828f(this, fragment);
            }
        }
    }

    /* renamed from: h */
    public void m1908h() {
        m1855d(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m1909h(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        int i2 = this.f1754m;
        if (fragment.f1623m) {
            i2 = fragment.m1624H() ? Math.min(i2, 1) : Math.min(i2, 0);
        }
        m1869a(fragment, i2, fragment.m1717s(), fragment.m1718t(), false);
        if (fragment.f1598J != null) {
            Fragment m1857p = m1857p(fragment);
            if (m1857p != null) {
                View view = m1857p.f1598J;
                ViewGroup viewGroup = fragment.f1597I;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(fragment.f1598J);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.f1598J, indexOfChild);
                }
            }
            if (fragment.f1603O && fragment.f1597I != null) {
                float f2 = fragment.f1605Q;
                if (f2 > 0.0f) {
                    fragment.f1598J.setAlpha(f2);
                }
                fragment.f1605Q = 0.0f;
                fragment.f1603O = false;
                g m1861a = m1861a(fragment, fragment.m1717s(), true, fragment.m1718t());
                if (m1861a != null) {
                    m1838a(fragment.f1598J, m1861a);
                    Animation animation = m1861a.f1783a;
                    if (animation != null) {
                        fragment.f1598J.startAnimation(animation);
                    } else {
                        m1861a.f1784b.setTarget(fragment.f1598J);
                        m1861a.f1784b.start();
                    }
                }
            }
        }
        if (fragment.f1604P) {
            m1885b(fragment);
        }
    }

    /* renamed from: h */
    void m1910h(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f1757p;
        if (fragment2 != null) {
            AbstractC0282f m1714p = fragment2.m1714p();
            if (m1714p instanceof LayoutInflaterFactory2C0283g) {
                ((LayoutInflaterFactory2C0283g) m1714p).m1910h(fragment, true);
            }
        }
        Iterator<j> it = this.f1753l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.f1792b) {
                next.f1791a.m1829g(this, fragment);
            }
        }
    }

    /* renamed from: i */
    public void m1911i() {
        for (int i2 = 0; i2 < this.f1746e.size(); i2++) {
            Fragment fragment = this.f1746e.get(i2);
            if (fragment != null) {
                fragment.m1641Y();
            }
        }
    }

    /* renamed from: i */
    void m1912i(Fragment fragment) {
        m1869a(fragment, this.f1754m, 0, 0, false);
    }

    /* renamed from: j */
    public void m1913j() {
        m1855d(3);
    }

    /* renamed from: j */
    public void m1914j(Fragment fragment) {
        if (fragment.f1600L) {
            if (this.f1744c) {
                this.f1764w = true;
            } else {
                fragment.f1600L = false;
                m1869a(fragment, this.f1754m, 0, 0, false);
            }
        }
    }

    /* renamed from: k */
    public void m1915k() {
        this.f1760s = false;
        this.f1761t = false;
        m1855d(4);
    }

    /* renamed from: k */
    public void m1916k(Fragment fragment) {
        if (f1734F) {
            String str = "remove: " + fragment + " nesting=" + fragment.f1628r;
        }
        boolean z = !fragment.m1624H();
        if (!fragment.f1591C || z) {
            synchronized (this.f1746e) {
                this.f1746e.remove(fragment);
            }
            if (fragment.f1594F && fragment.f1595G) {
                this.f1759r = true;
            }
            fragment.f1622l = false;
            fragment.f1623m = true;
        }
    }

    /* renamed from: l */
    Bundle m1917l(Fragment fragment) {
        if (this.f1738A == null) {
            this.f1738A = new Bundle();
        }
        fragment.m1705j(this.f1738A);
        m1897d(fragment, this.f1738A, false);
        Bundle bundle = null;
        if (!this.f1738A.isEmpty()) {
            Bundle bundle2 = this.f1738A;
            this.f1738A = null;
            bundle = bundle2;
        }
        if (fragment.f1598J != null) {
            m1920m(fragment);
        }
        if (fragment.f1614d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f1614d);
        }
        if (!fragment.f1601M) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.f1601M);
        }
        return bundle;
    }

    /* renamed from: l */
    public void m1918l() {
        this.f1760s = false;
        this.f1761t = false;
        m1855d(3);
    }

    /* renamed from: m */
    public void m1919m() {
        this.f1761t = true;
        m1855d(2);
    }

    /* renamed from: m */
    void m1920m(Fragment fragment) {
        if (fragment.f1599K == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.f1739B;
        if (sparseArray == null) {
            this.f1739B = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        fragment.f1599K.saveHierarchyState(this.f1739B);
        if (this.f1739B.size() > 0) {
            fragment.f1614d = this.f1739B;
            this.f1739B = null;
        }
    }

    /* renamed from: n */
    void m1921n() {
        if (this.f1764w) {
            this.f1764w = false;
            m1933x();
        }
    }

    /* renamed from: n */
    public void m1922n(Fragment fragment) {
        if (fragment == null || (this.f1747f.get(fragment.f1616f) == fragment && (fragment.f1630t == null || fragment.m1714p() == this))) {
            this.f1758q = fragment;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: o */
    public void m1923o(Fragment fragment) {
        if (f1734F) {
            String str = "show: " + fragment;
        }
        if (fragment.f1590B) {
            fragment.f1590B = false;
            fragment.f1604P = !fragment.f1604P;
        }
    }

    /* renamed from: o */
    public boolean m1924o() {
        m1854c(true);
        boolean z = false;
        while (m1852b(this.f1765x, this.f1766y)) {
            this.f1744c = true;
            try {
                m1853c(this.f1765x, this.f1766y);
                m1831A();
                z = true;
            } catch (Throwable th) {
                m1831A();
                throw th;
            }
        }
        m1921n();
        m1858y();
        return z;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f1793a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.m1615a(this.f1755n.m1805c(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        Fragment mo1808a = resourceId != -1 ? mo1808a(resourceId) : null;
        if (mo1808a == null && string != null) {
            mo1808a = mo1809a(string);
        }
        if (mo1808a == null && id != -1) {
            mo1808a = mo1808a(id);
        }
        if (f1734F) {
            String str3 = "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + mo1808a;
        }
        if (mo1808a == null) {
            mo1808a = this.f1756o.mo1726a(context, str2, null);
            mo1808a.f1624n = true;
            mo1808a.f1635y = resourceId != 0 ? resourceId : id;
            mo1808a.f1636z = id;
            mo1808a.f1589A = string;
            mo1808a.f1625o = true;
            mo1808a.f1629s = this;
            AbstractC0281e abstractC0281e = this.f1755n;
            mo1808a.f1630t = abstractC0281e;
            mo1808a.m1656a(abstractC0281e.m1805c(), attributeSet, mo1808a.f1613c);
            m1873a(mo1808a, true);
        } else {
            if (mo1808a.f1625o) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            }
            mo1808a.f1625o = true;
            AbstractC0281e abstractC0281e2 = this.f1755n;
            mo1808a.f1630t = abstractC0281e2;
            if (!mo1808a.f1593E) {
                mo1808a.m1656a(abstractC0281e2.m1805c(), attributeSet, mo1808a.f1613c);
            }
        }
        Fragment fragment = mo1808a;
        if (this.f1754m >= 1 || !fragment.f1624n) {
            m1912i(fragment);
        } else {
            m1869a(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.f1598J;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.f1598J.getTag() == null) {
                fragment.f1598J.setTag(string);
            }
            return fragment.f1598J;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public LayoutInflater.Factory2 m1925p() {
        return this;
    }

    /* renamed from: q */
    public Fragment m1926q() {
        return this.f1758q;
    }

    /* renamed from: r */
    public void m1927r() {
        this.f1741D = null;
        this.f1760s = false;
        this.f1761t = false;
        int size = this.f1746e.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f1746e.get(i2);
            if (fragment != null) {
                fragment.m1628L();
            }
        }
    }

    /* renamed from: s */
    void m1928s() {
        if (this.f1752k != null) {
            for (int i2 = 0; i2 < this.f1752k.size(); i2++) {
                this.f1752k.get(i2).m1830a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public C0284h m1929t() {
        m1840a(this.f1741D);
        return this.f1741D;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f1757p;
        if (obj == null) {
            obj = this.f1755n;
        }
        C3106q1.m14876a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public Parcelable m1930u() {
        int[] iArr;
        int size;
        m1833C();
        m1832B();
        m1924o();
        this.f1760s = true;
        BackStackState[] backStackStateArr = null;
        this.f1741D = null;
        SparseArray<Fragment> sparseArray = this.f1747f;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int size2 = this.f1747f.size();
        FragmentState[] fragmentStateArr = new FragmentState[size2];
        boolean z = false;
        for (int i2 = 0; i2 < size2; i2++) {
            Fragment valueAt = this.f1747f.valueAt(i2);
            if (valueAt != null) {
                if (valueAt.f1616f < 0) {
                    m1842a(new IllegalStateException("Failure saving state: active " + valueAt + " has cleared index: " + valueAt.f1616f));
                    throw null;
                }
                FragmentState fragmentState = new FragmentState(valueAt);
                fragmentStateArr[i2] = fragmentState;
                if (valueAt.f1612b <= 0 || fragmentState.f1691l != null) {
                    fragmentState.f1691l = valueAt.f1613c;
                } else {
                    Bundle m1917l = m1917l(valueAt);
                    fragmentState.f1691l = m1917l;
                    Fragment fragment = valueAt.f1619i;
                    if (fragment != null) {
                        if (fragment.f1616f < 0) {
                            m1842a(new IllegalStateException("Failure saving state: " + valueAt + " has target not in fragment manager: " + valueAt.f1619i));
                            throw null;
                        }
                        if (m1917l == null) {
                            fragmentState.f1691l = new Bundle();
                        }
                        m1865a(fragmentState.f1691l, "android:target_state", valueAt.f1619i);
                        int i3 = valueAt.f1621k;
                        if (i3 != 0) {
                            fragmentState.f1691l.putInt("android:target_req_state", i3);
                        }
                    }
                }
                if (f1734F) {
                    String str = "Saved state of " + valueAt + ": " + fragmentState.f1691l;
                }
                z = true;
            }
        }
        if (!z) {
            boolean z2 = f1734F;
            return null;
        }
        int size3 = this.f1746e.size();
        if (size3 > 0) {
            iArr = new int[size3];
            for (int i4 = 0; i4 < size3; i4++) {
                iArr[i4] = this.f1746e.get(i4).f1616f;
                if (iArr[i4] < 0) {
                    m1842a(new IllegalStateException("Failure saving state: active " + this.f1746e.get(i4) + " has cleared index: " + iArr[i4]));
                    throw null;
                }
                if (f1734F) {
                    String str2 = "saveAllState: adding fragment #" + i4 + ": " + this.f1746e.get(i4);
                }
            }
        } else {
            iArr = null;
        }
        ArrayList<C0277a> arrayList = this.f1748g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i5 = 0; i5 < size; i5++) {
                backStackStateArr[i5] = new BackStackState(this.f1748g.get(i5));
                if (f1734F) {
                    String str3 = "saveAllState: adding back stack #" + i5 + ": " + this.f1748g.get(i5);
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f1676b = fragmentStateArr;
        fragmentManagerState.f1677c = iArr;
        fragmentManagerState.f1678d = backStackStateArr;
        Fragment fragment2 = this.f1758q;
        if (fragment2 != null) {
            fragmentManagerState.f1679e = fragment2.f1616f;
        }
        fragmentManagerState.f1680f = this.f1745d;
        m1931v();
        return fragmentManagerState;
    }

    /* renamed from: v */
    void m1931v() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0284h c0284h;
        if (this.f1747f != null) {
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
            for (int i2 = 0; i2 < this.f1747f.size(); i2++) {
                Fragment valueAt = this.f1747f.valueAt(i2);
                if (valueAt != null) {
                    if (valueAt.f1592D) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(valueAt);
                        Fragment fragment = valueAt.f1619i;
                        valueAt.f1620j = fragment != null ? fragment.f1616f : -1;
                        if (f1734F) {
                            String str = "retainNonConfig: keeping retained " + valueAt;
                        }
                    }
                    LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g = valueAt.f1631u;
                    if (layoutInflaterFactory2C0283g != null) {
                        layoutInflaterFactory2C0283g.m1931v();
                        c0284h = valueAt.f1631u.f1741D;
                    } else {
                        c0284h = valueAt.f1632v;
                    }
                    if (arrayList2 == null && c0284h != null) {
                        arrayList2 = new ArrayList(this.f1747f.size());
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(c0284h);
                    }
                    if (arrayList3 == null && valueAt.f1633w != null) {
                        arrayList3 = new ArrayList(this.f1747f.size());
                        for (int i4 = 0; i4 < i2; i4++) {
                            arrayList3.add(null);
                        }
                    }
                    if (arrayList3 != null) {
                        arrayList3.add(valueAt.f1633w);
                    }
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
        }
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            this.f1741D = null;
        } else {
            this.f1741D = new C0284h(arrayList, arrayList2, arrayList3);
        }
    }

    /* renamed from: w */
    void m1932w() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = (this.f1740C == null || this.f1740C.isEmpty()) ? false : true;
            if (this.f1743b != null && this.f1743b.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f1755n.m1807e().removeCallbacks(this.f1742E);
                this.f1755n.m1807e().post(this.f1742E);
            }
        }
    }

    /* renamed from: x */
    void m1933x() {
        if (this.f1747f == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f1747f.size(); i2++) {
            Fragment valueAt = this.f1747f.valueAt(i2);
            if (valueAt != null) {
                m1914j(valueAt);
            }
        }
    }
}
