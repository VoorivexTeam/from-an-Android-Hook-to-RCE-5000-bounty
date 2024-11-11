package p000;

/* loaded from: classes.dex */
public enum b30 {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final b30[] FOR_BITS;
    private final int bits;

    static {
        b30 b30Var = H;
        b30 b30Var2 = L;
        FOR_BITS = new b30[]{M, b30Var2, b30Var, Q};
    }

    b30(int i) {
        this.bits = i;
    }

    public static b30 forBits(int i) {
        if (i >= 0) {
            b30[] b30VarArr = FOR_BITS;
            if (i < b30VarArr.length) {
                return b30VarArr[i];
            }
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.bits;
    }
}
