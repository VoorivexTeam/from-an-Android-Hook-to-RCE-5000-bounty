package p000;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* loaded from: classes.dex */
final class z60 {
    /* renamed from: a */
    public static File m16785a(Context context) {
        return new File(m16786a(context, true), "video-cache");
    }

    /* renamed from: a */
    private static File m16786a(Context context, boolean z) {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (NullPointerException unused) {
            str = "";
        }
        File m16787b = (z && "mounted".equals(str)) ? m16787b(context) : null;
        if (m16787b == null) {
            m16787b = context.getCacheDir();
        }
        if (m16787b != null) {
            return m16787b;
        }
        String str2 = context.getCacheDir().getPath() + "/";
        i50.m12374c("Can't define system cache directory! '" + str2 + "%s' will be used.");
        return new File(str2);
    }

    /* renamed from: b */
    private static File m16787b(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), "cache");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        i50.m12374c("Unable to create external cache directory");
        return null;
    }
}
