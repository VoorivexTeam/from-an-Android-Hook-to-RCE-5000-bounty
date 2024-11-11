package com.comviva.webaxn.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import com.comviva.webaxn.ui.WebAxnActivity;
import com.mtni.myirancell.R;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.yj;
import java.util.HashMap;

/* loaded from: classes.dex */
public class m0 {
    private static m0 d;
    private Context a;
    private HashMap<String, String> b;
    private AlertDialog c = null;

    /* loaded from: classes.dex */
    class a {
        a(m0 m0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnClickListener {
        final /* synthetic */ boolean b;

        b(boolean z) {
            this.b = z;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Context context;
            Intent intent;
            try {
                if (this.b) {
                    context = m0.this.a;
                    intent = new Intent("android.settings.NFC_SETTINGS");
                } else {
                    context = m0.this.a;
                    intent = new Intent("android.settings.NFCSHARING_SETTINGS");
                }
                context.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnClickListener {
        final /* synthetic */ boolean b;

        c(boolean z) {
            this.b = z;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Context context;
            Intent intent;
            try {
                if (this.b) {
                    context = m0.this.a;
                    intent = new Intent("android.settings.NFC_SETTINGS");
                } else {
                    context = m0.this.a;
                    intent = new Intent("android.settings.NFCSHARING_SETTINGS");
                }
                context.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    private m0(Context context) {
        new a(this);
        this.a = context;
    }

    public static m0 a(Context context) {
        if (d == null) {
            d = new m0(context);
        }
        return d;
    }

    public void a() {
        if (d != null) {
            d = null;
        }
        HashMap<String, String> hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
            this.b = null;
        }
        this.a = null;
    }

    public void a(String str, String str2, boolean z, boolean z2, boolean z3) {
        try {
            WebAxnActivity webAxnActivity = (WebAxnActivity) this.a;
            if (webAxnActivity.b().a(str2, false)) {
                return;
            }
            String c2 = j1.a(webAxnActivity).c(str2);
            if (this.c != null && this.c.isShowing()) {
                this.c.dismiss();
            }
            if (webAxnActivity.isFinishing()) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
            if (TextUtils.isEmpty(str)) {
                str = this.a.getString(R.string.dialog_title);
            }
            builder.setTitle(str);
            if (TextUtils.isEmpty(c2)) {
                c2 = z3 ? this.a.getString(R.string.nfc_setting_enable_confirm_message) : this.a.getString(R.string.android_beam_enable_confirm_message);
            }
            builder.setMessage(c2);
            if (z) {
                if (z2) {
                    builder.setIcon(android.R.drawable.ic_dialog_info);
                }
                String c3 = j1.a(webAxnActivity).c("cmd.Ok");
                if (c3 == null) {
                    c3 = this.a.getString(R.string.dialog_button_ok);
                }
                String c4 = j1.a(webAxnActivity).c("cmd.Cancel");
                if (c4 == null) {
                    c4 = this.a.getString(R.string.dialog_button_cancel);
                }
                builder.setPositiveButton(c3, new b(z3));
                builder.setNegativeButton(c4, (DialogInterface.OnClickListener) null);
                builder.setCancelable(false);
            } else {
                if (z2) {
                    builder.setIcon(android.R.drawable.ic_dialog_alert);
                }
                String c5 = j1.a(webAxnActivity).c("cmd.Ok");
                if (c5 == null) {
                    c5 = this.a.getString(R.string.dialog_button_ok);
                }
                builder.setPositiveButton(c5, new c(z3));
            }
            AlertDialog create = builder.create();
            this.c = create;
            create.setCanceledOnTouchOutside(false);
            this.c.show();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    public boolean a(String str, wj wjVar, mj mjVar, lj ljVar, yj yjVar, e eVar, com.comviva.webaxn.ui.o1 o1Var) {
        boolean z = false;
        if (k.f() == null) {
            Toast.makeText(this.a, "This device doesn't support NFC.", 1).show();
        } else if (k.i()) {
            z = true;
        } else {
            a(j1.a(this.a).c("ttl.Alert"), j1.a(this.a).c("msg.NFCOn"), true, true, true);
        }
        if (z) {
            HashMap<String, String> hashMap = this.b;
            if (hashMap != null) {
                hashMap.clear();
            }
            this.b = x1.f(str);
        }
        return z;
    }

    public void b() {
        String string = this.a.getString(R.string.nfc_scan);
        if (!TextUtils.isEmpty(this.b.get("message"))) {
            string = this.b.get("message");
        }
        Toast.makeText(this.a, string, 0).show();
    }
}
