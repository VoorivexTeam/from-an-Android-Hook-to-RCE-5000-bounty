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
import com.comviva.webaxn.ui.WebAxnActivity;
import com.comviva.webaxn.utils.x1;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import java.util.HashMap;

/* loaded from: classes.dex */
public class k0 {
    private static k0 k;
    private Context a;
    private wj b;
    private mj c;
    private lj d;
    private yj e;
    private e f;
    private HashMap<String, String> g;
    private AlertDialog h;
    public final x1.l i = new a();
    private final x1.o j = new d();

    /* loaded from: classes.dex */
    class a implements x1.l {
        a() {
        }

        @Override // com.comviva.webaxn.utils.x1.l
        public void a(boolean z) {
            if (z) {
                k0.this.b(false);
            } else {
                k0.this.c(false);
                Toast.makeText(k0.this.a, "Location services are not available.Please try again", 0).show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnClickListener {
        final /* synthetic */ WebAxnActivity b;

        b(k0 k0Var, WebAxnActivity webAxnActivity) {
            this.b = webAxnActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.b.getPackageName(), null));
            this.b.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnClickListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            k0.this.c(true);
        }
    }

    /* loaded from: classes.dex */
    class d implements x1.o {
        d() {
        }

        @Override // com.comviva.webaxn.utils.x1.o
        public void a(boolean z) {
            if (z) {
                k0.this.a(true);
            } else {
                k0.this.c(true);
            }
        }
    }

    private k0(Context context) {
        this.a = context;
    }

    public static k0 a(Context context) {
        if (k == null) {
            k = new k0(context);
        }
        return k;
    }

    private void a(Context context, String str) {
        WebAxnActivity webAxnActivity = (WebAxnActivity) context;
        if (webAxnActivity.b().a(str, false)) {
            return;
        }
        String c2 = j1.a(webAxnActivity).c(str);
        AlertDialog alertDialog = this.h;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.h.dismiss();
        }
        if (webAxnActivity.isFinishing()) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webAxnActivity);
        builder.setIcon(R.drawable.ic_dialog_alert);
        String c3 = j1.a(webAxnActivity).c("ttl.Alert");
        if (TextUtils.isEmpty(c3)) {
            c3 = context.getResources().getString(com.mtni.myirancell.R.string.dialog_title);
        }
        builder.setTitle(c3);
        if (TextUtils.isEmpty(c2) && str.equals("msg.rpLoc")) {
            c2 = context.getResources().getString(com.mtni.myirancell.R.string.message_rploc);
        }
        builder.setMessage(c2);
        builder.setCancelable(true);
        String c4 = j1.a(webAxnActivity).c("msg.setting");
        if (TextUtils.isEmpty(c4)) {
            c4 = context.getResources().getString(com.mtni.myirancell.R.string.settings);
        }
        String c5 = j1.a(webAxnActivity).c("cmd.NN");
        if (TextUtils.isEmpty(c5)) {
            c5 = context.getResources().getString(com.mtni.myirancell.R.string.not_now);
        }
        builder.setPositiveButton(c4, new b(this, webAxnActivity));
        builder.setNegativeButton(c5, new c());
        AlertDialog create = builder.create();
        this.h = create;
        create.setCanceledOnTouchOutside(false);
        this.h.show();
    }

    public void a() {
        if (m1.a(this.a, new String[]{"android.permission.ACCESS_FINE_LOCATION"})) {
            a(true);
            return;
        }
        if (j1.a(this.a).d("android.permission.ACCESS_FINE_LOCATION") == -1) {
            m1.a((Activity) this.a, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 4);
        } else {
            if (!m1.a(this.a, "android.permission.ACCESS_FINE_LOCATION")) {
                a(this.a, "msg.rpLoc");
                return;
            }
            m1.a((Activity) this.a, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 4);
        }
        this.b.n().a(this.j);
        x1.v = true;
    }

    public void a(String str, wj wjVar, mj mjVar, lj ljVar, yj yjVar, e eVar) {
        this.b = wjVar;
        this.c = mjVar;
        this.d = ljVar;
        this.e = yjVar;
        this.f = eVar;
        HashMap<String, String> hashMap = this.g;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.g = x1.f(str);
        a();
    }

    public void a(boolean z) {
        if (z) {
            h1.a(this.a).a(-1L, true, false, this.i);
        }
        h1.a(this.a).a(3001);
        this.b.E();
    }

    public void b() {
        if (k != null) {
            k = null;
        }
        HashMap<String, String> hashMap = this.g;
        if (hashMap != null) {
            hashMap.clear();
            this.g = null;
        }
        AlertDialog alertDialog = this.h;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.h.dismiss();
            this.h = null;
        }
        this.d = null;
        this.c = null;
        this.b = null;
        this.e = null;
        this.f = null;
        h1.a(this.a).a();
    }

    public void b(boolean z) {
        if (TextUtils.isEmpty(this.g.get("action")) || this.b.a(this.g.get("action"), false, this.e, this.f, this.c, this.d)) {
            return;
        }
        xj a2 = x1.a(this.g.get("action"), this.c.i());
        if (a2 != null) {
            this.c.a(a2);
        }
        String str = null;
        yj yjVar = this.e;
        if (yjVar != null) {
            str = yjVar.j;
        } else {
            e eVar = this.f;
            if (eVar != null) {
                str = eVar.j;
            }
        }
        if (this.b.a(this.g.get("action"), false, false, this.c, false, false, str, this.d) <= 0 || !z) {
            return;
        }
        this.b.E();
    }

    public void c(boolean z) {
        String str = this.g.get("mandatory");
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase("false")) {
            b(z);
        } else {
            if (z) {
                return;
            }
            this.b.F();
        }
    }
}
