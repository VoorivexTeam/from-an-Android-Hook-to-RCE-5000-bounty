package defpackage;

import defpackage.tl;
import java.util.Arrays;

/* loaded from: classes.dex */
final class kl extends tl {
    private final String a;
    private final byte[] b;
    private final hk c;

    /* loaded from: classes.dex */
    static final class b extends tl.a {
        private String a;
        private byte[] b;
        private hk c;

        @Override // tl.a
        public tl.a a(hk hkVar) {
            if (hkVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.c = hkVar;
            return this;
        }

        @Override // tl.a
        public tl.a a(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.a = str;
            return this;
        }

        @Override // tl.a
        public tl.a a(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        @Override // tl.a
        public tl a() {
            String str = "";
            if (this.a == null) {
                str = " backendName";
            }
            if (this.c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new kl(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    private kl(String str, byte[] bArr, hk hkVar) {
        this.a = str;
        this.b = bArr;
        this.c = hkVar;
    }

    @Override // defpackage.tl
    public String a() {
        return this.a;
    }

    @Override // defpackage.tl
    public byte[] b() {
        return this.b;
    }

    @Override // defpackage.tl
    public hk c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tl)) {
            return false;
        }
        tl tlVar = (tl) obj;
        if (this.a.equals(tlVar.a())) {
            if (Arrays.equals(this.b, tlVar instanceof kl ? ((kl) tlVar).b : tlVar.b()) && this.c.equals(tlVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
