package com.comviva.webaxn.p002ui;

import android.app.Application;
import com.comviva.webaxn.utils.C0737r1;
import com.mtni.myirancell.R;
import ir.tapsell.sdk.Tapsell;
import p000.ApplicationC3470y3;
import p000.C3530zi;

/* loaded from: classes.dex */
public class WebaxnApplicationTracker extends ApplicationC3470y3 {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        if (C3530zi.f14454A == 1) {
            C0737r1.m6010a(getApplicationContext());
        }
        if (C3530zi.f14457D) {
            Tapsell.initialize((Application) this, getString(R.string.tapsell_app_key));
        }
    }
}
