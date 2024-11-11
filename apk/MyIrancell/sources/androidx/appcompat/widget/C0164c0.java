package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R$attr;
import androidx.core.graphics.drawable.C0239a;
import androidx.core.widget.C0254f;
import java.lang.reflect.Field;
import p000.C2365d;
import p000.C3284u2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.c0 */
/* loaded from: classes.dex */
public class C0164c0 extends ListView {

    /* renamed from: b */
    private final Rect f969b;

    /* renamed from: c */
    private int f970c;

    /* renamed from: d */
    private int f971d;

    /* renamed from: e */
    private int f972e;

    /* renamed from: f */
    private int f973f;

    /* renamed from: g */
    private int f974g;

    /* renamed from: h */
    private Field f975h;

    /* renamed from: i */
    private a f976i;

    /* renamed from: j */
    private boolean f977j;

    /* renamed from: k */
    private boolean f978k;

    /* renamed from: l */
    private boolean f979l;

    /* renamed from: m */
    private C3284u2 f980m;

    /* renamed from: n */
    private C0254f f981n;

    /* renamed from: o */
    b f982o;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c0$a */
    /* loaded from: classes.dex */
    public static class a extends C2365d {

        /* renamed from: c */
        private boolean f983c;

        a(Drawable drawable) {
            super(drawable);
            this.f983c = true;
        }

        /* renamed from: a */
        void m937a(boolean z) {
            this.f983c = z;
        }

        @Override // p000.C2365d, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f983c) {
                super.draw(canvas);
            }
        }

        @Override // p000.C2365d, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f983c) {
                super.setHotspot(f, f2);
            }
        }

        @Override // p000.C2365d, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f983c) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // p000.C2365d, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f983c) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p000.C2365d, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f983c) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c0$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        /* renamed from: a */
        public void m938a() {
            C0164c0 c0164c0 = C0164c0.this;
            c0164c0.f982o = null;
            c0164c0.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m939b() {
            C0164c0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C0164c0 c0164c0 = C0164c0.this;
            c0164c0.f982o = null;
            c0164c0.drawableStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0164c0(Context context, boolean z) {
        super(context, null, R$attr.dropDownListViewStyle);
        this.f969b = new Rect();
        this.f970c = 0;
        this.f971d = 0;
        this.f972e = 0;
        this.f973f = 0;
        this.f978k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f975h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m926a() {
        this.f979l = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f974g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C3284u2 c3284u2 = this.f980m;
        if (c3284u2 != null) {
            c3284u2.m15709a();
            this.f980m = null;
        }
    }

    /* renamed from: a */
    private void m927a(int i, View view) {
        Rect rect = this.f969b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f970c;
        rect.top -= this.f971d;
        rect.right += this.f972e;
        rect.bottom += this.f973f;
        try {
            boolean z = this.f975h.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f975h.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m928a(int i, View view, float f, float f2) {
        m932b(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        C0239a.m1478a(selector, f, f2);
    }

    /* renamed from: a */
    private void m929a(Canvas canvas) {
        Drawable selector;
        if (this.f969b.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f969b);
        selector.draw(canvas);
    }

    /* renamed from: a */
    private void m930a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: a */
    private void m931a(View view, int i, float f, float f2) {
        View childAt;
        this.f979l = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f974g;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f974g = i;
        float left = f - view.getLeft();
        float top = f2 - view.getTop();
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m928a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: b */
    private void m932b(int i, View view) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        m927a(i, view);
        if (z) {
            Rect rect = this.f969b;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            C0239a.m1478a(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: b */
    private boolean m933b() {
        return this.f979l;
    }

    /* renamed from: c */
    private void m934c() {
        Drawable selector = getSelector();
        if (selector != null && m933b() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.f976i;
        if (aVar != null) {
            aVar.m937a(z);
        }
    }

    /* renamed from: a */
    public int m935a(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i6 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i6;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                return (i5 < 0 || i7 <= i5 || i9 <= 0 || i6 == i4) ? i4 : i9;
            }
            if (i5 >= 0 && i7 >= i5) {
                i9 = i6;
            }
            i7++;
        }
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m936a(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m931a(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.m930a(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.m926a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.f r9 = r7.f981n
            if (r9 != 0) goto L5a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f981n = r9
        L5a:
            androidx.core.widget.f r9 = r7.f981n
            r9.m1549a(r2)
            androidx.core.widget.f r9 = r7.f981n
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.f r8 = r7.f981n
            if (r8 == 0) goto L6c
            r8.m1549a(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0164c0.m936a(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m929a(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f982o != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m934c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f978k || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f978k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f978k || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f978k && this.f977j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f982o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f982o == null) {
            b bVar = new b();
            this.f982o = bVar;
            bVar.m939b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m934c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f974g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f982o;
        if (bVar != null) {
            bVar.m938a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f977j = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f976i = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f970c = rect.left;
        this.f971d = rect.top;
        this.f972e = rect.right;
        this.f973f = rect.bottom;
    }
}
