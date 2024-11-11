package com.comviva.webaxn.p002ui;

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
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import p000.C2434ej;
import p000.C3107q2;
import p000.C3361vj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.m1 */
/* loaded from: classes.dex */
public class C0649m1 extends AbstractC0652n1 {

    /* renamed from: J */
    private static int f4015J = 240;

    /* renamed from: K */
    private static int f4016K = 240;

    /* renamed from: A */
    private View f4017A;

    /* renamed from: B */
    private AlertDialog f4018B;

    /* renamed from: C */
    EditText f4019C;

    /* renamed from: D */
    EditText f4020D;

    /* renamed from: E */
    private C0651n0 f4021E;

    /* renamed from: F */
    private ProgressBar f4022F;

    /* renamed from: G */
    private C3489yj f4023G;

    /* renamed from: H */
    private DialogInterface.OnClickListener f4024H;

    /* renamed from: I */
    public final C0755x1.r f4025I;

    /* renamed from: x */
    private RelativeLayout f4026x;

    /* renamed from: y */
    private AlertDialog.Builder f4027y;

    /* renamed from: z */
    private HttpAuthHandler f4028z;

    /* renamed from: com.comviva.webaxn.ui.m1$a */
    /* loaded from: classes.dex */
    class a extends WebViewClient {

        /* renamed from: com.comviva.webaxn.ui.m1$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class DialogInterfaceOnCancelListenerC3555a implements DialogInterface.OnCancelListener {
            DialogInterfaceOnCancelListenerC3555a() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                C0649m1.this.f4021E.stopLoading();
                C0649m1.this.f4021E.loadUrl("about:blank");
                C0649m1.this.f4022F.setVisibility(8);
            }
        }

        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            C0649m1.this.f4022F.setVisibility(8);
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C0649m1.this.f4022F.setVisibility(0);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            C0649m1.this.f4028z = httpAuthHandler;
            if (C0649m1.this.f4018B == null) {
                C0649m1.this.f4027y.setIcon(R.drawable.ic_stat_notify_webaxn);
                C0649m1.this.f4027y.setTitle("HTTP Authentication Request");
                C0649m1.this.f4027y.setPositiveButton("Ok", C0649m1.this.f4024H);
                C0649m1.this.f4027y.setView(C0649m1.this.f4017A);
                C0649m1.this.f4027y.setNegativeButton("Cancel", C0649m1.this.f4024H);
                C0649m1.this.f4027y.setOnCancelListener(new DialogInterfaceOnCancelListenerC3555a());
                C0649m1 c0649m1 = C0649m1.this;
                c0649m1.f4018B = c0649m1.f4027y.create();
                C0649m1.this.f4018B.setCanceledOnTouchOutside(false);
            } else if (C0649m1.this.f4018B.isShowing()) {
                return;
            }
            C0649m1.this.f4018B.show();
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
                C0649m1.this.f4045c.startActivity(data);
                C0755x1.f5264v = true;
                z = true;
            } catch (Exception unused) {
                C0755x1.f5264v = false;
            }
            if (!z) {
                C0649m1 c0649m1 = C0649m1.this;
                c0649m1.f4049g.mo4845a(c0649m1.f4023G, webResourceRequest.getUrl().toString(), C0649m1.this.f4025I);
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
                C0649m1.this.f4045c.startActivity(data);
                C0755x1.f5264v = true;
                z = true;
            } catch (Exception unused) {
                C0755x1.f5264v = false;
            }
            if (!z) {
                C0649m1 c0649m1 = C0649m1.this;
                c0649m1.f4049g.mo4845a(c0649m1.f4023G, str, C0649m1.this.f4025I);
            }
            return true;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.m1$b */
    /* loaded from: classes.dex */
    class b implements View.OnTouchListener {
        b(C0649m1 c0649m1) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.m1$c */
    /* loaded from: classes.dex */
    class c implements DialogInterface.OnClickListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -1) {
                C0649m1.this.f4028z.proceed(C0649m1.this.f4019C.getText().toString(), C0649m1.this.f4020D.getText().toString());
            } else if (i == -2) {
                C0649m1.this.f4021E.stopLoading();
                C0649m1.this.f4021E.loadUrl("about:blank");
                C0649m1.this.f4022F.setVisibility(8);
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.m1$d */
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
            C0649m1.this.f4021E.loadUrl(str);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.m1$e */
    /* loaded from: classes.dex */
    public class e extends WebChromeClient {

        /* renamed from: com.comviva.webaxn.ui.m1$e$a */
        /* loaded from: classes.dex */
        class a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ GeolocationPermissions.Callback f4034b;

            /* renamed from: c */
            final /* synthetic */ String f4035c;

            a(e eVar, GeolocationPermissions.Callback callback, String str) {
                this.f4034b = callback;
                this.f4035c = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.f4034b.invoke(this.f4035c, false, true);
            }
        }

        /* renamed from: com.comviva.webaxn.ui.m1$e$b */
        /* loaded from: classes.dex */
        class b implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ GeolocationPermissions.Callback f4036b;

            /* renamed from: c */
            final /* synthetic */ String f4037c;

            b(e eVar, GeolocationPermissions.Callback callback, String str) {
                this.f4036b = callback;
                this.f4037c = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.f4036b.invoke(this.f4037c, true, true);
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
            AlertDialog.Builder builder = new AlertDialog.Builder(C0649m1.this.f4045c);
            builder.setTitle("Location!");
            builder.setMessage(str + " wants to use your device's location.").setCancelable(true).setPositiveButton("Allow", new b(this, callback, str)).setNegativeButton("Block", new a(this, callback, str));
            builder.create().show();
            super.onGeolocationPermissionsShowPrompt(str, callback);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            Toast.makeText(C0649m1.this.f4045c, str2, 0).show();
            jsResult.confirm();
            return true;
        }
    }

