package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes.dex */
public final class u1 {
    private static final defpackage.c0<String, Uri> a = new defpackage.c0<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (u1.class) {
            uri = a.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                a.put(str, uri);
            }
        }
        return uri;
    }
}
