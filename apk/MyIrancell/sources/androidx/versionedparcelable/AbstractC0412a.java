package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.versionedparcelable.a */
/* loaded from: classes.dex */
public abstract class AbstractC0412a {
    /* renamed from: a */
    protected static <T extends InterfaceC0414c> T m3072a(String str, AbstractC0412a abstractC0412a) {
        try {
            return (T) Class.forName(str, true, AbstractC0412a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0412a.class).invoke(null, abstractC0412a);
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

    /* renamed from: a */
    private static Class m3073a(Class<? extends InterfaceC0414c> cls) {
        return Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
    }

    /* renamed from: a */
    protected static <T extends InterfaceC0414c> void m3074a(T t, AbstractC0412a abstractC0412a) {
        try {
            m3075b(t).getDeclaredMethod("write", t.getClass(), AbstractC0412a.class).invoke(null, t, abstractC0412a);
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

    /* renamed from: b */
    private static <T extends InterfaceC0414c> Class m3075b(T t) {
        return m3073a((Class<? extends InterfaceC0414c>) t.getClass());
    }

    /* renamed from: c */
    private void m3076c(InterfaceC0414c interfaceC0414c) {
        try {
            mo3084a(m3073a((Class<? extends InterfaceC0414c>) interfaceC0414c.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(interfaceC0414c.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: a */
    public int m3077a(int i, int i2) {
        return !mo3087a(i2) ? i : mo3099e();
    }

    /* renamed from: a */
    public <T extends Parcelable> T m3078a(T t, int i) {
        return !mo3087a(i) ? t : (T) mo3100f();
    }

    /* renamed from: a */
    public <T extends InterfaceC0414c> T m3079a(T t, int i) {
        return !mo3087a(i) ? t : (T) m3102h();
    }

    /* renamed from: a */
    public String m3080a(String str, int i) {
        return !mo3087a(i) ? str : mo3101g();
    }

    /* renamed from: a */
    protected abstract void mo3081a();

    /* renamed from: a */
    protected abstract void mo3082a(Parcelable parcelable);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m3083a(InterfaceC0414c interfaceC0414c) {
        if (interfaceC0414c == null) {
            mo3084a((String) null);
            return;
        }
        m3076c(interfaceC0414c);
        AbstractC0412a mo3089b = mo3089b();
        m3074a(interfaceC0414c, mo3089b);
        mo3089b.mo3081a();
    }

    /* renamed from: a */
    protected abstract void mo3084a(String str);

    /* renamed from: a */
    public void m3085a(boolean z, boolean z2) {
    }

    /* renamed from: a */
    protected abstract void mo3086a(byte[] bArr);

    /* renamed from: a */
    protected abstract boolean mo3087a(int i);

    /* renamed from: a */
    public byte[] m3088a(byte[] bArr, int i) {
        return !mo3087a(i) ? bArr : mo3098d();
    }

    /* renamed from: b */
    protected abstract AbstractC0412a mo3089b();

    /* renamed from: b */
    protected abstract void mo3090b(int i);

    /* renamed from: b */
    public void m3091b(int i, int i2) {
        mo3090b(i2);
        mo3096c(i);
    }

    /* renamed from: b */
    public void m3092b(Parcelable parcelable, int i) {
        mo3090b(i);
        mo3082a(parcelable);
    }

    /* renamed from: b */
    public void m3093b(InterfaceC0414c interfaceC0414c, int i) {
        mo3090b(i);
        m3083a(interfaceC0414c);
    }

    /* renamed from: b */
    public void m3094b(String str, int i) {
        mo3090b(i);
        mo3084a(str);
    }

    /* renamed from: b */
    public void m3095b(byte[] bArr, int i) {
        mo3090b(i);
        mo3086a(bArr);
    }

    /* renamed from: c */
    protected abstract void mo3096c(int i);

    /* renamed from: c */
    public boolean m3097c() {
        return false;
    }

    /* renamed from: d */
    protected abstract byte[] mo3098d();

    /* renamed from: e */
    protected abstract int mo3099e();

    /* renamed from: f */
    protected abstract <T extends Parcelable> T mo3100f();

    /* renamed from: g */
    protected abstract String mo3101g();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public <T extends InterfaceC0414c> T m3102h() {
        String mo3101g = mo3101g();
        if (mo3101g == null) {
            return null;
        }
        return (T) m3072a(mo3101g, mo3089b());
    }
}
