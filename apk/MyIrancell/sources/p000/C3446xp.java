package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C1006h;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.InterfaceC0895f;
import com.google.android.gms.common.api.internal.InterfaceC0923m;
import com.google.android.gms.common.internal.AbstractC1028h;
import com.google.android.gms.common.internal.C1022e;

/* renamed from: xp */
/* loaded from: classes.dex */
public final class C3446xp extends AbstractC1028h<InterfaceC3270tp> {
    public C3446xp(Context context, Looper looper, C1022e c1022e, InterfaceC0895f interfaceC0895f, InterfaceC0923m interfaceC0923m) {
        super(context, looper, 126, c1022e, interfaceC0895f, interfaceC0923m);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: a */
    protected final /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof InterfaceC3270tp ? (InterfaceC3270tp) queryLocalInterface : new C3218sp(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: g */
    protected final String mo6464g() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1028h, com.google.android.gms.common.internal.AbstractC1020d, com.google.android.gms.common.api.C0859a.f
    /* renamed from: i */
    public final int mo6465i() {
        return C1006h.f6075a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: p */
    protected final String mo6467p() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: v */
    public final Feature[] mo7097v() {
        return C3054op.f12524c;
    }
}
