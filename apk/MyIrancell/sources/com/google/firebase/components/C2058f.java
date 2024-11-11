package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.components.f */
/* loaded from: classes.dex */
public final class C2058f<T> {

    /* renamed from: a */
    private final T f8820a;

    /* renamed from: b */
    private final c<T> f8821b;

    /* renamed from: com.google.firebase.components.f$b */
    /* loaded from: classes.dex */
    private static class b implements c<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f8822a;

        private b(Class<? extends Service> cls) {
            this.f8822a = cls;
        }

        /* renamed from: b */
        private Bundle m10548b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f8822a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                String str = this.f8822a + " has no service info.";
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @Override // com.google.firebase.components.C2058f.c
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public List<String> mo10549a(Context context) {
            Bundle m10548b = m10548b(context);
            if (m10548b == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m10548b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(m10548b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.google.firebase.components.f$c */
    /* loaded from: classes.dex */
    interface c<T> {
        /* renamed from: a */
        List<String> mo10549a(T t);
    }

    C2058f(T t, c<T> cVar) {
        this.f8820a = t;
        this.f8821b = cVar;
    }

    /* renamed from: a */
    public static C2058f<Context> m10545a(Context context, Class<? extends Service> cls) {
        return new C2058f<>(context, new b(cls));
    }

    /* renamed from: a */
    private static List<InterfaceC2060h> m10546a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                Class<?> cls = Class.forName(str);
                if (InterfaceC2060h.class.isAssignableFrom(cls)) {
                    arrayList.add((InterfaceC2060h) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } else {
                    String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar");
                }
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not an found.", str);
            } catch (IllegalAccessException unused2) {
                String.format("Could not instantiate %s.", str);
            } catch (InstantiationException unused3) {
                String.format("Could not instantiate %s.", str);
            } catch (NoSuchMethodException unused4) {
                String.format("Could not instantiate %s", str);
            } catch (InvocationTargetException unused5) {
                String.format("Could not instantiate %s", str);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<InterfaceC2060h> m10547a() {
        return m10546a(this.f8821b.mo10549a(this.f8820a));
    }
}
