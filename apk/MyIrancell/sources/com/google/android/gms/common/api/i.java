package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes.dex */
public final class i {

    /* loaded from: classes.dex */
    private static final class a<R extends m> extends BasePendingResult<R> {
        private final R q;

        public a(f fVar, R r) {
            super(fVar);
            this.q = r;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        public final R a(Status status) {
            return this.q;
        }
    }

    public static <R extends m> h<R> a(R r, f fVar) {
        com.google.android.gms.common.internal.u.a(r, "Result must not be null");
        com.google.android.gms.common.internal.u.a(!r.e().m(), "Status code must not be SUCCESS");
        a aVar = new a(fVar, r);
        aVar.a((a) r);
        return aVar;
    }
}
