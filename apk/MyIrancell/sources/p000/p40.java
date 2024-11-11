package p000;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import in.co.sixdee.ips_sdk.R$layout;

/* loaded from: classes.dex */
public final class p40 {
    /* renamed from: a */
    public static ProgressDialog m14715a(Context context) {
        ProgressDialog progressDialog = null;
        try {
            ProgressDialog progressDialog2 = new ProgressDialog(context);
            try {
                progressDialog2.show();
                progressDialog2.setCancelable(false);
                progressDialog2.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                progressDialog2.setContentView(R$layout.progress_dialog);
                return progressDialog2;
            } catch (Exception e) {
                e = e;
                progressDialog = progressDialog2;
                e.printStackTrace();
                return progressDialog;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
