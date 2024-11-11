package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import p000.C3147r0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.o0 */
/* loaded from: classes.dex */
public class C0188o0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1192a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1193b = {-16842910};

    /* renamed from: c */
    static final int[] f1194c = {R.attr.state_focused};

    /* renamed from: d */
    static final int[] f1195d = {R.attr.state_pressed};

    /* renamed from: e */
    static final int[] f1196e = {R.attr.state_checked};

    /* renamed from: f */
    static final int[] f1197f = new int[0];

    /* renamed from: g */
    private static final int[] f1198g = new int[1];

    /* renamed from: a */
    public static int m1116a(Context context, int i) {
        ColorStateList m1120c = m1120c(context, i);
        if (m1120c != null && m1120c.isStateful()) {
            return m1120c.getColorForState(f1193b, m1120c.getDefaultColor());
        }
        TypedValue m1118a = m1118a();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, m1118a, true);
        return m1117a(context, i, m1118a.getFloat());
    }

    /* renamed from: a */
    static int m1117a(Context context, int i, float f) {
        return C3147r0.m15163c(m1119b(context, i), Math.round(Color.alpha(r0) * f));
    }

    /* renamed from: a */
    private static TypedValue m1118a() {
        TypedValue typedValue = f1192a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f1192a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: b */
    public static int m1119b(Context context, int i) {
        int[] iArr = f1198g;
        iArr[0] = i;
        C0198t0 m1132a = C0198t0.m1132a(context, (AttributeSet) null, iArr);
        try {
            return m1132a.m1135a(0, 0);
        } finally {
            m1132a.m1138a();
        }
    }

    /* renamed from: c */
    public static ColorStateList m1120c(Context context, int i) {
        int[] iArr = f1198g;
        iArr[0] = i;
        C0198t0 m1132a = C0198t0.m1132a(context, (AttributeSet) null, iArr);
        try {
            return m1132a.m1136a(0);
        } finally {
            m1132a.m1138a();
        }
    }
}
