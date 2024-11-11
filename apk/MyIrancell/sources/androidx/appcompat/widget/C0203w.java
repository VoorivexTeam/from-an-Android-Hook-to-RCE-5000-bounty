package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import androidx.core.widget.C0257i;
import androidx.core.widget.InterfaceC0250b;
import java.lang.ref.WeakReference;
import p000.C3066p0;

/* renamed from: androidx.appcompat.widget.w */
/* loaded from: classes.dex */
class C0203w {

    /* renamed from: a */
    private final TextView f1269a;

    /* renamed from: b */
    private C0194r0 f1270b;

    /* renamed from: c */
    private C0194r0 f1271c;

    /* renamed from: d */
    private C0194r0 f1272d;

    /* renamed from: e */
    private C0194r0 f1273e;

    /* renamed from: f */
    private C0194r0 f1274f;

    /* renamed from: g */
    private C0194r0 f1275g;

    /* renamed from: h */
    private final C0207y f1276h;

    /* renamed from: i */
    private int f1277i = 0;

    /* renamed from: j */
    private Typeface f1278j;

    /* renamed from: k */
    private boolean f1279k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.w$a */
    /* loaded from: classes.dex */
    public class a extends C3066p0.a {

        /* renamed from: a */
        final /* synthetic */ WeakReference f1280a;

        a(WeakReference weakReference) {
            this.f1280a = weakReference;
        }

        @Override // p000.C3066p0.a
        /* renamed from: a */
        public void mo1198a(int i) {
        }

