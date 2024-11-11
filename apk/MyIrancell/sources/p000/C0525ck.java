package p000;

/* renamed from: ck */
/* loaded from: classes.dex */
public final class C0525ck {

    /* renamed from: a */
    private final String f3023a;

    /* renamed from: b */
    private final String f3024b;

    /* renamed from: c */
    private final byte[] f3025c;

    /* renamed from: d */
    private final Integer f3026d;

    /* renamed from: e */
    private final String f3027e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0525ck() {
        this(null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0525ck(String str, String str2, byte[] bArr, Integer num, String str3) {
        this.f3023a = str;
        this.f3024b = str2;
        this.f3025c = bArr;
        this.f3026d = num;
        this.f3027e = str3;
    }

    /* renamed from: a */
    public String m3694a() {
        return this.f3023a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("Format: ");
        sb.append(this.f3024b);
        sb.append('\n');
        sb.append("Contents: ");
        sb.append(this.f3023a);
        sb.append('\n');
        byte[] bArr = this.f3025c;
        int length = bArr == null ? 0 : bArr.length;
        sb.append("Raw bytes: (");
        sb.append(length);
        sb.append(" bytes)\n");
        sb.append("Orientation: ");
        sb.append(this.f3026d);
        sb.append('\n');
        sb.append("EC level: ");
        sb.append(this.f3027e);
        sb.append('\n');
        return sb.toString();
    }
}
