package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.u3 */
/* loaded from: classes.dex */
public final class C1489u3 extends AbstractC1475t3 {

    /* renamed from: a */
    private int f6951a;

    /* renamed from: b */
    private int f6952b;

    /* renamed from: c */
    private int f6953c;

    /* renamed from: d */
    private int f6954d;

    /* renamed from: e */
    private int f6955e;

    private C1489u3(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f6955e = Integer.MAX_VALUE;
        this.f6951a = i2 + i;
        this.f6953c = i;
        this.f6954d = i;
    }

    /* renamed from: b */
    private final void m8492b() {
        int i = this.f6951a + this.f6952b;
        this.f6951a = i;
        int i2 = i - this.f6954d;
        int i3 = this.f6955e;
        if (i2 <= i3) {
            this.f6952b = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f6952b = i4;
        this.f6951a = i - i4;
    }

    /* renamed from: a */
    public final int m8493a() {
        return this.f6953c - this.f6954d;
    }

    /* renamed from: b */
    public final int m8494b(int i) {
        if (i < 0) {
            throw C1518w4.m8631b();
        }
        int m8493a = i + m8493a();
        int i2 = this.f6955e;
        if (m8493a > i2) {
            throw C1518w4.m8630a();
        }
        this.f6955e = m8493a;
        m8492b();
        return i2;
    }
}
