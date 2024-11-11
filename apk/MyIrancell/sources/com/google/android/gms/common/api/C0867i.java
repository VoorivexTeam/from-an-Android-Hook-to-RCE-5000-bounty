package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.android.gms.common.api.i */
/* loaded from: classes.dex */
public final class C0867i {

    /* renamed from: com.google.android.gms.common.api.i$a */
    /* loaded from: classes.dex */
    private static final class a<R extends InterfaceC0982m> extends BasePendingResult<R> {

        /* renamed from: q */
        private final R f5715q;

        public a(AbstractC0864f abstractC0864f, R r) {
            super(abstractC0864f);
            this.f5715q = r;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        /* renamed from: a */
        public final R mo6471a(Status status) {
            return this.f5715q;
        }
    }

    /* renamed from: a */
    public static <R extends InterfaceC0982m> AbstractC0866h<R> m6576a(R r, AbstractC0864f abstractC0864f) {
        C1057u.m7287a(r, "Result must not be null");
        C1057u.m7294a(!r.mo6496e().m6500m(), "Status code must not be SUCCESS");
        a aVar = new a(abstractC0864f, r);
        aVar.m6585a((a) r);
        return aVar;
    }
}
