package in.co.sixdee.ips_sdk.activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import com.google.gson.Gson;
import com.neevar.neevarpaymentsdk.SalePaymentActivity;
import in.co.sixdee.ips_sdk.R$color;
import in.co.sixdee.ips_sdk.R$layout;
import in.co.sixdee.ips_sdk.R$raw;
import in.co.sixdee.ips_sdk.R$string;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;
import javax.net.ssl.SSLPeerUnverifiedException;
import p000.a40;
import p000.b40;
import p000.f40;
import p000.g40;
import p000.h40;
import p000.i40;
import p000.j40;
import p000.k40;
import p000.l40;
import p000.m40;
import p000.o40;
import p000.p40;
import p000.q30;
import p000.r30;
import p000.r40;
import p000.s30;
import p000.t30;
import p000.w30;
import p000.x30;

/* loaded from: classes.dex */
public class PaymentRequest extends Activity implements g40 {

    /* renamed from: b */
    String f10660b = null;

    /* renamed from: c */
    long f10661c;

    /* renamed from: d */
    private String f10662d;

    /* renamed from: e */
    private String f10663e;

    /* renamed from: f */
    private q30 f10664f;

    public PaymentRequest() {
        new p40();
    }

    /* renamed from: a */
    private void m12494a(int i, String str) {
        Intent intent = new Intent(l40.f11806b);
        intent.putExtra("status_code", i);
        intent.putExtra(l40.f11808d, str);
        sendBroadcast(intent);
        finish();
    }

    /* renamed from: b */
    private void m12495b(int i, String str) {
        Intent intent = new Intent(l40.f11807c);
        intent.putExtra("status_code", i);
        intent.putExtra(l40.f11809e, str);
        sendBroadcast(intent);
        finish();
    }

