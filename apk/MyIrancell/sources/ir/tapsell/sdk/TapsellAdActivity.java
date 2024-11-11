package ir.tapsell.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import ir.tapsell.sdk.models.responseModels.subModels.KeyValuePair;
import ir.tapsell.sdk.models.responseModels.subModels.VastTrackingData;
import ir.tapsell.sdk.models.responseModels.subModels.VibrationPattern;
import ir.tapsell.sdk.models.sdkErrorLogModels.SdkErrorTypeEnum;
import ir.tapsell.sdk.utils.C2763e;
import ir.tapsell.sdk.utils.C2766h;
import ir.tapsell.sdk.utils.C2771m;
import ir.tapsell.sdk.utils.FontManager;
import ir.tapsell.sdk.utils.WebViewClientDefaultImpl;
import ir.tapsell.sdk.utils.WebViewDefaultInterface;
import ir.tapsell.sdk.views.C2785b;
import ir.tapsell.sdk.views.DilatingDotsProgressBar;
import ir.tapsell.sdk.views.DonutProgress;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.c70;
import p000.g50;
import p000.i50;
import p000.k50;
import p000.n60;
import p000.v40;

/* loaded from: classes.dex */
public class TapsellAdActivity extends Activity implements NoProguard {
    private static final String AD_SHOW_FINISHED_CALLED = "AD_SHOW_FINISHED_CALLED";
    private static final String AD_STATE_WAS_UPDATED = "STATE_UPDATED";
    public static final String BACK_DIAlOG_BACKGROUND_RES_ID = "BACK_DIAlOG_BACKGROUND_RES_ID";
    public static final String BACK_DIAlOG_BTN_NEGATIVE_BACKGROUND_RES_ID = "BACK_DIAlOG_BTN_NEGATIVE_BACKGROUND_RES_ID";
    public static final String BACK_DIAlOG_BTN_NEGATIVE_TEXT = "BACK_DIAlOG_BTN_NEGATIVE_TEXT";
    public static final String BACK_DIAlOG_BTN_NEGATIVE_TEXT_COLOR = "BACK_DIAlOG_BTN_NEGATIVE_TEXT_COLOR";
    public static final String BACK_DIAlOG_BTN_POSITIVE_BACKGROUND_RES_ID = "BACK_DIAlOG_BTN_POSITIVE_BACKGROUND_RES_ID";
    public static final String BACK_DIAlOG_BTN_POSITIVE_TEXT = "BACK_DIAlOG_BTN_POSITIVE_TEXT";
    public static final String BACK_DIAlOG_BTN_POSITIVE_TEXT_COLOR = "BACK_DIAlOG_BTN_POSITIVE_TEXT_COLOR";
    public static final String BACK_DIAlOG_MESSAGE = "BACK_DIAlOG_MESSAGE";
    public static final String BACK_DIAlOG_MESSAGE_TEXT_COLOR = "BACK_DIAlOG_MESSAGE_TEXT_COLOR";
    public static final String BACK_DIAlOG_TYPEFACE_PATH = "BACK_DIAlOG_TYPEFACE_PATH";
    public static final String BACK_DISABLED = "BACK_DISABLED";
    public static final String BACK_DISABLED_TOAST_MESSAGE = "BACK_DISABLED_TOAST_MESSAGE";
    private static final String CURRENT_DISPLAY = "CURRENT_DISPLAY";
    public static final int DISPLAY_VIDEO = 1;
    public static final int DISPLAY_WEBVIEW_ACTION = 3;
    public static final int DISPLAY_WEBVIEW_BANNER = 2;
    private static final String DONE_PERCENTAGE = "DONE_PERCENTAGE";
    private static final String DONE_SECONDS = "DONE_SECONDS";
    public static final String EXTRA_DATA = "EXTRA_DATA";
    public static final String IMMERSIVE_MODE = "IMMERSIVE_MODE";
    private static final long PROGRESS_LOOP_INTERVAL = 400;
    private static final String RESULT_RETURNED = "RESULT_RETURNED";
    public static final String ROTATION_MODE = "ROTATION_MODE";
    public static final String SHOW_DIALOG = "SHOW_DIALOG";
    private static final String VIDEO_DURATION = "VIDEO_DURATION";
    private static final String VIDEO_PAUSED = "VIDEO_PAUSED";
    private static final String VIDEO_PAUSED_POSITION = "VIDEO_PAUSED_POSITION";
    public static final String VIDEO_SEEN_COMPLETELY = "VIDEO_SEEN_COMPLETELY";
    private static final String VIDEO_SHOWN_ONCE = "VIDEO_SHOWN_ONCE";
    private static final String VIDEO_URI = "VIDEO_URI";
    private static final String WEBVIEW_START_TIME = "WEBVIEW_START_TIME";
    private Integer backDialogButtonBackgroundResId;
    private String backDialogMessage;
    private Integer backDialogMessageTextColor;
    private Integer backDialogNegativeButtonBackgroundResId;
    private String backDialogNegativeButtonText;
    private Integer backDialogNegativeButtonTextColor;
    private Integer backDialogPositiveButtonBackgroundResId;
    private String backDialogPositiveButtonText;
    private Integer backDialogPositiveButtonTextColor;
    private String backDialogTypefacePath;
    private String backDisabledToastMessage;
    private Thread.UncaughtExceptionHandler defaultHandler;
    private Integer donePercentage;
    private Integer doneSeconds;
    private DonutProgress donutProgress;
    private Handler progressHandler;
    private Vibrator vibrator;
    private Integer videoDuration;
    private Long webViewStartTime;
    private final Handler buttonsHandler = new Handler(Looper.getMainLooper());
    private Boolean immersiveMode = null;
    private Boolean backDisabled = null;
    private Boolean showDialog = null;
    private boolean isVideoPaused = false;
    private Integer rotationMode = null;

    /* renamed from: ad */
    private TapsellAd f10959ad = null;
    private RelativeLayout playerLayout = null;
    private C2785b videoView = null;
    private String videoPathOrURL = null;
    private ImageView ivSound = null;
    private ImageView ivSkip = null;
    private WebView webView = null;
    private WebViewClientDefaultImpl webViewClient = null;
    private WebViewDefaultInterface webViewJSInterface = null;
    private int videoPausedPosition = 0;
    private int current_display = 1;
    private boolean closeAvailable = false;
    private boolean isVideoCompleted = false;
    private boolean isVideoShownOnce = false;
    private boolean isResultReturned = false;
    private boolean isAdShowFinishedACalled = false;
    private boolean isStateUpdated = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.TapsellAdActivity$a */
    /* loaded from: classes.dex */
    public class RunnableC2652a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f10960b;

