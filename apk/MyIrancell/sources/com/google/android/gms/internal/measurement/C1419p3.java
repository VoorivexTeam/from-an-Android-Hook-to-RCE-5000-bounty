package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.p3 */
/* loaded from: classes.dex */
public final class C1419p3 {

    /* renamed from: a */
    private final AbstractC1503v3 f6829a;

    /* renamed from: b */
    private final byte[] f6830b;

    private C1419p3(int i) {
        byte[] bArr = new byte[i];
        this.f6830b = bArr;
        this.f6829a = AbstractC1503v3.m8533a(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1419p3(int i, C1285g3 c1285g3) {
        this(i);
    }

    /* renamed from: a */
    public final AbstractC1300h3 m8173a() {
        this.f6829a.m8599b();
        return new C1447r3(this.f6830b);
    }

    /* renamed from: b */
    public final AbstractC1503v3 m8174b() {
        return this.f6829a;
    }
}
