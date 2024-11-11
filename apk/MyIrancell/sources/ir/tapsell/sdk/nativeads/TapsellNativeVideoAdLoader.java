package ir.tapsell.sdk.nativeads;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ir.metrix.sdk.Metrix;
import ir.tapsell.sdk.NoProguard;
import ir.tapsell.sdk.R$id;
import ir.tapsell.sdk.networkcacheutils.ImageLoader;
import java.util.HashMap;
import p000.e70;
import p000.i50;
import p000.z40;

/* loaded from: classes.dex */
public class TapsellNativeVideoAdLoader implements NoProguard {
    private static final String TAG = "TapsellNativeVideoAdLoader";
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private final int appInstallationViewTemplate;
    private final int contentViewTemplate;
    private final Context context;
    private final TapsellNativeVideoIconSet iconSet;
    private final ImageLoader imageLoader;
    private final LayoutInflater inflater;
    private final TapsellNativeVideoAd videoAd;
    private final C2713b viewIds;

    /* loaded from: classes.dex */
    public static class Builder implements NoProguard {
        private int appInstallationViewTemplate;
        private TapsellNativeVideoAdConfig config;
        private int contentViewTemplate;
        private TapsellNativeVideoIconSet iconSet;
        private int titleId = R$id.tapsell_nativead_title;
        private int descriptionId = R$id.tapsell_nativead_description;
        private int videoId = R$id.tapsell_nativead_video;
        private int logoId = R$id.tapsell_nativead_logo;
        private int ctaId = R$id.tapsell_nativead_cta;
        private int sponsoredId = R$id.tapsell_nativead_sponsored;
        private int ratingId = R$id.tapsell_nativead_rating;
        private int clickableId = 0;
        private boolean autoStartVideo = true;
        private boolean fullscreenBtnEnabled = true;
        private boolean muteVideoBtnEnabled = true;
        private boolean muteVideo = false;

        /* JADX INFO: Access modifiers changed from: private */
        public void fillAd(Context context, C2721g c2721g, TapsellNativeVideoAdLoadListener tapsellNativeVideoAdLoadListener) {
            create(context, c2721g).loadAd(tapsellNativeVideoAdLoadListener);
        }

        public TapsellNativeVideoAdLoader create(Context context, C2721g c2721g) {
            C2713b c2713b = new C2713b();
            c2713b.f11112d = this.logoId;
            c2713b.f11111c = this.videoId;
            c2713b.f11109a = this.titleId;
            c2713b.f11110b = this.descriptionId;
            c2713b.f11113e = this.ctaId;
            c2713b.f11115g = this.sponsoredId;
            c2713b.f11114f = this.ratingId;
            c2713b.f11116h = this.clickableId;
            if (this.config == null) {
                TapsellNativeVideoAdConfig tapsellNativeVideoAdConfig = new TapsellNativeVideoAdConfig();
                this.config = tapsellNativeVideoAdConfig;
                tapsellNativeVideoAdConfig.setAutoStartVideo(this.autoStartVideo);
                this.config.setFullscreenBtnEnabled(this.fullscreenBtnEnabled);
                this.config.setMuteVideoBtnEnabled(this.muteVideoBtnEnabled);
                this.config.setMuteVideo(this.muteVideo);
            }
            c2721g.m13072d(this.config.isAutoStartVideo());
            c2721g.m13067a(this.config.isFullscreenBtnEnabled());
            c2721g.m13074e(this.config.isMuteVideoBtnEnabled());
            c2721g.m13078g(this.config.isMuteVideo());
            return new TapsellNativeVideoAdLoader(context, c2721g, this.contentViewTemplate, this.appInstallationViewTemplate, c2713b, this.iconSet);
        }

        @Deprecated
        public void loadAd(Context context, String str, ViewGroup viewGroup, TapsellNativeVideoAdLoadListener tapsellNativeVideoAdLoadListener) {
            loadAd(context, str, tapsellNativeVideoAdLoadListener);
        }

