package com.comviva.webaxn.ui;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.wj;

/* loaded from: classes.dex */
public class CameraActivity extends Activity {
    private static final String c = CameraActivity.class.getCanonicalName();
    private boolean b = false;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        FragmentTransaction beginTransaction;
        Fragment f;
        super.onCreate(bundle);
        setContentView(R.layout.activity_camera);
        x1.j.a = c;
        x1.j.c = this;
        x1.x = true;
        if (bundle != null || getIntent() == null) {
            return;
        }
        if (getIntent().getStringExtra("camera_usage").equals("image_capture")) {
            beginTransaction = getFragmentManager().beginTransaction();
            f = e.h();
        } else {
            beginTransaction = getFragmentManager().beginTransaction();
            f = g1.f();
        }
        beginTransaction.replace(R.id.container, f).commit();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        x1.x = false;
        x1.j.b = false;
        x1.j.a = null;
        x1.j.c = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        Bundle extras;
        String str;
        if (intent.getAction() != null) {
            if ((intent.getAction().equals("com.notify.action") || intent.getAction().equals("com.notify.lskaction") || intent.getAction().equals("com.notify.rskaction")) && intent.getExtras() != null) {
                if (intent.getExtras().getInt("id", -1) != -1) {
                    x1.a((Context) this, intent.getExtras().getInt("id"), true);
                }
                if (intent.getAction().equals("com.notify.lskaction")) {
                    extras = intent.getExtras();
                    str = "push_lskaction";
                } else {
                    boolean equals = intent.getAction().equals("com.notify.rskaction");
                    extras = intent.getExtras();
                    str = equals ? "push_rskaction" : "push_action";
                }
                String string = extras.getString(str);
                if (x1.q == null || TextUtils.isEmpty(string)) {
                    return;
                }
                wj wjVar = x1.q;
                if (!wjVar.a(string, false, null, null, wjVar.k(), null)) {
                    wj wjVar2 = x1.q;
                    if (wjVar2.a(string, false, false, null, false, false, null, wjVar2.t().e()) > 0) {
                        x1.q.E();
                    }
                }
                x1.q = null;
                finish();
            }
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.b = true;
        x1.j.b = true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (getPackageName().equals("com.comviva.cpw") || getPackageName().equals("com.comviva.cpwdev") || getPackageName().equals("com.comviva.cpwuat") || getPackageName().equals("com.comviva.cpwselfcare") || getPackageName().equals("com.cpw") || getPackageName().equals("com.comviva.cpwcit") || getPackageName().equals("com.comviva.cpwcit1") || getPackageName().equals("com.cpwdev2") || getPackageName().equals("com.agcpwdev") || getPackageName().equals("com.cloudcpw")) {
            if (x1.u || (com.comviva.webaxn.utils.j1.a(this).u0() && this.b)) {
                this.b = false;
                x1.u = false;
                com.comviva.webaxn.utils.j1.a(this).b(false);
            } else if (x1.v && this.b) {
                this.b = false;
                x1.v = false;
                x1.x = false;
                x1.j.b = false;
                x1.j.a = null;
                x1.j.c = null;
                x1.a((Context) this, 0, true);
                finish();
            }
        }
    }
}
