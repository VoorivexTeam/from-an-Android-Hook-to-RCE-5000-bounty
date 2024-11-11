package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o6 implements v5 {
    private final x5 a;
    private final String b;
    private final Object[] c;
    private final int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o6(x5 x5Var, String str, Object[] objArr) {
        this.a = x5Var;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.measurement.v5
    public final x5 b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] c() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.measurement.v5
    public final int zza() {
        return (this.d & 1) == 1 ? o4.f.i : o4.f.j;
    }

    @Override // com.google.android.gms.internal.measurement.v5
    public final boolean zzb() {
        return (this.d & 2) == 2;
    }
}
