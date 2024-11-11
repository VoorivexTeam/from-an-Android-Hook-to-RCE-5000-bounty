package p000;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* renamed from: m1 */
/* loaded from: classes.dex */
public class C2918m1 implements Spannable {

    /* renamed from: b */
    private final Spannable f11988b;

    /* renamed from: c */
    private final a f11989c;

    /* renamed from: d */
    private final PrecomputedText f11990d;

    /* renamed from: m1$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final TextPaint f11991a;

        /* renamed from: b */
        private final TextDirectionHeuristic f11992b;

        /* renamed from: c */
        private final int f11993c;

        /* renamed from: d */
        private final int f11994d;

        /* renamed from: e */
        final PrecomputedText.Params f11995e;

        /* renamed from: m1$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C3573a {

            /* renamed from: a */
            private final TextPaint f11996a;

            /* renamed from: b */
            private TextDirectionHeuristic f11997b;

            /* renamed from: c */
            private int f11998c;

            /* renamed from: d */
            private int f11999d;

            public C3573a(TextPaint textPaint) {
                this.f11996a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f11998c = 1;
                    this.f11999d = 1;
                } else {
                    this.f11999d = 0;
                    this.f11998c = 0;
                }
                this.f11997b = Build.VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            /* renamed from: a */
            public C3573a m13989a(int i) {
                this.f11998c = i;
                return this;
            }

            /* renamed from: a */
            public C3573a m13990a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f11997b = textDirectionHeuristic;
                return this;
            }

            /* renamed from: a */
            public a m13991a() {
                return new a(this.f11996a, this.f11997b, this.f11998c, this.f11999d);
            }

            /* renamed from: b */
            public C3573a m13992b(int i) {
                this.f11999d = i;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f11991a = params.getTextPaint();
            this.f11992b = params.getTextDirection();
            this.f11993c = params.getBreakStrategy();
            this.f11994d = params.getHyphenationFrequency();
            this.f11995e = params;
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f11995e = Build.VERSION.SDK_INT >= 28 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build() : null;
            this.f11991a = textPaint;
            this.f11992b = textDirectionHeuristic;
            this.f11993c = i;
            this.f11994d = i2;
        }

        /* renamed from: a */
        public int m13985a() {
            return this.f11993c;
        }

        /* renamed from: b */
        public int m13986b() {
            return this.f11994d;
        }

        /* renamed from: c */
        public TextDirectionHeuristic m13987c() {
            return this.f11992b;
        }

        /* renamed from: d */
        public TextPaint m13988d() {
            return this.f11991a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            PrecomputedText.Params params = this.f11995e;
            if (params != null) {
                return params.equals(aVar.f11995e);
            }
            if (Build.VERSION.SDK_INT >= 23 && (this.f11993c != aVar.m13985a() || this.f11994d != aVar.m13986b())) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 18 && this.f11992b != aVar.m13987c()) || this.f11991a.getTextSize() != aVar.m13988d().getTextSize() || this.f11991a.getTextScaleX() != aVar.m13988d().getTextScaleX() || this.f11991a.getTextSkewX() != aVar.m13988d().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f11991a.getLetterSpacing() != aVar.m13988d().getLetterSpacing() || !TextUtils.equals(this.f11991a.getFontFeatureSettings(), aVar.m13988d().getFontFeatureSettings()))) || this.f11991a.getFlags() != aVar.m13988d().getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f11991a.getTextLocales().equals(aVar.m13988d().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f11991a.getTextLocale().equals(aVar.m13988d().getTextLocale())) {
                return false;
            }
            if (this.f11991a.getTypeface() == null) {
                if (aVar.m13988d().getTypeface() != null) {
                    return false;
                }
            } else if (!this.f11991a.getTypeface().equals(aVar.m13988d().getTypeface())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C3187s1.m15318a(Float.valueOf(this.f11991a.getTextSize()), Float.valueOf(this.f11991a.getTextScaleX()), Float.valueOf(this.f11991a.getTextSkewX()), Float.valueOf(this.f11991a.getLetterSpacing()), Integer.valueOf(this.f11991a.getFlags()), this.f11991a.getTextLocales(), this.f11991a.getTypeface(), Boolean.valueOf(this.f11991a.isElegantTextHeight()), this.f11992b, Integer.valueOf(this.f11993c), Integer.valueOf(this.f11994d));
            }
            if (i >= 21) {
                return C3187s1.m15318a(Float.valueOf(this.f11991a.getTextSize()), Float.valueOf(this.f11991a.getTextScaleX()), Float.valueOf(this.f11991a.getTextSkewX()), Float.valueOf(this.f11991a.getLetterSpacing()), Integer.valueOf(this.f11991a.getFlags()), this.f11991a.getTextLocale(), this.f11991a.getTypeface(), Boolean.valueOf(this.f11991a.isElegantTextHeight()), this.f11992b, Integer.valueOf(this.f11993c), Integer.valueOf(this.f11994d));
            }
            if (i < 18 && i < 17) {
                return C3187s1.m15318a(Float.valueOf(this.f11991a.getTextSize()), Float.valueOf(this.f11991a.getTextScaleX()), Float.valueOf(this.f11991a.getTextSkewX()), Integer.valueOf(this.f11991a.getFlags()), this.f11991a.getTypeface(), this.f11992b, Integer.valueOf(this.f11993c), Integer.valueOf(this.f11994d));
            }
            return C3187s1.m15318a(Float.valueOf(this.f11991a.getTextSize()), Float.valueOf(this.f11991a.getTextScaleX()), Float.valueOf(this.f11991a.getTextSkewX()), Integer.valueOf(this.f11991a.getFlags()), this.f11991a.getTextLocale(), this.f11991a.getTypeface(), this.f11992b, Integer.valueOf(this.f11993c), Integer.valueOf(this.f11994d));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00e3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 329
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C2918m1.a.toString():java.lang.String");
        }
    }

    /* renamed from: a */
    public a m13983a() {
        return this.f11989c;
    }

    /* renamed from: b */
    public PrecomputedText m13984b() {
        Spannable spannable = this.f11988b;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f11988b.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f11988b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f11988b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f11988b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 28 ? (T[]) this.f11990d.getSpans(i, i2, cls) : (T[]) this.f11988b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f11988b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f11988b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.f11990d.removeSpan(obj);
        } else {
            this.f11988b.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.f11990d.setSpan(obj, i, i2, i3);
        } else {
            this.f11988b.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f11988b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f11988b.toString();
    }
}
