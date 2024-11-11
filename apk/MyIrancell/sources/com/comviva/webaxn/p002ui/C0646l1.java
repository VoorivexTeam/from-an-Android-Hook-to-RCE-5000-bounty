package com.comviva.webaxn.p002ui;

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
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import p000.C3107q2;
import p000.C3361vj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.l1 */
/* loaded from: classes.dex */
public class C0646l1 extends AbstractC0652n1 {

    /* renamed from: K */
    private static int f3983K = 240;

    /* renamed from: L */
    private static int f3984L = 240;

    /* renamed from: A */
    private View f3985A;

    /* renamed from: B */
    private AlertDialog f3986B;

    /* renamed from: C */
    EditText f3987C;

    /* renamed from: D */
    EditText f3988D;

    /* renamed from: E */
    private C0651n0 f3989E;

    /* renamed from: F */
    private C3489yj f3990F;

    /* renamed from: G */
    private ProgressBar f3991G;

    /* renamed from: H */
    private C0669v0 f3992H;

    /* renamed from: I */
    private DialogInterface.OnClickListener f3993I;

    /* renamed from: J */
    public final C0755x1.r f3994J;

    /* renamed from: x */
    private RelativeLayout f3995x;

    /* renamed from: y */
    private AlertDialog.Builder f3996y;

    /* renamed from: z */
    private HttpAuthHandler f3997z;

    /* renamed from: com.comviva.webaxn.ui.l1$a */
    /* loaded from: classes.dex */
    class a extends WebViewClient {

