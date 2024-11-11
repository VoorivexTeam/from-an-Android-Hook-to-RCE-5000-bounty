package p000;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: lr */
/* loaded from: classes.dex */
public class C2907lr implements IInterface {

    /* renamed from: a */
    private final IBinder f11918a;

    /* JADX INFO: Access modifiers changed from: protected */
    public C2907lr(IBinder iBinder, String str) {
        this.f11918a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f11918a;
    }
}
