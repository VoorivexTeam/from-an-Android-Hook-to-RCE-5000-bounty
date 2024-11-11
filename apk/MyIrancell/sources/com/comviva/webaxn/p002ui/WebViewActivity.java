package com.comviva.webaxn.p002ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import java.net.MalformedURLException;
import java.net.URL;
import p000.C3400wj;
import p000.C3489yj;

/* loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* renamed from: c */
    private AlertDialog.Builder f3468c;

    /* renamed from: d */
    private HttpAuthHandler f3469d;

    /* renamed from: e */
    private ValueCallback<Uri[]> f3470e;

    /* renamed from: f */
    private View f3471f;

    /* renamed from: g */
    private AlertDialog f3472g;

    /* renamed from: h */
    EditText f3473h;

    /* renamed from: i */
    EditText f3474i;

    /* renamed from: j */
    private WebView f3475j;

    /* renamed from: k */
    private ProgressBar f3476k;

    /* renamed from: l */
    private RelativeLayout f3477l;

    /* renamed from: m */
    private ImageView f3478m;

    /* renamed from: n */
    private TextView f3479n;

    /* renamed from: o */
    private TextView f3480o;

    /* renamed from: s */
    private C0687b f3484s;

    /* renamed from: b */
    private final String f3467b = WebViewActivity.class.getCanonicalName();

    /* renamed from: p */
    private boolean f3481p = false;

    /* renamed from: q */
    private boolean f3482q = false;

    /* renamed from: r */
    private boolean f3483r = false;

    /* renamed from: t */
    private boolean f3485t = false;

    /* renamed from: u */
    private DialogInterface.OnClickListener f3486u = new DialogInterfaceOnClickListenerC0607b();

    /* renamed from: v */
    public final C0755x1.r f3487v = new C0608c();

    /* renamed from: com.comviva.webaxn.ui.WebViewActivity$a */
    /* loaded from: classes.dex */
    class ViewOnClickListenerC0606a implements View.OnClickListener {
        ViewOnClickListenerC0606a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WebViewActivity.this.finish();
        }
    }

    /* renamed from: com.comviva.webaxn.ui.WebViewActivity$b */
    /* loaded from: classes.dex */
    class DialogInterfaceOnClickListenerC0607b implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC0607b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -1) {
                WebViewActivity.this.f3469d.proceed(WebViewActivity.this.f3473h.getText().toString(), WebViewActivity.this.f3474i.getText().toString());
            } else if (i == -2) {
                WebViewActivity.this.f3475j.stopLoading();
                WebViewActivity.this.f3475j.loadUrl("about:blank");
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.WebViewActivity$c */
    /* loaded from: classes.dex */
    class C0608c implements C0755x1.r {
        C0608c() {
        }

        @Override // com.comviva.webaxn.utils.C0755x1.r
        /* renamed from: a */
        public void mo4128a(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            WebViewActivity.this.f3475j.loadUrl(str);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.WebViewActivity$d */
    /* loaded from: classes.dex */
    public class C0609d extends WebChromeClient {

        /* renamed from: com.comviva.webaxn.ui.WebViewActivity$d$a */
        /* loaded from: classes.dex */
        class a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ GeolocationPermissions.Callback f3492b;

            /* renamed from: c */
            final /* synthetic */ String f3493c;

            a(C0609d c0609d, GeolocationPermissions.Callback callback, String str) {
                this.f3492b = callback;
                this.f3493c = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.f3492b.invoke(this.f3493c, false, true);
            }
        }

        /* renamed from: com.comviva.webaxn.ui.WebViewActivity$d$b */
        /* loaded from: classes.dex */
        class b implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ GeolocationPermissions.Callback f3494b;

            /* renamed from: c */
            final /* synthetic */ String f3495c;

            b(C0609d c0609d, GeolocationPermissions.Callback callback, String str) {
                this.f3494b = callback;
                this.f3495c = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.f3494b.invoke(this.f3495c, true, true);
            }
        }

        public C0609d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            AlertDialog.Builder builder = new AlertDialog.Builder(WebViewActivity.this);
            builder.setTitle("Location!");
            builder.setMessage(str + " wants to use your device's location.").setCancelable(true).setPositiveButton("Allow", new b(this, callback, str)).setNegativeButton("Block", new a(this, callback, str));
            builder.create().show();
            super.onGeolocationPermissionsShowPrompt(str, callback);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            Toast.makeText(WebViewActivity.this.getApplicationContext(), str2, 0).show();
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (!WebViewActivity.this.f3483r) {
                WebViewActivity.this.f3476k.setProgress(i);
            }
            super.onProgressChanged(webView, i);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            if (!WebViewActivity.this.f3481p) {
                WebViewActivity.this.f3479n.setText(str);
            }
            super.onReceivedTitle(webView, str);
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            WebViewActivity.this.f3470e = valueCallback;
            try {
                WebViewActivity.this.startActivityForResult(fileChooserParams.createIntent(), 102);
                return true;
            } catch (ActivityNotFoundException unused) {
                WebViewActivity.this.f3470e = null;
                Toast.makeText(WebViewActivity.this.getApplicationContext(), "Cannot Open File Chooser", 1).show();
                return false;
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.WebViewActivity$e */
    /* loaded from: classes.dex */
    public class C0610e extends WebViewClient {

        /* renamed from: com.comviva.webaxn.ui.WebViewActivity$e$a */
        /* loaded from: classes.dex */
        class a implements DialogInterface.OnCancelListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                WebViewActivity.this.f3475j.stopLoading();
                WebViewActivity.this.f3475j.loadUrl("about:blank");
            }
        }

        public C0610e() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (WebViewActivity.this.f3483r) {
                ((AnimationDrawable) WebViewActivity.this.f3476k.getProgressDrawable()).stop();
            }
            WebViewActivity.this.f3476k.setVisibility(8);
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebViewActivity.this.f3476k.setVisibility(0);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            WebViewActivity.this.f3469d = httpAuthHandler;
            if (WebViewActivity.this.f3472g == null) {
                WebViewActivity.this.f3468c.setIcon(R.drawable.ic_stat_notify_webaxn);
                WebViewActivity.this.f3468c.setTitle("HTTP Authentication Request");
                WebViewActivity.this.f3468c.setPositiveButton("Ok", WebViewActivity.this.f3486u);
                WebViewActivity.this.f3468c.setView(WebViewActivity.this.f3471f);
                WebViewActivity.this.f3468c.setNegativeButton("Cancel", WebViewActivity.this.f3486u);
                WebViewActivity.this.f3468c.setOnCancelListener(new a());
                WebViewActivity webViewActivity = WebViewActivity.this;
                webViewActivity.f3472g = webViewActivity.f3468c.create();
                WebViewActivity.this.f3472g.setCanceledOnTouchOutside(false);
            } else if (WebViewActivity.this.f3472g.isShowing()) {
                return;
            }
            WebViewActivity.this.f3472g.show();
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            C3489yj c3489yj;
            AbstractC0652n1 abstractC0652n1;
            if (webResourceRequest.getUrl().toString().startsWith("http://") || webResourceRequest.getUrl().toString().startsWith("https://")) {
                if (WebViewActivity.this.f3482q) {
                    WebViewActivity.this.f3480o.setText(WebViewActivity.this.m4116a(webResourceRequest.getUrl().toString()));
                }
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            if (webResourceRequest.getUrl().getScheme() == null) {
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            boolean z = false;
            try {
                Intent data = new Intent("android.intent.action.VIEW").setData(webResourceRequest.getUrl());
                data.setFlags(67108864);
                WebViewActivity.this.startActivity(data);
                z = true;
            } catch (Exception unused) {
            }
            if (!z && (c3489yj = C0755x1.f5260r) != null && (abstractC0652n1 = c3489yj.f14197a0) != null) {
                abstractC0652n1.f4049g.mo4845a(c3489yj, webResourceRequest.getUrl().toString(), WebViewActivity.this.f3487v);
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C3489yj c3489yj;
            AbstractC0652n1 abstractC0652n1;
            if (str.startsWith("http://") || str.startsWith("https://")) {
                if (WebViewActivity.this.f3482q) {
                    WebViewActivity.this.f3480o.setText(WebViewActivity.this.m4116a(str));
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
            boolean z = false;
            try {
                Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse(str));
                data.setFlags(67108864);
                WebViewActivity.this.startActivity(data);
                z = true;
            } catch (Exception unused) {
            }
            if (!z && (c3489yj = C0755x1.f5260r) != null && (abstractC0652n1 = c3489yj.f14197a0) != null) {
                abstractC0652n1.f4049g.mo4845a(c3489yj, str, WebViewActivity.this.f3487v);
            }
            return true;
        }
    }

    /* renamed from: a */
    private String m4114a() {
        WebBackForwardList copyBackForwardList = this.f3475j.copyBackForwardList();
        if (copyBackForwardList == null || copyBackForwardList.getCurrentIndex() <= 0) {
            return null;
        }
        return copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() - 1).getUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m4116a(String str) {
        try {
            URL url = new URL(str);
            return url.getProtocol() + "://" + url.getHost();
        } catch (MalformedURLException unused) {
            return str;
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        ValueCallback<Uri[]> valueCallback;
        if (i != 102 || (valueCallback = this.f3470e) == null) {
            return;
        }
        if (i2 == -1) {
            valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, intent));
        } else {
            valueCallback.onReceiveValue(null);
        }
        this.f3470e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f1  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.WebViewActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        AlertDialog alertDialog = this.f3472g;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f3472g.dismiss();
            this.f3472g = null;
        }
        this.f3475j.stopLoading();
        C0755x1.f5266x = false;
        C0755x1.j.f5282b = false;
        C0755x1.j.f5281a = null;
        C0755x1.j.f5283c = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (!this.f3475j.canGoBack()) {
            finish();
            return true;
        }
        this.f3475j.goBack();
        if (!this.f3482q) {
            return true;
        }
        String m4114a = m4114a();
        if (TextUtils.isEmpty(m4114a)) {
            return true;
        }
        this.f3480o.setText(m4116a(m4114a));
        return true;
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
        this.f3485t = true;
        C0755x1.j.f5282b = true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (getPackageName().equals("com.comviva.cpw") || getPackageName().equals("com.comviva.cpwdev") || getPackageName().equals("com.comviva.cpwuat") || getPackageName().equals("com.comviva.cpwselfcare") || getPackageName().equals("com.cpw") || getPackageName().equals("com.comviva.cpwcit") || getPackageName().equals("com.comviva.cpwcit1") || getPackageName().equals("com.cpwdev2") || getPackageName().equals("com.agcpwdev") || getPackageName().equals("com.cloudcpw")) {
            if (C0755x1.f5263u || (C0713j1.m5563a(this).m5733u0() && this.f3485t)) {
                this.f3485t = false;
                C0755x1.f5263u = false;
                C0713j1.m5563a(this).m5638b(false);
            } else if (C0755x1.f5264v && this.f3485t) {
                this.f3485t = false;
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
