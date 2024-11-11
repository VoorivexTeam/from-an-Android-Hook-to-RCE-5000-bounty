package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.android.gms.measurement.internal.m6 */
/* loaded from: classes.dex */
public final class C1811m6 {

    /* renamed from: a */
    final Context f7760a;

    /* renamed from: b */
    String f7761b;

    /* renamed from: c */
    String f7762c;

    /* renamed from: d */
    String f7763d;

    /* renamed from: e */
    Boolean f7764e;

    /* renamed from: f */
    long f7765f;

    /* renamed from: g */
    com.google.android.gms.internal.measurement.zzv f7766g;

    /* renamed from: h */
    boolean f7767h;

    public C1811m6(Context context, com.google.android.gms.internal.measurement.zzv zzvVar) {
        this.f7767h = true;
        C1057u.m7286a(context);
        Context applicationContext = context.getApplicationContext();
        C1057u.m7286a(applicationContext);
        this.f7760a = applicationContext;
        if (zzvVar != null) {
            this.f7766g = zzvVar;
            this.f7761b = zzvVar.f7037g;
            this.f7762c = zzvVar.f7036f;
            this.f7763d = zzvVar.f7035e;
            this.f7767h = zzvVar.f7034d;
            this.f7765f = zzvVar.f7033c;
            Bundle bundle = zzvVar.f7038h;
            if (bundle != null) {
                this.f7764e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
