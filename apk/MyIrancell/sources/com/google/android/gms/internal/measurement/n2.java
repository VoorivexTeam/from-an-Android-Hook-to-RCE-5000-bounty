package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class n2<T> implements m2<T> {
    private volatile m2<T> b;
    private volatile boolean c;

    @NullableDecl
    private T d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n2(m2<T> m2Var) {
        j2.a(m2Var);
        this.b = m2Var;
    }

    public final String toString() {
        Object obj = this.b;
        if (obj == null) {
            String valueOf = String.valueOf(this.d);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final T zza() {
        if (!this.c) {
            synchronized (this) {
                if (!this.c) {
                    T zza = this.b.zza();
                    this.d = zza;
                    this.c = true;
                    this.b = null;
                    return zza;
                }
            }
        }
        return this.d;
    }
}
