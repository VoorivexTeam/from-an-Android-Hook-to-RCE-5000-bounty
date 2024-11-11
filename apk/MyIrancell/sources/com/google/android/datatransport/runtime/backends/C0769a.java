package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.AbstractC0774f;
import java.util.Arrays;
import p000.AbstractC3089pl;

/* renamed from: com.google.android.datatransport.runtime.backends.a */
/* loaded from: classes.dex */
final class C0769a extends AbstractC0774f {

    /* renamed from: a */
    private final Iterable<AbstractC3089pl> f5371a;

    /* renamed from: b */
    private final byte[] f5372b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.runtime.backends.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC0774f.a {

        /* renamed from: a */
        private Iterable<AbstractC3089pl> f5373a;

        /* renamed from: b */
        private byte[] f5374b;

        @Override // com.google.android.datatransport.runtime.backends.AbstractC0774f.a
        /* renamed from: a */
        public AbstractC0774f.a mo6269a(Iterable<AbstractC3089pl> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f5373a = iterable;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.AbstractC0774f.a
        /* renamed from: a */
        public AbstractC0774f.a mo6270a(byte[] bArr) {
            this.f5374b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.AbstractC0774f.a
        /* renamed from: a */
        public AbstractC0774f mo6271a() {
            String str = "";
            if (this.f5373a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C0769a(this.f5373a, this.f5374b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    private C0769a(Iterable<AbstractC3089pl> iterable, byte[] bArr) {
        this.f5371a = iterable;
        this.f5372b = bArr;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC0774f
    /* renamed from: a */
    public Iterable<AbstractC3089pl> mo6267a() {
        return this.f5371a;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC0774f
    /* renamed from: b */
    public byte[] mo6268b() {
        return this.f5372b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0774f)) {
            return false;
        }
        AbstractC0774f abstractC0774f = (AbstractC0774f) obj;
        if (this.f5371a.equals(abstractC0774f.mo6267a())) {
            if (Arrays.equals(this.f5372b, abstractC0774f instanceof C0769a ? ((C0769a) abstractC0774f).f5372b : abstractC0774f.mo6268b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5371a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5372b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f5371a + ", extras=" + Arrays.toString(this.f5372b) + "}";
    }
}
