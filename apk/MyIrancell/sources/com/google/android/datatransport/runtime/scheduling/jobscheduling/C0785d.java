package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC0788g;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.d */
/* loaded from: classes.dex */
final class C0785d extends AbstractC0788g.b {

    /* renamed from: a */
    private final long f5403a;

    /* renamed from: b */
    private final long f5404b;

    /* renamed from: c */
    private final Set<AbstractC0788g.c> f5405c;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.d$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC0788g.b.a {

        /* renamed from: a */
        private Long f5406a;

        /* renamed from: b */
        private Long f5407b;

        /* renamed from: c */
        private Set<AbstractC0788g.c> f5408c;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC0788g.b.a
        /* renamed from: a */
        public AbstractC0788g.b.a mo6301a(long j) {
            this.f5406a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC0788g.b.a
        /* renamed from: a */
        public AbstractC0788g.b.a mo6302a(Set<AbstractC0788g.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f5408c = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC0788g.b.a
        /* renamed from: a */
        public AbstractC0788g.b mo6303a() {
            String str = "";
            if (this.f5406a == null) {
                str = " delta";
            }
            if (this.f5407b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f5408c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C0785d(this.f5406a.longValue(), this.f5407b.longValue(), this.f5408c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC0788g.b.a
        /* renamed from: b */
        public AbstractC0788g.b.a mo6304b(long j) {
            this.f5407b = Long.valueOf(j);
            return this;
        }
    }

    private C0785d(long j, long j2, Set<AbstractC0788g.c> set) {
        this.f5403a = j;
        this.f5404b = j2;
        this.f5405c = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC0788g.b
    /* renamed from: a */
    long mo6298a() {
        return this.f5403a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC0788g.b
    /* renamed from: b */
    Set<AbstractC0788g.c> mo6299b() {
        return this.f5405c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC0788g.b
    /* renamed from: c */
    long mo6300c() {
        return this.f5404b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0788g.b)) {
            return false;
        }
        AbstractC0788g.b bVar = (AbstractC0788g.b) obj;
        return this.f5403a == bVar.mo6298a() && this.f5404b == bVar.mo6300c() && this.f5405c.equals(bVar.mo6299b());
    }

    public int hashCode() {
        long j = this.f5403a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f5404b;
        return this.f5405c.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f5403a + ", maxAllowedDelay=" + this.f5404b + ", flags=" + this.f5405c + "}";
    }
}
