package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.C0099h;
import androidx.appcompat.view.menu.InterfaceC0107p;
import androidx.appcompat.widget.AbstractViewOnTouchListenerC0168e0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0202v0;
import androidx.appcompat.widget.C0205x;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0205x implements InterfaceC0107p.a, View.OnClickListener, ActionMenuView.InterfaceC0127a {

    /* renamed from: e */
    C0101j f479e;

    /* renamed from: f */
    private CharSequence f480f;

    /* renamed from: g */
    private Drawable f481g;

    /* renamed from: h */
    C0099h.b f482h;

    /* renamed from: i */
    private AbstractViewOnTouchListenerC0168e0 f483i;

    /* renamed from: j */
    AbstractC0091b f484j;

    /* renamed from: k */
    private boolean f485k;

    /* renamed from: l */
    private boolean f486l;

    /* renamed from: m */
    private int f487m;

    /* renamed from: n */
    private int f488n;

    /* renamed from: o */
    private int f489o;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    /* loaded from: classes.dex */
    private class C0090a extends AbstractViewOnTouchListenerC0168e0 {
        public C0090a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0168e0
        /* renamed from: a */
        public InterfaceC0110s mo562a() {
            AbstractC0091b abstractC0091b = ActionMenuItemView.this.f484j;
            if (abstractC0091b != null) {
                return abstractC0091b.mo564a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0168e0
        /* renamed from: b */
        protected boolean mo563b() {
            InterfaceC0110s mo562a;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0099h.b bVar = actionMenuItemView.f482h;
            return bVar != null && bVar.mo566a(actionMenuItemView.f479e) && (mo562a = mo562a()) != null && mo562a.mo615d();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0091b {
        /* renamed from: a */
        public abstract InterfaceC0110s mo564a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f485k = m555e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionMenuItemView, i, 0);
        this.f487m = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f489o = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f488n = -1;
        setSaveEnabled(false);
    }

    /* renamed from: e */
    private boolean m555e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: f */
    private void m556f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f480f);
        if (this.f481g != null && (!this.f479e.m706n() || (!this.f485k && !this.f486l))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f480f : null);
        CharSequence contentDescription = this.f479e.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f479e.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f479e.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            C0202v0.m1176a(this, z3 ? null : this.f479e.getTitle());
        } else {
            C0202v0.m1176a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0107p.a
    /* renamed from: a */
    public void mo557a(C0101j c0101j, int i) {
        this.f479e = c0101j;
        setIcon(c0101j.getIcon());
        setTitle(c0101j.m686a(this));
        setId(c0101j.getItemId());
        setVisibility(c0101j.isVisible() ? 0 : 8);
        setEnabled(c0101j.isEnabled());
        if (c0101j.hasSubMenu() && this.f483i == null) {
            this.f483i = new C0090a();
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0127a
    /* renamed from: a */
    public boolean mo558a() {
        return m561d();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0107p.a
    /* renamed from: b */
    public boolean mo559b() {
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0127a
    /* renamed from: c */
    public boolean mo560c() {
        return m561d() && this.f479e.getIcon() == null;
    }

    /* renamed from: d */
    public boolean m561d() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0107p.a
    public C0101j getItemData() {
        return this.f479e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0099h.b bVar = this.f482h;
        if (bVar != null) {
            bVar.mo566a(this.f479e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f485k = m555e();
        m556f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0205x, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean m561d = m561d();
        if (m561d && (i3 = this.f488n) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f487m) : this.f487m;
        if (mode != 1073741824 && this.f487m > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (m561d || this.f481g == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f481g.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0168e0 abstractViewOnTouchListenerC0168e0;
        if (this.f479e.hasSubMenu() && (abstractViewOnTouchListenerC0168e0 = this.f483i) != null && abstractViewOnTouchListenerC0168e0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f486l != z) {
            this.f486l = z;
            C0101j c0101j = this.f479e;
            if (c0101j != null) {
                c0101j.m690b();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f481g = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f489o;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            int i2 = this.f489o;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m556f();
    }

    public void setItemInvoker(C0099h.b bVar) {
        this.f482h = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f488n = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0091b abstractC0091b) {
        this.f484j = abstractC0091b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f480f = charSequence;
        m556f();
    }
}
