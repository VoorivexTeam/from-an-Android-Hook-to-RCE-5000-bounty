package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.AbstractC0776h;
import com.google.android.datatransport.runtime.backends.InterfaceC0772d;
import com.google.android.datatransport.runtime.backends.InterfaceC0781m;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements InterfaceC0772d {
    @Override // com.google.android.datatransport.runtime.backends.InterfaceC0772d
    public InterfaceC0781m create(AbstractC0776h abstractC0776h) {
        return new C0767d(abstractC0776h.mo6274a(), abstractC0776h.mo6277d(), abstractC0776h.mo6276c());
    }
}
