package defpackage;

/* loaded from: classes.dex */
public final class q20 {
    private final r20 a = r20.f;

    private int[] a(s20 s20Var) {
        int a = s20Var.a();
        int[] iArr = new int[a];
        int i = 0;
        for (int i2 = 1; i2 < this.a.b() && i < a; i2++) {
            if (s20Var.a(i2) == 0) {
                iArr[i] = this.a.b(i2);
                i++;
            }
        }
        if (i == a) {
            return iArr;
        }
        throw vv.a();
    }

    private int[] a(s20 s20Var, s20 s20Var2, int[] iArr) {
        int a = s20Var2.a();
        int[] iArr2 = new int[a];
        for (int i = 1; i <= a; i++) {
            iArr2[a - i] = this.a.c(i, s20Var2.b(i));
        }
        s20 s20Var3 = new s20(this.a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int b = this.a.b(iArr[i2]);
            iArr3[i2] = this.a.c(this.a.d(0, s20Var.a(b)), this.a.b(s20Var3.a(b)));
        }
        return iArr3;
    }

    private s20[] a(s20 s20Var, s20 s20Var2, int i) {
        if (s20Var.a() < s20Var2.a()) {
            s20Var2 = s20Var;
            s20Var = s20Var2;
        }
        s20 c = this.a.c();
        s20 a = this.a.a();
        while (true) {
            s20 s20Var3 = s20Var2;
            s20Var2 = s20Var;
            s20Var = s20Var3;
            s20 s20Var4 = a;
            s20 s20Var5 = c;
            c = s20Var4;
            if (s20Var.a() < i / 2) {
                int b = c.b(0);
                if (b == 0) {
                    throw vv.a();
                }
                int b2 = this.a.b(b);
                return new s20[]{c.c(b2), s20Var.c(b2)};
            }
            if (s20Var.b()) {
                throw vv.a();
            }
            s20 c2 = this.a.c();
            int b3 = this.a.b(s20Var.b(s20Var.a()));
            while (s20Var2.a() >= s20Var.a() && !s20Var2.b()) {
                int a2 = s20Var2.a() - s20Var.a();
                int c3 = this.a.c(s20Var2.b(s20Var2.a()), b3);
                c2 = c2.a(this.a.b(a2, c3));
                s20Var2 = s20Var2.c(s20Var.a(a2, c3));
            }
            a = c2.b(c).c(s20Var5).c();
        }
    }

    public int a(int[] iArr, int i, int[] iArr2) {
        s20 s20Var = new s20(this.a, iArr);
        int[] iArr3 = new int[i];
        boolean z = false;
        for (int i2 = i; i2 > 0; i2--) {
            int a = s20Var.a(this.a.a(i2));
            iArr3[i - i2] = a;
            if (a != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        s20 a2 = this.a.a();
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                int a3 = this.a.a((iArr.length - 1) - i3);
                r20 r20Var = this.a;
                a2 = a2.b(new s20(r20Var, new int[]{r20Var.d(0, a3), 1}));
            }
        }
        s20[] a4 = a(this.a.b(i, 1), new s20(this.a, iArr3), i);
        s20 s20Var2 = a4[0];
        s20 s20Var3 = a4[1];
        int[] a5 = a(s20Var2);
        int[] a6 = a(s20Var3, s20Var2, a5);
        for (int i4 = 0; i4 < a5.length; i4++) {
            int length = (iArr.length - 1) - this.a.c(a5[i4]);
            if (length < 0) {
                throw vv.a();
            }
            iArr[length] = this.a.d(iArr[length], a6[i4]);
        }
        return a5.length;
    }
}
