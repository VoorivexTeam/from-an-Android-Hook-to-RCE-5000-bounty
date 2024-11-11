package com.google.android.gms.common;

import android.content.Intent;

/* loaded from: classes.dex */
public class k extends Exception {
    private final Intent b;

    public k(String str, Intent intent) {
        super(str);
        this.b = intent;
    }
}
