package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes.dex */
public class b extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    int Z = 0;
    int a0 = 0;
    boolean b0 = true;
    boolean c0 = true;
    int d0 = -1;
    Dialog e0;
    boolean f0;
    boolean g0;
    boolean h0;

    @Override // androidx.fragment.app.Fragment
    public void O() {
        super.O();
        Dialog dialog = this.e0;
        if (dialog != null) {
            this.f0 = true;
            dialog.dismiss();
            this.e0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P() {
        super.P();
        if (this.h0 || this.g0) {
            return;
        }
        this.g0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void S() {
        super.S();
        Dialog dialog = this.e0;
        if (dialog != null) {
            this.f0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void T() {
        super.T();
        Dialog dialog = this.e0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void a(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // androidx.fragment.app.Fragment
    public void a(Context context) {
        super.a(context);
        if (this.h0) {
            return;
        }
        this.g0 = false;
    }

    public void a(f fVar, String str) {
        this.g0 = false;
        this.h0 = true;
        i a = fVar.a();
        a.a(this, str);
        a.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void b(Bundle bundle) {
        Bundle bundle2;
        super.b(bundle);
        if (this.c0) {
            View B = B();
            if (B != null) {
                if (B.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.e0.setContentView(B);
            }
            FragmentActivity e = e();
            if (e != null) {
                this.e0.setOwnerActivity(e);
            }
            this.e0.setCancelable(this.b0);
            this.e0.setOnCancelListener(this);
            this.e0.setOnDismissListener(this);
            if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                return;
            }
            this.e0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void c(Bundle bundle) {
        super.c(bundle);
        this.c0 = this.z == 0;
        if (bundle != null) {
            this.Z = bundle.getInt("android:style", 0);
            this.a0 = bundle.getInt("android:theme", 0);
            this.b0 = bundle.getBoolean("android:cancelable", true);
            this.c0 = bundle.getBoolean("android:showsDialog", this.c0);
            this.d0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater d(Bundle bundle) {
        Context c;
        if (!this.c0) {
            return super.d(bundle);
        }
        Dialog n = n(bundle);
        this.e0 = n;
        if (n != null) {
            a(n, this.Z);
            c = this.e0.getContext();
        } else {
            c = this.t.c();
        }
        return (LayoutInflater) c.getSystemService("layout_inflater");
    }

    @Override // androidx.fragment.app.Fragment
    public void e(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.e(bundle);
        Dialog dialog = this.e0;
        if (dialog != null && (onSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.Z;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.a0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.b0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.c0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.d0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    void h(boolean z) {
        if (this.g0) {
            return;
        }
        this.g0 = true;
        this.h0 = false;
        Dialog dialog = this.e0;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.f0 = true;
        if (this.d0 >= 0) {
            p().a(this.d0, 1);
            this.d0 = -1;
            return;
        }
        i a = p().a();
        a.a(this);
        if (z) {
            a.b();
        } else {
            a.a();
        }
    }

    public void i(boolean z) {
        this.c0 = z;
    }

    public Dialog n(Bundle bundle) {
        throw null;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f0) {
            return;
        }
        h(true);
    }
}
