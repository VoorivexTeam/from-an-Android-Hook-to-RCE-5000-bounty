package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import defpackage.p0;

/* loaded from: classes.dex */
public class t0 {
    private final Context a;
    private final TypedArray b;
    private TypedValue c;

    private t0(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static t0 a(Context context, int i, int[] iArr) {
        return new t0(context, context.obtainStyledAttributes(i, iArr));
    }

    public static t0 a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new t0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static t0 a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new t0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public float a(int i, float f) {
        return this.b.getDimension(i, f);
    }

    public int a(int i, int i2) {
        return this.b.getColor(i, i2);
    }

    public ColorStateList a(int i) {
        int resourceId;
        ColorStateList b;
        return (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0 || (b = defpackage.a.b(this.a, resourceId)) == null) ? this.b.getColorStateList(i) : b;
    }

    public Typeface a(int i, int i2, p0.a aVar) {
        int resourceId = this.b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return defpackage.p0.a(this.a, resourceId, this.c, i2, aVar);
    }

    public void a() {
        this.b.recycle();
    }

    public boolean a(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }

    public float b(int i, float f) {
        return this.b.getFloat(i, f);
    }

    public int b(int i, int i2) {
        return this.b.getDimensionPixelOffset(i, i2);
    }

    public Drawable b(int i) {
        int resourceId;
        return (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) ? this.b.getDrawable(i) : defpackage.a.c(this.a, resourceId);
    }

    public int c(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public Drawable c(int i) {
        int resourceId;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return i.a().a(this.a, resourceId, true);
    }

    public int d(int i, int i2) {
        return this.b.getInt(i, i2);
    }

    public String d(int i) {
        return this.b.getString(i);
    }

    public int e(int i, int i2) {
        return this.b.getInteger(i, i2);
    }

    public CharSequence e(int i) {
        return this.b.getText(i);
    }

    public int f(int i, int i2) {
        return this.b.getLayoutDimension(i, i2);
    }

    public CharSequence[] f(int i) {
        return this.b.getTextArray(i);
    }

    public int g(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }

    public boolean g(int i) {
        return this.b.hasValue(i);
    }
}
