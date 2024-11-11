package ir.tapsell.sdk.nativeads.views.videoplayer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* renamed from: ir.tapsell.sdk.nativeads.views.videoplayer.d */
/* loaded from: classes.dex */
class C2727d {
    /* renamed from: a */
    public static Drawable m13083a(Context context, int i) {
        return m13084a(context, i, null);
    }

    /* renamed from: a */
    private static Drawable m13084a(Context context, int i, Drawable drawable) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
            if (drawable2 != null || drawable == null) {
                drawable = drawable2;
            }
            return drawable;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
