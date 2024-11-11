package p000;

import java.util.Arrays;
import p000.AbstractC0484bl;

/* renamed from: sk */
/* loaded from: classes.dex */
final class C3213sk extends AbstractC0484bl {

    /* renamed from: a */
    private final long f13120a;

    /* renamed from: b */
    private final int f13121b;

    /* renamed from: c */
    private final long f13122c;

    /* renamed from: d */
    private final byte[] f13123d;

    /* renamed from: e */
    private final String f13124e;

    /* renamed from: f */
    private final long f13125f;

    /* renamed from: g */
    private final AbstractC2517gl f13126g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sk$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC0484bl.a {

        /* renamed from: a */
        private Long f13127a;

        /* renamed from: b */
        private Integer f13128b;

        /* renamed from: c */
        private Long f13129c;

        /* renamed from: d */
        private byte[] f13130d;

        /* renamed from: e */
        private String f13131e;

        /* renamed from: f */
        private Long f13132f;

        /* renamed from: g */
        private AbstractC2517gl f13133g;

        @Override // p000.AbstractC0484bl.a
        /* renamed from: a */
        public AbstractC0484bl.a mo3420a(int i) {
            this.f13128b = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC0484bl.a
        /* renamed from: a */
        public AbstractC0484bl.a mo3421a(long j) {
            this.f13127a = Long.valueOf(j);
            return this;
        }

        @Override // p000.AbstractC0484bl.a
        /* renamed from: a */
        public AbstractC0484bl.a mo3422a(AbstractC2517gl abstractC2517gl) {
            this.f13133g = abstractC2517gl;
            return this;
        }

        @Override // p000.AbstractC0484bl.a
        /* renamed from: a */
        AbstractC0484bl.a mo3423a(String str) {
            this.f13131e = str;
            return this;
        }

        @Override // p000.AbstractC0484bl.a
        /* renamed from: a */
        AbstractC0484bl.a mo3424a(byte[] bArr) {
            this.f13130d = bArr;
            return this;
        }

        @Override // p000.AbstractC0484bl.a
        /* renamed from: a */
        public AbstractC0484bl mo3425a() {
            String str = "";
            if (this.f13127a == null) {
                str = " eventTimeMs";
            }
            if (this.f13128b == null) {
                str = str + " eventCode";
            }
            if (this.f13129c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f13132f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C3213sk(this.f13127a.longValue(), this.f13128b.intValue(), this.f13129c.longValue(), this.f13130d, this.f13131e, this.f13132f.longValue(), this.f13133g, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC0484bl.a
        /* renamed from: b */
        public AbstractC0484bl.a mo3426b(long j) {
            this.f13129c = Long.valueOf(j);
            return this;
        }

        @Override // p000.AbstractC0484bl.a
        /* renamed from: c */
        public AbstractC0484bl.a mo3427c(long j) {
            this.f13132f = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ C3213sk(long j, int i, long j2, byte[] bArr, String str, long j3, AbstractC2517gl abstractC2517gl, a aVar) {
        this.f13120a = j;
        this.f13121b = i;
        this.f13122c = j2;
        this.f13123d = bArr;
        this.f13124e = str;
        this.f13125f = j3;
        this.f13126g = abstractC2517gl;
    }

    @Override // p000.AbstractC0484bl
    /* renamed from: a */
    public long mo3417a() {
        return this.f13120a;
    }

    @Override // p000.AbstractC0484bl
    /* renamed from: b */
    public long mo3418b() {
        return this.f13122c;
    }

    @Override // p000.AbstractC0484bl
    /* renamed from: c */
    public long mo3419c() {
        return this.f13125f;
    }

    /* renamed from: d */
    public int m15439d() {
        return this.f13121b;
    }

    /* renamed from: e */
    public AbstractC2517gl m15440e() {
        return this.f13126g;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0484bl)) {
            return false;
        }
        AbstractC0484bl abstractC0484bl = (AbstractC0484bl) obj;
        if (this.f13120a == abstractC0484bl.mo3417a()) {
            C3213sk c3213sk = (C3213sk) abstractC0484bl;
            if (this.f13121b == c3213sk.f13121b && this.f13122c == abstractC0484bl.mo3418b()) {
                boolean z = abstractC0484bl instanceof C3213sk;
                if (Arrays.equals(this.f13123d, c3213sk.f13123d) && ((str = this.f13124e) != null ? str.equals(c3213sk.f13124e) : c3213sk.f13124e == null) && this.f13125f == abstractC0484bl.mo3419c()) {
                    AbstractC2517gl abstractC2517gl = this.f13126g;
                    if (abstractC2517gl == null) {
                        if (c3213sk.f13126g == null) {
                            return true;
                        }
                    } else if (abstractC2517gl.equals(c3213sk.f13126g)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public byte[] m15441f() {
        return this.f13123d;
    }

    /* renamed from: g */
    public String m15442g() {
        return this.f13124e;
    }

    public int hashCode() {
        long j = this.f13120a;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f13121b) * 1000003;
        long j2 = this.f13122c;
        int hashCode = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f13123d)) * 1000003;
        String str = this.f13124e;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j3 = this.f13125f;
        int i2 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        AbstractC2517gl abstractC2517gl = this.f13126g;
        return i2 ^ (abstractC2517gl != null ? abstractC2517gl.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f13120a + ", eventCode=" + this.f13121b + ", eventUptimeMs=" + this.f13122c + ", sourceExtension=" + Arrays.toString(this.f13123d) + ", sourceExtensionJsonProto3=" + this.f13124e + ", timezoneOffsetSeconds=" + this.f13125f + ", networkConnectionInfo=" + this.f13126g + "}";
    }
}
