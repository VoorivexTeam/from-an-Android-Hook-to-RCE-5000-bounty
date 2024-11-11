package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;

/* loaded from: classes.dex */
public abstract class g implements DialogInterface.OnClickListener {
    public static g a(Activity activity, Intent intent, int i) {
        return new z(intent, activity, i);
    }

    public static g a(com.google.android.gms.common.api.internal.j jVar, Intent intent, int i) {
        return new a0(intent, jVar, i);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            a();
        } catch (ActivityNotFoundException unused) {
        } finally {
            dialogInterface.dismiss();
        }
    }
}
