package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class j extends androidx.fragment.app.b {
    private Dialog i0 = null;
    private DialogInterface.OnCancelListener j0 = null;

    public static j a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        j jVar = new j();
        com.google.android.gms.common.internal.u.a(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        jVar.i0 = dialog2;
        if (onCancelListener != null) {
            jVar.j0 = onCancelListener;
        }
        return jVar;
    }

    @Override // androidx.fragment.app.b
    public void a(androidx.fragment.app.f fVar, String str) {
        super.a(fVar, str);
    }

    @Override // androidx.fragment.app.b
    public Dialog n(Bundle bundle) {
        if (this.i0 == null) {
            i(false);
        }
        return this.i0;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.j0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
