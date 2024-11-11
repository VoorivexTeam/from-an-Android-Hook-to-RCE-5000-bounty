package com.comviva.webaxn.utils;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.comviva.webaxn.p002ui.WebAxnActivity;
import com.comviva.webaxn.utils.C0755x1;
import java.util.HashMap;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.k0 */
/* loaded from: classes.dex */
public class C0715k0 {

    /* renamed from: k */
    private static C0715k0 f4887k;

    /* renamed from: a */
    private Context f4888a;

    /* renamed from: b */
    private C3400wj f4889b;

    /* renamed from: c */
    private C2945mj f4890c;

    /* renamed from: d */
    private C2899lj f4891d;

    /* renamed from: e */
    private C3489yj f4892e;

    /* renamed from: f */
    private C0696e f4893f;

    /* renamed from: g */
    private HashMap<String, String> f4894g;

    /* renamed from: h */
    private AlertDialog f4895h;

    /* renamed from: i */
    public final C0755x1.l f4896i = new a();

    /* renamed from: j */
    private final C0755x1.o f4897j = new d();

    /* renamed from: com.comviva.webaxn.utils.k0$a */
    /* loaded from: classes.dex */
    class a implements C0755x1.l {
        a() {
        }

        @Override // com.comviva.webaxn.utils.C0755x1.l
        /* renamed from: a */
        public void mo5452a(boolean z) {
            if (z) {
                C0715k0.this.m5797b(false);
            } else {
                C0715k0.this.m5798c(false);
                Toast.makeText(C0715k0.this.f4888a, "Location services are not available.Please try again", 0).show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.k0$b */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ WebAxnActivity f4899b;

        b(C0715k0 c0715k0, WebAxnActivity webAxnActivity) {
            this.f4899b = webAxnActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.f4899b.getPackageName(), null));
            this.f4899b.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.utils.k0$c */
    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnClickListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C0715k0.this.m5798c(true);
        }
    }

    /* renamed from: com.comviva.webaxn.utils.k0$d */
    /* loaded from: classes.dex */
    class d implements C0755x1.o {
        d() {
        }

        @Override // com.comviva.webaxn.utils.C0755x1.o
        /* renamed from: a */
        public void mo4309a(boolean z) {
            if (z) {
                C0715k0.this.m5795a(true);
            } else {
                C0715k0.this.m5798c(true);
            }
        }
    }

    private C0715k0(Context context) {
        this.f4888a = context;
    }

    /* renamed from: a */
    public static C0715k0 m5791a(Context context) {
        if (f4887k == null) {
            f4887k = new C0715k0(context);
        }
        return f4887k;
    }

