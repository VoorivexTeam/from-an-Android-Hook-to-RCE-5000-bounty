package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0205x;
import androidx.core.widget.C0257i;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import java.util.ArrayList;
import java.util.List;
import p000.C2565ht;
import p000.C2787it;
import p000.C3107q2;
import p000.C3108q3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.b */
/* loaded from: classes.dex */
public final class C2035b {

    /* renamed from: a */
    private final Context f8728a;

    /* renamed from: b */
    private final TextInputLayout f8729b;

    /* renamed from: c */
    private LinearLayout f8730c;

    /* renamed from: d */
    private int f8731d;

    /* renamed from: e */
    private FrameLayout f8732e;

    /* renamed from: f */
    private int f8733f;

    /* renamed from: g */
    private Animator f8734g;

    /* renamed from: h */
    private final float f8735h;

    /* renamed from: i */
    private int f8736i;

    /* renamed from: j */
    private int f8737j;

    /* renamed from: k */
    private CharSequence f8738k;

    /* renamed from: l */
    private boolean f8739l;

    /* renamed from: m */
    private TextView f8740m;

    /* renamed from: n */
    private int f8741n;

    /* renamed from: o */
    private CharSequence f8742o;

    /* renamed from: p */
    private boolean f8743p;

    /* renamed from: q */
    private TextView f8744q;

    /* renamed from: r */
    private int f8745r;

    /* renamed from: s */
    private Typeface f8746s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.b$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f8747a;

        /* renamed from: b */
        final /* synthetic */ TextView f8748b;

        /* renamed from: c */
        final /* synthetic */ int f8749c;

        /* renamed from: d */
        final /* synthetic */ TextView f8750d;

        a(int i, TextView textView, int i2, TextView textView2) {
            this.f8747a = i;
            this.f8748b = textView;
            this.f8749c = i2;
            this.f8750d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2035b.this.f8736i = this.f8747a;
            C2035b.this.f8734g = null;
            TextView textView = this.f8748b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f8749c != 1 || C2035b.this.f8740m == null) {
                    return;
                }
                C2035b.this.f8740m.setText((CharSequence) null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f8750d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C2035b(TextInputLayout textInputLayout) {
        this.f8728a = textInputLayout.getContext();
        this.f8729b = textInputLayout;
        this.f8735h = r0.getResources().getDimensionPixelSize(R$dimen.design_textinput_caption_translate_y);
    }

    /* renamed from: a */
    private ObjectAnimator m10418a(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f8735h, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(C2565ht.f10512d);
        return ofFloat;
    }

    /* renamed from: a */
    private ObjectAnimator m10419a(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(C2565ht.f10509a);
        return ofFloat;
    }

    /* renamed from: a */
    private void m10421a(int i, int i2) {
        TextView m10427d;
        TextView m10427d2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (m10427d2 = m10427d(i2)) != null) {
            m10427d2.setVisibility(0);
            m10427d2.setAlpha(1.0f);
        }
        if (i != 0 && (m10427d = m10427d(i)) != null) {
            m10427d.setVisibility(4);
            if (i == 1) {
                m10427d.setText((CharSequence) null);
            }
        }
        this.f8736i = i2;
    }

