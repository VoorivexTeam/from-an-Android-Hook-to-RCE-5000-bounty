package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class m6 {
    final Context a;
    String b;
    String c;
    String d;
    Boolean e;
    long f;
    com.google.android.gms.internal.measurement.zzv g;
    boolean h;

    public m6(Context context, com.google.android.gms.internal.measurement.zzv zzvVar) {
        this.h = true;
        com.google.android.gms.common.internal.u.a(context);
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.u.a(applicationContext);
        this.a = applicationContext;
        if (zzvVar != null) {
            this.g = zzvVar;
            this.b = zzvVar.g;
            this.c = zzvVar.f;
            this.d = zzvVar.e;
            this.h = zzvVar.d;
            this.f = zzvVar.c;
            Bundle bundle = zzvVar.h;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
