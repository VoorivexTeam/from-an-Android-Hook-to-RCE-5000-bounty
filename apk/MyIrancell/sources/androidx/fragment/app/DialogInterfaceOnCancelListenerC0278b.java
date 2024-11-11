package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0278b extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: Z */
    int f1720Z = 0;

    /* renamed from: a0 */
    int f1721a0 = 0;

    /* renamed from: b0 */
    boolean f1722b0 = true;

    /* renamed from: c0 */
    boolean f1723c0 = true;

    /* renamed from: d0 */
    int f1724d0 = -1;

    /* renamed from: e0 */
    Dialog f1725e0;

    /* renamed from: f0 */
    boolean f1726f0;

    /* renamed from: g0 */
    boolean f1727g0;

    /* renamed from: h0 */
    boolean f1728h0;

    @Override // androidx.fragment.app.Fragment
    /* renamed from: O */
    public void mo1631O() {
        super.mo1631O();
        Dialog dialog = this.f1725e0;
        if (dialog != null) {
            this.f1726f0 = true;
            dialog.dismiss();
            this.f1725e0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P */
    public void mo1632P() {
        super.mo1632P();
        if (this.f1728h0 || this.f1727g0) {
            return;
        }
        this.f1727g0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: S */
    public void mo1635S() {
        super.mo1635S();
        Dialog dialog = this.f1725e0;
        if (dialog != null) {
            this.f1726f0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: T */
    public void mo1636T() {
        super.mo1636T();
        Dialog dialog = this.f1725e0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: a */
    public void m1773a(Dialog dialog, int i) {
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
    /* renamed from: a */
    public void mo1655a(Context context) {
        super.mo1655a(context);
        if (this.f1728h0) {
            return;
        }
        this.f1727g0 = false;
    }

    /* renamed from: a */
    public void mo1774a(AbstractC0282f abstractC0282f, String str) {
        this.f1727g0 = false;
        this.f1728h0 = true;
        AbstractC0285i mo1810a = abstractC0282f.mo1810a();
        mo1810a.mo1757a(this, str);
        mo1810a.mo1753a();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: b */
    public void mo1671b(Bundle bundle) {
        Bundle bundle2;
        super.mo1671b(bundle);
        if (this.f1723c0) {
            View m1618B = m1618B();
            if (m1618B != null) {
                if (m1618B.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f1725e0.setContentView(m1618B);
            }
            FragmentActivity m1690e = m1690e();
            if (m1690e != null) {
                this.f1725e0.setOwnerActivity(m1690e);
            }
            this.f1725e0.setCancelable(this.f1722b0);
            this.f1725e0.setOnCancelListener(this);
            this.f1725e0.setOnDismissListener(this);
            if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                return;
            }
            this.f1725e0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: c */
    public void mo1679c(Bundle bundle) {
        super.mo1679c(bundle);
        this.f1723c0 = this.f1636z == 0;
        if (bundle != null) {
            this.f1720Z = bundle.getInt("android:style", 0);
            this.f1721a0 = bundle.getInt("android:theme", 0);
            this.f1722b0 = bundle.getBoolean("android:cancelable", true);
            this.f1723c0 = bundle.getBoolean("android:showsDialog", this.f1723c0);
            this.f1724d0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: d */
    public LayoutInflater mo1684d(Bundle bundle) {
        Context m1805c;
        if (!this.f1723c0) {
            return super.mo1684d(bundle);
        }
        Dialog mo1777n = mo1777n(bundle);
        this.f1725e0 = mo1777n;
        if (mo1777n != null) {
            m1773a(mo1777n, this.f1720Z);
            m1805c = this.f1725e0.getContext();
        } else {
            m1805c = this.f1630t.m1805c();
        }
        return (LayoutInflater) m1805c.getSystemService("layout_inflater");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: e */
    public void mo1691e(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.mo1691e(bundle);
        Dialog dialog = this.f1725e0;
        if (dialog != null && (onSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f1720Z;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1721a0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f1722b0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f1723c0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f1724d0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: h */
    void m1775h(boolean z) {
        if (this.f1727g0) {
            return;
        }
        this.f1727g0 = true;
        this.f1728h0 = false;
        Dialog dialog = this.f1725e0;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.f1726f0 = true;
        if (this.f1724d0 >= 0) {
            m1714p().mo1811a(this.f1724d0, 1);
            this.f1724d0 = -1;
            return;
        }
        AbstractC0285i mo1810a = m1714p().mo1810a();
        mo1810a.mo1756a(this);
        if (z) {
            mo1810a.mo1765b();
        } else {
            mo1810a.mo1753a();
        }
    }

    /* renamed from: i */
    public void m1776i(boolean z) {
        this.f1723c0 = z;
    }

    /* renamed from: n */
    public Dialog mo1777n(Bundle bundle) {
        throw null;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1726f0) {
            return;
        }
        m1775h(true);
    }
}
