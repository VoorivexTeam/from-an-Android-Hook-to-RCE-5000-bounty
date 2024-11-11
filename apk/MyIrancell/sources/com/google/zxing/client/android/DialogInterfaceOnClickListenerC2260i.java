package com.google.zxing.client.android;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: com.google.zxing.client.android.i */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC2260i implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {

    /* renamed from: b */
    private final Activity f9138b;

    public DialogInterfaceOnClickListenerC2260i(Activity activity) {
        this.f9138b = activity;
    }

    /* renamed from: a */
    private void m10880a() {
        this.f9138b.finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        m10880a();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        m10880a();
    }
}
