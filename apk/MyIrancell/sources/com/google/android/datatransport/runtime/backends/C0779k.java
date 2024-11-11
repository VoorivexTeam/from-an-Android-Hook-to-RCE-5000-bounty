package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.backends.k */
/* loaded from: classes.dex */
class C0779k implements InterfaceC0773e {

    /* renamed from: a */
    private final a f5388a;

    /* renamed from: b */
    private final C0777i f5389b;

    /* renamed from: c */
    private final Map<String, InterfaceC0781m> f5390c;

    /* renamed from: com.google.android.datatransport.runtime.backends.k$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        private final Context f5391a;

        /* renamed from: b */
        private Map<String, String> f5392b = null;

        a(Context context) {
            this.f5391a = context;
        }

        /* renamed from: a */
        private Map<String, String> m6286a() {
            if (this.f5392b == null) {
                this.f5392b = m6287a(this.f5391a);
            }
            return this.f5392b;
        }

        /* renamed from: a */
        private Map<String, String> m6287a(Context context) {
            Bundle m6288b = m6288b(context);
            if (m6288b == null) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : m6288b.keySet()) {
                Object obj = m6288b.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: b */
        private static Bundle m6288b(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: a */
        InterfaceC0772d m6289a(String str) {
            String str2 = m6286a().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC0772d) Class.forName(str2).asSubclass(InterfaceC0772d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not found.", str2);
                return null;
            } catch (IllegalAccessException unused2) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (InstantiationException unused3) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (NoSuchMethodException unused4) {
                String.format("Could not instantiate %s", str2);
                return null;
            } catch (InvocationTargetException unused5) {
                String.format("Could not instantiate %s", str2);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0779k(Context context, C0777i c0777i) {
        this(new a(context), c0777i);
    }

    C0779k(a aVar, C0777i c0777i) {
        this.f5390c = new HashMap();
        this.f5388a = aVar;
        this.f5389b = c0777i;
    }

    @Override // com.google.android.datatransport.runtime.backends.InterfaceC0773e
    /* renamed from: a */
    public synchronized InterfaceC0781m mo6278a(String str) {
        if (this.f5390c.containsKey(str)) {
            return this.f5390c.get(str);
        }
        InterfaceC0772d m6289a = this.f5388a.m6289a(str);
        if (m6289a == null) {
            return null;
        }
        InterfaceC0781m create = m6289a.create(this.f5389b.m6284a(str));
        this.f5390c.put(str, create);
        return create;
    }
}
