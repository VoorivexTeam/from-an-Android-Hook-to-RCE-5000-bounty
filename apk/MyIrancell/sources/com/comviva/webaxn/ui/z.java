package com.comviva.webaxn.ui;

import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.TextView;
import com.mtni.myirancell.R;

/* loaded from: classes.dex */
public class z extends FingerprintManager.AuthenticationCallback {
    private final FingerprintManager a;
    private final ImageView b;
    private final TextView c;
    private final d d;
    private CancellationSignal e;
    private boolean f;
    private Runnable g = new c();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.d.onError();
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.d.a();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.c.setTextColor(z.this.c.getResources().getColor(R.color.hint_color, null));
            z.this.c.setText(z.this.c.getResources().getString(R.string.fingerprint_hint));
            z.this.b.setImageResource(R.drawable.ic_fp_40px);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void onError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(FingerprintManager fingerprintManager, ImageView imageView, TextView textView, d dVar) {
        this.a = fingerprintManager;
        this.b = imageView;
        this.c = textView;
        this.d = dVar;
    }

    private void a(CharSequence charSequence) {
        this.b.setImageResource(R.drawable.ic_fingerprint_error);
        this.c.setText(charSequence);
        TextView textView = this.c;
        textView.setTextColor(textView.getResources().getColor(R.color.warning_color, null));
        this.c.removeCallbacks(this.g);
        this.c.postDelayed(this.g, 1600L);
    }

    public void a(FingerprintManager.CryptoObject cryptoObject) {
        if (a()) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            this.e = cancellationSignal;
            this.f = false;
            this.a.authenticate(cryptoObject, cancellationSignal, 0, this, null);
            this.b.setImageResource(R.drawable.ic_fp_40px);
        }
    }

    public boolean a() {
        return this.a.isHardwareDetected() && this.a.hasEnrolledFingerprints();
    }

    public void b() {
        CancellationSignal cancellationSignal = this.e;
        if (cancellationSignal != null) {
            this.f = true;
            cancellationSignal.cancel();
            this.e = null;
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationError(int i, CharSequence charSequence) {
        if (this.f || i == 5) {
            return;
        }
        a(charSequence);
        this.b.postDelayed(new a(), 1600L);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationFailed() {
        a(this.b.getResources().getString(R.string.fingerprint_not_recognized));
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationHelp(int i, CharSequence charSequence) {
        a(charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        this.c.removeCallbacks(this.g);
        this.b.setImageResource(R.drawable.ic_fingerprint_success);
        TextView textView = this.c;
        textView.setTextColor(textView.getResources().getColor(R.color.success_color, null));
        TextView textView2 = this.c;
        textView2.setText(textView2.getResources().getString(R.string.fingerprint_success));
        this.b.postDelayed(new b(), 1300L);
    }
}