    public C0649m1(Context context, C3489yj c3489yj, C0639j0 c0639j0) {
        super(context);
        this.f4024H = new c();
        this.f4025I = new d();
        int m16637c = c3489yj.m16637c(C0687b.m5342a(this.f4045c).m5343a().m5547b());
        if (m16637c > -1) {
            f4016K = m16637c;
        }
        int m16645k = c3489yj.m16645k(c0639j0.f3868e);
        if (m16645k > -1) {
            f4015J = m16645k;
        }
        this.f4023G = c3489yj;
        this.f4026x = new RelativeLayout(context);
        if (!TextUtils.isEmpty(this.f4023G.f14249r1)) {
            this.f4026x.setContentDescription(this.f4023G.f14249r1);
        }
        C3361vj c3361vj = this.f4023G.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(this.f4026x, c3361vj.m16034a());
        }
        C2434ej c2434ej = this.f4023G.f14173O0;
        if (c2434ej != null) {
            c2434ej.m11615a(c0639j0.f3869f);
        }
        this.f4027y = new AlertDialog.Builder(this.f4045c);
        View inflate = LayoutInflater.from(this.f4045c).inflate(R.layout.dialog_signin, (ViewGroup) null);
        this.f4017A = inflate;
        EditText editText = (EditText) inflate.findViewById(R.id.username);
        this.f4019C = editText;
        editText.setHint("Enter Username");
        this.f4019C.setBackgroundColor(-1);
        this.f4019C.setTextColor(-16777216);
        EditText editText2 = (EditText) this.f4017A.findViewById(R.id.password);
        this.f4020D = editText2;
        editText2.setHint("Enter Password");
        this.f4020D.setBackgroundColor(-1);
        this.f4020D.setTextColor(-16777216);
        C0651n0 c0651n0 = new C0651n0(context);
        this.f4021E = c0651n0;
        c0651n0.getSettings().setBuiltInZoomControls(true);
        this.f4021E.getSettings().setJavaScriptEnabled(true);
        this.f4021E.getSettings().setDomStorageEnabled(true);
        this.f4021E.setHorizontalScrollBarEnabled(true);
        this.f4021E.setVerticalScrollBarEnabled(true);
        if (Build.VERSION.SDK_INT >= 17) {
            this.f4021E.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        if (!TextUtils.isEmpty(this.f4023G.f14186V) && this.f4023G.f14186V.startsWith("trans")) {
            this.f4021E.getSettings().setBuiltInZoomControls(false);
            this.f4021E.setBackgroundColor(0);
            int i = Build.VERSION.SDK_INT;
            if (i >= 11 && i <= 18) {
                this.f4021E.setLayerType(1, null);
            }
        }
        this.f4021E.loadUrl(c3489yj.f14226k);
        this.f4022F = new ProgressBar(this.f4045c);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.f4021E.setWebChromeClient(new e());
        this.f4021E.setWebViewClient(new a());
        this.f4021E.setOnTouchListener(new b(this));
        this.f4026x.addView(this.f4021E, new LinearLayout.LayoutParams(-1, -1));
        this.f4026x.addView(this.f4022F, layoutParams);
    }

    /* renamed from: a */
    public int m4693a(AbsoluteLayout.LayoutParams layoutParams, C0669v0 c0669v0) {
        this.f4053k = f4016K;
        this.f4054l = f4015J;
        int i = layoutParams.width;
        if (i > 0) {
            this.f4054l = i;
        }
        int i2 = layoutParams.height;
        if (i2 > 0) {
            this.f4053k = i2;
        }
        this.f4026x.setLayoutParams(new AbsoluteLayout.LayoutParams(this.f4054l, this.f4053k, layoutParams.x, layoutParams.y));
        return this.f4053k;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.f4026x.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.f4026x.getLayoutParams()).y = layoutParams.y;
        if (layoutParams.width > 0) {
            ((AbsoluteLayout.LayoutParams) this.f4026x.getLayoutParams()).width = layoutParams.width;
        }
        if (layoutParams.height > 0) {
            ((AbsoluteLayout.LayoutParams) this.f4026x.getLayoutParams()).height = layoutParams.height;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4142b() {
        this.f4044b.removeView(this.f4026x);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4143b(AbsoluteLayout.LayoutParams layoutParams) {
        int i = layoutParams.width;
        if (i <= 0) {
            i = f4015J;
        }
        this.f4054l = i;
        int i2 = layoutParams.height;
        if (i2 <= 0) {
            i2 = f4016K;
        }
        this.f4053k = i2;
        this.f4026x.getLayoutParams().width = this.f4054l;
        this.f4026x.getLayoutParams().height = this.f4053k;
    }

    /* renamed from: b */
    public void m4694b(C3489yj c3489yj) {
        this.f4023G = c3489yj;
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
        return this.f4023G;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f4026x;
    }

    /* renamed from: m */
    public void m4695m() {
        ViewGroup viewGroup = this.f4044b;
        if (viewGroup != null) {
            viewGroup.addView(this.f4026x);
            this.f4044b.invalidate();
        }
    }

    /* renamed from: n */
    public void m4696n() {
        AlertDialog alertDialog = this.f4018B;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f4018B.dismiss();
        }
        this.f4022F.setVisibility(8);
        this.f4021E.stopLoading();
    }
}