        public void loadAd(final Context context, final String str, final TapsellNativeVideoAdLoadListener tapsellNativeVideoAdLoadListener) {
            if (this.config == null) {
                TapsellNativeVideoAdConfig tapsellNativeVideoAdConfig = new TapsellNativeVideoAdConfig();
                this.config = tapsellNativeVideoAdConfig;
                tapsellNativeVideoAdConfig.setAutoStartVideo(this.autoStartVideo);
                this.config.setFullscreenBtnEnabled(this.fullscreenBtnEnabled);
                this.config.setMuteVideoBtnEnabled(this.muteVideoBtnEnabled);
                this.config.setMuteVideo(this.muteVideo);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("METRIX_DATA_ZONE_ID", str);
            hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.m16734K().m16757n().getUserId());
            Metrix.getInstance().newEvent("mxzqz", hashMap, null);
            TapsellNativeManager.getNativeVideoAd(context, str, new TapsellNativeVideoAdRequestListener() { // from class: ir.tapsell.sdk.nativeads.TapsellNativeVideoAdLoader.Builder.1
                @Override // ir.tapsell.sdk.nativeads.TapsellNativeVideoAdRequestListener
                public void onAdAvailable(e70 e70Var) {
                    C2721g c2721g = new C2721g();
                    c2721g.m13064a(e70Var);
                    c2721g.m13066a(str);
                    Builder.this.fillAd(context, c2721g, tapsellNativeVideoAdLoadListener);
                }

                @Override // ir.tapsell.sdk.nativeads.TapsellNativeVideoAdRequestListener
                public void onError(String str2) {
                    tapsellNativeVideoAdLoadListener.onError(str2);
                }

                @Override // ir.tapsell.sdk.nativeads.TapsellNativeVideoAdRequestListener
                public void onNoAdAvailable() {
                    tapsellNativeVideoAdLoadListener.onNoAdAvailable();
                }

                @Override // ir.tapsell.sdk.nativeads.TapsellNativeVideoAdRequestListener
                public void onNoNetwork() {
                    i50.m12368a("onNoNetwork");
                    tapsellNativeVideoAdLoadListener.onNoNetwork();
                }
            });
        }

        public Builder setAppInstallationViewTemplate(int i) {
            this.appInstallationViewTemplate = i;
            return this;
        }

        public Builder setAutoStartVideoOnScreenEnabled(boolean z) {
            this.autoStartVideo = z;
            return this;
        }

        public Builder setCTAButtonId(int i) {
            this.ctaId = i;
            return this;
        }

        public Builder setClickableViewId(int i) {
            this.clickableId = i;
            return this;
        }

        public Builder setContentViewTemplate(int i) {
            this.contentViewTemplate = i;
            return this;
        }

        public Builder setDescriptionId(int i) {
            this.descriptionId = i;
            return this;
        }

        public Builder setFullscreenBtnEnabled(boolean z) {
            this.fullscreenBtnEnabled = z;
            return this;
        }

        public Builder setIconSet(TapsellNativeVideoIconSet tapsellNativeVideoIconSet) {
            this.iconSet = tapsellNativeVideoIconSet;
            return this;
        }

        public Builder setLogoId(Integer num) {
            this.logoId = num.intValue();
            return this;
        }

        public Builder setMuteVideo(boolean z) {
            this.muteVideo = z;
            return this;
        }

        public Builder setMuteVideoBtnEnabled(boolean z) {
            this.muteVideoBtnEnabled = z;
            return this;
        }

        public Builder setNativeVideoAdConfig(TapsellNativeVideoAdConfig tapsellNativeVideoAdConfig) {
            this.config = tapsellNativeVideoAdConfig;
            return this;
        }

        public Builder setRatingId(int i) {
            this.ratingId = i;
            return this;
        }

        public Builder setSponsoredId(int i) {
            this.sponsoredId = i;
            return this;
        }

        public Builder setTitleId(int i) {
            this.titleId = i;
            return this;
        }

        public Builder setVideoId(int i) {
            this.videoId = i;
            return this;
        }

