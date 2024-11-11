package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C1108n;
import javax.annotation.concurrent.GuardedBy;
import p000.AbstractC3069p3;

/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC3069p3 {

    /* renamed from: c */
    @GuardedBy("FirebaseInstanceIdReceiver.class")
    private static ServiceConnectionC2089d0 f8879c;

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public static int m10625a(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        boolean z = C1108n.m7404j() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return m10627b(broadcastReceiver, context, intent);
        }
        int m10685a = C2119s.m10683b().m10685a(context, intent);
        if (!C1108n.m7404j() || m10685a != 402) {
            return m10685a;
        }
        m10627b(broadcastReceiver, context, intent);
        return 403;
    }

    /* renamed from: a */
    private static synchronized ServiceConnectionC2089d0 m10626a(Context context, String str) {
        ServiceConnectionC2089d0 serviceConnectionC2089d0;
        synchronized (FirebaseInstanceIdReceiver.class) {
            if (f8879c == null) {
                f8879c = new ServiceConnectionC2089d0(context, str);
            }
            serviceConnectionC2089d0 = f8879c;
        }
        return serviceConnectionC2089d0;
    }

    /* renamed from: b */
    private static int m10627b(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        Log.isLoggable("FirebaseInstanceId", 3);
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        m10626a(context, "com.google.firebase.MESSAGING_EVENT").m10645a(intent, broadcastReceiver.goAsync());
        return -1;
    }

    /* renamed from: c */
    private final void m10628c(Context context, Intent intent) {
        int m10625a;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (Build.VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        if ("google.com/iid".equals(intent.getStringExtra("from"))) {
            String stringExtra = intent.getStringExtra("CMD");
            if (stringExtra != null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(intent.getExtras());
                    StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(valueOf).length());
                    sb.append("Received command: ");
                    sb.append(stringExtra);
                    sb.append(" - ");
                    sb.append(valueOf);
                    sb.toString();
                }
                if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                    FirebaseInstanceId.m10599i().m10617e();
                } else if ("SYNC".equals(stringExtra)) {
                    FirebaseInstanceId.m10599i().m10619g();
                }
            }
            m10625a = -1;
        } else {
            String stringExtra2 = intent.getStringExtra("gcm.rawData64");
            if (stringExtra2 != null) {
                intent.putExtra("rawData", Base64.decode(stringExtra2, 0));
                intent.removeExtra("gcm.rawData64");
            }
            m10625a = m10625a(this, context, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(m10625a);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
        Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
        if (intent2 != null) {
            m10628c(context, intent2);
        } else {
            m10628c(context, intent);
        }
    }
}
