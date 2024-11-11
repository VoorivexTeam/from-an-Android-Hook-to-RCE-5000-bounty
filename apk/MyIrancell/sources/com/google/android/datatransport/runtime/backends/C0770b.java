package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.AbstractC0775g;

/* renamed from: com.google.android.datatransport.runtime.backends.b */
/* loaded from: classes.dex */
final class C0770b extends AbstractC0775g {

    /* renamed from: a */
    private final AbstractC0775g.a f5375a;

    /* renamed from: b */
    private final long f5376b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0770b(AbstractC0775g.a aVar, long j) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f5375a = aVar;
        this.f5376b = j;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC0775g
    /* renamed from: a */
    public long mo6272a() {
        return this.f5376b;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC0775g
    /* renamed from: b */
    public AbstractC0775g.a mo6273b() {
        return this.f5375a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0775g)) {
            return false;
        }
        AbstractC0775g abstractC0775g = (AbstractC0775g) obj;
        return this.f5375a.equals(abstractC0775g.mo6273b()) && this.f5376b == abstractC0775g.mo6272a();
    }

    public int hashCode() {
        int hashCode = (this.f5375a.hashCode() ^ 1000003) * 1000003;
        long j = this.f5376b;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f5375a + ", nextRequestWaitMillis=" + this.f5376b + "}";
    }
}
