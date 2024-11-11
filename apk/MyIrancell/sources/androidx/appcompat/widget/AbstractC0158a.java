package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import p000.C3107q2;
import p000.C3284u2;
import p000.InterfaceC3328v2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC0158a extends ViewGroup {

    /* renamed from: b */
    protected final a f952b;

    /* renamed from: c */
    protected final Context f953c;

    /* renamed from: d */
    protected ActionMenuView f954d;

    /* renamed from: e */
    protected ActionMenuPresenter f955e;

    /* renamed from: f */
    protected int f956f;

    /* renamed from: g */
    protected C3284u2 f957g;

    /* renamed from: h */
    private boolean f958h;

    /* renamed from: i */
    private boolean f959i;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes.dex */
    protected class a implements InterfaceC3328v2 {

        /* renamed from: a */
        private boolean f960a = false;

        /* renamed from: b */
        int f961b;

        protected a() {
        }

        /* renamed from: a */
        public a m896a(C3284u2 c3284u2, int i) {
            AbstractC0158a.this.f957g = c3284u2;
            this.f961b = i;
            return this;
        }

        @Override // p000.InterfaceC3328v2
        /* renamed from: a */
        public void mo897a(View view) {
            this.f960a = true;
        }

        @Override // p000.InterfaceC3328v2
        /* renamed from: b */
        public void mo448b(View view) {
            if (this.f960a) {
                return;
            }
            AbstractC0158a abstractC0158a = AbstractC0158a.this;
            abstractC0158a.f957g = null;
            AbstractC0158a.super.setVisibility(this.f961b);
        }

        @Override // p000.InterfaceC3328v2
        /* renamed from: c */
        public void mo449c(View view) {
            AbstractC0158a.super.setVisibility(0);
            this.f960a = false;
        }
    }

    AbstractC0158a(Context context) {
        this(context, null);
    }

    AbstractC0158a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0158a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f952b = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R$attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f953c = context;
        } else {
            this.f953c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static int m890a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public int m893a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public int m894a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public C3284u2 m895a(int i, long j) {
        C3284u2 c3284u2 = this.f957g;
        if (c3284u2 != null) {
            c3284u2.m15709a();
        }
        if (i != 0) {
            C3284u2 m14882a = C3107q2.m14882a(this);
            m14882a.m15704a(0.0f);
            m14882a.m15705a(j);
            a aVar = this.f952b;
            aVar.m896a(m14882a, i);
            m14882a.m15707a(aVar);
            return m14882a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C3284u2 m14882a2 = C3107q2.m14882a(this);
        m14882a2.m15704a(1.0f);
        m14882a2.m15705a(j);
        a aVar2 = this.f952b;
        aVar2.m896a(m14882a2, i);
        m14882a2.m15707a(aVar2);
        return m14882a2;
    }

    public int getAnimatedVisibility() {
        return this.f957g != null ? this.f952b.f961b : getVisibility();
    }

    public int getContentHeight() {
        return this.f956f;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.ActionBar, R$attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(R$styleable.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f955e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m772a(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f959i = false;
        }
        if (!this.f959i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f959i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f959i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f958h = false;
        }
        if (!this.f958h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f958h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f958h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C3284u2 c3284u2 = this.f957g;
            if (c3284u2 != null) {
                c3284u2.m15709a();
            }
            super.setVisibility(i);
        }
    }
}
