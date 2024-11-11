package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1196a4;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.n4 */
/* loaded from: classes.dex */
abstract class AbstractC1391n4<T extends C1196a4> {

    /* renamed from: a */
    private static final Logger f6766a = Logger.getLogger(AbstractC1503v3.class.getName());

    /* renamed from: b */
    private static String f6767b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    AbstractC1391n4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T extends C1196a4> T m8047a(Class<T> cls) {
        String format;
        ClassLoader classLoader = AbstractC1391n4.class.getClassLoader();
        if (cls.equals(C1196a4.class)) {
            format = f6767b;
        } else {
            if (!cls.getPackage().equals(AbstractC1391n4.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return cls.cast(((AbstractC1391n4) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).m8048a());
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (InstantiationException e3) {
                throw new IllegalStateException(e3);
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(AbstractC1391n4.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((AbstractC1391n4) it.next()).m8048a()));
                } catch (ServiceConfigurationError e5) {
                    Logger logger = f6766a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", valueOf.length() != 0 ? "Unable to load ".concat(valueOf) : new String("Unable to load "), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* renamed from: a */
    protected abstract T m8048a();
}
