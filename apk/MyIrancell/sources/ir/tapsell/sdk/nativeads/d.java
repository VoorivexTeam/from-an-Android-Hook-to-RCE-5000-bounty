package ir.tapsell.sdk.nativeads;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import defpackage.e70;

/* loaded from: classes.dex */
public class d extends DialogFragment {
    private c b;
    private e70 c;

    public d() {
        setRetainInstance(true);
    }

    public static d b(e70 e70Var) {
        d dVar = new d();
        dVar.a(e70Var);
        return dVar;
    }

    public void a(e70 e70Var) {
        this.c = e70Var;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.c == null) {
            dismiss();
        }
        c cVar = new c(getActivity(), this.c);
        this.b = cVar;
        return cVar;
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
        this.b.a();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.b.b();
    }
}
