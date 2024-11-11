package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.b */
/* loaded from: classes.dex */
final class C1125b implements DynamiteModule.InterfaceC1121b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1121b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC1121b.a mo7451a(Context context, String str, DynamiteModule.InterfaceC1121b.b bVar) {
        DynamiteModule.InterfaceC1121b.a aVar = new DynamiteModule.InterfaceC1121b.a();
        int mo7452a = bVar.mo7452a(context, str);
        aVar.f6387a = mo7452a;
        if (mo7452a != 0) {
            aVar.f6389c = -1;
        } else {
            int mo7453a = bVar.mo7453a(context, str, true);
            aVar.f6388b = mo7453a;
            if (mo7453a != 0) {
                aVar.f6389c = 1;
            }
        }
        return aVar;
    }
}
