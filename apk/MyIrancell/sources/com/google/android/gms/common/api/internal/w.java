package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w implements h.a {
    private final /* synthetic */ BasePendingResult a;
    private final /* synthetic */ a3 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(a3 a3Var, BasePendingResult basePendingResult) {
        this.b = a3Var;
        this.a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.h.a
    public final void a(Status status) {
        Map map;
        map = this.b.a;
        map.remove(this.a);
    }
}
