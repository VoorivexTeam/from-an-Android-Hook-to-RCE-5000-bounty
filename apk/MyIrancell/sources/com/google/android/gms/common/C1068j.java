package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractC0282f;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0278b;
import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.android.gms.common.j */
/* loaded from: classes.dex */
public class C1068j extends DialogInterfaceOnCancelListenerC0278b {

    /* renamed from: i0 */
    private Dialog f6279i0 = null;

    /* renamed from: j0 */
    private DialogInterface.OnCancelListener f6280j0 = null;

    /* renamed from: a */
    public static C1068j m7307a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C1068j c1068j = new C1068j();
        C1057u.m7287a(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c1068j.f6279i0 = dialog2;
        if (onCancelListener != null) {
            c1068j.f6280j0 = onCancelListener;
        }
        return c1068j;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0278b
    /* renamed from: a */
    public void mo1774a(AbstractC0282f abstractC0282f, String str) {
        super.mo1774a(abstractC0282f, str);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0278b
    /* renamed from: n */
    public Dialog mo1777n(Bundle bundle) {
        if (this.f6279i0 == null) {
            m1776i(false);
        }
        return this.f6279i0;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f6280j0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
