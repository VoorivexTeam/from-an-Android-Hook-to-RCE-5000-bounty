package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.b;
import java.io.File;

/* loaded from: classes.dex */
final class ve {
    private static final File c = new File("/proc/self/fd");
    private static volatile ve d;
    private volatile int a;
    private volatile boolean b = true;

    private ve() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ve a() {
        if (d == null) {
            synchronized (ve.class) {
                if (d == null) {
                    d = new ve();
                }
            }
        }
        return d;
    }

    private synchronized boolean b() {
        boolean z = true;
        int i = this.a + 1;
        this.a = i;
        if (i >= 50) {
            this.a = 0;
            int length = c.list().length;
            if (length >= 700) {
                z = false;
            }
            this.b = z;
            if (!this.b && Log.isLoggable("Downsampler", 5)) {
                String str = "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit 700";
            }
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(26)
    public boolean a(int i, int i2, BitmapFactory.Options options, b bVar, boolean z, boolean z2) {
        if (!z || Build.VERSION.SDK_INT < 26 || z2) {
            return false;
        }
        boolean z3 = i >= 128 && i2 >= 128 && b();
        if (z3) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return z3;
    }
}
