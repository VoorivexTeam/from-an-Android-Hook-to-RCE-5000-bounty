package p000;

import java.util.Arrays;
import p000.AbstractC3266tl;

/* renamed from: kl */
/* loaded from: classes.dex */
final class C2864kl extends AbstractC3266tl {

    /* renamed from: a */
    private final String f11760a;

    /* renamed from: b */
    private final byte[] f11761b;

    /* renamed from: c */
    private final EnumC2556hk f11762c;

    /* renamed from: kl$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC3266tl.a {

        /* renamed from: a */
        private String f11763a;

        /* renamed from: b */
        private byte[] f11764b;

        /* renamed from: c */
        private EnumC2556hk f11765c;

        @Override // p000.AbstractC3266tl.a
        /* renamed from: a */
        public AbstractC3266tl.a mo13738a(EnumC2556hk enumC2556hk) {
            if (enumC2556hk == null) {
                throw new NullPointerException("Null priority");
            }
            this.f11765c = enumC2556hk;
            return this;
        }

        @Override // p000.AbstractC3266tl.a
        /* renamed from: a */
        public AbstractC3266tl.a mo13739a(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f11763a = str;
            return this;
        }

        @Override // p000.AbstractC3266tl.a
        /* renamed from: a */
        public AbstractC3266tl.a mo13740a(byte[] bArr) {
            this.f11764b = bArr;
            return this;
        }

        @Override // p000.AbstractC3266tl.a
        /* renamed from: a */
        public AbstractC3266tl mo13741a() {
            String str = "";
            if (this.f11763a == null) {
                str = " backendName";
            }
            if (this.f11765c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C2864kl(this.f11763a, this.f11764b, this.f11765c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    private C2864kl(String str, byte[] bArr, EnumC2556hk enumC2556hk) {
        this.f11760a = str;
        this.f11761b = bArr;
        this.f11762c = enumC2556hk;
    }

    @Override // p000.AbstractC3266tl
    /* renamed from: a */
    public String mo13735a() {
        return this.f11760a;
    }

    @Override // p000.AbstractC3266tl
    /* renamed from: b */
    public byte[] mo13736b() {
        return this.f11761b;
    }

    @Override // p000.AbstractC3266tl
    /* renamed from: c */
    public EnumC2556hk mo13737c() {
        return this.f11762c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3266tl)) {
            return false;
        }
        AbstractC3266tl abstractC3266tl = (AbstractC3266tl) obj;
        if (this.f11760a.equals(abstractC3266tl.mo13735a())) {
            if (Arrays.equals(this.f11761b, abstractC3266tl instanceof C2864kl ? ((C2864kl) abstractC3266tl).f11761b : abstractC3266tl.mo13736b()) && this.f11762c.equals(abstractC3266tl.mo13737c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f11760a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11761b)) * 1000003) ^ this.f11762c.hashCode();
    }
}
