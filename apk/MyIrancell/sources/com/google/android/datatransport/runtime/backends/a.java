package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.f;
import defpackage.pl;
import java.util.Arrays;

/* loaded from: classes.dex */
final class a extends f {
    private final Iterable<pl> a;
    private final byte[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f.a {
        private Iterable<pl> a;
        private byte[] b;

        @Override // com.google.android.datatransport.runtime.backends.f.a
        public f.a a(Iterable<pl> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.a = iterable;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.f.a
        public f.a a(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.f.a
        public f a() {
            String str = "";
            if (this.a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    private a(Iterable<pl> iterable, byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }

    @Override // com.google.android.datatransport.runtime.backends.f
    public Iterable<pl> a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.backends.f
    public byte[] b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a.equals(fVar.a())) {
            if (Arrays.equals(this.b, fVar instanceof a ? ((a) fVar).b : fVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }
}
