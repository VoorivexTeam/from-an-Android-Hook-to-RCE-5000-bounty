package defpackage;

import defpackage.rm;

/* loaded from: classes.dex */
final class om extends rm {
    private final long b;
    private final int c;
    private final int d;
    private final long e;

    /* loaded from: classes.dex */
    static final class b extends rm.a {
        private Long a;
        private Integer b;
        private Integer c;
        private Long d;

        @Override // rm.a
        rm.a a(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // rm.a
        rm.a a(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // rm.a
        rm a() {
            String str = "";
            if (this.a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.b == null) {
                str = str + " loadBatchSize";
            }
            if (this.c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.d == null) {
                str = str + " eventCleanUpAge";
            }
            if (str.isEmpty()) {
                return new om(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // rm.a
        rm.a b(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // rm.a
        rm.a b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }
    }

    private om(long j, int i, int i2, long j2) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
    }

    @Override // defpackage.rm
    int a() {
        return this.d;
    }

    @Override // defpackage.rm
    long b() {
        return this.e;
    }

    @Override // defpackage.rm
    int c() {
        return this.c;
    }

    @Override // defpackage.rm
    long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rm)) {
            return false;
        }
        rm rmVar = (rm) obj;
        return this.b == rmVar.d() && this.c == rmVar.c() && this.d == rmVar.a() && this.e == rmVar.b();
    }

    public int hashCode() {
        long j = this.b;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j2 = this.e;
        return ((int) (j2 ^ (j2 >>> 32))) ^ i;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.b + ", loadBatchSize=" + this.c + ", criticalSectionEnterTimeoutMs=" + this.d + ", eventCleanUpAge=" + this.e + "}";
    }
}
