package com.comviva.webaxn.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import com.comviva.webaxn.p002ui.C0655o1;
import com.comviva.webaxn.p002ui.WebAxnActivity;
import com.mtni.myirancell.R;
import java.util.HashMap;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.m0 */
/* loaded from: classes.dex */
public class C0721m0 {

    /* renamed from: d */
    private static C0721m0 f5003d;

    /* renamed from: a */
    private Context f5004a;

    /* renamed from: b */
    private HashMap<String, String> f5005b;

    /* renamed from: c */
    private AlertDialog f5006c = null;

    /* renamed from: com.comviva.webaxn.utils.m0$a */
    /* loaded from: classes.dex */
    class a {
        a(C0721m0 c0721m0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.m0$b */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ boolean f5007b;

        b(boolean z) {
            this.f5007b = z;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Context context;
            Intent intent;
            try {
                if (this.f5007b) {
                    context = C0721m0.this.f5004a;
                    intent = new Intent("android.settings.NFC_SETTINGS");
                } else {
                    context = C0721m0.this.f5004a;
                    intent = new Intent("android.settings.NFCSHARING_SETTINGS");
                }
                context.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.m0$c */
    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ boolean f5009b;

        c(boolean z) {
            this.f5009b = z;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Context context;
            Intent intent;
            try {
                if (this.f5009b) {
                    context = C0721m0.this.f5004a;
                    intent = new Intent("android.settings.NFC_SETTINGS");
                } else {
                    context = C0721m0.this.f5004a;
                    intent = new Intent("android.settings.NFCSHARING_SETTINGS");
                }
                context.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    private C0721m0(Context context) {
        new a(this);
        this.f5004a = context;
    }

    /* renamed from: a */
    public static C0721m0 m5880a(Context context) {
        if (f5003d == null) {
            f5003d = new C0721m0(context);
        }
        return f5003d;
    }

    /* renamed from: a */
    public void m5881a() {
        if (f5003d != null) {
            f5003d = null;
        }
        HashMap<String, String> hashMap = this.f5005b;
        if (hashMap != null) {
            hashMap.clear();
            this.f5005b = null;
        }
        this.f5004a = null;
    }

    /* renamed from: a */
    public void m5882a(String str, String str2, boolean z, boolean z2, boolean z3) {
        try {
            WebAxnActivity webAxnActivity = (WebAxnActivity) this.f5004a;
            if (webAxnActivity.m4078b().m16297a(str2, false)) {
                return;
            }
            String m5641c = C0713j1.m5563a(webAxnActivity).m5641c(str2);
            if (this.f5006c != null && this.f5006c.isShowing()) {
                this.f5006c.dismiss();
            }
            if (webAxnActivity.isFinishing()) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
            if (TextUtils.isEmpty(str)) {
                str = this.f5004a.getString(R.string.dialog_title);
            }
            builder.setTitle(str);
            if (TextUtils.isEmpty(m5641c)) {
                m5641c = z3 ? this.f5004a.getString(R.string.nfc_setting_enable_confirm_message) : this.f5004a.getString(R.string.android_beam_enable_confirm_message);
            }
            builder.setMessage(m5641c);
            if (z) {
                if (z2) {
                    builder.setIcon(android.R.drawable.ic_dialog_info);
                }
                String m5641c2 = C0713j1.m5563a(webAxnActivity).m5641c("cmd.Ok");
                if (m5641c2 == null) {
                    m5641c2 = this.f5004a.getString(R.string.dialog_button_ok);
                }
                String m5641c3 = C0713j1.m5563a(webAxnActivity).m5641c("cmd.Cancel");
                if (m5641c3 == null) {
                    m5641c3 = this.f5004a.getString(R.string.dialog_button_cancel);
                }
                builder.setPositiveButton(m5641c2, new b(z3));
                builder.setNegativeButton(m5641c3, (DialogInterface.OnClickListener) null);
                builder.setCancelable(false);
            } else {
                if (z2) {
                    builder.setIcon(android.R.drawable.ic_dialog_alert);
                }
                String m5641c4 = C0713j1.m5563a(webAxnActivity).m5641c("cmd.Ok");
                if (m5641c4 == null) {
                    m5641c4 = this.f5004a.getString(R.string.dialog_button_ok);
                }
                builder.setPositiveButton(m5641c4, new c(z3));
            }
            AlertDialog create = builder.create();
            this.f5006c = create;
            create.setCanceledOnTouchOutside(false);
            this.f5006c.show();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public boolean m5883a(String str, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, C3489yj c3489yj, C0696e c0696e, C0655o1 c0655o1) {
        boolean z = false;
        if (C0714k.m5765f() == null) {
            Toast.makeText(this.f5004a, "This device doesn't support NFC.", 1).show();
        } else if (C0714k.m5772i()) {
            z = true;
        } else {
            m5882a(C0713j1.m5563a(this.f5004a).m5641c("ttl.Alert"), C0713j1.m5563a(this.f5004a).m5641c("msg.NFCOn"), true, true, true);
        }
        if (z) {
            HashMap<String, String> hashMap = this.f5005b;
            if (hashMap != null) {
                hashMap.clear();
            }
            this.f5005b = C0755x1.m6188f(str);
        }
        return z;
    }

    /* renamed from: b */
    public void m5884b() {
        String string = this.f5004a.getString(R.string.nfc_scan);
        if (!TextUtils.isEmpty(this.f5005b.get("message"))) {
            string = this.f5005b.get("message");
        }
        Toast.makeText(this.f5004a, string, 0).show();
    }
}
