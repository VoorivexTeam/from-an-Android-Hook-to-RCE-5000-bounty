package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.AbstractC0081a;
import androidx.appcompat.view.menu.C0099h;
import androidx.appcompat.view.menu.C0101j;
import androidx.appcompat.view.menu.InterfaceC0106o;
import androidx.appcompat.view.menu.SubMenuC0112u;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import p000.C0000a;
import p000.C0447b2;
import p000.C2414e2;
import p000.C2916m;
import p000.C3107q2;
import p000.InterfaceC2572i;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f897A;

    /* renamed from: B */
    private int f898B;

    /* renamed from: C */
    private boolean f899C;

    /* renamed from: D */
    private boolean f900D;

    /* renamed from: E */
    private final ArrayList<View> f901E;

    /* renamed from: F */
    private final ArrayList<View> f902F;

    /* renamed from: G */
    private final int[] f903G;

    /* renamed from: H */
    InterfaceC0156f f904H;

    /* renamed from: I */
    private final ActionMenuView.InterfaceC0131e f905I;

    /* renamed from: J */
    private C0200u0 f906J;

    /* renamed from: K */
    private ActionMenuPresenter f907K;

    /* renamed from: L */
    private C0154d f908L;

    /* renamed from: M */
    private InterfaceC0106o.a f909M;

    /* renamed from: N */
    private C0099h.a f910N;

    /* renamed from: O */
    private boolean f911O;

    /* renamed from: P */
    private final Runnable f912P;

    /* renamed from: b */
    private ActionMenuView f913b;

    /* renamed from: c */
    private TextView f914c;

    /* renamed from: d */
    private TextView f915d;

    /* renamed from: e */
    private ImageButton f916e;

    /* renamed from: f */
    private ImageView f917f;

    /* renamed from: g */
    private Drawable f918g;

    /* renamed from: h */
    private CharSequence f919h;

    /* renamed from: i */
    ImageButton f920i;

    /* renamed from: j */
    View f921j;

    /* renamed from: k */
    private Context f922k;

    /* renamed from: l */
    private int f923l;

    /* renamed from: m */
    private int f924m;

    /* renamed from: n */
    private int f925n;

    /* renamed from: o */
    int f926o;

    /* renamed from: p */
    private int f927p;

    /* renamed from: q */
    private int f928q;

    /* renamed from: r */
    private int f929r;

    /* renamed from: s */
    private int f930s;

    /* renamed from: t */
    private int f931t;

    /* renamed from: u */
    private C0180k0 f932u;

    /* renamed from: v */
    private int f933v;

    /* renamed from: w */
    private int f934w;

    /* renamed from: x */
    private int f935x;

    /* renamed from: y */
    private CharSequence f936y;

    /* renamed from: z */
    private CharSequence f937z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0150a();

        /* renamed from: d */
        int f938d;

        /* renamed from: e */
        boolean f939e;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        /* loaded from: classes.dex */
        static class C0150a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0150a() {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f938d = parcel.readInt();
            this.f939e = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f938d);
            parcel.writeInt(this.f939e ? 1 : 0);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    /* loaded from: classes.dex */
    class C0151a implements ActionMenuView.InterfaceC0131e {
        C0151a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0131e
        public boolean onMenuItemClick(MenuItem menuItem) {
            InterfaceC0156f interfaceC0156f = Toolbar.this.f904H;
            if (interfaceC0156f != null) {
                return interfaceC0156f.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    /* loaded from: classes.dex */
    class RunnableC0152b implements Runnable {
        RunnableC0152b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m886k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC0153c implements View.OnClickListener {
        ViewOnClickListenerC0153c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m878c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    /* loaded from: classes.dex */
    public class C0154d implements InterfaceC0106o {

        /* renamed from: b */
        C0099h f943b;

        /* renamed from: c */
        C0101j f944c;

        C0154d() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0106o
        /* renamed from: a */
        public void mo580a(Context context, C0099h c0099h) {
            C0101j c0101j;
            C0099h c0099h2 = this.f943b;
            if (c0099h2 != null && (c0101j = this.f944c) != null) {
                c0099h2.mo652a(c0101j);
            }
            this.f943b = c0099h;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0106o
        /* renamed from: a */
        public void mo582a(C0099h c0099h, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0106o
        /* renamed from: a */
        public void mo584a(InterfaceC0106o.a aVar) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0106o
        /* renamed from: a */
        public void mo585a(boolean z) {
            if (this.f944c != null) {
                C0099h c0099h = this.f943b;
                boolean z2 = false;
                if (c0099h != null) {
                    int size = c0099h.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        if (this.f943b.getItem(i) == this.f944c) {
                            z2 = true;
                            break;
                        }
                        i++;
                    }
                }
                if (z2) {
                    return;
                }
                mo588a(this.f943b, this.f944c);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0106o
        /* renamed from: a */
        public boolean mo588a(C0099h c0099h, C0101j c0101j) {
            KeyEvent.Callback callback = Toolbar.this.f921j;
            if (callback instanceof InterfaceC2572i) {
                ((InterfaceC2572i) callback).mo711c();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f921j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f920i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f921j = null;
            toolbar3.m872a();
            this.f944c = null;
            Toolbar.this.requestLayout();
            c0101j.m689a(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0106o
        /* renamed from: a */
        public boolean mo589a(SubMenuC0112u subMenuC0112u) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0106o
        /* renamed from: b */
        public boolean mo591b(C0099h c0099h, C0101j c0101j) {
            Toolbar.this.m880e();
            ViewParent parent = Toolbar.this.f920i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f920i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f920i);
            }
            Toolbar.this.f921j = c0101j.getActionView();
            this.f944c = c0101j;
            ViewParent parent2 = Toolbar.this.f921j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f921j);
                }
                C0155e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f412a = 8388611 | (toolbar4.f926o & 112);
                generateDefaultLayoutParams.f946b = 2;
                toolbar4.f921j.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f921j);
            }
            Toolbar.this.m885j();
            Toolbar.this.requestLayout();
            c0101j.m689a(true);
            KeyEvent.Callback callback = Toolbar.this.f921j;
            if (callback instanceof InterfaceC2572i) {
                ((InterfaceC2572i) callback).mo709a();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0106o
        /* renamed from: c */
        public boolean mo614c() {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    /* loaded from: classes.dex */
    public static class C0155e extends AbstractC0081a.a {

        /* renamed from: b */
        int f946b;

        public C0155e(int i, int i2) {
            super(i, i2);
            this.f946b = 0;
            this.f412a = 8388627;
        }

        public C0155e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f946b = 0;
        }

        public C0155e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f946b = 0;
        }

        public C0155e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f946b = 0;
            m887a(marginLayoutParams);
        }

        public C0155e(AbstractC0081a.a aVar) {
            super(aVar);
            this.f946b = 0;
        }

        public C0155e(C0155e c0155e) {
            super((AbstractC0081a.a) c0155e);
            this.f946b = 0;
            this.f946b = c0155e.f946b;
        }

        /* renamed from: a */
        void m887a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    /* loaded from: classes.dex */
    public interface InterfaceC0156f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f935x = 8388627;
        this.f901E = new ArrayList<>();
        this.f902F = new ArrayList<>();
        this.f903G = new int[2];
        this.f905I = new C0151a();
        this.f912P = new RunnableC0152b();
        C0198t0 m1133a = C0198t0.m1133a(getContext(), attributeSet, R$styleable.Toolbar, i, 0);
        this.f924m = m1133a.m1151g(R$styleable.Toolbar_titleTextAppearance, 0);
        this.f925n = m1133a.m1151g(R$styleable.Toolbar_subtitleTextAppearance, 0);
        this.f935x = m1133a.m1147e(R$styleable.Toolbar_android_gravity, this.f935x);
        this.f926o = m1133a.m1147e(R$styleable.Toolbar_buttonGravity, 48);
        int m1141b = m1133a.m1141b(R$styleable.Toolbar_titleMargin, 0);
        m1141b = m1133a.m1152g(R$styleable.Toolbar_titleMargins) ? m1133a.m1141b(R$styleable.Toolbar_titleMargins, m1141b) : m1141b;
        this.f931t = m1141b;
        this.f930s = m1141b;
        this.f929r = m1141b;
        this.f928q = m1141b;
        int m1141b2 = m1133a.m1141b(R$styleable.Toolbar_titleMarginStart, -1);
        if (m1141b2 >= 0) {
            this.f928q = m1141b2;
        }
        int m1141b3 = m1133a.m1141b(R$styleable.Toolbar_titleMarginEnd, -1);
        if (m1141b3 >= 0) {
            this.f929r = m1141b3;
        }
        int m1141b4 = m1133a.m1141b(R$styleable.Toolbar_titleMarginTop, -1);
        if (m1141b4 >= 0) {
            this.f930s = m1141b4;
        }
        int m1141b5 = m1133a.m1141b(R$styleable.Toolbar_titleMarginBottom, -1);
        if (m1141b5 >= 0) {
            this.f931t = m1141b5;
        }
        this.f927p = m1133a.m1143c(R$styleable.Toolbar_maxButtonHeight, -1);
        int m1141b6 = m1133a.m1141b(R$styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int m1141b7 = m1133a.m1141b(R$styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int m1143c = m1133a.m1143c(R$styleable.Toolbar_contentInsetLeft, 0);
        int m1143c2 = m1133a.m1143c(R$styleable.Toolbar_contentInsetRight, 0);
        m865l();
        this.f932u.m1054a(m1143c, m1143c2);
        if (m1141b6 != Integer.MIN_VALUE || m1141b7 != Integer.MIN_VALUE) {
            this.f932u.m1057b(m1141b6, m1141b7);
        }
        this.f933v = m1133a.m1141b(R$styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f934w = m1133a.m1141b(R$styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f918g = m1133a.m1142b(R$styleable.Toolbar_collapseIcon);
        this.f919h = m1133a.m1148e(R$styleable.Toolbar_collapseContentDescription);
        CharSequence m1148e = m1133a.m1148e(R$styleable.Toolbar_title);
        if (!TextUtils.isEmpty(m1148e)) {
            setTitle(m1148e);
        }
        CharSequence m1148e2 = m1133a.m1148e(R$styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(m1148e2)) {
            setSubtitle(m1148e2);
        }
        this.f922k = getContext();
        setPopupTheme(m1133a.m1151g(R$styleable.Toolbar_popupTheme, 0));
        Drawable m1142b = m1133a.m1142b(R$styleable.Toolbar_navigationIcon);
        if (m1142b != null) {
            setNavigationIcon(m1142b);
        }
        CharSequence m1148e3 = m1133a.m1148e(R$styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(m1148e3)) {
            setNavigationContentDescription(m1148e3);
        }
        Drawable m1142b2 = m1133a.m1142b(R$styleable.Toolbar_logo);
        if (m1142b2 != null) {
            setLogo(m1142b2);
        }
        CharSequence m1148e4 = m1133a.m1148e(R$styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(m1148e4)) {
            setLogoDescription(m1148e4);
        }
        if (m1133a.m1152g(R$styleable.Toolbar_titleTextColor)) {
            setTitleTextColor(m1133a.m1135a(R$styleable.Toolbar_titleTextColor, -1));
        }
        if (m1133a.m1152g(R$styleable.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(m1133a.m1135a(R$styleable.Toolbar_subtitleTextColor, -1));
        }
        m1133a.m1138a();
    }

    /* renamed from: a */
    private int m851a(int i) {
        int m14919k = C3107q2.m14919k(this);
        int m3270a = C0447b2.m3270a(i, m14919k) & 7;
        return (m3270a == 1 || m3270a == 3 || m3270a == 5) ? m3270a : m14919k == 1 ? 5 : 3;
    }

    /* renamed from: a */
    private int m852a(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C2414e2.m11533b(marginLayoutParams) + C2414e2.m11531a(marginLayoutParams);
    }

    /* renamed from: a */
    private int m853a(View view, int i) {
        C0155e c0155e = (C0155e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int m860b = m860b(c0155e.f412a);
        if (m860b == 48) {
            return getPaddingTop() - i2;
        }
        if (m860b == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0155e).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c0155e).topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c0155e).bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: a */
    private int m854a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private int m855a(View view, int i, int[] iArr, int i2) {
        C0155e c0155e = (C0155e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0155e).leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int m853a = m853a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m853a, max + measuredWidth, view.getMeasuredHeight() + m853a);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) c0155e).rightMargin;
    }

    /* renamed from: a */
    private int m856a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C0155e c0155e = (C0155e) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) c0155e).leftMargin - i;
            int i6 = ((ViewGroup.MarginLayoutParams) c0155e).rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: a */
    private void m857a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private void m858a(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0155e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0155e) layoutParams;
        generateDefaultLayoutParams.f946b = 1;
        if (!z || this.f921j == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.f902F.add(view);
        }
    }

    /* renamed from: a */
    private void m859a(List<View> list, int i) {
        boolean z = C3107q2.m14919k(this) == 1;
        int childCount = getChildCount();
        int m3270a = C0447b2.m3270a(i, C3107q2.m14919k(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C0155e c0155e = (C0155e) childAt.getLayoutParams();
                if (c0155e.f946b == 0 && m864d(childAt) && m851a(c0155e.f412a) == m3270a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C0155e c0155e2 = (C0155e) childAt2.getLayoutParams();
            if (c0155e2.f946b == 0 && m864d(childAt2) && m851a(c0155e2.f412a) == m3270a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    private int m860b(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f935x & 112;
    }

    /* renamed from: b */
    private int m861b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: b */
    private int m862b(View view, int i, int[] iArr, int i2) {
        C0155e c0155e = (C0155e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0155e).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int m853a = m853a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m853a, max, view.getMeasuredHeight() + m853a);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0155e).leftMargin);
    }

    /* renamed from: c */
    private boolean m863c(View view) {
        return view.getParent() == this || this.f902F.contains(view);
    }

    /* renamed from: d */
    private boolean m864d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private MenuInflater getMenuInflater() {
        return new C2916m(getContext());
    }

    /* renamed from: l */
    private void m865l() {
        if (this.f932u == null) {
            this.f932u = new C0180k0();
        }
    }

    /* renamed from: m */
    private void m866m() {
        if (this.f917f == null) {
            this.f917f = new C0185n(getContext());
        }
    }

    /* renamed from: n */
    private void m867n() {
        m868o();
        if (this.f913b.m795j() == null) {
            C0099h c0099h = (C0099h) this.f913b.getMenu();
            if (this.f908L == null) {
                this.f908L = new C0154d();
            }
            this.f913b.setExpandedActionViewsExclusive(true);
            c0099h.m646a(this.f908L, this.f922k);
        }
    }

    /* renamed from: o */
    private void m868o() {
        if (this.f913b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f913b = actionMenuView;
            actionMenuView.setPopupTheme(this.f923l);
            this.f913b.setOnMenuItemClickListener(this.f905I);
            this.f913b.m787a(this.f909M, this.f910N);
            C0155e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f412a = 8388613 | (this.f926o & 112);
            this.f913b.setLayoutParams(generateDefaultLayoutParams);
            m858a((View) this.f913b, false);
        }
    }

    /* renamed from: p */
    private void m869p() {
        if (this.f916e == null) {
            this.f916e = new C0181l(getContext(), null, R$attr.toolbarNavigationButtonStyle);
            C0155e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f412a = 8388611 | (this.f926o & 112);
            this.f916e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: q */
    private void m870q() {
        removeCallbacks(this.f912P);
        post(this.f912P);
    }

    /* renamed from: r */
    private boolean m871r() {
        if (!this.f911O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m864d(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    void m872a() {
        for (int size = this.f902F.size() - 1; size >= 0; size--) {
            addView(this.f902F.get(size));
        }
        this.f902F.clear();
    }

    /* renamed from: a */
    public void m873a(int i, int i2) {
        m865l();
        this.f932u.m1057b(i, i2);
    }

    /* renamed from: a */
    public void m874a(Context context, int i) {
        this.f925n = i;
        TextView textView = this.f915d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    public void m875a(C0099h c0099h, ActionMenuPresenter actionMenuPresenter) {
        if (c0099h == null && this.f913b == null) {
            return;
        }
        m868o();
        C0099h m795j = this.f913b.m795j();
        if (m795j == c0099h) {
            return;
        }
        if (m795j != null) {
            m795j.m656b(this.f907K);
            m795j.m656b(this.f908L);
        }
        if (this.f908L == null) {
            this.f908L = new C0154d();
        }
        actionMenuPresenter.m775b(true);
        if (c0099h != null) {
            c0099h.m646a(actionMenuPresenter, this.f922k);
            c0099h.m646a(this.f908L, this.f922k);
        } else {
            actionMenuPresenter.mo580a(this.f922k, (C0099h) null);
            this.f908L.mo580a(this.f922k, (C0099h) null);
            actionMenuPresenter.mo585a(true);
            this.f908L.mo585a(true);
        }
        this.f913b.setPopupTheme(this.f923l);
        this.f913b.setPresenter(actionMenuPresenter);
        this.f907K = actionMenuPresenter;
    }

    /* renamed from: b */
    public void m876b(Context context, int i) {
        this.f924m = i;
        TextView textView = this.f914c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: b */
    public boolean m877b() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f913b) != null && actionMenuView.m794i();
    }

    /* renamed from: c */
    public void m878c() {
        C0154d c0154d = this.f908L;
        C0101j c0101j = c0154d == null ? null : c0154d.f944c;
        if (c0101j != null) {
            c0101j.collapseActionView();
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0155e);
    }

    /* renamed from: d */
    public void m879d() {
        ActionMenuView actionMenuView = this.f913b;
        if (actionMenuView != null) {
            actionMenuView.m788d();
        }
    }

    /* renamed from: e */
    void m880e() {
        if (this.f920i == null) {
            C0181l c0181l = new C0181l(getContext(), null, R$attr.toolbarNavigationButtonStyle);
            this.f920i = c0181l;
            c0181l.setImageDrawable(this.f918g);
            this.f920i.setContentDescription(this.f919h);
            C0155e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f412a = 8388611 | (this.f926o & 112);
            generateDefaultLayoutParams.f946b = 2;
            this.f920i.setLayoutParams(generateDefaultLayoutParams);
            this.f920i.setOnClickListener(new ViewOnClickListenerC0153c());
        }
    }

    /* renamed from: f */
    public boolean m881f() {
        C0154d c0154d = this.f908L;
        return (c0154d == null || c0154d.f944c == null) ? false : true;
    }

    /* renamed from: g */
    public boolean m882g() {
        ActionMenuView actionMenuView = this.f913b;
        return actionMenuView != null && actionMenuView.m791f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C0155e generateDefaultLayoutParams() {
        return new C0155e(-2, -2);
    }

    @Override // android.view.ViewGroup
    public C0155e generateLayoutParams(AttributeSet attributeSet) {
        return new C0155e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C0155e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0155e ? new C0155e((C0155e) layoutParams) : layoutParams instanceof AbstractC0081a.a ? new C0155e((AbstractC0081a.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0155e((ViewGroup.MarginLayoutParams) layoutParams) : new C0155e(layoutParams);
    }

    public int getContentInsetEnd() {
        C0180k0 c0180k0 = this.f932u;
        if (c0180k0 != null) {
            return c0180k0.m1053a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f934w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0180k0 c0180k0 = this.f932u;
        if (c0180k0 != null) {
            return c0180k0.m1056b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0180k0 c0180k0 = this.f932u;
        if (c0180k0 != null) {
            return c0180k0.m1058c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0180k0 c0180k0 = this.f932u;
        if (c0180k0 != null) {
            return c0180k0.m1059d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f933v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0099h m795j;
        ActionMenuView actionMenuView = this.f913b;
        return actionMenuView != null && (m795j = actionMenuView.m795j()) != null && m795j.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f934w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return C3107q2.m14919k(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C3107q2.m14919k(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f933v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f917f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f917f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m867n();
        return this.f913b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f916e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f916e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f907K;
    }

    public Drawable getOverflowIcon() {
        m867n();
        return this.f913b.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f922k;
    }

    public int getPopupTheme() {
        return this.f923l;
    }

    public CharSequence getSubtitle() {
        return this.f937z;
    }

    public CharSequence getTitle() {
        return this.f936y;
    }

    public int getTitleMarginBottom() {
        return this.f931t;
    }

    public int getTitleMarginEnd() {
        return this.f929r;
    }

    public int getTitleMarginStart() {
        return this.f928q;
    }

    public int getTitleMarginTop() {
        return this.f930s;
    }

    public InterfaceC0159a0 getWrapper() {
        if (this.f906J == null) {
            this.f906J = new C0200u0(this, true);
        }
        return this.f906J;
    }

    /* renamed from: h */
    public boolean m883h() {
        ActionMenuView actionMenuView = this.f913b;
        return actionMenuView != null && actionMenuView.m792g();
    }

    /* renamed from: i */
    public boolean m884i() {
        ActionMenuView actionMenuView = this.f913b;
        return actionMenuView != null && actionMenuView.m793h();
    }

    /* renamed from: j */
    void m885j() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C0155e) childAt.getLayoutParams()).f946b != 2 && childAt != this.f913b) {
                removeViewAt(childCount);
                this.f902F.add(childAt);
            }
        }
    }

    /* renamed from: k */
    public boolean m886k() {
        ActionMenuView actionMenuView = this.f913b;
        return actionMenuView != null && actionMenuView.m796k();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f912P);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f900D = false;
        }
        if (!this.f900D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f900D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f900D = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0299 A[LOOP:0: B:46:0x0297->B:47:0x0299, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02bb A[LOOP:1: B:50:0x02b9->B:51:0x02bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02f4 A[LOOP:2: B:59:0x02f2->B:60:0x02f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f903G;
        if (C0210z0.m1244a(this)) {
            c = 1;
            c2 = 0;
        } else {
            c = 0;
            c2 = 1;
        }
        if (m864d(this.f916e)) {
            m857a(this.f916e, i, 0, i2, 0, this.f927p);
            i3 = this.f916e.getMeasuredWidth() + m852a(this.f916e);
            i4 = Math.max(0, this.f916e.getMeasuredHeight() + m861b(this.f916e));
            i5 = View.combineMeasuredStates(0, this.f916e.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (m864d(this.f920i)) {
            m857a(this.f920i, i, 0, i2, 0, this.f927p);
            i3 = this.f920i.getMeasuredWidth() + m852a(this.f920i);
            i4 = Math.max(i4, this.f920i.getMeasuredHeight() + m861b(this.f920i));
            i5 = View.combineMeasuredStates(i5, this.f920i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i3);
        iArr[c] = Math.max(0, currentContentInsetStart - i3);
        if (m864d(this.f913b)) {
            m857a(this.f913b, i, max, i2, 0, this.f927p);
            i6 = this.f913b.getMeasuredWidth() + m852a(this.f913b);
            i4 = Math.max(i4, this.f913b.getMeasuredHeight() + m861b(this.f913b));
            i5 = View.combineMeasuredStates(i5, this.f913b.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (m864d(this.f921j)) {
            max2 += m854a(this.f921j, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f921j.getMeasuredHeight() + m861b(this.f921j));
            i5 = View.combineMeasuredStates(i5, this.f921j.getMeasuredState());
        }
        if (m864d(this.f917f)) {
            max2 += m854a(this.f917f, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f917f.getMeasuredHeight() + m861b(this.f917f));
            i5 = View.combineMeasuredStates(i5, this.f917f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (((C0155e) childAt.getLayoutParams()).f946b == 0 && m864d(childAt)) {
                max2 += m854a(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m861b(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i11 = this.f930s + this.f931t;
        int i12 = this.f928q + this.f929r;
        if (m864d(this.f914c)) {
            m854a(this.f914c, i, max2 + i12, i2, i11, iArr);
            int measuredWidth = this.f914c.getMeasuredWidth() + m852a(this.f914c);
            i9 = this.f914c.getMeasuredHeight() + m861b(this.f914c);
            i7 = View.combineMeasuredStates(i5, this.f914c.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = i5;
            i8 = 0;
            i9 = 0;
        }
        if (m864d(this.f915d)) {
            i8 = Math.max(i8, m854a(this.f915d, i, max2 + i12, i2, i9 + i11, iArr));
            i9 += this.f915d.getMeasuredHeight() + m861b(this.f915d);
            i7 = View.combineMeasuredStates(i7, this.f915d.getMeasuredState());
        }
        int max3 = Math.max(i4, i9);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i8 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & i7), m871r() ? 0 : View.resolveSizeAndState(Math.max(max3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i7 << 16));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m1612a());
        ActionMenuView actionMenuView = this.f913b;
        C0099h m795j = actionMenuView != null ? actionMenuView.m795j() : null;
        int i = savedState.f938d;
        if (i != 0 && this.f908L != null && m795j != null && (findItem = m795j.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f939e) {
            m870q();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m865l();
        this.f932u.m1055a(i == 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0101j c0101j;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0154d c0154d = this.f908L;
        if (c0154d != null && (c0101j = c0154d.f944c) != null) {
            savedState.f938d = c0101j.getItemId();
        }
        savedState.f939e = m884i();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f899C = false;
        }
        if (!this.f899C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f899C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f899C = false;
        }
        return true;
    }

    public void setCollapsible(boolean z) {
        this.f911O = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f934w) {
            this.f934w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f933v) {
            this.f933v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0000a.m4c(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m866m();
            if (!m863c(this.f917f)) {
                m858a((View) this.f917f, true);
            }
        } else {
            ImageView imageView = this.f917f;
            if (imageView != null && m863c(imageView)) {
                removeView(this.f917f);
                this.f902F.remove(this.f917f);
            }
        }
        ImageView imageView2 = this.f917f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m866m();
        }
        ImageView imageView = this.f917f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m869p();
        }
        ImageButton imageButton = this.f916e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0000a.m4c(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m869p();
            if (!m863c(this.f916e)) {
                m858a((View) this.f916e, true);
            }
        } else {
            ImageButton imageButton = this.f916e;
            if (imageButton != null && m863c(imageButton)) {
                removeView(this.f916e);
                this.f902F.remove(this.f916e);
            }
        }
        ImageButton imageButton2 = this.f916e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m869p();
        this.f916e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0156f interfaceC0156f) {
        this.f904H = interfaceC0156f;
    }

    public void setOverflowIcon(Drawable drawable) {
        m867n();
        this.f913b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f923l != i) {
            this.f923l = i;
            if (i == 0) {
                this.f922k = getContext();
            } else {
                this.f922k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f915d;
            if (textView != null && m863c(textView)) {
                removeView(this.f915d);
                this.f902F.remove(this.f915d);
            }
        } else {
            if (this.f915d == null) {
                Context context = getContext();
                C0205x c0205x = new C0205x(context);
                this.f915d = c0205x;
                c0205x.setSingleLine();
                this.f915d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f925n;
                if (i != 0) {
                    this.f915d.setTextAppearance(context, i);
                }
                int i2 = this.f898B;
                if (i2 != 0) {
                    this.f915d.setTextColor(i2);
                }
            }
            if (!m863c(this.f915d)) {
                m858a((View) this.f915d, true);
            }
        }
        TextView textView2 = this.f915d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f937z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        this.f898B = i;
        TextView textView = this.f915d;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f914c;
            if (textView != null && m863c(textView)) {
                removeView(this.f914c);
                this.f902F.remove(this.f914c);
            }
        } else {
            if (this.f914c == null) {
                Context context = getContext();
                C0205x c0205x = new C0205x(context);
                this.f914c = c0205x;
                c0205x.setSingleLine();
                this.f914c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f924m;
                if (i != 0) {
                    this.f914c.setTextAppearance(context, i);
                }
                int i2 = this.f897A;
                if (i2 != 0) {
                    this.f914c.setTextColor(i2);
                }
            }
            if (!m863c(this.f914c)) {
                m858a((View) this.f914c, true);
            }
        }
        TextView textView2 = this.f914c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f936y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f931t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f929r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f928q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f930s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        this.f897A = i;
        TextView textView = this.f914c;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }
}
