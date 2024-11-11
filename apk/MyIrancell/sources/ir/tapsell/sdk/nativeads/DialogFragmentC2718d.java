package ir.tapsell.sdk.nativeads;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import p000.e70;

/* renamed from: ir.tapsell.sdk.nativeads.d */
/* loaded from: classes.dex */
public class DialogFragmentC2718d extends DialogFragment {

    /* renamed from: b */
    private DialogC2717c f11154b;

    /* renamed from: c */
    private e70 f11155c;

    public DialogFragmentC2718d() {
        setRetainInstance(true);
    }

    /* renamed from: b */
    public static DialogFragmentC2718d m13016b(e70 e70Var) {
        DialogFragmentC2718d dialogFragmentC2718d = new DialogFragmentC2718d();
        dialogFragmentC2718d.m13017a(e70Var);
        return dialogFragmentC2718d;
    }

    /* renamed from: a */
    public void m13017a(e70 e70Var) {
        this.f11155c = e70Var;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f11155c == null) {
            dismiss();
        }
        DialogC2717c dialogC2717c = new DialogC2717c(getActivity(), this.f11155c);
        this.f11154b = dialogC2717c;
        return dialogC2717c;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        this.f11154b.m13014a();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f11154b.m13015b();
    }
}
