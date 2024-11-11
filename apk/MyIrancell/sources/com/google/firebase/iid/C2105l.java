package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.l */
/* loaded from: classes.dex */
final class C2105l extends AbstractC2101j<Bundle> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2105l(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.AbstractC2101j
    /* renamed from: a */
    public final void mo10647a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        m10653a((C2105l) bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.AbstractC2101j
    /* renamed from: a */
    public final boolean mo10648a() {
        return false;
    }
}
