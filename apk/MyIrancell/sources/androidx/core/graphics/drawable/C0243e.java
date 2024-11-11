package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.C0242d;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.drawable.e */
/* loaded from: classes.dex */
public class C0243e extends C0242d {

    /* renamed from: i */
    private static Method f1482i;

    /* renamed from: androidx.core.graphics.drawable.e$a */
    /* loaded from: classes.dex */
    private static class a extends C0242d.a {
        a(C0242d.a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // androidx.core.graphics.drawable.C0242d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0243e(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0243e(Drawable drawable) {
        super(drawable);
        m1503d();
    }

    C0243e(C0242d.a aVar, Resources resources) {
        super(aVar, resources);
        m1503d();
    }

    /* renamed from: d */
    private void m1503d() {
        if (f1482i == null) {
            try {
                f1482i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.core.graphics.drawable.C0242d
    /* renamed from: b */
    protected boolean mo1500b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f1477g;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    @Override // androidx.core.graphics.drawable.C0242d
    /* renamed from: c */
    C0242d.a mo1501c() {
        return new a(this.f1475e, null);
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f1477g.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f1477g.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.f1477g.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f1477g.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // androidx.core.graphics.drawable.C0242d, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.C0242d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0240b
    public void setTint(int i) {
        if (mo1500b()) {
            super.setTint(i);
        } else {
            this.f1477g.setTint(i);
        }
    }

    @Override // androidx.core.graphics.drawable.C0242d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0240b
    public void setTintList(ColorStateList colorStateList) {
        if (mo1500b()) {
            super.setTintList(colorStateList);
        } else {
            this.f1477g.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.C0242d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0240b
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo1500b()) {
            super.setTintMode(mode);
        } else {
            this.f1477g.setTintMode(mode);
        }
    }
}