    /* renamed from: a */
    private void m10422a(int i, int i2, boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f8734g = animatorSet;
            ArrayList arrayList = new ArrayList();
            m10425a(arrayList, this.f8743p, this.f8744q, 2, i, i2);
            m10425a(arrayList, this.f8739l, this.f8740m, 1, i, i2);
            C2787it.m13264a(animatorSet, arrayList);
            animatorSet.addListener(new a(i2, m10427d(i), i, m10427d(i2)));
            animatorSet.start();
        } else {
            m10421a(i, i2);
        }
        this.f8729b.m10404c();
        this.f8729b.m10402b(z);
        this.f8729b.m10405d();
    }

    /* renamed from: a */
    private void m10423a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m10424a(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: a */
    private void m10425a(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            list.add(m10419a(textView, i3 == i));
            if (i3 == i) {
                list.add(m10418a(textView));
            }
        }
    }

    /* renamed from: a */
    private boolean m10426a(TextView textView, CharSequence charSequence) {
        return C3107q2.m14932x(this.f8729b) && this.f8729b.isEnabled() && !(this.f8737j == this.f8736i && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: d */
    private TextView m10427d(int i) {
        if (i == 1) {
            return this.f8740m;
        }
        if (i != 2) {
            return null;
        }
        return this.f8744q;
    }

    /* renamed from: e */
    private boolean m10428e(int i) {
        return (i != 1 || this.f8740m == null || TextUtils.isEmpty(this.f8738k)) ? false : true;
    }

    /* renamed from: m */
    private boolean m10429m() {
        return (this.f8730c == null || this.f8729b.getEditText() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10430a() {
        if (m10429m()) {
            C3107q2.m14887a(this.f8730c, C3107q2.m14923o(this.f8729b.getEditText()), 0, C3107q2.m14922n(this.f8729b.getEditText()), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10431a(ColorStateList colorStateList) {
        TextView textView = this.f8740m;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10432a(Typeface typeface) {
        if (typeface != this.f8746s) {
            this.f8746s = typeface;
            m10424a(this.f8740m, typeface);
            m10424a(this.f8744q, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10433a(TextView textView, int i) {
        if (this.f8730c == null && this.f8732e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f8728a);
            this.f8730c = linearLayout;
            linearLayout.setOrientation(0);
            this.f8729b.addView(this.f8730c, -1, -2);
            FrameLayout frameLayout = new FrameLayout(this.f8728a);
            this.f8732e = frameLayout;
            this.f8730c.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.f8730c.addView(new C3108q3(this.f8728a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f8729b.getEditText() != null) {
                m10430a();
            }
        }
        if (m10436a(i)) {
            this.f8732e.setVisibility(0);
            this.f8732e.addView(textView);
            this.f8733f++;
        } else {
            this.f8730c.addView(textView, i);
        }
        this.f8730c.setVisibility(0);
        this.f8731d++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10434a(CharSequence charSequence) {
        m10437b();
        this.f8738k = charSequence;
        this.f8740m.setText(charSequence);
        if (this.f8736i != 1) {
            this.f8737j = 1;
        }
        m10422a(this.f8736i, this.f8737j, m10426a(this.f8740m, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10435a(boolean z) {
        if (this.f8739l == z) {
            return;
        }
        m10437b();
        if (z) {
            C0205x c0205x = new C0205x(this.f8728a);
            this.f8740m = c0205x;
            c0205x.setId(R$id.textinput_error);
            Typeface typeface = this.f8746s;
            if (typeface != null) {
                this.f8740m.setTypeface(typeface);
            }
            m10438b(this.f8741n);
            this.f8740m.setVisibility(4);
            C3107q2.m14910e(this.f8740m, 1);
            m10433a(this.f8740m, 0);
        } else {
            m10450i();
            m10440b(this.f8740m, 0);
            this.f8740m = null;
            this.f8729b.m10404c();
            this.f8729b.m10405d();
        }
        this.f8739l = z;
    }

    /* renamed from: a */
    boolean m10436a(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: b */
    void m10437b() {
        Animator animator = this.f8734g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m10438b(int i) {
        this.f8741n = i;
        TextView textView = this.f8740m;
        if (textView != null) {
            this.f8729b.m10399a(textView, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m10439b(ColorStateList colorStateList) {
        TextView textView = this.f8744q;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m10440b(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f8730c == null) {
            return;
        }
        if (!m10436a(i) || (frameLayout = this.f8732e) == null) {
            this.f8730c.removeView(textView);
        } else {
            int i2 = this.f8733f - 1;
            this.f8733f = i2;
            m10423a(frameLayout, i2);
            this.f8732e.removeView(textView);
        }
        int i3 = this.f8731d - 1;
        this.f8731d = i3;
        m10423a(this.f8730c, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m10441b(CharSequence charSequence) {
        m10437b();
        this.f8742o = charSequence;
        this.f8744q.setText(charSequence);
        if (this.f8736i != 2) {
            this.f8737j = 2;
        }
        m10422a(this.f8736i, this.f8737j, m10426a(this.f8744q, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m10442b(boolean z) {
        if (this.f8743p == z) {
            return;
        }
        m10437b();
        if (z) {
            C0205x c0205x = new C0205x(this.f8728a);
            this.f8744q = c0205x;
            c0205x.setId(R$id.textinput_helper_text);
            Typeface typeface = this.f8746s;
            if (typeface != null) {
                this.f8744q.setTypeface(typeface);
            }
            this.f8744q.setVisibility(4);
            C3107q2.m14910e(this.f8744q, 1);
            m10443c(this.f8745r);
            m10433a(this.f8744q, 1);
        } else {
            m10451j();
            m10440b(this.f8744q, 1);
            this.f8744q = null;
            this.f8729b.m10404c();
            this.f8729b.m10405d();
        }
        this.f8743p = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m10443c(int i) {
        this.f8745r = i;
        TextView textView = this.f8744q;
        if (textView != null) {
            C0257i.m1603d(textView, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m10444c() {
        return m10428e(this.f8737j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public CharSequence m10445d() {
        return this.f8738k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m10446e() {
        TextView textView = this.f8740m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList m10447f() {
        TextView textView = this.f8740m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public CharSequence m10448g() {
        return this.f8742o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m10449h() {
        TextView textView = this.f8744q;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m10450i() {
        this.f8738k = null;
        m10437b();
        if (this.f8736i == 1) {
            this.f8737j = (!this.f8743p || TextUtils.isEmpty(this.f8742o)) ? 0 : 2;
        }
        m10422a(this.f8736i, this.f8737j, m10426a(this.f8740m, (CharSequence) null));
    }

    /* renamed from: j */
    void m10451j() {
        m10437b();
        if (this.f8736i == 2) {
            this.f8737j = 0;
        }
        m10422a(this.f8736i, this.f8737j, m10426a(this.f8744q, (CharSequence) null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean m10452k() {
        return this.f8739l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean m10453l() {
        return this.f8743p;
    }
}
