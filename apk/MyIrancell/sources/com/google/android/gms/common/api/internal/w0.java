package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public interface w0 {
    <A extends a.b, T extends d<? extends com.google.android.gms.common.api.m, A>> T a(T t);

    void a();

    void a(int i);

    void a(ConnectionResult connectionResult, com.google.android.gms.common.api.a<?> aVar, boolean z);

    <A extends a.b, R extends com.google.android.gms.common.api.m, T extends d<R, A>> T b(T t);

    void b(Bundle bundle);

    boolean b();

    void c();
}
