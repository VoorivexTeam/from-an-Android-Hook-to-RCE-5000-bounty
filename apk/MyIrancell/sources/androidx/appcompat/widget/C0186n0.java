package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import androidx.core.graphics.drawable.C0239a;
import androidx.core.widget.C0257i;
import p000.C0000a;
import p000.C2451f;
import p000.C3107q2;

/* renamed from: androidx.appcompat.widget.n0 */
/* loaded from: classes.dex */
public class C0186n0 extends CompoundButton {

    /* renamed from: N */
    private static final Property<C0186n0, Float> f1149N = new a(Float.class, "thumbPos");

    /* renamed from: O */
    private static final int[] f1150O = {R.attr.state_checked};

    /* renamed from: A */
    private int f1151A;

    /* renamed from: B */
    private int f1152B;

    /* renamed from: C */
    private int f1153C;

    /* renamed from: D */
    private int f1154D;

    /* renamed from: E */
    private int f1155E;

    /* renamed from: F */
    private int f1156F;

    /* renamed from: G */
    private final TextPaint f1157G;

    /* renamed from: H */
    private ColorStateList f1158H;

    /* renamed from: I */
    private Layout f1159I;

    /* renamed from: J */
    private Layout f1160J;

    /* renamed from: K */
    private TransformationMethod f1161K;

    /* renamed from: L */
    ObjectAnimator f1162L;

    /* renamed from: M */
    private final Rect f1163M;

    /* renamed from: b */
    private Drawable f1164b;

    /* renamed from: c */
    private ColorStateList f1165c;

    /* renamed from: d */
    private PorterDuff.Mode f1166d;

    /* renamed from: e */
    private boolean f1167e;

    /* renamed from: f */
    private boolean f1168f;

    /* renamed from: g */
    private Drawable f1169g;

    /* renamed from: h */
    private ColorStateList f1170h;

    /* renamed from: i */
    private PorterDuff.Mode f1171i;

    /* renamed from: j */
    private boolean f1172j;

    /* renamed from: k */
    private boolean f1173k;

    /* renamed from: l */
    private int f1174l;

    /* renamed from: m */
    private int f1175m;

    /* renamed from: n */
    private int f1176n;

    /* renamed from: o */
    private boolean f1177o;

    /* renamed from: p */
    private CharSequence f1178p;

    /* renamed from: q */
    private CharSequence f1179q;

    /* renamed from: r */
    private boolean f1180r;

    /* renamed from: s */
    private int f1181s;

    /* renamed from: t */
    private int f1182t;

    /* renamed from: u */
    private float f1183u;

    /* renamed from: v */
    private float f1184v;

    /* renamed from: w */
    private VelocityTracker f1185w;

    /* renamed from: x */
    private int f1186x;

    /* renamed from: y */
    float f1187y;

    /* renamed from: z */
    private int f1188z;

    /* renamed from: androidx.appcompat.widget.n0$a */
    /* loaded from: classes.dex */
    static class a extends Property<C0186n0, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(C0186n0 c0186n0) {
            return Float.valueOf(c0186n0.f1187y);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void set(C0186n0 c0186n0, Float f) {
            c0186n0.setThumbPosition(f.floatValue());
        }
    }

    public C0186n0(Context context) {
        this(context, null);
    }

