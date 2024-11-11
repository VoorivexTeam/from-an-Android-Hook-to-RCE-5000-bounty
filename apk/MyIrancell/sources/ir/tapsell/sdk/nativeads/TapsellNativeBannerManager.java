package ir.tapsell.sdk.nativeads;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ir.metrix.sdk.Metrix;
import ir.tapsell.sdk.AdRequestCallback;
import ir.tapsell.sdk.CacheSize;
import ir.tapsell.sdk.NoProguard;
import ir.tapsell.sdk.R$id;
import ir.tapsell.sdk.models.SdkPlatformEnum;
import ir.tapsell.sdk.models.responseModels.TapsellNativeBannerAdModel;
import ir.tapsell.sdk.models.responseModels.subModels.NativeBannerCreativeModel;
import ir.tapsell.sdk.networkcacheutils.ImageLoader;
import ir.tapsell.sdk.utils.C2771m;
import java.util.HashMap;
import java.util.Iterator;
import p000.e50;
import p000.k50;
import p000.s50;
import p000.z40;

/* loaded from: classes.dex */
public class TapsellNativeBannerManager implements NoProguard {

    /* loaded from: classes.dex */
    public static class Builder implements NoProguard {
        private int appInstallationViewTemplate;
        private int contentViewTemplate;
        private ViewGroup parentView;
        private int titleId = R$id.tapsell_nativead_title;
        private int descriptionId = R$id.tapsell_nativead_description;
        private int bannerId = R$id.tapsell_nativead_banner;
        private int logoId = R$id.tapsell_nativead_logo;
        private int ctaButtonId = R$id.tapsell_nativead_cta;
        private int sponsoredId = R$id.tapsell_nativead_sponsored;
        private int rateBarId = R$id.tapsell_nativead_rating;
        private int clickableId = R$id.tapsell_nativead_cta_view;

        private C2701a makeIds() {
            C2701a c2701a = new C2701a();
            c2701a.f11091d = this.logoId;
            c2701a.f11090c = this.bannerId;
            c2701a.f11088a = this.titleId;
            c2701a.f11089b = this.descriptionId;
            c2701a.f11092e = this.ctaButtonId;
            c2701a.f11094g = this.sponsoredId;
            c2701a.f11093f = this.rateBarId;
            c2701a.f11095h = this.clickableId;
            return c2701a;
        }

