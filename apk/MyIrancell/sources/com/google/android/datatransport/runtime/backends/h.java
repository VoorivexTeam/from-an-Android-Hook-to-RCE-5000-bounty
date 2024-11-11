package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import defpackage.wn;

/* loaded from: classes.dex */
public abstract class h {
    public static h a(Context context, wn wnVar, wn wnVar2, String str) {
        return new c(context, wnVar, wnVar2, str);
    }

    public abstract Context a();

    public abstract String b();

    public abstract wn c();

    public abstract wn d();
}
