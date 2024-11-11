package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.common.api.internal.InterfaceC0911j;

/* renamed from: com.google.android.gms.common.internal.g */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC1026g implements DialogInterface.OnClickListener {
    /* renamed from: a */
    public static AbstractDialogInterfaceOnClickListenerC1026g m7143a(Activity activity, Intent intent, int i) {
        return new C1067z(intent, activity, i);
    }

    /* renamed from: a */
    public static AbstractDialogInterfaceOnClickListenerC1026g m7144a(InterfaceC0911j interfaceC0911j, Intent intent, int i) {
        return new C1015a0(intent, interfaceC0911j, i);
    }

    /* renamed from: a */
    protected abstract void mo7042a();

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo7042a();
        } catch (ActivityNotFoundException unused) {
        } finally {
            dialogInterface.dismiss();
        }
    }
}
