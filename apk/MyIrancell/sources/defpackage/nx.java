package defpackage;

import android.app.Activity;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.widget.Toast;
import com.google.zxing.client.android.CaptureActivity;
import com.google.zxing.client.android.R$string;

/* loaded from: classes.dex */
public final class nx extends hx {
    private final CaptureActivity k;

    /* loaded from: classes.dex */
    class a implements Runnable {
        final /* synthetic */ Activity b;

        a(nx nxVar, Activity activity) {
            this.b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(this.b.getApplicationContext(), R$string.wifi_changing_network, 0).show();
        }
    }

    public nx(CaptureActivity captureActivity, ly lyVar) {
        super(captureActivity, lyVar);
        this.k = captureActivity;
    }

    @Override // defpackage.hx
    public int a(int i) {
        return R$string.button_wifi;
    }

    @Override // defpackage.hx
    public void b(int i) {
        if (i == 0) {
            ez ezVar = (ez) g();
            WifiManager wifiManager = (WifiManager) b().getSystemService("wifi");
            if (wifiManager == null) {
                return;
            }
            Activity b = b();
            b.runOnUiThread(new a(this, b));
            new ux(wifiManager).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, ezVar);
            this.k.a(0L);
        }
    }

    @Override // defpackage.hx
    public int c() {
        return 1;
    }

    @Override // defpackage.hx
    public CharSequence e() {
        ez ezVar = (ez) g();
        return ezVar.e() + " (" + ezVar.c() + ')';
    }

    @Override // defpackage.hx
    public int f() {
        return R$string.result_wifi;
    }
}
