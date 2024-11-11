package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public interface m1 {
    <A extends a.b, T extends d<? extends com.google.android.gms.common.api.m, A>> T a(T t);

    void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    boolean a();

    boolean a(o oVar);

    <A extends a.b, R extends com.google.android.gms.common.api.m, T extends d<R, A>> T b(T t);

    void b();

    void c();

    void d();

    ConnectionResult e();

    void f();
}
