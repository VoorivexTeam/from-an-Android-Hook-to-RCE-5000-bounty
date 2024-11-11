package ir.tapsell.sdk.bannerads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import ir.metrix.sdk.Metrix;
import ir.tapsell.sdk.NoProguard;
import java.util.Arrays;
import java.util.HashMap;
import p000.s40;
import p000.z40;

/* loaded from: classes.dex */
public class TapsellBannerWebView extends WebView implements NoProguard {
    private static final Integer[] valid_banner_sizes = {Integer.valueOf(TapsellBannerType.BANNER_320x50.getValue()), Integer.valueOf(TapsellBannerType.BANNER_320x100.getValue()), Integer.valueOf(TapsellBannerType.BANNER_250x250.getValue()), Integer.valueOf(TapsellBannerType.BANNER_300x250.getValue())};
    private boolean adMadeHidden;
    private boolean adWasFilled;
    TapsellBannerType mBannerType;
    private final Handler mHandler;
    String mZoneId;
    private TapsellBannerViewEventListener onEventListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.bannerads.TapsellBannerWebView$a */
    /* loaded from: classes.dex */
    public class ViewOnTouchListenerC2674a implements View.OnTouchListener {
        ViewOnTouchListenerC2674a(TapsellBannerWebView tapsellBannerWebView) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return motionEvent.getAction() == 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.bannerads.TapsellBannerWebView$b */
    /* loaded from: classes.dex */
    public class ViewOnLongClickListenerC2675b implements View.OnLongClickListener {
        ViewOnLongClickListenerC2675b(TapsellBannerWebView tapsellBannerWebView) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return true;
        }
    }

