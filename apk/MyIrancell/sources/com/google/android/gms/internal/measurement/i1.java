package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i1 implements n1 {
    private static final Map<Uri, i1> g = new defpackage.c0();
    private static final String[] h = {"key", "value"};
    private final ContentResolver a;
    private final Uri b;
    private volatile Map<String, String> e;
    private final ContentObserver c = new l1(this, null);
    private final Object d = new Object();
    private final List<k1> f = new ArrayList();

    private i1(ContentResolver contentResolver, Uri uri) {
        this.a = contentResolver;
        this.b = uri;
        contentResolver.registerContentObserver(uri, false, this.c);
    }

    public static i1 a(ContentResolver contentResolver, Uri uri) {
        i1 i1Var;
        synchronized (i1.class) {
            i1Var = g.get(uri);
            if (i1Var == null) {
                try {
                    i1 i1Var2 = new i1(contentResolver, uri);
                    try {
                        g.put(uri, i1Var2);
                    } catch (SecurityException unused) {
                    }
                    i1Var = i1Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return i1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d() {
        synchronized (i1.class) {
            for (i1 i1Var : g.values()) {
                i1Var.a.unregisterContentObserver(i1Var.c);
            }
            g.clear();
        }
    }

    private final Map<String, String> e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Map<String, String> map = (Map) m1.a(new p1(this) { // from class: com.google.android.gms.internal.measurement.h1
                private final i1 a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = this;
                }

                @Override // com.google.android.gms.internal.measurement.p1
                public final Object zza() {
                    return this.a.c();
                }
            });
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return map;
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return null;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.n1
    public final /* synthetic */ Object a(String str) {
        return a().get(str);
    }

    public final Map<String, String> a() {
        Map<String, String> map = this.e;
        if (map == null) {
            synchronized (this.d) {
                map = this.e;
                if (map == null) {
                    map = e();
                    this.e = map;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    public final void b() {
        synchronized (this.d) {
            this.e = null;
            x1.c();
        }
        synchronized (this) {
            Iterator<k1> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map c() {
        Cursor query = this.a.query(this.b, h, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map c0Var = count <= 256 ? new defpackage.c0(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                c0Var.put(query.getString(0), query.getString(1));
            }
            return c0Var;
        } finally {
            query.close();
        }
    }
}
