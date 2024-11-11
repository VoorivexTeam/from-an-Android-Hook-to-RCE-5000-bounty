package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.y */
/* loaded from: classes.dex */
public class C0207y {

    /* renamed from: k */
    private static final RectF f1305k = new RectF();

    /* renamed from: l */
    private static ConcurrentHashMap<String, Method> f1306l = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1307a = 0;

    /* renamed from: b */
    private boolean f1308b = false;

    /* renamed from: c */
    private float f1309c = -1.0f;

    /* renamed from: d */
    private float f1310d = -1.0f;

    /* renamed from: e */
    private float f1311e = -1.0f;

    /* renamed from: f */
    private int[] f1312f = new int[0];

    /* renamed from: g */
    private boolean f1313g = false;

    /* renamed from: h */
    private TextPaint f1314h;

    /* renamed from: i */
    private final TextView f1315i;

    /* renamed from: j */
    private final Context f1316j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0207y(TextView textView) {
        this.f1315i = textView;
        this.f1316j = textView.getContext();
    }

    /* renamed from: a */
    private int m1214a(RectF rectF) {
        int length = this.f1312f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 1;
        int i3 = 0;
        while (i2 <= i) {
            int i4 = (i2 + i) / 2;
            if (m1222a(this.f1312f[i4], rectF)) {
                int i5 = i4 + 1;
                i3 = i2;
                i2 = i5;
            } else {
                i3 = i4 - 1;
                i = i3;
            }
        }
        return this.f1312f[i3];
    }

    /* renamed from: a */
    private StaticLayout m1215a(CharSequence charSequence, Layout.Alignment alignment, int i) {
        float floatValue;
        float floatValue2;
        boolean booleanValue;
        if (Build.VERSION.SDK_INT >= 16) {
            floatValue = this.f1315i.getLineSpacingMultiplier();
            floatValue2 = this.f1315i.getLineSpacingExtra();
            booleanValue = this.f1315i.getIncludeFontPadding();
        } else {
            floatValue = ((Float) m1217a((Object) this.f1315i, "getLineSpacingMultiplier", (String) Float.valueOf(1.0f))).floatValue();
            floatValue2 = ((Float) m1217a((Object) this.f1315i, "getLineSpacingExtra", (String) Float.valueOf(0.0f))).floatValue();
            booleanValue = ((Boolean) m1217a((Object) this.f1315i, "getIncludeFontPadding", (String) true)).booleanValue();
        }
        return new StaticLayout(charSequence, this.f1314h, i, alignment, floatValue, floatValue2, booleanValue);
    }

    /* renamed from: a */
    private StaticLayout m1216a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m1217a((Object) this.f1315i, "getTextDirectionHeuristic", (String) TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1314h, i).setAlignment(alignment).setLineSpacing(this.f1315i.getLineSpacingExtra(), this.f1315i.getLineSpacingMultiplier()).setIncludePad(this.f1315i.getIncludeFontPadding()).setBreakStrategy(this.f1315i.getBreakStrategy()).setHyphenationFrequency(this.f1315i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    /* renamed from: a */
    private <T> T m1217a(Object obj, String str, T t) {
        try {
            return (T) m1218a(str).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            String str2 = "Failed to invoke TextView#" + str + "() method";
            return t;
        }
    }

    /* renamed from: a */
    private Method m1218a(String str) {
        try {
            Method method = f1306l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1306l.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            String str2 = "Failed to retrieve TextView#" + str + "() method";
            return null;
        }
    }

    /* renamed from: a */
    private void m1219a(float f) {
        if (f != this.f1315i.getPaint().getTextSize()) {
            this.f1315i.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f1315i.isInLayout() : false;
            if (this.f1315i.getLayout() != null) {
                this.f1308b = false;
                try {
                    Method m1218a = m1218a("nullLayouts");
                    if (m1218a != null) {
                        m1218a.invoke(this.f1315i, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (isInLayout) {
                    this.f1315i.forceLayout();
                } else {
                    this.f1315i.requestLayout();
                }
                this.f1315i.invalidate();
            }
        }
    }

    /* renamed from: a */
    private void m1220a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f1307a = 1;
        this.f1310d = f;
        this.f1311e = f2;
        this.f1309c = f3;
        this.f1313g = false;
    }

    /* renamed from: a */
    private void m1221a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1312f = m1223a(iArr);
            m1226j();
        }
    }

    /* renamed from: a */
    private boolean m1222a(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1315i.getText();
        TransformationMethod transformationMethod = this.f1315i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1315i)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f1315i.getMaxLines() : -1;
        TextPaint textPaint = this.f1314h;
        if (textPaint == null) {
            this.f1314h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1314h.set(this.f1315i.getPaint());
        this.f1314h.setTextSize(i);
        Layout.Alignment alignment = (Layout.Alignment) m1217a((Object) this.f1315i, "getLayoutAlignment", (String) Layout.Alignment.ALIGN_NORMAL);
        StaticLayout m1216a = Build.VERSION.SDK_INT >= 23 ? m1216a(text, alignment, Math.round(rectF.right), maxLines) : m1215a(text, alignment, Math.round(rectF.right));
        return (maxLines == -1 || (m1216a.getLineCount() <= maxLines && m1216a.getLineEnd(m1216a.getLineCount() - 1) == text.length())) && ((float) m1216a.getHeight()) <= rectF.bottom;
    }

    /* renamed from: a */
    private int[] m1223a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: h */
    private void m1224h() {
        this.f1307a = 0;
        this.f1310d = -1.0f;
        this.f1311e = -1.0f;
        this.f1309c = -1.0f;
        this.f1312f = new int[0];
        this.f1308b = false;
    }

    /* renamed from: i */
    private boolean m1225i() {
        if (m1227k() && this.f1307a == 1) {
            if (!this.f1313g || this.f1312f.length == 0) {
                float round = Math.round(this.f1310d);
                int i = 1;
                while (Math.round(this.f1309c + round) <= Math.round(this.f1311e)) {
                    i++;
                    round += this.f1309c;
                }
                int[] iArr = new int[i];
                float f = this.f1310d;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f1309c;
                }
                this.f1312f = m1223a(iArr);
            }
            this.f1308b = true;
        } else {
            this.f1308b = false;
        }
        return this.f1308b;
    }

