package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class o2<T> implements m2<T>, Serializable {
    private final m2<T> b;
    private volatile transient boolean c;

    @NullableDecl
    private transient T d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o2(m2<T> m2Var) {
        j2.a(m2Var);
        this.b = m2Var;
    }

    public final String toString() {
        Object obj;
        if (this.c) {
            String valueOf = String.valueOf(this.d);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.b;
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
                    return zza;
                }
            }
        }
        return this.d;
    }
}
