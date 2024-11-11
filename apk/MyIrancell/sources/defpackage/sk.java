package defpackage;

import defpackage.bl;
import java.util.Arrays;

/* loaded from: classes.dex */
final class sk extends bl {
    private final long a;
    private final int b;
    private final long c;
    private final byte[] d;
    private final String e;
    private final long f;
    private final gl g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends bl.a {
        private Long a;
        private Integer b;
        private Long c;
        private byte[] d;
        private String e;
        private Long f;
        private gl g;

        @Override // bl.a
        public bl.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // bl.a
        public bl.a a(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // bl.a
        public bl.a a(gl glVar) {
            this.g = glVar;
            return this;
        }

        @Override // bl.a
        bl.a a(String str) {
            this.e = str;
            return this;
        }

        @Override // bl.a
        bl.a a(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        @Override // bl.a
        public bl a() {
            String str = "";
            if (this.a == null) {
                str = " eventTimeMs";
            }
            if (this.b == null) {
                str = str + " eventCode";
            }
            if (this.c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new sk(this.a.longValue(), this.b.intValue(), this.c.longValue(), this.d, this.e, this.f.longValue(), this.g, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // bl.a
        public bl.a b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // bl.a
        public bl.a c(long j) {
            this.f = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ sk(long j, int i, long j2, byte[] bArr, String str, long j3, gl glVar, a aVar) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = glVar;
    }

    @Override // defpackage.bl
    public long a() {
        return this.a;
    }

    @Override // defpackage.bl
    public long b() {
        return this.c;
    }

    @Override // defpackage.bl
    public long c() {
        return this.f;
    }

    public int d() {
        return this.b;
    }

    public gl e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bl)) {
            return false;
        }
        bl blVar = (bl) obj;
        if (this.a == blVar.a()) {
            sk skVar = (sk) blVar;
            if (this.b == skVar.b && this.c == blVar.b()) {
                boolean z = blVar instanceof sk;
                if (Arrays.equals(this.d, skVar.d) && ((str = this.e) != null ? str.equals(skVar.e) : skVar.e == null) && this.f == blVar.c()) {
                    gl glVar = this.g;
                    if (glVar == null) {
                        if (skVar.g == null) {
                            return true;
                        }
                    } else if (glVar.equals(skVar.g)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public byte[] f() {
        return this.d;
    }

    public String g() {
        return this.e;
    }

    public int hashCode() {
        long j = this.a;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b) * 1000003;
        long j2 = this.c;
        int hashCode = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j3 = this.f;
        int i2 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        gl glVar = this.g;
        return i2 ^ (glVar != null ? glVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
