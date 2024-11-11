package com.comviva.webaxn.ui;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.q2;
import defpackage.vj;
import defpackage.yj;

/* loaded from: classes.dex */
public class l1 extends n1 {
    private static int K = 240;
    private static int L = 240;
    private View A;
    private AlertDialog B;
    EditText C;
    EditText D;
    private n0 E;
    private yj F;
    private ProgressBar G;
    private v0 H;
    private DialogInterface.OnClickListener I;
    public final x1.r J;
    private RelativeLayout x;
    private AlertDialog.Builder y;
    private HttpAuthHandler z;

    /* loaded from: classes.dex */
    class a extends WebViewClient {

        /* renamed from: com.comviva.webaxn.ui.l1$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class DialogInterfaceOnCancelListenerC0031a implements DialogInterface.OnCancelListener {
            DialogInterfaceOnCancelListenerC0031a() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                l1.this.E.stopLoading();
                l1.this.E.loadUrl("about:blank");
                l1.this.G.setVisibility(8);
            }
        }

        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            l1.this.G.setVisibility(8);
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            l1.this.G.setVisibility(0);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            l1.this.z = httpAuthHandler;
            if (l1.this.B == null) {
                l1.this.y.setIcon(R.drawable.ic_stat_notify_webaxn);
                l1.this.y.setTitle("HTTP Authentication Request");
                l1.this.y.setPositiveButton("Ok", l1.this.I);
                l1.this.y.setView(l1.this.A);
                l1.this.y.setNegativeButton("Cancel", l1.this.I);
                l1.this.y.setOnCancelListener(new DialogInterfaceOnCancelListenerC0031a());
                l1 l1Var = l1.this;
                l1Var.B = l1Var.y.create();
                l1.this.B.setCanceledOnTouchOutside(false);
            } else if (l1.this.B.isShowing()) {
                return;
            }
            l1.this.B.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            super.onReceivedLoginRequest(webView, str, str2, str3);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest.getUrl().toString().startsWith("http://") || webResourceRequest.getUrl().toString().startsWith("https://")) {
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            if (webResourceRequest.getUrl().getScheme() == null) {
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            boolean z = false;
            try {
                Intent data = new Intent("android.intent.action.VIEW").setData(webResourceRequest.getUrl());
                data.setFlags(67108864);
                l1.this.c.startActivity(data);
                x1.v = true;
                z = true;
            } catch (Exception unused) {
                x1.v = false;
            }
            if (!z) {
                l1 l1Var = l1.this;
                l1Var.g.a(l1Var.F, webResourceRequest.getUrl().toString(), l1.this.J);
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith("http://") || str.startsWith("https://")) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            boolean z = false;
            try {
                Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse(str));
                data.setFlags(67108864);
                l1.this.c.startActivity(data);
                x1.v = true;
                z = true;
            } catch (Exception unused) {
                x1.v = false;
            }
            if (!z) {
                l1 l1Var = l1.this;
                l1Var.g.a(l1Var.F, str, l1.this.J);
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnTouchListener {
        b(l1 l1Var) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
    }

    /* loaded from: classes.dex */
    class c implements DialogInterface.OnClickListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -1) {
                l1.this.z.proceed(l1.this.C.getText().toString(), l1.this.D.getText().toString());
            } else if (i == -2) {
                l1.this.E.stopLoading();
                l1.this.E.loadUrl("about:blank");
                l1.this.G.setVisibility(8);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements x1.r {
        d() {
        }

        @Override // com.comviva.webaxn.utils.x1.r
        public void a(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            l1.this.E.loadUrl(str);
        }
    }

    /* loaded from: classes.dex */
    public class e extends WebChromeClient {

        /* loaded from: classes.dex */
        class a implements DialogInterface.OnClickListener {
            final /* synthetic */ GeolocationPermissions.Callback b;
            final /* synthetic */ String c;

            a(e eVar, GeolocationPermissions.Callback callback, String str) {
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

            b(e eVar, GeolocationPermissions.Callback callback, String str) {
                this.b = callback;
                this.c = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.b.invoke(this.c, true, true);
            }
        }

        public e() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            AlertDialog.Builder builder = new AlertDialog.Builder(l1.this.c);
            builder.setTitle("Location!");
            builder.setMessage(str + " wants to use your device's location.").setCancelable(true).setPositiveButton("Allow", new b(this, callback, str)).setNegativeButton("Block", new a(this, callback, str));
            builder.create().show();
            super.onGeolocationPermissionsShowPrompt(str, callback);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            Toast.makeText(l1.this.c, str2, 0).show();
            jsResult.confirm();
            return true;
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public l1(Context context, yj yjVar, v0 v0Var) {
        super(context);
        this.I = new c();
        this.J = new d();
        this.F = yjVar;
        this.H = v0Var;
        int c2 = yjVar.c(v0Var.c.height());
        if (c2 > -1) {
            L = c2;
        }
        int k = yjVar.k(this.H.c.width());
        if (k > -1) {
            K = k;
        }
        this.y = new AlertDialog.Builder(this.c);
        View inflate = LayoutInflater.from(this.c).inflate(R.layout.dialog_signin, (ViewGroup) null);
        this.A = inflate;
        EditText editText = (EditText) inflate.findViewById(R.id.username);
        this.C = editText;
        editText.setHint("Enter Username");
        this.C.setBackgroundColor(-1);
        this.C.setTextColor(-16777216);
        EditText editText2 = (EditText) this.A.findViewById(R.id.password);
        this.D = editText2;
        editText2.setHint("Enter Password");
        this.D.setBackgroundColor(-1);
        this.D.setTextColor(-16777216);
        this.F = yjVar;
        this.x = new RelativeLayout(context);
        if (!TextUtils.isEmpty(this.F.r1)) {
            this.x.setContentDescription(this.F.r1);
        }
        vj vjVar = this.F.q1;
        if (vjVar != null) {
            q2.a(this.x, vjVar.a());
        }
        n0 n0Var = new n0(context);
        this.E = n0Var;
        n0Var.getSettings().setBuiltInZoomControls(true);
        this.E.getSettings().setJavaScriptEnabled(true);
        this.E.getSettings().setDomStorageEnabled(true);
        this.E.setHorizontalScrollBarEnabled(true);
        this.E.setVerticalScrollBarEnabled(true);
        if (Build.VERSION.SDK_INT >= 17) {
            this.E.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        if (!TextUtils.isEmpty(this.F.V) && this.F.V.startsWith("trans")) {
            this.E.getSettings().setBuiltInZoomControls(false);
            this.E.setBackgroundColor(0);
            int i = Build.VERSION.SDK_INT;
            if (i >= 11 && i <= 18) {
                this.E.setLayerType(1, null);
            }
        }
        this.G = new ProgressBar(this.c);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.E.setWebChromeClient(new e());
        this.E.setWebViewClient(new a());
        this.E.setOnTouchListener(new b(this));
        this.E.setPadding(yjVar.e(this.H.c.width()), yjVar.j(this.H.c.width()), yjVar.h(this.H.c.width()), yjVar.b(this.H.c.width()));
        this.E.loadUrl(yjVar.k);
        this.x.addView(this.E, new LinearLayout.LayoutParams(-1, -1));
        this.x.addView(this.G, layoutParams);
    }

    public int a(int i, int i2) {
        this.k = L;
        this.l = K;
        if (i > 0) {
            this.l = i;
        }
        if (i2 > 0) {
            this.k = i2;
        }
        return this.k;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(j0 j0Var, v0 v0Var) {
        int k = this.F.k(v0Var.c.width());
        this.l = k;
        if (k < 0) {
            this.l = K;
        }
        int c2 = this.F.c(v0Var.c.height());
        this.k = c2;
        if (c2 < 0) {
            this.k = L;
        }
        this.x.getLayoutParams().height = this.k;
        this.x.getLayoutParams().width = this.l;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b() {
        this.b.removeView(this.x);
    }

    public void b(yj yjVar) {
        this.F = yjVar;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.F;
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.x;
    }

    public int m() {
        String str;
        yj yjVar = this.F;
        if (yjVar != null && (str = yjVar.g) != null) {
            if (str.equalsIgnoreCase("C") || this.F.g.equalsIgnoreCase("Center")) {
                return 1;
            }
            if (this.F.g.equalsIgnoreCase("L") || this.F.g.equalsIgnoreCase("Left")) {
                if (this.m) {
                    return 5;
                }
            } else if ((this.F.g.equalsIgnoreCase("R") || this.F.g.equalsIgnoreCase("Right")) && !this.m) {
                return 5;
            }
        }
        return 3;
    }

    public void n() {
        if (this.b != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.l, this.k);
            layoutParams.setMargins(this.F.d(this.H.c.width()), this.F.i(this.H.c.width()), this.F.g(this.H.c.width()), this.F.a(this.H.c.width()));
            layoutParams.gravity = m();
            this.b.addView(this.x, layoutParams);
            this.b.invalidate();
            this.x.getLayoutParams().width = this.l;
            this.x.getLayoutParams().height = this.k;
        }
    }

    public void o() {
        AlertDialog alertDialog = this.B;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.B.dismiss();
        }
        this.G.setVisibility(8);
        this.E.stopLoading();
    }
}
