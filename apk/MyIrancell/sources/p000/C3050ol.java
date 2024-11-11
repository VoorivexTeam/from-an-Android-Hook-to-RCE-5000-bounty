package p000;

import java.util.Arrays;

/* renamed from: ol */
/* loaded from: classes.dex */
public final class C3050ol {

    /* renamed from: a */
    private final C2476fk f12507a;

    /* renamed from: b */
    private final byte[] f12508b;

    public C3050ol(C2476fk c2476fk, byte[] bArr) {
        if (c2476fk == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f12507a = c2476fk;
        this.f12508b = bArr;
    }

    /* renamed from: a */
    public byte[] m14635a() {
        return this.f12508b;
    }

    /* renamed from: b */
    public C2476fk m14636b() {
        return this.f12507a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3050ol)) {
            return false;
        }
        C3050ol c3050ol = (C3050ol) obj;
        if (this.f12507a.equals(c3050ol.f12507a)) {
            return Arrays.equals(this.f12508b, c3050ol.f12508b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12507a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12508b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f12507a + ", bytes=[...]}";
    }
}
