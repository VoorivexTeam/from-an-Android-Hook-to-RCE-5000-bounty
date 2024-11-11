package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC0396l;
import androidx.transition.C0374a;

/* renamed from: androidx.transition.h0 */
/* loaded from: classes.dex */
public abstract class AbstractC0389h0 extends AbstractC0396l {

    /* renamed from: L */
    private static final String[] f2443L = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: K */
    private int f2444K = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.h0$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0406v f2445a;

        /* renamed from: b */
        final /* synthetic */ View f2446b;

        a(AbstractC0389h0 abstractC0389h0, InterfaceC0406v interfaceC0406v, View view) {
            this.f2445a = interfaceC0406v;
            this.f2446b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2445a.mo3057b(this.f2446b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.h0$b */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements AbstractC0396l.f, C0374a.a {

        /* renamed from: a */
        private final View f2447a;

        /* renamed from: b */
        private final int f2448b;

        /* renamed from: c */
        private final ViewGroup f2449c;

        /* renamed from: d */
        private final boolean f2450d;

        /* renamed from: e */
        private boolean f2451e;

        /* renamed from: f */
        boolean f2452f = false;

        b(View view, int i, boolean z) {
            this.f2447a = view;
            this.f2448b = i;
            this.f2449c = (ViewGroup) view.getParent();
            this.f2450d = z;
            m2986a(true);
        }

        /* renamed from: a */
        private void m2985a() {
            if (!this.f2452f) {
                C0379c0.m2946a(this.f2447a, this.f2448b);
                ViewGroup viewGroup = this.f2449c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m2986a(false);
        }

        /* renamed from: a */
        private void m2986a(boolean z) {
            ViewGroup viewGroup;
            if (!this.f2450d || this.f2451e == z || (viewGroup = this.f2449c) == null) {
                return;
            }
            this.f2451e = z;
            C0407w.m3059a(viewGroup, z);
        }

        @Override // androidx.transition.AbstractC0396l.f
        /* renamed from: a */
        public void mo2969a(AbstractC0396l abstractC0396l) {
        }

        @Override // androidx.transition.AbstractC0396l.f
        /* renamed from: b */
        public void mo2937b(AbstractC0396l abstractC0396l) {
            m2986a(false);
        }

        @Override // androidx.transition.AbstractC0396l.f
        /* renamed from: c */
        public void mo2938c(AbstractC0396l abstractC0396l) {
            m2986a(true);
        }

        @Override // androidx.transition.AbstractC0396l.f
        /* renamed from: d */
        public void mo2939d(AbstractC0396l abstractC0396l) {
            m2985a();
            abstractC0396l.mo3020b(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2452f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m2985a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.C0374a.a
        public void onAnimationPause(Animator animator) {
            if (this.f2452f) {
                return;
            }
            C0379c0.m2946a(this.f2447a, this.f2448b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.C0374a.a
        public void onAnimationResume(Animator animator) {
            if (this.f2452f) {
                return;
            }
            C0379c0.m2946a(this.f2447a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.h0$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        boolean f2453a;

        /* renamed from: b */
        boolean f2454b;

        /* renamed from: c */
        int f2455c;

        /* renamed from: d */
        int f2456d;

        /* renamed from: e */
        ViewGroup f2457e;

        /* renamed from: f */
        ViewGroup f2458f;

        c() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (r9 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r0.f2457e == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (r0.f2455c == 0) goto L41;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.transition.AbstractC0389h0.c m2979b(androidx.transition.C0402r r8, androidx.transition.C0402r r9) {
        /*
            r7 = this;
            androidx.transition.h0$c r0 = new androidx.transition.h0$c
            r0.<init>()
            r1 = 0
            r0.f2453a = r1
            r0.f2454b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f2524a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f2524a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f2455c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f2524a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f2457e = r6
            goto L37
        L33:
            r0.f2455c = r4
            r0.f2457e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f2524a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f2524a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f2456d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f2524a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f2458f = r2
            goto L5e
        L5a:
            r0.f2456d = r4
            r0.f2458f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L86
            if (r9 == 0) goto L86
            int r8 = r0.f2455c
            int r9 = r0.f2456d
            if (r8 != r9) goto L70
            android.view.ViewGroup r8 = r0.f2457e
            android.view.ViewGroup r9 = r0.f2458f
            if (r8 != r9) goto L70
            return r0
        L70:
            int r8 = r0.f2455c
            int r9 = r0.f2456d
            if (r8 == r9) goto L7c
            if (r8 != 0) goto L79
            goto L97
        L79:
            if (r9 != 0) goto L9a
            goto L8c
        L7c:
            android.view.ViewGroup r8 = r0.f2458f
            if (r8 != 0) goto L81
            goto L97
        L81:
            android.view.ViewGroup r8 = r0.f2457e
            if (r8 != 0) goto L9a
            goto L8c
        L86:
            if (r8 != 0) goto L91
            int r8 = r0.f2456d
            if (r8 != 0) goto L91
        L8c:
            r0.f2454b = r2
        L8e:
            r0.f2453a = r2
            goto L9a
        L91:
            if (r9 != 0) goto L9a
            int r8 = r0.f2455c
            if (r8 != 0) goto L9a
        L97:
            r0.f2454b = r1
            goto L8e
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.AbstractC0389h0.m2979b(androidx.transition.r, androidx.transition.r):androidx.transition.h0$c");
    }

    /* renamed from: d */
    private void m2980d(C0402r c0402r) {
        c0402r.f2524a.put("android:visibility:visibility", Integer.valueOf(c0402r.f2525b.getVisibility()));
        c0402r.f2524a.put("android:visibility:parent", c0402r.f2525b.getParent());
        int[] iArr = new int[2];
        c0402r.f2525b.getLocationOnScreen(iArr);
        c0402r.f2524a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: a */
    public abstract Animator mo2960a(ViewGroup viewGroup, View view, C0402r c0402r, C0402r c0402r2);

    /* renamed from: a */
    public Animator m2981a(ViewGroup viewGroup, C0402r c0402r, int i, C0402r c0402r2, int i2) {
        if ((this.f2444K & 1) != 1 || c0402r2 == null) {
            return null;
        }
        if (c0402r == null) {
            View view = (View) c0402r2.f2525b.getParent();
            if (m2979b(m3007a(view, false), m3021b(view, false)).f2453a) {
                return null;
            }
        }
        return mo2960a(viewGroup, c0402r2.f2525b, c0402r, c0402r2);
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: a */
    public Animator mo2921a(ViewGroup viewGroup, C0402r c0402r, C0402r c0402r2) {
        c m2979b = m2979b(c0402r, c0402r2);
        if (!m2979b.f2453a) {
            return null;
        }
        if (m2979b.f2457e == null && m2979b.f2458f == null) {
            return null;
        }
        return m2979b.f2454b ? m2981a(viewGroup, c0402r, m2979b.f2455c, c0402r2, m2979b.f2456d) : m2984b(viewGroup, c0402r, m2979b.f2455c, c0402r2, m2979b.f2456d);
    }

    /* renamed from: a */
    public void m2982a(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f2444K = i;
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: a */
    public void mo2922a(C0402r c0402r) {
        m2980d(c0402r);
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: a */
    public boolean mo2983a(C0402r c0402r, C0402r c0402r2) {
        if (c0402r == null && c0402r2 == null) {
            return false;
        }
        if (c0402r != null && c0402r2 != null && c0402r2.f2524a.containsKey("android:visibility:visibility") != c0402r.f2524a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c m2979b = m2979b(c0402r, c0402r2);
        if (m2979b.f2453a) {
            return m2979b.f2455c == 0 || m2979b.f2456d == 0;
        }
        return false;
    }

    /* renamed from: b */
    public abstract Animator mo2961b(ViewGroup viewGroup, View view, C0402r c0402r, C0402r c0402r2);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9 A[RETURN] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator m2984b(android.view.ViewGroup r7, androidx.transition.C0402r r8, int r9, androidx.transition.C0402r r10, int r11) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.AbstractC0389h0.m2984b(android.view.ViewGroup, androidx.transition.r, int, androidx.transition.r, int):android.animation.Animator");
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: c */
    public void mo2923c(C0402r c0402r) {
        m2980d(c0402r);
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: q */
    public String[] mo2924q() {
        return f2443L;
    }
}