    public C0186n0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.switchStyle);
    }

    public C0186n0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1165c = null;
        this.f1166d = null;
        this.f1167e = false;
        this.f1168f = false;
        this.f1170h = null;
        this.f1171i = null;
        this.f1172j = false;
        this.f1173k = false;
        this.f1185w = VelocityTracker.obtain();
        this.f1163M = new Rect();
        this.f1157G = new TextPaint(1);
        Resources resources = getResources();
        this.f1157G.density = resources.getDisplayMetrics().density;
        C0198t0 m1133a = C0198t0.m1133a(context, attributeSet, R$styleable.SwitchCompat, i, 0);
        Drawable m1142b = m1133a.m1142b(R$styleable.SwitchCompat_android_thumb);
        this.f1164b = m1142b;
        if (m1142b != null) {
            m1142b.setCallback(this);
        }
        Drawable m1142b2 = m1133a.m1142b(R$styleable.SwitchCompat_track);
        this.f1169g = m1142b2;
        if (m1142b2 != null) {
            m1142b2.setCallback(this);
        }
        this.f1178p = m1133a.m1148e(R$styleable.SwitchCompat_android_textOn);
        this.f1179q = m1133a.m1148e(R$styleable.SwitchCompat_android_textOff);
        this.f1180r = m1133a.m1139a(R$styleable.SwitchCompat_showText, true);
        this.f1174l = m1133a.m1143c(R$styleable.SwitchCompat_thumbTextPadding, 0);
        this.f1175m = m1133a.m1143c(R$styleable.SwitchCompat_switchMinWidth, 0);
        this.f1176n = m1133a.m1143c(R$styleable.SwitchCompat_switchPadding, 0);
        this.f1177o = m1133a.m1139a(R$styleable.SwitchCompat_splitTrack, false);
        ColorStateList m1136a = m1133a.m1136a(R$styleable.SwitchCompat_thumbTint);
        if (m1136a != null) {
            this.f1165c = m1136a;
            this.f1167e = true;
        }
        PorterDuff.Mode m921a = C0162b0.m921a(m1133a.m1145d(R$styleable.SwitchCompat_thumbTintMode, -1), null);
        if (this.f1166d != m921a) {
            this.f1166d = m921a;
            this.f1168f = true;
        }
        if (this.f1167e || this.f1168f) {
            m1104a();
        }
        ColorStateList m1136a2 = m1133a.m1136a(R$styleable.SwitchCompat_trackTint);
        if (m1136a2 != null) {
            this.f1170h = m1136a2;
            this.f1172j = true;
        }
        PorterDuff.Mode m921a2 = C0162b0.m921a(m1133a.m1145d(R$styleable.SwitchCompat_trackTintMode, -1), null);
        if (this.f1171i != m921a2) {
            this.f1171i = m921a2;
            this.f1173k = true;
        }
        if (this.f1172j || this.f1173k) {
            m1109b();
        }
        int m1151g = m1133a.m1151g(R$styleable.SwitchCompat_switchTextAppearance, 0);
        if (m1151g != 0) {
            m1112a(context, m1151g);
        }
        m1133a.m1138a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1182t = viewConfiguration.getScaledTouchSlop();
        this.f1186x = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: a */
    private static float m1102a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: a */
    private Layout m1103a(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f1161K;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f1157G, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: a */
    private void m1104a() {
        if (this.f1164b != null) {
            if (this.f1167e || this.f1168f) {
                Drawable mutate = this.f1164b.mutate();
                this.f1164b = mutate;
                if (this.f1167e) {
                    C0239a.m1480a(mutate, this.f1165c);
                }
                if (this.f1168f) {
                    C0239a.m1483a(this.f1164b, this.f1166d);
                }
                if (this.f1164b.isStateful()) {
                    this.f1164b.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: a */
    private void m1105a(int i, int i2) {
        m1113a(i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i2);
    }

    /* renamed from: a */
    private void m1106a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    private void m1107a(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1149N, z ? 1.0f : 0.0f);
        this.f1162L = ofFloat;
        ofFloat.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f1162L.setAutoCancel(true);
        }
        this.f1162L.start();
    }

    /* renamed from: a */
    private boolean m1108a(float f, float f2) {
        if (this.f1164b == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1164b.getPadding(this.f1163M);
        int i = this.f1154D;
        int i2 = this.f1182t;
        int i3 = i - i2;
        int i4 = (this.f1153C + thumbOffset) - i2;
        int i5 = this.f1152B + i4;
        Rect rect = this.f1163M;
        return f > ((float) i4) && f < ((float) (((i5 + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.f1156F + i2));
    }

    /* renamed from: b */
    private void m1109b() {
        if (this.f1169g != null) {
            if (this.f1172j || this.f1173k) {
                Drawable mutate = this.f1169g.mutate();
                this.f1169g = mutate;
                if (this.f1172j) {
                    C0239a.m1480a(mutate, this.f1170h);
                }
                if (this.f1173k) {
                    C0239a.m1483a(this.f1169g, this.f1171i);
                }
                if (this.f1169g.isStateful()) {
                    this.f1169g.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: b */
    private void m1110b(MotionEvent motionEvent) {
        this.f1181s = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.f1185w.computeCurrentVelocity(1000);
            float xVelocity = this.f1185w.getXVelocity();
            if (Math.abs(xVelocity) <= this.f1186x) {
                z = getTargetCheckedState();
            } else if (!C0210z0.m1244a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z = false;
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m1106a(motionEvent);
    }

    /* renamed from: c */
    private void m1111c() {
        ObjectAnimator objectAnimator = this.f1162L;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private boolean getTargetCheckedState() {
        return this.f1187y > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C0210z0.m1244a(this) ? 1.0f - this.f1187y : this.f1187y) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1169g;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1163M;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1164b;
        Rect m925d = drawable2 != null ? C0162b0.m925d(drawable2) : C0162b0.f964a;
        return ((((this.f1188z - this.f1152B) - rect.left) - rect.right) - m925d.left) - m925d.right;
    }

    /* renamed from: a */
    public void m1112a(Context context, int i) {
        C0198t0 m1131a = C0198t0.m1131a(context, i, R$styleable.TextAppearance);
        ColorStateList m1136a = m1131a.m1136a(R$styleable.TextAppearance_android_textColor);
        if (m1136a == null) {
            m1136a = getTextColors();
        }
        this.f1158H = m1136a;
        int m1143c = m1131a.m1143c(R$styleable.TextAppearance_android_textSize, 0);
        if (m1143c != 0) {
            float f = m1143c;
            if (f != this.f1157G.getTextSize()) {
                this.f1157G.setTextSize(f);
                requestLayout();
            }
        }
        m1105a(m1131a.m1145d(R$styleable.TextAppearance_android_typeface, -1), m1131a.m1145d(R$styleable.TextAppearance_android_textStyle, -1));
        this.f1161K = m1131a.m1139a(R$styleable.TextAppearance_textAllCaps, false) ? new C2451f(getContext()) : null;
        m1131a.m1138a();
    }

    /* renamed from: a */
    public void m1113a(Typeface typeface, int i) {
        if (i <= 0) {
            this.f1157G.setFakeBoldText(false);
            this.f1157G.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(defaultFromStyle);
            int style = ((defaultFromStyle != null ? defaultFromStyle.getStyle() : 0) ^ (-1)) & i;
            this.f1157G.setFakeBoldText((style & 1) != 0);
            this.f1157G.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f1163M;
        int i3 = this.f1153C;
        int i4 = this.f1154D;
        int i5 = this.f1155E;
        int i6 = this.f1156F;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f1164b;
        Rect m925d = drawable != null ? C0162b0.m925d(drawable) : C0162b0.f964a;
        Drawable drawable2 = this.f1169g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (m925d != null) {
                int i8 = m925d.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = m925d.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = m925d.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = m925d.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f1169g.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1169g.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1164b;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f1152B + rect.right;
            this.f1164b.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0239a.m1479a(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f1164b;
        if (drawable != null) {
            C0239a.m1478a(drawable, f, f2);
        }
        Drawable drawable2 = this.f1169g;
        if (drawable2 != null) {
            C0239a.m1478a(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1164b;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1169g;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!C0210z0.m1244a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1188z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1176n : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C0210z0.m1244a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1188z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1176n : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f1180r;
    }

    public boolean getSplitTrack() {
        return this.f1177o;
    }

    public int getSwitchMinWidth() {
        return this.f1175m;
    }

    public int getSwitchPadding() {
        return this.f1176n;
    }

    public CharSequence getTextOff() {
        return this.f1179q;
    }

    public CharSequence getTextOn() {
        return this.f1178p;
    }

    public Drawable getThumbDrawable() {
        return this.f1164b;
    }

    public int getThumbTextPadding() {
        return this.f1174l;
    }

    public ColorStateList getThumbTintList() {
        return this.f1165c;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1166d;
    }

    public Drawable getTrackDrawable() {
        return this.f1169g;
    }

    public ColorStateList getTrackTintList() {
        return this.f1170h;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1171i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1164b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1169g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1162L;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1162L.end();
        this.f1162L = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f1150O);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f1163M;
        Drawable drawable = this.f1169g;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f1154D;
        int i2 = this.f1156F;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f1164b;
        if (drawable != null) {
            if (!this.f1177o || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect m925d = C0162b0.m925d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m925d.left;
                rect.right -= m925d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f1159I : this.f1160J;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1158H;
            if (colorStateList != null) {
                this.f1157G.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1157G.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f1178p : this.f1179q;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(' ');
        sb.append(charSequence);
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.f1164b != null) {
            Rect rect = this.f1163M;
            Drawable drawable = this.f1169g;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m925d = C0162b0.m925d(this.f1164b);
            i5 = Math.max(0, m925d.left - rect.left);
            i10 = Math.max(0, m925d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0210z0.m1244a(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.f1188z + i6) - i5) - i10;
        } else {
            width = (getWidth() - getPaddingRight()) - i10;
            i6 = (width - this.f1188z) + i5 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i7 = this.f1151A;
            i8 = paddingTop - (i7 / 2);
        } else {
            if (gravity == 80) {
                i9 = getHeight() - getPaddingBottom();
                i8 = i9 - this.f1151A;
                this.f1153C = i6;
                this.f1154D = i8;
                this.f1156F = i9;
                this.f1155E = width;
            }
            i8 = getPaddingTop();
            i7 = this.f1151A;
        }
        i9 = i7 + i8;
        this.f1153C = i6;
        this.f1154D = i8;
        this.f1156F = i9;
        this.f1155E = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f1180r) {
            if (this.f1159I == null) {
                this.f1159I = m1103a(this.f1178p);
            }
            if (this.f1160J == null) {
                this.f1160J = m1103a(this.f1179q);
            }
        }
        Rect rect = this.f1163M;
        Drawable drawable = this.f1164b;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.f1164b.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f1164b.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.f1152B = Math.max(this.f1180r ? Math.max(this.f1159I.getWidth(), this.f1160J.getWidth()) + (this.f1174l * 2) : 0, i3);
        Drawable drawable2 = this.f1169g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f1169g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f1164b;
        if (drawable3 != null) {
            Rect m925d = C0162b0.m925d(drawable3);
            i6 = Math.max(i6, m925d.left);
            i7 = Math.max(i7, m925d.right);
        }
        int max = Math.max(this.f1175m, (this.f1152B * 2) + i6 + i7);
        int max2 = Math.max(i5, i4);
        this.f1188z = max;
        this.f1151A = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1178p : this.f1179q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0 != 3) goto L44;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f1185w
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9f
            r2 = 2
            if (r0 == r1) goto L8b
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L8b
            goto Lb9
        L16:
            int r0 = r6.f1181s
            if (r0 == r1) goto L57
            if (r0 == r2) goto L1e
            goto Lb9
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f1183u
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3d
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L39
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3d
        L39:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3d:
            boolean r0 = androidx.appcompat.widget.C0210z0.m1244a(r6)
            if (r0 == 0) goto L44
            float r2 = -r2
        L44:
            float r0 = r6.f1187y
            float r0 = r0 + r2
            float r0 = m1102a(r0, r4, r3)
            float r2 = r6.f1187y
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L56
            r6.f1183u = r7
            r6.setThumbPosition(r0)
        L56:
            return r1
        L57:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1183u
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1182t
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7d
            float r4 = r6.f1184v
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1182t
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb9
        L7d:
            r6.f1181s = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1183u = r0
            r6.f1184v = r3
            return r1
        L8b:
            int r0 = r6.f1181s
            if (r0 != r2) goto L96
            r6.m1110b(r7)
            super.onTouchEvent(r7)
            return r1
        L96:
            r0 = 0
            r6.f1181s = r0
            android.view.VelocityTracker r0 = r6.f1185w
            r0.clear()
            goto Lb9
        L9f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb9
            boolean r3 = r6.m1108a(r0, r2)
            if (r3 == 0) goto Lb9
            r6.f1181s = r1
            r6.f1183u = r0
            r6.f1184v = r2
        Lb9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0186n0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() != null && C3107q2.m14932x(this)) {
            m1107a(isChecked);
        } else {
            m1111c();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0257i.m1591a(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f1180r != z) {
            this.f1180r = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f1177o = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f1175m = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f1176n = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1157G.getTypeface() == null || this.f1157G.getTypeface().equals(typeface)) && (this.f1157G.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f1157G.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f1179q = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f1178p = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1164b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1164b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f) {
        this.f1187y = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C0000a.m4c(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f1174l = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1165c = colorStateList;
        this.f1167e = true;
        m1104a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1166d = mode;
        this.f1168f = true;
        m1104a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1169g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1169g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C0000a.m4c(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1170h = colorStateList;
        this.f1172j = true;
        m1109b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1171i = mode;
        this.f1173k = true;
        m1109b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1164b || drawable == this.f1169g;
    }
}
