package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import p000.C3107q2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.transition.z */
/* loaded from: classes.dex */
public class C0410z implements InterfaceC0377b0 {

    /* renamed from: a */
    protected a f2539a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.z$a */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup {

        /* renamed from: b */
        ViewGroup f2540b;

        /* renamed from: c */
        View f2541c;

        /* renamed from: d */
        ArrayList<Drawable> f2542d;

        /* renamed from: e */
        C0410z f2543e;

        static {
            try {
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, C0410z c0410z) {
            super(context);
            this.f2542d = null;
            this.f2540b = viewGroup;
            this.f2541c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f2543e = c0410z;
        }

        /* renamed from: a */
        private void m3066a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f2540b.getLocationOnScreen(iArr2);
            this.f2541c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void m3067a(Drawable drawable) {
            if (this.f2542d == null) {
                this.f2542d = new ArrayList<>();
            }
            if (this.f2542d.contains(drawable)) {
                return;
            }
            this.f2542d.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        /* renamed from: a */
        public void m3068a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f2540b && viewGroup.getParent() != null && C3107q2.m14931w(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f2540b.getLocationOnScreen(iArr2);
                    C3107q2.m14906c(view, iArr[0] - iArr2[0]);
                    C3107q2.m14908d(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        /* renamed from: a */
        boolean m3069a() {
            ArrayList<Drawable> arrayList;
            return getChildCount() == 0 && ((arrayList = this.f2542d) == null || arrayList.size() == 0);
        }

        /* renamed from: b */
        public void m3070b(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f2542d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
            }
        }

        /* renamed from: b */
        public void m3071b(View view) {
            super.removeView(view);
            if (m3069a()) {
                this.f2540b.removeView(this);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            this.f2540b.getLocationOnScreen(new int[2]);
            this.f2541c.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f2541c.getWidth(), this.f2541c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f2542d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f2542d.get(i).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f2540b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (!(this.f2540b instanceof ViewGroup)) {
                invalidate(rect);
                return null;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            m3066a(iArr2);
            rect.offset(iArr2[0], iArr2[1]);
            return super.invalidateChildInParent(iArr, rect);
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f2542d) != null && arrayList.contains(drawable));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0410z(Context context, ViewGroup viewGroup, View view) {
        this.f2539a = new a(context, viewGroup, view, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C0410z m3064c(View view) {
        ViewGroup m3065d = m3065d(view);
        if (m3065d == null) {
            return null;
        }
        int childCount = m3065d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = m3065d.getChildAt(i);
            if (childAt instanceof a) {
                return ((a) childAt).f2543e;
            }
        }
        return new C0404t(m3065d.getContext(), m3065d, view);
    }

    /* renamed from: d */
    static ViewGroup m3065d(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // androidx.transition.InterfaceC0377b0
    /* renamed from: a */
    public void mo2916a(Drawable drawable) {
        this.f2539a.m3067a(drawable);
    }

    @Override // androidx.transition.InterfaceC0377b0
    /* renamed from: b */
    public void mo2917b(Drawable drawable) {
        this.f2539a.m3070b(drawable);
    }
}
