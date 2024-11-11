package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0162b0;
import androidx.appcompat.widget.C0175i;
import androidx.appcompat.widget.C0198t0;
import androidx.appcompat.widget.C0205x;
import androidx.core.content.C0237b;
import androidx.core.graphics.drawable.C0239a;
import androidx.core.widget.C0257i;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.C2003b;
import com.google.android.material.internal.C2004c;
import com.google.android.material.internal.C2005d;
import com.google.android.material.internal.C2008g;
import com.google.android.material.internal.C2009h;
import com.google.android.material.internal.CheckableImageButton;
import p000.C0000a;
import p000.C0448b3;
import p000.C2565ht;
import p000.C3107q2;
import p000.C3508z1;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: A */
    private int f8664A;

    /* renamed from: B */
    private int f8665B;

    /* renamed from: C */
    private Drawable f8666C;

    /* renamed from: D */
    private final Rect f8667D;

    /* renamed from: E */
    private final RectF f8668E;

    /* renamed from: F */
    private Typeface f8669F;

    /* renamed from: G */
    private boolean f8670G;

    /* renamed from: H */
    private Drawable f8671H;

    /* renamed from: I */
    private CharSequence f8672I;

    /* renamed from: J */
    private CheckableImageButton f8673J;

    /* renamed from: K */
    private boolean f8674K;

    /* renamed from: L */
    private Drawable f8675L;

    /* renamed from: M */
    private Drawable f8676M;

    /* renamed from: N */
    private ColorStateList f8677N;

    /* renamed from: O */
    private boolean f8678O;

    /* renamed from: P */
    private PorterDuff.Mode f8679P;

    /* renamed from: Q */
    private boolean f8680Q;

    /* renamed from: R */
    private ColorStateList f8681R;

    /* renamed from: S */
    private ColorStateList f8682S;

    /* renamed from: T */
    private final int f8683T;

    /* renamed from: U */
    private final int f8684U;

    /* renamed from: V */
    private int f8685V;

    /* renamed from: W */
    private final int f8686W;

    /* renamed from: a0 */
    private boolean f8687a0;

    /* renamed from: b */
    private final FrameLayout f8688b;

    /* renamed from: b0 */
    final C2003b f8689b0;

    /* renamed from: c */
    EditText f8690c;

    /* renamed from: c0 */
    private boolean f8691c0;

    /* renamed from: d */
    private CharSequence f8692d;

    /* renamed from: d0 */
    private ValueAnimator f8693d0;

    /* renamed from: e */
    private final C2035b f8694e;

    /* renamed from: e0 */
    private boolean f8695e0;

    /* renamed from: f */
    boolean f8696f;

    /* renamed from: f0 */
    private boolean f8697f0;

    /* renamed from: g */
    private int f8698g;

    /* renamed from: g0 */
    private boolean f8699g0;

    /* renamed from: h */
    private boolean f8700h;

    /* renamed from: i */
    private TextView f8701i;

    /* renamed from: j */
    private final int f8702j;

    /* renamed from: k */
    private final int f8703k;

    /* renamed from: l */
    private boolean f8704l;

    /* renamed from: m */
    private CharSequence f8705m;

    /* renamed from: n */
    private boolean f8706n;

    /* renamed from: o */
    private GradientDrawable f8707o;

    /* renamed from: p */
    private final int f8708p;

    /* renamed from: q */
    private final int f8709q;

    /* renamed from: r */
    private int f8710r;

    /* renamed from: s */
    private final int f8711s;

    /* renamed from: t */
    private float f8712t;

    /* renamed from: u */
    private float f8713u;

    /* renamed from: v */
    private float f8714v;

    /* renamed from: w */
    private float f8715w;

    /* renamed from: x */
    private int f8716x;

    /* renamed from: y */
    private final int f8717y;

    /* renamed from: z */
    private final int f8718z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2029a();

        /* renamed from: d */
        CharSequence f8719d;

        /* renamed from: e */
        boolean f8720e;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        /* loaded from: classes.dex */
        static class C2029a implements Parcelable.ClassLoaderCreator<SavedState> {
            C2029a() {
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

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8719d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f8720e = parcel.readInt() == 1;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f8719d) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f8719d, parcel, i);
            parcel.writeInt(this.f8720e ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    /* loaded from: classes.dex */
    public class C2030a implements TextWatcher {
        C2030a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.m10402b(!r0.f8699g0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f8696f) {
                textInputLayout.m10398a(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2031b implements View.OnClickListener {
        ViewOnClickListenerC2031b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TextInputLayout.this.m10400a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    /* loaded from: classes.dex */
    public class C2032c implements ValueAnimator.AnimatorUpdateListener {
        C2032c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f8689b0.m10244b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    /* loaded from: classes.dex */
    public static class C2033d extends C3508z1 {

        /* renamed from: c */
        private final TextInputLayout f8724c;

        public C2033d(TextInputLayout textInputLayout) {
            this.f8724c = textInputLayout;
        }

        @Override // p000.C3508z1
        /* renamed from: a */
        public void mo1538a(View view, C0448b3 c0448b3) {
            super.mo1538a(view, c0448b3);
            EditText editText = this.f8724c.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f8724c.getHint();
            CharSequence error = this.f8724c.getError();
            CharSequence counterOverflowDescription = this.f8724c.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(error);
            boolean z4 = false;
            boolean z5 = z3 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z) {
                c0448b3.m3293d(text);
            } else if (z2) {
                c0448b3.m3293d(hint);
            }
            if (z2) {
                c0448b3.m3290c(hint);
                if (!z && z2) {
                    z4 = true;
                }
                c0448b3.m3296e(z4);
            }
            if (z5) {
                if (!z3) {
                    error = counterOverflowDescription;
                }
                c0448b3.m3286b(error);
                c0448b3.m3291c(true);
            }
        }

        @Override // p000.C3508z1
        /* renamed from: c */
        public void mo10406c(View view, AccessibilityEvent accessibilityEvent) {
            super.mo10406c(view, accessibilityEvent);
            EditText editText = this.f8724c.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            if (TextUtils.isEmpty(text)) {
                text = this.f8724c.getHint();
            }
            if (TextUtils.isEmpty(text)) {
                return;
            }
            accessibilityEvent.getText().add(text);
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.textInputStyle);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8694e = new C2035b(this);
        this.f8667D = new Rect();
        this.f8668E = new RectF();
        this.f8689b0 = new C2003b(this);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8688b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(this.f8688b);
        this.f8689b0.m10247b(C2565ht.f10509a);
        this.f8689b0.m10236a(C2565ht.f10509a);
        this.f8689b0.m10245b(8388659);
        C0198t0 m10274d = C2008g.m10274d(context, attributeSet, R$styleable.TextInputLayout, i, R$style.Widget_Design_TextInputLayout, new int[0]);
        this.f8704l = m10274d.m1139a(R$styleable.TextInputLayout_hintEnabled, true);
        setHint(m10274d.m1148e(R$styleable.TextInputLayout_android_hint));
        this.f8691c0 = m10274d.m1139a(R$styleable.TextInputLayout_hintAnimationEnabled, true);
        this.f8708p = context.getResources().getDimensionPixelOffset(R$dimen.mtrl_textinput_box_bottom_offset);
        this.f8709q = context.getResources().getDimensionPixelOffset(R$dimen.mtrl_textinput_box_label_cutout_padding);
        this.f8711s = m10274d.m1141b(R$styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f8712t = m10274d.m1134a(R$styleable.TextInputLayout_boxCornerRadiusTopStart, 0.0f);
        this.f8713u = m10274d.m1134a(R$styleable.TextInputLayout_boxCornerRadiusTopEnd, 0.0f);
        this.f8714v = m10274d.m1134a(R$styleable.TextInputLayout_boxCornerRadiusBottomEnd, 0.0f);
        this.f8715w = m10274d.m1134a(R$styleable.TextInputLayout_boxCornerRadiusBottomStart, 0.0f);
        this.f8665B = m10274d.m1135a(R$styleable.TextInputLayout_boxBackgroundColor, 0);
        this.f8685V = m10274d.m1135a(R$styleable.TextInputLayout_boxStrokeColor, 0);
        this.f8717y = context.getResources().getDimensionPixelSize(R$dimen.mtrl_textinput_box_stroke_width_default);
        this.f8718z = context.getResources().getDimensionPixelSize(R$dimen.mtrl_textinput_box_stroke_width_focused);
        this.f8716x = this.f8717y;
        setBoxBackgroundMode(m10274d.m1145d(R$styleable.TextInputLayout_boxBackgroundMode, 0));
        if (m10274d.m1152g(R$styleable.TextInputLayout_android_textColorHint)) {
            ColorStateList m1136a = m10274d.m1136a(R$styleable.TextInputLayout_android_textColorHint);
            this.f8682S = m1136a;
            this.f8681R = m1136a;
        }
        this.f8683T = C0237b.m1458a(context, R$color.mtrl_textinput_default_box_stroke_color);
        this.f8686W = C0237b.m1458a(context, R$color.mtrl_textinput_disabled_color);
        this.f8684U = C0237b.m1458a(context, R$color.mtrl_textinput_hovered_box_stroke_color);
        if (m10274d.m1151g(R$styleable.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(m10274d.m1151g(R$styleable.TextInputLayout_hintTextAppearance, 0));
        }
        int m1151g = m10274d.m1151g(R$styleable.TextInputLayout_errorTextAppearance, 0);
        boolean m1139a = m10274d.m1139a(R$styleable.TextInputLayout_errorEnabled, false);
        int m1151g2 = m10274d.m1151g(R$styleable.TextInputLayout_helperTextTextAppearance, 0);
        boolean m1139a2 = m10274d.m1139a(R$styleable.TextInputLayout_helperTextEnabled, false);
        CharSequence m1148e = m10274d.m1148e(R$styleable.TextInputLayout_helperText);
        boolean m1139a3 = m10274d.m1139a(R$styleable.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(m10274d.m1145d(R$styleable.TextInputLayout_counterMaxLength, -1));
        this.f8703k = m10274d.m1151g(R$styleable.TextInputLayout_counterTextAppearance, 0);
        this.f8702j = m10274d.m1151g(R$styleable.TextInputLayout_counterOverflowTextAppearance, 0);
        this.f8670G = m10274d.m1139a(R$styleable.TextInputLayout_passwordToggleEnabled, false);
        this.f8671H = m10274d.m1142b(R$styleable.TextInputLayout_passwordToggleDrawable);
        this.f8672I = m10274d.m1148e(R$styleable.TextInputLayout_passwordToggleContentDescription);
        if (m10274d.m1152g(R$styleable.TextInputLayout_passwordToggleTint)) {
            this.f8678O = true;
            this.f8677N = m10274d.m1136a(R$styleable.TextInputLayout_passwordToggleTint);
        }
        if (m10274d.m1152g(R$styleable.TextInputLayout_passwordToggleTintMode)) {
            this.f8680Q = true;
            this.f8679P = C2009h.m10275a(m10274d.m1145d(R$styleable.TextInputLayout_passwordToggleTintMode, -1), null);
        }
        m10274d.m1138a();
        setHelperTextEnabled(m1139a2);
        setHelperText(m1148e);
        setHelperTextTextAppearance(m1151g2);
        setErrorEnabled(m1139a);
        setErrorTextAppearance(m1151g);
        setCounterEnabled(m1139a3);
        m10379f();
        C3107q2.m14912f(this, 2);
    }

    /* renamed from: a */
    private void m10372a(RectF rectF) {
        float f = rectF.left;
        int i = this.f8709q;
        rectF.left = f - i;
        rectF.top -= i;
        rectF.right += i;
        rectF.bottom += i;
    }

    /* renamed from: a */
    private static void m10373a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m10373a((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: a */
    private void m10374a(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C2003b c2003b;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f8690c;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f8690c;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean m10444c = this.f8694e.m10444c();
        ColorStateList colorStateList2 = this.f8681R;
        if (colorStateList2 != null) {
            this.f8689b0.m10237a(colorStateList2);
            this.f8689b0.m10248b(this.f8681R);
        }
        if (!isEnabled) {
            this.f8689b0.m10237a(ColorStateList.valueOf(this.f8686W));
            this.f8689b0.m10248b(ColorStateList.valueOf(this.f8686W));
        } else if (m10444c) {
            this.f8689b0.m10237a(this.f8694e.m10447f());
        } else {
            if (this.f8700h && (textView = this.f8701i) != null) {
                c2003b = this.f8689b0;
                colorStateList = textView.getTextColors();
            } else if (z4 && (colorStateList = this.f8682S) != null) {
                c2003b = this.f8689b0;
            }
            c2003b.m10237a(colorStateList);
        }
        if (z3 || (isEnabled() && (z4 || m10444c))) {
            if (z2 || this.f8687a0) {
                m10376c(z);
                return;
            }
            return;
        }
        if (z2 || !this.f8687a0) {
            m10377d(z);
        }
    }

    /* renamed from: c */
    private void m10376c(boolean z) {
        ValueAnimator valueAnimator = this.f8693d0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8693d0.cancel();
        }
        if (z && this.f8691c0) {
            m10396a(1.0f);
        } else {
            this.f8689b0.m10244b(1.0f);
        }
        this.f8687a0 = false;
        if (m10385l()) {
            m10389p();
        }
    }

    /* renamed from: d */
    private void m10377d(boolean z) {
        ValueAnimator valueAnimator = this.f8693d0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8693d0.cancel();
        }
        if (z && this.f8691c0) {
            m10396a(0.0f);
        } else {
            this.f8689b0.m10244b(0.0f);
        }
        if (m10385l() && ((C2034a) this.f8707o).m10414a()) {
            m10384k();
        }
        this.f8687a0 = true;
    }

    /* renamed from: e */
    private void m10378e() {
        int i;
        Drawable drawable;
        if (this.f8707o == null) {
            return;
        }
        m10390q();
        EditText editText = this.f8690c;
        if (editText != null && this.f8710r == 2) {
            if (editText.getBackground() != null) {
                this.f8666C = this.f8690c.getBackground();
            }
            C3107q2.m14891a(this.f8690c, (Drawable) null);
        }
        EditText editText2 = this.f8690c;
        if (editText2 != null && this.f8710r == 1 && (drawable = this.f8666C) != null) {
            C3107q2.m14891a(editText2, drawable);
        }
        int i2 = this.f8716x;
        if (i2 > -1 && (i = this.f8664A) != 0) {
            this.f8707o.setStroke(i2, i);
        }
        this.f8707o.setCornerRadii(getCornerRadiiAsArray());
        this.f8707o.setColor(this.f8665B);
        invalidate();
    }

    /* renamed from: f */
    private void m10379f() {
        if (this.f8671H != null) {
            if (this.f8678O || this.f8680Q) {
                Drawable mutate = C0239a.m1495i(this.f8671H).mutate();
                this.f8671H = mutate;
                if (this.f8678O) {
                    C0239a.m1480a(mutate, this.f8677N);
                }
                if (this.f8680Q) {
                    C0239a.m1483a(this.f8671H, this.f8679P);
                }
                CheckableImageButton checkableImageButton = this.f8673J;
                if (checkableImageButton != null) {
                    Drawable drawable = checkableImageButton.getDrawable();
                    Drawable drawable2 = this.f8671H;
                    if (drawable != drawable2) {
                        this.f8673J.setImageDrawable(drawable2);
                    }
                }
            }
        }
    }

    /* renamed from: g */
    private void m10380g() {
        GradientDrawable gradientDrawable;
        int i = this.f8710r;
        if (i == 0) {
            gradientDrawable = null;
        } else if (i == 2 && this.f8704l && !(this.f8707o instanceof C2034a)) {
            gradientDrawable = new C2034a();
        } else if (this.f8707o instanceof GradientDrawable) {
            return;
        } else {
            gradientDrawable = new GradientDrawable();
        }
        this.f8707o = gradientDrawable;
    }

    private Drawable getBoxBackground() {
        int i = this.f8710r;
        if (i == 1 || i == 2) {
            return this.f8707o;
        }
        throw new IllegalStateException();
    }

    private float[] getCornerRadiiAsArray() {
        if (C2009h.m10276a(this)) {
            float f = this.f8713u;
            float f2 = this.f8712t;
            float f3 = this.f8715w;
            float f4 = this.f8714v;
            return new float[]{f, f, f2, f2, f3, f3, f4, f4};
        }
        float f5 = this.f8712t;
        float f6 = this.f8713u;
        float f7 = this.f8714v;
        float f8 = this.f8715w;
        return new float[]{f5, f5, f6, f6, f7, f7, f8, f8};
    }

    /* renamed from: h */
    private int m10381h() {
        EditText editText = this.f8690c;
        if (editText == null) {
            return 0;
        }
        int i = this.f8710r;
        if (i == 1) {
            return editText.getTop();
        }
        if (i != 2) {
            return 0;
        }
        return editText.getTop() + m10383j();
    }

    /* renamed from: i */
    private int m10382i() {
        int i = this.f8710r;
        return i != 1 ? i != 2 ? getPaddingTop() : getBoxBackground().getBounds().top - m10383j() : getBoxBackground().getBounds().top + this.f8711s;
    }

    /* renamed from: j */
    private int m10383j() {
        float m10249c;
        if (!this.f8704l) {
            return 0;
        }
        int i = this.f8710r;
        if (i == 0 || i == 1) {
            m10249c = this.f8689b0.m10249c();
        } else {
            if (i != 2) {
                return 0;
            }
            m10249c = this.f8689b0.m10249c() / 2.0f;
        }
        return (int) m10249c;
    }

    /* renamed from: k */
    private void m10384k() {
        if (m10385l()) {
            ((C2034a) this.f8707o).m10415b();
        }
    }

    /* renamed from: l */
    private boolean m10385l() {
        return this.f8704l && !TextUtils.isEmpty(this.f8705m) && (this.f8707o instanceof C2034a);
    }

    /* renamed from: m */
    private void m10386m() {
        Drawable background;
        int i = Build.VERSION.SDK_INT;
        if ((i != 21 && i != 22) || (background = this.f8690c.getBackground()) == null || this.f8695e0) {
            return;
        }
        Drawable newDrawable = background.getConstantState().newDrawable();
        if (background instanceof DrawableContainer) {
            this.f8695e0 = C2005d.m10259a((DrawableContainer) background, newDrawable.getConstantState());
        }
        if (this.f8695e0) {
            return;
        }
        C3107q2.m14891a(this.f8690c, newDrawable);
        this.f8695e0 = true;
        m10388o();
    }

    /* renamed from: n */
    private boolean m10387n() {
        EditText editText = this.f8690c;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: o */
    private void m10388o() {
        m10380g();
        if (this.f8710r != 0) {
            m10393t();
        }
        m10395v();
    }

    /* renamed from: p */
    private void m10389p() {
        if (m10385l()) {
            RectF rectF = this.f8668E;
            this.f8689b0.m10239a(rectF);
            m10372a(rectF);
            ((C2034a) this.f8707o).m10413a(rectF);
        }
    }

    /* renamed from: q */
    private void m10390q() {
        int i = this.f8710r;
        if (i == 1) {
            this.f8716x = 0;
        } else if (i == 2 && this.f8685V == 0) {
            this.f8685V = this.f8682S.getColorForState(getDrawableState(), this.f8682S.getDefaultColor());
        }
    }

    /* renamed from: r */
    private boolean m10391r() {
        return this.f8670G && (m10387n() || this.f8674K);
    }

    /* renamed from: s */
    private void m10392s() {
        Drawable background;
        EditText editText = this.f8690c;
        if (editText == null || (background = editText.getBackground()) == null) {
            return;
        }
        if (C0162b0.m922a(background)) {
            background = background.mutate();
        }
        C2004c.m10256a(this, this.f8690c, new Rect());
        Rect bounds = background.getBounds();
        if (bounds.left != bounds.right) {
            Rect rect = new Rect();
            background.getPadding(rect);
            background.setBounds(bounds.left - rect.left, bounds.top, bounds.right + (rect.right * 2), this.f8690c.getBottom());
        }
    }

    private void setEditText(EditText editText) {
        if (this.f8690c != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        boolean z = editText instanceof C2036c;
        this.f8690c = editText;
        m10388o();
        setTextInputAccessibilityDelegate(new C2033d(this));
        if (!m10387n()) {
            this.f8689b0.m10240a(this.f8690c.getTypeface());
        }
        this.f8689b0.m10233a(this.f8690c.getTextSize());
        int gravity = this.f8690c.getGravity();
        this.f8689b0.m10245b((gravity & (-113)) | 48);
        this.f8689b0.m10250c(gravity);
        this.f8690c.addTextChangedListener(new C2030a());
        if (this.f8681R == null) {
            this.f8681R = this.f8690c.getHintTextColors();
        }
        if (this.f8704l) {
            if (TextUtils.isEmpty(this.f8705m)) {
                CharSequence hint = this.f8690c.getHint();
                this.f8692d = hint;
                setHint(hint);
                this.f8690c.setHint((CharSequence) null);
            }
            this.f8706n = true;
        }
        if (this.f8701i != null) {
            m10398a(this.f8690c.getText().length());
        }
        this.f8694e.m10430a();
        m10394u();
        m10374a(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f8705m)) {
            return;
        }
        this.f8705m = charSequence;
        this.f8689b0.m10241a(charSequence);
        if (this.f8687a0) {
            return;
        }
        m10389p();
    }

    /* renamed from: t */
    private void m10393t() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8688b.getLayoutParams();
        int m10383j = m10383j();
        if (m10383j != layoutParams.topMargin) {
            layoutParams.topMargin = m10383j;
            this.f8688b.requestLayout();
        }
    }

    /* renamed from: u */
    private void m10394u() {
        if (this.f8690c == null) {
            return;
        }
        if (!m10391r()) {
            CheckableImageButton checkableImageButton = this.f8673J;
            if (checkableImageButton != null && checkableImageButton.getVisibility() == 0) {
                this.f8673J.setVisibility(8);
            }
            if (this.f8675L != null) {
                Drawable[] m1597a = C0257i.m1597a(this.f8690c);
                if (m1597a[2] == this.f8675L) {
                    C0257i.m1594a(this.f8690c, m1597a[0], m1597a[1], this.f8676M, m1597a[3]);
                    this.f8675L = null;
                    return;
                }
                return;
            }
            return;
        }
        if (this.f8673J == null) {
            CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R$layout.design_text_input_password_icon, (ViewGroup) this.f8688b, false);
            this.f8673J = checkableImageButton2;
            checkableImageButton2.setImageDrawable(this.f8671H);
            this.f8673J.setContentDescription(this.f8672I);
            this.f8688b.addView(this.f8673J);
            this.f8673J.setOnClickListener(new ViewOnClickListenerC2031b());
        }
        EditText editText = this.f8690c;
        if (editText != null && C3107q2.m14920l(editText) <= 0) {
            this.f8690c.setMinimumHeight(C3107q2.m14920l(this.f8673J));
        }
        this.f8673J.setVisibility(0);
        this.f8673J.setChecked(this.f8674K);
        if (this.f8675L == null) {
            this.f8675L = new ColorDrawable();
        }
        this.f8675L.setBounds(0, 0, this.f8673J.getMeasuredWidth(), 1);
        Drawable[] m1597a2 = C0257i.m1597a(this.f8690c);
        if (m1597a2[2] != this.f8675L) {
            this.f8676M = m1597a2[2];
        }
        C0257i.m1594a(this.f8690c, m1597a2[0], m1597a2[1], this.f8675L, m1597a2[3]);
        this.f8673J.setPadding(this.f8690c.getPaddingLeft(), this.f8690c.getPaddingTop(), this.f8690c.getPaddingRight(), this.f8690c.getPaddingBottom());
    }

    /* renamed from: v */
    private void m10395v() {
        if (this.f8710r == 0 || this.f8707o == null || this.f8690c == null || getRight() == 0) {
            return;
        }
        int left = this.f8690c.getLeft();
        int m10381h = m10381h();
        int right = this.f8690c.getRight();
        int bottom = this.f8690c.getBottom() + this.f8708p;
        if (this.f8710r == 2) {
            int i = this.f8718z;
            left += i / 2;
            m10381h -= i / 2;
            right -= i / 2;
            bottom += i / 2;
        }
        this.f8707o.setBounds(left, m10381h, right, bottom);
        m10378e();
        m10392s();
    }

    /* renamed from: a */
    void m10396a(float f) {
        if (this.f8689b0.m10252e() == f) {
            return;
        }
        if (this.f8693d0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f8693d0 = valueAnimator;
            valueAnimator.setInterpolator(C2565ht.f10510b);
            this.f8693d0.setDuration(167L);
            this.f8693d0.addUpdateListener(new C2032c());
        }
        this.f8693d0.setFloatValues(this.f8689b0.m10252e(), f);
        this.f8693d0.start();
    }

    /* renamed from: a */
    public void m10397a(float f, float f2, float f3, float f4) {
        if (this.f8712t == f && this.f8713u == f2 && this.f8714v == f4 && this.f8715w == f3) {
            return;
        }
        this.f8712t = f;
        this.f8713u = f2;
        this.f8714v = f4;
        this.f8715w = f3;
        m10378e();
    }

    /* renamed from: a */
    void m10398a(int i) {
        boolean z = this.f8700h;
        if (this.f8698g == -1) {
            this.f8701i.setText(String.valueOf(i));
            this.f8701i.setContentDescription(null);
            this.f8700h = false;
        } else {
            if (C3107q2.m14900b(this.f8701i) == 1) {
                C3107q2.m14910e(this.f8701i, 0);
            }
            boolean z2 = i > this.f8698g;
            this.f8700h = z2;
            if (z != z2) {
                m10399a(this.f8701i, z2 ? this.f8702j : this.f8703k);
                if (this.f8700h) {
                    C3107q2.m14910e(this.f8701i, 1);
                }
            }
            this.f8701i.setText(getContext().getString(R$string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f8698g)));
            this.f8701i.setContentDescription(getContext().getString(R$string.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(this.f8698g)));
        }
        if (this.f8690c == null || z == this.f8700h) {
            return;
        }
        m10402b(false);
        m10405d();
        m10404c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L11;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m10399a(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.C0257i.m1603d(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = com.google.android.material.R$style.TextAppearance_AppCompat_Caption
            androidx.core.widget.C0257i.m1603d(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = com.google.android.material.R$color.design_error
            int r4 = androidx.core.content.C0237b.m1458a(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m10399a(android.widget.TextView, int):void");
    }

    /* renamed from: a */
    public void m10400a(boolean z) {
        boolean z2;
        if (this.f8670G) {
            int selectionEnd = this.f8690c.getSelectionEnd();
            if (m10387n()) {
                this.f8690c.setTransformationMethod(null);
                z2 = true;
            } else {
                this.f8690c.setTransformationMethod(PasswordTransformationMethod.getInstance());
                z2 = false;
            }
            this.f8674K = z2;
            this.f8673J.setChecked(this.f8674K);
            if (z) {
                this.f8673J.jumpDrawablesToCurrentState();
            }
            this.f8690c.setSelection(selectionEnd);
        }
    }

    /* renamed from: a */
    public boolean m10401a() {
        return this.f8694e.m10453l();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f8688b.addView(view, layoutParams2);
        this.f8688b.setLayoutParams(layoutParams);
        m10393t();
        setEditText((EditText) view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m10402b(boolean z) {
        m10374a(z, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m10403b() {
        return this.f8706n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m10404c() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f8690c;
        if (editText == null || (background = editText.getBackground()) == null) {
            return;
        }
        m10386m();
        if (C0162b0.m922a(background)) {
            background = background.mutate();
        }
        if (this.f8694e.m10444c()) {
            currentTextColor = this.f8694e.m10446e();
        } else {
            if (!this.f8700h || (textView = this.f8701i) == null) {
                C0239a.m1487b(background);
                this.f8690c.refreshDrawableState();
                return;
            }
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(C0175i.m1016a(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m10405d() {
        TextView textView;
        if (this.f8707o == null || this.f8710r == 0) {
            return;
        }
        EditText editText = this.f8690c;
        boolean z = editText != null && editText.hasFocus();
        EditText editText2 = this.f8690c;
        boolean z2 = editText2 != null && editText2.isHovered();
        if (this.f8710r == 2) {
            this.f8664A = !isEnabled() ? this.f8686W : this.f8694e.m10444c() ? this.f8694e.m10446e() : (!this.f8700h || (textView = this.f8701i) == null) ? z ? this.f8685V : z2 ? this.f8684U : this.f8683T : textView.getCurrentTextColor();
            this.f8716x = ((z2 || z) && isEnabled()) ? this.f8718z : this.f8717y;
            m10378e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.f8692d == null || (editText = this.f8690c) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.f8706n;
        this.f8706n = false;
        CharSequence hint = editText.getHint();
        this.f8690c.setHint(this.f8692d);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f8690c.setHint(hint);
            this.f8706n = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f8699g0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f8699g0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        GradientDrawable gradientDrawable = this.f8707o;
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        super.draw(canvas);
        if (this.f8704l) {
            this.f8689b0.m10238a(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f8697f0) {
            return;
        }
        this.f8697f0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        m10402b(C3107q2.m14932x(this) && isEnabled());
        m10404c();
        m10395v();
        m10405d();
        C2003b c2003b = this.f8689b0;
        if (c2003b != null ? c2003b.m10242a(drawableState) | false : false) {
            invalidate();
        }
        this.f8697f0 = false;
    }

    public int getBoxBackgroundColor() {
        return this.f8665B;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f8714v;
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f8715w;
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f8713u;
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f8712t;
    }

    public int getBoxStrokeColor() {
        return this.f8685V;
    }

    public int getCounterMaxLength() {
        return this.f8698g;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f8696f && this.f8700h && (textView = this.f8701i) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f8681R;
    }

    public EditText getEditText() {
        return this.f8690c;
    }

    public CharSequence getError() {
        if (this.f8694e.m10452k()) {
            return this.f8694e.m10445d();
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        return this.f8694e.m10446e();
    }

    final int getErrorTextCurrentColor() {
        return this.f8694e.m10446e();
    }

    public CharSequence getHelperText() {
        if (this.f8694e.m10453l()) {
            return this.f8694e.m10448g();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f8694e.m10449h();
    }

    public CharSequence getHint() {
        if (this.f8704l) {
            return this.f8705m;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f8689b0.m10249c();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f8689b0.m10251d();
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f8672I;
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f8671H;
    }

    public Typeface getTypeface() {
        return this.f8669F;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        EditText editText;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f8707o != null) {
            m10395v();
        }
        if (!this.f8704l || (editText = this.f8690c) == null) {
            return;
        }
        Rect rect = this.f8667D;
        C2004c.m10256a(this, editText, rect);
        int compoundPaddingLeft = rect.left + this.f8690c.getCompoundPaddingLeft();
        int compoundPaddingRight = rect.right - this.f8690c.getCompoundPaddingRight();
        int m10382i = m10382i();
        this.f8689b0.m10246b(compoundPaddingLeft, rect.top + this.f8690c.getCompoundPaddingTop(), compoundPaddingRight, rect.bottom - this.f8690c.getCompoundPaddingBottom());
        this.f8689b0.m10235a(compoundPaddingLeft, m10382i, compoundPaddingRight, (i4 - i2) - getPaddingBottom());
        this.f8689b0.m10255h();
        if (!m10385l() || this.f8687a0) {
            return;
        }
        m10389p();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        m10394u();
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m1612a());
        setError(savedState.f8719d);
        if (savedState.f8720e) {
            m10400a(true);
        }
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f8694e.m10444c()) {
            savedState.f8719d = getError();
        }
        savedState.f8720e = this.f8674K;
        return savedState;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f8665B != i) {
            this.f8665B = i;
            m10378e();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0237b.m1458a(getContext(), i));
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f8710r) {
            return;
        }
        this.f8710r = i;
        m10388o();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f8685V != i) {
            this.f8685V = i;
            m10405d();
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.f8696f != z) {
            if (z) {
                C0205x c0205x = new C0205x(getContext());
                this.f8701i = c0205x;
                c0205x.setId(R$id.textinput_counter);
                Typeface typeface = this.f8669F;
                if (typeface != null) {
                    this.f8701i.setTypeface(typeface);
                }
                this.f8701i.setMaxLines(1);
                m10399a(this.f8701i, this.f8703k);
                this.f8694e.m10433a(this.f8701i, 2);
                EditText editText = this.f8690c;
                m10398a(editText == null ? 0 : editText.getText().length());
            } else {
                this.f8694e.m10440b(this.f8701i, 2);
                this.f8701i = null;
            }
            this.f8696f = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f8698g != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f8698g = i;
            if (this.f8696f) {
                EditText editText = this.f8690c;
                m10398a(editText == null ? 0 : editText.getText().length());
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f8681R = colorStateList;
        this.f8682S = colorStateList;
        if (this.f8690c != null) {
            m10402b(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m10373a(this, z);
        super.setEnabled(z);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f8694e.m10452k()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f8694e.m10450i();
        } else {
            this.f8694e.m10434a(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        this.f8694e.m10435a(z);
    }

    public void setErrorTextAppearance(int i) {
        this.f8694e.m10438b(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f8694e.m10431a(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (m10401a()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!m10401a()) {
                setHelperTextEnabled(true);
            }
            this.f8694e.m10441b(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f8694e.m10439b(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f8694e.m10442b(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f8694e.m10443c(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f8704l) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f8691c0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f8704l) {
            this.f8704l = z;
            if (z) {
                CharSequence hint = this.f8690c.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f8705m)) {
                        setHint(hint);
                    }
                    this.f8690c.setHint((CharSequence) null);
                }
                this.f8706n = true;
            } else {
                this.f8706n = false;
                if (!TextUtils.isEmpty(this.f8705m) && TextUtils.isEmpty(this.f8690c.getHint())) {
                    this.f8690c.setHint(this.f8705m);
                }
                setHintInternal(null);
            }
            if (this.f8690c != null) {
                m10393t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f8689b0.m10234a(i);
        this.f8682S = this.f8689b0.m10243b();
        if (this.f8690c != null) {
            m10402b(false);
            m10393t();
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f8672I = charSequence;
        CheckableImageButton checkableImageButton = this.f8673J;
        if (checkableImageButton != null) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C0000a.m4c(getContext(), i) : null);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f8671H = drawable;
        CheckableImageButton checkableImageButton = this.f8673J;
        if (checkableImageButton != null) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        EditText editText;
        if (this.f8670G != z) {
            this.f8670G = z;
            if (!z && this.f8674K && (editText = this.f8690c) != null) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f8674K = false;
            m10394u();
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f8677N = colorStateList;
        this.f8678O = true;
        m10379f();
    }

    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f8679P = mode;
        this.f8680Q = true;
        m10379f();
    }

    public void setTextInputAccessibilityDelegate(C2033d c2033d) {
        EditText editText = this.f8690c;
        if (editText != null) {
            C3107q2.m14897a(editText, c2033d);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f8669F) {
            this.f8669F = typeface;
            this.f8689b0.m10240a(typeface);
            this.f8694e.m10432a(typeface);
            TextView textView = this.f8701i;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }
}
