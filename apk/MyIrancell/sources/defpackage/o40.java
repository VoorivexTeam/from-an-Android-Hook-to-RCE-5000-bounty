package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class o40 {
    public SharedPreferences a;

    public o40(Context context) {
        this.a = context.getApplicationContext().getSharedPreferences("SIXDEE_PREFERENCE", 0);
    }
}
