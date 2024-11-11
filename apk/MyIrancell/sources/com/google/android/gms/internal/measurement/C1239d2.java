package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.d2 */
/* loaded from: classes.dex */
public final class C1239d2 {

    /* renamed from: a */
    final Uri f6558a;

    /* renamed from: b */
    final String f6559b;

    /* renamed from: c */
    final String f6560c;

    public C1239d2(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private C1239d2(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable InterfaceC1299h2<Context, Boolean> interfaceC1299h2) {
        this.f6558a = uri;
        this.f6559b = str2;
        this.f6560c = str3;
    }

    /* renamed from: a */
    public final AbstractC1529x1<Double> m7726a(String str, double d) {
        AbstractC1529x1<Double> m8871b;
        m8871b = AbstractC1529x1.m8871b(this, str, -3.0d);
        return m8871b;
    }

    /* renamed from: a */
    public final AbstractC1529x1<Long> m7727a(String str, long j) {
        AbstractC1529x1<Long> m8872b;
        m8872b = AbstractC1529x1.m8872b(this, str, j);
        return m8872b;
    }

    /* renamed from: a */
    public final AbstractC1529x1<String> m7728a(String str, String str2) {
        AbstractC1529x1<String> m8873b;
        m8873b = AbstractC1529x1.m8873b(this, str, str2);
        return m8873b;
    }

    /* renamed from: a */
    public final AbstractC1529x1<Boolean> m7729a(String str, boolean z) {
        AbstractC1529x1<Boolean> m8874b;
        m8874b = AbstractC1529x1.m8874b(this, str, z);
        return m8874b;
    }
}