    /* renamed from: a */
    private void m5792a(Context context, String str) {
        WebAxnActivity webAxnActivity = (WebAxnActivity) context;
        if (webAxnActivity.m4078b().m16297a(str, false)) {
            return;
        }
        String m5641c = C0713j1.m5563a(webAxnActivity).m5641c(str);
        AlertDialog alertDialog = this.f4895h;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f4895h.dismiss();
        }
        if (webAxnActivity.isFinishing()) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
        builder.setIcon(R.drawable.ic_dialog_alert);
        String m5641c2 = C0713j1.m5563a(webAxnActivity).m5641c("ttl.Alert");
        if (TextUtils.isEmpty(m5641c2)) {
            m5641c2 = context.getResources().getString(com.mtni.myirancell.R.string.dialog_title);
        }
        builder.setTitle(m5641c2);
        if (TextUtils.isEmpty(m5641c) && str.equals("msg.rpLoc")) {
            m5641c = context.getResources().getString(com.mtni.myirancell.R.string.message_rploc);
        }
        builder.setMessage(m5641c);
        builder.setCancelable(true);
        String m5641c3 = C0713j1.m5563a(webAxnActivity).m5641c("msg.setting");
        if (TextUtils.isEmpty(m5641c3)) {
            m5641c3 = context.getResources().getString(com.mtni.myirancell.R.string.settings);
        }
        String m5641c4 = C0713j1.m5563a(webAxnActivity).m5641c("cmd.NN");
        if (TextUtils.isEmpty(m5641c4)) {
            m5641c4 = context.getResources().getString(com.mtni.myirancell.R.string.not_now);
        }
        builder.setPositiveButton(m5641c3, new b(this, webAxnActivity));
        builder.setNegativeButton(m5641c4, new c());
        AlertDialog create = builder.create();
        this.f4895h = create;
        create.setCanceledOnTouchOutside(false);
        this.f4895h.show();
    }

    /* renamed from: a */
    public void m5793a() {
        if (C0722m1.m5887a(this.f4888a, new String[]{"android.permission.ACCESS_FINE_LOCATION"})) {
            m5795a(true);
            return;
        }
        if (C0713j1.m5563a(this.f4888a).m5647d("android.permission.ACCESS_FINE_LOCATION") == -1) {
            C0722m1.m5885a((Activity) this.f4888a, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 4);
        } else {
            if (!C0722m1.m5886a(this.f4888a, "android.permission.ACCESS_FINE_LOCATION")) {
                m5792a(this.f4888a, "msg.rpLoc");
                return;
            }
            C0722m1.m5885a((Activity) this.f4888a, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 4);
        }
        this.f4889b.m16337n().mo4083a(this.f4897j);
        C0755x1.f5264v = true;
    }

    /* renamed from: a */
    public void m5794a(String str, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, C3489yj c3489yj, C0696e c0696e) {
        this.f4889b = c3400wj;
        this.f4890c = c2945mj;
        this.f4891d = c2899lj;
        this.f4892e = c3489yj;
        this.f4893f = c0696e;
        HashMap<String, String> hashMap = this.f4894g;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f4894g = C0755x1.m6188f(str);
        m5793a();
    }

    /* renamed from: a */
    public void m5795a(boolean z) {
        if (z) {
            C0707h1.m5496a(this.f4888a).m5515a(-1L, true, false, this.f4896i);
        }
        C0707h1.m5496a(this.f4888a).m5514a(3001);
        this.f4889b.m16258E();
    }

    /* renamed from: b */
    public void m5796b() {
        if (f4887k != null) {
            f4887k = null;
        }
        HashMap<String, String> hashMap = this.f4894g;
        if (hashMap != null) {
            hashMap.clear();
            this.f4894g = null;
        }
        AlertDialog alertDialog = this.f4895h;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f4895h.dismiss();
            this.f4895h = null;
        }
        this.f4891d = null;
        this.f4890c = null;
        this.f4889b = null;
        this.f4892e = null;
        this.f4893f = null;
        C0707h1.m5496a(this.f4888a).m5513a();
    }

    /* renamed from: b */
    public void m5797b(boolean z) {
        if (TextUtils.isEmpty(this.f4894g.get("action")) || this.f4889b.m16298a(this.f4894g.get("action"), false, this.f4892e, this.f4893f, this.f4890c, this.f4891d)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(this.f4894g.get("action"), this.f4890c.m14145i());
        if (m6134a != null) {
            this.f4890c.m14121a(m6134a);
        }
        String str = null;
        C3489yj c3489yj = this.f4892e;
        if (c3489yj != null) {
            str = c3489yj.f14223j;
        } else {
            C0696e c0696e = this.f4893f;
            if (c0696e != null) {
                str = c0696e.f4718j;
            }
        }
        if (this.f4889b.m16263a(this.f4894g.get("action"), false, false, this.f4890c, false, false, str, this.f4891d) <= 0 || !z) {
            return;
        }
        this.f4889b.m16258E();
    }

    /* renamed from: c */
    public void m5798c(boolean z) {
        String str = this.f4894g.get("mandatory");
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase("false")) {
            m5797b(z);
        } else {
            if (z) {
                return;
            }
            this.f4889b.m16259F();
        }
    }
}
