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
import p000.C0500c0;

/* renamed from: com.google.android.gms.internal.measurement.i1 */
/* loaded from: classes.dex */
public final class C1313i1 implements InterfaceC1388n1 {

    /* renamed from: g */
    private static final Map<Uri, C1313i1> f6655g = new C0500c0();

    /* renamed from: h */
    private static final String[] f6656h = {"key", "value"};

    /* renamed from: a */
    private final ContentResolver f6657a;

    /* renamed from: b */
    private final Uri f6658b;

    /* renamed from: e */
    private volatile Map<String, String> f6661e;

    /* renamed from: c */
    private final ContentObserver f6659c = new C1358l1(this, null);

    /* renamed from: d */
    private final Object f6660d = new Object();

    /* renamed from: f */
    private final List<InterfaceC1343k1> f6662f = new ArrayList();

    private C1313i1(ContentResolver contentResolver, Uri uri) {
        this.f6657a = contentResolver;
        this.f6658b = uri;
        contentResolver.registerContentObserver(uri, false, this.f6659c);
    }

    /* renamed from: a */
    public static C1313i1 m7911a(ContentResolver contentResolver, Uri uri) {
        C1313i1 c1313i1;
        synchronized (C1313i1.class) {
            c1313i1 = f6655g.get(uri);
            if (c1313i1 == null) {
                try {
                    C1313i1 c1313i12 = new C1313i1(contentResolver, uri);
                    try {
                        f6655g.put(uri, c1313i12);
                    } catch (SecurityException unused) {
                    }
                    c1313i1 = c1313i12;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c1313i1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static synchronized void m7912d() {
        synchronized (C1313i1.class) {
            for (C1313i1 c1313i1 : f6655g.values()) {
                c1313i1.f6657a.unregisterContentObserver(c1313i1.f6659c);
            }
            f6655g.clear();
        }
    }

    /* renamed from: e */
    private final Map<String, String> m7913e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Map<String, String> map = (Map) C1373m1.m8020a(new InterfaceC1417p1(this) { // from class: com.google.android.gms.internal.measurement.h1

                /* renamed from: a */
                private final C1313i1 f6634a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f6634a = this;
                }

                @Override // com.google.android.gms.internal.measurement.InterfaceC1417p1
                public final Object zza() {
                    return this.f6634a.m7916c();
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

    @Override // com.google.android.gms.internal.measurement.InterfaceC1388n1
    /* renamed from: a */
    public final /* synthetic */ Object mo7694a(String str) {
        return m7914a().get(str);
    }

    /* renamed from: a */
    public final Map<String, String> m7914a() {
        Map<String, String> map = this.f6661e;
        if (map == null) {
            synchronized (this.f6660d) {
                map = this.f6661e;
                if (map == null) {
                    map = m7913e();
                    this.f6661e = map;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    /* renamed from: b */
    public final void m7915b() {
        synchronized (this.f6660d) {
            this.f6661e = null;
            AbstractC1529x1.m8875c();
        }
        synchronized (this) {
            Iterator<InterfaceC1343k1> it = this.f6662f.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Map m7916c() {
        Cursor query = this.f6657a.query(this.f6658b, f6656h, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map c0500c0 = count <= 256 ? new C0500c0(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                c0500c0.put(query.getString(0), query.getString(1));
            }
            return c0500c0;
        } finally {
            query.close();
        }
    }
}
