package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.measurement.o2 */
/* loaded from: classes.dex */
final class C1404o2<T> implements InterfaceC1374m2<T>, Serializable {

    /* renamed from: b */
    private final InterfaceC1374m2<T> f6787b;

    /* renamed from: c */
    private volatile transient boolean f6788c;

    /* renamed from: d */
    @NullableDecl
    private transient T f6789d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1404o2(InterfaceC1374m2<T> interfaceC1374m2) {
        C1329j2.m7936a(interfaceC1374m2);
        this.f6787b = interfaceC1374m2;
    }

    public final String toString() {
        Object obj;
        if (this.f6788c) {
            String valueOf = String.valueOf(this.f6789d);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f6787b;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1374m2
    public final T zza() {
        if (!this.f6788c) {
            synchronized (this) {
                if (!this.f6788c) {
                    T zza = this.f6787b.zza();
                    this.f6789d = zza;
                    this.f6788c = true;
                    return zza;
                }
            }
        }
        return this.f6789d;
    }
}
