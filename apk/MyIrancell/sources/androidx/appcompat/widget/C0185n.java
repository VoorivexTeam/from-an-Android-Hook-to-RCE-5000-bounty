package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.InterfaceC0259k;
import p000.InterfaceC3068p2;

/* renamed from: androidx.appcompat.widget.n */
/* loaded from: classes.dex */
public class C0185n extends ImageView implements InterfaceC3068p2, InterfaceC0259k {

    /* renamed from: b */
    private final C0165d f1147b;

    /* renamed from: c */
    private final C0183m f1148c;

    public C0185n(Context context) {
        this(context, null);
    }

    public C0185n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0185n(Context context, AttributeSet attributeSet, int i) {
        super(C0192q0.m1129b(context), attributeSet, i);
        C0165d c0165d = new C0165d(this);
        this.f1147b = c0165d;
        c0165d.m947a(attributeSet, i);
        C0183m c0183m = new C0183m(this);
        this.f1148c = c0183m;
        c0183m.m1075a(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0165d c0165d = this.f1147b;
        if (c0165d != null) {
            c0165d.m942a();
        }
        C0183m c0183m = this.f1148c;
        if (c0183m != null) {
            c0183m.m1071a();
        }
    }

    @Override // p000.InterfaceC3068p2
    public ColorStateList getSupportBackgroundTintList() {
        C0165d c0165d = this.f1147b;
        if (c0165d != null) {
            return c0165d.m948b();
        }
        return null;
    }

    @Override // p000.InterfaceC3068p2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0165d c0165d = this.f1147b;
        if (c0165d != null) {
            return c0165d.m950c();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0259k
    public ColorStateList getSupportImageTintList() {
        C0183m c0183m = this.f1148c;
        if (c0183m != null) {
            return c0183m.m1076b();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0259k
    public PorterDuff.Mode getSupportImageTintMode() {
        C0183m c0183m = this.f1148c;
        if (c0183m != null) {
            return c0183m.m1077c();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1148c.m1078d() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0165d c0165d = this.f1147b;
        if (c0165d != null) {
            c0165d.m946a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0165d c0165d = this.f1147b;
        if (c0165d != null) {
            c0165d.m943a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0183m c0183m = this.f1148c;
        if (c0183m != null) {
            c0183m.m1071a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0183m c0183m = this.f1148c;
        if (c0183m != null) {
            c0183m.m1071a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0183m c0183m = this.f1148c;
        if (c0183m != null) {
            c0183m.m1072a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0183m c0183m = this.f1148c;
        if (c0183m != null) {
            c0183m.m1071a();
        }
    }

    @Override // p000.InterfaceC3068p2
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0165d c0165d = this.f1147b;
        if (c0165d != null) {
            c0165d.m949b(colorStateList);
        }
    }

    @Override // p000.InterfaceC3068p2
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0165d c0165d = this.f1147b;
        if (c0165d != null) {
            c0165d.m945a(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0259k
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0183m c0183m = this.f1148c;
        if (c0183m != null) {
            c0183m.m1073a(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC0259k
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0183m c0183m = this.f1148c;
        if (c0183m != null) {
            c0183m.m1074a(mode);
        }
    }
}