        @Override // p000.C3066p0.a
        /* renamed from: a */
        public void mo1199a(Typeface typeface) {
            C0203w.this.m1187a(this.f1280a, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0203w(TextView textView) {
        this.f1269a = textView;
        this.f1276h = new C0207y(this.f1269a);
    }

    /* renamed from: a */
    private static C0194r0 m1177a(Context context, C0175i c0175i, int i) {
        ColorStateList m1043b = c0175i.m1043b(context, i);
        if (m1043b == null) {
            return null;
        }
        C0194r0 c0194r0 = new C0194r0();
        c0194r0.f1213d = true;
        c0194r0.f1210a = m1043b;
        return c0194r0;
    }

    /* renamed from: a */
    private void m1178a(Context context, C0198t0 c0198t0) {
        String m1146d;
        Typeface typeface;
        this.f1277i = c0198t0.m1145d(R$styleable.TextAppearance_android_textStyle, this.f1277i);
        if (c0198t0.m1152g(R$styleable.TextAppearance_android_fontFamily) || c0198t0.m1152g(R$styleable.TextAppearance_fontFamily)) {
            this.f1278j = null;
            int i = c0198t0.m1152g(R$styleable.TextAppearance_fontFamily) ? R$styleable.TextAppearance_fontFamily : R$styleable.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                try {
                    Typeface m1137a = c0198t0.m1137a(i, this.f1277i, new a(new WeakReference(this.f1269a)));
                    this.f1278j = m1137a;
                    this.f1279k = m1137a == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1278j != null || (m1146d = c0198t0.m1146d(i)) == null) {
                return;
            }
            this.f1278j = Typeface.create(m1146d, this.f1277i);
            return;
        }
        if (c0198t0.m1152g(R$styleable.TextAppearance_android_typeface)) {
            this.f1279k = false;
            int m1145d = c0198t0.m1145d(R$styleable.TextAppearance_android_typeface, 1);
            if (m1145d == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (m1145d == 2) {
                typeface = Typeface.SERIF;
            } else if (m1145d != 3) {
                return;
            } else {
                typeface = Typeface.MONOSPACE;
            }
            this.f1278j = typeface;
        }
    }

    /* renamed from: a */
    private void m1179a(Drawable drawable, C0194r0 c0194r0) {
        if (drawable == null || c0194r0 == null) {
            return;
        }
        C0175i.m1023a(drawable, c0194r0, this.f1269a.getDrawableState());
    }

    /* renamed from: b */
    private void m1180b(int i, float f) {
        this.f1276h.m1230a(i, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1181a() {
        if (this.f1270b != null || this.f1271c != null || this.f1272d != null || this.f1273e != null) {
            Drawable[] compoundDrawables = this.f1269a.getCompoundDrawables();
            m1179a(compoundDrawables[0], this.f1270b);
            m1179a(compoundDrawables[1], this.f1271c);
            m1179a(compoundDrawables[2], this.f1272d);
            m1179a(compoundDrawables[3], this.f1273e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f1274f == null && this.f1275g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f1269a.getCompoundDrawablesRelative();
            m1179a(compoundDrawablesRelative[0], this.f1274f);
            m1179a(compoundDrawablesRelative[2], this.f1275g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1182a(int i) {
        this.f1276h.m1229a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1183a(int i, float f) {
        if (InterfaceC0250b.f1550a || m1197h()) {
            return;
        }
        m1180b(i, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1184a(int i, int i2, int i3, int i4) {
        this.f1276h.m1231a(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1185a(Context context, int i) {
        ColorStateList m1136a;
        C0198t0 m1131a = C0198t0.m1131a(context, i, R$styleable.TextAppearance);
        if (m1131a.m1152g(R$styleable.TextAppearance_textAllCaps)) {
            m1188a(m1131a.m1139a(R$styleable.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && m1131a.m1152g(R$styleable.TextAppearance_android_textColor) && (m1136a = m1131a.m1136a(R$styleable.TextAppearance_android_textColor)) != null) {
            this.f1269a.setTextColor(m1136a);
        }
        if (m1131a.m1152g(R$styleable.TextAppearance_android_textSize) && m1131a.m1143c(R$styleable.TextAppearance_android_textSize, -1) == 0) {
            this.f1269a.setTextSize(0, 0.0f);
        }
        m1178a(context, m1131a);
        m1131a.m1138a();
        Typeface typeface = this.f1278j;
        if (typeface != null) {
            this.f1269a.setTypeface(typeface, this.f1277i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void m1186a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        Context context = this.f1269a.getContext();
        C0175i m1020a = C0175i.m1020a();
        C0198t0 m1133a = C0198t0.m1133a(context, attributeSet, R$styleable.AppCompatTextHelper, i, 0);
        int m1151g = m1133a.m1151g(R$styleable.AppCompatTextHelper_android_textAppearance, -1);
        if (m1133a.m1152g(R$styleable.AppCompatTextHelper_android_drawableLeft)) {
            this.f1270b = m1177a(context, m1020a, m1133a.m1151g(R$styleable.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (m1133a.m1152g(R$styleable.AppCompatTextHelper_android_drawableTop)) {
            this.f1271c = m1177a(context, m1020a, m1133a.m1151g(R$styleable.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (m1133a.m1152g(R$styleable.AppCompatTextHelper_android_drawableRight)) {
            this.f1272d = m1177a(context, m1020a, m1133a.m1151g(R$styleable.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (m1133a.m1152g(R$styleable.AppCompatTextHelper_android_drawableBottom)) {
            this.f1273e = m1177a(context, m1020a, m1133a.m1151g(R$styleable.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (m1133a.m1152g(R$styleable.AppCompatTextHelper_android_drawableStart)) {
                this.f1274f = m1177a(context, m1020a, m1133a.m1151g(R$styleable.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (m1133a.m1152g(R$styleable.AppCompatTextHelper_android_drawableEnd)) {
                this.f1275g = m1177a(context, m1020a, m1133a.m1151g(R$styleable.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        m1133a.m1138a();
        boolean z3 = this.f1269a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z4 = true;
        if (m1151g != -1) {
            C0198t0 m1131a = C0198t0.m1131a(context, m1151g, R$styleable.TextAppearance);
            if (z3 || !m1131a.m1152g(R$styleable.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z = m1131a.m1139a(R$styleable.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            m1178a(context, m1131a);
            if (Build.VERSION.SDK_INT < 23) {
                ColorStateList m1136a = m1131a.m1152g(R$styleable.TextAppearance_android_textColor) ? m1131a.m1136a(R$styleable.TextAppearance_android_textColor) : null;
                colorStateList2 = m1131a.m1152g(R$styleable.TextAppearance_android_textColorHint) ? m1131a.m1136a(R$styleable.TextAppearance_android_textColorHint) : null;
                ColorStateList colorStateList3 = m1136a;
                colorStateList = m1131a.m1152g(R$styleable.TextAppearance_android_textColorLink) ? m1131a.m1136a(R$styleable.TextAppearance_android_textColorLink) : null;
                r10 = colorStateList3;
            } else {
                colorStateList = null;
                colorStateList2 = null;
            }
            m1131a.m1138a();
        } else {
            colorStateList = null;
            colorStateList2 = null;
            z = false;
            z2 = false;
        }
        C0198t0 m1133a2 = C0198t0.m1133a(context, attributeSet, R$styleable.TextAppearance, i, 0);
        if (z3 || !m1133a2.m1152g(R$styleable.TextAppearance_textAllCaps)) {
            z4 = z2;
        } else {
            z = m1133a2.m1139a(R$styleable.TextAppearance_textAllCaps, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (m1133a2.m1152g(R$styleable.TextAppearance_android_textColor)) {
                r10 = m1133a2.m1136a(R$styleable.TextAppearance_android_textColor);
            }
            if (m1133a2.m1152g(R$styleable.TextAppearance_android_textColorHint)) {
                colorStateList2 = m1133a2.m1136a(R$styleable.TextAppearance_android_textColorHint);
            }
            if (m1133a2.m1152g(R$styleable.TextAppearance_android_textColorLink)) {
                colorStateList = m1133a2.m1136a(R$styleable.TextAppearance_android_textColorLink);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && m1133a2.m1152g(R$styleable.TextAppearance_android_textSize) && m1133a2.m1143c(R$styleable.TextAppearance_android_textSize, -1) == 0) {
            this.f1269a.setTextSize(0, 0.0f);
        }
        m1178a(context, m1133a2);
        m1133a2.m1138a();
        if (r10 != null) {
            this.f1269a.setTextColor(r10);
        }
        if (colorStateList2 != null) {
            this.f1269a.setHintTextColor(colorStateList2);
        }
        if (colorStateList != null) {
            this.f1269a.setLinkTextColor(colorStateList);
        }
        if (!z3 && z4) {
            m1188a(z);
        }
        Typeface typeface = this.f1278j;
        if (typeface != null) {
            this.f1269a.setTypeface(typeface, this.f1277i);
        }
        this.f1276h.m1232a(attributeSet, i);
        if (InterfaceC0250b.f1550a && this.f1276h.m1238f() != 0) {
            int[] m1237e = this.f1276h.m1237e();
            if (m1237e.length > 0) {
                if (this.f1269a.getAutoSizeStepGranularity() != -1.0f) {
                    this.f1269a.setAutoSizeTextTypeUniformWithConfiguration(this.f1276h.m1235c(), this.f1276h.m1234b(), this.f1276h.m1236d(), 0);
                } else {
                    this.f1269a.setAutoSizeTextTypeUniformWithPresetSizes(m1237e, 0);
                }
            }
        }
        C0198t0 m1132a = C0198t0.m1132a(context, attributeSet, R$styleable.AppCompatTextView);
        int m1143c = m1132a.m1143c(R$styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
        int m1143c2 = m1132a.m1143c(R$styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int m1143c3 = m1132a.m1143c(R$styleable.AppCompatTextView_lineHeight, -1);
        m1132a.m1138a();
        if (m1143c != -1) {
            C0257i.m1593a(this.f1269a, m1143c);
        }
        if (m1143c2 != -1) {
            C0257i.m1599b(this.f1269a, m1143c2);
        }
        if (m1143c3 != -1) {
            C0257i.m1601c(this.f1269a, m1143c3);
        }
    }

    /* renamed from: a */
    void m1187a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1279k) {
            this.f1278j = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f1277i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1188a(boolean z) {
        this.f1269a.setAllCaps(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1189a(boolean z, int i, int i2, int i3, int i4) {
        if (InterfaceC0250b.f1550a) {
            return;
        }
        m1191b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1190a(int[] iArr, int i) {
        this.f1276h.m1233a(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1191b() {
        this.f1276h.m1228a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m1192c() {
        return this.f1276h.m1234b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m1193d() {
        return this.f1276h.m1235c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m1194e() {
        return this.f1276h.m1236d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int[] m1195f() {
        return this.f1276h.m1237e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m1196g() {
        return this.f1276h.m1238f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m1197h() {
        return this.f1276h.m1239g();
    }
}
