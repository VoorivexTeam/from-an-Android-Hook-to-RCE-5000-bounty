package com.google.android.gms.location.places;

import com.google.android.gms.common.data.DataHolder;

@Deprecated
/* loaded from: classes.dex */
public class c extends com.google.android.gms.common.data.a<b> {
    public c(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.b
    public b get(int i) {
        return new com.google.android.gms.location.places.internal.e(this.b, i);
    }
}
