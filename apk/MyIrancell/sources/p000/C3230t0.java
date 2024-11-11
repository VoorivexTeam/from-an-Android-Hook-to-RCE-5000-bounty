package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import p000.C2796j1;
import p000.C2917m0;
import p000.C3066p0;

/* renamed from: t0 */
/* loaded from: classes.dex */
public class C3230t0 {

    /* renamed from: a */
    private static final C3458y0 f13165a;

    /* renamed from: b */
    private static final C2493g0<String, Typeface> f13166b;

    static {
        int i = Build.VERSION.SDK_INT;
        f13165a = i >= 28 ? new C3418x0() : i >= 26 ? new C3379w0() : (i < 24 || !C3326v0.m15887a()) ? Build.VERSION.SDK_INT >= 21 ? new C3282u0() : new C3458y0() : new C3326v0();
        f13166b = new C2493g0<>(16);
    }

    /* renamed from: a */
    public static Typeface m15471a(Context context, Resources resources, int i, String str, int i2) {
        Typeface mo16089a = f13165a.mo16089a(context, resources, i, str, i2);
        if (mo16089a != null) {
            f13166b.m11858a(m15474a(resources, i, i2), mo16089a);
        }
        return mo16089a;
    }

    /* renamed from: a */
    public static Typeface m15472a(Context context, CancellationSignal cancellationSignal, C2796j1.f[] fVarArr, int i) {
        return f13165a.mo15700a(context, cancellationSignal, fVarArr, i);
    }

    /* renamed from: a */
    public static Typeface m15473a(Context context, C2917m0.a aVar, Resources resources, int i, int i2, C3066p0.a aVar2, Handler handler, boolean z) {
        Typeface mo15890a;
        if (aVar instanceof C2917m0.d) {
            C2917m0.d dVar = (C2917m0.d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.m13974a() == 0) {
                z2 = true;
            }
            mo15890a = C2796j1.m13295a(context, dVar.m13975b(), aVar2, handler, z2, z ? dVar.m13976c() : -1, i2);
        } else {
            mo15890a = f13165a.mo15890a(context, (C2917m0.b) aVar, resources, i2);
            if (aVar2 != null) {
                if (mo15890a != null) {
                    aVar2.m14679a(mo15890a, handler);
                } else {
                    aVar2.m14678a(-3, handler);
                }
            }
        }
        if (mo15890a != null) {
            f13166b.m11858a(m15474a(resources, i, i2), mo15890a);
        }
        return mo15890a;
    }

    /* renamed from: a */
    private static String m15474a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    /* renamed from: b */
    public static Typeface m15475b(Resources resources, int i, int i2) {
        return f13166b.m11861b(m15474a(resources, i, i2));
    }
}
