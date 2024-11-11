package com.comviva.webaxn.p002ui;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import p000.C3400wj;

/* loaded from: classes.dex */
public class CameraActivity extends Activity {

    /* renamed from: c */
    private static final String f3299c = CameraActivity.class.getCanonicalName();

    /* renamed from: b */
    private boolean f3300b = false;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        FragmentTransaction beginTransaction;
        Fragment m4403f;
        super.onCreate(bundle);
        setContentView(R.layout.activity_camera);
        C0755x1.j.f5281a = f3299c;
        C0755x1.j.f5283c = this;
        C0755x1.f5266x = true;
        if (bundle != null || getIntent() == null) {
            return;
        }
        if (getIntent().getStringExtra("camera_usage").equals("image_capture")) {
            beginTransaction = getFragmentManager().beginTransaction();
            m4403f = FragmentC0623e.m4245h();
        } else {
            beginTransaction = getFragmentManager().beginTransaction();
            m4403f = FragmentC0631g1.m4403f();
        }
        beginTransaction.replace(R.id.container, m4403f).commit();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        C0755x1.f5266x = false;
        C0755x1.j.f5282b = false;
        C0755x1.j.f5281a = null;
        C0755x1.j.f5283c = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        Bundle extras;
        String str;
        if (intent.getAction() != null) {
            if ((intent.getAction().equals("com.notify.action") || intent.getAction().equals("com.notify.lskaction") || intent.getAction().equals("com.notify.rskaction")) && intent.getExtras() != null) {
                if (intent.getExtras().getInt("id", -1) != -1) {
                    C0755x1.m6140a((Context) this, intent.getExtras().getInt("id"), true);
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
                if (C0755x1.f5259q == null || TextUtils.isEmpty(string)) {
                    return;
                }
                C3400wj c3400wj = C0755x1.f5259q;
                if (!c3400wj.m16298a(string, false, null, null, c3400wj.m16334k(), null)) {
                    C3400wj c3400wj2 = C0755x1.f5259q;
                    if (c3400wj2.m16263a(string, false, false, null, false, false, null, c3400wj2.m16343t().m4811e()) > 0) {
                        C0755x1.f5259q.m16258E();
                    }
                }
                C0755x1.f5259q = null;
                finish();
            }
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f3300b = true;
        C0755x1.j.f5282b = true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (getPackageName().equals("com.comviva.cpw") || getPackageName().equals("com.comviva.cpwdev") || getPackageName().equals("com.comviva.cpwuat") || getPackageName().equals("com.comviva.cpwselfcare") || getPackageName().equals("com.cpw") || getPackageName().equals("com.comviva.cpwcit") || getPackageName().equals("com.comviva.cpwcit1") || getPackageName().equals("com.cpwdev2") || getPackageName().equals("com.agcpwdev") || getPackageName().equals("com.cloudcpw")) {
            if (C0755x1.f5263u || (C0713j1.m5563a(this).m5733u0() && this.f3300b)) {
                this.f3300b = false;
                C0755x1.f5263u = false;
                C0713j1.m5563a(this).m5638b(false);
            } else if (C0755x1.f5264v && this.f3300b) {
                this.f3300b = false;
                C0755x1.f5264v = false;
                C0755x1.f5266x = false;
                C0755x1.j.f5282b = false;
                C0755x1.j.f5281a = null;
                C0755x1.j.f5283c = null;
                C0755x1.m6140a((Context) this, 0, true);
                finish();
            }
        }
    }
}
