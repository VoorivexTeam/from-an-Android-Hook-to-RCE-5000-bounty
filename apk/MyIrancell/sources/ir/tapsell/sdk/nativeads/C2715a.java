package ir.tapsell.sdk.nativeads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import ir.metrix.sdk.Metrix;
import ir.tapsell.sdk.models.responseModels.TapsellNativeBannerAdModel;
import ir.tapsell.sdk.models.responseModels.subModels.NativeBannerCreativeModel;
import ir.tapsell.sdk.nativeads.TapsellNativeBannerManager;
import ir.tapsell.sdk.nativeads.views.RateStarView;
import ir.tapsell.sdk.networkcacheutils.ImageLoader;
import ir.tapsell.sdk.utils.C2769k;
import ir.tapsell.sdk.utils.C2771m;
import java.util.HashMap;
import p000.h50;
import p000.k50;
import p000.z40;

/* renamed from: ir.tapsell.sdk.nativeads.a */
/* loaded from: classes.dex */
public class C2715a {

    /* renamed from: b */
    private TapsellNativeBannerAdModel f11118b;

    /* renamed from: c */
    private Context f11119c;

    /* renamed from: d */
    private ImageLoader f11120d;

    /* renamed from: e */
    private d f11121e;

    /* renamed from: f */
    private d f11122f;

    /* renamed from: g */
    private ViewGroup f11123g;

    /* renamed from: a */
    private Handler f11117a = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private String f11124h = "NativeBannerViewManager";

