package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.android.gms.measurement.internal.z4 */
/* loaded from: classes.dex */
public final class C1954z4 {

    /* renamed from: a */
    private final InterfaceC1726f5 f8205a;

    public C1954z4(InterfaceC1726f5 interfaceC1726f5) {
        C1057u.m7286a(interfaceC1726f5);
        this.f8205a = interfaceC1726f5;
    }

    /* renamed from: a */
    public static boolean m9903a(Context context) {
        ActivityInfo receiverInfo;
        C1057u.m7286a(context);
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

    /* renamed from: a */
    public final void m9904a(Context context, Intent intent) {
        C1774j5 m9389a = C1774j5.m9389a(context, (com.google.android.gms.internal.measurement.zzv) null);
        C1725f4 mo9324k = m9389a.mo9324k();
        if (intent == null) {
            mo9324k.m9312w().m9365a("Receiver called with null intent");
            return;
        }
        m9389a.mo9317d();
        String action = intent.getAction();
        mo9324k.m9304B().m9366a("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            mo9324k.m9304B().m9365a("Starting wakeful intent.");
            this.f8205a.mo9077a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                m9389a.mo9320g().m9344a(new RunnableC1690c5(this, m9389a, mo9324k));
            } catch (Exception e) {
                mo9324k.m9312w().m9366a("Install Referrer Reporter encountered a problem", e);
            }
            BroadcastReceiver.PendingResult mo9076a = this.f8205a.mo9076a();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                mo9324k.m9304B().m9365a("Install referrer extras are null");
                if (mo9076a != null) {
                    mo9076a.finish();
                    return;
                }
                return;
            }
            mo9324k.m9315z().m9366a("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                String valueOf = String.valueOf(stringExtra);
                stringExtra = valueOf.length() != 0 ? "?".concat(valueOf) : new String("?");
            }
            Bundle m9933a = m9389a.m9426w().m9933a(Uri.parse(stringExtra));
            if (m9933a == null) {
                mo9324k.m9304B().m9365a("No campaign defined in install referrer broadcast");
                if (mo9076a != null) {
                    mo9076a.finish();
                    return;
                }
                return;
            }
            long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0L) * 1000;
            if (longExtra == 0) {
                mo9324k.m9312w().m9365a("Install referrer is missing timestamp");
            }
            m9389a.mo9320g().m9344a(new RunnableC1678b5(this, m9389a, longExtra, m9933a, context, mo9324k, mo9076a));
        }
    }
}
