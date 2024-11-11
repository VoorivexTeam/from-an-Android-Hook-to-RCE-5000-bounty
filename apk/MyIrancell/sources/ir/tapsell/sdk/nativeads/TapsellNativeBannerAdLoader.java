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
import ir.tapsell.sdk.models.responseModels.TapsellNativeBannerAdModel;
import ir.tapsell.sdk.networkcacheutils.ImageLoader;
import java.util.HashMap;
import p000.d70;
import p000.z40;

@Deprecated
/* loaded from: classes.dex */
public class TapsellNativeBannerAdLoader implements NoProguard {
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private final int appInstallationViewTemplate;
    private final TapsellNativeBannerAd bannerAd;
    private final int contentViewTemplate;
    private final Context context;
    private final ImageLoader imageLoader;
    private final LayoutInflater inflater;
    private final C2700b viewIds;

    /* loaded from: classes.dex */
    public static class Builder implements NoProguard {
        private int appInstallationViewTemplate;
        private int contentViewTemplate;
        private int titleId = R$id.tapsell_nativead_title;
        private int descriptionId = R$id.tapsell_nativead_description;
        private int bannerId = R$id.tapsell_nativead_banner;
        private int logoId = R$id.tapsell_nativead_logo;
        private int ctaButtonId = R$id.tapsell_nativead_cta;
        private int sponsoredId = R$id.tapsell_nativead_sponsored;
        private int rateBarId = R$id.tapsell_nativead_rating;
        private int clickableId = 0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeBannerAdLoader$Builder$a */
        /* loaded from: classes.dex */
        public class C2698a implements InterfaceC2719e {

            /* renamed from: a */
            final /* synthetic */ TapsellNativeBannerAdLoadListener f11074a;

            /* renamed from: b */
            final /* synthetic */ String f11075b;

            /* renamed from: c */
            final /* synthetic */ Context f11076c;

            C2698a(TapsellNativeBannerAdLoadListener tapsellNativeBannerAdLoadListener, String str, Context context) {
                this.f11074a = tapsellNativeBannerAdLoadListener;
                this.f11075b = str;
                this.f11076c = context;
            }

            @Override // ir.tapsell.sdk.nativeads.InterfaceC2719e
            /* renamed from: a */
            public void mo12938a() {
                this.f11074a.onNoAdAvailable();
            }

            @Override // ir.tapsell.sdk.nativeads.InterfaceC2719e
            /* renamed from: a */
            public void mo12939a(d70 d70Var) {
                TapsellNativeBannerAdModel tapsellNativeBannerAdModel = new TapsellNativeBannerAdModel();
                tapsellNativeBannerAdModel.setAdSuggestion(d70Var);
                tapsellNativeBannerAdModel.setZoneId(this.f11075b);
                Builder.this.fillAd(this.f11076c, tapsellNativeBannerAdModel, this.f11074a);
            }

            @Override // ir.tapsell.sdk.nativeads.InterfaceC2719e
            /* renamed from: a */
            public void mo12940a(String str) {
                this.f11074a.onError(str);
            }
        }

