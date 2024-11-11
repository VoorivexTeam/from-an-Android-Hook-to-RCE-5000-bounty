package p000;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: x0 */
/* loaded from: classes.dex */
public class C3418x0 extends C3379w0 {
    @Override // p000.C3379w0
    /* renamed from: a */
    protected Typeface mo16090a(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f13722a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f13728g.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000.C3379w0
    /* renamed from: d */
    protected Method mo16095d(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
