package com.comviva.webaxn.utils;

import android.content.Context;

/* loaded from: classes.dex */
public class b {
    private static b b;
    private j a;

    private b(Context context) {
        j jVar = this.a;
        if (jVar == null) {
            this.a = new j(context);
        } else {
            jVar.j();
        }
    }

    public static b a(Context context) {
        if (b == null) {
            b = new b(context);
        }
        return b;
    }

    public j a() {
        return this.a;
    }

    public void b() {
        b.a().j();
    }
}
