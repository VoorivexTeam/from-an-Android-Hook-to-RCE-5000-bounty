package ir.tapsell.sdk.bannerads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.b50;
import defpackage.k50;
import defpackage.z40;
import ir.tapsell.sdk.models.requestModels.RequestBannerAdSuggestionJsonParams;
import ir.tapsell.sdk.models.sdkErrorLogModels.SdkErrorTypeEnum;
import ir.tapsell.sdk.utils.GsonHelper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a extends ir.tapsell.sdk.a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.bannerads.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0063a extends WebChromeClient {
        final /* synthetic */ Context a;

        C0063a(Context context) {
            this.a = context;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            if (consoleMessage.messageLevel().equals(ConsoleMessage.MessageLevel.ERROR)) {
                k50.a(this.a, consoleMessage.message(), SdkErrorTypeEnum.TAPSELL_STANDARD);
            }
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return super.onJsAlert(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
            return super.onJsBeforeUnload(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return super.onJsConfirm(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsTimeout() {
            k50.a(this.a, "Error js timeout", SdkErrorTypeEnum.TAPSELL_STANDARD);
            return super.onJsTimeout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends WebViewClient {
        final /* synthetic */ Context a;
        final /* synthetic */ TapsellBannerWebView b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        b(Context context, TapsellBannerWebView tapsellBannerWebView, String str, String str2) {
            this.a = context;
            this.b = tapsellBannerWebView;
            this.c = str;
            this.d = str2;
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(WebView webView, Message message, Message message2) {
            super.onFormResubmission(webView, message, message2);
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            super.onPageCommitVisible(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if ("https://play.tapsell.ir/standard-banner/index.html?os=android".equalsIgnoreCase(str)) {
                if (Build.VERSION.SDK_INT >= 19) {
                    this.b.evaluateJavascript("initialize(" + this.c + ",'" + this.d + "');", null);
                } else {
                    this.b.loadUrl("javascript:initialize(" + this.c + ",'" + this.d + "');");
                }
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            super.onReceivedClientCertRequest(webView, clientCertRequest);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if ("https://play.tapsell.ir/standard-banner/index.html?os=android".equalsIgnoreCase(str2)) {
                k50.a(this.a, "ReceivedError: , errorCode: " + i + ", description: " + str + ", failingUrl: " + str2, SdkErrorTypeEnum.TAPSELL_STANDARD);
                this.b.onError(str);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            TapsellBannerWebView tapsellBannerWebView;
            String obj;
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (Build.VERSION.SDK_INT >= 23) {
                if (!"https://play.tapsell.ir/standard-banner/index.html?os=android".equalsIgnoreCase(webResourceRequest.getUrl().toString())) {
                    return;
                }
                k50.a(this.a, "Error ReceivedError: url:" + webResourceRequest.getUrl().toString() + ", error: " + ((Object) webResourceError.getDescription()), SdkErrorTypeEnum.TAPSELL_STANDARD);
                tapsellBannerWebView = this.b;
                obj = webResourceError.getDescription().toString();
            } else {
                if (!"https://play.tapsell.ir/standard-banner/index.html?os=android".equalsIgnoreCase(webResourceRequest.getUrl().toString())) {
                    return;
                }
                k50.a(this.a, "Error ReceivedError: url:" + webResourceRequest.getUrl().toString() + ", error: " + webResourceError.toString(), SdkErrorTypeEnum.TAPSELL_STANDARD);
                tapsellBannerWebView = this.b;
                obj = webResourceError.toString();
            }
            tapsellBannerWebView.onError(obj);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if ("https://play.tapsell.ir/standard-banner/index.html?os=android".equalsIgnoreCase(webResourceRequest.getUrl().toString())) {
                k50.a(this.a, "Error ReceivedHttpError: url:" + webResourceRequest.getUrl().toString() + ", error: " + webResourceResponse.getReasonPhrase(), SdkErrorTypeEnum.TAPSELL_STANDARD);
                this.b.onError(webResourceResponse.getReasonPhrase());
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            super.onReceivedLoginRequest(webView, str, str2, str3);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            if ("https://play.tapsell.ir/standard-banner/index.html?os=android".equalsIgnoreCase(webView.getUrl())) {
                k50.a(this.a, "Error ReceivedSSLError: , error: " + sslError.toString(), SdkErrorTypeEnum.TAPSELL_STANDARD);
                this.b.onError("SSL Error");
            }
        }

        @Override // android.webkit.WebViewClient
        public void onTooManyRedirects(WebView webView, Message message, Message message2) {
            super.onTooManyRedirects(webView, message, message2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return null;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return null;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    public static void a(Context context, TapsellBannerWebView tapsellBannerWebView, String str, int i) {
        String json = GsonHelper.getCustomGson().toJson(b50.b());
        RequestBannerAdSuggestionJsonParams requestBannerAdSuggestionJsonParams = new RequestBannerAdSuggestionJsonParams(str, i);
        requestBannerAdSuggestionJsonParams.setUserExtraInfo(z40.K().n());
        String json2 = GsonHelper.getCustomGson().toJson(requestBannerAdSuggestionJsonParams);
        tapsellBannerWebView.loadUrl("https://play.tapsell.ir/standard-banner/index.html?os=android");
        tapsellBannerWebView.getSettings().setJavaScriptEnabled(true);
        tapsellBannerWebView.addJavascriptInterface(new TapsellBannerViewInterface(context, tapsellBannerWebView), "JSInterface");
        tapsellBannerWebView.setWebChromeClient(new C0063a(context));
        tapsellBannerWebView.setWebViewClient(new b(context, tapsellBannerWebView, json, json2));
        tapsellBannerWebView.clearCache(true);
        if (Build.VERSION.SDK_INT >= 21) {
            tapsellBannerWebView.getSettings().setMixedContentMode(0);
        }
    }
}
