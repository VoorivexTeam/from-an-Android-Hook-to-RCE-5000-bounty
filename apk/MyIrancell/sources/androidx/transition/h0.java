package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.a;
import androidx.transition.l;

/* loaded from: classes.dex */
public abstract class h0 extends l {
    private static final String[] L = {"android:visibility:visibility", "android:visibility:parent"};
    private int K = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ v a;
        final /* synthetic */ View b;

        a(h0 h0Var, v vVar, View view) {
            this.a = vVar;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements l.f, a.InterfaceC0019a {
        private final View a;
        private final int b;
        private final ViewGroup c;
        private final boolean d;
        private boolean e;
        boolean f = false;

        b(View view, int i, boolean z) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            this.d = z;
            a(true);
        }

        private void a() {
            if (!this.f) {
                c0.a(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }

        private void a(boolean z) {
            ViewGroup viewGroup;
            if (!this.d || this.e == z || (viewGroup = this.c) == null) {
                return;
            }
            this.e = z;
            w.a(viewGroup, z);
        }

        @Override // androidx.transition.l.f
        public void a(l lVar) {
        }

        @Override // androidx.transition.l.f
        public void b(l lVar) {
            a(false);
        }

        @Override // androidx.transition.l.f
        public void c(l lVar) {
            a(true);
        }

        @Override // androidx.transition.l.f
        public void d(l lVar) {
            a();
            lVar.b(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.a.InterfaceC0019a
        public void onAnimationPause(Animator animator) {
            if (this.f) {
                return;
            }
            c0.a(this.a, this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.a.InterfaceC0019a
        public void onAnimationResume(Animator animator) {
            if (this.f) {
                return;
            }
            c0.a(this.a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {
        boolean a;
        boolean b;
        int c;
        int d;
        ViewGroup e;
        ViewGroup f;

        c() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (r9 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r0.e == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (r0.c == 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.transition.h0.c b(androidx.transition.r r8, androidx.transition.r r9) {
        /*
            r7 = this;
            androidx.transition.h0$c r0 = new androidx.transition.h0$c
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L37
        L33:
            r0.c = r4
            r0.e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L5e
        L5a:
            r0.d = r4
            r0.f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L86
            if (r9 == 0) goto L86
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L70
            android.view.ViewGroup r8 = r0.e
            android.view.ViewGroup r9 = r0.f
            if (r8 != r9) goto L70
            return r0
        L70:
            int r8 = r0.c
            int r9 = r0.d
            if (r8 == r9) goto L7c
            if (r8 != 0) goto L79
            goto L97
        L79:
            if (r9 != 0) goto L9a
            goto L8c
        L7c:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L81
            goto L97
        L81:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L9a
            goto L8c
        L86:
            if (r8 != 0) goto L91
            int r8 = r0.d
            if (r8 != 0) goto L91
        L8c:
            r0.b = r2
        L8e:
            r0.a = r2
            goto L9a
        L91:
            if (r9 != 0) goto L9a
            int r8 = r0.c
            if (r8 != 0) goto L9a
        L97:
            r0.b = r1
            goto L8e
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.h0.b(androidx.transition.r, androidx.transition.r):androidx.transition.h0$c");
    }

    private void d(r rVar) {
        rVar.a.put("android:visibility:visibility", Integer.valueOf(rVar.b.getVisibility()));
        rVar.a.put("android:visibility:parent", rVar.b.getParent());
        int[] iArr = new int[2];
        rVar.b.getLocationOnScreen(iArr);
        rVar.a.put("android:visibility:screenLocation", iArr);
    }

    public abstract Animator a(ViewGroup viewGroup, View view, r rVar, r rVar2);

    public Animator a(ViewGroup viewGroup, r rVar, int i, r rVar2, int i2) {
        if ((this.K & 1) != 1 || rVar2 == null) {
            return null;
        }
        if (rVar == null) {
            View view = (View) rVar2.b.getParent();
            if (b(a(view, false), b(view, false)).a) {
                return null;
            }
        }
        return a(viewGroup, rVar2.b, rVar, rVar2);
    }

    @Override // androidx.transition.l
    public Animator a(ViewGroup viewGroup, r rVar, r rVar2) {
        c b2 = b(rVar, rVar2);
        if (!b2.a) {
            return null;
        }
        if (b2.e == null && b2.f == null) {
            return null;
        }
        return b2.b ? a(viewGroup, rVar, b2.c, rVar2, b2.d) : b(viewGroup, rVar, b2.c, rVar2, b2.d);
    }

    public void a(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.K = i;
    }

    @Override // androidx.transition.l
    public void a(r rVar) {
        d(rVar);
    }

    @Override // androidx.transition.l
    public boolean a(r rVar, r rVar2) {
        if (rVar == null && rVar2 == null) {
            return false;
        }
        if (rVar != null && rVar2 != null && rVar2.a.containsKey("android:visibility:visibility") != rVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c b2 = b(rVar, rVar2);
        if (b2.a) {
            return b2.c == 0 || b2.d == 0;
        }
        return false;
    }

    public abstract Animator b(ViewGroup viewGroup, View view, r rVar, r rVar2);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator b(android.view.ViewGroup r7, androidx.transition.r r8, int r9, androidx.transition.r r10, int r11) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.h0.b(android.view.ViewGroup, androidx.transition.r, int, androidx.transition.r, int):android.animation.Animator");
    }

    @Override // androidx.transition.l
    public void c(r rVar) {
        d(rVar);
    }

    @Override // androidx.transition.l
    public String[] q() {
        return L;
    }
}