    @Override // p000.g40
    /* renamed from: a */
    public final void mo11886a(int i, int i2, Object obj) {
        new StringBuilder("onSuccess").append(obj.toString());
        Gson gson = new Gson();
        if (i != 2) {
            if (i != 4) {
                Intent intent = new Intent(l40.f11806b);
                intent.putExtra("status_code", 1202);
                intent.putExtra(l40.f11808d, "Payment Failure ! Please try the request once again.");
                sendBroadcast(intent);
                finish();
                return;
            }
            new StringBuilder().append(obj.toString());
            if (obj == null || i2 != 200) {
                return;
            }
            new r40();
            b40 b40Var = (b40) obj;
            if (b40Var.f2723c.equalsIgnoreCase("SDK000")) {
                if (!r40.m15204a(this, b40Var.f2721a, b40Var.f2722b, R$raw.host_public)) {
                    m12495b(1203, "Verification Failure ! Please try the request once again.");
                    return;
                } else if (b40Var.f2724d != 0) {
                    m12495b(1205, getString(R$string.payment_status_failure));
                    return;
                } else {
                    r30 r30Var = (r30) gson.fromJson(b40Var.f2721a, r30.class);
                    m12495b(Integer.parseInt(r30Var.m15196g()), r30Var.m15194e());
                    return;
                }
            }
            return;
        }
        new Intent();
        if (obj == null) {
            if (i2 == 404) {
                m12494a(1204, getString(R$string.connection_failure));
            }
            if (i2 == 598) {
                m12494a(1204, getString(R$string.connection_failure));
            }
            if (i2 == 1204) {
                m12494a(1204, getString(R$string.connection_failure));
                return;
            }
            return;
        }
        if (i2 != 200) {
            Intent intent2 = new Intent(l40.f11806b);
            intent2.putExtra("status_code", 1202);
            intent2.putExtra(l40.f11808d, getString(R$string.capture_payment_failure));
            sendBroadcast(intent2);
            finish();
            return;
        }
        new r40();
        b40 b40Var2 = (b40) obj;
        if (!b40Var2.f2723c.equalsIgnoreCase("SDK000")) {
            Intent intent3 = new Intent(l40.f11806b);
            intent3.putExtra("status_code", 1202);
            intent3.putExtra(l40.f11808d, getString(R$string.capture_payment_failure));
            sendBroadcast(intent3);
            finish();
            return;
        }
        if (b40Var2.f2721a == null && b40Var2.f2722b == null) {
            m12494a(1202, getString(R$string.capture_payment_failure));
            return;
        }
        if (!r40.m15204a(this, b40Var2.f2721a, b40Var2.f2722b, R$raw.host_public)) {
            m12494a(1203, getString(R$string.capture_payment_failure));
            return;
        }
        if (b40Var2.f2724d != 0) {
            m12494a(1202, getString(R$string.capture_payment_failure));
            return;
        }
        r30 r30Var2 = (r30) gson.fromJson(b40Var2.f2721a, r30.class);
        if (Integer.parseInt(r30Var2.m15196g()) != 0) {
            m12494a(Integer.parseInt(r30Var2.m15196g()), r30Var2.m15195f());
            return;
        }
        int i3 = -1;
        new StringBuilder("Capture Payment Response is : ").append(r30Var2);
        if (r30Var2.m15191b() != null && r30Var2.m15191b().m15510a() != null) {
            for (int i4 = 0; i4 < r30Var2.m15191b().m15510a().size(); i4++) {
                if (r30Var2.m15191b().m15510a().get(i4).m15350a().equalsIgnoreCase("ipsAvailability")) {
                    i3 = Integer.parseInt(r30Var2.m15191b().m15510a().get(i4).m15352b());
                }
                if (r30Var2.m15191b().m15510a().get(i4).m15350a().equalsIgnoreCase("amountWithTax")) {
                    this.f10660b = r30Var2.m15191b().m15510a().get(i4).m15352b();
                }
                if (r30Var2.m15191b().m15510a().get(i4).m15350a().equalsIgnoreCase("asanPulginHostID")) {
                    r30Var2.m15191b().m15510a().get(i4).m15352b();
                }
                if (r30Var2.m15191b().m15510a().get(i4).m15350a().equalsIgnoreCase("NeevarBankId")) {
                    this.f10663e = r30Var2.m15191b().m15510a().get(i4).m15352b();
                }
            }
        }
        r30Var2.m15192c();
        Intent intent4 = new Intent(l40.f11806b);
        if (i3 == 0) {
            intent4.putExtra("status_code", Integer.parseInt(r30Var2.m15196g()));
            intent4.putExtra(l40.f11808d, getResources().getString(R$string.info_success));
            sendBroadcast(intent4);
            finish();
            return;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(r30Var2.m15192c())));
                finish();
                return;
            } else {
                intent4.putExtra("status_code", 6018);
                intent4.putExtra(l40.f11808d, getResources().getString(R$string.info_success));
                sendBroadcast(intent4);
                finish();
                return;
            }
        }
        String format = new DecimalFormat("#").format(Double.parseDouble(this.f10660b));
        this.f10661c = Long.parseLong(r30Var2.m15193d());
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10662d);
        sb.append(",");
        sb.append(r30Var2.m15193d());
        sb.append(",");
        sb.append(format);
        String str = this.f10662d;
        long parseLong = Long.parseLong(r30Var2.m15193d());
        long parseLong2 = Long.parseLong(format);
        Intent intent5 = new Intent(this, (Class<?>) SalePaymentActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(SalePaymentActivity.PHONO_NO_PARAM, str);
        bundle.putLong(SalePaymentActivity.ORDER_ID_PARAM, parseLong);
        bundle.putLong(SalePaymentActivity.AMOUNT_PARAM, parseLong2);
        intent5.putExtras(bundle);
        startActivityForResult(intent5, 101);
    }

    @Override // p000.g40
    /* renamed from: a */
    public final void mo11887a(Throwable th, int i) {
        r30 r30Var = new r30();
        if (th instanceof SocketTimeoutException) {
            new StringBuilder("timeout exception ").append(th);
            r30Var.m15190a("Timeout Error");
            new Intent(l40.f11806b);
            String string = getString(R$string.connection_failure);
            if (i == 2) {
                m12494a(1204, string);
                return;
            } else if (i != 4) {
                m12494a(1204, string);
                return;
            } else {
                m12495b(1204, string);
                return;
            }
        }
        if (th instanceof ConnectException) {
            new StringBuilder("Connection Exception").append(th);
            r30Var.m15190a("Connection Error");
            new Intent(l40.f11806b);
            String string2 = getString(R$string.connection_failure);
            if (i == 2) {
                m12494a(1204, string2);
                return;
            } else if (i != 4) {
                m12494a(1204, string2);
                return;
            } else {
                m12495b(1204, string2);
                return;
            }
        }
        if (th instanceof NoRouteToHostException) {
            r30Var.m15190a("No Route Error");
            new Intent(l40.f11806b);
            String string3 = getString(R$string.connection_failure);
            if (i == 2) {
                m12494a(1204, string3);
                return;
            } else if (i != 4) {
                m12494a(1204, string3);
                return;
            } else {
                m12495b(1204, string3);
                return;
            }
        }
        if (!(th instanceof CertificateExpiredException) && !(th instanceof CertificateException) && !(th instanceof SSLPeerUnverifiedException)) {
            new Intent(l40.f11806b);
            if (i == 2) {
                m12494a(1204, getString(R$string.connection_failure));
                return;
            } else if (i == 4) {
                m12495b(1204, getString(R$string.connection_failure));
                return;
            }
        }
        m12494a(1204, getString(R$string.connection_failure));
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        t30 t30Var = new t30();
        ArrayList arrayList = new ArrayList();
        s30 s30Var = new s30();
        s30Var.m15351a("status");
        s30Var.m15353b(String.valueOf(i2));
        arrayList.add(s30Var);
        if (i == 101 && intent != null) {
            if (intent.hasExtra(SalePaymentActivity.TOKEN_PARAM)) {
                s30 s30Var2 = new s30();
                s30Var2.m15351a("token");
                s30Var2.m15353b(intent.getStringExtra(SalePaymentActivity.TOKEN_PARAM));
                arrayList.add(s30Var2);
            }
            if (intent.hasExtra("RetrivalRefNo")) {
                s30 s30Var3 = new s30();
                s30Var3.m15351a("retrivalRefNo");
                s30Var3.m15353b(intent.getStringExtra("RetrivalRefNo"));
                arrayList.add(s30Var3);
            }
            if (intent.hasExtra("SystemTraceNo")) {
                s30 s30Var4 = new s30();
                s30Var4.m15351a("systemTraceNo");
                s30Var4.m15353b(intent.getStringExtra("SystemTraceNo"));
                arrayList.add(s30Var4);
            }
            if (intent.hasExtra("DateTime")) {
                s30 s30Var5 = new s30();
                s30Var5.m15351a("persianTransactionDate");
                s30Var5.m15353b(intent.getStringExtra("DateTime"));
                arrayList.add(s30Var5);
            }
            if (intent.hasExtra(SalePaymentActivity.ORDER_ID_PARAM)) {
                s30 s30Var6 = new s30();
                s30Var6.m15351a("orderId");
                s30Var6.m15353b(String.valueOf(intent.getLongExtra(SalePaymentActivity.ORDER_ID_PARAM, 0L)));
                arrayList.add(s30Var6);
            }
            if (intent.hasExtra(SalePaymentActivity.AMOUNT_PARAM)) {
                s30 s30Var7 = new s30();
                s30Var7.m15351a("amount");
                s30Var7.m15353b(String.valueOf(intent.getLongExtra(SalePaymentActivity.AMOUNT_PARAM, 0L)));
                arrayList.add(s30Var7);
            }
            if (intent.hasExtra(SalePaymentActivity.PHONO_NO_PARAM)) {
                s30 s30Var8 = new s30();
                s30Var8.m15351a(SalePaymentActivity.PHONO_NO_PARAM);
                s30Var8.m15353b(intent.getStringExtra(SalePaymentActivity.PHONO_NO_PARAM));
                arrayList.add(s30Var8);
            }
        }
        t30Var.m15511a(arrayList);
        String str = this.f10660b;
        String str2 = this.f10662d;
        String str3 = this.f10663e;
        Long valueOf = Long.valueOf(this.f10661c);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
        f40 f40Var = new f40();
        Gson gson = new Gson();
        f40Var.f10069b = Double.parseDouble(str);
        f40Var.f10075h = simpleDateFormat.format(new Date());
        f40Var.f10076i = this.f10664f.m14948a();
        f40Var.f10068a = this.f10664f.m14951d();
        f40Var.f10077j = this.f10664f.m14949b();
        String upperCase = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        if (upperCase.length() > 30) {
            upperCase = upperCase.substring(0, 29);
        }
        f40Var.f10078k = upperCase;
        f40Var.f10071d = str2;
        f40Var.f10070c = this.f10664f.m14950c();
        f40Var.f10072e = str3;
        String str4 = null;
        f40Var.f10073f = null;
        f40Var.f10074g = null;
        f40Var.f10080m = i2;
        f40Var.f10079l = valueOf;
        f40Var.f10081n = t30Var;
        try {
            new r40();
            str4 = r40.m15203a(gson.toJson(f40Var), this, R$raw.final_update_private).replace("\n", "").replace("\r", "").trim();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String json = gson.toJson(f40Var);
        a40 a40Var = new a40();
        a40Var.f32d = 4;
        a40Var.f30b = json;
        a40Var.f31c = str4;
        new StringBuilder("commonSignedRequest--").append(a40Var.toString());
        ((h40) i40.m12365a().m11981a(h40.class)).m12095b(a40Var).mo14741a(new j40(this, 4, this));
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(getResources().getColor(R$color.colorYellow));
        }
        setContentView(R$layout.activity_payment_request);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(m40.f12075a);
        String stringExtra2 = intent.getStringExtra(m40.f12076b);
        Iterator<x30> it = ((w30) intent.getSerializableExtra(m40.f12077c)).f13756c.f14097b.iterator();
        while (true) {
            if (!it.hasNext()) {
                Gson gson = new Gson();
                new o40(this).f12407a.getString("PREF_DEVICE_MOBILE_NUMBER", "").substring(0);
                this.f10664f = (q30) gson.fromJson(stringExtra, q30.class);
                t30 t30Var = new t30();
                ArrayList arrayList = new ArrayList();
                s30 s30Var = new s30();
                s30Var.m15351a("sdkVersion");
                s30Var.m15353b(new k40().m13609a());
                arrayList.add(s30Var);
                t30Var.m15511a(arrayList);
                a40 a40Var = new a40();
                a40Var.f32d = 2;
                a40Var.f30b = stringExtra;
                a40Var.f31c = stringExtra2;
                a40Var.f33e = t30Var;
                new StringBuilder().append(a40Var.toString());
                ((h40) i40.m12365a().m11981a(h40.class)).m12094a(a40Var).mo14741a(new j40(this, 2, this));
                return;
            }
            x30 next = it.next();
            String str = next.f13987b;
            if (((str.hashCode() == 1410037761 && str.equals("deviceMobileNumber")) ? (char) 0 : (char) 65535) == 0) {
                this.f10662d = String.valueOf(next.f13988c);
            }
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
    }
}
