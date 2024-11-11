package com.comviva.webaxn.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: com.comviva.webaxn.utils.w1 */
/* loaded from: classes.dex */
public class C0752w1 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("com.google.android.gms.auth.api.phone.SMS_RETRIEVED")) {
            Bundle extras = intent.getExtras();
            int m6497j = ((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).m6497j();
            if (m6497j != 0) {
                if (m6497j != 15) {
                    return;
                }
                C0724n0 m5893a = C0724n0.m5893a(context);
                if (m5893a.m5913e()) {
                    m5893a.m5912d().mo5914a();
                    return;
                }
                return;
            }
            String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C0724n0 m5893a2 = C0724n0.m5893a(context);
            if (m5893a2.m5913e()) {
                if (m5893a2.m5909b() == null || m5893a2.m5911c() <= 0) {
                    return;
                }
                int indexOf = str.indexOf(m5893a2.m5909b());
                m5893a2.m5912d().mo5915a(indexOf != -1 ? str.substring(m5893a2.m5909b().length() + indexOf, indexOf + m5893a2.m5909b().length() + m5893a2.m5911c()).trim() : null);
            }
        }
    }
}
