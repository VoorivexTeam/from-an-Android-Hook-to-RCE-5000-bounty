package ir.tapsell.sdk.utils;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import ir.tapsell.sdk.NoProguard;
import ir.tapsell.sdk.TapsellAd;
import ir.tapsell.sdk.TapsellAdActivity;
import p000.g50;
import p000.i50;

/* loaded from: classes.dex */
public class WebViewDefaultInterface implements NoProguard {
    public static final String INTERFACE_NAME = "JSInterface";
    public static final Integer MIN_PACKAGE_LENGTH = 1;
    public static final String REQUEST_CODE_TO_BE_IGNORED = String.valueOf(29);

    /* renamed from: ac */
    private Activity f11258ac;

    /* renamed from: ad */
    private TapsellAd f11259ad;
    private MediaPlayer mediaPlayer;

    public WebViewDefaultInterface(Activity activity, TapsellAd tapsellAd) {
        this.f11258ac = activity;
        this.f11259ad = tapsellAd;
    }

    @JavascriptInterface
    public void close() {
        stopSoundPlayback();
        Activity activity = this.f11258ac;
        if (activity == null || !(activity instanceof TapsellAdActivity)) {
            return;
        }
        ((TapsellAdActivity) activity).onClose();
    }

    @JavascriptInterface
    public void dismiss() {
        stopSoundPlayback();
        Activity activity = this.f11258ac;
        if (activity == null || !(activity instanceof TapsellAdActivity)) {
            return;
        }
        ((TapsellAdActivity) activity).onDismiss();
    }

    @JavascriptInterface
    public void playSound(String str) {
        i50.m12368a("playSound: " + str);
        Activity activity = this.f11258ac;
        if (activity == null || !(activity instanceof TapsellAdActivity)) {
            return;
        }
        if (((TapsellAdActivity) activity).getCurrentDisplay() != 2 && ((TapsellAdActivity) this.f11258ac).getCurrentDisplay() != 3) {
            stopSoundPlayback();
            return;
        }
        if (str != null) {
            if (str.endsWith(".mp3") || str.endsWith(".aac") || str.endsWith(".wma")) {
                MediaPlayer mediaPlayer = this.mediaPlayer;
                if (mediaPlayer != null) {
                    try {
                        mediaPlayer.release();
                        this.mediaPlayer = null;
                    } catch (Throwable th) {
                        g50.m11895a(th);
                    }
                }
                MediaPlayer create = MediaPlayer.create(this.f11258ac, Uri.parse(str));
                this.mediaPlayer = create;
                create.start();
            }
        }
    }

    @JavascriptInterface
    public void replay() {
        stopSoundPlayback();
        Activity activity = this.f11258ac;
        if (activity == null || !(activity instanceof TapsellAdActivity)) {
            return;
        }
        ((TapsellAdActivity) activity).replayVideo();
    }

    @JavascriptInterface
    public void startIntent(String str, String str2, String str3, String str4, String str5) {
        i50.m12368a("startIntent, actionType: " + str + ", uri: " + str2 + ", isService: " + str3 + ", requestCode: " + str4 + ", packageName:" + str5);
        Activity activity = this.f11258ac;
        if (activity != null && (activity instanceof TapsellAdActivity)) {
            ((TapsellAdActivity) activity).reportClick();
            ((TapsellAdActivity) this.f11258ac).startIntent(str, str2, str3, str4, str5);
            return;
        }
        try {
            Intent intent = new Intent(str, Uri.parse(str2));
            if (str5 != null && str5.length() >= MIN_PACKAGE_LENGTH.intValue()) {
                intent.setPackage(str5);
            }
            if (Boolean.parseBoolean(str3)) {
                this.f11258ac.startService(intent);
                return;
            }
            if (!str4.equals(REQUEST_CODE_TO_BE_IGNORED)) {
                this.f11258ac.startActivityForResult(intent, Integer.parseInt(str4));
                return;
            }
            if ("android.intent.action.VIEW".equalsIgnoreCase(str)) {
                Bundle bundle = new Bundle();
                bundle.putString("Referer", "tapsell");
                bundle.putString("Referrer", "tapsell");
                intent.putExtra("com.android.browser.headers", bundle);
            }
            this.f11258ac.startActivity(intent);
        } catch (Exception unused) {
            C2771m.m13178a(this.f11258ac, C2771m.m13176a(str2));
        }
    }

    public void stopSoundPlayback() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
                this.mediaPlayer = null;
            } catch (Throwable th) {
                g50.m11895a(th);
            }
        }
    }
}
