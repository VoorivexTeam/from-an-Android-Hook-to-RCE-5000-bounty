package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.internal.C1018c;
import p000.C2398dq;

/* renamed from: com.google.android.gms.common.images.b */
/* loaded from: classes.dex */
public abstract class AbstractC1012b {

    /* renamed from: a */
    protected int f6108a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7028a(Context context, Bitmap bitmap, boolean z) {
        C1018c.m7046a(bitmap);
        m7030a(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7029a(Context context, C2398dq c2398dq, boolean z) {
        int i = this.f6108a;
        m7030a(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }

    /* renamed from: a */
    protected abstract void m7030a(Drawable drawable, boolean z, boolean z2, boolean z3);
}
