package defpackage;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* loaded from: classes.dex */
final class z60 {
    public static File a(Context context) {
        return new File(a(context, true), "video-cache");
    }

    private static File a(Context context, boolean z) {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (NullPointerException unused) {
            str = "";
        }
        File b = (z && "mounted".equals(str)) ? b(context) : null;
        if (b == null) {
            b = context.getCacheDir();
        }
        if (b != null) {
            return b;
        }
        String str2 = context.getCacheDir().getPath() + "/";
        i50.c("Can't define system cache directory! '" + str2 + "%s' will be used.");
        return new File(str2);
    }

    private static File b(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), "cache");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        i50.c("Unable to create external cache directory");
        return null;
    }
}
