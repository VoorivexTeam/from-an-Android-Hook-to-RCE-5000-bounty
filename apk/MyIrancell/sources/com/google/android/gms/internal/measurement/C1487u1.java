package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p000.C0500c0;

/* renamed from: com.google.android.gms.internal.measurement.u1 */
/* loaded from: classes.dex */
public final class C1487u1 {

    /* renamed from: a */
    private static final C0500c0<String, Uri> f6949a = new C0500c0<>();

    /* renamed from: a */
    public static synchronized Uri m8491a(String str) {
        Uri uri;
        synchronized (C1487u1.class) {
            uri = f6949a.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                f6949a.put(str, uri);
            }
        }
        return uri;
    }
}
