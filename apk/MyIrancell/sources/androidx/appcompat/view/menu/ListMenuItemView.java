package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.InterfaceC0107p;
import androidx.appcompat.widget.C0198t0;
import p000.C3107q2;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0107p.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b */
    private C0101j f494b;

    /* renamed from: c */
    private ImageView f495c;

    /* renamed from: d */
    private RadioButton f496d;

    /* renamed from: e */
    private TextView f497e;

    /* renamed from: f */
    private CheckBox f498f;

    /* renamed from: g */
    private TextView f499g;

    /* renamed from: h */
    private ImageView f500h;

    /* renamed from: i */
    private ImageView f501i;

    /* renamed from: j */
    private LinearLayout f502j;

    /* renamed from: k */
    private Drawable f503k;

    /* renamed from: l */
    private int f504l;

    /* renamed from: m */
    private Context f505m;

    /* renamed from: n */
    private boolean f506n;

    /* renamed from: o */
    private Drawable f507o;

    /* renamed from: p */
    private boolean f508p;

    /* renamed from: q */
    private LayoutInflater f509q;

    /* renamed from: r */
    private boolean f510r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0198t0 m1133a = C0198t0.m1133a(getContext(), attributeSet, R$styleable.MenuView, i, 0);
        this.f503k = m1133a.m1142b(R$styleable.MenuView_android_itemBackground);
        this.f504l = m1133a.m1151g(R$styleable.MenuView_android_itemTextAppearance, -1);
        this.f506n = m1133a.m1139a(R$styleable.MenuView_preserveIconSpacing, false);
        this.f505m = context;
        this.f507o = m1133a.m1142b(R$styleable.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, R$attr.dropDownListViewStyle, 0);
        this.f508p = obtainStyledAttributes.hasValue(0);
        m1133a.m1138a();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m567a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R$layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f498f = checkBox;
        m568a(checkBox);
    }

    /* renamed from: a */
    private void m568a(View view) {
        m569a(view, -1);
    }

    /* renamed from: a */
    private void m569a(View view, int i) {
        LinearLayout linearLayout = this.f502j;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: c */
    private void m570c() {
        ImageView imageView = (ImageView) getInflater().inflate(R$layout.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f495c = imageView;
        m569a(imageView, 0);
    }

    /* renamed from: d */
    private void m571d() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R$layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f496d = radioButton;
        m568a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f509q == null) {
            this.f509q = LayoutInflater.from(getContext());
        }
        return this.f509q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f500h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0107p.a
    /* renamed from: a */
    public void mo557a(C0101j c0101j, int i) {
        this.f494b = c0101j;
        setVisibility(c0101j.isVisible() ? 0 : 8);
        setTitle(c0101j.m686a(this));
        setCheckable(c0101j.isCheckable());
        m572a(c0101j.m705m(), c0101j.m694d());
        setIcon(c0101j.getIcon());
        setEnabled(c0101j.isEnabled());
        setSubMenuArrowVisible(c0101j.hasSubMenu());
        setContentDescription(c0101j.getContentDescription());
    }

    /* renamed from: a */
    public void m572a(boolean z, char c) {
        int i = (z && this.f494b.m705m()) ? 0 : 8;
        if (i == 0) {
            this.f499g.setText(this.f494b.m696e());
        }
        if (this.f499g.getVisibility() != i) {
            this.f499g.setVisibility(i);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f501i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f501i.getLayoutParams();
        rect.top += this.f501i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0107p.a
    /* renamed from: b */
    public boolean mo559b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0107p.a
    public C0101j getItemData() {
        return this.f494b;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C3107q2.m14891a(this, this.f503k);
        TextView textView = (TextView) findViewById(R$id.title);
        this.f497e = textView;
        int i = this.f504l;
        if (i != -1) {
            textView.setTextAppearance(this.f505m, i);
        }
        this.f499g = (TextView) findViewById(R$id.shortcut);
        ImageView imageView = (ImageView) findViewById(R$id.submenuarrow);
        this.f500h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f507o);
        }
        this.f501i = (ImageView) findViewById(R$id.group_divider);
        this.f502j = (LinearLayout) findViewById(R$id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f495c != null && this.f506n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f495c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f496d == null && this.f498f == null) {
            return;
        }
        if (this.f494b.m701i()) {
            if (this.f496d == null) {
                m571d();
            }
            compoundButton = this.f496d;
            compoundButton2 = this.f498f;
        } else {
            if (this.f498f == null) {
                m567a();
            }
            compoundButton = this.f498f;
            compoundButton2 = this.f496d;
        }
        if (z) {
            compoundButton.setChecked(this.f494b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f498f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f496d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f494b.m701i()) {
            if (this.f496d == null) {
                m571d();
            }
            compoundButton = this.f496d;
        } else {
            if (this.f498f == null) {
                m567a();
            }
            compoundButton = this.f498f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f510r = z;
        this.f506n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f501i;
        if (imageView != null) {
            imageView.setVisibility((this.f508p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f494b.m704l() || this.f510r;
        if (z || this.f506n) {
            if (this.f495c == null && drawable == null && !this.f506n) {
                return;
            }
            if (this.f495c == null) {
                m570c();
            }
            if (drawable == null && !this.f506n) {
                this.f495c.setVisibility(8);
                return;
            }
            ImageView imageView = this.f495c;
            if (!z) {
                drawable = null;
            }
            imageView.setImageDrawable(drawable);
            if (this.f495c.getVisibility() != 0) {
                this.f495c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.f497e.setText(charSequence);
            if (this.f497e.getVisibility() == 0) {
                return;
            }
            textView = this.f497e;
            i = 0;
        } else {
            i = 8;
            if (this.f497e.getVisibility() == 8) {
                return;
            } else {
                textView = this.f497e;
            }
        }
        textView.setVisibility(i);
    }
}
