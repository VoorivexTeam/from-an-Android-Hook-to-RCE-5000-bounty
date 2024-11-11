package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.h;

/* loaded from: classes.dex */
public final class xp extends h<tp> {
    public xp(Context context, Looper looper, e eVar, f fVar, m mVar) {
        super(context, looper, 126, eVar, fVar, mVar);
    }

    @Override // com.google.android.gms.common.internal.d
    protected final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof tp ? (tp) queryLocalInterface : new sp(iBinder);
    }

    @Override // com.google.android.gms.common.internal.d
    protected final String g() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // com.google.android.gms.common.internal.h, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.a.f
    public final int i() {
        return com.google.android.gms.common.h.a;
    }

    @Override // com.google.android.gms.common.internal.d
    protected final String p() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // com.google.android.gms.common.internal.d
    public final Feature[] v() {
        return op.c;
    }
}
