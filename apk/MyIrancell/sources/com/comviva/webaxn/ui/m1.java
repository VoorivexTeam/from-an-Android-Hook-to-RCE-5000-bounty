package com.comviva.webaxn.ui;

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
import android.widget.AbsoluteLayout;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.ej;
import defpackage.q2;
import defpackage.vj;
import defpackage.yj;

/* loaded from: classes.dex */
public class m1 extends n1 {
    private static int J = 240;
    private static int K = 240;
    private View A;
    private AlertDialog B;
    EditText C;
    EditText D;
    private n0 E;
    private ProgressBar F;
    private yj G;
    private DialogInterface.OnClickListener H;
    public final x1.r I;
    private RelativeLayout x;
    private AlertDialog.Builder y;
    private HttpAuthHandler z;

    /* loaded from: classes.dex */
    class a extends WebViewClient {

        /* renamed from: com.comviva.webaxn.ui.m1$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class DialogInterfaceOnCancelListenerC0032a implements DialogInterface.OnCancelListener {
            DialogInterfaceOnCancelListenerC0032a() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                m1.this.E.stopLoading();
                m1.this.E.loadUrl("about:blank");
                m1.this.F.setVisibility(8);
            }
        }

        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            m1.this.F.setVisibility(8);
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            m1.this.F.setVisibility(0);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            m1.this.z = httpAuthHandler;
            if (m1.this.B == null) {
                m1.this.y.setIcon(R.drawable.ic_stat_notify_webaxn);
                m1.this.y.setTitle("HTTP Authentication Request");
                m1.this.y.setPositiveButton("Ok", m1.this.H);
                m1.this.y.setView(m1.this.A);
                m1.this.y.setNegativeButton("Cancel", m1.this.H);
                m1.this.y.setOnCancelListener(new DialogInterfaceOnCancelListenerC0032a());
                m1 m1Var = m1.this;
                m1Var.B = m1Var.y.create();
                m1.this.B.setCanceledOnTouchOutside(false);
            } else if (m1.this.B.isShowing()) {
                return;
            }
            m1.this.B.show();
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
                m1.this.c.startActivity(data);
                x1.v = true;
                z = true;
            } catch (Exception unused) {
                x1.v = false;
            }
            if (!z) {
                m1 m1Var = m1.this;
                m1Var.g.a(m1Var.G, webResourceRequest.getUrl().toString(), m1.this.I);
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
                m1.this.c.startActivity(data);
                x1.v = true;
                z = true;
            } catch (Exception unused) {
                x1.v = false;
            }
            if (!z) {
                m1 m1Var = m1.this;
                m1Var.g.a(m1Var.G, str, m1.this.I);
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnTouchListener {
        b(m1 m1Var) {
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
                m1.this.z.proceed(m1.this.C.getText().toString(), m1.this.D.getText().toString());
            } else if (i == -2) {
                m1.this.E.stopLoading();
                m1.this.E.loadUrl("about:blank");
                m1.this.F.setVisibility(8);
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
            m1.this.E.loadUrl(str);
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
            AlertDialog.Builder builder = new AlertDialog.Builder(m1.this.c);
            builder.setTitle("Location!");
            builder.setMessage(str + " wants to use your device's location.").setCancelable(true).setPositiveButton("Allow", new b(this, callback, str)).setNegativeButton("Block", new a(this, callback, str));
            builder.create().show();
            super.onGeolocationPermissionsShowPrompt(str, callback);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            Toast.makeText(m1.this.c, str2, 0).show();
            jsResult.confirm();
            return true;
        }
    }

    public m1(Context context, yj yjVar, j0 j0Var) {
        super(context);
        this.H = new c();
        this.I = new d();
        int c2 = yjVar.c(com.comviva.webaxn.utils.b.a(this.c).a().b());
        if (c2 > -1) {
            K = c2;
        }
        int k = yjVar.k(j0Var.e);
        if (k > -1) {
            J = k;
        }
        this.G = yjVar;
        this.x = new RelativeLayout(context);
        if (!TextUtils.isEmpty(this.G.r1)) {
            this.x.setContentDescription(this.G.r1);
        }
        vj vjVar = this.G.q1;
        if (vjVar != null) {
            q2.a(this.x, vjVar.a());
        }
        ej ejVar = this.G.O0;
        if (ejVar != null) {
            ejVar.a(j0Var.f);
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
        if (!TextUtils.isEmpty(this.G.V) && this.G.V.startsWith("trans")) {
            this.E.getSettings().setBuiltInZoomControls(false);
            this.E.setBackgroundColor(0);
            int i = Build.VERSION.SDK_INT;
            if (i >= 11 && i <= 18) {
                this.E.setLayerType(1, null);
            }
        }
        this.E.loadUrl(yjVar.k);
        this.F = new ProgressBar(this.c);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.E.setWebChromeClient(new e());
        this.E.setWebViewClient(new a());
        this.E.setOnTouchListener(new b(this));
        this.x.addView(this.E, new LinearLayout.LayoutParams(-1, -1));
        this.x.addView(this.F, layoutParams);
    }

    public int a(AbsoluteLayout.LayoutParams layoutParams, v0 v0Var) {
        this.k = K;
        this.l = J;
        int i = layoutParams.width;
        if (i > 0) {
            this.l = i;
        }
        int i2 = layoutParams.height;
        if (i2 > 0) {
            this.k = i2;
        }
        this.x.setLayoutParams(new AbsoluteLayout.LayoutParams(this.l, this.k, layoutParams.x, layoutParams.y));
        return this.k;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.x.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.x.getLayoutParams()).y = layoutParams.y;
        if (layoutParams.width > 0) {
            ((AbsoluteLayout.LayoutParams) this.x.getLayoutParams()).width = layoutParams.width;
        }
        if (layoutParams.height > 0) {
            ((AbsoluteLayout.LayoutParams) this.x.getLayoutParams()).height = layoutParams.height;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b() {
        this.b.removeView(this.x);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b(AbsoluteLayout.LayoutParams layoutParams) {
        int i = layoutParams.width;
        if (i <= 0) {
            i = J;
        }
        this.l = i;
        int i2 = layoutParams.height;
        if (i2 <= 0) {
            i2 = K;
        }
        this.k = i2;
        this.x.getLayoutParams().width = this.l;
        this.x.getLayoutParams().height = this.k;
    }

    public void b(yj yjVar) {
        this.G = yjVar;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.G;
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.x;
    }

    public void m() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.addView(this.x);
            this.b.invalidate();
        }
    }

    public void n() {
        AlertDialog alertDialog = this.B;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.B.dismiss();
        }
        this.F.setVisibility(8);
        this.E.stopLoading();
    }
}
