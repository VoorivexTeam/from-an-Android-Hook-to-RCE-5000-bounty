package p000;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class z90 {

    /* renamed from: a */
    private int f14412a;

    /* renamed from: b */
    private final int[] f14413b = new int[10];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m16900a(int i) {
        return this.f14413b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public z90 m16901a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f14413b;
            if (i < iArr.length) {
                this.f14412a = (1 << i) | this.f14412a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m16902a() {
        this.f14412a = 0;
        Arrays.fill(this.f14413b, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m16903a(z90 z90Var) {
        for (int i = 0; i < 10; i++) {
            if (z90Var.m16909d(i)) {
                m16901a(i, z90Var.m16900a(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m16904b() {
        if ((this.f14412a & 2) != 0) {
            return this.f14413b[1];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m16905b(int i) {
        return (this.f14412a & 16) != 0 ? this.f14413b[4] : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m16906c() {
        if ((this.f14412a & 128) != 0) {
            return this.f14413b[7];
        }
        return 65535;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m16907c(int i) {
        return (this.f14412a & 32) != 0 ? this.f14413b[5] : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m16908d() {
        return Integer.bitCount(this.f14412a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m16909d(int i) {
        return ((1 << i) & this.f14412a) != 0;
    }
}
