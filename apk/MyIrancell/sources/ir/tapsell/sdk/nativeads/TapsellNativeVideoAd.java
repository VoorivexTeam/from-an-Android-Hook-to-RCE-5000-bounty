package ir.tapsell.sdk.nativeads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import ir.metrix.sdk.Metrix;
import ir.tapsell.sdk.NoProguard;
import ir.tapsell.sdk.models.responseModels.subModels.NativeVideoCreativeModel;
import ir.tapsell.sdk.nativeads.TapsellNativeVideoAdLoader;
import ir.tapsell.sdk.nativeads.views.RateStarView;
import ir.tapsell.sdk.nativeads.views.videoplayer.InterfaceC2724a;
import ir.tapsell.sdk.nativeads.views.videoplayer.VideoContainer;
import ir.tapsell.sdk.networkcacheutils.ImageLoadOptions;
import ir.tapsell.sdk.networkcacheutils.ImageLoader;
import ir.tapsell.sdk.utils.C2771m;
import ir.tapsell.sdk.utils.GsonHelper;
import java.util.HashMap;
import java.util.Iterator;
import p000.i50;
import p000.k50;
import p000.z40;

/* loaded from: classes.dex */
public class TapsellNativeVideoAd implements NoProguard {
    private C2721g adWrapper;
    private TapsellNativeVideoAdCompletionListener completionListener;
    private Context context;
    private C2720f nativeVideoAdHelper;
    private View.OnClickListener onClickListener;
    private TapsellNativeVideoAdProgressListener progressListener;
    private TapsellNativeVideoIconSet videoIconSet;
    private TapsellNativeVideoAdLoader.C2713b viewIds;
    private View adView = null;
    private Handler handler = new Handler(Looper.getMainLooper());
    private int screenW = 0;
    private int screenH = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeVideoAd$a */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2706a implements View.OnClickListener {

        /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeVideoAd$a$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                TapsellNativeVideoAd.this.startCheckingAdViewOnScreen();
            }
        }

        ViewOnClickListenerC2706a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TapsellNativeVideoAd.this.adWrapper != null && TapsellNativeVideoAd.this.adWrapper.getAdSuggestion() != null) {
                if (!TapsellNativeVideoAd.this.adWrapper.isClickedReported()) {
                    TapsellNativeVideoAd.this.adWrapper.setClickedReported(true);
                    HashMap hashMap = new HashMap();
                    hashMap.put("METRIX_DATA_ZONE_ID", TapsellNativeVideoAd.this.adWrapper.m13062a());
                    hashMap.put("METRIX_DATA_SUGGESTION_ID", TapsellNativeVideoAd.this.adWrapper.getAdSuggestion().getSuggestionId().toString());
                    hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.m16734K().m16757n().getUserId());
                    Metrix.getInstance().newEvent("wzkkm", hashMap, null);
                    if (TapsellNativeVideoAd.this.adWrapper.getAdSuggestion().getCreative() != 0 && ((NativeVideoCreativeModel) TapsellNativeVideoAd.this.adWrapper.getAdSuggestion().getCreative()).getThirdPartyTrackingUrls() != null) {
                        Iterator<String> it = ((NativeVideoCreativeModel) TapsellNativeVideoAd.this.adWrapper.getAdSuggestion().getCreative()).getThirdPartyTrackingUrls().iterator();
                        while (it.hasNext()) {
                            k50.m13618b(it.next());
                        }
                    }
                }
                if (!TapsellNativeVideoAd.this.adWrapper.isDoneStateReported()) {
                    TapsellNativeVideoAd.this.adWrapper.setDoneStateReported(true);
                    TapsellNativeVideoAd.this.adWrapper.getAdSuggestion().reportAdIsDone(TapsellNativeVideoAd.this.context, TapsellNativeVideoAd.this.adWrapper.m13062a(), TapsellNativeVideoAd.this.adWrapper.getAdSuggestion().getSuggestionId().toString(), null);
                }
                C2771m.m13178a(TapsellNativeVideoAd.this.context, ((NativeVideoCreativeModel) TapsellNativeVideoAd.this.adWrapper.getAdSuggestion().getCreative()).getCallToActionUrl());
            }
            if (TapsellNativeVideoAd.this.onClickListener != null) {
                TapsellNativeVideoAd.this.onClickListener.onClick(view);
            }
            TapsellNativeVideoAd.this.handler.postDelayed(new a(), 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeVideoAd$b */
    /* loaded from: classes.dex */
    public class C2707b implements InterfaceC2724a {

        /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeVideoAd$b$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                TapsellNativeVideoAd.this.startCheckingAdViewOnScreen();
            }
        }

        C2707b() {
        }

        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.InterfaceC2724a
        /* renamed from: a */
        public void mo12945a() {
            TapsellNativeVideoAd.this.startCheckingAdViewOnScreen();
        }

        @Override // ir.tapsell.sdk.nativeads.views.videoplayer.InterfaceC2724a
        /* renamed from: b */
        public void mo12946b() {
            TapsellNativeVideoAd.this.handler.postDelayed(new a(), 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeVideoAd$c */
    /* loaded from: classes.dex */
    public class ViewTreeObserverOnScrollChangedListenerC2708c implements ViewTreeObserver.OnScrollChangedListener {
        ViewTreeObserverOnScrollChangedListenerC2708c() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            TapsellNativeVideoAd.this.startCheckingAdViewOnScreen();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeVideoAd$d */
    /* loaded from: classes.dex */
    public class ViewGroupOnHierarchyChangeListenerC2709d implements ViewGroup.OnHierarchyChangeListener {
        ViewGroupOnHierarchyChangeListenerC2709d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view2 == null || TapsellNativeVideoAd.this.adView == null || !view2.equals(TapsellNativeVideoAd.this.adView)) {
                return;
            }
            TapsellNativeVideoAd.this.startCheckingAdViewOnScreen();
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view2 == null || TapsellNativeVideoAd.this.adView == null) {
                return;
            }
            view2.equals(TapsellNativeVideoAd.this.adView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeVideoAd$e */
    /* loaded from: classes.dex */
    public class RunnableC2710e implements Runnable {
        RunnableC2710e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TapsellNativeVideoAd.this.startCheckingAdViewOnScreen();
        }
    }

    public TapsellNativeVideoAd() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TapsellNativeVideoAd(Context context, C2721g c2721g, TapsellNativeVideoAdLoader.C2713b c2713b, TapsellNativeVideoIconSet tapsellNativeVideoIconSet) {
        this.context = context;
        this.adWrapper = c2721g;
        this.viewIds = c2713b;
        this.videoIconSet = tapsellNativeVideoIconSet;
        this.nativeVideoAdHelper = new C2720f(context, c2721g, tapsellNativeVideoIconSet);
    }

    public static TapsellNativeVideoAd createFromStateBundle(Context context, Bundle bundle, int i, int i2) {
        if (!bundle.containsKey("videoAdWrapper")) {
            throw new RuntimeException("Invalid state bundle, not containing ad data");
        }
        if (!bundle.containsKey("videoViewIds")) {
            throw new RuntimeException("Invalid state bundle, not containing view data");
        }
        C2721g c2721g = (C2721g) GsonHelper.getCustomGson().fromJson(bundle.getString("videoAdWrapper"), C2721g.class);
        TapsellNativeVideoIconSet tapsellNativeVideoIconSet = null;
        TapsellNativeVideoAdLoader.C2713b m12947a = bundle != null ? TapsellNativeVideoAdLoader.C2713b.m12947a(bundle.getBundle("videoViewIds")) : null;
        try {
            tapsellNativeVideoIconSet = (TapsellNativeVideoIconSet) GsonHelper.getCustomGson().fromJson(bundle.getString("videoIconSet"), TapsellNativeVideoIconSet.class);
        } catch (Exception unused) {
        }
        TapsellNativeVideoAd tapsellNativeVideoAd = new TapsellNativeVideoAd(context, c2721g, m12947a, tapsellNativeVideoIconSet);
        tapsellNativeVideoAd.createView(LayoutInflater.from(context), i, i2, new ImageLoader(context));
        return tapsellNativeVideoAd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCheckingAdViewOnScreen() {
        if (this.adWrapper == null || !C2771m.m13179a(this.adView, this.context)) {
            if (this.nativeVideoAdHelper.m13050d()) {
                this.nativeVideoAdHelper.m13048b();
                return;
            }
            return;
        }
        if (!this.nativeVideoAdHelper.m13047a()) {
            this.nativeVideoAdHelper.m13051e();
        }
        if (this.adWrapper.m13077f() && this.nativeVideoAdHelper.m13052f() && !this.nativeVideoAdHelper.m13050d()) {
            this.nativeVideoAdHelper.m13049c();
        }
    }

    public void addToParentView(ViewGroup viewGroup) {
        addToParentView(viewGroup, -1, null);
    }

    public void addToParentView(ViewGroup viewGroup, int i) {
        addToParentView(viewGroup, i, null);
    }

    public void addToParentView(ViewGroup viewGroup, int i, ViewGroup.LayoutParams layoutParams) {
        View view = this.adView;
        if (view == null) {
            throw new RuntimeException("View of native ad is not created yet.");
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.adView.getParent()).removeView(this.adView);
        }
        if (viewGroup == null) {
            throw new RuntimeException("Null value passed for parent ViewGroup.");
        }
        viewGroup.getRootView().getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserverOnScrollChangedListenerC2708c());
        viewGroup.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC2709d());
        this.handler.postDelayed(new RunnableC2710e(), 2000L);
        if (layoutParams != null) {
            viewGroup.addView(this.adView, i, layoutParams);
        } else {
            viewGroup.addView(this.adView, i);
        }
    }

    public void addToParentView(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        addToParentView(viewGroup, -1, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public void createView(LayoutInflater layoutInflater, int i, int i2, ImageLoader imageLoader) {
        int i3;
        View findViewById;
        View findViewById2;
        View findViewById3;
        if (this.adWrapper.getAdSuggestion().m11564a() && i2 != 0) {
            i = i2;
        }
        View inflate = layoutInflater.inflate(i, (ViewGroup) null, false);
        this.adView = inflate;
        View findViewById4 = inflate.findViewById(this.viewIds.f11115g);
        if (findViewById4 != null) {
            findViewById4.setVisibility(0);
        }
        ViewOnClickListenerC2706a viewOnClickListenerC2706a = new ViewOnClickListenerC2706a();
        View findViewById5 = this.adView.findViewById(this.viewIds.f11113e);
        if (findViewById5 == null) {
            int i4 = this.viewIds.f11116h;
            findViewById5 = (i4 == 0 || this.adView.findViewById(i4) == null) ? this.adView : this.adView.findViewById(this.viewIds.f11116h);
        } else {
            if (!(findViewById5 instanceof TextView)) {
                throw new IllegalArgumentException("Id passed for call-to-action button of native video ad points to a non-TextView view.");
            }
            ((TextView) findViewById5).setText(((NativeVideoCreativeModel) this.adWrapper.getAdSuggestion().getCreative()).getCallToActionText());
        }
        findViewById5.setOnClickListener(viewOnClickListenerC2706a);
        View findViewById6 = this.adView.findViewById(this.viewIds.f11109a);
        if (findViewById6 != null) {
            if (!(findViewById6 instanceof TextView)) {
                throw new IllegalArgumentException("Id passed for title of native video ad points to a non-TextView view.");
            }
            ((TextView) findViewById6).setText(this.adWrapper.getAdSuggestion().getTitle());
        }
        int i5 = this.viewIds.f11112d;
        if (i5 != 0 && (findViewById3 = this.adView.findViewById(i5)) != null) {
            if (!(findViewById3 instanceof ImageView)) {
                throw new IllegalArgumentException("Id passed for logo of native video ad points to a non-ImageView view.");
            }
            imageLoader.DisplayImage(this.adWrapper.getAdSuggestion().getIconUrl(), (ImageView) findViewById3, null, null, new ImageLoadOptions());
        }
        int i6 = this.viewIds.f11111c;
        if (i6 == 0) {
            throw new IllegalArgumentException("Invalid video tag.");
        }
        View findViewById7 = this.adView.findViewById(i6);
        if (findViewById7 == null) {
            throw new IllegalArgumentException("Id for video container does not point to any specific view.");
        }
        if (!(findViewById7 instanceof VideoContainer)) {
            throw new IllegalArgumentException("Id passed for video of native video ad points to a non-VideoContainer view.");
        }
        if (((NativeVideoCreativeModel) this.adWrapper.getAdSuggestion().getCreative()).getVideoUrl() == null) {
            throw new IllegalArgumentException("Invalid ad!");
        }
        VideoContainer videoContainer = (VideoContainer) findViewById7;
        videoContainer.setListener(new C2707b());
        this.nativeVideoAdHelper.m13044a(videoContainer);
        i50.m12368a("Setting video player url " + ((NativeVideoCreativeModel) this.adWrapper.getAdSuggestion().getCreative()).getVideoUrl());
        this.nativeVideoAdHelper.m13045a(Uri.parse(((NativeVideoCreativeModel) this.adWrapper.getAdSuggestion().getCreative()).getVideoUrl()));
        this.nativeVideoAdHelper.m13046a(new TapsellNativeVideoAdCompletionListener() { // from class: ir.tapsell.sdk.nativeads.TapsellNativeVideoAd.3
            @Override // ir.tapsell.sdk.nativeads.TapsellNativeVideoAdCompletionListener
            public void onAdShowFinished(String str) {
                if (TapsellNativeVideoAd.this.completionListener != null) {
                    TapsellNativeVideoAd.this.completionListener.onAdShowFinished(str);
                }
            }
        }, new TapsellNativeVideoAdProgressListener() { // from class: ir.tapsell.sdk.nativeads.TapsellNativeVideoAd.4
            @Override // ir.tapsell.sdk.nativeads.TapsellNativeVideoAdProgressListener
            public void onNativeAdProgress(String str, int i7) {
                if (TapsellNativeVideoAd.this.progressListener != null) {
                    TapsellNativeVideoAd.this.progressListener.onNativeAdProgress(str, i7);
                }
            }
        });
        if (C2771m.m13179a(this.adView, this.context) && this.adWrapper.m13077f() && this.nativeVideoAdHelper.m13052f()) {
            this.nativeVideoAdHelper.m13049c();
        } else {
            this.adWrapper.m13070c(false);
        }
        int i7 = this.viewIds.f11110b;
        if (i7 != 0 && (findViewById2 = this.adView.findViewById(i7)) != null) {
            if (!(findViewById2 instanceof TextView)) {
                throw new IllegalArgumentException("Id passed for description of native video ad points to a non-TextView view.");
            }
            ((TextView) findViewById2).setText(Html.fromHtml(this.adWrapper.getAdSuggestion().getDescription()));
        }
        if (!this.adWrapper.getAdSuggestion().m11564a() || ((NativeVideoCreativeModel) this.adWrapper.getAdSuggestion().getCreative()).getRate() == null || (i3 = this.viewIds.f11114f) == 0 || (findViewById = this.adView.findViewById(i3)) == null) {
            return;
        }
        boolean z = findViewById instanceof RatingBar;
        if (!z && !(findViewById instanceof RateStarView)) {
            throw new IllegalArgumentException("Id passed for rate bar of native banner ad points to a non-RatingBar and non-RateStar view.");
        }
        if (!z) {
            ((RateStarView) findViewById).setRate(((NativeVideoCreativeModel) this.adWrapper.getAdSuggestion().getCreative()).getRate().floatValue());
            return;
        }
        RatingBar ratingBar = (RatingBar) findViewById;
        ratingBar.setRating(((NativeVideoCreativeModel) this.adWrapper.getAdSuggestion().getCreative()).getRate().floatValue());
        ratingBar.setIsIndicator(true);
    }

    public View findViewById(int i) {
        View view = this.adView;
        if (view == null) {
            return null;
        }
        return view.findViewById(i);
    }

    public C2721g getAdWrapper() {
        return this.adWrapper;
    }

    public Bundle getStateBundle() {
        Bundle bundle = new Bundle();
        TapsellNativeVideoAdLoader.C2713b c2713b = this.viewIds;
        if (c2713b != null) {
            bundle.putBundle("videoViewIds", c2713b.m12948a());
        }
        bundle.putString("videoAdWrapper", GsonHelper.getCustomGson().toJson(this.adWrapper));
        bundle.putString("videoIconSet", GsonHelper.getCustomGson().toJson(this.videoIconSet));
        return bundle;
    }

    public void setCompletionListener(TapsellNativeVideoAdCompletionListener tapsellNativeVideoAdCompletionListener) {
        this.completionListener = tapsellNativeVideoAdCompletionListener;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void setProgressListener(TapsellNativeVideoAdProgressListener tapsellNativeVideoAdProgressListener) {
        this.progressListener = tapsellNativeVideoAdProgressListener;
    }
}
