package in.co.sixdee.ips_sdk.service;

import android.app.ProgressDialog;
import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import com.google.gson.Gson;
import in.co.sixdee.ips_sdk.R$raw;
import in.co.sixdee.ips_sdk.R$string;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.util.ArrayList;
import javax.net.ssl.SSLPeerUnverifiedException;
import p000.a40;
import p000.b40;
import p000.g40;
import p000.h40;
import p000.i40;
import p000.j40;
import p000.k40;
import p000.l40;
import p000.m40;
import p000.n40;
import p000.o40;
import p000.r30;
import p000.r40;
import p000.s30;
import p000.t30;

/* loaded from: classes.dex */
public class GetPaymentModeService extends Service implements g40 {

    /* renamed from: b */
    ProgressDialog f10665b;

    /* renamed from: c */
    private String f10666c;

    /* renamed from: d */
    private String f10667d;

    /* renamed from: e */
    private h40 f10668e;

    /* renamed from: a */
    private void m12496a(int i, r30 r30Var) {
        Intent intent = new Intent(l40.f11805a);
        intent.putExtra("status_code", i);
        intent.putExtra(n40.f12213a, r30Var);
        sendBroadcast(intent);
    }

    @Override // p000.g40
    /* renamed from: a */
    public final void mo11886a(int i, int i2, Object obj) {
        r30 r30Var;
        int i3;
        r30 r30Var2;
        String str;
        Gson gson = new Gson();
        if (obj != null) {
            if (i2 != 200) {
                m12496a(1201, (r30) obj);
            } else {
                new r40();
                b40 b40Var = (b40) obj;
                if (b40Var.f2723c.equalsIgnoreCase("SDK000")) {
                    i3 = 1203;
                    if (b40Var.f2721a == null && b40Var.f2722b == null) {
                        r30Var = new r30();
                    } else if (!r40.m15204a(this, b40Var.f2721a, b40Var.f2722b, R$raw.host_public)) {
                        r30Var = new r30();
                    } else if (b40Var.f2724d == 0) {
                        r30 r30Var3 = (r30) gson.fromJson(b40Var.f2721a, r30.class);
                        if (Integer.parseInt(r30Var3.m15196g()) == 0) {
                            for (int i4 = 0; i4 < r30Var3.m15189a().m15510a().size(); i4++) {
                                if (r30Var3.m15189a().m15510a().get(i4).m15350a().equalsIgnoreCase("deviceMobileNumber")) {
                                    String m15352b = r30Var3.m15189a().m15510a().get(i4).m15352b();
                                    SharedPreferences.Editor edit = new o40(this).f12407a.edit();
                                    edit.putString("PREF_DEVICE_MOBILE_NUMBER", m15352b);
                                    edit.commit();
                                }
                            }
                        }
                        m12496a(Integer.parseInt(r30Var3.m15196g()), r30Var3);
                    } else {
                        r30Var2 = new r30();
                        str = b40Var.f2721a;
                    }
                    r30Var.m15190a("Security Error");
                } else {
                    r30Var2 = new r30();
                    str = "Payment Mode Error";
                }
                r30Var2.m15190a(str);
                m12496a(1201, r30Var2);
            }
            stopSelf();
        }
        r30Var = new r30();
        i3 = 1204;
        if (i2 != 404) {
        }
        r30Var.m15190a(getString(R$string.connection_failure));
        m12496a(i3, r30Var);
        stopSelf();
    }

    @Override // p000.g40
    /* renamed from: a */
    public final void mo11887a(Throwable th, int i) {
        ProgressDialog progressDialog = this.f10665b;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        r30 r30Var = new r30();
        if (th instanceof SocketTimeoutException) {
            new StringBuilder("timeout exception ").append(th);
            r30Var.m15190a(getString(R$string.connection_failure));
            m12496a(1204, r30Var);
            stopSelf();
        }
        if (th instanceof ConnectException) {
            new StringBuilder("Connection Exception").append(th);
            r30Var.m15190a(getString(R$string.connection_failure));
            m12496a(1204, r30Var);
            stopSelf();
        }
        if (th instanceof NoRouteToHostException) {
            r30Var.m15190a(getString(R$string.connection_failure));
            m12496a(1204, r30Var);
            stopSelf();
        }
        if (th instanceof CertificateExpiredException) {
            r30Var.m15190a(getString(R$string.connection_failure));
            m12496a(1204, r30Var);
            stopSelf();
        }
        if (th instanceof CertificateException) {
            r30Var.m15190a(getString(R$string.connection_failure));
            m12496a(1204, r30Var);
            stopSelf();
        }
        if (th instanceof SSLPeerUnverifiedException) {
            r30Var.m15190a(getString(R$string.connection_failure));
            m12496a(1204, r30Var);
            stopSelf();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f10665b = new ProgressDialog(this);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            this.f10666c = intent.getStringExtra(m40.f12075a);
            this.f10667d = intent.getStringExtra(m40.f12076b);
        }
        t30 t30Var = new t30();
        ArrayList arrayList = new ArrayList();
        s30 s30Var = new s30();
        s30Var.m15351a("sdkVersion");
        s30Var.m15353b(new k40().m13609a());
        arrayList.add(s30Var);
        t30Var.m15511a(arrayList);
        a40 a40Var = new a40();
        a40Var.f31c = this.f10667d;
        a40Var.f30b = this.f10666c;
        a40Var.f32d = 1;
        a40Var.f33e = t30Var;
        h40 h40Var = (h40) i40.m12365a().m11981a(h40.class);
        this.f10668e = h40Var;
        h40Var.m12096c(a40Var).mo14741a(new j40(this, 1, this));
        return super.onStartCommand(intent, i, i2);
    }
}
