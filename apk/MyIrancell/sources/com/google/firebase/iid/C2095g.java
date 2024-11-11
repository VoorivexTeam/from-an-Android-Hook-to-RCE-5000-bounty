package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.g */
/* loaded from: classes.dex */
final class C2095g extends AbstractC2101j<Void> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2095g(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.AbstractC2101j
    /* renamed from: a */
    public final void mo10647a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m10653a((C2095g) null);
        } else {
            m10652a(new C2099i(4, "Invalid response to one way request"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.AbstractC2101j
    /* renamed from: a */
    public final boolean mo10648a() {
        return true;
    }
}
