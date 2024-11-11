package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import com.google.android.gms.common.C0993c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: com.google.android.gms.common.api.internal.m2 */
/* loaded from: classes.dex */
final class RunnableC0926m2 implements Runnable {

    /* renamed from: b */
    private final C0930n2 f5896b;

    /* renamed from: c */
    final /* synthetic */ AbstractDialogInterfaceOnCancelListenerC0922l2 f5897c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0926m2(AbstractDialogInterfaceOnCancelListenerC0922l2 abstractDialogInterfaceOnCancelListenerC0922l2, C0930n2 c0930n2) {
        this.f5897c = abstractDialogInterfaceOnCancelListenerC0922l2;
        this.f5896b = c0930n2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5897c.f5890c) {
            ConnectionResult m6823a = this.f5896b.m6823a();
            if (m6823a.m6487m()) {
                AbstractDialogInterfaceOnCancelListenerC0922l2 abstractDialogInterfaceOnCancelListenerC0922l2 = this.f5897c;
                abstractDialogInterfaceOnCancelListenerC0922l2.f5733b.startActivityForResult(GoogleApiActivity.m6493a(abstractDialogInterfaceOnCancelListenerC0922l2.m6595a(), m6823a.m6486l(), this.f5896b.m6824b(), false), 1);
            } else if (this.f5897c.f5893f.mo6965c(m6823a.m6484j())) {
                AbstractDialogInterfaceOnCancelListenerC0922l2 abstractDialogInterfaceOnCancelListenerC0922l22 = this.f5897c;
                abstractDialogInterfaceOnCancelListenerC0922l22.f5893f.m6960a(abstractDialogInterfaceOnCancelListenerC0922l22.m6595a(), this.f5897c.f5733b, m6823a.m6484j(), 2, this.f5897c);
            } else {
                if (m6823a.m6484j() != 18) {
                    this.f5897c.mo6785a(m6823a, this.f5896b.m6824b());
                    return;
                }
                Dialog m6947a = C0993c.m6947a(this.f5897c.m6595a(), this.f5897c);
                AbstractDialogInterfaceOnCancelListenerC0922l2 abstractDialogInterfaceOnCancelListenerC0922l23 = this.f5897c;
                abstractDialogInterfaceOnCancelListenerC0922l23.f5893f.m6959a(abstractDialogInterfaceOnCancelListenerC0922l23.m6595a().getApplicationContext(), new C0934o2(this, m6947a));
            }
        }
    }
}
