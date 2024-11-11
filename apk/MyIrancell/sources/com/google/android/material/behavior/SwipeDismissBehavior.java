package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000.C2798j3;
import p000.C3107q2;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0214c<V> {

    /* renamed from: a */
    C2798j3 f8334a;

    /* renamed from: b */
    InterfaceC1981b f8335b;

    /* renamed from: c */
    private boolean f8336c;

    /* renamed from: e */
    private boolean f8338e;

    /* renamed from: d */
    private float f8337d = 0.0f;

    /* renamed from: f */
    int f8339f = 2;

    /* renamed from: g */
    float f8340g = 0.5f;

    /* renamed from: h */
    float f8341h = 0.0f;

    /* renamed from: i */
    float f8342i = 0.5f;

    /* renamed from: j */
    private final C2798j3.c f8343j = new C1980a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    /* loaded from: classes.dex */
    class C1980a extends C2798j3.c {

        /* renamed from: a */
        private int f8344a;

        /* renamed from: b */
        private int f8345b = -1;

        C1980a() {
        }

        /* renamed from: a */
        private boolean m10069a(View view, float f) {
            if (f == 0.0f) {
                return Math.abs(view.getLeft() - this.f8344a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f8340g);
            }
            boolean z = C3107q2.m14919k(view) == 1;
            int i = SwipeDismissBehavior.this.f8339f;
            if (i == 2) {
                return true;
            }
            if (i == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (f <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i != 1) {
                return false;
            }
            if (z) {
                if (f <= 0.0f) {
                    return false;
                }
            } else if (f >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // p000.C2798j3.c
        /* renamed from: a */
        public int mo10070a(View view) {
            return view.getWidth();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        
            r5 = r2.f8344a;
            r3 = r3.getWidth() + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        
            if (r5 != false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
        
            if (r5 != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
        
            r5 = r2.f8344a - r3.getWidth();
            r3 = r2.f8344a;
         */
        @Override // p000.C2798j3.c
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int mo10071a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = p000.C3107q2.m14919k(r3)
                r0 = 1
                if (r5 != r0) goto L9
                r5 = 1
                goto La
            L9:
                r5 = 0
            La:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f8339f
                if (r1 != 0) goto L24
                if (r5 == 0) goto L1c
            L12:
                int r5 = r2.f8344a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f8344a
                goto L37
            L1c:
                int r5 = r2.f8344a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L37
            L24:
                if (r1 != r0) goto L29
                if (r5 == 0) goto L12
                goto L1c
            L29:
                int r5 = r2.f8344a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f8344a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L37:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.m10062a(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C1980a.mo10071a(android.view.View, int, int):int");
        }

        @Override // p000.C2798j3.c
        /* renamed from: a */
        public void mo10072a(View view, float f, float f2) {
            int i;
            boolean z;
            InterfaceC1981b interfaceC1981b;
            this.f8345b = -1;
            int width = view.getWidth();
            if (m10069a(view, f)) {
                int left = view.getLeft();
                int i2 = this.f8344a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f8344a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f8334a.m13389c(i, view.getTop())) {
                C3107q2.m14892a(view, new RunnableC1982c(view, z));
            } else {
                if (!z || (interfaceC1981b = SwipeDismissBehavior.this.f8335b) == null) {
                    return;
                }
                interfaceC1981b.m10079a(view);
            }
        }

        @Override // p000.C2798j3.c
        /* renamed from: a */
        public void mo10073a(View view, int i) {
            this.f8345b = i;
            this.f8344a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // p000.C2798j3.c
        /* renamed from: a */
        public void mo10074a(View view, int i, int i2, int i3, int i4) {
            float width = this.f8344a + (view.getWidth() * SwipeDismissBehavior.this.f8341h);
            float width2 = this.f8344a + (view.getWidth() * SwipeDismissBehavior.this.f8342i);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m10061a(0.0f, 1.0f - SwipeDismissBehavior.m10064b(width, width2, f), 1.0f));
            }
        }

        @Override // p000.C2798j3.c
        /* renamed from: b */
        public int mo10075b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p000.C2798j3.c
        /* renamed from: b */
        public boolean mo10076b(View view, int i) {
            return this.f8345b == -1 && SwipeDismissBehavior.this.mo10067a(view);
        }

        @Override // p000.C2798j3.c
        /* renamed from: c */
        public void mo10077c(int i) {
            InterfaceC1981b interfaceC1981b = SwipeDismissBehavior.this.f8335b;
            if (interfaceC1981b != null) {
                interfaceC1981b.m10078a(i);
            }
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1981b {
        /* renamed from: a */
        void m10078a(int i);

        /* renamed from: a */
        void m10079a(View view);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    /* loaded from: classes.dex */
    private class RunnableC1982c implements Runnable {

        /* renamed from: b */
        private final View f8347b;

        /* renamed from: c */
        private final boolean f8348c;

        RunnableC1982c(View view, boolean z) {
            this.f8347b = view;
            this.f8348c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC1981b interfaceC1981b;
            C2798j3 c2798j3 = SwipeDismissBehavior.this.f8334a;
            if (c2798j3 != null && c2798j3.m13382a(true)) {
                C3107q2.m14892a(this.f8347b, this);
            } else {
                if (!this.f8348c || (interfaceC1981b = SwipeDismissBehavior.this.f8335b) == null) {
                    return;
                }
                interfaceC1981b.m10079a(this.f8347b);
            }
        }
    }

    /* renamed from: a */
    static float m10061a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: a */
    static int m10062a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: a */
    private void m10063a(ViewGroup viewGroup) {
        if (this.f8334a == null) {
            this.f8334a = this.f8338e ? C2798j3.m13359a(viewGroup, this.f8337d, this.f8343j) : C2798j3.m13360a(viewGroup, this.f8343j);
        }
    }

    /* renamed from: b */
    static float m10064b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: a */
    public void m10065a(float f) {
        this.f8342i = m10061a(0.0f, f, 1.0f);
    }

    /* renamed from: a */
    public void m10066a(int i) {
        this.f8339f = i;
    }

    /* renamed from: a */
    public boolean mo10067a(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: a */
    public boolean mo1308a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f8336c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.m1281a(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f8336c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f8336c = false;
        }
        if (!z) {
            return false;
        }
        m10063a((ViewGroup) coordinatorLayout);
        return this.f8334a.m13386b(motionEvent);
    }

    /* renamed from: b */
    public void m10068b(float f) {
        this.f8341h = m10061a(0.0f, f, 1.0f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: b */
    public boolean mo1313b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C2798j3 c2798j3 = this.f8334a;
        if (c2798j3 == null) {
            return false;
        }
        c2798j3.m13378a(motionEvent);
        return true;
    }
}
