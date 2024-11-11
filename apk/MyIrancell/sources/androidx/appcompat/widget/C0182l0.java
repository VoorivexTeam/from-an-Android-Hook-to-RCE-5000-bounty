package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.app.AbstractC0081a;
import androidx.appcompat.widget.C0170f0;
import p000.C2492g;

/* renamed from: androidx.appcompat.widget.l0 */
/* loaded from: classes.dex */
public class C0182l0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    Runnable f1105b;

    /* renamed from: c */
    private c f1106c;

    /* renamed from: d */
    C0170f0 f1107d;

    /* renamed from: e */
    private Spinner f1108e;

    /* renamed from: f */
    private boolean f1109f;

    /* renamed from: g */
    int f1110g;

    /* renamed from: h */
    int f1111h;

    /* renamed from: i */
    private int f1112i;

    /* renamed from: j */
    private int f1113j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.l0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f1114b;

        a(View view) {
            this.f1114b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0182l0.this.smoothScrollTo(this.f1114b.getLeft() - ((C0182l0.this.getWidth() - this.f1114b.getWidth()) / 2), 0);
            C0182l0.this.f1105b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.l0$b */
    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return C0182l0.this.f1107d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((d) C0182l0.this.f1107d.getChildAt(i)).m1066a();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0182l0.this.m1064a((AbstractC0081a.c) getItem(i), true);
            }
            ((d) view).m1067a((AbstractC0081a.c) getItem(i));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.l0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).m1066a().m486e();
            int childCount = C0182l0.this.f1107d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0182l0.this.f1107d.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.l0$d */
    /* loaded from: classes.dex */
    public class d extends LinearLayout {

        /* renamed from: b */
        private final int[] f1118b;

        /* renamed from: c */
        private AbstractC0081a.c f1119c;

        /* renamed from: d */
        private TextView f1120d;

        /* renamed from: e */
        private ImageView f1121e;

        /* renamed from: f */
        private View f1122f;

        public d(Context context, AbstractC0081a.c cVar, boolean z) {
            super(context, null, R$attr.actionBarTabStyle);
            int[] iArr = {R.attr.background};
            this.f1118b = iArr;
            this.f1119c = cVar;
            C0198t0 m1133a = C0198t0.m1133a(context, null, iArr, R$attr.actionBarTabStyle, 0);
            if (m1133a.m1152g(0)) {
                setBackgroundDrawable(m1133a.m1142b(0));
            }
            m1133a.m1138a();
            if (z) {
                setGravity(8388627);
            }
            m1068b();
        }

        /* renamed from: a */
        public AbstractC0081a.c m1066a() {
            return this.f1119c;
        }

        /* renamed from: a */
        public void m1067a(AbstractC0081a.c cVar) {
            this.f1119c = cVar;
            m1068b();
        }

        /* renamed from: b */
        public void m1068b() {
            AbstractC0081a.c cVar = this.f1119c;
            View m483b = cVar.m483b();
            if (m483b != null) {
                ViewParent parent = m483b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m483b);
                    }
                    addView(m483b);
                }
                this.f1122f = m483b;
                TextView textView = this.f1120d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1121e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1121e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1122f;
            if (view != null) {
                removeView(view);
                this.f1122f = null;
            }
            Drawable m484c = cVar.m484c();
            CharSequence m485d = cVar.m485d();
            if (m484c != null) {
                if (this.f1121e == null) {
                    C0185n c0185n = new C0185n(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    c0185n.setLayoutParams(layoutParams);
                    addView(c0185n, 0);
                    this.f1121e = c0185n;
                }
                this.f1121e.setImageDrawable(m484c);
                this.f1121e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1121e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1121e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(m485d);
            if (z) {
                if (this.f1120d == null) {
                    C0205x c0205x = new C0205x(getContext(), null, R$attr.actionBarTabTextStyle);
                    c0205x.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    c0205x.setLayoutParams(layoutParams2);
                    addView(c0205x);
                    this.f1120d = c0205x;
                }
                this.f1120d.setText(m485d);
                this.f1120d.setVisibility(0);
            } else {
                TextView textView2 = this.f1120d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1120d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1121e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.m482a());
            }
            C0202v0.m1176a(this, z ? null : cVar.m482a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(AbstractC0081a.c.class.getName());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(AbstractC0081a.c.class.getName());
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0182l0.this.f1110g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = C0182l0.this.f1110g;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: a */
    private Spinner m1060a() {
        C0201v c0201v = new C0201v(getContext(), null, R$attr.actionDropDownStyle);
        c0201v.setLayoutParams(new C0170f0.a(-2, -1));
        c0201v.setOnItemSelectedListener(this);
        return c0201v;
    }

    /* renamed from: b */
    private boolean m1061b() {
        Spinner spinner = this.f1108e;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: c */
    private void m1062c() {
        if (m1061b()) {
            return;
        }
        if (this.f1108e == null) {
            this.f1108e = m1060a();
        }
        removeView(this.f1107d);
        addView(this.f1108e, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1108e.getAdapter() == null) {
            this.f1108e.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1105b;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1105b = null;
        }
        this.f1108e.setSelection(this.f1113j);
    }

    /* renamed from: d */
    private boolean m1063d() {
        if (!m1061b()) {
            return false;
        }
        removeView(this.f1108e);
        addView(this.f1107d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1108e.getSelectedItemPosition());
        return false;
    }

    /* renamed from: a */
    d m1064a(AbstractC0081a.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1112i));
        } else {
            dVar.setFocusable(true);
            if (this.f1106c == null) {
                this.f1106c = new c();
            }
            dVar.setOnClickListener(this.f1106c);
        }
        return dVar;
    }

    /* renamed from: a */
    public void m1065a(int i) {
        View childAt = this.f1107d.getChildAt(i);
        Runnable runnable = this.f1105b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1105b = aVar;
        post(aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1105b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2492g m11848a = C2492g.m11848a(getContext());
        setContentHeight(m11848a.m11853e());
        this.f1111h = m11848a.m11852d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1105b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((d) view).m1066a().m486e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f1107d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f1110g = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f1110g = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f1110g, this.f1111h);
        }
        this.f1110g = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1112i, 1073741824);
        if (!z && this.f1109f) {
            this.f1107d.measure(0, makeMeasureSpec);
            if (this.f1107d.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m1062c();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.f1113j);
                return;
            }
        }
        m1063d();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1109f = z;
    }

    public void setContentHeight(int i) {
        this.f1112i = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1113j = i;
        int childCount = this.f1107d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1107d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m1065a(i);
            }
            i2++;
        }
        Spinner spinner = this.f1108e;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
