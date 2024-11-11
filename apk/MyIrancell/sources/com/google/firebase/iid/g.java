package com.google.firebase.iid;

import android.os.Bundle;

/* loaded from: classes.dex */
final class g extends j<Void> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.j
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            a((g) null);
        } else {
            a(new i(4, "Invalid response to one way request"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.iid.j
    public final boolean a() {
        return true;
    }
}
