package defpackage;

/* loaded from: classes.dex */
public final class ck {
    private final String a;
    private final String b;
    private final byte[] c;
    private final Integer d;
    private final String e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ck() {
        this(null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ck(String str, String str2, byte[] bArr, Integer num, String str3) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
        this.d = num;
        this.e = str3;
    }

    public String a() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("Format: ");
        sb.append(this.b);
        sb.append('\n');
        sb.append("Contents: ");
        sb.append(this.a);
        sb.append('\n');
        byte[] bArr = this.c;
        int length = bArr == null ? 0 : bArr.length;
        sb.append("Raw bytes: (");
        sb.append(length);
        sb.append(" bytes)\n");
        sb.append("Orientation: ");
        sb.append(this.d);
        sb.append('\n');
        sb.append("EC level: ");
        sb.append(this.e);
        sb.append('\n');
        return sb.toString();
    }
}
