package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.internal.AbstractC1028h;
import com.google.android.gms.common.internal.C1022e;

/* renamed from: po */
/* loaded from: classes.dex */
public final class C3092po extends AbstractC1028h<InterfaceC3313uo> {
    public C3092po(Context context, Looper looper, C1022e c1022e, AbstractC0864f.b bVar, AbstractC0864f.c cVar) {
        super(context, looper, 39, c1022e, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: a */
    protected final /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        return queryLocalInterface instanceof InterfaceC3313uo ? (InterfaceC3313uo) queryLocalInterface : new C3269to(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: g */
    protected final String mo6464g() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: p */
    public final String mo6467p() {
        return "com.google.android.gms.common.service.START";
    }
}
