package defpackage;

import android.os.IBinder;
import defpackage.fp;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class gp<T> extends fp.a {
    private final T a;

    private gp(T t) {
        this.a = t;
    }

    public static <T> fp a(T t) {
        return new gp(t);
    }

    public static <T> T a(fp fpVar) {
        if (fpVar instanceof gp) {
            return ((gp) fpVar).a;
        }
        IBinder asBinder = fpVar.asBinder();
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