        /* renamed from: c */
        final /* synthetic */ String f10961c;

        /* renamed from: d */
        final /* synthetic */ String f10962d;

        /* renamed from: e */
        final /* synthetic */ String f10963e;

        /* renamed from: f */
        final /* synthetic */ String f10964f;

        RunnableC2652a(String str, String str2, String str3, String str4, String str5) {
            this.f10960b = str;
            this.f10961c = str2;
            this.f10962d = str3;
            this.f10963e = str4;
            this.f10964f = str5;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (!TapsellAdActivity.this.isResultReturned && TapsellAdActivity.this.f10959ad != null && TapsellAdActivity.this.f10959ad.getAd() != null && TapsellAdActivity.this.f10959ad.getAd().getCreative() != 0 && ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getCtaType().intValue() == 2) {
                TapsellAdActivity.this.onAdShowStoppedOrFinished(true);
            }
            try {
                Intent intent = new Intent(this.f10960b, Uri.parse(this.f10961c));
                if (this.f10962d != null && this.f10962d.length() >= WebViewDefaultInterface.MIN_PACKAGE_LENGTH.intValue()) {
                    intent.setPackage(this.f10962d);
                }
                if (Boolean.parseBoolean(this.f10963e)) {
                    TapsellAdActivity.this.startService(intent);
                    return;
                }
                if (!this.f10964f.equals(WebViewDefaultInterface.REQUEST_CODE_TO_BE_IGNORED)) {
                    TapsellAdActivity.this.startActivityForResult(intent, Integer.parseInt(this.f10964f));
                    return;
                }
                if ("android.intent.action.VIEW".equalsIgnoreCase(this.f10960b)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("Referer", "tapsell");
                    bundle.putString("Referrer", "tapsell");
                    intent.putExtra("com.android.browser.headers", bundle);
                }
                TapsellAdActivity.this.startActivity(intent);
            } catch (Exception unused) {
                i50.m12368a("Can't start cta uri.");
                C2771m.m13178a(TapsellAdActivity.this.getBaseContext(), C2771m.m13176a(this.f10961c));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.TapsellAdActivity$b */
    /* loaded from: classes.dex */
    public class C2653b implements C2785b.b {
        C2653b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ir.tapsell.sdk.views.C2785b.b
        /* renamed from: a */
        public void mo12859a() {
            TapsellAdActivity.this.ivSound.setImageDrawable(C2766h.f11268b);
            if (TapsellAdActivity.this.f10959ad == null || TapsellAdActivity.this.f10959ad.getAd() == null || TapsellAdActivity.this.f10959ad.getAd().getCreative() == 0 || ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getVastTrackingData() == null) {
                return;
            }
            VastTrackingData vastTrackingData = ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getVastTrackingData();
            if (vastTrackingData.getUnmuteTrackerUrls() == null || vastTrackingData.getUnmuteTrackerUrls().size() <= 0) {
                return;
            }
            TapsellAdActivity.this.sendUnmuteVastReports(vastTrackingData.getUnmuteTrackerUrls());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ir.tapsell.sdk.views.C2785b.b
        /* renamed from: b */
        public void mo12860b() {
            TapsellAdActivity.this.ivSound.setImageDrawable(C2766h.f11267a);
            if (TapsellAdActivity.this.f10959ad == null || TapsellAdActivity.this.f10959ad.getAd() == null || TapsellAdActivity.this.f10959ad.getAd().getCreative() == 0 || ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getVastTrackingData() == null) {
                return;
            }
            VastTrackingData vastTrackingData = ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getVastTrackingData();
            if (vastTrackingData.getMuteTrackerUrls() == null || vastTrackingData.getMuteTrackerUrls().size() <= 0) {
                return;
            }
            TapsellAdActivity.this.sendMuteVastReports(vastTrackingData.getMuteTrackerUrls());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.TapsellAdActivity$c */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2654c implements View.OnClickListener {
        ViewOnClickListenerC2654c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TapsellAdActivity.this.videoView != null) {
                if (TapsellAdActivity.this.videoView.m13261d()) {
                    TapsellAdActivity.this.videoView.m13263f();
                } else {
                    TapsellAdActivity.this.videoView.m13262e();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.TapsellAdActivity$d */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2655d implements View.OnClickListener {
        ViewOnClickListenerC2655d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (TapsellAdActivity.this.videoView != null && TapsellAdActivity.this.videoView.isPlaying()) {
                    TapsellAdActivity.this.videoView.pause();
                }
            } catch (Throwable th) {
                g50.m11895a(th);
            }
            if (TapsellAdActivity.this.f10959ad != null && TapsellAdActivity.this.f10959ad.getAd() != null && TapsellAdActivity.this.f10959ad.getAd().getCreative() != 0 && ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getVastTrackingData() != null) {
                VastTrackingData vastTrackingData = ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getVastTrackingData();
                if (!vastTrackingData.isSkipTrackerReported() && vastTrackingData.getSkipTrackerUrls() != null && vastTrackingData.getSkipTrackerUrls().size() > 0) {
                    TapsellAdActivity.this.sendSkipVastReports(vastTrackingData.getSkipTrackerUrls());
                    ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getVastTrackingData().setSkipTrackerReported(true);
                }
            }
            if (TapsellAdActivity.this.actionIsWebView()) {
                TapsellAdActivity.this.showActionWebView();
            } else {
                i50.m12368a("Operation not supported in this version");
                TapsellAdActivity.this.finishActivity();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.TapsellAdActivity$e */
    /* loaded from: classes.dex */
    public class C2656e implements MediaPlayer.OnPreparedListener {
        C2656e() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            TapsellAdActivity tapsellAdActivity = TapsellAdActivity.this;
            tapsellAdActivity.videoDuration = Integer.valueOf(tapsellAdActivity.videoView.getDuration() / 1000);
            TapsellAdActivity.this.videoView.start();
            TapsellAdActivity.this.videoView.m13260c();
            TapsellAdActivity.this.videoView.setOnPreparedListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.TapsellAdActivity$f */
    /* loaded from: classes.dex */
    public class C2657f implements MediaPlayer.OnCompletionListener {
        C2657f() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (TapsellAdActivity.this.videoView.getDuration() > 0) {
                TapsellAdActivity.this.isVideoCompleted = true;
            }
            TapsellAdActivity tapsellAdActivity = TapsellAdActivity.this;
            tapsellAdActivity.doneSeconds = tapsellAdActivity.videoDuration;
            TapsellAdActivity.this.donePercentage = 100;
            if (!TapsellAdActivity.this.isVideoShownOnce && !TapsellAdActivity.this.isResultReturned && TapsellAdActivity.this.videoView.getDuration() > 0) {
                TapsellAdActivity.this.onAdShowStoppedOrFinished(true);
            }
            if (TapsellAdActivity.this.videoView.getDuration() > 0) {
                TapsellAdActivity.this.isVideoShownOnce = true;
            }
            if (TapsellAdActivity.this.isStateUpdated) {
                TapsellAdActivity.this.isStateUpdated = false;
            }
            if (TapsellAdActivity.this.actionIsWebView()) {
                TapsellAdActivity.this.showActionWebView();
            } else {
                i50.m12368a("Operation not supported in this version");
                TapsellAdActivity.this.finishActivity();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.TapsellAdActivity$g */
    /* loaded from: classes.dex */
    public class C2658g implements MediaPlayer.OnErrorListener {
        C2658g() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            k50.m13611a(TapsellAdActivity.this, "Error occurs in videoView", SdkErrorTypeEnum.TAPSELL_VIDEO);
            if (i == 100) {
                try {
                    TapsellAdActivity.this.videoView.m13254a();
                    TapsellAdActivity.this.startShowingVideo(false);
                } catch (Throwable unused) {
                }
            }
            if (!TapsellAdActivity.this.isResultReturned) {
                if (TapsellAdActivity.this.videoView.getDuration() > 0) {
                    TapsellAdActivity tapsellAdActivity = TapsellAdActivity.this;
                    tapsellAdActivity.onAdShowStoppedOrFinished(tapsellAdActivity.isVideoCompleted || TapsellAdActivity.this.isVideoShownOnce);
                } else {
                    TapsellAdActivity.this.onAdShowStoppedOrFinished(false);
                }
            }
            if (TapsellAdActivity.this.isStateUpdated) {
                TapsellAdActivity.this.isStateUpdated = false;
            }
            TapsellAdActivity.this.finishActivity();
            return false;
        }
    }

    /* renamed from: ir.tapsell.sdk.TapsellAdActivity$h */
    /* loaded from: classes.dex */
    class C2659h implements MediaPlayer.OnSeekCompleteListener {
        C2659h() {
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            TapsellAdActivity.this.videoView.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.TapsellAdActivity$i */
    /* loaded from: classes.dex */
    public class RunnableC2660i implements Runnable {

        /* renamed from: b */
        final /* synthetic */ List f10973b;

        RunnableC2660i(List list) {
            this.f10973b = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        @SuppressLint({"MissingPermission"})
        public void run() {
            if (TapsellAdActivity.this.videoView.isPlaying() && TapsellAdActivity.this.videoView.getDuration() != 0 && TapsellAdActivity.this.videoView.getCurrentPosition() < TapsellAdActivity.this.videoView.getDuration()) {
                TapsellAdActivity.this.donutProgress.setProgress((int) ((TapsellAdActivity.this.videoView.getCurrentPosition() * TapsellAdActivity.this.donutProgress.getMax()) / TapsellAdActivity.this.videoView.getDuration()));
                int currentPosition = (TapsellAdActivity.this.videoView.getCurrentPosition() * 100) / TapsellAdActivity.this.videoView.getDuration();
                int duration = (TapsellAdActivity.this.videoView.getDuration() * currentPosition) / 100000;
                if (TapsellAdActivity.this.vibrator != null) {
                    Iterator it = this.f10973b.iterator();
                    while (it.hasNext()) {
                        VibrationPattern vibrationPattern = (VibrationPattern) it.next();
                        if (duration >= vibrationPattern.getVibrationStartMomentInSeconds() && vibrationPattern.getPattern() != null) {
                            long[] jArr = new long[vibrationPattern.getPattern().size()];
                            for (int i = 0; i < vibrationPattern.getPattern().size(); i++) {
                                if (vibrationPattern.getPattern().get(i) != null) {
                                    jArr[i] = vibrationPattern.getPattern().get(i).longValue();
                                } else {
                                    jArr[i] = 0;
                                }
                            }
                            TapsellAdActivity.this.vibrator.vibrate(jArr, -1);
                            it.remove();
                        }
                    }
                }
                if (TapsellAdActivity.this.f10959ad != null && TapsellAdActivity.this.f10959ad.getAd() != null && TapsellAdActivity.this.f10959ad.getAd().getCreative() != 0 && ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getVastTrackingData() != null) {
                    VastTrackingData vastTrackingData = ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getVastTrackingData();
                    if (currentPosition >= 0 && !vastTrackingData.isStartTrackerReported() && vastTrackingData.getStartTrackerUrls() != null && vastTrackingData.getStartTrackerUrls().size() > 0) {
                        TapsellAdActivity.this.sendStartVastReports(vastTrackingData.getStartTrackerUrls());
                        ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getVastTrackingData().setStartTrackerReported(true);
                    }
                    if (currentPosition >= 25 && !vastTrackingData.isFirstQuartileTrackerReported() && vastTrackingData.getFirstQuartileTrackerUrls() != null && vastTrackingData.getFirstQuartileTrackerUrls().size() > 0) {
                        TapsellAdActivity.this.sendFirstQuartileVastReports(vastTrackingData.getFirstQuartileTrackerUrls());
                        ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getVastTrackingData().setFirstQuartileTrackerReported(true);
                    }
                    if (currentPosition >= 50 && !vastTrackingData.isMidpointTrackerReported() && vastTrackingData.getMidpointTrackerUrls() != null && vastTrackingData.getMidpointTrackerUrls().size() > 0) {
                        TapsellAdActivity.this.sendMidpointVastReports(vastTrackingData.getMidpointTrackerUrls());
                        ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getVastTrackingData().setMidpointTrackerReported(true);
                    }
                    if (currentPosition >= 75 && !vastTrackingData.isThirdQuartileTrackerReported() && vastTrackingData.getThirdQuartileTrackerUrls() != null && vastTrackingData.getThirdQuartileTrackerUrls().size() > 0) {
                        TapsellAdActivity.this.sendThirdQuartileVastReports(vastTrackingData.getThirdQuartileTrackerUrls());
                        ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getVastTrackingData().setThirdQuartileTrackerReported(true);
                    }
                    int duration2 = (TapsellAdActivity.this.videoView.getDuration() * currentPosition) / 100;
                    if (vastTrackingData.getProgressTrackingUrls() != null && vastTrackingData.getProgressTrackingUrls().size() > 0) {
                        Iterator<KeyValuePair<String, String>> it2 = vastTrackingData.getProgressTrackingUrls().iterator();
                        while (it2.hasNext()) {
                            KeyValuePair<String, String> next = it2.next();
                            if (next != null && next.getFirst() != null) {
                                if (next.getFirst().matches("[0-9]{2}:[0-9]{2}:[0-9]{2}.[0-9]{3}")) {
                                    String[] split = next.getFirst().split("\\.");
                                    String[] split2 = split[0].split(":");
                                    if (duration2 >= Integer.parseInt(split[1]) + (Integer.parseInt(split2[2]) * 1000) + (Integer.parseInt(split2[1]) * 60000) + (Integer.parseInt(split2[0]) * 3600000)) {
                                        TapsellAdActivity.this.sendProgressVastReports(next.getSecond());
                                        it2.remove();
                                    }
                                } else if (next.getFirst().matches("[0-9]{2}:[0-9]{2}:[0-9]{2}")) {
                                    String[] split3 = next.getFirst().split(":");
                                    if (duration2 >= (Integer.parseInt(split3[2]) * 1000) + (Integer.parseInt(split3[1]) * 60000) + (Integer.parseInt(split3[0]) * 3600000)) {
                                        TapsellAdActivity.this.sendProgressVastReports(next.getSecond());
                                        it2.remove();
                                    }
                                } else if (next.getFirst().matches("[0-9]+%") && currentPosition >= Integer.parseInt(next.getFirst().replace("%", ""))) {
                                    TapsellAdActivity.this.sendProgressVastReports(next.getSecond());
                                    it2.remove();
                                }
                            }
                        }
                    }
                }
                if (!TapsellAdActivity.this.isVideoShownOnce && TapsellAdActivity.this.f10959ad != null && TapsellAdActivity.this.f10959ad.getAd() != null) {
                    TapsellAdActivity tapsellAdActivity = TapsellAdActivity.this;
                    tapsellAdActivity.doneSeconds = Integer.valueOf(tapsellAdActivity.videoView.getCurrentPosition() / 1000);
                    TapsellAdActivity.this.donePercentage = Integer.valueOf(currentPosition);
                    TapsellAdActivity.this.isStateUpdated = true;
                    if (TapsellAdActivity.this.ivSkip.getVisibility() != 0 && TapsellAdActivity.this.f10959ad.getAd().getCreative() != 0 && ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getSkipStartPercentage() != null && ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getSkipStartPercentage().getSkipStartPercentage() != null && TapsellAdActivity.this.videoView != null && TapsellAdActivity.this.videoView.isPlaying() && ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getSkipStartPercentage().getSkipStartPercentage().intValue() <= currentPosition) {
                        TapsellAdActivity.this.ivSkip.setVisibility(0);
                    }
                }
            }
            if (TapsellAdActivity.this.isVideoCompleted) {
                return;
            }
            TapsellAdActivity.this.progressHandler.postDelayed(this, TapsellAdActivity.PROGRESS_LOOP_INTERVAL);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.TapsellAdActivity$j */
    /* loaded from: classes.dex */
    public class C2661j implements MediaPlayer.OnPreparedListener {
        C2661j() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            TapsellAdActivity tapsellAdActivity = TapsellAdActivity.this;
            tapsellAdActivity.videoDuration = Integer.valueOf(tapsellAdActivity.videoView.getDuration() / 1000);
            TapsellAdActivity.this.videoView.start();
            TapsellAdActivity.this.videoView.m13260c();
            TapsellAdActivity.this.videoView.setOnPreparedListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.TapsellAdActivity$k */
    /* loaded from: classes.dex */
    public class C2662k implements MediaPlayer.OnInfoListener {

        /* renamed from: a */
        final /* synthetic */ DilatingDotsProgressBar f10976a;

        C2662k(TapsellAdActivity tapsellAdActivity, DilatingDotsProgressBar dilatingDotsProgressBar) {
            this.f10976a = dilatingDotsProgressBar;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (3 == i) {
                this.f10976a.hideNow();
            }
            if (701 == i) {
                this.f10976a.showNow();
            }
            if (702 != i) {
                return false;
            }
            this.f10976a.hideNow();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.TapsellAdActivity$l */
    /* loaded from: classes.dex */
    public class C2663l extends WebChromeClient {
        C2663l() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            k50.m13611a(TapsellAdActivity.this, "Error Console message:" + consoleMessage.message(), SdkErrorTypeEnum.TAPSELL_BANNER);
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            String str3 = "Error js alert:" + str2;
            k50.m13611a(TapsellAdActivity.this, "Error js alert:" + str2, SdkErrorTypeEnum.TAPSELL_BANNER);
            return super.onJsAlert(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
            String str3 = "Error js before unload:" + str2;
            return super.onJsBeforeUnload(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            String str3 = "Error js confirm:" + str2;
            return super.onJsConfirm(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            String str4 = "Error js prompt:" + str2;
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsTimeout() {
            k50.m13611a(TapsellAdActivity.this, "Error js timeout", SdkErrorTypeEnum.TAPSELL_BANNER);
            return super.onJsTimeout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.TapsellAdActivity$m */
    /* loaded from: classes.dex */
    public class RunnableC2664m implements Runnable {
        RunnableC2664m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2671b.m12861a().m12865a(TapsellAdActivity.this.getApplicationContext(), new TapsellAd[]{TapsellAdActivity.this.f10959ad});
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.TapsellAdActivity$n */
    /* loaded from: classes.dex */
    public class RunnableC2665n implements Runnable {

        /* renamed from: ir.tapsell.sdk.TapsellAdActivity$n$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                TapsellAdActivity.this.startShowingVideo(true);
            }
        }

        RunnableC2665n() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (TapsellAdActivity.this.f10959ad == null || !TapsellAdActivity.this.f10959ad.isVideoAd() || TapsellAdActivity.this.videoView == null || TapsellAdActivity.this.videoView.isPlaying()) {
                return;
            }
            TapsellAdActivity.this.isVideoCompleted = false;
            TapsellAdActivity.this.buttonsHandler.post(new a());
            if (TapsellAdActivity.this.f10959ad == null || TapsellAdActivity.this.f10959ad.getAd() == null || TapsellAdActivity.this.f10959ad.getAd().getCreative() == 0 || ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getVastTrackingData() == null) {
                return;
            }
            VastTrackingData vastTrackingData = ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getVastTrackingData();
            if (vastTrackingData.getReplayTrackerUrls() == null || vastTrackingData.getReplayTrackerUrls().size() <= 0) {
                return;
            }
            TapsellAdActivity.this.sendReplayVastReports(vastTrackingData.getReplayTrackerUrls());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.TapsellAdActivity$o */
    /* loaded from: classes.dex */
    public class RunnableC2666o implements Runnable {
        RunnableC2666o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i50.m12368a("onClosed");
            TapsellAdActivity.this.finishActivity();
        }
    }

    /* renamed from: ir.tapsell.sdk.TapsellAdActivity$p */
    /* loaded from: classes.dex */
    class DialogInterfaceOnClickListenerC2667p implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC2667p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -2) {
                dialogInterface.dismiss();
                if (TapsellAdActivity.this.actionIsWebView()) {
                    TapsellAdActivity.this.showActionWebView();
                    return;
                }
                return;
            }
            if (i != -1) {
                return;
            }
            dialogInterface.dismiss();
            TapsellAdActivity.this.videoView.start();
            TapsellAdActivity.this.initImmersiveMode();
        }
    }

    /* renamed from: ir.tapsell.sdk.TapsellAdActivity$q */
    /* loaded from: classes.dex */
    class DialogInterfaceOnCancelListenerC2668q implements DialogInterface.OnCancelListener {

        /* renamed from: b */
        final /* synthetic */ DialogInterface.OnClickListener f10983b;

        /* renamed from: c */
        final /* synthetic */ DialogC2689h f10984c;

        DialogInterfaceOnCancelListenerC2668q(TapsellAdActivity tapsellAdActivity, DialogInterface.OnClickListener onClickListener, DialogC2689h dialogC2689h) {
            this.f10983b = onClickListener;
            this.f10984c = dialogC2689h;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.f10983b.onClick(this.f10984c, -2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.TapsellAdActivity$r */
    /* loaded from: classes.dex */
    public class RunnableC2669r implements Runnable {
        RunnableC2669r() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (!TapsellAdActivity.this.isResultReturned && TapsellAdActivity.this.f10959ad != null && TapsellAdActivity.this.f10959ad.getAd() != null && TapsellAdActivity.this.f10959ad.getAd().getCreative() != 0 && ((c70) TapsellAdActivity.this.f10959ad.getAd().getCreative()).getCtaType().intValue() == 2) {
                TapsellAdActivity.this.onAdShowStoppedOrFinished(false);
            }
            TapsellAdActivity.this.finishActivity();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean actionIsWebView() {
        TapsellAd tapsellAd = this.f10959ad;
        return (tapsellAd == null || tapsellAd.getAd() == null || this.f10959ad.getAd().getCreative() == 0 || ((c70) this.f10959ad.getAd().getCreative()).getAction() == null || ((c70) this.f10959ad.getAd().getCreative()).getAction().getType() == null || ((c70) this.f10959ad.getAd().getCreative()).getAction().getType().intValue() != 1 || ((c70) this.f10959ad.getAd().getCreative()).getAction().getActionUrl() == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean backIsEnabled() {
        C2785b c2785b;
        TapsellAd tapsellAd = this.f10959ad;
        if (tapsellAd != null && tapsellAd.getAd() != null) {
            if (this.f10959ad.isVideoAd()) {
                if (!this.isVideoShownOnce && this.f10959ad.getAd().getCreative() != 0) {
                    if (((c70) this.f10959ad.getAd().getCreative()).getCtaType().intValue() == 1) {
                        return !this.backDisabled.booleanValue();
                    }
                    if (((c70) this.f10959ad.getAd().getCreative()).getCtaType().intValue() != 3 || ((c70) this.f10959ad.getAd().getCreative()).getSkipStartPercentage() == null || ((c70) this.f10959ad.getAd().getCreative()).getSkipStartPercentage().getSkipStartPercentage() == null || ((c70) this.f10959ad.getAd().getCreative()).getSkipStartPercentage().getType() == null || ((c70) this.f10959ad.getAd().getCreative()).getSkipStartPercentage().getType().intValue() != 1 || (c2785b = this.videoView) == null || !c2785b.isPlaying() || this.videoView.getDuration() == 0) {
                        return true;
                    }
                    return ((c70) this.f10959ad.getAd().getCreative()).getSkipStartPercentage().getSkipStartPercentage().intValue() <= (this.videoView.getCurrentPosition() / this.videoView.getDuration()) * 100;
                }
            } else if (this.f10959ad.isBannerAd()) {
                return !this.backDisabled.booleanValue();
            }
        }
        return true;
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    private void configureSettingWebView() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.getSettings().setJavaScriptEnabled(true);
            this.webView.getSettings().setBuiltInZoomControls(false);
            WebViewDefaultInterface webViewDefaultInterface = new WebViewDefaultInterface(this, this.f10959ad);
            this.webViewJSInterface = webViewDefaultInterface;
            this.webView.addJavascriptInterface(webViewDefaultInterface, "JSInterface");
            this.webViewClient = new WebViewClientDefaultImpl(this);
            this.webView.setWebChromeClient(new C2663l());
            this.webView.setWebViewClient(this.webViewClient);
            this.webView.getSettings().setDomStorageEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishActivity() {
        if (this.isStateUpdated && !this.isVideoCompleted) {
            this.isStateUpdated = false;
        }
        TapsellAd tapsellAd = this.f10959ad;
        if (tapsellAd != null) {
            if (tapsellAd.isVideoAd()) {
                try {
                    if (this.videoView != null && this.videoView.isPlaying()) {
                        this.videoView.m13254a();
                    }
                } catch (Throwable unused) {
                }
            }
            C2763e.m13143a(new RunnableC2664m());
        }
        if (!this.isResultReturned && this.f10959ad != null) {
            this.isResultReturned = true;
            onAdShowStoppedOrFinished(this.isVideoCompleted || this.isVideoShownOnce);
        }
        if (this.f10959ad != null) {
            v40.m15925a().m15926a(this, this.f10959ad);
        }
        if (!this.isAdShowFinishedACalled) {
            this.isAdShowFinishedACalled = true;
            v40.m15925a().m15927a(this, this.f10959ad, this.isVideoShownOnce | this.isVideoCompleted);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            finishAfterTransition();
        } else {
            finish();
        }
    }

    private void initHandlers() {
        this.progressHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initImmersiveMode() {
        if (!this.immersiveMode.booleanValue() || Build.VERSION.SDK_INT < 19 || getWindow() == null || getWindow().getDecorView() == null) {
            return;
        }
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initProgress() {
        DonutProgress donutProgress = this.donutProgress;
        if (donutProgress != null) {
            donutProgress.setProgress(0);
        }
        Handler handler = this.progressHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            List<VibrationPattern> vibrationPatterns = ((c70) this.f10959ad.getAd().getCreative()).getVibrationPatterns();
            this.progressHandler.postDelayed(new RunnableC2660i(vibrationPatterns == null ? new ArrayList() : new ArrayList(vibrationPatterns)), PROGRESS_LOOP_INTERVAL);
        }
    }

    private void initializeScreenOrientation() {
        int i;
        Integer num = this.rotationMode;
        if (num == null) {
            setRequestedOrientation(4);
            return;
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            i = Build.VERSION.SDK_INT >= 18 ? 12 : 7;
        } else if (intValue == 2) {
            i = Build.VERSION.SDK_INT >= 18 ? 11 : 6;
        } else if (intValue == 4) {
            i = 8;
        } else {
            if (intValue != 5) {
                setRequestedOrientation(4);
                return;
            }
            i = 9;
        }
        setRequestedOrientation(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0313 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void initializeView() {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.tapsell.sdk.TapsellAdActivity.initializeView():void");
    }

    private void loadVariablesFromBundle(Bundle bundle) {
        if (bundle.containsKey(EXTRA_DATA)) {
            this.f10959ad = (TapsellAd) bundle.getSerializable(EXTRA_DATA);
        }
        this.videoPausedPosition = bundle.getInt(VIDEO_PAUSED_POSITION, 0);
        this.isVideoPaused = bundle.getBoolean(VIDEO_PAUSED, false);
        this.videoDuration = Integer.valueOf(bundle.getInt(VIDEO_DURATION, 0));
        this.doneSeconds = Integer.valueOf(bundle.getInt(DONE_SECONDS, 0));
        this.donePercentage = Integer.valueOf(bundle.getInt(DONE_PERCENTAGE, 0));
        this.immersiveMode = Boolean.valueOf(bundle.getBoolean(IMMERSIVE_MODE, false));
        this.rotationMode = Integer.valueOf(bundle.getInt(ROTATION_MODE, 3));
        this.backDisabled = Boolean.valueOf(bundle.getBoolean(BACK_DISABLED, false));
        this.isVideoCompleted = bundle.getBoolean(VIDEO_SEEN_COMPLETELY, false);
        this.isStateUpdated = bundle.getBoolean(AD_STATE_WAS_UPDATED, false);
        this.isVideoShownOnce = bundle.getBoolean(VIDEO_SHOWN_ONCE, false);
        this.isResultReturned = bundle.getBoolean(RESULT_RETURNED, false);
        this.isAdShowFinishedACalled = bundle.getBoolean(AD_SHOW_FINISHED_CALLED, false);
        this.showDialog = Boolean.valueOf(bundle.getBoolean(SHOW_DIALOG, false));
        this.videoPathOrURL = bundle.getString(VIDEO_URI);
        this.current_display = bundle.getInt(CURRENT_DISPLAY, 1);
        if (bundle.containsKey(WEBVIEW_START_TIME)) {
            this.webViewStartTime = Long.valueOf(bundle.getLong(WEBVIEW_START_TIME));
        }
        String string = bundle.getString(BACK_DIAlOG_MESSAGE);
        this.backDialogMessage = string;
        if (string == null) {
            this.backDialogMessage = "در صورتی که ویدئو را تا انتها مشاهده نکنید جایزه درون برنامه به شما داده نمی شود.";
        }
        String string2 = bundle.getString(BACK_DIAlOG_BTN_POSITIVE_TEXT);
        this.backDialogPositiveButtonText = string2;
        if (string2 == null) {
            this.backDialogPositiveButtonText = "ادامه تماشای ویدئو";
        }
        String string3 = bundle.getString(BACK_DIAlOG_BTN_NEGATIVE_TEXT);
        this.backDialogNegativeButtonText = string3;
        if (string3 == null) {
            this.backDialogNegativeButtonText = "خروج";
        }
        this.backDialogTypefacePath = bundle.getString(BACK_DIAlOG_TYPEFACE_PATH);
        Integer valueOf = Integer.valueOf(bundle.getInt(BACK_DIAlOG_BTN_POSITIVE_BACKGROUND_RES_ID));
        this.backDialogPositiveButtonBackgroundResId = valueOf;
        if (valueOf.intValue() == 0) {
            this.backDialogPositiveButtonBackgroundResId = null;
        }
        Integer valueOf2 = Integer.valueOf(bundle.getInt(BACK_DIAlOG_BTN_NEGATIVE_BACKGROUND_RES_ID));
        this.backDialogNegativeButtonBackgroundResId = valueOf2;
        if (valueOf2.intValue() == 0) {
            this.backDialogNegativeButtonBackgroundResId = null;
        }
        Integer valueOf3 = Integer.valueOf(bundle.getInt(BACK_DIAlOG_BTN_POSITIVE_TEXT_COLOR));
        this.backDialogPositiveButtonTextColor = valueOf3;
        if (valueOf3.intValue() == 0) {
            this.backDialogPositiveButtonTextColor = null;
        }
        Integer valueOf4 = Integer.valueOf(bundle.getInt(BACK_DIAlOG_BTN_NEGATIVE_TEXT_COLOR));
        this.backDialogNegativeButtonTextColor = valueOf4;
        if (valueOf4.intValue() == 0) {
            this.backDialogNegativeButtonTextColor = null;
        }
        this.backDisabledToastMessage = bundle.getString(BACK_DISABLED_TOAST_MESSAGE);
        Integer valueOf5 = Integer.valueOf(bundle.getInt(BACK_DIAlOG_BACKGROUND_RES_ID));
        this.backDialogButtonBackgroundResId = valueOf5;
        if (valueOf5.intValue() == 0) {
            this.backDialogButtonBackgroundResId = null;
        }
        Integer valueOf6 = Integer.valueOf(bundle.getInt(BACK_DIAlOG_MESSAGE_TEXT_COLOR));
        this.backDialogMessageTextColor = valueOf6;
        if (valueOf6.intValue() == 0) {
            this.backDialogMessageTextColor = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void onAdShowStoppedOrFinished(boolean z) {
        TapsellAd tapsellAd;
        TapsellAd tapsellAd2;
        this.isResultReturned = true;
        if (!this.isAdShowFinishedACalled) {
            this.isAdShowFinishedACalled = true;
            v40.m15925a().m15927a(this, this.f10959ad, z);
        }
        if (z && (tapsellAd2 = this.f10959ad) != null && tapsellAd2.getAd() != null && this.f10959ad.getAd().getCreative() != 0 && ((c70) this.f10959ad.getAd().getCreative()).getVastTrackingData() != null) {
            VastTrackingData vastTrackingData = ((c70) this.f10959ad.getAd().getCreative()).getVastTrackingData();
            if (!vastTrackingData.isCompleteTrackerReported() && vastTrackingData.getCompleteTrackerUrls() != null && vastTrackingData.getCompleteTrackerUrls().size() > 0) {
                sendCompleteVastReports(vastTrackingData.getCompleteTrackerUrls());
                ((c70) this.f10959ad.getAd().getCreative()).getVastTrackingData().setCompleteTrackerReported(true);
            }
        }
        if (!z || (tapsellAd = this.f10959ad) == null || tapsellAd.getAd() == null) {
            return;
        }
        this.f10959ad.getAd().reportAdIsDone(this, this.f10959ad.getZoneId(), this.f10959ad.getAd().getSuggestionId().toString(), null);
    }

    private void sendCompleteVastReports(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.m13613a(list.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendFirstQuartileVastReports(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.m13613a(list.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendMidpointVastReports(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.m13613a(list.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendMuteVastReports(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.m13613a(list.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendProgressVastReports(String str) {
        if (str != null) {
            k50.m13613a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendReplayVastReports(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.m13613a(list.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSkipVastReports(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.m13613a(list.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendStartVastReports(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.m13613a(list.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendThirdQuartileVastReports(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.m13613a(list.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendUnmuteVastReports(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                k50.m13613a(list.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showActionWebView() {
        this.videoView.m13254a();
        this.current_display = 3;
        this.playerLayout.setVisibility(4);
        this.webView.setVisibility(0);
    }

    private void startShowingBanner() {
        this.webViewStartTime = Long.valueOf(System.currentTimeMillis());
        this.current_display = 2;
        WebView webView = this.webView;
        if (webView != null) {
            webView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void startShowingVideo(boolean z) {
        String videoFilePath;
        this.current_display = 1;
        if (z) {
            try {
                this.videoView.setOnPreparedListener(new C2661j());
                this.videoView.m13256b();
            } catch (Throwable th) {
                g50.m11895a(th);
            }
        }
        initProgress();
        WebView webView = this.webView;
        if (webView != null) {
            webView.setVisibility(8);
        }
        this.videoView.setMuteListener(new C2653b());
        this.ivSound.setOnClickListener(new ViewOnClickListenerC2654c());
        this.ivSkip.setOnClickListener(new ViewOnClickListenerC2655d());
        if (!z && this.videoPathOrURL == null) {
            this.videoView.setOnPreparedListener(new C2656e());
            if (this.f10959ad.getRequestOptions() == null || this.f10959ad.getRequestOptions().getCacheType() != 2) {
                if (this.f10959ad.getRequestOptions() != null && this.f10959ad.getRequestOptions().getCacheType() == 1) {
                    videoFilePath = this.f10959ad.getVideoFilePath();
                }
                this.videoView.setVideoPath(this.videoPathOrURL);
            } else {
                videoFilePath = n60.m14237a(getApplicationContext()).m14253a(((c70) this.f10959ad.getAd().getCreative()).getCtaUrl());
            }
            this.videoPathOrURL = videoFilePath;
            this.videoView.setVideoPath(this.videoPathOrURL);
        }
        this.playerLayout.setVisibility(0);
        this.videoView.setOnCompletionListener(new C2657f());
        this.videoView.setOnErrorListener(new C2658g());
    }

    public int getCurrentDisplay() {
        return this.current_display;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        String str;
        Boolean bool;
        TapsellAd tapsellAd = this.f10959ad;
        if (tapsellAd == null) {
            finishActivity();
            return;
        }
        if (tapsellAd.isVideoAd() && this.isVideoShownOnce) {
            finishActivity();
            return;
        }
        if (!backIsEnabled()) {
            C2785b c2785b = this.videoView;
            if (c2785b == null || !c2785b.isPlaying() || (str = this.backDisabledToastMessage) == null) {
                return;
            }
            Toast.makeText(this, str, 0).show();
            return;
        }
        if (!this.f10959ad.isBannerAd()) {
            if (this.f10959ad.isRewardedAd() && (bool = this.showDialog) != null && bool.booleanValue()) {
                C2785b c2785b2 = this.videoView;
                if (c2785b2 != null && c2785b2.isPlaying()) {
                    try {
                        this.videoView.pause();
                        DialogInterfaceOnClickListenerC2667p dialogInterfaceOnClickListenerC2667p = new DialogInterfaceOnClickListenerC2667p();
                        DialogC2689h dialogC2689h = new DialogC2689h(this, this.backDialogMessage, this.backDialogMessageTextColor, this.backDialogPositiveButtonText, -1, this.backDialogPositiveButtonBackgroundResId, this.backDialogNegativeButtonText, -1, this.backDialogNegativeButtonBackgroundResId, dialogInterfaceOnClickListenerC2667p, this.backDialogTypefacePath != null ? FontManager.getCustomFont(this, this.backDialogTypefacePath) : null, this.backDialogButtonBackgroundResId);
                        dialogC2689h.setOnCancelListener(new DialogInterfaceOnCancelListenerC2668q(this, dialogInterfaceOnClickListenerC2667p, dialogC2689h));
                        dialogC2689h.show();
                        return;
                    } catch (Throwable th) {
                        g50.m11895a(th);
                        if (!actionIsWebView()) {
                            return;
                        }
                    }
                }
            } else {
                if (!actionIsWebView()) {
                    return;
                }
                if ((this.f10959ad.isRewardedAd() || this.f10959ad.isVideoAd()) && this.webView.getVisibility() == 0) {
                    finishActivity();
                }
            }
            showActionWebView();
            return;
        }
        finishActivity();
    }

    public void onClose() {
        this.buttonsHandler.post(new RunnableC2666o());
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0034, code lost:
    
        if (r2 != null) goto L11;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r2) {
        /*
            r1 = this;
            r0 = 16973834(0x103000a, float:2.4060928E-38)
            r1.setTheme(r0)
            super.onCreate(r2)
            java.lang.String r0 = "android.permission.VIBRATE"
            int r0 = r1.checkCallingOrSelfPermission(r0)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "vibrator"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.os.Vibrator r0 = (android.os.Vibrator) r0
            r1.vibrator = r0
        L1b:
            android.content.Intent r0 = r1.getIntent()
            if (r0 == 0) goto L34
            android.content.Intent r0 = r1.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L34
            android.content.Intent r2 = r1.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            goto L36
        L34:
            if (r2 == 0) goto L39
        L36:
            r1.loadVariablesFromBundle(r2)
        L39:
            r1.initializeScreenOrientation()
            r1.initImmersiveMode()
            r1.initializeView()
            r1.configureSettingWebView()
            r1.initHandlers()
            ir.tapsell.sdk.TapsellAd r2 = r1.f10959ad
            if (r2 == 0) goto L79
            boolean r2 = r2.isVideoAd()
            if (r2 == 0) goto L6e
            boolean r2 = r1.isVideoShownOnce
            if (r2 == 0) goto L69
            boolean r2 = r1.actionIsWebView()
            if (r2 == 0) goto L60
            r1.showActionWebView()
            goto L79
        L60:
            java.lang.String r2 = "Operation not supported in this version"
            p000.i50.m12368a(r2)
            r1.finishActivity()
            goto L79
        L69:
            r2 = 0
            r1.startShowingVideo(r2)
            goto L79
        L6e:
            ir.tapsell.sdk.TapsellAd r2 = r1.f10959ad
            boolean r2 = r2.isBannerAd()
            if (r2 == 0) goto L79
            r1.startShowingBanner()
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.tapsell.sdk.TapsellAdActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Handler handler = this.progressHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.progressHandler = null;
        }
        this.buttonsHandler.removeCallbacksAndMessages(null);
        WebViewDefaultInterface webViewDefaultInterface = this.webViewJSInterface;
        if (webViewDefaultInterface != null) {
            webViewDefaultInterface.stopSoundPlayback();
        }
        if (this.webViewClient != null) {
            this.webViewClient = null;
        }
    }

    public void onDismiss() {
        this.buttonsHandler.post(new RunnableC2669r());
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C2785b c2785b;
        if (i == 24 && (c2785b = this.videoView) != null && c2785b.m13261d()) {
            this.videoView.m13263f();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        C2785b c2785b = this.videoView;
        if (c2785b == null || !c2785b.isPlaying()) {
            return;
        }
        this.videoPausedPosition = this.videoView.getCurrentPosition();
        this.videoView.pause();
        this.isVideoPaused = true;
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            loadVariablesFromBundle(bundle);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        int i;
        super.onResume();
        initImmersiveMode();
        if (this.isVideoPaused) {
            this.isVideoPaused = false;
            C2785b c2785b = this.videoView;
            if (c2785b == null || (i = this.videoPausedPosition) <= 0) {
                return;
            }
            c2785b.m13255a(i, new C2659h());
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            Boolean bool = this.immersiveMode;
            if (bool != null) {
                bundle.putBoolean(IMMERSIVE_MODE, bool.booleanValue());
            }
            Integer num = this.rotationMode;
            if (num != null) {
                bundle.putInt(ROTATION_MODE, num.intValue());
            }
            TapsellAd tapsellAd = this.f10959ad;
            if (tapsellAd != null) {
                bundle.putSerializable(EXTRA_DATA, tapsellAd);
            }
            Boolean bool2 = this.backDisabled;
            if (bool2 != null) {
                bundle.putBoolean(BACK_DISABLED, bool2.booleanValue());
            }
            Integer num2 = this.doneSeconds;
            if (num2 != null) {
                bundle.putInt(DONE_SECONDS, num2.intValue());
            }
            Integer num3 = this.donePercentage;
            if (num3 != null) {
                bundle.putInt(DONE_PERCENTAGE, num3.intValue());
            }
            Integer num4 = this.videoDuration;
            if (num4 != null) {
                bundle.putInt(VIDEO_DURATION, num4.intValue());
            }
            Boolean bool3 = this.showDialog;
            if (bool3 != null) {
                bundle.putBoolean(SHOW_DIALOG, bool3.booleanValue());
            }
            String str = this.videoPathOrURL;
            if (str != null) {
                bundle.putString(VIDEO_URI, str);
            }
            bundle.putBoolean(VIDEO_PAUSED, this.isVideoPaused);
            bundle.putInt(VIDEO_PAUSED_POSITION, this.videoPausedPosition);
            bundle.putInt(CURRENT_DISPLAY, this.current_display);
            bundle.putBoolean(VIDEO_SEEN_COMPLETELY, this.isVideoCompleted);
            bundle.putBoolean(AD_STATE_WAS_UPDATED, this.isStateUpdated);
            bundle.putBoolean(VIDEO_SHOWN_ONCE, this.isVideoShownOnce);
            bundle.putBoolean(RESULT_RETURNED, this.isResultReturned);
            bundle.putBoolean(AD_SHOW_FINISHED_CALLED, this.isAdShowFinishedACalled);
            String str2 = this.backDialogMessage;
            if (str2 != null) {
                bundle.putString(BACK_DIAlOG_MESSAGE, str2);
            }
            String str3 = this.backDialogPositiveButtonText;
            if (str3 != null) {
                bundle.putString(BACK_DIAlOG_BTN_POSITIVE_TEXT, str3);
            }
            String str4 = this.backDialogNegativeButtonText;
            if (str4 != null) {
                bundle.putString(BACK_DIAlOG_BTN_NEGATIVE_TEXT, str4);
            }
            String str5 = this.backDialogTypefacePath;
            if (str5 != null) {
                bundle.putString(BACK_DIAlOG_TYPEFACE_PATH, str5);
            }
            Integer num5 = this.backDialogPositiveButtonBackgroundResId;
            if (num5 != null) {
                bundle.putInt(BACK_DIAlOG_BTN_POSITIVE_BACKGROUND_RES_ID, num5.intValue());
            }
            Integer num6 = this.backDialogNegativeButtonBackgroundResId;
            if (num6 != null) {
                bundle.putInt(BACK_DIAlOG_BTN_NEGATIVE_BACKGROUND_RES_ID, num6.intValue());
            }
            Integer num7 = this.backDialogPositiveButtonTextColor;
            if (num7 != null) {
                bundle.putInt(BACK_DIAlOG_BTN_POSITIVE_TEXT_COLOR, num7.intValue());
            }
            Integer num8 = this.backDialogNegativeButtonTextColor;
            if (num8 != null) {
                bundle.putInt(BACK_DIAlOG_BTN_NEGATIVE_TEXT_COLOR, num8.intValue());
            }
            String str6 = this.backDisabledToastMessage;
            if (str6 != null) {
                bundle.putString(BACK_DISABLED_TOAST_MESSAGE, str6);
            }
            Integer num9 = this.backDialogButtonBackgroundResId;
            if (num9 != null) {
                bundle.putInt(BACK_DIAlOG_BACKGROUND_RES_ID, num9.intValue());
            }
            Integer num10 = this.backDialogMessageTextColor;
            if (num10 != null) {
                bundle.putInt(BACK_DIAlOG_MESSAGE_TEXT_COLOR, num10.intValue());
            }
            Long l = this.webViewStartTime;
            if (l != null) {
                bundle.putLong(WEBVIEW_START_TIME, l.longValue());
            }
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.defaultHandler;
        if (uncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
            this.defaultHandler = null;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            initImmersiveMode();
        }
    }

    public void replayVideo() {
        this.buttonsHandler.post(new RunnableC2665n());
    }

    public void reportClick() {
        if (this.f10959ad.getAd() != null) {
            this.f10959ad.getAd().reportAdIsClick(this.f10959ad.getZoneId(), this.f10959ad.getAd().getSuggestionId().toString());
        }
    }

    public void startIntent(String str, String str2, String str3, String str4, String str5) {
        this.buttonsHandler.post(new RunnableC2652a(str, str2, str5, str3, str4));
    }
}
