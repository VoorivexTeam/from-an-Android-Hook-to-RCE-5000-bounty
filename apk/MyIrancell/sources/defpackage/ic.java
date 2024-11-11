package defpackage;

/* loaded from: classes.dex */
public final class ic implements ac<int[]> {
    @Override // defpackage.ac
    public int a(int[] iArr) {
        return iArr.length;
    }

    @Override // defpackage.ac
    public String a() {
        return "IntegerArrayPool";
    }

    @Override // defpackage.ac
    public int b() {
        return 4;
    }

    @Override // defpackage.ac
    public int[] newArray(int i) {
        return new int[i];
    }
}
