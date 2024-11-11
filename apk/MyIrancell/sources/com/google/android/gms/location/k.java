package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
final class k extends a.AbstractC0041a<com.google.android.gms.internal.location.r, a.d.C0043d> {
    @Override // com.google.android.gms.common.api.a.AbstractC0041a
    public final /* synthetic */ com.google.android.gms.internal.location.r a(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, a.d.C0043d c0043d, f.b bVar, f.c cVar) {
        return new com.google.android.gms.internal.location.r(context, looper, bVar, cVar, "locationServices", eVar);
    }
}
