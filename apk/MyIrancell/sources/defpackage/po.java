package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.h;

/* loaded from: classes.dex */
public final class po extends h<uo> {
    public po(Context context, Looper looper, e eVar, f.b bVar, f.c cVar) {
        super(context, looper, 39, eVar, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.d
    protected final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        return queryLocalInterface instanceof uo ? (uo) queryLocalInterface : new to(iBinder);
    }

    @Override // com.google.android.gms.common.internal.d
    protected final String g() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    @Override // com.google.android.gms.common.internal.d
    public final String p() {
        return "com.google.android.gms.common.service.START";
    }
}
