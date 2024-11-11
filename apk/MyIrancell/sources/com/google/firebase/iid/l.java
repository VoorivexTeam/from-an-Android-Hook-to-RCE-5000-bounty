package com.google.firebase.iid;

import android.os.Bundle;

/* loaded from: classes.dex */
final class l extends j<Bundle> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.j
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        a((l) bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.j
    public final boolean a() {
        return false;
    }
}
