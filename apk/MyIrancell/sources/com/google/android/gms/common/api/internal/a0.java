package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class a0 extends com.google.android.gms.common.api.f {
    private final String b;

    public a0(String str) {
        this.b = str;
    }

    @Override // com.google.android.gms.common.api.f
    public ConnectionResult a() {
        throw new UnsupportedOperationException(this.b);
    }

    @Override // com.google.android.gms.common.api.f
    public void a(f.c cVar) {
        throw new UnsupportedOperationException(this.b);
    }

    @Override // com.google.android.gms.common.api.f
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw new UnsupportedOperationException(this.b);
    }

    @Override // com.google.android.gms.common.api.f
    public com.google.android.gms.common.api.h<Status> b() {
        throw new UnsupportedOperationException(this.b);
    }

    @Override // com.google.android.gms.common.api.f
    public void b(f.c cVar) {
        throw new UnsupportedOperationException(this.b);
    }

    @Override // com.google.android.gms.common.api.f
    public void c() {
        throw new UnsupportedOperationException(this.b);
    }

    @Override // com.google.android.gms.common.api.f
    public void d() {
        throw new UnsupportedOperationException(this.b);
    }
}
