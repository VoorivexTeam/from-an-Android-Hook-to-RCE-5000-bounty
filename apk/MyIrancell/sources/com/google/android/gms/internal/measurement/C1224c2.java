package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.C0500c0;

/* renamed from: com.google.android.gms.internal.measurement.c2 */
/* loaded from: classes.dex */
public final class C1224c2 implements InterfaceC1388n1 {

    /* renamed from: f */
    private static final Map<String, C1224c2> f6535f = new C0500c0();

    /* renamed from: a */
    private final SharedPreferences f6536a;

    /* renamed from: d */
    private volatile Map<String, ?> f6539d;

    /* renamed from: b */
    private final SharedPreferences.OnSharedPreferenceChangeListener f6537b = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: com.google.android.gms.internal.measurement.f2

        /* renamed from: a */
        private final C1224c2 f6610a;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.f6610a = this;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            this.f6610a.m7695a(sharedPreferences, str);
        }
    };

    /* renamed from: c */
    private final Object f6538c = new Object();

    /* renamed from: e */
    private final List<InterfaceC1343k1> f6540e = new ArrayList();

    private C1224c2(SharedPreferences sharedPreferences) {
        this.f6536a = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.f6537b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1224c2 m7691a(Context context, String str) {
        C1224c2 c1224c2;
        if (!((!C1268f1.m7815a() || str.startsWith("direct_boot:")) ? true : C1268f1.m7816a(context))) {
            return null;
        }
        synchronized (C1224c2.class) {
            c1224c2 = f6535f.get(str);
            if (c1224c2 == null) {
                c1224c2 = new C1224c2(m7693b(context, str));
                f6535f.put(str, c1224c2);
            }
        }
        return c1224c2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized void m7692a() {
        synchronized (C1224c2.class) {
            for (C1224c2 c1224c2 : f6535f.values()) {
                c1224c2.f6536a.unregisterOnSharedPreferenceChangeListener(c1224c2.f6537b);
            }
            f6535f.clear();
        }
    }

    /* renamed from: b */
    private static SharedPreferences m7693b(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                return context.getSharedPreferences(str, 0);
            }
            if (C1268f1.m7815a()) {
                context = context.createDeviceProtectedStorageContext();
            }
            return context.getSharedPreferences(str.substring(12), 0);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1388n1
    /* renamed from: a */
    public final Object mo7694a(String str) {
        Map<String, ?> map = this.f6539d;
        if (map == null) {
            synchronized (this.f6538c) {
                map = this.f6539d;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.f6536a.getAll();
                        this.f6539d = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void m7695a(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f6538c) {
            this.f6539d = null;
            AbstractC1529x1.m8875c();
        }
        synchronized (this) {
            Iterator<InterfaceC1343k1> it = this.f6540e.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }
}
