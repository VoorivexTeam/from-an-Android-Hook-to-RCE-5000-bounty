package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.measurement.n2 */
/* loaded from: classes.dex */
final class C1389n2<T> implements InterfaceC1374m2<T> {

    /* renamed from: b */
    private volatile InterfaceC1374m2<T> f6763b;

    /* renamed from: c */
    private volatile boolean f6764c;

    /* renamed from: d */
    @NullableDecl
    private T f6765d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1389n2(InterfaceC1374m2<T> interfaceC1374m2) {
        C1329j2.m7936a(interfaceC1374m2);
        this.f6763b = interfaceC1374m2;
    }

    public final String toString() {
        Object obj = this.f6763b;
        if (obj == null) {
            String valueOf = String.valueOf(this.f6765d);
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

    @Override // com.google.android.gms.internal.measurement.InterfaceC1374m2
    public final T zza() {
        if (!this.f6764c) {
            synchronized (this) {
                if (!this.f6764c) {
                    T zza = this.f6763b.zza();
                    this.f6765d = zza;
                    this.f6764c = true;
                    this.f6763b = null;
                    return zza;
                }
            }
        }
        return this.f6765d;
    }
}
