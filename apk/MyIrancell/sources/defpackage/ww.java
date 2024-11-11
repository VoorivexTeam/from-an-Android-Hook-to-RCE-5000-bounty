package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class ww {
    private static ClipboardManager a(Context context) {
        return (ClipboardManager) context.getSystemService("clipboard");
    }

    public static void a(CharSequence charSequence, Context context) {
        if (charSequence != null) {
            try {
                a(context).setPrimaryClip(ClipData.newPlainText(null, charSequence));
            } catch (IllegalStateException | NullPointerException unused) {
            }
        }
    }
}
