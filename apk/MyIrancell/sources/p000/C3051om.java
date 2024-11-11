package p000;

import p000.AbstractC3171rm;

/* renamed from: om */
/* loaded from: classes.dex */
final class C3051om extends AbstractC3171rm {

    /* renamed from: b */
    private final long f12509b;

    /* renamed from: c */
    private final int f12510c;

    /* renamed from: d */
    private final int f12511d;

    /* renamed from: e */
    private final long f12512e;

    /* renamed from: om$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC3171rm.a {

        /* renamed from: a */
        private Long f12513a;

        /* renamed from: b */
        private Integer f12514b;

        /* renamed from: c */
        private Integer f12515c;

        /* renamed from: d */
        private Long f12516d;

        @Override // p000.AbstractC3171rm.a
        /* renamed from: a */
        AbstractC3171rm.a mo14641a(int i) {
            this.f12515c = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC3171rm.a
        /* renamed from: a */
        AbstractC3171rm.a mo14642a(long j) {
            this.f12516d = Long.valueOf(j);
            return this;
        }

        @Override // p000.AbstractC3171rm.a
        /* renamed from: a */
        AbstractC3171rm mo14643a() {
            String str = "";
            if (this.f12513a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f12514b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f12515c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f12516d == null) {
                str = str + " eventCleanUpAge";
            }
            if (str.isEmpty()) {
                return new C3051om(this.f12513a.longValue(), this.f12514b.intValue(), this.f12515c.intValue(), this.f12516d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC3171rm.a
        /* renamed from: b */
        AbstractC3171rm.a mo14644b(int i) {
            this.f12514b = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC3171rm.a
        /* renamed from: b */
        AbstractC3171rm.a mo14645b(long j) {
            this.f12513a = Long.valueOf(j);
            return this;
        }
    }

    private C3051om(long j, int i, int i2, long j2) {
        this.f12509b = j;
        this.f12510c = i;
        this.f12511d = i2;
        this.f12512e = j2;
    }

    @Override // p000.AbstractC3171rm
    /* renamed from: a */
    int mo14637a() {
        return this.f12511d;
    }

    @Override // p000.AbstractC3171rm
    /* renamed from: b */
    long mo14638b() {
        return this.f12512e;
    }

    @Override // p000.AbstractC3171rm
    /* renamed from: c */
    int mo14639c() {
        return this.f12510c;
    }

    @Override // p000.AbstractC3171rm
    /* renamed from: d */
    long mo14640d() {
        return this.f12509b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3171rm)) {
            return false;
        }
        AbstractC3171rm abstractC3171rm = (AbstractC3171rm) obj;
        return this.f12509b == abstractC3171rm.mo14640d() && this.f12510c == abstractC3171rm.mo14639c() && this.f12511d == abstractC3171rm.mo14637a() && this.f12512e == abstractC3171rm.mo14638b();
    }

    public int hashCode() {
        long j = this.f12509b;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f12510c) * 1000003) ^ this.f12511d) * 1000003;
        long j2 = this.f12512e;
        return ((int) (j2 ^ (j2 >>> 32))) ^ i;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f12509b + ", loadBatchSize=" + this.f12510c + ", criticalSectionEnterTimeoutMs=" + this.f12511d + ", eventCleanUpAge=" + this.f12512e + "}";
    }
}
