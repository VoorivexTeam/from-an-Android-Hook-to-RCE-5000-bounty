package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$styleable;
import p000.AbstractC2532h;

/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes.dex */
public abstract class AbstractC0081a {

    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f412a;

        public a(int i, int i2) {
            super(i, i2);
            this.f412a = 0;
            this.f412a = 8388627;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f412a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionBarLayout);
            this.f412a = obtainStyledAttributes.getInt(R$styleable.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f412a = 0;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f412a = 0;
            this.f412a = aVar.f412a;
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void m481a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        /* renamed from: a */
        public abstract CharSequence m482a();

        /* renamed from: b */
        public abstract View m483b();

        /* renamed from: c */
        public abstract Drawable m484c();

        /* renamed from: d */
        public abstract CharSequence m485d();

        /* renamed from: e */
        public abstract void m486e();
    }

    /* renamed from: a */
    public abstract AbstractC2532h mo463a(AbstractC2532h.a aVar);

    /* renamed from: a */
    public abstract void mo464a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo465a(CharSequence charSequence);

    /* renamed from: a */
    public abstract boolean mo466a(int i, KeyEvent keyEvent);

    /* renamed from: a */
    public boolean m467a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo468b(CharSequence charSequence);

    /* renamed from: b */
    public abstract void mo469b(boolean z);

    /* renamed from: c */
    public abstract void mo470c(boolean z);

    /* renamed from: d */
    public abstract void mo471d(boolean z);

    /* renamed from: e */
    public abstract void mo472e(boolean z);

    /* renamed from: e */
    public boolean m473e() {
        return false;
    }

    /* renamed from: f */
    public abstract boolean mo474f();

    /* renamed from: g */
    public abstract int mo475g();

    /* renamed from: h */
    public abstract Context mo476h();

    /* renamed from: i */
    public abstract void mo477i();

    /* renamed from: j */
    public boolean m478j() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m479k() {
    }

    /* renamed from: l */
    public boolean m480l() {
        return false;
    }
}
