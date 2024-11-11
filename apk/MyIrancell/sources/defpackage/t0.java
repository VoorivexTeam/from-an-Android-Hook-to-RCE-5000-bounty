package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import defpackage.j1;
import defpackage.m0;
import defpackage.p0;

/* loaded from: classes.dex */
public class t0 {
    private static final y0 a;
    private static final g0<String, Typeface> b;

    static {
        int i = Build.VERSION.SDK_INT;
        a = i >= 28 ? new x0() : i >= 26 ? new w0() : (i < 24 || !v0.a()) ? Build.VERSION.SDK_INT >= 21 ? new u0() : new y0() : new v0();
        b = new g0<>(16);
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a2 = a.a(context, resources, i, str, i2);
        if (a2 != null) {
            b.a(a(resources, i, i2), a2);
        }
        return a2;
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, j1.f[] fVarArr, int i) {
        return a.a(context, cancellationSignal, fVarArr, i);
    }

    public static Typeface a(Context context, m0.a aVar, Resources resources, int i, int i2, p0.a aVar2, Handler handler, boolean z) {
        Typeface a2;
        if (aVar instanceof m0.d) {
            m0.d dVar = (m0.d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.a() == 0) {
                z2 = true;
            }
            a2 = j1.a(context, dVar.b(), aVar2, handler, z2, z ? dVar.c() : -1, i2);
        } else {
            a2 = a.a(context, (m0.b) aVar, resources, i2);
            if (aVar2 != null) {
                if (a2 != null) {
                    aVar2.a(a2, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (a2 != null) {
            b.a(a(resources, i, i2), a2);
        }
        return a2;
    }

    private static String a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    public static Typeface b(Resources resources, int i, int i2) {
        return b.b(a(resources, i, i2));
    }
}