        /* renamed from: com.comviva.webaxn.ui.l1$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class DialogInterfaceOnCancelListenerC3554a implements DialogInterface.OnCancelListener {
            DialogInterfaceOnCancelListenerC3554a() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                C0646l1.this.f3989E.stopLoading();
                C0646l1.this.f3989E.loadUrl("about:blank");
                C0646l1.this.f3991G.setVisibility(8);
            }
        }

        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            C0646l1.this.f3991G.setVisibility(8);
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C0646l1.this.f3991G.setVisibility(0);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            C0646l1.this.f3997z = httpAuthHandler;
            if (C0646l1.this.f3986B == null) {
                C0646l1.this.f3996y.setIcon(R.drawable.ic_stat_notify_webaxn);
                C0646l1.this.f3996y.setTitle("HTTP Authentication Request");
                C0646l1.this.f3996y.setPositiveButton("Ok", C0646l1.this.f3993I);
                C0646l1.this.f3996y.setView(C0646l1.this.f3985A);
                C0646l1.this.f3996y.setNegativeButton("Cancel", C0646l1.this.f3993I);
                C0646l1.this.f3996y.setOnCancelListener(new DialogInterfaceOnCancelListenerC3554a());
                C0646l1 c0646l1 = C0646l1.this;
                c0646l1.f3986B = c0646l1.f3996y.create();
                C0646l1.this.f3986B.setCanceledOnTouchOutside(false);
            } else if (C0646l1.this.f3986B.isShowing()) {
                return;
            }
            C0646l1.this.f3986B.show();
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
                C0646l1.this.f4045c.startActivity(data);
                C0755x1.f5264v = true;
                z = true;
            } catch (Exception unused) {
                C0755x1.f5264v = false;
            }
            if (!z) {
                C0646l1 c0646l1 = C0646l1.this;
                c0646l1.f4049g.mo4845a(c0646l1.f3990F, webResourceRequest.getUrl().toString(), C0646l1.this.f3994J);
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
                C0646l1.this.f4045c.startActivity(data);
                C0755x1.f5264v = true;
                z = true;
            } catch (Exception unused) {
                C0755x1.f5264v = false;
            }
            if (!z) {
                C0646l1 c0646l1 = C0646l1.this;
                c0646l1.f4049g.mo4845a(c0646l1.f3990F, str, C0646l1.this.f3994J);
            }
            return true;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.l1$b */
    /* loaded from: classes.dex */
    class b implements View.OnTouchListener {
        b(C0646l1 c0646l1) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.l1$c */
    /* loaded from: classes.dex */
    class c implements DialogInterface.OnClickListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -1) {
                C0646l1.this.f3997z.proceed(C0646l1.this.f3987C.getText().toString(), C0646l1.this.f3988D.getText().toString());
            } else if (i == -2) {
                C0646l1.this.f3989E.stopLoading();
                C0646l1.this.f3989E.loadUrl("about:blank");
                C0646l1.this.f3991G.setVisibility(8);
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.l1$d */
    /* loaded from: classes.dex */
    class d implements C0755x1.r {
        d() {
        }

        @Override // com.comviva.webaxn.utils.C0755x1.r
        /* renamed from: a */
        public void mo4128a(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C0646l1.this.f3989E.loadUrl(str);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.l1$e */
    /* loaded from: classes.dex */
    public class e extends WebChromeClient {

        /* renamed from: com.comviva.webaxn.ui.l1$e$a */
        /* loaded from: classes.dex */
        class a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ GeolocationPermissions.Callback f4003b;

            /* renamed from: c */
            final /* synthetic */ String f4004c;

            a(e eVar, GeolocationPermissions.Callback callback, String str) {
                this.f4003b = callback;
                this.f4004c = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.f4003b.invoke(this.f4004c, false, true);
            }
        }

        /* renamed from: com.comviva.webaxn.ui.l1$e$b */
        /* loaded from: classes.dex */
        class b implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ GeolocationPermissions.Callback f4005b;

            /* renamed from: c */
            final /* synthetic */ String f4006c;

            b(e eVar, GeolocationPermissions.Callback callback, String str) {
                this.f4005b = callback;
                this.f4006c = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.f4005b.invoke(this.f4006c, true, true);
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
            AlertDialog.Builder builder = new AlertDialog.Builder(C0646l1.this.f4045c);
            builder.setTitle("Location!");
            builder.setMessage(str + " wants to use your device's location.").setCancelable(true).setPositiveButton("Allow", new b(this, callback, str)).setNegativeButton("Block", new a(this, callback, str));
            builder.create().show();
            super.onGeolocationPermissionsShowPrompt(str, callback);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            Toast.makeText(C0646l1.this.f4045c, str2, 0).show();
            jsResult.confirm();
            return true;
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public C0646l1(Context context, C3489yj c3489yj, C0669v0 c0669v0) {
        super(context);
        this.f3993I = new c();
        this.f3994J = new d();
        this.f3990F = c3489yj;
        this.f3992H = c0669v0;
        int m16637c = c3489yj.m16637c(c0669v0.f4397c.height());
        if (m16637c > -1) {
            f3984L = m16637c;
        }
        int m16645k = c3489yj.m16645k(this.f3992H.f4397c.width());
        if (m16645k > -1) {
            f3983K = m16645k;
        }
        this.f3996y = new AlertDialog.Builder(this.f4045c);
        View inflate = LayoutInflater.from(this.f4045c).inflate(R.layout.dialog_signin, (ViewGroup) null);
        this.f3985A = inflate;
        EditText editText = (EditText) inflate.findViewById(R.id.username);
        this.f3987C = editText;
        editText.setHint("Enter Username");
        this.f3987C.setBackgroundColor(-1);
        this.f3987C.setTextColor(-16777216);
        EditText editText2 = (EditText) this.f3985A.findViewById(R.id.password);
        this.f3988D = editText2;
        editText2.setHint("Enter Password");
        this.f3988D.setBackgroundColor(-1);
        this.f3988D.setTextColor(-16777216);
        this.f3990F = c3489yj;
        this.f3995x = new RelativeLayout(context);
        if (!TextUtils.isEmpty(this.f3990F.f14249r1)) {
            this.f3995x.setContentDescription(this.f3990F.f14249r1);
        }
        C3361vj c3361vj = this.f3990F.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(this.f3995x, c3361vj.m16034a());
        }
        C0651n0 c0651n0 = new C0651n0(context);
        this.f3989E = c0651n0;
        c0651n0.getSettings().setBuiltInZoomControls(true);
        this.f3989E.getSettings().setJavaScriptEnabled(true);
        this.f3989E.getSettings().setDomStorageEnabled(true);
        this.f3989E.setHorizontalScrollBarEnabled(true);
        this.f3989E.setVerticalScrollBarEnabled(true);
        if (Build.VERSION.SDK_INT >= 17) {
            this.f3989E.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        if (!TextUtils.isEmpty(this.f3990F.f14186V) && this.f3990F.f14186V.startsWith("trans")) {
            this.f3989E.getSettings().setBuiltInZoomControls(false);
            this.f3989E.setBackgroundColor(0);
            int i = Build.VERSION.SDK_INT;
            if (i >= 11 && i <= 18) {
                this.f3989E.setLayerType(1, null);
            }
        }
        this.f3991G = new ProgressBar(this.f4045c);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.f3989E.setWebChromeClient(new e());
        this.f3989E.setWebViewClient(new a());
        this.f3989E.setOnTouchListener(new b(this));
        this.f3989E.setPadding(c3489yj.m16639e(this.f3992H.f4397c.width()), c3489yj.m16644j(this.f3992H.f4397c.width()), c3489yj.m16642h(this.f3992H.f4397c.width()), c3489yj.m16635b(this.f3992H.f4397c.width()));
        this.f3989E.loadUrl(c3489yj.f14226k);
        this.f3995x.addView(this.f3989E, new LinearLayout.LayoutParams(-1, -1));
        this.f3995x.addView(this.f3991G, layoutParams);
    }

    /* renamed from: a */
    public int m4677a(int i, int i2) {
        this.f4053k = f3984L;
        this.f4054l = f3983K;
        if (i > 0) {
            this.f4054l = i;
        }
        if (i2 > 0) {
            this.f4053k = i2;
        }
        return this.f4053k;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4174a(C0639j0 c0639j0, C0669v0 c0669v0) {
        int m16645k = this.f3990F.m16645k(c0669v0.f4397c.width());
        this.f4054l = m16645k;
        if (m16645k < 0) {
            this.f4054l = f3983K;
        }
        int m16637c = this.f3990F.m16637c(c0669v0.f4397c.height());
        this.f4053k = m16637c;
        if (m16637c < 0) {
            this.f4053k = f3984L;
        }
        this.f3995x.getLayoutParams().height = this.f4053k;
        this.f3995x.getLayoutParams().width = this.f4054l;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4142b() {
        this.f4044b.removeView(this.f3995x);
    }

    /* renamed from: b */
    public void m4678b(C3489yj c3489yj) {
        this.f3990F = c3489yj;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f3990F;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f3995x;
    }

    /* renamed from: m */
    public int m4679m() {
        String str;
        C3489yj c3489yj = this.f3990F;
        if (c3489yj != null && (str = c3489yj.f14214g) != null) {
            if (str.equalsIgnoreCase("C") || this.f3990F.f14214g.equalsIgnoreCase("Center")) {
                return 1;
            }
            if (this.f3990F.f14214g.equalsIgnoreCase("L") || this.f3990F.f14214g.equalsIgnoreCase("Left")) {
                if (this.f4055m) {
                    return 5;
                }
            } else if ((this.f3990F.f14214g.equalsIgnoreCase("R") || this.f3990F.f14214g.equalsIgnoreCase("Right")) && !this.f4055m) {
                return 5;
            }
        }
        return 3;
    }

    /* renamed from: n */
    public void m4680n() {
        if (this.f4044b != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f4054l, this.f4053k);
            layoutParams.setMargins(this.f3990F.m16638d(this.f3992H.f4397c.width()), this.f3990F.m16643i(this.f3992H.f4397c.width()), this.f3990F.m16641g(this.f3992H.f4397c.width()), this.f3990F.m16632a(this.f3992H.f4397c.width()));
            layoutParams.gravity = m4679m();
            this.f4044b.addView(this.f3995x, layoutParams);
            this.f4044b.invalidate();
            this.f3995x.getLayoutParams().width = this.f4054l;
            this.f3995x.getLayoutParams().height = this.f4053k;
        }
    }

    /* renamed from: o */
    public void m4681o() {
        AlertDialog alertDialog = this.f3986B;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f3986B.dismiss();
        }
        this.f3991G.setVisibility(8);
        this.f3989E.stopLoading();
    }
}
