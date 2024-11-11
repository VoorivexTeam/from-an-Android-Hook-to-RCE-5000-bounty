package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.e */
/* loaded from: classes.dex */
final class C1128e implements DynamiteModule.InterfaceC1121b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1121b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC1121b.a mo7451a(Context context, String str, DynamiteModule.InterfaceC1121b.b bVar) {
        int i;
        DynamiteModule.InterfaceC1121b.a aVar = new DynamiteModule.InterfaceC1121b.a();
        aVar.f6387a = bVar.mo7452a(context, str);
        int mo7453a = bVar.mo7453a(context, str, true);
        aVar.f6388b = mo7453a;
        if (aVar.f6387a == 0 && mo7453a == 0) {
            i = 0;
        } else {
            if (aVar.f6387a < aVar.f6388b) {
                aVar.f6389c = 1;
                return aVar;
            }
            i = -1;
        }
        aVar.f6389c = i;
        return aVar;
    }
}