        public Builder setVideoViewConfig(TapsellNativeVideoAdConfig tapsellNativeVideoAdConfig) {
            this.config = tapsellNativeVideoAdConfig;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeVideoAdLoader$a */
    /* loaded from: classes.dex */
    public class RunnableC2712a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ TapsellNativeVideoAdLoadListener f11107b;

        RunnableC2712a(TapsellNativeVideoAdLoadListener tapsellNativeVideoAdLoadListener) {
            this.f11107b = tapsellNativeVideoAdLoadListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            TapsellNativeVideoAdLoader.this.videoAd.createView(TapsellNativeVideoAdLoader.this.inflater, TapsellNativeVideoAdLoader.this.contentViewTemplate, TapsellNativeVideoAdLoader.this.appInstallationViewTemplate, TapsellNativeVideoAdLoader.this.imageLoader);
            TapsellNativeVideoAdLoadListener tapsellNativeVideoAdLoadListener = this.f11107b;
            if (tapsellNativeVideoAdLoadListener != null) {
                tapsellNativeVideoAdLoadListener.onRequestFilled(TapsellNativeVideoAdLoader.this.videoAd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeVideoAdLoader$b */
    /* loaded from: classes.dex */
    public static class C2713b {

        /* renamed from: a */
        int f11109a;

        /* renamed from: b */
        int f11110b;

        /* renamed from: c */
        int f11111c;

        /* renamed from: d */
        int f11112d;

        /* renamed from: e */
        int f11113e;

        /* renamed from: f */
        int f11114f;

        /* renamed from: g */
        int f11115g;

        /* renamed from: h */
        int f11116h;

        C2713b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static C2713b m12947a(Bundle bundle) {
            C2713b c2713b = new C2713b();
            c2713b.f11109a = bundle.getInt("titleId", 0);
            c2713b.f11110b = bundle.getInt("descriptionId", 0);
            c2713b.f11111c = bundle.getInt("bannerId", 0);
            c2713b.f11112d = bundle.getInt("logoId", 0);
            c2713b.f11113e = bundle.getInt("ctaButtonId", 0);
            c2713b.f11114f = bundle.getInt("rateBarId", 0);
            c2713b.f11115g = bundle.getInt("sponsoredId", 0);
            c2713b.f11116h = bundle.getInt("clickableId", 0);
            return c2713b;
        }

        /* renamed from: a */
        public Bundle m12948a() {
            Bundle bundle = new Bundle();
            bundle.putInt("titleId", this.f11109a);
            bundle.putInt("descriptionId", this.f11110b);
            bundle.putInt("videoId", this.f11111c);
            bundle.putInt("logoId", this.f11112d);
            bundle.putInt("ctaId", this.f11113e);
            bundle.putInt("ratingId", this.f11114f);
            bundle.putInt("sponsoredId", this.f11115g);
            bundle.putInt("clickableId", this.f11116h);
            return bundle;
        }
    }

    public TapsellNativeVideoAdLoader(Context context, C2721g c2721g, int i, int i2, C2713b c2713b, TapsellNativeVideoIconSet tapsellNativeVideoIconSet) {
        if (c2713b == null) {
            throw new IllegalArgumentException("Null ids passed for native video ad.");
        }
        if (c2713b.f11109a == 0) {
            throw new IllegalArgumentException("Invalid id was passed for title in native video ad.");
        }
        if (c2713b.f11115g == 0) {
            throw new IllegalArgumentException("Invalid id was passed for sponsored label in native video ad.");
        }
        this.iconSet = tapsellNativeVideoIconSet;
        this.videoAd = new TapsellNativeVideoAd(context, c2721g, c2713b, tapsellNativeVideoIconSet);
        this.context = context;
        this.viewIds = c2713b;
        this.imageLoader = new ImageLoader(context);
        this.inflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.contentViewTemplate = i;
        this.appInstallationViewTemplate = i2;
    }

    public void loadAd(TapsellNativeVideoAdLoadListener tapsellNativeVideoAdLoadListener) {
        TapsellNativeVideoAd tapsellNativeVideoAd = this.videoAd;
        if (tapsellNativeVideoAd != null && tapsellNativeVideoAd.getAdWrapper() != null && this.videoAd.getAdWrapper().getAdSuggestion() != null && !this.videoAd.getAdWrapper().isFilledStateReported()) {
            this.videoAd.getAdWrapper().setFilledStateReported(true);
            this.videoAd.getAdWrapper().getAdSuggestion().reportAdIsFilled(this.context, this.videoAd.getAdWrapper().m13062a(), this.videoAd.getAdWrapper().getAdSuggestion().getSuggestionId().toString());
        }
        if (this.contentViewTemplate == 0) {
            throw new IllegalArgumentException("Invalid template passed for loading native banner ad.");
        }
        TapsellNativeVideoAd tapsellNativeVideoAd2 = this.videoAd;
        if (tapsellNativeVideoAd2 == null || tapsellNativeVideoAd2.getAdWrapper() == null || this.videoAd.getAdWrapper().getAdSuggestion() == null) {
            throw new IllegalArgumentException("Null ad passed to show as native banner.");
        }
        handler.post(new RunnableC2712a(tapsellNativeVideoAdLoadListener));
    }
}
