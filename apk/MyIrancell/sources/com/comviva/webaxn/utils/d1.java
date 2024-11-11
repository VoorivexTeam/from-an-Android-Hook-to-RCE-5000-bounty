package com.comviva.webaxn.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import defpackage.l40;
import defpackage.n40;
import defpackage.r30;

/* loaded from: classes.dex */
public class d1 extends BroadcastReceiver {
    private String a(int i, r30 r30Var, String str) {
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
        o0 a;
        int i;
        int i2;
        Intent intent2;
        String a2;
        boolean z;
        if (intent.getAction().equalsIgnoreCase(l40.a)) {
            int intExtra = intent.getIntExtra("status_code", 0);
            if (intExtra != 0) {
            }
            r30 r30Var = (r30) intent.getSerializableExtra(n40.a);
            a = o0.a(context);
            i = 1;
            i2 = -1;
            intent2 = null;
            a2 = a(intExtra, r30Var, null);
            z = false;
        } else {
            if (!intent.getAction().equalsIgnoreCase(l40.b) && !intent.getAction().equalsIgnoreCase(l40.c)) {
                return;
            }
            int intExtra2 = intent.getIntExtra("status_code", 0);
            String stringExtra = intent.getStringExtra(l40.d);
            a = o0.a(context);
            i = 1;
            i2 = -1;
            intent2 = null;
            a2 = a(intExtra2, null, stringExtra);
            z = true;
        }
        a.a(i, i2, intent2, a2, z);
    }
}