        public C2715a inflateTemplate(Context context) {
            C2715a c2715a = new C2715a(context, new ImageLoader(context));
            c2715a.m12977a(LayoutInflater.from(context), this.parentView, this.contentViewTemplate, this.appInstallationViewTemplate, makeIds());
            return c2715a;
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

        public Builder setParentView(ViewGroup viewGroup) {
            this.parentView = viewGroup;
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
    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeBannerManager$a */
    /* loaded from: classes.dex */
    public static class C2701a {

        /* renamed from: a */
        int f11088a;

        /* renamed from: b */
        int f11089b;

        /* renamed from: c */
        int f11090c;

        /* renamed from: d */
        int f11091d;

        /* renamed from: e */
        int f11092e;

        /* renamed from: f */
        int f11093f;

        /* renamed from: g */
        int f11094g;

        /* renamed from: h */
        int f11095h;

        C2701a() {
        }
    }

    public static void bindAd(Context context, C2715a c2715a, String str, String str2) {
        c2715a.m12978a(s50.m15359a(context).m15362a(str, str2), str, false);
    }

    public static void bindAd(Context context, C2715a c2715a, String str, String str2, boolean z) {
        c2715a.m12978a(s50.m15359a(context).m15362a(str, str2), str, z);
    }

    public static void click(Context context, String str, String str2) {
        clickReport(context, str, str2);
        openAd(context, str, str2);
        done(context, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void clickReport(Context context, String str, String str2) {
        TapsellNativeBannerAdModel m15362a = s50.m15359a(context).m15362a(str, str2);
        if (m15362a.isClickedReported()) {
            return;
        }
        m15362a.setClickedReported(true);
        HashMap hashMap = new HashMap();
        hashMap.put("METRIX_DATA_ZONE_ID", str);
        hashMap.put("METRIX_DATA_SUGGESTION_ID", m15362a.getAdSuggestion().getSuggestionId().toString());
        hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.m16734K().m16757n().getUserId());
        Metrix.getInstance().newEvent("wzkkm", hashMap, null);
        if (m15362a.getAdSuggestion().getCreative() == 0 || ((NativeBannerCreativeModel) m15362a.getAdSuggestion().getCreative()).getThirdPartyTrackingUrls() == null) {
            return;
        }
        Iterator<String> it = ((NativeBannerCreativeModel) m15362a.getAdSuggestion().getCreative()).getThirdPartyTrackingUrls().iterator();
        while (it.hasNext()) {
            k50.m13618b(it.next());
        }
    }

    public static void createCache(Context context, String str, CacheSize cacheSize) {
        s50.m15359a(context).m15365a(str, cacheSize);
    }

    private static void doing(Context context, String str, String str2) {
        TapsellNativeBannerAdModel m15362a = s50.m15359a(context).m15362a(str, str2);
        if (m15362a == null || m15362a.isDoingStateReported() || m15362a.isDoneStateReported()) {
            return;
        }
        m15362a.setDoingStateReported(true);
        if (m15362a.getAdSuggestion() != null) {
            m15362a.getAdSuggestion().reportAdIsDoing(context, str, m15362a.getAdSuggestion().getSuggestionId().toString());
        }
    }

    private static void done(Context context, String str, String str2) {
        TapsellNativeBannerAdModel m15362a = s50.m15359a(context).m15362a(str, str2);
        if (m15362a.isDoneStateReported()) {
            return;
        }
        m15362a.setDoneStateReported(true);
        m15362a.getAdSuggestion().reportAdIsDone(context, str, m15362a.getAdSuggestion().getSuggestionId().toString(), null);
    }

    public static void getAd(Context context, String str, AdRequestCallback adRequestCallback) {
        s50.m15359a(context).m15364a(str, adRequestCallback);
    }

    public static void getAd(Context context, String str, SdkPlatformEnum sdkPlatformEnum, AdRequestCallback adRequestCallback) {
        e50.m11543a(sdkPlatformEnum);
        s50.m15359a(context).m15364a(str, adRequestCallback);
    }

    public static void getAllAds(Context context, String str, AdRequestCallback adRequestCallback) {
        s50.m15359a(context).m15367b(str, adRequestCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static TapsellNativeBanner getNativeBannerObject(Context context, String str, String str2) {
        TapsellNativeBannerAdModel m15362a = s50.m15359a(context).m15362a(str, str2);
        doing(context, str, str2);
        return new TapsellNativeBanner(m15362a.getAdSuggestion().getSuggestionId().toString(), m15362a.getAdSuggestion().getTitle(), m15362a.getAdSuggestion().getDescription(), m15362a.getAdSuggestion().getIconUrl(), ((NativeBannerCreativeModel) m15362a.getAdSuggestion().getCreative()).getCallToActionText(), ((NativeBannerCreativeModel) m15362a.getAdSuggestion().getCreative()).getPortraitStaticImageUrl(), ((NativeBannerCreativeModel) m15362a.getAdSuggestion().getCreative()).getLandscapeStaticImageUrl());
    }

    public static void onRestoreInstanceState(Context context, String str, Bundle bundle) {
        s50.m15359a(context).m15366b(str, bundle);
    }

    public static void onSaveInstanceState(Context context, String str, Bundle bundle) {
        s50.m15359a(context).m15363a(str, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void openAd(Context context, String str, String str2) {
        C2771m.m13178a(context, ((NativeBannerCreativeModel) s50.m15359a(context).m15362a(str, str2).getAdSuggestion().getCreative()).getCallToActionUrl());
    }
}
