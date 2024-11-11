package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public class ep {
    private static ep b = new ep();
    private dp a = null;

    public static dp a(Context context) {
        return b.b(context);
    }

    private final synchronized dp b(Context context) {
        if (this.a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.a = new dp(context);
        }
        return this.a;
    }
}
