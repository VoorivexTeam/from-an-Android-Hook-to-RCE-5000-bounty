package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

/* renamed from: ww */
/* loaded from: classes.dex */
public final class C3413ww {
    /* renamed from: a */
    private static ClipboardManager m16399a(Context context) {
        return (ClipboardManager) context.getSystemService("clipboard");
    }

    /* renamed from: a */
    public static void m16400a(CharSequence charSequence, Context context) {
        if (charSequence != null) {
            try {
                m16399a(context).setPrimaryClip(ClipData.newPlainText(null, charSequence));
            } catch (IllegalStateException | NullPointerException unused) {
            }
        }
    }
}
