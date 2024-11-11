package com.comviva.webaxn.ui;

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
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.wj;
import defpackage.yj;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public class WebViewActivity extends Activity {
    private AlertDialog.Builder c;
    private HttpAuthHandler d;
    private ValueCallback<Uri[]> e;
    private View f;
    private AlertDialog g;
    EditText h;
    EditText i;
    private WebView j;
    private ProgressBar k;
    private RelativeLayout l;
    private ImageView m;
    private TextView n;
    private TextView o;
    private com.comviva.webaxn.utils.b s;
    private final String b = WebViewActivity.class.getCanonicalName();
    private boolean p = false;
    private boolean q = false;
    private boolean r = false;
    private boolean t = false;
    private DialogInterface.OnClickListener u = new b();
    public final x1.r v = new c();

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WebViewActivity.this.finish();
        }
    }

    /* loaded from: classes.dex */
    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -1) {
                WebViewActivity.this.d.proceed(WebViewActivity.this.h.getText().toString(), WebViewActivity.this.i.getText().toString());
            } else if (i == -2) {
                WebViewActivity.this.j.stopLoading();
                WebViewActivity.this.j.loadUrl("about:blank");
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements x1.r {
        c() {
        }

        @Override // com.comviva.webaxn.utils.x1.r
        public void a(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            WebViewActivity.this.j.loadUrl(str);
        }
    }

    /* loaded from: classes.dex */
    public class d extends WebChromeClient {

        /* loaded from: classes.dex */
        class a implements DialogInterface.OnClickListener {
            final /* synthetic */ GeolocationPermissions.Callback b;
            final /* synthetic */ String c;

            a(d dVar, GeolocationPermissions.Callback callback, String str) {
                this.b = callback;
                this.c = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.b.invoke(this.c, false, true);
            }
        }

        /* loaded from: classes.dex */
        class b implements DialogInterface.OnClickListener {
            final /* synthetic */ GeolocationPermissions.Callback b;
            final /* synthetic */ String c;

            b(d dVar, GeolocationPermissions.Callback callback, String str) {
                this.b = callback;
                this.c = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.b.invoke(this.c, true, true);
            }
        }

        public d() {
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
            if (!WebViewActivity.this.r) {
                WebViewActivity.this.k.setProgress(i);
            }
            super.onProgressChanged(webView, i);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            if (!WebViewActivity.this.p) {
                WebViewActivity.this.n.setText(str);
            }
            super.onReceivedTitle(webView, str);
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            WebViewActivity.this.e = valueCallback;
            try {
                WebViewActivity.this.startActivityForResult(fileChooserParams.createIntent(), 102);
                return true;
            } catch (ActivityNotFoundException unused) {
                WebViewActivity.this.e = null;
                Toast.makeText(WebViewActivity.this.getApplicationContext(), "Cannot Open File Chooser", 1).show();
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class e extends WebViewClient {

        /* loaded from: classes.dex */
        class a implements DialogInterface.OnCancelListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                WebViewActivity.this.j.stopLoading();
                WebViewActivity.this.j.loadUrl("about:blank");
            }
        }

        public e() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (WebViewActivity.this.r) {
                ((AnimationDrawable) WebViewActivity.this.k.getProgressDrawable()).stop();
            }
            WebViewActivity.this.k.setVisibility(8);
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebViewActivity.this.k.setVisibility(0);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            WebViewActivity.this.d = httpAuthHandler;
            if (WebViewActivity.this.g == null) {
                WebViewActivity.this.c.setIcon(R.drawable.ic_stat_notify_webaxn);
                WebViewActivity.this.c.setTitle("HTTP Authentication Request");
                WebViewActivity.this.c.setPositiveButton("Ok", WebViewActivity.this.u);
                WebViewActivity.this.c.setView(WebViewActivity.this.f);
                WebViewActivity.this.c.setNegativeButton("Cancel", WebViewActivity.this.u);
                WebViewActivity.this.c.setOnCancelListener(new a());
                WebViewActivity webViewActivity = WebViewActivity.this;
                webViewActivity.g = webViewActivity.c.create();
                WebViewActivity.this.g.setCanceledOnTouchOutside(false);
            } else if (WebViewActivity.this.g.isShowing()) {
                return;
            }
            WebViewActivity.this.g.show();
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            yj yjVar;
            n1 n1Var;
            if (webResourceRequest.getUrl().toString().startsWith("http://") || webResourceRequest.getUrl().toString().startsWith("https://")) {
                if (WebViewActivity.this.q) {
                    WebViewActivity.this.o.setText(WebViewActivity.this.a(webResourceRequest.getUrl().toString()));
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
            if (!z && (yjVar = x1.r) != null && (n1Var = yjVar.a0) != null) {
                n1Var.g.a(yjVar, webResourceRequest.getUrl().toString(), WebViewActivity.this.v);
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            yj yjVar;
            n1 n1Var;
            if (str.startsWith("http://") || str.startsWith("https://")) {
                if (WebViewActivity.this.q) {
                    WebViewActivity.this.o.setText(WebViewActivity.this.a(str));
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
            if (!z && (yjVar = x1.r) != null && (n1Var = yjVar.a0) != null) {
                n1Var.g.a(yjVar, str, WebViewActivity.this.v);
            }
            return true;
        }
    }

    private String a() {
        WebBackForwardList copyBackForwardList = this.j.copyBackForwardList();
        if (copyBackForwardList == null || copyBackForwardList.getCurrentIndex() <= 0) {
            return null;
        }
        return copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() - 1).getUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
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
        if (i != 102 || (valueCallback = this.e) == null) {
            return;
        }
        if (i2 == -1) {
            valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, intent));
        } else {
            valueCallback.onReceiveValue(null);
        }
        this.e = null;
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
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.WebViewActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        AlertDialog alertDialog = this.g;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.g.dismiss();
            this.g = null;
        }
        this.j.stopLoading();
        x1.x = false;
        x1.j.b = false;
        x1.j.a = null;
        x1.j.c = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (!this.j.canGoBack()) {
            finish();
            return true;
        }
        this.j.goBack();
        if (!this.q) {
            return true;
        }
        String a2 = a();
        if (TextUtils.isEmpty(a2)) {
            return true;
        }
        this.o.setText(a(a2));
        return true;
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        Bundle extras;
        String str;
        if (intent.getAction() != null) {
            if ((intent.getAction().equals("com.notify.action") || intent.getAction().equals("com.notify.lskaction") || intent.getAction().equals("com.notify.rskaction")) && intent.getExtras() != null) {
                if (intent.getExtras().getInt("id", -1) != -1) {
                    x1.a((Context) this, intent.getExtras().getInt("id"), true);
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
                if (x1.q == null || TextUtils.isEmpty(string)) {
                    return;
                }
                wj wjVar = x1.q;
                if (!wjVar.a(string, false, null, null, wjVar.k(), null)) {
                    wj wjVar2 = x1.q;
                    if (wjVar2.a(string, false, false, null, false, false, null, wjVar2.t().e()) > 0) {
                        x1.q.E();
                    }
                }
                x1.q = null;
                finish();
            }
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.t = true;
        x1.j.b = true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (getPackageName().equals("com.comviva.cpw") || getPackageName().equals("com.comviva.cpwdev") || getPackageName().equals("com.comviva.cpwuat") || getPackageName().equals("com.comviva.cpwselfcare") || getPackageName().equals("com.cpw") || getPackageName().equals("com.comviva.cpwcit") || getPackageName().equals("com.comviva.cpwcit1") || getPackageName().equals("com.cpwdev2") || getPackageName().equals("com.agcpwdev") || getPackageName().equals("com.cloudcpw")) {
            if (x1.u || (com.comviva.webaxn.utils.j1.a(this).u0() && this.t)) {
                this.t = false;
                x1.u = false;
                com.comviva.webaxn.utils.j1.a(this).b(false);
            } else if (x1.v && this.t) {
                this.t = false;
                x1.v = false;
                x1.x = false;
                x1.j.b = false;
                x1.j.a = null;
                x1.j.c = null;
                x1.a((Context) this, 0, true);
                finish();
            }
        }
    }
}
