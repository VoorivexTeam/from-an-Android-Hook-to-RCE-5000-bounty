package com.google.zxing.client.android;

import android.app.Activity;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class i implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {
    private final Activity b;

    public i(Activity activity) {
        this.b = activity;
    }

    private void a() {
        this.b.finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        a();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        a();
    }
}
