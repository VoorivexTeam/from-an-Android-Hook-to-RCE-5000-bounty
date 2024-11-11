package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class e implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.InterfaceC0048b interfaceC0048b) {
        int i;
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        aVar.a = interfaceC0048b.a(context, str);
        int a = interfaceC0048b.a(context, str, true);
        aVar.b = a;
        if (aVar.a == 0 && a == 0) {
            i = 0;
        } else {
            if (aVar.a < aVar.b) {
                aVar.c = 1;
                return aVar;
            }
            i = -1;
        }
        aVar.c = i;
        return aVar;
    }
}