    /* renamed from: i */
    private final View.OnClickListener f11125i = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.a$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h50.m12135c(true, C2715a.this.f11124h, "ad click");
            C2715a c2715a = C2715a.this;
            if (c2715a.m12976g(c2715a.f11118b)) {
                C2715a c2715a2 = C2715a.this;
                c2715a2.m12956a(c2715a2.f11118b);
                C2715a c2715a3 = C2715a.this;
                c2715a3.m12964b(c2715a3.f11118b);
                C2715a c2715a4 = C2715a.this;
                c2715a4.m12975f(c2715a4.f11118b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.a$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C2715a.this.m12954a(C2715a.this.f11123g, C2715a.this.f11118b);
            } catch (Throwable th) {
                h50.m12119a(C2715a.class, th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.a$c */
    /* loaded from: classes.dex */
    public class c implements ViewTreeObserver.OnScrollChangedListener {
        c() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            C2715a c2715a = C2715a.this;
            c2715a.m12963b(c2715a.f11123g, C2715a.this.f11118b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ir.tapsell.sdk.nativeads.a$d */
    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a */
        private View f11129a;

        /* renamed from: b */
        private View f11130b;

        /* renamed from: c */
        private View f11131c;

        /* renamed from: d */
        private View f11132d;

        /* renamed from: e */
        private View f11133e;

        /* renamed from: f */
        private View f11134f;

        /* renamed from: g */
        private View f11135g;

        /* renamed from: h */
        private View f11136h;

        /* renamed from: i */
        private View f11137i;

        private d(C2715a c2715a) {
        }

        /* synthetic */ d(C2715a c2715a, a aVar) {
            this(c2715a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2715a(Context context, ImageLoader imageLoader) {
        this.f11119c = context;
        this.f11120d = imageLoader;
    }

    /* renamed from: a */
    private d m12949a(LayoutInflater layoutInflater, int i, TapsellNativeBannerManager.C2701a c2701a) {
        d dVar = new d(this, null);
        dVar.f11129a = layoutInflater.inflate(i, (ViewGroup) null, false);
        m12958a(dVar, c2701a);
        m12965b(dVar);
        m12970c(dVar);
        m12957a(dVar);
        return dVar;
    }

    /* renamed from: a */
    private String m12950a(TapsellNativeBannerAdModel tapsellNativeBannerAdModel, boolean z) {
        return z ? m12972d(tapsellNativeBannerAdModel) : m12969c(tapsellNativeBannerAdModel);
    }

    /* renamed from: a */
    private void m12952a() {
        h50.m12134b(false, this.f11124h, "start on screen check");
        this.f11117a.postDelayed(new b(), 200L);
    }

    /* renamed from: a */
    private void m12953a(ViewGroup viewGroup) {
        viewGroup.getRootView().getViewTreeObserver().addOnScrollChangedListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12954a(ViewGroup viewGroup, TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        h50.m12134b(false, this.f11124h, "finish on screen check");
        if (tapsellNativeBannerAdModel == null || tapsellNativeBannerAdModel.getAdSuggestion() == null || tapsellNativeBannerAdModel.isDoneStateReported() || !tapsellNativeBannerAdModel.isTotalTimeCountdownStarted()) {
            return;
        }
        if (viewGroup == null || !C2771m.m13179a(viewGroup, this.f11119c)) {
            tapsellNativeBannerAdModel.setTotalTimeOnScreen(0L);
            tapsellNativeBannerAdModel.setTotalTimeCountdownStarted(false);
            return;
        }
        long totalTimeOnScreen = tapsellNativeBannerAdModel.getTotalTimeOnScreen() + 200;
        if (totalTimeOnScreen >= 2000) {
            m12964b(tapsellNativeBannerAdModel);
        } else {
            tapsellNativeBannerAdModel.setTotalTimeOnScreen(totalTimeOnScreen);
            m12952a();
        }
    }

    /* renamed from: a */
    private void m12955a(ViewGroup viewGroup, d dVar, TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        viewGroup.removeAllViews();
        viewGroup.addView(dVar.f11129a, -1);
        h50.m12135c(false, this.f11124h, "view holder attached");
        m12953a(viewGroup);
        m12963b(viewGroup, tapsellNativeBannerAdModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m12956a(TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        if (tapsellNativeBannerAdModel.isClickedReported()) {
            h50.m12135c(false, this.f11124h, "click reported before");
            return;
        }
        tapsellNativeBannerAdModel.setClickedReported(true);
        HashMap hashMap = new HashMap();
        hashMap.put("METRIX_DATA_ZONE_ID", tapsellNativeBannerAdModel.getZoneId());
        hashMap.put("METRIX_DATA_SUGGESTION_ID", tapsellNativeBannerAdModel.getAdSuggestion().getSuggestionId().toString());
        hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.m16734K().m16757n().getUserId());
        Metrix.getInstance().newEvent("wzkkm", hashMap, null);
        h50.m12127a(false, this.f11124h, "click reported");
        if (tapsellNativeBannerAdModel.getAdSuggestion().getCreative() == 0 || ((NativeBannerCreativeModel) tapsellNativeBannerAdModel.getAdSuggestion().getCreative()).getThirdPartyTrackingUrls() == null) {
            h50.m12121a(this.f11124h + "clickReport", "creative or thirdPartyTrackingUrl is null");
            return;
        }
        for (String str : ((NativeBannerCreativeModel) tapsellNativeBannerAdModel.getAdSuggestion().getCreative()).getThirdPartyTrackingUrls()) {
            h50.m12127a(true, this.f11124h + "clickReport", "thirdPartyTrackingUrl get request: " + str);
            k50.m13618b(str);
        }
    }

    /* renamed from: a */
    private void m12957a(d dVar) {
        if (dVar.f11137i != null) {
            dVar.f11137i.setOnClickListener(this.f11125i);
        } else if (dVar.f11131c != null) {
            dVar.f11131c.setOnClickListener(this.f11125i);
        }
    }

    /* renamed from: a */
    private void m12958a(d dVar, TapsellNativeBannerManager.C2701a c2701a) {
        dVar.f11130b = dVar.f11129a.findViewById(c2701a.f11094g);
        dVar.f11131c = dVar.f11129a.findViewById(c2701a.f11092e);
        dVar.f11132d = dVar.f11129a.findViewById(c2701a.f11088a);
        dVar.f11133e = dVar.f11129a.findViewById(c2701a.f11091d);
        dVar.f11134f = dVar.f11129a.findViewById(c2701a.f11090c);
        dVar.f11135g = dVar.f11129a.findViewById(c2701a.f11089b);
        dVar.f11136h = dVar.f11129a.findViewById(c2701a.f11093f);
        dVar.f11137i = dVar.f11129a.findViewById(c2701a.f11095h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m12959a(d dVar, ImageLoader imageLoader, TapsellNativeBannerAdModel tapsellNativeBannerAdModel, boolean z) {
        if (dVar.f11130b != null) {
            dVar.f11130b.setVisibility(0);
        }
        C2716b.m12998a(dVar.f11132d, tapsellNativeBannerAdModel.getAdSuggestion().getTitle());
        C2716b.m12998a(dVar.f11135g, C2769k.m13171a(tapsellNativeBannerAdModel.getAdSuggestion().getDescription()));
        C2716b.m12998a(dVar.f11131c, ((NativeBannerCreativeModel) tapsellNativeBannerAdModel.getAdSuggestion().getCreative()).getCallToActionText());
        C2716b.m12999a(imageLoader, dVar.f11133e, tapsellNativeBannerAdModel.getAdSuggestion().getIconUrl());
        C2716b.m13001b(imageLoader, dVar.f11134f, m12950a(tapsellNativeBannerAdModel, z));
        C2716b.m12997a(dVar.f11136h, ((NativeBannerCreativeModel) tapsellNativeBannerAdModel.getAdSuggestion().getCreative()).getRate().floatValue());
        h50.m12135c(false, this.f11124h, "bindView");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m12963b(ViewGroup viewGroup, TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        if (tapsellNativeBannerAdModel == null || tapsellNativeBannerAdModel.isDoingStateReported() || tapsellNativeBannerAdModel.isDoneStateReported() || tapsellNativeBannerAdModel.isTotalTimeCountdownStarted() || !C2771m.m13179a(viewGroup, this.f11119c)) {
            return;
        }
        tapsellNativeBannerAdModel.setDoingStateReported(true);
        if (tapsellNativeBannerAdModel.getAdSuggestion() != null) {
            h50.m12135c(false, this.f11124h, "doing report");
            tapsellNativeBannerAdModel.getAdSuggestion().reportAdIsDoing(this.f11119c, tapsellNativeBannerAdModel.getZoneId(), tapsellNativeBannerAdModel.getAdSuggestion().getSuggestionId().toString());
        }
        tapsellNativeBannerAdModel.setTotalTimeCountdownStarted(true);
        m12952a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m12964b(TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        if (tapsellNativeBannerAdModel.isDoneStateReported()) {
            return;
        }
        h50.m12135c(false, this.f11124h, "done report");
        tapsellNativeBannerAdModel.setDoneStateReported(true);
        tapsellNativeBannerAdModel.getAdSuggestion().reportAdIsDone(this.f11119c, tapsellNativeBannerAdModel.getZoneId(), tapsellNativeBannerAdModel.getAdSuggestion().getSuggestionId().toString(), null);
    }

    /* renamed from: b */
    private void m12965b(d dVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private String m12969c(TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        String landscapeStaticImageUrl = ((NativeBannerCreativeModel) tapsellNativeBannerAdModel.getAdSuggestion().getCreative()).getLandscapeStaticImageUrl();
        h50.m12127a(true, this.f11124h, "use landscape image");
        if (landscapeStaticImageUrl != null) {
            return landscapeStaticImageUrl;
        }
        String portraitStaticImageUrl = ((NativeBannerCreativeModel) tapsellNativeBannerAdModel.getAdSuggestion().getCreative()).getPortraitStaticImageUrl();
        h50.m12127a(true, this.f11124h, "use portrait image");
        return portraitStaticImageUrl;
    }

    /* renamed from: c */
    private void m12970c(d dVar) {
        if (dVar.f11133e != null && !(dVar.f11133e instanceof ImageView)) {
            throw new IllegalArgumentException("Id passed for logo of native banner ad points to a non-ImageView view.");
        }
        if (dVar.f11131c != null && !(dVar.f11131c instanceof TextView)) {
            throw new IllegalArgumentException("Id passed for call-to-action button of native banner ad points to a non-TextView view.");
        }
        if (dVar.f11135g != null && !(dVar.f11135g instanceof TextView)) {
            throw new IllegalArgumentException("Id passed for description of native banner ad points to a non-TextView view.");
        }
        if (dVar.f11136h != null && !(dVar.f11136h instanceof RatingBar) && !(dVar.f11136h instanceof RateStarView)) {
            throw new IllegalArgumentException("Id passed for rate bar of native banner ad points to a non-RatingBar and non-RateStar view.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private String m12972d(TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        String portraitStaticImageUrl = ((NativeBannerCreativeModel) tapsellNativeBannerAdModel.getAdSuggestion().getCreative()).getPortraitStaticImageUrl();
        h50.m12127a(true, this.f11124h, "use portrait image");
        if (portraitStaticImageUrl != null) {
            return portraitStaticImageUrl;
        }
        String landscapeStaticImageUrl = ((NativeBannerCreativeModel) tapsellNativeBannerAdModel.getAdSuggestion().getCreative()).getLandscapeStaticImageUrl();
        h50.m12127a(true, this.f11124h, "use landscape image");
        return landscapeStaticImageUrl;
    }

    /* renamed from: e */
    private d m12974e(TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        if (!tapsellNativeBannerAdModel.getAdSuggestion().m11292a() || this.f11122f == null) {
            h50.m12135c(false, this.f11124h, "use viewTemplateHolder");
            return this.f11121e;
        }
        h50.m12135c(false, this.f11124h, "use installViewTemplateHolder");
        return this.f11122f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public void m12975f(TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        h50.m12135c(false, this.f11124h, "open intent");
        C2771m.m13178a(this.f11119c, ((NativeBannerCreativeModel) tapsellNativeBannerAdModel.getAdSuggestion().getCreative()).getCallToActionUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public boolean m12976g(TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        return (tapsellNativeBannerAdModel == null || tapsellNativeBannerAdModel.getAdSuggestion() == null) ? false : true;
    }

    /* renamed from: a */
    public C2715a m12977a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, TapsellNativeBannerManager.C2701a c2701a) {
        this.f11123g = viewGroup;
        this.f11121e = m12949a(layoutInflater, i, c2701a);
        if (i2 != 0) {
            this.f11122f = m12949a(layoutInflater, i2, c2701a);
        }
        h50.m12127a(false, this.f11124h, "ad view created");
        return this;
    }

    /* renamed from: a */
    public void m12978a(TapsellNativeBannerAdModel tapsellNativeBannerAdModel, String str, boolean z) {
        if (!m12976g(tapsellNativeBannerAdModel)) {
            h50.m12132b(this.f11124h, "invalid adWrapper");
            return;
        }
        tapsellNativeBannerAdModel.setZoneId(str);
        this.f11118b = tapsellNativeBannerAdModel;
        d m12974e = m12974e(tapsellNativeBannerAdModel);
        m12955a(this.f11123g, m12974e, tapsellNativeBannerAdModel);
        m12959a(m12974e, this.f11120d, tapsellNativeBannerAdModel, z);
    }
}
