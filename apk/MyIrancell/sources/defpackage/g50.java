package defpackage;

import android.util.Log;

@Deprecated
/* loaded from: classes.dex */
public class g50 {
    public static void a(String str, Throwable th) {
        i50.c(str, Log.getStackTraceString(th));
    }

    public static void a(Throwable th) {
        i50.c(Log.getStackTraceString(th));
    }
}
