package com.neevar.neevarpaymentsdk;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {
    private Activity a;
    private Dialog b;
    private boolean c = false;

    /* renamed from: com.neevar.neevarpaymentsdk.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class ViewOnTouchListenerC0055a implements View.OnTouchListener {
        ViewOnTouchListenerC0055a(a aVar) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.b != null) {
                a.this.b.dismiss();
                a.this.b = null;
            }
        }
    }

    public a(Activity activity) {
        this.a = activity;
    }

    public boolean a() {
        return this.c;
    }

    public void b() {
        if (this.b == null) {
            Dialog dialog = new Dialog(this.a, R.style.Theme.DeviceDefault.Dialog.NoActionBar);
            this.b = dialog;
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.b.setContentView(R$layout.neevar_busy_indicator);
            this.b.getWindow().getDecorView().setOnTouchListener(new ViewOnTouchListenerC0055a(this));
        }
        this.b.show();
        this.c = true;
    }

    public void c() {
        this.a.runOnUiThread(new b());
        this.c = false;
    }
}
