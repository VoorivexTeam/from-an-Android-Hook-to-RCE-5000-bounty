package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class d2 {
    final Uri a;
    final String b;
    final String c;

    public d2(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private d2(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable h2<Context, Boolean> h2Var) {
        this.a = uri;
        this.b = str2;
        this.c = str3;
    }

    public final x1<Double> a(String str, double d) {
        x1<Double> b;
        b = x1.b(this, str, -3.0d);
        return b;
    }

    public final x1<Long> a(String str, long j) {
        x1<Long> b;
        b = x1.b(this, str, j);
        return b;
    }

    public final x1<String> a(String str, String str2) {
        x1<String> b;
        b = x1.b(this, str, str2);
        return b;
    }

    public final x1<Boolean> a(String str, boolean z) {
        x1<Boolean> b;
        b = x1.b(this, str, z);
        return b;
    }
}
