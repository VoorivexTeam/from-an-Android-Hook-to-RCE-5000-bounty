package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class f implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.InterfaceC0048b interfaceC0048b) {
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        int a = interfaceC0048b.a(context, str);
        aVar.a = a;
        aVar.b = a != 0 ? interfaceC0048b.a(context, str, false) : interfaceC0048b.a(context, str, true);
        if (aVar.a == 0 && aVar.b == 0) {
            aVar.c = 0;
        } else if (aVar.b >= aVar.a) {
            aVar.c = 1;
        } else {
            aVar.c = -1;
        }
        return aVar;
    }
}
