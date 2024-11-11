package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: com.google.firebase.iid.h */
/* loaded from: classes.dex */
final class C2097h {

    /* renamed from: a */
    private final Messenger f8909a;

    /* renamed from: b */
    private final zzf f8910b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2097h(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f8909a = new Messenger(iBinder);
            this.f8910b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f8910b = new zzf(iBinder);
            this.f8909a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(valueOf);
            } else {
                new String("Invalid interface descriptor: ");
            }
            throw new RemoteException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m10650a(Message message) {
        Messenger messenger = this.f8909a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzf zzfVar = this.f8910b;
        if (zzfVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        zzfVar.m10739a(message);
    }
}
