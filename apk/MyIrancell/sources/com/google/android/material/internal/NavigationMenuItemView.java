package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.R$attr;
import androidx.appcompat.view.menu.C0101j;
import androidx.appcompat.view.menu.InterfaceC0107p;
import androidx.appcompat.widget.C0170f0;
import androidx.appcompat.widget.C0202v0;
import androidx.core.graphics.drawable.C0239a;
import androidx.core.widget.C0257i;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import p000.C0448b3;
import p000.C3066p0;
import p000.C3107q2;
import p000.C3508z1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends C2006e implements InterfaceC0107p.a {

    /* renamed from: G */
    private static final int[] f8478G = {R.attr.state_checked};

    /* renamed from: A */
    private FrameLayout f8479A;

    /* renamed from: B */
    private C0101j f8480B;

    /* renamed from: C */
    private ColorStateList f8481C;

    /* renamed from: D */
    private boolean f8482D;

    /* renamed from: E */
    private Drawable f8483E;

    /* renamed from: F */
    private final C3508z1 f8484F;

    /* renamed from: w */
    private final int f8485w;

    /* renamed from: x */
    private boolean f8486x;

    /* renamed from: y */
    boolean f8487y;

    /* renamed from: z */
    private final CheckedTextView f8488z;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    /* loaded from: classes.dex */
    class C2000a extends C3508z1 {
        C2000a() {
        }

        @Override // p000.C3508z1
        /* renamed from: a */
        public void mo1538a(View view, C0448b3 c0448b3) {
            super.mo1538a(view, c0448b3);
            c0448b3.m3283a(NavigationMenuItemView.this.f8487y);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8484F = new C2000a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(R$layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.f8485w = context.getResources().getDimensionPixelSize(R$dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R$id.design_menu_item_text);
        this.f8488z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C3107q2.m14897a(this.f8488z, this.f8484F);
    }

    /* renamed from: d */
    private void m10211d() {
        C0170f0.a aVar;
        int i;
        if (m10213f()) {
            this.f8488z.setVisibility(8);
            FrameLayout frameLayout = this.f8479A;
            if (frameLayout == null) {
                return;
            }
            aVar = (C0170f0.a) frameLayout.getLayoutParams();
            i = -1;
        } else {
            this.f8488z.setVisibility(0);
            FrameLayout frameLayout2 = this.f8479A;
            if (frameLayout2 == null) {
                return;
            }
            aVar = (C0170f0.a) frameLayout2.getLayoutParams();
            i = -2;
        }
        ((ViewGroup.MarginLayoutParams) aVar).width = i;
        this.f8479A.setLayoutParams(aVar);
    }

    /* renamed from: e */
    private StateListDrawable m10212e() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R$attr.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f8478G, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: f */
    private boolean m10213f() {
        return this.f8480B.getTitle() == null && this.f8480B.getIcon() == null && this.f8480B.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f8479A == null) {
                this.f8479A = (FrameLayout) ((ViewStub) findViewById(R$id.design_menu_item_action_area_stub)).inflate();
            }
            this.f8479A.removeAllViews();
            this.f8479A.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0107p.a
    /* renamed from: a */
    public void mo557a(C0101j c0101j, int i) {
        this.f8480B = c0101j;
        setVisibility(c0101j.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C3107q2.m14891a(this, m10212e());
        }
        setCheckable(c0101j.isCheckable());
        setChecked(c0101j.isChecked());
        setEnabled(c0101j.isEnabled());
        setTitle(c0101j.getTitle());
        setIcon(c0101j.getIcon());
        setActionView(c0101j.getActionView());
        setContentDescription(c0101j.getContentDescription());
        C0202v0.m1176a(this, c0101j.getTooltipText());
        m10211d();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0107p.a
    /* renamed from: b */
    public boolean mo559b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0107p.a
    public C0101j getItemData() {
        return this.f8480B;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0101j c0101j = this.f8480B;
        if (c0101j != null && c0101j.isCheckable() && this.f8480B.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f8478G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f8487y != z) {
            this.f8487y = z;
            this.f8484F.m16700a(this.f8488z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f8488z.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f8482D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0239a.m1495i(drawable).mutate();
                C0239a.m1480a(drawable, this.f8481C);
            }
            int i = this.f8485w;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f8486x) {
            if (this.f8483E == null) {
                Drawable m14677a = C3066p0.m14677a(getResources(), R$drawable.navigation_empty_icon, getContext().getTheme());
                this.f8483E = m14677a;
                if (m14677a != null) {
                    int i2 = this.f8485w;
                    m14677a.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f8483E;
        }
        C0257i.m1594a(this.f8488z, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f8488z.setCompoundDrawablePadding(i);
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f8481C = colorStateList;
        this.f8482D = colorStateList != null;
        C0101j c0101j = this.f8480B;
        if (c0101j != null) {
            setIcon(c0101j.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f8486x = z;
    }

    public void setTextAppearance(int i) {
        C0257i.m1603d(this.f8488z, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f8488z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f8488z.setText(charSequence);
    }
}
