package com.comviva.webaxn.p002ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;

/* loaded from: classes.dex */
public class NotiDlgActivity extends Activity {

    /* renamed from: b */
    private AlertDialog.Builder f3348b;

    /* renamed from: c */
    private AlertDialog f3349c;

    /* renamed from: d */
    private String f3350d = null;

    /* renamed from: e */
    private String f3351e = null;

    /* renamed from: f */
    private String f3352f = null;

    /* renamed from: g */
    private String f3353g = null;

    /* renamed from: h */
    private boolean f3354h = false;

    /* renamed from: i */
    private DialogInterface.OnClickListener f3355i = new DialogInterfaceOnClickListenerC0588b();

    /* renamed from: j */
    private final IntentFilter f3356j = new IntentFilter("com.comviva.webaxn.dialogaction");

    /* renamed from: k */
    private final BroadcastReceiver f3357k = new C0589c();

    /* renamed from: com.comviva.webaxn.ui.NotiDlgActivity$a */
    /* loaded from: classes.dex */
    class DialogInterfaceOnCancelListenerC0587a implements DialogInterface.OnCancelListener {
        DialogInterfaceOnCancelListenerC0587a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (NotiDlgActivity.this.f3351e != null && NotiDlgActivity.this.f3351e.trim().length() > 0 && !NotiDlgActivity.this.f3351e.equalsIgnoreCase("Exit")) {
                Intent intent = new Intent("com.comviva.webaxn.dialogaction");
                intent.putExtra("ACTION", NotiDlgActivity.this.f3351e);
                NotiDlgActivity.this.sendBroadcast(intent);
            }
            NotiDlgActivity.this.finish();
        }
    }

    /* renamed from: com.comviva.webaxn.ui.NotiDlgActivity$b */
    /* loaded from: classes.dex */
    class DialogInterfaceOnClickListenerC0588b implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC0588b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent;
            String str;
            if (i == -1) {
                if (NotiDlgActivity.this.f3350d != null && NotiDlgActivity.this.f3350d.trim().length() > 0 && !NotiDlgActivity.this.f3350d.equalsIgnoreCase("Exit")) {
                    intent = new Intent("com.comviva.webaxn.dialogaction");
                    str = NotiDlgActivity.this.f3350d;
                    intent.putExtra("ACTION", str);
                    NotiDlgActivity.this.sendBroadcast(intent);
                }
                NotiDlgActivity.this.finish();
            }
            if (i == -2) {
                if (NotiDlgActivity.this.f3351e != null && NotiDlgActivity.this.f3351e.trim().length() > 0 && !NotiDlgActivity.this.f3351e.equalsIgnoreCase("Exit")) {
                    intent = new Intent("com.comviva.webaxn.dialogaction");
                    str = NotiDlgActivity.this.f3351e;
                    intent.putExtra("ACTION", str);
                    NotiDlgActivity.this.sendBroadcast(intent);
                }
                NotiDlgActivity.this.finish();
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.NotiDlgActivity$c */
    /* loaded from: classes.dex */
    class C0589c extends BroadcastReceiver {
        C0589c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String packageName;
            String str;
            if (!intent.getAction().equals("com.comviva.webaxn.dialogaction") || intent.getExtras() == null) {
                return;
            }
            C0755x1.f5264v = true;
            C0713j1.m5563a(context).m5630a(true);
            String string = intent.getExtras().getString("ACTION");
            Intent intent2 = new Intent("com.notify.action");
            intent2.addFlags(805306368);
            if (!C0755x1.j.f5282b || TextUtils.isEmpty(C0755x1.j.f5281a)) {
                packageName = context.getPackageName();
                str = "com.comviva.webaxn.ui.WebAxnActivity";
            } else {
                packageName = context.getPackageName();
                str = C0755x1.j.f5281a;
            }
            intent2.setClassName(packageName, str);
            intent2.putExtra("push_action", string);
            NotiDlgActivity.this.startActivity(intent2);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        this.f3348b = builder;
        builder.setTitle(C0755x1.m6184e(getIntent().getStringExtra("Title")));
        this.f3348b.setIcon(R.drawable.ic_stat_notify_webaxn);
        this.f3348b.setMessage(C0755x1.m6184e(getIntent().getStringExtra("Description")));
        this.f3352f = getIntent().getStringExtra("Ok");
        this.f3353g = getIntent().getStringExtra("Cancel");
        String str = this.f3352f;
        String str2 = str != null ? str : "Ok";
        if (str2 != null) {
            this.f3348b.setPositiveButton(C0755x1.m6184e(str2), this.f3355i);
        }
        String str3 = this.f3353g;
        if (str3 != null) {
            this.f3348b.setNegativeButton(C0755x1.m6184e(str3), this.f3355i);
        }
        this.f3348b.setOnCancelListener(new DialogInterfaceOnCancelListenerC0587a());
        this.f3350d = getIntent().getStringExtra("Action");
        this.f3351e = getIntent().getStringExtra("CancelAction");
        AlertDialog create = this.f3348b.create();
        this.f3349c = create;
        create.setCanceledOnTouchOutside(false);
        this.f3349c.show();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        AlertDialog alertDialog = this.f3349c;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.f3349c = null;
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f3354h = true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (getPackageName().equals("com.comviva.cpw") || getPackageName().equals("com.comviva.cpwdev") || getPackageName().equals("com.comviva.cpwuat") || getPackageName().equals("com.comviva.cpwselfcare") || getPackageName().equals("com.cpw") || getPackageName().equals("com.comviva.cpwcit") || getPackageName().equals("com.comviva.cpwcit1") || getPackageName().equals("com.cpwdev2") || getPackageName().equals("com.agcpwdev") || getPackageName().equals("com.cloudcpw")) {
            if (C0755x1.f5263u || (C0713j1.m5563a(this).m5733u0() && this.f3354h)) {
                this.f3354h = false;
                C0755x1.f5263u = false;
                C0713j1.m5563a(this).m5638b(false);
            } else if ((C0755x1.f5264v || C0713j1.m5563a(this).m5729t0()) && this.f3354h) {
                this.f3354h = false;
                if (!C0755x1.f5266x) {
                    C0713j1.m5563a(this).m5630a(false);
                    C0755x1.f5264v = false;
                }
                finish();
            }
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        registerReceiver(this.f3357k, this.f3356j);
        super.onStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        unregisterReceiver(this.f3357k);
        super.onStop();
    }
}
