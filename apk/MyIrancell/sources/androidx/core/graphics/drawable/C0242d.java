package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.core.graphics.drawable.d */
/* loaded from: classes.dex */
class C0242d extends Drawable implements Drawable.Callback, InterfaceC0241c, InterfaceC0240b {

    /* renamed from: h */
    static final PorterDuff.Mode f1471h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private int f1472b;

    /* renamed from: c */
    private PorterDuff.Mode f1473c;

    /* renamed from: d */
    private boolean f1474d;

    /* renamed from: e */
    a f1475e;

    /* renamed from: f */
    private boolean f1476f;

    /* renamed from: g */
    Drawable f1477g;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.core.graphics.drawable.d$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Drawable.ConstantState {

        /* renamed from: a */
        int f1478a;

        /* renamed from: b */
        Drawable.ConstantState f1479b;

        /* renamed from: c */
        ColorStateList f1480c;

        /* renamed from: d */
        PorterDuff.Mode f1481d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(a aVar, Resources resources) {
            this.f1480c = null;
            this.f1481d = C0242d.f1471h;
            if (aVar != null) {
                this.f1478a = aVar.f1478a;
                this.f1479b = aVar.f1479b;
                this.f1480c = aVar.f1480c;
                this.f1481d = aVar.f1481d;
            }
        }

        /* renamed from: a */
        boolean m1502a() {
            return this.f1479b != null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i = this.f1478a;
            Drawable.ConstantState constantState = this.f1479b;
            return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return newDrawable(null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public abstract Drawable newDrawable(Resources resources);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.graphics.drawable.d$b */
    /* loaded from: classes.dex */
    public static class b extends a {
        b(a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // androidx.core.graphics.drawable.C0242d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0242d(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0242d(Drawable drawable) {
        this.f1475e = mo1501c();
        mo1497a(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0242d(a aVar, Resources resources) {
        this.f1475e = aVar;
        m1498a(resources);
    }

    /* renamed from: a */
    private void m1498a(Resources resources) {
        Drawable.ConstantState constantState;
        a aVar = this.f1475e;
        if (aVar == null || (constantState = aVar.f1479b) == null) {
            return;
        }
        mo1497a(constantState.newDrawable(resources));
    }

    /* renamed from: a */
    private boolean m1499a(int[] iArr) {
        if (!mo1500b()) {
            return false;
        }
        a aVar = this.f1475e;
        ColorStateList colorStateList = aVar.f1480c;
        PorterDuff.Mode mode = aVar.f1481d;
        if (colorStateList == null || mode == null) {
            this.f1474d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f1474d || colorForState != this.f1472b || mode != this.f1473c) {
                setColorFilter(colorForState, mode);
                this.f1472b = colorForState;
                this.f1473c = mode;
                this.f1474d = true;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.InterfaceC0241c
    /* renamed from: a */
    public final Drawable mo1496a() {
        return this.f1477g;
    }

    @Override // androidx.core.graphics.drawable.InterfaceC0241c
    /* renamed from: a */
    public final void mo1497a(Drawable drawable) {
        Drawable drawable2 = this.f1477g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1477g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            a aVar = this.f1475e;
            if (aVar != null) {
                aVar.f1479b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: b */
    protected boolean mo1500b() {
        return true;
    }

    /* renamed from: c */
    a mo1501c() {
        return new b(this.f1475e, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f1477g.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        a aVar = this.f1475e;
        return changingConfigurations | (aVar != null ? aVar.getChangingConfigurations() : 0) | this.f1477g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        a aVar = this.f1475e;
        if (aVar == null || !aVar.m1502a()) {
            return null;
        }
        this.f1475e.f1478a = getChangingConfigurations();
        return this.f1475e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f1477g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f1477g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f1477g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f1477g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f1477g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f1477g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f1477g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f1477g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f1477g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f1477g.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        a aVar;
        ColorStateList colorStateList = (!mo1500b() || (aVar = this.f1475e) == null) ? null : aVar.f1480c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f1477g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f1477g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f1476f && super.mutate() == this) {
            this.f1475e = mo1501c();
            Drawable drawable = this.f1477g;
            if (drawable != null) {
                drawable.mutate();
            }
            a aVar = this.f1475e;
            if (aVar != null) {
                Drawable drawable2 = this.f1477g;
                aVar.f1479b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f1476f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1477g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.f1477g.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f1477g.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.f1477g.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f1477g.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1477g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f1477g.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f1477g.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m1499a(iArr) || this.f1477g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0240b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0240b
    public void setTintList(ColorStateList colorStateList) {
        this.f1475e.f1480c = colorStateList;
        m1499a(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0240b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1475e.f1481d = mode;
        m1499a(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1477g.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
