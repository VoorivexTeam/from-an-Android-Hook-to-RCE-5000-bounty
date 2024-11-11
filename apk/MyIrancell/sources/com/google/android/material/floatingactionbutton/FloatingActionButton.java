package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0175i;
import androidx.appcompat.widget.C0183m;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0239a;
import androidx.core.widget.InterfaceC0259k;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C1997a;
import com.google.android.material.internal.C2004c;
import com.google.android.material.internal.C2010i;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.List;
import p000.C0493bu;
import p000.C3058ot;
import p000.C3107q2;
import p000.InterfaceC2526gu;
import p000.InterfaceC3068p2;
import p000.InterfaceC3541zt;

@CoordinatorLayout.InterfaceC0215d(Behavior.class)
/* loaded from: classes.dex */
public class FloatingActionButton extends C2010i implements InterfaceC3068p2, InterfaceC0259k, InterfaceC3541zt {

    /* renamed from: c */
    private ColorStateList f8403c;

    /* renamed from: d */
    private PorterDuff.Mode f8404d;

    /* renamed from: e */
    private ColorStateList f8405e;

    /* renamed from: f */
    private PorterDuff.Mode f8406f;

    /* renamed from: g */
    private ColorStateList f8407g;

    /* renamed from: h */
    private int f8408h;

    /* renamed from: i */
    private int f8409i;

    /* renamed from: j */
    private int f8410j;

    /* renamed from: k */
    private int f8411k;

    /* renamed from: l */
    boolean f8412l;

    /* renamed from: m */
    final Rect f8413m;

    /* renamed from: n */
    private final Rect f8414n;

    /* renamed from: o */
    private final C0183m f8415o;

    /* renamed from: p */
    private final C0493bu f8416p;

    /* renamed from: q */
    private C1997a f8417q;

