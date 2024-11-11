package defpackage;

/* loaded from: classes.dex */
public final class wz {
    private final uz a;

    public wz(uz uzVar) {
        this.a = uzVar;
    }

    private int[] a(vz vzVar) {
        int a = vzVar.a();
        int i = 0;
        if (a == 1) {
            return new int[]{vzVar.b(1)};
        }
        int[] iArr = new int[a];
        for (int i2 = 1; i2 < this.a.c() && i < a; i2++) {
            if (vzVar.a(i2) == 0) {
                iArr[i] = this.a.b(i2);
                i++;
            }
        }
        if (i == a) {
            return iArr;
        }
        throw new xz("Error locator degree does not match number of roots");
    }

    private int[] a(vz vzVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int b = this.a.b(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int b2 = this.a.b(iArr[i3], b);
                    i2 = this.a.b(i2, (b2 & 1) == 0 ? b2 | 1 : b2 & (-2));
                }
            }
            iArr2[i] = this.a.b(vzVar.a(b), this.a.b(i2));
            if (this.a.a() != 0) {
                iArr2[i] = this.a.b(iArr2[i], b);
            }
        }
        return iArr2;
    }

    private vz[] a(vz vzVar, vz vzVar2, int i) {
        if (vzVar.a() < vzVar2.a()) {
            vzVar2 = vzVar;
            vzVar = vzVar2;
        }
        vz d = this.a.d();
        vz b = this.a.b();
        do {
            vz vzVar3 = vzVar2;
            vzVar2 = vzVar;
            vzVar = vzVar3;
            vz vzVar4 = b;
            vz vzVar5 = d;
            d = vzVar4;
            if (vzVar.a() < i / 2) {
                int b2 = d.b(0);
                if (b2 == 0) {
                    throw new xz("sigmaTilde(0) was zero");
                }
                int b3 = this.a.b(b2);
                return new vz[]{d.c(b3), vzVar.c(b3)};
            }
            if (vzVar.b()) {
                throw new xz("r_{i-1} was zero");
            }
            vz d2 = this.a.d();
            int b4 = this.a.b(vzVar.b(vzVar.a()));
            while (vzVar2.a() >= vzVar.a() && !vzVar2.b()) {
                int a = vzVar2.a() - vzVar.a();
                int b5 = this.a.b(vzVar2.b(vzVar2.a()), b4);
                d2 = d2.a(this.a.a(a, b5));
                vzVar2 = vzVar2.a(vzVar.a(a, b5));
            }
            b = d2.b(d).a(vzVar5);
        } while (vzVar2.a() < vzVar.a());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    public void a(int[] iArr, int i) {
        vz vzVar = new vz(this.a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            uz uzVar = this.a;
            int a = vzVar.a(uzVar.a(uzVar.a() + i2));
            iArr2[(i - 1) - i2] = a;
            if (a != 0) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        vz[] a2 = a(this.a.a(i, 1), new vz(this.a, iArr2), i);
        vz vzVar2 = a2[0];
        vz vzVar3 = a2[1];
        int[] a3 = a(vzVar2);
        int[] a4 = a(vzVar3, a3);
        for (int i3 = 0; i3 < a3.length; i3++) {
            int length = (iArr.length - 1) - this.a.c(a3[i3]);
            if (length < 0) {
                throw new xz("Bad error location");
            }
            iArr[length] = uz.c(iArr[length], a4[i3]);
        }
    }
}
