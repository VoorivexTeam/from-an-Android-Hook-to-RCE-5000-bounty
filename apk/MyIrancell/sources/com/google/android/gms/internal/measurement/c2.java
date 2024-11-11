package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c2 implements n1 {
    private static final Map<String, c2> f = new defpackage.c0();
    private final SharedPreferences a;
    private volatile Map<String, ?> d;
    private final SharedPreferences.OnSharedPreferenceChangeListener b = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: com.google.android.gms.internal.measurement.f2
        private final c2 a;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.a = this;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            this.a.a(sharedPreferences, str);
        }
    };
    private final Object c = new Object();
    private final List<k1> e = new ArrayList();

    private c2(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c2 a(Context context, String str) {
        c2 c2Var;
        if (!((!f1.a() || str.startsWith("direct_boot:")) ? true : f1.a(context))) {
            return null;
        }
        synchronized (c2.class) {
            c2Var = f.get(str);
            if (c2Var == null) {
                c2Var = new c2(b(context, str));
                f.put(str, c2Var);
            }
        }
        return c2Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a() {
        synchronized (c2.class) {
            for (c2 c2Var : f.values()) {
                c2Var.a.unregisterOnSharedPreferenceChangeListener(c2Var.b);
            }
            f.clear();
        }
    }

    private static SharedPreferences b(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                return context.getSharedPreferences(str, 0);
            }
            if (f1.a()) {
                context = context.createDeviceProtectedStorageContext();
            }
            return context.getSharedPreferences(str.substring(12), 0);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @Override // com.google.android.gms.internal.measurement.n1
    public final Object a(String str) {
        Map<String, ?> map = this.d;
        if (map == null) {
            synchronized (this.c) {
                map = this.d;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.a.getAll();
                        this.d = all;
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
    public final /* synthetic */ void a(SharedPreferences sharedPreferences, String str) {
        synchronized (this.c) {
            this.d = null;
            x1.c();
        }
        synchronized (this) {
            Iterator<k1> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }
}
