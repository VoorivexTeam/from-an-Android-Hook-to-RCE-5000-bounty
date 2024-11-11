package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p000.C0000a;
import p000.C3066p0;

/* renamed from: androidx.appcompat.widget.t0 */
/* loaded from: classes.dex */
public class C0198t0 {

    /* renamed from: a */
    private final Context f1217a;

    /* renamed from: b */
    private final TypedArray f1218b;

    /* renamed from: c */
    private TypedValue f1219c;

    private C0198t0(Context context, TypedArray typedArray) {
        this.f1217a = context;
        this.f1218b = typedArray;
    }

    /* renamed from: a */
    public static C0198t0 m1131a(Context context, int i, int[] iArr) {
        return new C0198t0(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static C0198t0 m1132a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0198t0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C0198t0 m1133a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0198t0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public float m1134a(int i, float f) {
        return this.f1218b.getDimension(i, f);
    }

    /* renamed from: a */
    public int m1135a(int i, int i2) {
        return this.f1218b.getColor(i, i2);
    }

    /* renamed from: a */
    public ColorStateList m1136a(int i) {
        int resourceId;
        ColorStateList m3b;
        return (!this.f1218b.hasValue(i) || (resourceId = this.f1218b.getResourceId(i, 0)) == 0 || (m3b = C0000a.m3b(this.f1217a, resourceId)) == null) ? this.f1218b.getColorStateList(i) : m3b;
    }

    /* renamed from: a */
    public Typeface m1137a(int i, int i2, C3066p0.a aVar) {
        int resourceId = this.f1218b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1219c == null) {
            this.f1219c = new TypedValue();
        }
        return C3066p0.m14674a(this.f1217a, resourceId, this.f1219c, i2, aVar);
    }

    /* renamed from: a */
    public void m1138a() {
        this.f1218b.recycle();
    }

    /* renamed from: a */
    public boolean m1139a(int i, boolean z) {
        return this.f1218b.getBoolean(i, z);
    }

    /* renamed from: b */
    public float m1140b(int i, float f) {
        return this.f1218b.getFloat(i, f);
    }

    /* renamed from: b */
    public int m1141b(int i, int i2) {
        return this.f1218b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: b */
    public Drawable m1142b(int i) {
        int resourceId;
        return (!this.f1218b.hasValue(i) || (resourceId = this.f1218b.getResourceId(i, 0)) == 0) ? this.f1218b.getDrawable(i) : C0000a.m4c(this.f1217a, resourceId);
    }

    /* renamed from: c */
    public int m1143c(int i, int i2) {
        return this.f1218b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: c */
    public Drawable m1144c(int i) {
        int resourceId;
        if (!this.f1218b.hasValue(i) || (resourceId = this.f1218b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0175i.m1020a().m1040a(this.f1217a, resourceId, true);
    }

    /* renamed from: d */
    public int m1145d(int i, int i2) {
        return this.f1218b.getInt(i, i2);
    }

    /* renamed from: d */
    public String m1146d(int i) {
        return this.f1218b.getString(i);
    }

    /* renamed from: e */
    public int m1147e(int i, int i2) {
        return this.f1218b.getInteger(i, i2);
    }

    /* renamed from: e */
    public CharSequence m1148e(int i) {
        return this.f1218b.getText(i);
    }

    /* renamed from: f */
    public int m1149f(int i, int i2) {
        return this.f1218b.getLayoutDimension(i, i2);
    }

    /* renamed from: f */
    public CharSequence[] m1150f(int i) {
        return this.f1218b.getTextArray(i);
    }

    /* renamed from: g */
    public int m1151g(int i, int i2) {
        return this.f1218b.getResourceId(i, i2);
    }

    /* renamed from: g */
    public boolean m1152g(int i) {
        return this.f1218b.hasValue(i);
    }
}
