package com.comviva.webaxn.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import p000.l40;
import p000.n40;
import p000.r30;

/* renamed from: com.comviva.webaxn.utils.d1 */
/* loaded from: classes.dex */
public class C0695d1 extends BroadcastReceiver {
    /* renamed from: a */
    private String m5409a(int i, r30 r30Var, String str) {
        JsonObject jsonObject;
        if (r30Var != null) {
            jsonObject = new Gson().toJsonTree(r30Var).getAsJsonObject();
            jsonObject.addProperty("respStatusCode", Integer.valueOf(i));
        } else {
            jsonObject = null;
        }
        if (jsonObject == null) {
            jsonObject = new JsonObject();
            jsonObject.addProperty("respStatusCode", Integer.valueOf(i));
            jsonObject.addProperty("respMSG", str);
        }
        return jsonObject.toString();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C0727o0 m5926a;
        int i;
        int i2;
        Intent intent2;
        String m5409a;
        boolean z;
        if (intent.getAction().equalsIgnoreCase(l40.f11805a)) {
            int intExtra = intent.getIntExtra("status_code", 0);
            if (intExtra != 0) {
            }
            r30 r30Var = (r30) intent.getSerializableExtra(n40.f12213a);
            m5926a = C0727o0.m5926a(context);
            i = 1;
            i2 = -1;
            intent2 = null;
            m5409a = m5409a(intExtra, r30Var, null);
            z = false;
        } else {
            if (!intent.getAction().equalsIgnoreCase(l40.f11806b) && !intent.getAction().equalsIgnoreCase(l40.f11807c)) {
                return;
            }
            int intExtra2 = intent.getIntExtra("status_code", 0);
            String stringExtra = intent.getStringExtra(l40.f11808d);
            m5926a = C0727o0.m5926a(context);
            i = 1;
            i2 = -1;
            intent2 = null;
            m5409a = m5409a(intExtra2, null, stringExtra);
            z = true;
        }
        m5926a.m5929a(i, i2, intent2, m5409a, z);
    }
}
