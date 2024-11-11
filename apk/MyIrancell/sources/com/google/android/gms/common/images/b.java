package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.dq;

/* loaded from: classes.dex */
public abstract class b {
    protected int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Context context, Bitmap bitmap, boolean z) {
        com.google.android.gms.common.internal.c.a(bitmap);
        a(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Context context, dq dqVar, boolean z) {
        int i = this.a;
        a(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }

    protected abstract void a(Drawable drawable, boolean z, boolean z2, boolean z3);
}