    /* renamed from: j */
    private boolean m1226j() {
        boolean z = this.f1312f.length > 0;
        this.f1313g = z;
        if (z) {
            this.f1307a = 1;
            int[] iArr = this.f1312f;
            this.f1310d = iArr[0];
            this.f1311e = iArr[r0 - 1];
            this.f1309c = -1.0f;
        }
        return this.f1313g;
    }

    /* renamed from: k */
    private boolean m1227k() {
        return !(this.f1315i instanceof C0177j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1228a() {
        if (m1239g()) {
            if (this.f1308b) {
                if (this.f1315i.getMeasuredHeight() <= 0 || this.f1315i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = ((Boolean) m1217a((Object) this.f1315i, "getHorizontallyScrolling", (String) false)).booleanValue() ? 1048576 : (this.f1315i.getMeasuredWidth() - this.f1315i.getTotalPaddingLeft()) - this.f1315i.getTotalPaddingRight();
                int height = (this.f1315i.getHeight() - this.f1315i.getCompoundPaddingBottom()) - this.f1315i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                synchronized (f1305k) {
                    f1305k.setEmpty();
                    f1305k.right = measuredWidth;
                    f1305k.bottom = height;
                    float m1214a = m1214a(f1305k);
                    if (m1214a != this.f1315i.getTextSize()) {
                        m1230a(0, m1214a);
                    }
                }
            }
            this.f1308b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1229a(int i) {
        if (m1227k()) {
            if (i == 0) {
                m1224h();
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            DisplayMetrics displayMetrics = this.f1316j.getResources().getDisplayMetrics();
            m1220a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1225i()) {
                m1228a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1230a(int i, float f) {
        Context context = this.f1316j;
        m1219a(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1231a(int i, int i2, int i3, int i4) {
        if (m1227k()) {
            DisplayMetrics displayMetrics = this.f1316j.getResources().getDisplayMetrics();
            m1220a(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m1225i()) {
                m1228a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1232a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1316j.obtainStyledAttributes(attributeSet, R$styleable.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(R$styleable.AppCompatTextView_autoSizeTextType)) {
            this.f1307a = obtainStyledAttributes.getInt(R$styleable.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(R$styleable.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(R$styleable.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(R$styleable.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(R$styleable.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(R$styleable.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(R$styleable.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(R$styleable.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m1221a(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m1227k()) {
            this.f1307a = 0;
            return;
        }
        if (this.f1307a == 1) {
            if (!this.f1313g) {
                DisplayMetrics displayMetrics = this.f1316j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1220a(dimension2, dimension3, dimension);
            }
            m1225i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1233a(int[] iArr, int i) {
        if (m1227k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1316j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f1312f = m1223a(iArr2);
                if (!m1226j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1313g = false;
            }
            if (m1225i()) {
                m1228a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m1234b() {
        return Math.round(this.f1311e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m1235c() {
        return Math.round(this.f1310d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m1236d() {
        return Math.round(this.f1309c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] m1237e() {
        return this.f1312f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m1238f() {
        return this.f1307a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m1239g() {
        return m1227k() && this.f1307a != 0;
    }
}
