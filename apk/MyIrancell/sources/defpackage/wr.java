package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.e;

/* loaded from: classes.dex */
final class wr extends a.AbstractC0041a<com.google.android.gms.signin.internal.a, vr> {
    @Override // com.google.android.gms.common.api.a.AbstractC0041a
    public final /* synthetic */ com.google.android.gms.signin.internal.a a(Context context, Looper looper, e eVar, vr vrVar, f.b bVar, f.c cVar) {
        vr vrVar2 = vrVar;
        if (vrVar2 == null) {
            vrVar2 = vr.k;
        }
        return new com.google.android.gms.signin.internal.a(context, looper, true, eVar, vrVar2, bVar, cVar);
    }
}
