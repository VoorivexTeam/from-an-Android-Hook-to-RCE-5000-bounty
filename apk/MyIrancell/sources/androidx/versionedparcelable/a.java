package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class a {
    protected static <T extends c> T a(String str, a aVar) {
        try {
            return (T) Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class).invoke(null, aVar);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    private static Class a(Class<? extends c> cls) {
        return Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
    }

    protected static <T extends c> void a(T t, a aVar) {
        try {
            b(t).getDeclaredMethod("write", t.getClass(), a.class).invoke(null, t, aVar);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    private static <T extends c> Class b(T t) {
        return a((Class<? extends c>) t.getClass());
    }

    private void c(c cVar) {
        try {
            a(a((Class<? extends c>) cVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    public int a(int i, int i2) {
        return !a(i2) ? i : e();
    }

    public <T extends Parcelable> T a(T t, int i) {
        return !a(i) ? t : (T) f();
    }

    public <T extends c> T a(T t, int i) {
        return !a(i) ? t : (T) h();
    }

    public String a(String str, int i) {
        return !a(i) ? str : g();
    }

    protected abstract void a();

    protected abstract void a(Parcelable parcelable);

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(c cVar) {
        if (cVar == null) {
            a((String) null);
            return;
        }
        c(cVar);
        a b = b();
        a(cVar, b);
        b.a();
    }

    protected abstract void a(String str);

    public void a(boolean z, boolean z2) {
    }

    protected abstract void a(byte[] bArr);

    protected abstract boolean a(int i);

    public byte[] a(byte[] bArr, int i) {
        return !a(i) ? bArr : d();
    }

    protected abstract a b();

    protected abstract void b(int i);

    public void b(int i, int i2) {
        b(i2);
        c(i);
    }

    public void b(Parcelable parcelable, int i) {
        b(i);
        a(parcelable);
    }

    public void b(c cVar, int i) {
        b(i);
        a(cVar);
    }

    public void b(String str, int i) {
        b(i);
        a(str);
    }

    public void b(byte[] bArr, int i) {
        b(i);
        a(bArr);
    }

    protected abstract void c(int i);

    public boolean c() {
        return false;
    }

    protected abstract byte[] d();

    protected abstract int e();

    protected abstract <T extends Parcelable> T f();

    protected abstract String g();

    /* JADX INFO: Access modifiers changed from: protected */
    public <T extends c> T h() {
        String g = g();
        if (g == null) {
            return null;
        }
        return (T) a(g, b());
    }
}
