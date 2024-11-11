package p000;

import android.app.Activity;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.widget.Toast;
import com.google.zxing.client.android.CaptureActivity;
import com.google.zxing.client.android.R$string;

/* renamed from: nx */
/* loaded from: classes.dex */
public final class C3005nx extends AbstractC2569hx {

    /* renamed from: k */
    private final CaptureActivity f12367k;

    /* renamed from: nx$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Activity f12368b;

        a(C3005nx c3005nx, Activity activity) {
            this.f12368b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(this.f12368b.getApplicationContext(), R$string.wifi_changing_network, 0).show();
        }
    }

    public C3005nx(CaptureActivity captureActivity, AbstractC2914ly abstractC2914ly) {
        super(captureActivity, abstractC2914ly);
        this.f12367k = captureActivity;
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: a */
    public int mo3197a(int i) {
        return R$string.button_wifi;
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: b */
    public void mo3198b(int i) {
        if (i == 0) {
            C2450ez c2450ez = (C2450ez) m12276g();
            WifiManager wifiManager = (WifiManager) m12265b().getSystemService("wifi");
            if (wifiManager == null) {
                return;
            }
            Activity m12265b = m12265b();
            m12265b.runOnUiThread(new a(this, m12265b));
            new AsyncTaskC3322ux(wifiManager).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, c2450ez);
            this.f12367k.m10832a(0L);
        }
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: c */
    public int mo3199c() {
        return 1;
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: e */
    public CharSequence mo3200e() {
        C2450ez c2450ez = (C2450ez) m12276g();
        return c2450ez.m11643e() + " (" + c2450ez.m11641c() + ')';
    }

    @Override // p000.AbstractC2569hx
    /* renamed from: f */
    public int mo3201f() {
        return R$string.result_wifi;
    }
}
