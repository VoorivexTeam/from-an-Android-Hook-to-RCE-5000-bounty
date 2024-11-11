package com.comviva.webaxn.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;

/* loaded from: classes.dex */
public class NotiDlgActivity extends Activity {
    private AlertDialog.Builder b;
    private AlertDialog c;
    private String d = null;
    private String e = null;
    private String f = null;
    private String g = null;
    private boolean h = false;
    private DialogInterface.OnClickListener i = new b();
    private final IntentFilter j = new IntentFilter("com.comviva.webaxn.dialogaction");
    private final BroadcastReceiver k = new c();

    /* loaded from: classes.dex */
    class a implements DialogInterface.OnCancelListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (NotiDlgActivity.this.e != null && NotiDlgActivity.this.e.trim().length() > 0 && !NotiDlgActivity.this.e.equalsIgnoreCase("Exit")) {
                Intent intent = new Intent("com.comviva.webaxn.dialogaction");
                intent.putExtra("ACTION", NotiDlgActivity.this.e);
                NotiDlgActivity.this.sendBroadcast(intent);
            }
            NotiDlgActivity.this.finish();
        }
    }

    /* loaded from: classes.dex */
    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent;
            String str;
            if (i == -1) {
                if (NotiDlgActivity.this.d != null && NotiDlgActivity.this.d.trim().length() > 0 && !NotiDlgActivity.this.d.equalsIgnoreCase("Exit")) {
                    intent = new Intent("com.comviva.webaxn.dialogaction");
                    str = NotiDlgActivity.this.d;
                    intent.putExtra("ACTION", str);
                    NotiDlgActivity.this.sendBroadcast(intent);
                }
                NotiDlgActivity.this.finish();
            }
            if (i == -2) {
                if (NotiDlgActivity.this.e != null && NotiDlgActivity.this.e.trim().length() > 0 && !NotiDlgActivity.this.e.equalsIgnoreCase("Exit")) {
                    intent = new Intent("com.comviva.webaxn.dialogaction");
                    str = NotiDlgActivity.this.e;
                    intent.putExtra("ACTION", str);
                    NotiDlgActivity.this.sendBroadcast(intent);
                }
                NotiDlgActivity.this.finish();
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String packageName;
            String str;
            if (!intent.getAction().equals("com.comviva.webaxn.dialogaction") || intent.getExtras() == null) {
                return;
            }
            x1.v = true;
            com.comviva.webaxn.utils.j1.a(context).a(true);
            String string = intent.getExtras().getString("ACTION");
            Intent intent2 = new Intent("com.notify.action");
            intent2.addFlags(805306368);
            if (!x1.j.b || TextUtils.isEmpty(x1.j.a)) {
                packageName = context.getPackageName();
                str = "com.comviva.webaxn.ui.WebAxnActivity";
            } else {
                packageName = context.getPackageName();
                str = x1.j.a;
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
        this.b = builder;
        builder.setTitle(x1.e(getIntent().getStringExtra("Title")));
        this.b.setIcon(R.drawable.ic_stat_notify_webaxn);
        this.b.setMessage(x1.e(getIntent().getStringExtra("Description")));
        this.f = getIntent().getStringExtra("Ok");
        this.g = getIntent().getStringExtra("Cancel");
        String str = this.f;
        String str2 = str != null ? str : "Ok";
        if (str2 != null) {
            this.b.setPositiveButton(x1.e(str2), this.i);
        }
        String str3 = this.g;
        if (str3 != null) {
            this.b.setNegativeButton(x1.e(str3), this.i);
        }
        this.b.setOnCancelListener(new a());
        this.d = getIntent().getStringExtra("Action");
        this.e = getIntent().getStringExtra("CancelAction");
        AlertDialog create = this.b.create();
        this.c = create;
        create.setCanceledOnTouchOutside(false);
        this.c.show();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        AlertDialog alertDialog = this.c;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.c = null;
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.h = true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (getPackageName().equals("com.comviva.cpw") || getPackageName().equals("com.comviva.cpwdev") || getPackageName().equals("com.comviva.cpwuat") || getPackageName().equals("com.comviva.cpwselfcare") || getPackageName().equals("com.cpw") || getPackageName().equals("com.comviva.cpwcit") || getPackageName().equals("com.comviva.cpwcit1") || getPackageName().equals("com.cpwdev2") || getPackageName().equals("com.agcpwdev") || getPackageName().equals("com.cloudcpw")) {
            if (x1.u || (com.comviva.webaxn.utils.j1.a(this).u0() && this.h)) {
                this.h = false;
                x1.u = false;
                com.comviva.webaxn.utils.j1.a(this).b(false);
            } else if ((x1.v || com.comviva.webaxn.utils.j1.a(this).t0()) && this.h) {
                this.h = false;
                if (!x1.x) {
                    com.comviva.webaxn.utils.j1.a(this).a(false);
                    x1.v = false;
                }
                finish();
            }
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        registerReceiver(this.k, this.j);
        super.onStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        unregisterReceiver(this.k);
        super.onStop();
    }
}
