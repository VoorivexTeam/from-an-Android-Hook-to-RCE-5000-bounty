package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class kc implements ec {
    private static final Bitmap.Config j = Bitmap.Config.ARGB_8888;
    private final lc a;
    private final Set<Bitmap.Config> b;
    private final a c;
    private long d;
    private long e;
    private int f;
    private int g;
    private int h;
    private int i;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    /* loaded from: classes.dex */
    private static final class b implements a {
        b() {
        }

        @Override // kc.a
        public void a(Bitmap bitmap) {
        }

        @Override // kc.a
        public void b(Bitmap bitmap) {
        }
    }

    public kc(long j2) {
        this(j2, g(), f());
    }

    kc(long j2, lc lcVar, Set<Bitmap.Config> set) {
        this.d = j2;
        this.a = lcVar;
        this.b = set;
        this.c = new b();
    }

    private synchronized void a(long j2) {
        while (this.e > j2) {
            Bitmap a2 = this.a.a();
            if (a2 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    d();
                }
                this.e = 0L;
                return;
            }
            this.c.a(a2);
            this.e -= this.a.b(a2);
            this.i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                String str = "Evicting bitmap=" + this.a.c(a2);
            }
            c();
            a2.recycle();
        }
    }

    @TargetApi(26)
    private static void a(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @TargetApi(19)
    private static void b(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    private static Bitmap c(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    private void c() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            d();
        }
    }

    private static void c(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        b(bitmap);
    }

    private synchronized Bitmap d(int i, int i2, Bitmap.Config config) {
        Bitmap a2;
        a(config);
        a2 = this.a.a(i, i2, config != null ? config : j);
        if (a2 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                String str = "Missing bitmap=" + this.a.b(i, i2, config);
            }
            this.g++;
        } else {
            this.f++;
            this.e -= this.a.b(a2);
            this.c.a(a2);
            c(a2);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            String str2 = "Get bitmap=" + this.a.b(i, i2, config);
        }
        c();
        return a2;
    }

    private void d() {
        String str = "Hits=" + this.f + ", misses=" + this.g + ", puts=" + this.h + ", evictions=" + this.i + ", currentSize=" + this.e + ", maxSize=" + this.d + "\nStrategy=" + this.a;
    }

    private void e() {
        a(this.d);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> f() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        if (Build.VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static lc g() {
        return Build.VERSION.SDK_INT >= 19 ? new nc() : new cc();
    }

    @Override // defpackage.ec
    public Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap d = d(i, i2, config);
        if (d == null) {
            return c(i, i2, config);
        }
        d.eraseColor(0);
        return d;
    }

    @Override // defpackage.ec
    public void a() {
        Log.isLoggable("LruBitmapPool", 3);
        a(0L);
    }

    @Override // defpackage.ec
    @SuppressLint({"InlinedApi"})
    public void a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            String str = "trimMemory, level=" + i;
        }
        if (i >= 40) {
            a();
        } else if (i >= 20 || i == 15) {
            a(b() / 2);
        }
    }

    @Override // defpackage.ec
    public synchronized void a(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.a.b(bitmap) <= this.d && this.b.contains(bitmap.getConfig())) {
                int b2 = this.a.b(bitmap);
                this.a.a(bitmap);
                this.c.b(bitmap);
                this.h++;
                this.e += b2;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    String str = "Put bitmap in pool=" + this.a.c(bitmap);
                }
                c();
                e();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                String str2 = "Reject bitmap from pool, bitmap: " + this.a.c(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    public long b() {
        return this.d;
    }

    @Override // defpackage.ec
    public Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap d = d(i, i2, config);
        return d == null ? c(i, i2, config) : d;
    }
}
