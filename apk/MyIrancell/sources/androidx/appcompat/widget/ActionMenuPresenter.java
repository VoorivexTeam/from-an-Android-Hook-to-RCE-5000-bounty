package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.AbstractC0093b;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0099h;
import androidx.appcompat.view.menu.C0101j;
import androidx.appcompat.view.menu.C0105n;
import androidx.appcompat.view.menu.InterfaceC0106o;
import androidx.appcompat.view.menu.InterfaceC0107p;
import androidx.appcompat.view.menu.InterfaceC0110s;
import androidx.appcompat.view.menu.SubMenuC0112u;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C0239a;
import java.util.ArrayList;
import p000.AbstractC0003a2;
import p000.C2492g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ActionMenuPresenter extends AbstractC0093b implements AbstractC0003a2.a {

    /* renamed from: A */
    RunnableC0123c f758A;

    /* renamed from: B */
    private C0122b f759B;

    /* renamed from: C */
    final C0126f f760C;

    /* renamed from: D */
    int f761D;

    /* renamed from: j */
    C0124d f762j;

    /* renamed from: k */
    private Drawable f763k;

    /* renamed from: l */
    private boolean f764l;

    /* renamed from: m */
    private boolean f765m;

    /* renamed from: n */
    private boolean f766n;

    /* renamed from: o */
    private int f767o;

    /* renamed from: p */
    private int f768p;

    /* renamed from: q */
    private int f769q;

    /* renamed from: r */
    private boolean f770r;

    /* renamed from: s */
    private boolean f771s;

    /* renamed from: t */
    private boolean f772t;

    /* renamed from: u */
    private boolean f773u;

    /* renamed from: v */
    private int f774v;

    /* renamed from: w */
    private final SparseBooleanArray f775w;

    /* renamed from: x */
    private View f776x;

    /* renamed from: y */
    C0125e f777y;

    /* renamed from: z */
    C0121a f778z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0120a();

        /* renamed from: b */
        public int f779b;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        /* loaded from: classes.dex */
        static class C0120a implements Parcelable.Creator<SavedState> {
            C0120a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f779b = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f779b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    /* loaded from: classes.dex */
    public class C0121a extends C0105n {
        public C0121a(Context context, SubMenuC0112u subMenuC0112u, View view) {
            super(context, subMenuC0112u, view, false, R$attr.actionOverflowMenuStyle);
            if (!((C0101j) subMenuC0112u.getItem()).m700h()) {
                View view2 = ActionMenuPresenter.this.f762j;
                m721a(view2 == null ? (View) ((AbstractC0093b) ActionMenuPresenter.this).f537i : view2);
            }
            m723a(ActionMenuPresenter.this.f760C);
        }

        @Override // androidx.appcompat.view.menu.C0105n
        /* renamed from: d */
        protected void mo728d() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f778z = null;
            actionMenuPresenter.f761D = 0;
            super.mo728d();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    /* loaded from: classes.dex */
    private class C0122b extends ActionMenuItemView.AbstractC0091b {
        C0122b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0091b
        /* renamed from: a */
        public InterfaceC0110s mo564a() {
            C0121a c0121a = ActionMenuPresenter.this.f778z;
            if (c0121a != null) {
                return c0121a.m726b();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    /* loaded from: classes.dex */
    public class RunnableC0123c implements Runnable {

        /* renamed from: b */
        private C0125e f782b;

        public RunnableC0123c(C0125e c0125e) {
            this.f782b = c0125e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC0093b) ActionMenuPresenter.this).f532d != null) {
                ((AbstractC0093b) ActionMenuPresenter.this).f532d.m641a();
            }
            View view = (View) ((AbstractC0093b) ActionMenuPresenter.this).f537i;
            if (view != null && view.getWindowToken() != null && this.f782b.m730f()) {
                ActionMenuPresenter.this.f777y = this.f782b;
            }
            ActionMenuPresenter.this.f758A = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    /* loaded from: classes.dex */
    public class C0124d extends C0185n implements ActionMenuView.InterfaceC0127a {

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        /* loaded from: classes.dex */
        class a extends AbstractViewOnTouchListenerC0168e0 {
            a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0168e0
            /* renamed from: a */
            public InterfaceC0110s mo562a() {
                C0125e c0125e = ActionMenuPresenter.this.f777y;
                if (c0125e == null) {
                    return null;
                }
                return c0125e.m726b();
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0168e0
            /* renamed from: b */
            public boolean mo563b() {
                ActionMenuPresenter.this.m783i();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0168e0
            /* renamed from: c */
            public boolean mo784c() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f758A != null) {
                    return false;
                }
                actionMenuPresenter.m779e();
                return true;
            }
        }

        public C0124d(Context context) {
            super(context, null, R$attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0202v0.m1176a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0127a
        /* renamed from: a */
        public boolean mo558a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0127a
        /* renamed from: c */
        public boolean mo560c() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.m783i();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0239a.m1479a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    /* loaded from: classes.dex */
    public class C0125e extends C0105n {
        public C0125e(Context context, C0099h c0099h, View view, boolean z) {
            super(context, c0099h, view, z, R$attr.actionOverflowMenuStyle);
            m720a(8388613);
            m723a(ActionMenuPresenter.this.f760C);
        }

        @Override // androidx.appcompat.view.menu.C0105n
        /* renamed from: d */
        protected void mo728d() {
            if (((AbstractC0093b) ActionMenuPresenter.this).f532d != null) {
                ((AbstractC0093b) ActionMenuPresenter.this).f532d.close();
            }
            ActionMenuPresenter.this.f777y = null;
            super.mo728d();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    /* loaded from: classes.dex */
    private class C0126f implements InterfaceC0106o.a {
        C0126f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0106o.a
        /* renamed from: a */
        public void mo450a(C0099h c0099h, boolean z) {
            if (c0099h instanceof SubMenuC0112u) {
                c0099h.mo675m().m648a(false);
            }
            InterfaceC0106o.a m577a = ActionMenuPresenter.this.m577a();
            if (m577a != null) {
                m577a.mo450a(c0099h, z);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0106o.a
        /* renamed from: a */
        public boolean mo451a(C0099h c0099h) {
            if (c0099h == null) {
                return false;
            }
            ActionMenuPresenter.this.f761D = ((SubMenuC0112u) c0099h).getItem().getItemId();
            InterfaceC0106o.a m577a = ActionMenuPresenter.this.m577a();
            if (m577a != null) {
                return m577a.mo451a(c0099h);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, R$layout.abc_action_menu_layout, R$layout.abc_action_menu_item_layout);
        this.f775w = new SparseBooleanArray();
        this.f760C = new C0126f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private View m765a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f537i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC0107p.a) && ((InterfaceC0107p.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0093b
    /* renamed from: a */
    public View mo576a(C0101j c0101j, View view, ViewGroup viewGroup) {
        View actionView = c0101j.getActionView();
        if (actionView == null || c0101j.m698f()) {
            actionView = super.mo576a(c0101j, view, viewGroup);
        }
        actionView.setVisibility(c0101j.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0093b, androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public void mo580a(Context context, C0099h c0099h) {
        super.mo580a(context, c0099h);
        Resources resources = context.getResources();
        C2492g m11848a = C2492g.m11848a(context);
        if (!this.f766n) {
            this.f765m = m11848a.m11855g();
        }
        if (!this.f772t) {
            this.f767o = m11848a.m11850b();
        }
        if (!this.f770r) {
            this.f769q = m11848a.m11851c();
        }
        int i = this.f767o;
        if (this.f765m) {
            if (this.f762j == null) {
                C0124d c0124d = new C0124d(this.f530b);
                this.f762j = c0124d;
                if (this.f764l) {
                    c0124d.setImageDrawable(this.f763k);
                    this.f763k = null;
                    this.f764l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f762j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f762j.getMeasuredWidth();
        } else {
            this.f762j = null;
        }
        this.f768p = i;
        this.f774v = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.f776x = null;
    }

    /* renamed from: a */
    public void m772a(Configuration configuration) {
        if (!this.f770r) {
            this.f769q = C2492g.m11848a(this.f531c).m11851c();
        }
        C0099h c0099h = this.f532d;
        if (c0099h != null) {
            c0099h.m657b(true);
        }
    }

    /* renamed from: a */
    public void m773a(Drawable drawable) {
        C0124d c0124d = this.f762j;
        if (c0124d != null) {
            c0124d.setImageDrawable(drawable);
        } else {
            this.f764l = true;
            this.f763k = drawable;
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0093b, androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public void mo582a(C0099h c0099h, boolean z) {
        m776b();
        super.mo582a(c0099h, z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0093b
    /* renamed from: a */
    public void mo583a(C0101j c0101j, InterfaceC0107p.a aVar) {
        aVar.mo557a(c0101j, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f537i);
        if (this.f759B == null) {
            this.f759B = new C0122b();
        }
        actionMenuItemView.setPopupCallback(this.f759B);
    }

    /* renamed from: a */
    public void m774a(ActionMenuView actionMenuView) {
        this.f537i = actionMenuView;
        actionMenuView.mo565a(this.f532d);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0093b, androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public void mo585a(boolean z) {
        super.mo585a(z);
        ((View) this.f537i).requestLayout();
        C0099h c0099h = this.f532d;
        boolean z2 = false;
        if (c0099h != null) {
            ArrayList<C0101j> m660c = c0099h.m660c();
            int size = m660c.size();
            for (int i = 0; i < size; i++) {
                AbstractC0003a2 mo574a = m660c.get(i).mo574a();
                if (mo574a != null) {
                    mo574a.m31a(this);
                }
            }
        }
        C0099h c0099h2 = this.f532d;
        ArrayList<C0101j> m672j = c0099h2 != null ? c0099h2.m672j() : null;
        if (this.f765m && m672j != null) {
            int size2 = m672j.size();
            if (size2 == 1) {
                z2 = !m672j.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        C0124d c0124d = this.f762j;
        if (z2) {
            if (c0124d == null) {
                this.f762j = new C0124d(this.f530b);
            }
            ViewGroup viewGroup = (ViewGroup) this.f762j.getParent();
            if (viewGroup != this.f537i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f762j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f537i;
                actionMenuView.addView(this.f762j, actionMenuView.m790e());
            }
        } else if (c0124d != null) {
            Object parent = c0124d.getParent();
            Object obj = this.f537i;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f762j);
            }
        }
        ((ActionMenuView) this.f537i).setOverflowReserved(this.f765m);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0093b
    /* renamed from: a */
    public boolean mo586a(int i, C0101j c0101j) {
        return c0101j.m700h();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0093b
    /* renamed from: a */
    public boolean mo587a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f762j) {
            return false;
        }
        return super.mo587a(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0093b, androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public boolean mo589a(SubMenuC0112u subMenuC0112u) {
        boolean z = false;
        if (!subMenuC0112u.hasVisibleItems()) {
            return false;
        }
        SubMenuC0112u subMenuC0112u2 = subMenuC0112u;
        while (subMenuC0112u2.m735t() != this.f532d) {
            subMenuC0112u2 = (SubMenuC0112u) subMenuC0112u2.m735t();
        }
        View m765a = m765a(subMenuC0112u2.getItem());
        if (m765a == null) {
            return false;
        }
        subMenuC0112u.getItem().getItemId();
        int size = subMenuC0112u.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = subMenuC0112u.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0121a c0121a = new C0121a(this.f531c, subMenuC0112u, m765a);
        this.f778z = c0121a;
        c0121a.m724a(z);
        this.f778z.m729e();
        super.mo589a(subMenuC0112u);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0093b
    /* renamed from: b */
    public InterfaceC0107p mo590b(ViewGroup viewGroup) {
        InterfaceC0107p interfaceC0107p = this.f537i;
        InterfaceC0107p mo590b = super.mo590b(viewGroup);
        if (interfaceC0107p != mo590b) {
            ((ActionMenuView) mo590b).setPresenter(this);
        }
        return mo590b;
    }

    /* renamed from: b */
    public void m775b(boolean z) {
        this.f773u = z;
    }

    /* renamed from: b */
    public boolean m776b() {
        return m779e() | m780f();
    }

    /* renamed from: c */
    public void m777c(boolean z) {
        this.f765m = z;
        this.f766n = true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: c */
    public boolean mo614c() {
        ArrayList<C0101j> arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        ActionMenuPresenter actionMenuPresenter = this;
        C0099h c0099h = actionMenuPresenter.f532d;
        int i5 = 0;
        if (c0099h != null) {
            arrayList = c0099h.m676n();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = actionMenuPresenter.f769q;
        int i7 = actionMenuPresenter.f768p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f537i;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            C0101j c0101j = arrayList.get(i10);
            if (c0101j.m703k()) {
                i8++;
            } else if (c0101j.m702j()) {
                i9++;
            } else {
                z = true;
            }
            if (actionMenuPresenter.f773u && c0101j.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (actionMenuPresenter.f765m && (z || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f775w;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f771s) {
            int i12 = actionMenuPresenter.f774v;
            i3 = i7 / i12;
            i2 = i12 + ((i7 % i12) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            C0101j c0101j2 = arrayList.get(i13);
            if (c0101j2.m703k()) {
                View mo576a = actionMenuPresenter.mo576a(c0101j2, actionMenuPresenter.f776x, viewGroup);
                if (actionMenuPresenter.f776x == null) {
                    actionMenuPresenter.f776x = mo576a;
                }
                if (actionMenuPresenter.f771s) {
                    i3 -= ActionMenuView.m785a(mo576a, i2, i3, makeMeasureSpec, i5);
                } else {
                    mo576a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = mo576a.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = c0101j2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c0101j2.m695d(true);
                i4 = i;
            } else if (c0101j2.m702j()) {
                int groupId2 = c0101j2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i11 > 0 || z2) && i7 > 0 && (!actionMenuPresenter.f771s || i3 > 0);
                boolean z4 = z3;
                if (z3) {
                    View mo576a2 = actionMenuPresenter.mo576a(c0101j2, actionMenuPresenter.f776x, viewGroup);
                    i4 = i;
                    if (actionMenuPresenter.f776x == null) {
                        actionMenuPresenter.f776x = mo576a2;
                    }
                    if (actionMenuPresenter.f771s) {
                        int m785a = ActionMenuView.m785a(mo576a2, i2, i3, makeMeasureSpec, 0);
                        i3 -= m785a;
                        if (m785a == 0) {
                            z4 = false;
                        }
                    } else {
                        mo576a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = mo576a2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z3 = z4 & (!actionMenuPresenter.f771s ? i7 + i14 <= 0 : i7 < 0);
                } else {
                    i4 = i;
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i15 = 0; i15 < i13; i15++) {
                        C0101j c0101j3 = arrayList.get(i15);
                        if (c0101j3.getGroupId() == groupId2) {
                            if (c0101j3.m700h()) {
                                i11++;
                            }
                            c0101j3.m695d(false);
                        }
                    }
                }
                if (z3) {
                    i11--;
                }
                c0101j2.m695d(z3);
            } else {
                i4 = i;
                c0101j2.m695d(false);
                i13++;
                i5 = 0;
                actionMenuPresenter = this;
                i = i4;
            }
            i13++;
            i5 = 0;
            actionMenuPresenter = this;
            i = i4;
        }
        return true;
    }

    /* renamed from: d */
    public Drawable m778d() {
        C0124d c0124d = this.f762j;
        if (c0124d != null) {
            return c0124d.getDrawable();
        }
        if (this.f764l) {
            return this.f763k;
        }
        return null;
    }

    /* renamed from: e */
    public boolean m779e() {
        Object obj;
        RunnableC0123c runnableC0123c = this.f758A;
        if (runnableC0123c != null && (obj = this.f537i) != null) {
            ((View) obj).removeCallbacks(runnableC0123c);
            this.f758A = null;
            return true;
        }
        C0125e c0125e = this.f777y;
        if (c0125e == null) {
            return false;
        }
        c0125e.m719a();
        return true;
    }

    /* renamed from: f */
    public boolean m780f() {
        C0121a c0121a = this.f778z;
        if (c0121a == null) {
            return false;
        }
        c0121a.m719a();
        return true;
    }

    /* renamed from: g */
    public boolean m781g() {
        return this.f758A != null || m782h();
    }

    /* renamed from: h */
    public boolean m782h() {
        C0125e c0125e = this.f777y;
        return c0125e != null && c0125e.m727c();
    }

    /* renamed from: i */
    public boolean m783i() {
        C0099h c0099h;
        if (!this.f765m || m782h() || (c0099h = this.f532d) == null || this.f537i == null || this.f758A != null || c0099h.m672j().isEmpty()) {
            return false;
        }
        RunnableC0123c runnableC0123c = new RunnableC0123c(new C0125e(this.f531c, this.f532d, this.f762j, true));
        this.f758A = runnableC0123c;
        ((View) this.f537i).post(runnableC0123c);
        super.mo589a((SubMenuC0112u) null);
        return true;
    }
}
