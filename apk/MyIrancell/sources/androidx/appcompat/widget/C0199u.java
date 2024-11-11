package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R$styleable;
import androidx.core.graphics.drawable.C0239a;
import p000.C3107q2;

/* renamed from: androidx.appcompat.widget.u */
/* loaded from: classes.dex */
class C0199u extends C0191q {

    /* renamed from: d */
    private final SeekBar f1220d;

    /* renamed from: e */
    private Drawable f1221e;

    /* renamed from: f */
    private ColorStateList f1222f;

    /* renamed from: g */
    private PorterDuff.Mode f1223g;

    /* renamed from: h */
    private boolean f1224h;

    /* renamed from: i */
    private boolean f1225i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0199u(SeekBar seekBar) {
        super(seekBar);
        this.f1222f = null;
        this.f1223g = null;
        this.f1224h = false;
        this.f1225i = false;
        this.f1220d = seekBar;
    }

    /* renamed from: d */
    private void m1153d() {
        if (this.f1221e != null) {
            if (this.f1224h || this.f1225i) {
                Drawable m1495i = C0239a.m1495i(this.f1221e.mutate());
                this.f1221e = m1495i;
                if (this.f1224h) {
                    C0239a.m1480a(m1495i, this.f1222f);
                }
                if (this.f1225i) {
                    C0239a.m1483a(this.f1221e, this.f1223g);
                }
                if (this.f1221e.isStateful()) {
                    this.f1221e.setState(this.f1220d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1154a(Canvas canvas) {
        if (this.f1221e != null) {
            int max = this.f1220d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1221e.getIntrinsicWidth();
                int intrinsicHeight = this.f1221e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1221e.setBounds(-i, -i2, i, i2);
                float width = ((this.f1220d.getWidth() - this.f1220d.getPaddingLeft()) - this.f1220d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1220d.getPaddingLeft(), this.f1220d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1221e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: a */
    void m1155a(Drawable drawable) {
        Drawable drawable2 = this.f1221e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1221e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1220d);
            C0239a.m1486a(drawable, C3107q2.m14919k(this.f1220d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1220d.getDrawableState());
            }
            m1153d();
        }
        this.f1220d.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.C0191q
    /* renamed from: a */
    public void mo1127a(AttributeSet attributeSet, int i) {
        super.mo1127a(attributeSet, i);
        C0198t0 m1133a = C0198t0.m1133a(this.f1220d.getContext(), attributeSet, R$styleable.AppCompatSeekBar, i, 0);
        Drawable m1144c = m1133a.m1144c(R$styleable.AppCompatSeekBar_android_thumb);
        if (m1144c != null) {
            this.f1220d.setThumb(m1144c);
        }
        m1155a(m1133a.m1142b(R$styleable.AppCompatSeekBar_tickMark));
        if (m1133a.m1152g(R$styleable.AppCompatSeekBar_tickMarkTintMode)) {
            this.f1223g = C0162b0.m921a(m1133a.m1145d(R$styleable.AppCompatSeekBar_tickMarkTintMode, -1), this.f1223g);
            this.f1225i = true;
        }
        if (m1133a.m1152g(R$styleable.AppCompatSeekBar_tickMarkTint)) {
            this.f1222f = m1133a.m1136a(R$styleable.AppCompatSeekBar_tickMarkTint);
            this.f1224h = true;
        }
        m1133a.m1138a();
        m1153d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1156b() {
        Drawable drawable = this.f1221e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1220d.getDrawableState())) {
            this.f1220d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m1157c() {
        Drawable drawable = this.f1221e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
