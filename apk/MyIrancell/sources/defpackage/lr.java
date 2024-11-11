package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public class lr implements IInterface {
    private final IBinder a;

    /* JADX INFO: Access modifiers changed from: protected */
    public lr(IBinder iBinder, String str) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.a;
    }
}
