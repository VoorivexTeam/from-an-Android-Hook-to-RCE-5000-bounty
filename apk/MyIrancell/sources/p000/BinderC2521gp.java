package p000;

import android.os.IBinder;
import java.lang.reflect.Field;
import p000.InterfaceC2481fp;

/* renamed from: gp */
/* loaded from: classes.dex */
public final class BinderC2521gp<T> extends InterfaceC2481fp.a {

    /* renamed from: a */
    private final T f10335a;

    private BinderC2521gp(T t) {
        this.f10335a = t;
    }

    /* renamed from: a */
    public static <T> InterfaceC2481fp m12036a(T t) {
        return new BinderC2521gp(t);
    }

    /* renamed from: a */
    public static <T> T m12037a(InterfaceC2481fp interfaceC2481fp) {
        if (interfaceC2481fp instanceof BinderC2521gp) {
            return ((BinderC2521gp) interfaceC2481fp).f10335a;
        }
        IBinder asBinder = interfaceC2481fp.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