        private TapsellNativeBannerAdLoader create(Context context, TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
            C2700b c2700b = new C2700b();
            c2700b.f11083d = this.logoId;
            c2700b.f11082c = this.bannerId;
            c2700b.f11080a = this.titleId;
            c2700b.f11081b = this.descriptionId;
            c2700b.f11084e = this.ctaButtonId;
            c2700b.f11086g = this.sponsoredId;
            c2700b.f11085f = this.rateBarId;
            c2700b.f11087h = this.clickableId;
            return new TapsellNativeBannerAdLoader(context, tapsellNativeBannerAdModel, this.contentViewTemplate, this.appInstallationViewTemplate, c2700b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillAd(Context context, TapsellNativeBannerAdModel tapsellNativeBannerAdModel, TapsellNativeBannerAdLoadListener tapsellNativeBannerAdLoadListener) {
            create(context, tapsellNativeBannerAdModel).loadAd(tapsellNativeBannerAdLoadListener);
        }

        public TapsellNativeBannerAd inflateView(Context context) {
            TapsellNativeBannerAdLoader create = create(context, null);
            create.loadAd(null);
            return create.getBannerAdLoader();
        }

        @Deprecated
        public void loadAd(Context context, String str, ViewGroup viewGroup, TapsellNativeBannerAdLoadListener tapsellNativeBannerAdLoadListener) {
            loadAd(context, str, tapsellNativeBannerAdLoadListener);
        }

        public void loadAd(Context context, String str, TapsellNativeBannerAdLoadListener tapsellNativeBannerAdLoadListener) {
            HashMap hashMap = new HashMap();
            hashMap.put("METRIX_DATA_ZONE_ID", str);
            hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.m16734K().m16757n().getUserId());
            Metrix.getInstance().newEvent("mxzqz", hashMap, null);
            TapsellNativeManager.getNativeBannerAd(context, str, new C2698a(tapsellNativeBannerAdLoadListener, str, context));
        }

        public Builder setAppInstallationViewTemplate(int i) {
            this.appInstallationViewTemplate = i;
            return this;
        }

        public Builder setBannerId(int i) {
            this.bannerId = i;
            return this;
        }

        public Builder setCTAButtonId(int i) {
            this.ctaButtonId = i;
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

        public Builder setLogoId(int i) {
            this.logoId = i;
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
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeBannerAdLoader$a */
    /* loaded from: classes.dex */
    public class RunnableC2699a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ TapsellNativeBannerAdLoadListener f11078b;

        RunnableC2699a(TapsellNativeBannerAdLoadListener tapsellNativeBannerAdLoadListener) {
            this.f11078b = tapsellNativeBannerAdLoadListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            TapsellNativeBannerAdLoader.this.createView(this.f11078b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeBannerAdLoader$b */
    /* loaded from: classes.dex */
    public static class C2700b {

        /* renamed from: a */
        int f11080a;

        /* renamed from: b */
        int f11081b;

        /* renamed from: c */
        int f11082c;

        /* renamed from: d */
        int f11083d;

        /* renamed from: e */
        int f11084e;

        /* renamed from: f */
        int f11085f;

        /* renamed from: g */
        int f11086g;

        /* renamed from: h */
        int f11087h;

        C2700b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static C2700b m12941a(Bundle bundle) {
            C2700b c2700b = new C2700b();
            c2700b.f11080a = bundle.getInt("titleId", 0);
            c2700b.f11081b = bundle.getInt("descriptionId", 0);
            c2700b.f11082c = bundle.getInt("bannerId", 0);
            c2700b.f11083d = bundle.getInt("logoId", 0);
            c2700b.f11084e = bundle.getInt("ctaButtonId", 0);
            c2700b.f11085f = bundle.getInt("rateBarId", 0);
            c2700b.f11086g = bundle.getInt("sponsoredId", 0);
            c2700b.f11087h = bundle.getInt("clickableId", 0);
            return c2700b;
        }

        /* renamed from: a */
        public Bundle m12942a() {
            Bundle bundle = new Bundle();
            bundle.putInt("titleId", this.f11080a);
            bundle.putInt("descriptionId", this.f11081b);
            bundle.putInt("bannerId", this.f11082c);
            bundle.putInt("logoId", this.f11083d);
            bundle.putInt("ctaButtonId", this.f11084e);
            bundle.putInt("rateBarId", this.f11085f);
            bundle.putInt("sponsoredId", this.f11086g);
            bundle.putInt("clickableId", this.f11087h);
            return bundle;
        }
    }

    public TapsellNativeBannerAdLoader(Context context, TapsellNativeBannerAdModel tapsellNativeBannerAdModel, int i, int i2, C2700b c2700b) {
        if (c2700b == null) {
            throw new IllegalArgumentException("Invalid ids was passed native banner ad.");
        }
        if (c2700b.f11080a == 0) {
            throw new IllegalArgumentException("Invalid id was passed for title in native banner ad.");
        }
        if (c2700b.f11086g == 0) {
            throw new IllegalArgumentException("Invalid id was passed for sponsored label in native banner ad.");
        }
        this.bannerAd = new TapsellNativeBannerAd(context, tapsellNativeBannerAdModel, c2700b);
        this.context = context;
        this.viewIds = c2700b;
        this.imageLoader = new ImageLoader(context);
        this.inflater = LayoutInflater.from(context);
        this.contentViewTemplate = i;
        this.appInstallationViewTemplate = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createView(TapsellNativeBannerAdLoadListener tapsellNativeBannerAdLoadListener) {
        this.bannerAd.createView(this.inflater, this.contentViewTemplate, this.appInstallationViewTemplate, this.imageLoader);
        if (tapsellNativeBannerAdLoadListener != null) {
            tapsellNativeBannerAdLoadListener.onRequestFilled(this.bannerAd);
        }
    }

    public TapsellNativeBannerAd getBannerAdLoader() {
        return this.bannerAd;
    }

    public void loadAd(TapsellNativeBannerAdLoadListener tapsellNativeBannerAdLoadListener) {
        TapsellNativeBannerAd tapsellNativeBannerAd = this.bannerAd;
        if (tapsellNativeBannerAd != null && tapsellNativeBannerAd.getAdWrapper() != null && this.bannerAd.getAdWrapper().getAdSuggestion() != null && !this.bannerAd.getAdWrapper().isFilledStateReported()) {
            this.bannerAd.getAdWrapper().setFilledStateReported(true);
            this.bannerAd.getAdWrapper().getAdSuggestion().reportAdIsFilled(this.context, this.bannerAd.getAdWrapper().getZoneId(), this.bannerAd.getAdWrapper().getAdSuggestion().getSuggestionId().toString());
        }
        TapsellNativeBannerAd tapsellNativeBannerAd2 = this.bannerAd;
        if (tapsellNativeBannerAd2 == null) {
            throw new IllegalArgumentException("Null ad passed to show as native banner.");
        }
        if (this.contentViewTemplate == 0) {
            tapsellNativeBannerAdLoadListener.onRequestFilled(tapsellNativeBannerAd2);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            createView(tapsellNativeBannerAdLoadListener);
        } else {
            handler.post(new RunnableC2699a(tapsellNativeBannerAdLoadListener));
        }
    }
}
