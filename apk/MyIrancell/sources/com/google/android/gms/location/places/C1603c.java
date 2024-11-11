package com.google.android.gms.location.places;

import com.google.android.gms.common.data.AbstractC0996a;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.C1614e;

@Deprecated
/* renamed from: com.google.android.gms.location.places.c */
/* loaded from: classes.dex */
public class C1603c extends AbstractC0996a<InterfaceC1602b> {
    public C1603c(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.InterfaceC0997b
    public InterfaceC1602b get(int i) {
        return new C1614e(this.f6068b, i);
    }
}
