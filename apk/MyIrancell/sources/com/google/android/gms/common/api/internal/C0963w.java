package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC0866h;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.w */
/* loaded from: classes.dex */
public final class C0963w implements AbstractC0866h.a {

    /* renamed from: a */
    private final /* synthetic */ BasePendingResult f5986a;

    /* renamed from: b */
    private final /* synthetic */ C0874a3 f5987b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0963w(C0874a3 c0874a3, BasePendingResult basePendingResult) {
        this.f5987b = c0874a3;
        this.f5986a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.AbstractC0866h.a
    /* renamed from: a */
    public final void mo6575a(Status status) {
        Map map;
        map = this.f5987b.f5737a;
        map.remove(this.f5986a);
    }
}
