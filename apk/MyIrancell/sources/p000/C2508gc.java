package p000;

/* renamed from: gc */
/* loaded from: classes.dex */
public final class C2508gc implements InterfaceC0016ac<byte[]> {
    @Override // p000.InterfaceC0016ac
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo134a(byte[] bArr) {
        return bArr.length;
    }

    @Override // p000.InterfaceC0016ac
    /* renamed from: a */
    public String mo135a() {
        return "ByteArrayPool";
    }

    @Override // p000.InterfaceC0016ac
    /* renamed from: b */
    public int mo136b() {
        return 1;
    }

    @Override // p000.InterfaceC0016ac
    public byte[] newArray(int i) {
        return new byte[i];
    }
}