    /* renamed from: ir.tapsell.sdk.bannerads.TapsellBannerWebView$c */
    /* loaded from: classes.dex */
    class RunnableC2676c implements Runnable {
        RunnableC2676c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TapsellBannerWebView.this.adWasFilled) {
                TapsellBannerWebView.this.adMadeHidden = true;
                TapsellBannerWebView.this.setVisibility(8);
                TapsellBannerWebView.this.invalidate();
                if (TapsellBannerWebView.this.onEventListener != null) {
                    TapsellBannerWebView.this.onEventListener.onHideBannerView();
                }
            }
        }
    }

    /* renamed from: ir.tapsell.sdk.bannerads.TapsellBannerWebView$d */
    /* loaded from: classes.dex */
    class RunnableC2677d implements Runnable {
        RunnableC2677d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TapsellBannerWebView.this.adWasFilled) {
                TapsellBannerWebView.this.adMadeHidden = false;
                TapsellBannerWebView.this.setVisibility(0);
                TapsellBannerWebView.this.invalidate();
            }
        }
    }

    /* renamed from: ir.tapsell.sdk.bannerads.TapsellBannerWebView$e */
    /* loaded from: classes.dex */
    class RunnableC2678e implements Runnable {
        RunnableC2678e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TapsellBannerWebView.this.setVisibility(8);
            TapsellBannerWebView.this.invalidate();
            if (TapsellBannerWebView.this.onEventListener != null) {
                TapsellBannerWebView.this.onEventListener.onNoAdAvailable();
            }
        }
    }

    /* renamed from: ir.tapsell.sdk.bannerads.TapsellBannerWebView$f */
    /* loaded from: classes.dex */
    class RunnableC2679f implements Runnable {
        RunnableC2679f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TapsellBannerWebView.this.setVisibility(8);
            TapsellBannerWebView.this.invalidate();
            if (TapsellBannerWebView.this.onEventListener != null) {
                TapsellBannerWebView.this.onEventListener.onNoNetwork();
            }
        }
    }

    /* renamed from: ir.tapsell.sdk.bannerads.TapsellBannerWebView$g */
    /* loaded from: classes.dex */
    class RunnableC2680g implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f10996b;

        RunnableC2680g(String str) {
            this.f10996b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TapsellBannerWebView.this.setVisibility(8);
            TapsellBannerWebView.this.invalidate();
            if (TapsellBannerWebView.this.onEventListener != null) {
                TapsellBannerWebView.this.onEventListener.onError(this.f10996b);
            }
        }
    }

    /* renamed from: ir.tapsell.sdk.bannerads.TapsellBannerWebView$h */
    /* loaded from: classes.dex */
    class RunnableC2681h implements Runnable {
        RunnableC2681h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TapsellBannerWebView.this.adMadeHidden) {
                return;
            }
            TapsellBannerWebView.this.setVisibility(0);
            TapsellBannerWebView.this.invalidate();
            if (TapsellBannerWebView.this.onEventListener != null) {
                TapsellBannerWebView.this.onEventListener.onRequestFilled();
            }
        }
    }

    public TapsellBannerWebView(Context context, int i, String str) {
        super(context);
        this.adMadeHidden = false;
        this.adWasFilled = false;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mBannerType = TapsellBannerType.fromValue(i);
        this.mZoneId = str;
        initialize(context);
    }

    public TapsellBannerWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.adMadeHidden = false;
        this.adWasFilled = false;
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    public TapsellBannerWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.adMadeHidden = false;
        this.adWasFilled = false;
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    public TapsellBannerWebView(Context context, TapsellBannerType tapsellBannerType, String str) {
        super(context);
        this.adMadeHidden = false;
        this.adWasFilled = false;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mBannerType = tapsellBannerType;
        this.mZoneId = str;
        initialize(context);
    }

    public TapsellBannerWebView(Context context, TapsellBannerType tapsellBannerType, String str, TapsellBannerViewEventListener tapsellBannerViewEventListener) {
        super(context);
        this.adMadeHidden = false;
        this.adWasFilled = false;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.onEventListener = tapsellBannerViewEventListener;
        this.mBannerType = tapsellBannerType;
        this.mZoneId = str;
        initialize(context);
    }

    private void disableScrolling() {
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setOnTouchListener(new ViewOnTouchListenerC2674a(this));
        setOnLongClickListener(new ViewOnLongClickListenerC2675b(this));
        setLongClickable(false);
    }

    private void loadAd(Context context) {
        disableScrolling();
        C2682a.m12872a(context, this, this.mZoneId, this.mBannerType.getValue());
    }

    private void validate() {
        if (this.mBannerType == null) {
            throw new RuntimeException("No BannerType Provided for TapsellBannerView");
        }
        if ("".equalsIgnoreCase(this.mZoneId)) {
            throw new RuntimeException("No ZoneId Provided for TapsellBannerView");
        }
        if (!Arrays.asList(valid_banner_sizes).contains(Integer.valueOf(this.mBannerType.getValue()))) {
            throw new RuntimeException("Invalid BannerType Provided for TapsellBannerView");
        }
    }

    public TapsellBannerType getBannerType() {
        return this.mBannerType;
    }

    public String getZoneId() {
        return this.mZoneId;
    }

    public void hideBannerView() {
        this.mHandler.post(new RunnableC2676c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void initialize(Context context) {
        setBackgroundColor(0);
        setVisibility(4);
        HashMap hashMap = new HashMap();
        hashMap.put("METRIX_DATA_ZONE_ID", getZoneId());
        hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.m16734K().m16757n().getUserId());
        Metrix.getInstance().newEvent("mxzqz", hashMap, null);
        if (s40.m15356c()) {
            return;
        }
        validate();
        loadAd(context);
    }

    public void loadAd(Context context, String str, TapsellBannerType tapsellBannerType) {
        this.mZoneId = str;
        this.mBannerType = tapsellBannerType;
        measure(0, 0);
        C2682a.m12872a(context, this, str, tapsellBannerType.getValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onError(String str) {
        this.mHandler.post(new RunnableC2680g(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onNoAdAvailable() {
        this.mHandler.post(new RunnableC2678e());
    }

    void onNoNetwork() {
        this.mHandler.post(new RunnableC2679f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onRequestFilled() {
        this.adWasFilled = true;
        this.mHandler.post(new RunnableC2681h());
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setEventListener(TapsellBannerViewEventListener tapsellBannerViewEventListener) {
        this.onEventListener = tapsellBannerViewEventListener;
    }

    public void showBannerView() {
        this.mHandler.post(new RunnableC2677d());
    }
}
