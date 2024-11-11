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
import defpackage.h50;
import defpackage.k50;
import defpackage.z40;
import ir.metrix.sdk.Metrix;
import ir.tapsell.sdk.models.responseModels.TapsellNativeBannerAdModel;
import ir.tapsell.sdk.models.responseModels.subModels.NativeBannerCreativeModel;
import ir.tapsell.sdk.nativeads.TapsellNativeBannerManager;
import ir.tapsell.sdk.nativeads.views.RateStarView;
import ir.tapsell.sdk.networkcacheutils.ImageLoader;
import ir.tapsell.sdk.utils.k;
import ir.tapsell.sdk.utils.m;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a {
    private TapsellNativeBannerAdModel b;
    private Context c;
    private ImageLoader d;
    private d e;
    private d f;
    private ViewGroup g;
    private Handler a = new Handler(Looper.getMainLooper());
    private String h = "NativeBannerViewManager";
    private final View.OnClickListener i = new ViewOnClickListenerC0068a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC0068a implements View.OnClickListener {
        ViewOnClickListenerC0068a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h50.c(true, a.this.h, "ad click");
            a aVar = a.this;
            if (aVar.g(aVar.b)) {
                a aVar2 = a.this;
                aVar2.a(aVar2.b);
                a aVar3 = a.this;
                aVar3.b(aVar3.b);
                a aVar4 = a.this;
                aVar4.f(aVar4.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.this.a(a.this.g, a.this.b);
            } catch (Throwable th) {
                h50.a(a.class, th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements ViewTreeObserver.OnScrollChangedListener {
        c() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            a aVar = a.this;
            aVar.b(aVar.g, a.this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d {
        private View a;
        private View b;
        private View c;
        private View d;
        private View e;
        private View f;
        private View g;
        private View h;
        private View i;

        private d(a aVar) {
        }

        /* synthetic */ d(a aVar, ViewOnClickListenerC0068a viewOnClickListenerC0068a) {
            this(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, ImageLoader imageLoader) {
        this.c = context;
        this.d = imageLoader;
    }

    private d a(LayoutInflater layoutInflater, int i, TapsellNativeBannerManager.a aVar) {
        d dVar = new d(this, null);
        dVar.a = layoutInflater.inflate(i, (ViewGroup) null, false);
        a(dVar, aVar);
        b(dVar);
        c(dVar);
        a(dVar);
        return dVar;
    }

    private String a(TapsellNativeBannerAdModel tapsellNativeBannerAdModel, boolean z) {
        return z ? d(tapsellNativeBannerAdModel) : c(tapsellNativeBannerAdModel);
    }

    private void a() {
        h50.b(false, this.h, "start on screen check");
        this.a.postDelayed(new b(), 200L);
    }

    private void a(ViewGroup viewGroup) {
        viewGroup.getRootView().getViewTreeObserver().addOnScrollChangedListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ViewGroup viewGroup, TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        h50.b(false, this.h, "finish on screen check");
        if (tapsellNativeBannerAdModel == null || tapsellNativeBannerAdModel.getAdSuggestion() == null || tapsellNativeBannerAdModel.isDoneStateReported() || !tapsellNativeBannerAdModel.isTotalTimeCountdownStarted()) {
            return;
        }
        if (viewGroup == null || !m.a(viewGroup, this.c)) {
            tapsellNativeBannerAdModel.setTotalTimeOnScreen(0L);
            tapsellNativeBannerAdModel.setTotalTimeCountdownStarted(false);
            return;
        }
        long totalTimeOnScreen = tapsellNativeBannerAdModel.getTotalTimeOnScreen() + 200;
        if (totalTimeOnScreen >= 2000) {
            b(tapsellNativeBannerAdModel);
        } else {
            tapsellNativeBannerAdModel.setTotalTimeOnScreen(totalTimeOnScreen);
            a();
        }
    }

    private void a(ViewGroup viewGroup, d dVar, TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        viewGroup.removeAllViews();
        viewGroup.addView(dVar.a, -1);
        h50.c(false, this.h, "view holder attached");
        a(viewGroup);
        b(viewGroup, tapsellNativeBannerAdModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        if (tapsellNativeBannerAdModel.isClickedReported()) {
            h50.c(false, this.h, "click reported before");
            return;
        }
        tapsellNativeBannerAdModel.setClickedReported(true);
        HashMap hashMap = new HashMap();
        hashMap.put("METRIX_DATA_ZONE_ID", tapsellNativeBannerAdModel.getZoneId());
        hashMap.put("METRIX_DATA_SUGGESTION_ID", tapsellNativeBannerAdModel.getAdSuggestion().getSuggestionId().toString());
        hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.K().n().getUserId());
        Metrix.getInstance().newEvent("wzkkm", hashMap, null);
        h50.a(false, this.h, "click reported");
        if (tapsellNativeBannerAdModel.getAdSuggestion().getCreative() == 0 || ((NativeBannerCreativeModel) tapsellNativeBannerAdModel.getAdSuggestion().getCreative()).getThirdPartyTrackingUrls() == null) {
            h50.a(this.h + "clickReport", "creative or thirdPartyTrackingUrl is null");
            return;
        }
        for (String str : ((NativeBannerCreativeModel) tapsellNativeBannerAdModel.getAdSuggestion().getCreative()).getThirdPartyTrackingUrls()) {
            h50.a(true, this.h + "clickReport", "thirdPartyTrackingUrl get request: " + str);
            k50.b(str);
        }
    }

    private void a(d dVar) {
        if (dVar.i != null) {
            dVar.i.setOnClickListener(this.i);
        } else if (dVar.c != null) {
            dVar.c.setOnClickListener(this.i);
        }
    }

    private void a(d dVar, TapsellNativeBannerManager.a aVar) {
        dVar.b = dVar.a.findViewById(aVar.g);
        dVar.c = dVar.a.findViewById(aVar.e);
        dVar.d = dVar.a.findViewById(aVar.a);
        dVar.e = dVar.a.findViewById(aVar.d);
        dVar.f = dVar.a.findViewById(aVar.c);
        dVar.g = dVar.a.findViewById(aVar.b);
        dVar.h = dVar.a.findViewById(aVar.f);
        dVar.i = dVar.a.findViewById(aVar.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(d dVar, ImageLoader imageLoader, TapsellNativeBannerAdModel tapsellNativeBannerAdModel, boolean z) {
        if (dVar.b != null) {
            dVar.b.setVisibility(0);
        }
        ir.tapsell.sdk.nativeads.b.a(dVar.d, tapsellNativeBannerAdModel.getAdSuggestion().getTitle());
        ir.tapsell.sdk.nativeads.b.a(dVar.g, k.a(tapsellNativeBannerAdModel.getAdSuggestion().getDescription()));
        ir.tapsell.sdk.nativeads.b.a(dVar.c, ((NativeBannerCreativeModel) tapsellNativeBannerAdModel.getAdSuggestion().getCreative()).getCallToActionText());
        ir.tapsell.sdk.nativeads.b.a(imageLoader, dVar.e, tapsellNativeBannerAdModel.getAdSuggestion().getIconUrl());
        ir.tapsell.sdk.nativeads.b.b(imageLoader, dVar.f, a(tapsellNativeBannerAdModel, z));
        ir.tapsell.sdk.nativeads.b.a(dVar.h, ((NativeBannerCreativeModel) tapsellNativeBannerAdModel.getAdSuggestion().getCreative()).getRate().floatValue());
        h50.c(false, this.h, "bindView");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ViewGroup viewGroup, TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        if (tapsellNativeBannerAdModel == null || tapsellNativeBannerAdModel.isDoingStateReported() || tapsellNativeBannerAdModel.isDoneStateReported() || tapsellNativeBannerAdModel.isTotalTimeCountdownStarted() || !m.a(viewGroup, this.c)) {
            return;
        }
        tapsellNativeBannerAdModel.setDoingStateReported(true);
        if (tapsellNativeBannerAdModel.getAdSuggestion() != null) {
            h50.c(false, this.h, "doing report");
            tapsellNativeBannerAdModel.getAdSuggestion().reportAdIsDoing(this.c, tapsellNativeBannerAdModel.getZoneId(), tapsellNativeBannerAdModel.getAdSuggestion().getSuggestionId().toString());
        }
        tapsellNativeBannerAdModel.setTotalTimeCountdownStarted(true);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        if (tapsellNativeBannerAdModel.isDoneStateReported()) {
            return;
        }
        h50.c(false, this.h, "done report");
        tapsellNativeBannerAdModel.setDoneStateReported(true);
        tapsellNativeBannerAdModel.getAdSuggestion().reportAdIsDone(this.c, tapsellNativeBannerAdModel.getZoneId(), tapsellNativeBannerAdModel.getAdSuggestion().getSuggestionId().toString(), null);
    }

    private void b(d dVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String c(TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        String landscapeStaticImageUrl = ((NativeBannerCreativeModel) tapsellNativeBannerAdModel.getAdSuggestion().getCreative()).getLandscapeStaticImageUrl();
        h50.a(true, this.h, "use landscape image");
        if (landscapeStaticImageUrl != null) {
            return landscapeStaticImageUrl;
        }
        String portraitStaticImageUrl = ((NativeBannerCreativeModel) tapsellNativeBannerAdModel.getAdSuggestion().getCreative()).getPortraitStaticImageUrl();
        h50.a(true, this.h, "use portrait image");
        return portraitStaticImageUrl;
    }

    private void c(d dVar) {
        if (dVar.e != null && !(dVar.e instanceof ImageView)) {
            throw new IllegalArgumentException("Id passed for logo of native banner ad points to a non-ImageView view.");
        }
        if (dVar.c != null && !(dVar.c instanceof TextView)) {
            throw new IllegalArgumentException("Id passed for call-to-action button of native banner ad points to a non-TextView view.");
        }
        if (dVar.g != null && !(dVar.g instanceof TextView)) {
            throw new IllegalArgumentException("Id passed for description of native banner ad points to a non-TextView view.");
        }
        if (dVar.h != null && !(dVar.h instanceof RatingBar) && !(dVar.h instanceof RateStarView)) {
            throw new IllegalArgumentException("Id passed for rate bar of native banner ad points to a non-RatingBar and non-RateStar view.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String d(TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        String portraitStaticImageUrl = ((NativeBannerCreativeModel) tapsellNativeBannerAdModel.getAdSuggestion().getCreative()).getPortraitStaticImageUrl();
        h50.a(true, this.h, "use portrait image");
        if (portraitStaticImageUrl != null) {
            return portraitStaticImageUrl;
        }
        String landscapeStaticImageUrl = ((NativeBannerCreativeModel) tapsellNativeBannerAdModel.getAdSuggestion().getCreative()).getLandscapeStaticImageUrl();
        h50.a(true, this.h, "use landscape image");
        return landscapeStaticImageUrl;
    }

    private d e(TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        if (!tapsellNativeBannerAdModel.getAdSuggestion().a() || this.f == null) {
            h50.c(false, this.h, "use viewTemplateHolder");
            return this.e;
        }
        h50.c(false, this.h, "use installViewTemplateHolder");
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void f(TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        h50.c(false, this.h, "open intent");
        m.a(this.c, ((NativeBannerCreativeModel) tapsellNativeBannerAdModel.getAdSuggestion().getCreative()).getCallToActionUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        return (tapsellNativeBannerAdModel == null || tapsellNativeBannerAdModel.getAdSuggestion() == null) ? false : true;
    }

    public a a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, TapsellNativeBannerManager.a aVar) {
        this.g = viewGroup;
        this.e = a(layoutInflater, i, aVar);
        if (i2 != 0) {
            this.f = a(layoutInflater, i2, aVar);
        }
        h50.a(false, this.h, "ad view created");
        return this;
    }

    public void a(TapsellNativeBannerAdModel tapsellNativeBannerAdModel, String str, boolean z) {
        if (!g(tapsellNativeBannerAdModel)) {
            h50.b(this.h, "invalid adWrapper");
            return;
        }
        tapsellNativeBannerAdModel.setZoneId(str);
        this.b = tapsellNativeBannerAdModel;
        d e = e(tapsellNativeBannerAdModel);
        a(this.g, e, tapsellNativeBannerAdModel);
        a(e, this.d, tapsellNativeBannerAdModel, z);
    }
}
