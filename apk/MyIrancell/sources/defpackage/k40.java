package defpackage;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import com.google.gson.Gson;
import in.co.sixdee.ips_sdk.activities.PaymentRequest;
import in.co.sixdee.ips_sdk.service.GetPaymentModeService;

/* loaded from: classes.dex */
public class k40 {
    public ProgressDialog a(Activity activity, String str, String str2) {
        Bundle bundle = new Bundle();
        ProgressDialog a = p40.a(activity);
        bundle.putString(m40.a, str2);
        bundle.putString(m40.b, str);
        Intent intent = new Intent(activity, (Class<?>) GetPaymentModeService.class);
        intent.putExtras(bundle);
        activity.startService(intent);
        return a;
    }

    public String a() {
        return "2.0";
    }

    public void b(Activity activity, String str, String str2) {
        Bundle bundle = new Bundle();
        w30 w30Var = (w30) new Gson().fromJson(str, w30.class);
        bundle.putString(m40.b, str2);
        bundle.putString(m40.a, str);
        bundle.putSerializable(m40.c, w30Var);
        Intent intent = new Intent(activity, (Class<?>) PaymentRequest.class);
        intent.putExtras(bundle);
        activity.startActivity(intent);
        new StringBuilder("hostRequest").append(w30Var.b);
    }
}
