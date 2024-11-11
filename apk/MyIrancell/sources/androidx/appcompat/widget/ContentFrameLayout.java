package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p000.C3107q2;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b */
    private TypedValue f811b;

    /* renamed from: c */
    private TypedValue f812c;

    /* renamed from: d */
    private TypedValue f813d;

    /* renamed from: e */
    private TypedValue f814e;

    /* renamed from: f */
    private TypedValue f815f;

    /* renamed from: g */
    private TypedValue f816g;

    /* renamed from: h */
    private final Rect f817h;

    /* renamed from: i */
    private InterfaceC0132a f818i;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0132a {
        /* renamed from: a */
        void mo447a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f817h = new Rect();
    }

    /* renamed from: a */
    public void m803a(int i, int i2, int i3, int i4) {
        this.f817h.set(i, i2, i3, i4);
        if (C3107q2.m14932x(this)) {
            requestLayout();
        }
    }

    /* renamed from: a */
    public void m804a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f815f == null) {
            this.f815f = new TypedValue();
        }
        return this.f815f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f816g == null) {
            this.f816g = new TypedValue();
        }
        return this.f816g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f813d == null) {
            this.f813d = new TypedValue();
        }
        return this.f813d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f814e == null) {
            this.f814e = new TypedValue();
        }
        return this.f814e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f811b == null) {
            this.f811b = new TypedValue();
        }
        return this.f811b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f812c == null) {
            this.f812c = new TypedValue();
        }
        return this.f812c;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0132a interfaceC0132a = this.f818i;
        if (interfaceC0132a != null) {
            interfaceC0132a.mo447a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0132a interfaceC0132a = this.f818i;
        if (interfaceC0132a != null) {
            interfaceC0132a.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0132a interfaceC0132a) {
        this.f818i = interfaceC0132a;
    }
}
