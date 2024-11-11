package p000;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;

/* renamed from: eu */
/* loaded from: classes.dex */
public class C2445eu {

    /* renamed from: a */
    public static final boolean f10031a;

    /* renamed from: b */
    private static final int[] f10032b;

    /* renamed from: c */
    private static final int[] f10033c;

    /* renamed from: d */
    private static final int[] f10034d;

    /* renamed from: e */
    private static final int[] f10035e;

    /* renamed from: f */
    private static final int[] f10036f;

    /* renamed from: g */
    private static final int[] f10037g;

    /* renamed from: h */
    private static final int[] f10038h;

    /* renamed from: i */
    private static final int[] f10039i;

    /* renamed from: j */
    private static final int[] f10040j;

    static {
        f10031a = Build.VERSION.SDK_INT >= 21;
        f10032b = new int[]{R.attr.state_pressed};
        f10033c = new int[]{R.attr.state_hovered, R.attr.state_focused};
        f10034d = new int[]{R.attr.state_focused};
        f10035e = new int[]{R.attr.state_hovered};
        f10036f = new int[]{R.attr.state_selected, R.attr.state_pressed};
        f10037g = new int[]{R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
        f10038h = new int[]{R.attr.state_selected, R.attr.state_focused};
        f10039i = new int[]{R.attr.state_selected, R.attr.state_hovered};
        f10040j = new int[]{R.attr.state_selected};
    }

    @TargetApi(21)
    /* renamed from: a */
    private static int m11634a(int i) {
        return C3147r0.m15163c(i, Math.min(Color.alpha(i) * 2, 255));
    }

    /* renamed from: a */
    private static int m11635a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f10031a ? m11634a(colorForState) : colorForState;
    }

    /* renamed from: a */
    public static ColorStateList m11636a(ColorStateList colorStateList) {
        if (f10031a) {
            return new ColorStateList(new int[][]{f10040j, StateSet.NOTHING}, new int[]{m11635a(colorStateList, f10036f), m11635a(colorStateList, f10032b)});
        }
        int[] iArr = f10036f;
        int[] iArr2 = f10037g;
        int[] iArr3 = f10038h;
        int[] iArr4 = f10039i;
        int[] iArr5 = f10032b;
        int[] iArr6 = f10033c;
        int[] iArr7 = f10034d;
        int[] iArr8 = f10035e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f10040j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m11635a(colorStateList, iArr), m11635a(colorStateList, iArr2), m11635a(colorStateList, iArr3), m11635a(colorStateList, iArr4), 0, m11635a(colorStateList, iArr5), m11635a(colorStateList, iArr6), m11635a(colorStateList, iArr7), m11635a(colorStateList, iArr8), 0});
    }
}
