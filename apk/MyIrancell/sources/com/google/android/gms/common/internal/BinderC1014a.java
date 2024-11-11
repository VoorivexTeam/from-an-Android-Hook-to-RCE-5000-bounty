package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.InterfaceC1038m;

/* renamed from: com.google.android.gms.common.internal.a */
/* loaded from: classes.dex */
public class BinderC1014a extends InterfaceC1038m.a {
    /* renamed from: a */
    public static Account m7041a(InterfaceC1038m interfaceC1038m) {
        if (interfaceC1038m != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC1038m.mo7174d();
            } catch (RemoteException unused) {
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }
}
