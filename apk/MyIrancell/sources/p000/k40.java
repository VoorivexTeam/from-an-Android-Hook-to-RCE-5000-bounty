package p000;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import com.google.gson.Gson;
import in.co.sixdee.ips_sdk.activities.PaymentRequest;
import in.co.sixdee.ips_sdk.service.GetPaymentModeService;

/* loaded from: classes.dex */
public class k40 {
    /* renamed from: a */
    public ProgressDialog m13608a(Activity activity, String str, String str2) {
        Bundle bundle = new Bundle();
        ProgressDialog m14715a = p40.m14715a(activity);
        bundle.putString(m40.f12075a, str2);
        bundle.putString(m40.f12076b, str);
        Intent intent = new Intent(activity, (Class<?>) GetPaymentModeService.class);
        intent.putExtras(bundle);
        activity.startService(intent);
        return m14715a;
    }

    /* renamed from: a */
    public String m13609a() {
        return "2.0";
    }

    /* renamed from: b */
    public void m13610b(Activity activity, String str, String str2) {
        Bundle bundle = new Bundle();
        w30 w30Var = (w30) new Gson().fromJson(str, w30.class);
        bundle.putString(m40.f12076b, str2);
        bundle.putString(m40.f12075a, str);
        bundle.putSerializable(m40.f12077c, w30Var);
        Intent intent = new Intent(activity, (Class<?>) PaymentRequest.class);
        intent.putExtras(bundle);
        activity.startActivity(intent);
        new StringBuilder("hostRequest").append(w30Var.f13755b);
    }
}
