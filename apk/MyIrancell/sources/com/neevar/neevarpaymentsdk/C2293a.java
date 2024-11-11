package com.neevar.neevarpaymentsdk;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.neevar.neevarpaymentsdk.a */
/* loaded from: classes.dex */
public class C2293a {

    /* renamed from: a */
    private Activity f9262a;

    /* renamed from: b */
    private Dialog f9263b;

    /* renamed from: c */
    private boolean f9264c = false;

    /* renamed from: com.neevar.neevarpaymentsdk.a$a */
    /* loaded from: classes.dex */
    class a implements View.OnTouchListener {
        a(C2293a c2293a) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.neevar.neevarpaymentsdk.a$b */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2293a.this.f9263b != null) {
                C2293a.this.f9263b.dismiss();
                C2293a.this.f9263b = null;
            }
        }
    }

    public C2293a(Activity activity) {
        this.f9262a = activity;
    }

    /* renamed from: a */
    public boolean m10993a() {
        return this.f9264c;
    }

    /* renamed from: b */
    public void m10994b() {
        if (this.f9263b == null) {
            Dialog dialog = new Dialog(this.f9262a, R.style.Theme.DeviceDefault.Dialog.NoActionBar);
            this.f9263b = dialog;
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.f9263b.setContentView(R$layout.neevar_busy_indicator);
            this.f9263b.getWindow().getDecorView().setOnTouchListener(new a(this));
        }
        this.f9263b.show();
        this.f9264c = true;
    }

    /* renamed from: c */
    public void m10995c() {
        this.f9262a.runOnUiThread(new b());
        this.f9264c = false;
    }
}
