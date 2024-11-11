package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class z4 {
    private final f5 a;

    public z4(f5 f5Var) {
        com.google.android.gms.common.internal.u.a(f5Var);
        this.a = f5Var;
    }

    public static boolean a(Context context) {
        ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.u.a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final void a(Context context, Intent intent) {
        j5 a = j5.a(context, (com.google.android.gms.internal.measurement.zzv) null);
        f4 k = a.k();
        if (intent == null) {
            k.w().a("Receiver called with null intent");
            return;
        }
        a.d();
        String action = intent.getAction();
        k.B().a("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            k.B().a("Starting wakeful intent.");
            this.a.a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                a.g().a(new c5(this, a, k));
            } catch (Exception e) {
                k.w().a("Install Referrer Reporter encountered a problem", e);
            }
            BroadcastReceiver.PendingResult a2 = this.a.a();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                k.B().a("Install referrer extras are null");
                if (a2 != null) {
                    a2.finish();
                    return;
                }
                return;
            }
            k.z().a("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                String valueOf = String.valueOf(stringExtra);
                stringExtra = valueOf.length() != 0 ? "?".concat(valueOf) : new String("?");
            }
            Bundle a3 = a.w().a(Uri.parse(stringExtra));
            if (a3 == null) {
                k.B().a("No campaign defined in install referrer broadcast");
                if (a2 != null) {
                    a2.finish();
                    return;
                }
                return;
            }
            long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0L) * 1000;
            if (longExtra == 0) {
                k.w().a("Install referrer is missing timestamp");
            }
            a.g().a(new b5(this, a, longExtra, a3, context, k, a2));
        }
    }
}
