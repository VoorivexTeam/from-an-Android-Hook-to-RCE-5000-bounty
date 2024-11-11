package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class fa0<T> {

    /* renamed from: a */
    private final Class<?> f10112a;

    /* renamed from: b */
    private final String f10113b;

    /* renamed from: c */
    private final Class[] f10114c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fa0(Class<?> cls, String str, Class... clsArr) {
        this.f10112a = cls;
        this.f10113b = str;
        this.f10114c = clsArr;
    }

    /* renamed from: a */
    private Method m11739a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f10113b;
        if (str == null) {
            return null;
        }
        Method m11740a = m11740a(cls, str, this.f10114c);
        if (m11740a == null || (cls2 = this.f10112a) == null || cls2.isAssignableFrom(m11740a.getReturnType())) {
            return m11740a;
        }
        return null;
    }

    /* renamed from: a */
    private static Method m11740a(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public Object m11741a(T t, Object... objArr) {
        Method m11739a = m11739a(t.getClass());
        if (m11739a == null) {
            throw new AssertionError("Method " + this.f10113b + " not supported for object " + t);
        }
        try {
            return m11739a.invoke(t, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + m11739a);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    /* renamed from: a */
    public boolean m11742a(T t) {
        return m11739a(t.getClass()) != null;
    }

    /* renamed from: b */
    public Object m11743b(T t, Object... objArr) {
        Method m11739a = m11739a(t.getClass());
        if (m11739a == null) {
            return null;
        }
        try {
            return m11739a.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public Object m11744c(T t, Object... objArr) {
        try {
            return m11743b(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: d */
    public Object m11745d(T t, Object... objArr) {
        try {
            return m11741a(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
