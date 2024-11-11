package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* renamed from: du */
/* loaded from: classes.dex */
public class C2402du {
    /* renamed from: a */
    public static ColorStateList m11484a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList m3b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m3b = C0000a.m3b(context, resourceId)) == null) ? typedArray.getColorStateList(i) : m3b;
    }

    /* renamed from: b */
    public static Drawable m11485b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable m4c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m4c = C0000a.m4c(context, resourceId)) == null) ? typedArray.getDrawable(i) : m4c;
    }
}
