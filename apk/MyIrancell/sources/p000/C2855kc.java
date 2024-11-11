package p000;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: kc */
/* loaded from: classes.dex */
public class C2855kc implements InterfaceC2427ec {

    /* renamed from: j */
    private static final Bitmap.Config f11707j = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    private final InterfaceC2892lc f11708a;

    /* renamed from: b */
    private final Set<Bitmap.Config> f11709b;

    /* renamed from: c */
    private final a f11710c;

    /* renamed from: d */
    private long f11711d;

    /* renamed from: e */
    private long f11712e;

    /* renamed from: f */
    private int f11713f;

    /* renamed from: g */
    private int f11714g;

    /* renamed from: h */
    private int f11715h;

    /* renamed from: i */
    private int f11716i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kc$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo13687a(Bitmap bitmap);

        /* renamed from: b */
        void mo13688b(Bitmap bitmap);
    }

    /* renamed from: kc$b */
    /* loaded from: classes.dex */
    private static final class b implements a {
        b() {
        }

        @Override // p000.C2855kc.a
        /* renamed from: a */
        public void mo13687a(Bitmap bitmap) {
        }

        @Override // p000.C2855kc.a
        /* renamed from: b */
        public void mo13688b(Bitmap bitmap) {
        }
    }

    public C2855kc(long j) {
        this(j, m13685g(), m13684f());
    }

    C2855kc(long j, InterfaceC2892lc interfaceC2892lc, Set<Bitmap.Config> set) {
        this.f11711d = j;
        this.f11708a = interfaceC2892lc;
        this.f11709b = set;
        this.f11710c = new b();
    }

    /* renamed from: a */
    private synchronized void m13675a(long j) {
        while (this.f11712e > j) {
            Bitmap mo3651a = this.f11708a.mo3651a();
            if (mo3651a == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    m13682d();
                }
                this.f11712e = 0L;
                return;
            }
            this.f11710c.mo13687a(mo3651a);
            this.f11712e -= this.f11708a.mo3654b(mo3651a);
            this.f11716i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                String str = "Evicting bitmap=" + this.f11708a.mo3656c(mo3651a);
            }
            m13679c();
            mo3651a.recycle();
        }
    }

    @TargetApi(26)
    /* renamed from: a */
    private static void m13676a(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    private static void m13677b(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    /* renamed from: c */
    private static Bitmap m13678c(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f11707j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: c */
    private void m13679c() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m13682d();
        }
    }

    /* renamed from: c */
    private static void m13680c(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m13677b(bitmap);
    }

    /* renamed from: d */
    private synchronized Bitmap m13681d(int i, int i2, Bitmap.Config config) {
        Bitmap mo3652a;
        m13676a(config);
        mo3652a = this.f11708a.mo3652a(i, i2, config != null ? config : f11707j);
        if (mo3652a == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                String str = "Missing bitmap=" + this.f11708a.mo3655b(i, i2, config);
            }
            this.f11714g++;
        } else {
            this.f11713f++;
            this.f11712e -= this.f11708a.mo3654b(mo3652a);
            this.f11710c.mo13687a(mo3652a);
            m13680c(mo3652a);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            String str2 = "Get bitmap=" + this.f11708a.mo3655b(i, i2, config);
        }
        m13679c();
        return mo3652a;
    }

    /* renamed from: d */
    private void m13682d() {
        String str = "Hits=" + this.f11713f + ", misses=" + this.f11714g + ", puts=" + this.f11715h + ", evictions=" + this.f11716i + ", currentSize=" + this.f11712e + ", maxSize=" + this.f11711d + "\nStrategy=" + this.f11708a;
    }

    /* renamed from: e */
    private void m13683e() {
        m13675a(this.f11711d);
    }

    @TargetApi(26)
    /* renamed from: f */
    private static Set<Bitmap.Config> m13684f() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        if (Build.VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: g */
    private static InterfaceC2892lc m13685g() {
        return Build.VERSION.SDK_INT >= 19 ? new C2984nc() : new C0517cc();
    }

    @Override // p000.InterfaceC2427ec
    /* renamed from: a */
    public Bitmap mo11588a(int i, int i2, Bitmap.Config config) {
        Bitmap m13681d = m13681d(i, i2, config);
        if (m13681d == null) {
            return m13678c(i, i2, config);
        }
        m13681d.eraseColor(0);
        return m13681d;
    }

    @Override // p000.InterfaceC2427ec
    /* renamed from: a */
    public void mo11589a() {
        Log.isLoggable("LruBitmapPool", 3);
        m13675a(0L);
    }

    @Override // p000.InterfaceC2427ec
    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo11590a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            String str = "trimMemory, level=" + i;
        }
        if (i >= 40) {
            mo11589a();
        } else if (i >= 20 || i == 15) {
            m13675a(m13686b() / 2);
        }
    }

    @Override // p000.InterfaceC2427ec
    /* renamed from: a */
    public synchronized void mo11591a(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f11708a.mo3654b(bitmap) <= this.f11711d && this.f11709b.contains(bitmap.getConfig())) {
                int mo3654b = this.f11708a.mo3654b(bitmap);
                this.f11708a.mo3653a(bitmap);
                this.f11710c.mo13688b(bitmap);
                this.f11715h++;
                this.f11712e += mo3654b;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    String str = "Put bitmap in pool=" + this.f11708a.mo3656c(bitmap);
                }
                m13679c();
                m13683e();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                String str2 = "Reject bitmap from pool, bitmap: " + this.f11708a.mo3656c(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f11709b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public long m13686b() {
        return this.f11711d;
    }

    @Override // p000.InterfaceC2427ec
    /* renamed from: b */
    public Bitmap mo11592b(int i, int i2, Bitmap.Config config) {
        Bitmap m13681d = m13681d(i, i2, config);
        return m13681d == null ? m13678c(i, i2, config) : m13681d;
    }
}
