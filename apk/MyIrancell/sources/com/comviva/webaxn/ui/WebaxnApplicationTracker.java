package com.comviva.webaxn.ui;

import android.app.Application;
import com.comviva.webaxn.utils.r1;
import com.mtni.myirancell.R;
import defpackage.y3;
import defpackage.zi;
import ir.tapsell.sdk.Tapsell;

/* loaded from: classes.dex */
public class WebaxnApplicationTracker extends y3 {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        if (zi.A == 1) {
            r1.a(getApplicationContext());
        }
        if (zi.D) {
            Tapsell.initialize((Application) this, getString(R.string.tapsell_app_key));
        }
    }
}
