package ir.metrix.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MetrixReferrerReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public static void m12500a(String str) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("playStoreReferrer", str);
            hashMap.put("playStoreReferralTime", System.currentTimeMillis() + "");
            Metrix.getInstance().addUserAttributes(hashMap);
        } catch (Exception e) {
            C2610ab.m12529b("ReferrerReceiver", e.getMessage());
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("referrer");
        if (stringExtra == null) {
            return;
        }
        m12500a(stringExtra);
    }
}
