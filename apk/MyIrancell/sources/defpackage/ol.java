package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ol {
    private final fk a;
    private final byte[] b;

    public ol(fk fkVar, byte[] bArr) {
        if (fkVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = fkVar;
        this.b = bArr;
    }

    public byte[] a() {
        return this.b;
    }

    public fk b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol)) {
            return false;
        }
        ol olVar = (ol) obj;
        if (this.a.equals(olVar.a)) {
            return Arrays.equals(this.b, olVar.b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
