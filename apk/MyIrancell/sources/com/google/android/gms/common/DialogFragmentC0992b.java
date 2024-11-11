package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.android.gms.common.b */
/* loaded from: classes.dex */
public class DialogFragmentC0992b extends DialogFragment {

    /* renamed from: b */
    private Dialog f6042b = null;

    /* renamed from: c */
    private DialogInterface.OnCancelListener f6043c = null;

    /* renamed from: a */
    public static DialogFragmentC0992b m6946a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC0992b dialogFragmentC0992b = new DialogFragmentC0992b();
        C1057u.m7287a(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC0992b.f6042b = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC0992b.f6043c = onCancelListener;
        }
        return dialogFragmentC0992b;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f6043c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f6042b == null) {
            setShowsDialog(false);
        }
        return this.f6042b;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
