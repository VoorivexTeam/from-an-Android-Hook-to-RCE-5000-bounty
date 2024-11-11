package defpackage;

/* loaded from: classes.dex */
public final class gc implements ac<byte[]> {
    @Override // defpackage.ac
    public int a(byte[] bArr) {
        return bArr.length;
    }

    @Override // defpackage.ac
    public String a() {
        return "ByteArrayPool";
    }

    @Override // defpackage.ac
    public int b() {
        return 1;
    }

    @Override // defpackage.ac
    public byte[] newArray(int i) {
        return new byte[i];
    }
}
