package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class b implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.InterfaceC0048b interfaceC0048b) {
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        int a = interfaceC0048b.a(context, str);
        aVar.a = a;
        if (a != 0) {
            aVar.c = -1;
        } else {
            int a2 = interfaceC0048b.a(context, str, true);
            aVar.b = a2;
            if (a2 != 0) {
                aVar.c = 1;
            }
        }
        return aVar;
    }
}
