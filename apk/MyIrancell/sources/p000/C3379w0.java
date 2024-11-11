package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p000.C2796j1;
import p000.C2917m0;

/* renamed from: w0 */
/* loaded from: classes.dex */
public class C3379w0 extends C3282u0 {

    /* renamed from: a */
    protected final Class f13722a;

    /* renamed from: b */
    protected final Constructor f13723b;

    /* renamed from: c */
    protected final Method f13724c;

    /* renamed from: d */
    protected final Method f13725d;

    /* renamed from: e */
    protected final Method f13726e;

    /* renamed from: f */
    protected final Method f13727f;

    /* renamed from: g */
    protected final Method f13728g;

    public C3379w0() {
        Method method;
        Constructor constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class cls = null;
        try {
            Class m16091a = m16091a();
            constructor = m16096e(m16091a);
            method2 = m16093b(m16091a);
            method3 = m16094c(m16091a);
            method4 = m16097f(m16091a);
            method5 = m16092a(m16091a);
            method = mo16095d(m16091a);
            cls = m16091a;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            String str = "Unable to collect necessary methods for class " + e.getClass().getName();
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f13722a = cls;
        this.f13723b = constructor;
        this.f13724c = method2;
        this.f13725d = method3;
        this.f13726e = method4;
        this.f13727f = method5;
        this.f13728g = method;
    }

    /* renamed from: a */
    private boolean m16083a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f13724c.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private boolean m16084a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f13725d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private void m16085b(Object obj) {
        try {
            this.f13727f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private boolean m16086b() {
        Method method = this.f13724c;
        return this.f13724c != null;
    }

    /* renamed from: c */
    private Object m16087c() {
        try {
            return this.f13723b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private boolean m16088c(Object obj) {
        try {
            return ((Boolean) this.f13726e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000.C3458y0
    /* renamed from: a */
    public Typeface mo16089a(Context context, Resources resources, int i, String str, int i2) {
        if (!m16086b()) {
            return super.mo16089a(context, resources, i, str, i2);
        }
        Object m16087c = m16087c();
        if (!m16083a(context, m16087c, str, 0, -1, -1, null)) {
            m16085b(m16087c);
            return null;
        }
        if (m16088c(m16087c)) {
            return mo16090a(m16087c);
        }
        return null;
    }

    @Override // p000.C3282u0, p000.C3458y0
    /* renamed from: a */
    public Typeface mo15700a(Context context, CancellationSignal cancellationSignal, C2796j1.f[] fVarArr, int i) {
        if (fVarArr.length < 1) {
            return null;
        }
        if (m16086b()) {
            Map<Uri, ByteBuffer> m13300a = C2796j1.m13300a(context, fVarArr, cancellationSignal);
            Object m16087c = m16087c();
            boolean z = false;
            for (C2796j1.f fVar : fVarArr) {
                ByteBuffer byteBuffer = m13300a.get(fVar.m13309c());
                if (byteBuffer != null) {
                    if (!m16084a(m16087c, byteBuffer, fVar.m13308b(), fVar.m13310d(), fVar.m13311e() ? 1 : 0)) {
                        m16085b(m16087c);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m16085b(m16087c);
                return null;
            }
            if (m16088c(m16087c)) {
                return Typeface.create(mo16090a(m16087c), i);
            }
            return null;
        }
        C2796j1.f m16533a = m16533a(fVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(m16533a.m13309c(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(m16533a.m13310d()).setItalic(m16533a.m13311e()).build();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return build;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // p000.C3458y0
    /* renamed from: a */
    public Typeface mo15890a(Context context, C2917m0.b bVar, Resources resources, int i) {
        if (!m16086b()) {
            return super.mo15890a(context, bVar, resources, i);
        }
        Object m16087c = m16087c();
        for (C2917m0.c cVar : bVar.m13967a()) {
            if (!m16083a(context, m16087c, cVar.m13968a(), cVar.m13970c(), cVar.m13972e(), cVar.m13973f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.m13971d()))) {
                m16085b(m16087c);
                return null;
            }
        }
        if (m16088c(m16087c)) {
            return mo16090a(m16087c);
        }
        return null;
    }

    /* renamed from: a */
    protected Typeface mo16090a(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f13722a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f13728g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    protected Class m16091a() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: a */
    protected Method m16092a(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: b */
    protected Method m16093b(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: c */
    protected Method m16094c(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: d */
    protected Method mo16095d(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: e */
    protected Constructor m16096e(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* renamed from: f */
    protected Method m16097f(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
