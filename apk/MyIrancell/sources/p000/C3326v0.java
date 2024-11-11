package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p000.C2796j1;
import p000.C2917m0;

/* renamed from: v0 */
/* loaded from: classes.dex */
class C3326v0 extends C3458y0 {

    /* renamed from: a */
    private static final Class f13531a;

    /* renamed from: b */
    private static final Constructor f13532b;

    /* renamed from: c */
    private static final Method f13533c;

    /* renamed from: d */
    private static final Method f13534d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.getClass().getName();
            cls = null;
            method = null;
            method2 = null;
        }
        f13532b = constructor;
        f13531a = cls;
        f13533c = method2;
        f13534d = method;
    }

    /* renamed from: a */
    private static Typeface m15886a(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f13531a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f13534d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static boolean m15887a() {
        Method method = f13533c;
        return f13533c != null;
    }

    /* renamed from: a */
    private static boolean m15888a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f13533c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static Object m15889b() {
        try {
            return f13532b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000.C3458y0
    /* renamed from: a */
    public Typeface mo15700a(Context context, CancellationSignal cancellationSignal, C2796j1.f[] fVarArr, int i) {
        Object m15889b = m15889b();
        C2573i0 c2573i0 = new C2573i0();
        for (C2796j1.f fVar : fVarArr) {
            Uri m13309c = fVar.m13309c();
            ByteBuffer byteBuffer = (ByteBuffer) c2573i0.get(m13309c);
            if (byteBuffer == null) {
                byteBuffer = C3507z0.m16691a(context, cancellationSignal, m13309c);
                c2573i0.put(m13309c, byteBuffer);
            }
            if (!m15888a(m15889b, byteBuffer, fVar.m13308b(), fVar.m13310d(), fVar.m13311e())) {
                return null;
            }
        }
        return Typeface.create(m15886a(m15889b), i);
    }

    @Override // p000.C3458y0
    /* renamed from: a */
    public Typeface mo15890a(Context context, C2917m0.b bVar, Resources resources, int i) {
        Object m15889b = m15889b();
        for (C2917m0.c cVar : bVar.m13967a()) {
            ByteBuffer m16690a = C3507z0.m16690a(context, resources, cVar.m13969b());
            if (m16690a == null || !m15888a(m15889b, m16690a, cVar.m13970c(), cVar.m13972e(), cVar.m13973f())) {
                return null;
            }
        }
        return m15886a(m15889b);
    }
}