    /* loaded from: classes.dex */
    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC0214c<T> {

        /* renamed from: a */
        private Rect f8418a;

        /* renamed from: b */
        private AbstractC1995b f8419b;

        /* renamed from: c */
        private boolean f8420c;

        public BaseBehavior() {
            this.f8420c = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FloatingActionButton_Behavior_Layout);
            this.f8420c = obtainStyledAttributes.getBoolean(R$styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private void m10151a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f8413m;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.C0217f c0217f = (CoordinatorLayout.C0217f) floatingActionButton.getLayoutParams();
            int i = 0;
            int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c0217f).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c0217f).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c0217f).bottomMargin) {
                i = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c0217f).topMargin) {
                i = -rect.top;
            }
            if (i != 0) {
                C3107q2.m14908d(floatingActionButton, i);
            }
            if (i2 != 0) {
                C3107q2.m14906c(floatingActionButton, i2);
            }
        }

        /* renamed from: a */
        private static boolean m10152a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0217f) {
                return ((CoordinatorLayout.C0217f) layoutParams).m1336d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m10153a(View view, FloatingActionButton floatingActionButton) {
            return this.f8420c && ((CoordinatorLayout.C0217f) floatingActionButton.getLayoutParams()).m1335c() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: a */
        private boolean m10154a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m10153a(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f8418a == null) {
                this.f8418a = new Rect();
            }
            Rect rect = this.f8418a;
            C2004c.m10256a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m10143a(this.f8419b, false);
                return true;
            }
            floatingActionButton.m10147b(this.f8419b, false);
            return true;
        }

        /* renamed from: b */
        private boolean m10155b(View view, FloatingActionButton floatingActionButton) {
            if (!m10153a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0217f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m10143a(this.f8419b, false);
                return true;
            }
            floatingActionButton.m10147b(this.f8419b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
        /* renamed from: a */
        public void mo1294a(CoordinatorLayout.C0217f c0217f) {
            if (c0217f.f1354h == 0) {
                c0217f.f1354h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo1304a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> m1282b = coordinatorLayout.m1282b(floatingActionButton);
            int size = m1282b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = m1282b.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m10152a(view) && m10155b(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m10154a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m1289c(floatingActionButton, i);
            m10151a(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo1306a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f8413m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo1314b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m10154a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!m10152a(view)) {
                return false;
            }
            m10155b(view, floatingActionButton);
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    /* loaded from: classes.dex */
    public class C1994a implements C1997a.g {

        /* renamed from: a */
        final /* synthetic */ AbstractC1995b f8421a;

        C1994a(AbstractC1995b abstractC1995b) {
            this.f8421a = abstractC1995b;
        }

        @Override // com.google.android.material.floatingactionbutton.C1997a.g
        /* renamed from: a */
        public void mo10159a() {
            this.f8421a.m10162b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.C1997a.g
        /* renamed from: b */
        public void mo10160b() {
            this.f8421a.m10161a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1995b {
        /* renamed from: a */
        public abstract void m10161a(FloatingActionButton floatingActionButton);

        /* renamed from: b */
        public abstract void m10162b(FloatingActionButton floatingActionButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    /* loaded from: classes.dex */
    public class C1996c implements InterfaceC2526gu {
        C1996c() {
        }

        @Override // p000.InterfaceC2526gu
        /* renamed from: a */
        public void mo10163a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f8413m.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f8410j, i2 + FloatingActionButton.this.f8410j, i3 + FloatingActionButton.this.f8410j, i4 + FloatingActionButton.this.f8410j);
        }

        @Override // p000.InterfaceC2526gu
        /* renamed from: a */
        public void mo10164a(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        @Override // p000.InterfaceC2526gu
        /* renamed from: a */
        public boolean mo10165a() {
            return FloatingActionButton.this.f8412l;
        }

        @Override // p000.InterfaceC2526gu
        /* renamed from: b */
        public float mo10166b() {
            return FloatingActionButton.this.getSizeDimension() / 2.0f;
        }
    }

    /* renamed from: a */
    private int m10134a(int i) {
        int i2 = this.f8409i;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return resources.getDimensionPixelSize(i != 1 ? R$dimen.design_fab_size_normal : R$dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m10134a(1) : m10134a(0);
    }

    /* renamed from: a */
    private static int m10135a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private C1997a.g m10137a(AbstractC1995b abstractC1995b) {
        if (abstractC1995b == null) {
            return null;
        }
        return new C1994a(abstractC1995b);
    }

    /* renamed from: c */
    private C1997a m10139c() {
        return Build.VERSION.SDK_INT >= 21 ? new C1998b(this, new C1996c()) : new C1997a(this, new C1996c());
    }

    /* renamed from: c */
    private void m10140c(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f8413m;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: d */
    private void m10141d() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f8405e;
        if (colorStateList == null) {
            C0239a.m1487b(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f8406f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C0175i.m1016a(colorForState, mode));
    }

    private C1997a getImpl() {
        if (this.f8417q == null) {
            this.f8417q = m10139c();
        }
        return this.f8417q;
    }

    /* renamed from: a */
    public void m10142a(Animator.AnimatorListener animatorListener) {
        getImpl().m10178a(animatorListener);
    }

    /* renamed from: a */
    void m10143a(AbstractC1995b abstractC1995b, boolean z) {
        getImpl().m10182a(m10137a(abstractC1995b), z);
    }

    @Override // p000.InterfaceC0436au
    /* renamed from: a */
    public boolean mo3192a() {
        this.f8416p.m3444b();
        throw null;
    }

    @Deprecated
    /* renamed from: a */
    public boolean m10144a(Rect rect) {
        if (!C3107q2.m14932x(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m10140c(rect);
        return true;
    }

    /* renamed from: b */
    public void m10145b(Animator.AnimatorListener animatorListener) {
        getImpl().m10187b(animatorListener);
    }

    /* renamed from: b */
    public void m10146b(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m10140c(rect);
    }

    /* renamed from: b */
    void m10147b(AbstractC1995b abstractC1995b, boolean z) {
        getImpl().m10190b(m10137a(abstractC1995b), z);
    }

    /* renamed from: b */
    public boolean m10148b() {
        return getImpl().m10201h();
    }

    /* renamed from: c */
    public void m10149c(Animator.AnimatorListener animatorListener) {
        getImpl().m10194c(animatorListener);
    }

    /* renamed from: d */
    public void m10150d(Animator.AnimatorListener animatorListener) {
        getImpl().m10197d(animatorListener);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo10184a(getDrawableState());
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f8403c;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f8404d;
    }

    public float getCompatElevation() {
        return getImpl().mo10185b();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m10195d();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().m10198e();
    }

    public Drawable getContentBackground() {
        return getImpl().m10175a();
    }

    public int getCustomSize() {
        return this.f8409i;
    }

    public int getExpandedComponentIdHint() {
        this.f8416p.m3441a();
        throw null;
    }

    public C3058ot getHideMotionSpec() {
        return getImpl().m10192c();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f8407g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f8407g;
    }

    public C3058ot getShowMotionSpec() {
        return getImpl().m10199f();
    }

    public int getSize() {
        return this.f8408h;
    }

    int getSizeDimension() {
        return m10134a(this.f8408h);
    }

    @Override // p000.InterfaceC3068p2
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // p000.InterfaceC3068p2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.InterfaceC0259k
    public ColorStateList getSupportImageTintList() {
        return this.f8405e;
    }

    @Override // androidx.core.widget.InterfaceC0259k
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f8406f;
    }

    public boolean getUseCompatPadding() {
        return this.f8412l;
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo10202i();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m10203j();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().m10205l();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f8410j = (sizeDimension - this.f8411k) / 2;
        getImpl().m10209p();
        int min = Math.min(m10135a(sizeDimension, i), m10135a(sizeDimension, i2));
        Rect rect = this.f8413m;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.m1612a());
        this.f8416p.m3443a(extendableSavedState.f8578d.get("expandableWidgetHelper"));
        throw null;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        new ExtendableSavedState(super.onSaveInstanceState());
        this.f8416p.m3445c();
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && m10144a(this.f8414n) && !this.f8414n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f8403c != colorStateList) {
            this.f8403c = colorStateList;
            getImpl().m10179a(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f8404d != mode) {
            this.f8404d = mode;
            getImpl().m10180a(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().m10176a(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().m10186b(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().m10196d(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        this.f8409i = i;
    }

    public void setExpandedComponentIdHint(int i) {
        this.f8416p.m3442a(i);
        throw null;
    }

    public void setHideMotionSpec(C3058ot c3058ot) {
        getImpl().m10183a(c3058ot);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C3058ot.m14651a(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        getImpl().m10208o();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f8415o.m1072a(i);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f8407g != colorStateList) {
            this.f8407g = colorStateList;
            getImpl().mo10188b(this.f8407g);
        }
    }

    public void setShowMotionSpec(C3058ot c3058ot) {
        getImpl().m10191b(c3058ot);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C3058ot.m14651a(getContext(), i));
    }

    public void setSize(int i) {
        this.f8409i = 0;
        if (i != this.f8408h) {
            this.f8408h = i;
            requestLayout();
        }
    }

    @Override // p000.InterfaceC3068p2
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // p000.InterfaceC3068p2
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.InterfaceC0259k
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f8405e != colorStateList) {
            this.f8405e = colorStateList;
            m10141d();
        }
    }

    @Override // androidx.core.widget.InterfaceC0259k
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f8406f != mode) {
            this.f8406f = mode;
            m10141d();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f8412l != z) {
            this.f8412l = z;
            getImpl().mo10204k();
        }
    }
}
