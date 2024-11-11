package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.o6 */
/* loaded from: classes.dex */
public final class C1408o6 implements InterfaceC1505v5 {

    /* renamed from: a */
    private final InterfaceC1533x5 f6807a;

    /* renamed from: b */
    private final String f6808b;

    /* renamed from: c */
    private final Object[] f6809c;

    /* renamed from: d */
    private final int f6810d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1408o6(InterfaceC1533x5 interfaceC1533x5, String str, Object[] objArr) {
        this.f6807a = interfaceC1533x5;
        this.f6808b = str;
        this.f6809c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f6810d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.f6810d = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final String m8113a() {
        return this.f6808b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1505v5
    /* renamed from: b */
    public final InterfaceC1533x5 mo7630b() {
        return this.f6807a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object[] m8114c() {
        return this.f6809c;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1505v5
    public final int zza() {
        return (this.f6810d & 1) == 1 ? AbstractC1406o4.f.f6801i : AbstractC1406o4.f.f6802j;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1505v5
    public final boolean zzb() {
        return (this.f6810d & 2) == 2;
    }
}
