package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.EnumC0568b;
import java.io.File;

/* renamed from: ve */
/* loaded from: classes.dex */
final class C3356ve {

    /* renamed from: c */
    private static final File f13680c = new File("/proc/self/fd");

    /* renamed from: d */
    private static volatile C3356ve f13681d;

    /* renamed from: a */
    private volatile int f13682a;

    /* renamed from: b */
    private volatile boolean f13683b = true;

    private C3356ve() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C3356ve m16012a() {
        if (f13681d == null) {
            synchronized (C3356ve.class) {
                if (f13681d == null) {
                    f13681d = new C3356ve();
                }
            }
        }
        return f13681d;
    }

    /* renamed from: b */
    private synchronized boolean m16013b() {
        boolean z = true;
        int i = this.f13682a + 1;
        this.f13682a = i;
        if (i >= 50) {
            this.f13682a = 0;
            int length = f13680c.list().length;
            if (length >= 700) {
                z = false;
            }
            this.f13683b = z;
            if (!this.f13683b && Log.isLoggable("Downsampler", 5)) {
                String str = "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit 700";
            }
        }
        return this.f13683b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(26)
    /* renamed from: a */
    public boolean m16014a(int i, int i2, BitmapFactory.Options options, EnumC0568b enumC0568b, boolean z, boolean z2) {
        if (!z || Build.VERSION.SDK_INT < 26 || z2) {
            return false;
        }
        boolean z3 = i >= 128 && i2 >= 128 && m16013b();
        if (z3) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return z3;
    }
}
