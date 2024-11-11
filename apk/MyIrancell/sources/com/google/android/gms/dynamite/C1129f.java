package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.f */
/* loaded from: classes.dex */
final class C1129f implements DynamiteModule.InterfaceC1121b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1121b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC1121b.a mo7451a(Context context, String str, DynamiteModule.InterfaceC1121b.b bVar) {
        DynamiteModule.InterfaceC1121b.a aVar = new DynamiteModule.InterfaceC1121b.a();
        int mo7452a = bVar.mo7452a(context, str);
        aVar.f6387a = mo7452a;
        aVar.f6388b = mo7452a != 0 ? bVar.mo7453a(context, str, false) : bVar.mo7453a(context, str, true);
        if (aVar.f6387a == 0 && aVar.f6388b == 0) {
            aVar.f6389c = 0;
        } else if (aVar.f6388b >= aVar.f6387a) {
            aVar.f6389c = 1;
        } else {
            aVar.f6389c = -1;
        }
        return aVar;
    }
}
