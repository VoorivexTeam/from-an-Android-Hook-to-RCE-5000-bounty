package com.comviva.webaxn.p002ui;

import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.TextView;
import com.mtni.myirancell.R;

/* renamed from: com.comviva.webaxn.ui.z */
/* loaded from: classes.dex */
public class C0676z extends FingerprintManager.AuthenticationCallback {

    /* renamed from: a */
    private final FingerprintManager f4537a;

    /* renamed from: b */
    private final ImageView f4538b;

    /* renamed from: c */
    private final TextView f4539c;

    /* renamed from: d */
    private final d f4540d;

    /* renamed from: e */
    private CancellationSignal f4541e;

    /* renamed from: f */
    private boolean f4542f;

    /* renamed from: g */
    private Runnable f4543g = new c();

    /* renamed from: com.comviva.webaxn.ui.z$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0676z.this.f4540d.onError();
        }
    }

    /* renamed from: com.comviva.webaxn.ui.z$b */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0676z.this.f4540d.mo5157a();
        }
    }

    /* renamed from: com.comviva.webaxn.ui.z$c */
    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0676z.this.f4539c.setTextColor(C0676z.this.f4539c.getResources().getColor(R.color.hint_color, null));
            C0676z.this.f4539c.setText(C0676z.this.f4539c.getResources().getString(R.string.fingerprint_hint));
            C0676z.this.f4538b.setImageResource(R.drawable.ic_fp_40px);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.z$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo5157a();

        void onError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0676z(FingerprintManager fingerprintManager, ImageView imageView, TextView textView, d dVar) {
        this.f4537a = fingerprintManager;
        this.f4538b = imageView;
        this.f4539c = textView;
        this.f4540d = dVar;
    }

    /* renamed from: a */
    private void m5171a(CharSequence charSequence) {
        this.f4538b.setImageResource(R.drawable.ic_fingerprint_error);
        this.f4539c.setText(charSequence);
        TextView textView = this.f4539c;
        textView.setTextColor(textView.getResources().getColor(R.color.warning_color, null));
        this.f4539c.removeCallbacks(this.f4543g);
        this.f4539c.postDelayed(this.f4543g, 1600L);
    }

    /* renamed from: a */
    public void m5174a(FingerprintManager.CryptoObject cryptoObject) {
        if (m5175a()) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            this.f4541e = cancellationSignal;
            this.f4542f = false;
            this.f4537a.authenticate(cryptoObject, cancellationSignal, 0, this, null);
            this.f4538b.setImageResource(R.drawable.ic_fp_40px);
        }
    }

    /* renamed from: a */
    public boolean m5175a() {
        return this.f4537a.isHardwareDetected() && this.f4537a.hasEnrolledFingerprints();
    }

    /* renamed from: b */
    public void m5176b() {
        CancellationSignal cancellationSignal = this.f4541e;
        if (cancellationSignal != null) {
            this.f4542f = true;
            cancellationSignal.cancel();
            this.f4541e = null;
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationError(int i, CharSequence charSequence) {
        if (this.f4542f || i == 5) {
            return;
        }
        m5171a(charSequence);
        this.f4538b.postDelayed(new a(), 1600L);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationFailed() {
        m5171a(this.f4538b.getResources().getString(R.string.fingerprint_not_recognized));
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationHelp(int i, CharSequence charSequence) {
        m5171a(charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        this.f4539c.removeCallbacks(this.f4543g);
        this.f4538b.setImageResource(R.drawable.ic_fingerprint_success);
        TextView textView = this.f4539c;
        textView.setTextColor(textView.getResources().getColor(R.color.success_color, null));
        TextView textView2 = this.f4539c;
        textView2.setText(textView2.getResources().getString(R.string.fingerprint_success));
        this.f4538b.postDelayed(new b(), 1300L);
    }
}
