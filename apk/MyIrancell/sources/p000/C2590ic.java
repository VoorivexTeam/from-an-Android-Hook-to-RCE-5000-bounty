package p000;

/* renamed from: ic */
/* loaded from: classes.dex */
public final class C2590ic implements InterfaceC0016ac<int[]> {
    @Override // p000.InterfaceC0016ac
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo134a(int[] iArr) {
        return iArr.length;
    }

    @Override // p000.InterfaceC0016ac
    /* renamed from: a */
    public String mo135a() {
        return "IntegerArrayPool";
    }

    @Override // p000.InterfaceC0016ac
    /* renamed from: b */
    public int mo136b() {
        return 4;
    }

    @Override // p000.InterfaceC0016ac
    public int[] newArray(int i) {
        return new int[i];
    }
}
