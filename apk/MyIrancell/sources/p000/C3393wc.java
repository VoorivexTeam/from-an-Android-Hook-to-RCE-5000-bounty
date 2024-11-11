package p000;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: wc */
/* loaded from: classes.dex */
public final class C3393wc {

    /* renamed from: a */
    private final int f13817a;

    /* renamed from: b */
    private final int f13818b;

    /* renamed from: c */
    private final Context f13819c;

    /* renamed from: d */
    private final int f13820d;

    /* renamed from: wc$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: i */
        static final int f13821i;

        /* renamed from: a */
        final Context f13822a;

        /* renamed from: b */
        ActivityManager f13823b;

        /* renamed from: c */
        c f13824c;

        /* renamed from: e */
        float f13826e;

        /* renamed from: d */
        float f13825d = 2.0f;

        /* renamed from: f */
        float f13827f = 0.4f;

        /* renamed from: g */
        float f13828g = 0.33f;

        /* renamed from: h */
        int f13829h = 4194304;

        static {
            f13821i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f13826e = f13821i;
            this.f13822a = context;
            this.f13823b = (ActivityManager) context.getSystemService("activity");
            this.f13824c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !C3393wc.m16201a(this.f13823b)) {
                return;
            }
            this.f13826e = 0.0f;
        }

        /* renamed from: a */
        public C3393wc m16205a() {
            return new C3393wc(this);
        }
    }

    /* renamed from: wc$b */
    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a */
        private final DisplayMetrics f13830a;

        b(DisplayMetrics displayMetrics) {
            this.f13830a = displayMetrics;
        }

        @Override // p000.C3393wc.c
        /* renamed from: a */
        public int mo16206a() {
            return this.f13830a.heightPixels;
        }

        @Override // p000.C3393wc.c
        /* renamed from: b */
        public int mo16207b() {
            return this.f13830a.widthPixels;
        }
    }

    /* renamed from: wc$c */
    /* loaded from: classes.dex */
    interface c {
        /* renamed from: a */
        int mo16206a();

        /* renamed from: b */
        int mo16207b();
    }

    C3393wc(a aVar) {
        this.f13819c = aVar.f13822a;
        this.f13820d = m16201a(aVar.f13823b) ? aVar.f13829h / 2 : aVar.f13829h;
        int m16199a = m16199a(aVar.f13823b, aVar.f13827f, aVar.f13828g);
        float mo16207b = aVar.f13824c.mo16207b() * aVar.f13824c.mo16206a() * 4;
        int round = Math.round(aVar.f13826e * mo16207b);
        int round2 = Math.round(mo16207b * aVar.f13825d);
        int i = m16199a - this.f13820d;
        int i2 = round2 + round;
        if (i2 <= i) {
            this.f13818b = round2;
            this.f13817a = round;
        } else {
            float f = i;
            float f2 = aVar.f13826e;
            float f3 = aVar.f13825d;
            float f4 = f / (f2 + f3);
            this.f13818b = Math.round(f3 * f4);
            this.f13817a = Math.round(f4 * aVar.f13826e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m16200a(this.f13818b));
            sb.append(", pool size: ");
            sb.append(m16200a(this.f13817a));
            sb.append(", byte array size: ");
            sb.append(m16200a(this.f13820d));
            sb.append(", memory class limited? ");
            sb.append(i2 > m16199a);
            sb.append(", max size: ");
            sb.append(m16200a(m16199a));
            sb.append(", memoryClass: ");
            sb.append(aVar.f13823b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m16201a(aVar.f13823b));
            sb.toString();
        }
    }

    /* renamed from: a */
    private static int m16199a(ActivityManager activityManager, float f, float f2) {
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (m16201a(activityManager)) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    /* renamed from: a */
    private String m16200a(int i) {
        return Formatter.formatFileSize(this.f13819c, i);
    }

    @TargetApi(19)
    /* renamed from: a */
    static boolean m16201a(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    /* renamed from: a */
    public int m16202a() {
        return this.f13820d;
    }

    /* renamed from: b */
    public int m16203b() {
        return this.f13817a;
    }

    /* renamed from: c */
    public int m16204c() {
        return this.f13818b;
    }
}
