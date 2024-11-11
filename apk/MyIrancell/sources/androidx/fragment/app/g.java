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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import androidx.lifecycle.r;
import defpackage.d0;
import defpackage.q1;
import defpackage.q2;
import defpackage.r1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g extends androidx.fragment.app.f implements LayoutInflater.Factory2 {
    static boolean F = false;
    static Field G;
    static final Interpolator H = new DecelerateInterpolator(2.5f);
    static final Interpolator I = new DecelerateInterpolator(1.5f);
    ArrayList<n> C;
    androidx.fragment.app.h D;
    ArrayList<l> b;
    boolean c;
    SparseArray<Fragment> f;
    ArrayList<androidx.fragment.app.a> g;
    ArrayList<Fragment> h;
    ArrayList<androidx.fragment.app.a> i;
    ArrayList<Integer> j;
    ArrayList<f.b> k;
    androidx.fragment.app.e n;
    androidx.fragment.app.c o;
    Fragment p;
    Fragment q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    String v;
    boolean w;
    ArrayList<androidx.fragment.app.a> x;
    ArrayList<Boolean> y;
    ArrayList<Fragment> z;
    int d = 0;
    final ArrayList<Fragment> e = new ArrayList<>();
    private final CopyOnWriteArrayList<j> l = new CopyOnWriteArrayList<>();
    int m = 0;
    Bundle A = null;
    SparseArray<Parcelable> B = null;
    Runnable E = new a();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends f {
        final /* synthetic */ ViewGroup c;
        final /* synthetic */ Fragment d;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.d.h() != null) {
                    b.this.d.a((View) null);
                    b bVar = b.this;
                    g gVar = g.this;
                    Fragment fragment = bVar.d;
                    gVar.a(fragment, fragment.A(), 0, 0, false);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Animation.AnimationListener animationListener, ViewGroup viewGroup, Fragment fragment) {
            super(animationListener);
            this.c = viewGroup;
            this.d = fragment;
        }

        @Override // androidx.fragment.app.g.f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            super.onAnimationEnd(animation);
            this.c.post(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ Fragment c;

        c(ViewGroup viewGroup, View view, Fragment fragment) {
            this.a = viewGroup;
            this.b = view;
            this.c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            Animator i = this.c.i();
            this.c.a((Animator) null);
            if (i == null || this.a.indexOfChild(this.b) >= 0) {
                return;
            }
            g gVar = g.this;
            Fragment fragment = this.c;
            gVar.a(fragment, fragment.A(), 0, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ Fragment c;

        d(g gVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.a = viewGroup;
            this.b = view;
            this.c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            animator.removeListener(this);
            View view = this.c.J;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends f {
        View c;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.c.setLayerType(0, null);
            }
        }

        e(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.c = view;
        }

        @Override // androidx.fragment.app.g.f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (q2.w(this.c) || Build.VERSION.SDK_INT >= 24) {
                this.c.post(new a());
            } else {
                this.c.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* loaded from: classes.dex */
    private static class f implements Animation.AnimationListener {
        private final Animation.AnimationListener b;

        f(Animation.AnimationListener animationListener) {
            this.b = animationListener;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.b;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.b;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.b;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.g$g, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0013g {
        public final Animation a;
        public final Animator b;

        C0013g(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        C0013g(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends AnimatorListenerAdapter {
        View a;

        h(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.setLayerType(0, null);
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.setLayerType(2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class i extends AnimationSet implements Runnable {
        private final ViewGroup b;
        private final View c;
        private boolean d;
        private boolean e;
        private boolean f;

        i(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f = true;
            this.b = viewGroup;
            this.c = view;
            addAnimation(animation);
            this.b.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f = true;
            if (this.d) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.d = true;
                androidx.fragment.app.n.a(this.b, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f = true;
            if (this.d) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.d = true;
                androidx.fragment.app.n.a(this.b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.d || !this.f) {
                this.b.endViewTransition(this.c);
                this.e = true;
            } else {
                this.f = false;
                this.b.post(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class j {
        final f.a a;
        final boolean b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k {
        public static final int[] a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface l {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    private class m implements l {
        final String a;
        final int b;
        final int c;

        m(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // androidx.fragment.app.g.l
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            androidx.fragment.app.f U;
            Fragment fragment = g.this.q;
            if (fragment == null || this.b >= 0 || this.a != null || (U = fragment.U()) == null || !U.d()) {
                return g.this.a(arrayList, arrayList2, this.a, this.b, this.c);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class n implements Fragment.f {
        final boolean a;
        final androidx.fragment.app.a b;
        private int c;

        n(androidx.fragment.app.a aVar, boolean z) {
            this.a = z;
            this.b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.f
        public void a() {
            int i = this.c - 1;
            this.c = i;
            if (i != 0) {
                return;
            }
            this.b.a.w();
        }

        @Override // androidx.fragment.app.Fragment.f
        public void b() {
            this.c++;
        }

        public void c() {
            androidx.fragment.app.a aVar = this.b;
            aVar.a.a(aVar, this.a, false, false);
        }

        public void d() {
            boolean z = this.c > 0;
            g gVar = this.b.a;
            int size = gVar.e.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = gVar.e.get(i);
                fragment.a((Fragment.f) null);
                if (z && fragment.I()) {
                    fragment.e0();
                }
            }
            androidx.fragment.app.a aVar = this.b;
            aVar.a.a(aVar, this.a, !z, true);
        }

        public boolean e() {
            return this.c == 0;
        }
    }

    static {
        new AccelerateInterpolator(2.5f);
        new AccelerateInterpolator(1.5f);
    }

    private void A() {
        this.c = false;
        this.y.clear();
        this.x.clear();
    }

    private void B() {
        SparseArray<Fragment> sparseArray = this.f;
        int size = sparseArray == null ? 0 : sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment valueAt = this.f.valueAt(i2);
            if (valueAt != null) {
                if (valueAt.h() != null) {
                    int A = valueAt.A();
                    View h2 = valueAt.h();
                    Animation animation = h2.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        h2.clearAnimation();
                    }
                    valueAt.a((View) null);
                    a(valueAt, A, 0, 0, false);
                } else if (valueAt.i() != null) {
                    valueAt.i().end();
                }
            }
        }
    }

    private void C() {
        if (this.C != null) {
            while (!this.C.isEmpty()) {
                this.C.remove(0).d();
            }
        }
    }

    private int a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, d0<Fragment> d0Var) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            androidx.fragment.app.a aVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.e() && !aVar.a(arrayList, i5 + 1, i3)) {
                if (this.C == null) {
                    this.C = new ArrayList<>();
                }
                n nVar = new n(aVar, booleanValue);
                this.C.add(nVar);
                aVar.a(nVar);
                if (booleanValue) {
                    aVar.c();
                } else {
                    aVar.b(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                a(d0Var);
            }
        }
        return i4;
    }

    private static Animation.AnimationListener a(Animation animation) {
        try {
            if (G == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                G = declaredField;
                declaredField.setAccessible(true);
            }
            return (Animation.AnimationListener) G.get(animation);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    static C0013g a(Context context, float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(I);
        alphaAnimation.setDuration(220L);
        return new C0013g(alphaAnimation);
    }

    static C0013g a(Context context, float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(H);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(I);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new C0013g(animationSet);
    }

    private static void a(View view, C0013g c0013g) {
        if (view == null || c0013g == null || !b(view, c0013g)) {
            return;
        }
        Animator animator = c0013g.b;
        if (animator != null) {
            animator.addListener(new h(view));
            return;
        }
        Animation.AnimationListener a2 = a(c0013g.a);
        view.setLayerType(2, null);
        c0013g.a.setAnimationListener(new e(view, a2));
    }

    private void a(Fragment fragment, C0013g c0013g, int i2) {
        View view = fragment.J;
        ViewGroup viewGroup = fragment.I;
        viewGroup.startViewTransition(view);
        fragment.b(i2);
        if (c0013g.a != null) {
            i iVar = new i(c0013g.a, viewGroup, view);
            fragment.a(fragment.J);
            iVar.setAnimationListener(new b(a(iVar), viewGroup, fragment));
            a(view, c0013g);
            fragment.J.startAnimation(iVar);
            return;
        }
        Animator animator = c0013g.b;
        fragment.a(animator);
        animator.addListener(new c(viewGroup, view, fragment));
        animator.setTarget(fragment.J);
        a(fragment.J, c0013g);
        animator.start();
    }

    private static void a(androidx.fragment.app.h hVar) {
        if (hVar == null) {
            return;
        }
        List<Fragment> b2 = hVar.b();
        if (b2 != null) {
            Iterator<Fragment> it = b2.iterator();
            while (it.hasNext()) {
                it.next().E = true;
            }
        }
        List<androidx.fragment.app.h> a2 = hVar.a();
        if (a2 != null) {
            Iterator<androidx.fragment.app.h> it2 = a2.iterator();
            while (it2.hasNext()) {
                a(it2.next());
            }
        }
    }

    private void a(d0<Fragment> d0Var) {
        int i2 = this.m;
        if (i2 < 1) {
            return;
        }
        int min = Math.min(i2, 3);
        int size = this.e.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.e.get(i3);
            if (fragment.b < min) {
                a(fragment, min, fragment.r(), fragment.s(), false);
                if (fragment.J != null && !fragment.B && fragment.O) {
                    d0Var.add(fragment);
                }
            }
        }
    }

    private void a(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new r1("FragmentManager"));
        androidx.fragment.app.e eVar = this.n;
        try {
            if (eVar != null) {
                eVar.a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } else {
                a("  ", (FileDescriptor) null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    private void a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<n> arrayList3 = this.C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            n nVar = this.C.get(i2);
            if (arrayList == null || nVar.a || (indexOf2 = arrayList.indexOf(nVar.b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (nVar.e() || (arrayList != null && nVar.b.a(arrayList, 0, arrayList.size()))) {
                    this.C.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || nVar.a || (indexOf = arrayList.indexOf(nVar.b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        nVar.d();
                    }
                }
                i2++;
            }
            nVar.c();
            i2++;
        }
    }

    private static void a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.fragment.app.a aVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                aVar.a(-1);
                aVar.b(i2 == i3 + (-1));
            } else {
                aVar.a(1);
                aVar.c();
            }
            i2++;
        }
    }

    static boolean a(Animator animator) {
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
                if (a(childAnimations.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean a(C0013g c0013g) {
        Animation animation = c0013g.a;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return a(c0013g.b);
        }
        List<Animation> animations = ((AnimationSet) animation).getAnimations();
        for (int i2 = 0; i2 < animations.size(); i2++) {
            if (animations.get(i2) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    private boolean a(String str, int i2, int i3) {
        androidx.fragment.app.f U;
        o();
        c(true);
        Fragment fragment = this.q;
        if (fragment != null && i2 < 0 && str == null && (U = fragment.U()) != null && U.d()) {
            return true;
        }
        boolean a2 = a(this.x, this.y, str, i2, i3);
        if (a2) {
            this.c = true;
            try {
                c(this.x, this.y);
            } finally {
                A();
            }
        }
        n();
        y();
        return a2;
    }

    public static int b(int i2, boolean z) {
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

    private void b(d0<Fragment> d0Var) {
        int size = d0Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment f2 = d0Var.f(i2);
            if (!f2.l) {
                View B = f2.B();
                f2.Q = B.getAlpha();
                B.setAlpha(0.0f);
            }
        }
    }

    private void b(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i2;
        boolean z = arrayList.get(i6).s;
        ArrayList<Fragment> arrayList3 = this.z;
        if (arrayList3 == null) {
            this.z = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.z.addAll(this.e);
        Fragment q = q();
        boolean z2 = false;
        for (int i7 = i6; i7 < i3; i7++) {
            androidx.fragment.app.a aVar = arrayList.get(i7);
            q = !arrayList2.get(i7).booleanValue() ? aVar.a(this.z, q) : aVar.b(this.z, q);
            z2 = z2 || aVar.i;
        }
        this.z.clear();
        if (!z) {
            androidx.fragment.app.j.a(this, arrayList, arrayList2, i2, i3, false);
        }
        a(arrayList, arrayList2, i2, i3);
        if (z) {
            d0<Fragment> d0Var = new d0<>();
            a(d0Var);
            int a2 = a(arrayList, arrayList2, i2, i3, d0Var);
            b(d0Var);
            i4 = a2;
        } else {
            i4 = i3;
        }
        if (i4 != i6 && z) {
            androidx.fragment.app.j.a(this, arrayList, arrayList2, i2, i4, true);
            a(this.m, true);
        }
        while (i6 < i3) {
            androidx.fragment.app.a aVar2 = arrayList.get(i6);
            if (arrayList2.get(i6).booleanValue() && (i5 = aVar2.l) >= 0) {
                b(i5);
                aVar2.l = -1;
            }
            aVar2.f();
            i6++;
        }
        if (z2) {
            s();
        }
    }

    static boolean b(View view, C0013g c0013g) {
        return view != null && c0013g != null && Build.VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && q2.u(view) && a(c0013g);
    }

    private boolean b(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.b != null && this.b.size() != 0) {
                int size = this.b.size();
                boolean z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    z |= this.b.get(i2).a(arrayList, arrayList2);
                }
                this.b.clear();
                this.n.e().removeCallbacks(this.E);
                return z;
            }
            return false;
        }
    }

    private void c(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        a(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).s) {
                if (i3 != i2) {
                    b(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).s) {
                        i3++;
                    }
                }
                b(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            b(arrayList, arrayList2, i3, size);
        }
    }

    private void c(boolean z) {
        if (this.c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.n == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.n.e().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            z();
        }
        if (this.x == null) {
            this.x = new ArrayList<>();
            this.y = new ArrayList<>();
        }
        this.c = true;
        try {
            a((ArrayList<androidx.fragment.app.a>) null, (ArrayList<Boolean>) null);
        } finally {
            this.c = false;
        }
    }

    private void d(int i2) {
        try {
            this.c = true;
            a(i2, false);
            this.c = false;
            o();
        } catch (Throwable th) {
            this.c = false;
            throw th;
        }
    }

    public static int e(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private Fragment p(Fragment fragment) {
        ViewGroup viewGroup = fragment.I;
        View view = fragment.J;
        if (viewGroup != null && view != null) {
            for (int indexOf = this.e.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.e.get(indexOf);
                if (fragment2.I == viewGroup && fragment2.J != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void y() {
        SparseArray<Fragment> sparseArray = this.f;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.f.valueAt(size) == null) {
                    SparseArray<Fragment> sparseArray2 = this.f;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    private void z() {
        if (c()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.v == null) {
            return;
        }
        throw new IllegalStateException("Can not perform this action inside of " + this.v);
    }

    @Override // androidx.fragment.app.f
    public Fragment a(int i2) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            Fragment fragment = this.e.get(size);
            if (fragment != null && fragment.y == i2) {
                return fragment;
            }
        }
        SparseArray<Fragment> sparseArray = this.f;
        if (sparseArray == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            Fragment valueAt = this.f.valueAt(size2);
            if (valueAt != null && valueAt.y == i2) {
                return valueAt;
            }
        }
        return null;
    }

    public Fragment a(Bundle bundle, String str) {
        int i2 = bundle.getInt(str, -1);
        if (i2 == -1) {
            return null;
        }
        Fragment fragment = this.f.get(i2);
        if (fragment != null) {
            return fragment;
        }
        a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i2));
        throw null;
    }

    @Override // androidx.fragment.app.f
    public Fragment a(String str) {
        if (str != null) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                Fragment fragment = this.e.get(size);
                if (fragment != null && str.equals(fragment.A)) {
                    return fragment;
                }
            }
        }
        SparseArray<Fragment> sparseArray = this.f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            Fragment valueAt = this.f.valueAt(size2);
            if (valueAt != null && str.equals(valueAt.A)) {
                return valueAt;
            }
        }
        return null;
    }

    C0013g a(Fragment fragment, int i2, boolean z, int i3) {
        int b2;
        int r = fragment.r();
        Animation a2 = fragment.a(i2, z, r);
        if (a2 != null) {
            return new C0013g(a2);
        }
        Animator b3 = fragment.b(i2, z, r);
        if (b3 != null) {
            return new C0013g(b3);
        }
        if (r != 0) {
            boolean equals = "anim".equals(this.n.c().getResources().getResourceTypeName(r));
            boolean z2 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.n.c(), r);
                    if (loadAnimation != null) {
                        return new C0013g(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.n.c(), r);
                    if (loadAnimator != null) {
                        return new C0013g(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (equals) {
                        throw e3;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this.n.c(), r);
                    if (loadAnimation2 != null) {
                        return new C0013g(loadAnimation2);
                    }
                }
            }
        }
        if (i2 == 0 || (b2 = b(i2, z)) < 0) {
            return null;
        }
        switch (b2) {
            case 1:
                return a(this.n.c(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return a(this.n.c(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return a(this.n.c(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return a(this.n.c(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return a(this.n.c(), 0.0f, 1.0f);
            case 6:
                return a(this.n.c(), 1.0f, 0.0f);
            default:
                if (i3 != 0 || !this.n.h()) {
                    return null;
                }
                this.n.g();
                return null;
        }
    }

    @Override // androidx.fragment.app.f
    public androidx.fragment.app.i a() {
        return new androidx.fragment.app.a(this);
    }

    @Override // androidx.fragment.app.f
    public void a(int i2, int i3) {
        if (i2 >= 0) {
            a((l) new m(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public void a(int i2, androidx.fragment.app.a aVar) {
        synchronized (this) {
            if (this.i == null) {
                this.i = new ArrayList<>();
            }
            int size = this.i.size();
            if (i2 < size) {
                if (F) {
                    String str = "Setting back stack index " + i2 + " to " + aVar;
                }
                this.i.set(i2, aVar);
            } else {
                while (size < i2) {
                    this.i.add(null);
                    if (this.j == null) {
                        this.j = new ArrayList<>();
                    }
                    if (F) {
                        String str2 = "Adding available back stack index " + size;
                    }
                    this.j.add(Integer.valueOf(size));
                    size++;
                }
                if (F) {
                    String str3 = "Adding back stack index " + i2 + " with " + aVar;
                }
                this.i.add(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i2, boolean z) {
        androidx.fragment.app.e eVar;
        if (this.n == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.m) {
            this.m = i2;
            if (this.f != null) {
                int size = this.e.size();
                for (int i3 = 0; i3 < size; i3++) {
                    h(this.e.get(i3));
                }
                int size2 = this.f.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Fragment valueAt = this.f.valueAt(i4);
                    if (valueAt != null && ((valueAt.m || valueAt.C) && !valueAt.O)) {
                        h(valueAt);
                    }
                }
                x();
                if (this.r && (eVar = this.n) != null && this.m == 4) {
                    eVar.i();
                    this.r = false;
                }
            }
        }
    }

    public void a(Configuration configuration) {
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            Fragment fragment = this.e.get(i2);
            if (fragment != null) {
                fragment.a(configuration);
            }
        }
    }

    public void a(Bundle bundle, String str, Fragment fragment) {
        int i2 = fragment.f;
        if (i2 >= 0) {
            bundle.putInt(str, i2);
            return;
        }
        a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Parcelable parcelable, androidx.fragment.app.h hVar) {
        List<androidx.fragment.app.h> list;
        List<r> list2;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.b == null) {
            return;
        }
        if (hVar != null) {
            List<Fragment> b2 = hVar.b();
            list = hVar.a();
            list2 = hVar.c();
            int size = b2 != null ? b2.size() : 0;
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = b2.get(i2);
                if (F) {
                    String str = "restoreAllState: re-attaching retained " + fragment;
                }
                int i3 = 0;
                while (true) {
                    FragmentState[] fragmentStateArr = fragmentManagerState.b;
                    if (i3 >= fragmentStateArr.length || fragmentStateArr[i3].c == fragment.f) {
                        break;
                    } else {
                        i3++;
                    }
                }
                FragmentState[] fragmentStateArr2 = fragmentManagerState.b;
                if (i3 == fragmentStateArr2.length) {
                    a(new IllegalStateException("Could not find active fragment with index " + fragment.f));
                    throw null;
                }
                FragmentState fragmentState = fragmentStateArr2[i3];
                fragmentState.m = fragment;
                fragment.d = null;
                fragment.r = 0;
                fragment.o = false;
                fragment.l = false;
                fragment.i = null;
                Bundle bundle = fragmentState.l;
                if (bundle != null) {
                    bundle.setClassLoader(this.n.c().getClassLoader());
                    fragment.d = fragmentState.l.getSparseParcelableArray("android:view_state");
                    fragment.c = fragmentState.l;
                }
            }
        } else {
            list = null;
            list2 = null;
        }
        this.f = new SparseArray<>(fragmentManagerState.b.length);
        int i4 = 0;
        while (true) {
            FragmentState[] fragmentStateArr3 = fragmentManagerState.b;
            if (i4 >= fragmentStateArr3.length) {
                break;
            }
            FragmentState fragmentState2 = fragmentStateArr3[i4];
            if (fragmentState2 != null) {
                Fragment a2 = fragmentState2.a(this.n, this.o, this.p, (list == null || i4 >= list.size()) ? null : list.get(i4), (list2 == null || i4 >= list2.size()) ? null : list2.get(i4));
                if (F) {
                    String str2 = "restoreAllState: active #" + i4 + ": " + a2;
                }
                this.f.put(a2.f, a2);
                fragmentState2.m = null;
            }
            i4++;
        }
        if (hVar != null) {
            List<Fragment> b3 = hVar.b();
            int size2 = b3 != null ? b3.size() : 0;
            for (int i5 = 0; i5 < size2; i5++) {
                Fragment fragment2 = b3.get(i5);
                int i6 = fragment2.j;
                if (i6 >= 0) {
                    Fragment fragment3 = this.f.get(i6);
                    fragment2.i = fragment3;
                    if (fragment3 == null) {
                        String str3 = "Re-attaching retained fragment " + fragment2 + " target no longer exists: " + fragment2.j;
                    }
                }
            }
        }
        this.e.clear();
        if (fragmentManagerState.c != null) {
            int i7 = 0;
            while (true) {
                int[] iArr = fragmentManagerState.c;
                if (i7 >= iArr.length) {
                    break;
                }
                Fragment fragment4 = this.f.get(iArr[i7]);
                if (fragment4 == null) {
                    a(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.c[i7]));
                    throw null;
                }
                fragment4.l = true;
                if (F) {
                    String str4 = "restoreAllState: added #" + i7 + ": " + fragment4;
                }
                if (this.e.contains(fragment4)) {
                    throw new IllegalStateException("Already added!");
                }
                synchronized (this.e) {
                    this.e.add(fragment4);
                }
                i7++;
            }
        }
        if (fragmentManagerState.d != null) {
            this.g = new ArrayList<>(fragmentManagerState.d.length);
            int i8 = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.d;
                if (i8 >= backStackStateArr.length) {
                    break;
                }
                androidx.fragment.app.a a3 = backStackStateArr[i8].a(this);
                if (F) {
                    String str5 = "restoreAllState: back stack #" + i8 + " (index " + a3.l + "): " + a3;
                    PrintWriter printWriter = new PrintWriter(new r1("FragmentManager"));
                    a3.a("  ", printWriter, false);
                    printWriter.close();
                }
                this.g.add(a3);
                int i9 = a3.l;
                if (i9 >= 0) {
                    a(i9, a3);
                }
                i8++;
            }
        } else {
            this.g = null;
        }
        int i10 = fragmentManagerState.e;
        if (i10 >= 0) {
            this.q = this.f.get(i10);
        }
        this.d = fragmentManagerState.f;
    }

    public void a(Menu menu) {
        if (this.m < 1) {
            return;
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            Fragment fragment = this.e.get(i2);
            if (fragment != null) {
                fragment.c(menu);
            }
        }
    }

    public void a(Fragment fragment) {
        if (F) {
            String str = "attach: " + fragment;
        }
        if (fragment.C) {
            fragment.C = false;
            if (fragment.l) {
                return;
            }
            if (this.e.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            if (F) {
                String str2 = "add from attach: " + fragment;
            }
            synchronized (this.e) {
                this.e.add(fragment);
            }
            fragment.l = true;
            if (fragment.F && fragment.G) {
                this.r = true;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.fragment.app.Fragment r16, int r17, int r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.g.a(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    void a(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            androidx.fragment.app.f p = fragment2.p();
            if (p instanceof g) {
                ((g) p).a(fragment, context, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.b) {
                next.a.a(this, fragment, context);
            }
        }
    }

    void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            androidx.fragment.app.f p = fragment2.p();
            if (p instanceof g) {
                ((g) p).a(fragment, bundle, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.b) {
                next.a.a(this, fragment, bundle);
            }
        }
    }

    void a(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            androidx.fragment.app.f p = fragment2.p();
            if (p instanceof g) {
                ((g) p).a(fragment, view, bundle, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.b) {
                next.a.a(this, fragment, view, bundle);
            }
        }
    }

    public void a(Fragment fragment, boolean z) {
        if (F) {
            String str = "add: " + fragment;
        }
        f(fragment);
        if (fragment.C) {
            return;
        }
        if (this.e.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.e) {
            this.e.add(fragment);
        }
        fragment.l = true;
        fragment.m = false;
        if (fragment.J == null) {
            fragment.P = false;
        }
        if (fragment.F && fragment.G) {
            this.r = true;
        }
        if (z) {
            i(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(androidx.fragment.app.a aVar) {
        if (this.g == null) {
            this.g = new ArrayList<>();
        }
        this.g.add(aVar);
    }

    void a(androidx.fragment.app.a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.b(z3);
        } else {
            aVar.c();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            androidx.fragment.app.j.a(this, (ArrayList<androidx.fragment.app.a>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            a(this.m, true);
        }
        SparseArray<Fragment> sparseArray = this.f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment valueAt = this.f.valueAt(i2);
                if (valueAt != null && valueAt.J != null && valueAt.O && aVar.b(valueAt.z)) {
                    float f2 = valueAt.Q;
                    if (f2 > 0.0f) {
                        valueAt.J.setAlpha(f2);
                    }
                    if (z3) {
                        valueAt.Q = 0.0f;
                    } else {
                        valueAt.Q = -1.0f;
                        valueAt.O = false;
                    }
                }
            }
        }
    }

    public void a(androidx.fragment.app.e eVar, androidx.fragment.app.c cVar, Fragment fragment) {
        if (this.n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.n = eVar;
        this.o = cVar;
        this.p = fragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.fragment.app.g.l r2, boolean r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L5
            r1.z()
        L5:
            monitor-enter(r1)
            boolean r0 = r1.u     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L24
            androidx.fragment.app.e r0 = r1.n     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto Lf
            goto L24
        Lf:
            java.util.ArrayList<androidx.fragment.app.g$l> r3 = r1.b     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L1a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r3.<init>()     // Catch: java.lang.Throwable -> L30
            r1.b = r3     // Catch: java.lang.Throwable -> L30
        L1a:
            java.util.ArrayList<androidx.fragment.app.g$l> r3 = r1.b     // Catch: java.lang.Throwable -> L30
            r3.add(r2)     // Catch: java.lang.Throwable -> L30
            r1.w()     // Catch: java.lang.Throwable -> L30
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.g.a(androidx.fragment.app.g$l, boolean):void");
    }

    @Override // androidx.fragment.app.f
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + "    ";
        SparseArray<Fragment> sparseArray = this.f;
        if (sparseArray != null && (size5 = sparseArray.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i2 = 0; i2 < size5; i2++) {
                Fragment valueAt = this.f.valueAt(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(valueAt);
                if (valueAt != null) {
                    valueAt.a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.e.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size6; i3++) {
                Fragment fragment = this.e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.h;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size4; i4++) {
                Fragment fragment2 = this.h.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.g;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size3; i5++) {
                androidx.fragment.app.a aVar = this.g.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.i != null && (size2 = this.i.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i6 = 0; i6 < size2; i6++) {
                    Object obj = (androidx.fragment.app.a) this.i.get(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            if (this.j != null && this.j.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.j.toArray()));
            }
        }
        ArrayList<l> arrayList3 = this.b;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i7 = 0; i7 < size; i7++) {
                Object obj2 = (l) this.b.get(i7);
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
        printWriter.println(this.n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.o);
        if (this.p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.s);
        printWriter.print(" mStopped=");
        printWriter.print(this.t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.u);
        if (this.r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.r);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.v);
        }
    }

    public void a(boolean z) {
        int size = this.e.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Fragment fragment = this.e.get(size);
            if (fragment != null) {
                fragment.d(z);
            }
        }
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        if (this.m < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            Fragment fragment = this.e.get(i2);
            if (fragment != null && fragment.b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.h != null) {
            for (int i3 = 0; i3 < this.h.size(); i3++) {
                Fragment fragment2 = this.h.get(i3);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.N();
                }
            }
        }
        this.h = arrayList;
        return z;
    }

    public boolean a(MenuItem menuItem) {
        if (this.m < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            Fragment fragment = this.e.get(i2);
            if (fragment != null && fragment.c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.g;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.g.remove(size));
            arrayList2.add(true);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = this.g.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.g.get(size2);
                    if ((str != null && str.equals(aVar.d())) || (i2 >= 0 && i2 == aVar.l)) {
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
                        androidx.fragment.app.a aVar2 = this.g.get(size2);
                        if (str == null || !str.equals(aVar2.d())) {
                            if (i2 < 0 || i2 != aVar2.l) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.g.size() - 1) {
                return false;
            }
            for (int size3 = this.g.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.g.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }

    public int b(androidx.fragment.app.a aVar) {
        synchronized (this) {
            if (this.j != null && this.j.size() > 0) {
                int intValue = this.j.remove(this.j.size() - 1).intValue();
                if (F) {
                    String str = "Adding back stack index " + intValue + " with " + aVar;
                }
                this.i.set(intValue, aVar);
                return intValue;
            }
            if (this.i == null) {
                this.i = new ArrayList<>();
            }
            int size = this.i.size();
            if (F) {
                String str2 = "Setting back stack index " + size + " to " + aVar;
            }
            this.i.add(aVar);
            return size;
        }
    }

    public Fragment b(String str) {
        Fragment a2;
        SparseArray<Fragment> sparseArray = this.f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            Fragment valueAt = this.f.valueAt(size);
            if (valueAt != null && (a2 = valueAt.a(str)) != null) {
                return a2;
            }
        }
        return null;
    }

    @Override // androidx.fragment.app.f
    public List<Fragment> b() {
        List<Fragment> list;
        if (this.e.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.e) {
            list = (List) this.e.clone();
        }
        return list;
    }

    public void b(int i2) {
        synchronized (this) {
            this.i.set(i2, null);
            if (this.j == null) {
                this.j = new ArrayList<>();
            }
            if (F) {
                String str = "Freeing back stack index " + i2;
            }
            this.j.add(Integer.valueOf(i2));
        }
    }

    void b(Fragment fragment) {
        Animator animator;
        if (fragment.J != null) {
            C0013g a2 = a(fragment, fragment.s(), !fragment.B, fragment.t());
            if (a2 == null || (animator = a2.b) == null) {
                if (a2 != null) {
                    a(fragment.J, a2);
                    fragment.J.startAnimation(a2.a);
                    a2.a.start();
                }
                fragment.J.setVisibility((!fragment.B || fragment.G()) ? 0 : 8);
                if (fragment.G()) {
                    fragment.g(false);
                }
            } else {
                animator.setTarget(fragment.J);
                if (!fragment.B) {
                    fragment.J.setVisibility(0);
                } else if (fragment.G()) {
                    fragment.g(false);
                } else {
                    ViewGroup viewGroup = fragment.I;
                    View view = fragment.J;
                    viewGroup.startViewTransition(view);
                    a2.b.addListener(new d(this, viewGroup, view, fragment));
                }
                a(fragment.J, a2);
                a2.b.start();
            }
        }
        if (fragment.l && fragment.F && fragment.G) {
            this.r = true;
        }
        fragment.P = false;
        fragment.a(fragment.B);
    }

    void b(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            androidx.fragment.app.f p = fragment2.p();
            if (p instanceof g) {
                ((g) p).b(fragment, context, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.b) {
                next.a.b(this, fragment, context);
            }
        }
    }

    void b(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            androidx.fragment.app.f p = fragment2.p();
            if (p instanceof g) {
                ((g) p).b(fragment, bundle, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.b) {
                next.a.b(this, fragment, bundle);
            }
        }
    }

    void b(Fragment fragment, boolean z) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            androidx.fragment.app.f p = fragment2.p();
            if (p instanceof g) {
                ((g) p).b(fragment, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.b) {
                next.a.a(this, fragment);
            }
        }
    }

    public void b(boolean z) {
        int size = this.e.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Fragment fragment = this.e.get(size);
            if (fragment != null) {
                fragment.e(z);
            }
        }
    }

    public boolean b(Menu menu) {
        if (this.m < 1) {
            return false;
        }
        boolean z = false;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            Fragment fragment = this.e.get(i2);
            if (fragment != null && fragment.d(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean b(MenuItem menuItem) {
        if (this.m < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            Fragment fragment = this.e.get(i2);
            if (fragment != null && fragment.d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void c(Fragment fragment) {
        if (F) {
            String str = "detach: " + fragment;
        }
        if (fragment.C) {
            return;
        }
        fragment.C = true;
        if (fragment.l) {
            if (F) {
                String str2 = "remove from detach: " + fragment;
            }
            synchronized (this.e) {
                this.e.remove(fragment);
            }
            if (fragment.F && fragment.G) {
                this.r = true;
            }
            fragment.l = false;
        }
    }

    void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            androidx.fragment.app.f p = fragment2.p();
            if (p instanceof g) {
                ((g) p).c(fragment, bundle, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.b) {
                next.a.c(this, fragment, bundle);
            }
        }
    }

    void c(Fragment fragment, boolean z) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            androidx.fragment.app.f p = fragment2.p();
            if (p instanceof g) {
                ((g) p).c(fragment, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.b) {
                next.a.b(this, fragment);
            }
        }
    }

    @Override // androidx.fragment.app.f
    public boolean c() {
        return this.s || this.t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(int i2) {
        return this.m >= i2;
    }

    void d(Fragment fragment) {
        if (!fragment.n || fragment.q) {
            return;
        }
        fragment.b(fragment.i(fragment.c), (ViewGroup) null, fragment.c);
        View view = fragment.J;
        if (view == null) {
            fragment.K = null;
            return;
        }
        fragment.K = view;
        view.setSaveFromParentEnabled(false);
        if (fragment.B) {
            fragment.J.setVisibility(8);
        }
        fragment.a(fragment.J, fragment.c);
        a(fragment, fragment.J, fragment.c, false);
    }

    void d(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            androidx.fragment.app.f p = fragment2.p();
            if (p instanceof g) {
                ((g) p).d(fragment, bundle, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.b) {
                next.a.d(this, fragment, bundle);
            }
        }
    }

    void d(Fragment fragment, boolean z) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            androidx.fragment.app.f p = fragment2.p();
            if (p instanceof g) {
                ((g) p).d(fragment, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.b) {
                next.a.c(this, fragment);
            }
        }
    }

    @Override // androidx.fragment.app.f
    public boolean d() {
        z();
        return a((String) null, -1, 0);
    }

    public void e() {
        this.s = false;
        this.t = false;
        d(2);
    }

    public void e(Fragment fragment) {
        if (F) {
            String str = "hide: " + fragment;
        }
        if (fragment.B) {
            return;
        }
        fragment.B = true;
        fragment.P = true ^ fragment.P;
    }

    void e(Fragment fragment, boolean z) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            androidx.fragment.app.f p = fragment2.p();
            if (p instanceof g) {
                ((g) p).e(fragment, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.b) {
                next.a.d(this, fragment);
            }
        }
    }

    public void f() {
        this.s = false;
        this.t = false;
        d(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Fragment fragment) {
        if (fragment.f >= 0) {
            return;
        }
        int i2 = this.d;
        this.d = i2 + 1;
        fragment.a(i2, this.p);
        if (this.f == null) {
            this.f = new SparseArray<>();
        }
        this.f.put(fragment.f, fragment);
        if (F) {
            String str = "Allocated fragment index " + fragment;
        }
    }

    void f(Fragment fragment, boolean z) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            androidx.fragment.app.f p = fragment2.p();
            if (p instanceof g) {
                ((g) p).f(fragment, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.b) {
                next.a.e(this, fragment);
            }
        }
    }

    public void g() {
        this.u = true;
        o();
        d(0);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    void g(Fragment fragment) {
        if (fragment.f < 0) {
            return;
        }
        if (F) {
            String str = "Freeing fragment index " + fragment;
        }
        this.f.put(fragment.f, null);
        fragment.C();
    }

    void g(Fragment fragment, boolean z) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            androidx.fragment.app.f p = fragment2.p();
            if (p instanceof g) {
                ((g) p).g(fragment, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.b) {
                next.a.f(this, fragment);
            }
        }
    }

    public void h() {
        d(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        int i2 = this.m;
        if (fragment.m) {
            i2 = fragment.H() ? Math.min(i2, 1) : Math.min(i2, 0);
        }
        a(fragment, i2, fragment.s(), fragment.t(), false);
        if (fragment.J != null) {
            Fragment p = p(fragment);
            if (p != null) {
                View view = p.J;
                ViewGroup viewGroup = fragment.I;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(fragment.J);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.J, indexOfChild);
                }
            }
            if (fragment.O && fragment.I != null) {
                float f2 = fragment.Q;
                if (f2 > 0.0f) {
                    fragment.J.setAlpha(f2);
                }
                fragment.Q = 0.0f;
                fragment.O = false;
                C0013g a2 = a(fragment, fragment.s(), true, fragment.t());
                if (a2 != null) {
                    a(fragment.J, a2);
                    Animation animation = a2.a;
                    if (animation != null) {
                        fragment.J.startAnimation(animation);
                    } else {
                        a2.b.setTarget(fragment.J);
                        a2.b.start();
                    }
                }
            }
        }
        if (fragment.P) {
            b(fragment);
        }
    }

    void h(Fragment fragment, boolean z) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            androidx.fragment.app.f p = fragment2.p();
            if (p instanceof g) {
                ((g) p).h(fragment, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z || next.b) {
                next.a.g(this, fragment);
            }
        }
    }

    public void i() {
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            Fragment fragment = this.e.get(i2);
            if (fragment != null) {
                fragment.Y();
            }
        }
    }

    void i(Fragment fragment) {
        a(fragment, this.m, 0, 0, false);
    }

    public void j() {
        d(3);
    }

    public void j(Fragment fragment) {
        if (fragment.L) {
            if (this.c) {
                this.w = true;
            } else {
                fragment.L = false;
                a(fragment, this.m, 0, 0, false);
            }
        }
    }

    public void k() {
        this.s = false;
        this.t = false;
        d(4);
    }

    public void k(Fragment fragment) {
        if (F) {
            String str = "remove: " + fragment + " nesting=" + fragment.r;
        }
        boolean z = !fragment.H();
        if (!fragment.C || z) {
            synchronized (this.e) {
                this.e.remove(fragment);
            }
            if (fragment.F && fragment.G) {
                this.r = true;
            }
            fragment.l = false;
            fragment.m = true;
        }
    }

    Bundle l(Fragment fragment) {
        if (this.A == null) {
            this.A = new Bundle();
        }
        fragment.j(this.A);
        d(fragment, this.A, false);
        Bundle bundle = null;
        if (!this.A.isEmpty()) {
            Bundle bundle2 = this.A;
            this.A = null;
            bundle = bundle2;
        }
        if (fragment.J != null) {
            m(fragment);
        }
        if (fragment.d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.d);
        }
        if (!fragment.M) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.M);
        }
        return bundle;
    }

    public void l() {
        this.s = false;
        this.t = false;
        d(3);
    }

    public void m() {
        this.t = true;
        d(2);
    }

    void m(Fragment fragment) {
        if (fragment.K == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.B;
        if (sparseArray == null) {
            this.B = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        fragment.K.saveHierarchyState(this.B);
        if (this.B.size() > 0) {
            fragment.d = this.B;
            this.B = null;
        }
    }

    void n() {
        if (this.w) {
            this.w = false;
            x();
        }
    }

    public void n(Fragment fragment) {
        if (fragment == null || (this.f.get(fragment.f) == fragment && (fragment.t == null || fragment.p() == this))) {
            this.q = fragment;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void o(Fragment fragment) {
        if (F) {
            String str = "show: " + fragment;
        }
        if (fragment.B) {
            fragment.B = false;
            fragment.P = !fragment.P;
        }
    }

    public boolean o() {
        c(true);
        boolean z = false;
        while (b(this.x, this.y)) {
            this.c = true;
            try {
                c(this.x, this.y);
                A();
                z = true;
            } catch (Throwable th) {
                A();
                throw th;
            }
        }
        n();
        y();
        return z;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.a(this.n.c(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        Fragment a2 = resourceId != -1 ? a(resourceId) : null;
        if (a2 == null && string != null) {
            a2 = a(string);
        }
        if (a2 == null && id != -1) {
            a2 = a(id);
        }
        if (F) {
            String str3 = "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + a2;
        }
        if (a2 == null) {
            a2 = this.o.a(context, str2, null);
            a2.n = true;
            a2.y = resourceId != 0 ? resourceId : id;
            a2.z = id;
            a2.A = string;
            a2.o = true;
            a2.s = this;
            androidx.fragment.app.e eVar = this.n;
            a2.t = eVar;
            a2.a(eVar.c(), attributeSet, a2.c);
            a(a2, true);
        } else {
            if (a2.o) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            }
            a2.o = true;
            androidx.fragment.app.e eVar2 = this.n;
            a2.t = eVar2;
            if (!a2.E) {
                a2.a(eVar2.c(), attributeSet, a2.c);
            }
        }
        Fragment fragment = a2;
        if (this.m >= 1 || !fragment.n) {
            i(fragment);
        } else {
            a(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.J;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.J.getTag() == null) {
                fragment.J.setTag(string);
            }
            return fragment.J;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater.Factory2 p() {
        return this;
    }

    public Fragment q() {
        return this.q;
    }

    public void r() {
        this.D = null;
        this.s = false;
        this.t = false;
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.e.get(i2);
            if (fragment != null) {
                fragment.L();
            }
        }
    }

    void s() {
        if (this.k != null) {
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                this.k.get(i2).a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.h t() {
        a(this.D);
        return this.D;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.p;
        if (obj == null) {
            obj = this.n;
        }
        q1.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Parcelable u() {
        int[] iArr;
        int size;
        C();
        B();
        o();
        this.s = true;
        BackStackState[] backStackStateArr = null;
        this.D = null;
        SparseArray<Fragment> sparseArray = this.f;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int size2 = this.f.size();
        FragmentState[] fragmentStateArr = new FragmentState[size2];
        boolean z = false;
        for (int i2 = 0; i2 < size2; i2++) {
            Fragment valueAt = this.f.valueAt(i2);
            if (valueAt != null) {
                if (valueAt.f < 0) {
                    a(new IllegalStateException("Failure saving state: active " + valueAt + " has cleared index: " + valueAt.f));
                    throw null;
                }
                FragmentState fragmentState = new FragmentState(valueAt);
                fragmentStateArr[i2] = fragmentState;
                if (valueAt.b <= 0 || fragmentState.l != null) {
                    fragmentState.l = valueAt.c;
                } else {
                    Bundle l2 = l(valueAt);
                    fragmentState.l = l2;
                    Fragment fragment = valueAt.i;
                    if (fragment != null) {
                        if (fragment.f < 0) {
                            a(new IllegalStateException("Failure saving state: " + valueAt + " has target not in fragment manager: " + valueAt.i));
                            throw null;
                        }
                        if (l2 == null) {
                            fragmentState.l = new Bundle();
                        }
                        a(fragmentState.l, "android:target_state", valueAt.i);
                        int i3 = valueAt.k;
                        if (i3 != 0) {
                            fragmentState.l.putInt("android:target_req_state", i3);
                        }
                    }
                }
                if (F) {
                    String str = "Saved state of " + valueAt + ": " + fragmentState.l;
                }
                z = true;
            }
        }
        if (!z) {
            boolean z2 = F;
            return null;
        }
        int size3 = this.e.size();
        if (size3 > 0) {
            iArr = new int[size3];
            for (int i4 = 0; i4 < size3; i4++) {
                iArr[i4] = this.e.get(i4).f;
                if (iArr[i4] < 0) {
                    a(new IllegalStateException("Failure saving state: active " + this.e.get(i4) + " has cleared index: " + iArr[i4]));
                    throw null;
                }
                if (F) {
                    String str2 = "saveAllState: adding fragment #" + i4 + ": " + this.e.get(i4);
                }
            }
        } else {
            iArr = null;
        }
        ArrayList<androidx.fragment.app.a> arrayList = this.g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i5 = 0; i5 < size; i5++) {
                backStackStateArr[i5] = new BackStackState(this.g.get(i5));
                if (F) {
                    String str3 = "saveAllState: adding back stack #" + i5 + ": " + this.g.get(i5);
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.b = fragmentStateArr;
        fragmentManagerState.c = iArr;
        fragmentManagerState.d = backStackStateArr;
        Fragment fragment2 = this.q;
        if (fragment2 != null) {
            fragmentManagerState.e = fragment2.f;
        }
        fragmentManagerState.f = this.d;
        v();
        return fragmentManagerState;
    }

    void v() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        androidx.fragment.app.h hVar;
        if (this.f != null) {
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                Fragment valueAt = this.f.valueAt(i2);
                if (valueAt != null) {
                    if (valueAt.D) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(valueAt);
                        Fragment fragment = valueAt.i;
                        valueAt.j = fragment != null ? fragment.f : -1;
                        if (F) {
                            String str = "retainNonConfig: keeping retained " + valueAt;
                        }
                    }
                    g gVar = valueAt.u;
                    if (gVar != null) {
                        gVar.v();
                        hVar = valueAt.u.D;
                    } else {
                        hVar = valueAt.v;
                    }
                    if (arrayList2 == null && hVar != null) {
                        arrayList2 = new ArrayList(this.f.size());
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(hVar);
                    }
                    if (arrayList3 == null && valueAt.w != null) {
                        arrayList3 = new ArrayList(this.f.size());
                        for (int i4 = 0; i4 < i2; i4++) {
                            arrayList3.add(null);
                        }
                    }
                    if (arrayList3 != null) {
                        arrayList3.add(valueAt.w);
                    }
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
        }
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            this.D = null;
        } else {
            this.D = new androidx.fragment.app.h(arrayList, arrayList2, arrayList3);
        }
    }

    void w() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = (this.C == null || this.C.isEmpty()) ? false : true;
            if (this.b != null && this.b.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.n.e().removeCallbacks(this.E);
                this.n.e().post(this.E);
            }
        }
    }

    void x() {
        if (this.f == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Fragment valueAt = this.f.valueAt(i2);
            if (valueAt != null) {
                j(valueAt);
            }
        }
    }
}
