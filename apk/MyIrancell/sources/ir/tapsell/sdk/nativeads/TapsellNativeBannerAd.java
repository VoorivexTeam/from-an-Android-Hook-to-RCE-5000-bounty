package ir.tapsell.sdk.nativeads;

import android.content.Context;
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
import ir.tapsell.sdk.models.responseModels.TapsellNativeBannerAdModel;
import ir.tapsell.sdk.models.responseModels.subModels.NativeBannerCreativeModel;
import ir.tapsell.sdk.nativeads.TapsellNativeBannerAdLoader;
import ir.tapsell.sdk.nativeads.views.RateStarView;
import ir.tapsell.sdk.networkcacheutils.ImageLoadOptions;
import ir.tapsell.sdk.networkcacheutils.ImageLoader;
import ir.tapsell.sdk.utils.C2771m;
import ir.tapsell.sdk.utils.GsonHelper;
import java.util.HashMap;
import java.util.Iterator;
import p000.g50;
import p000.k50;
import p000.z40;

@Deprecated
/* loaded from: classes.dex */
public class TapsellNativeBannerAd implements NoProguard {
    private TapsellNativeBannerAdModel adWrapper;
    private View bannerView;
    private Context context;
    private View ctaButtonView;
    private View descriptionView;
    private ImageLoader imageLoader;
    private View logoView;
    private View.OnClickListener onClickListener;
    private View rateBarView;
    private View sponsoredView;
    private View titleView;
    private ViewGroup viewGroup;
    private TapsellNativeBannerAdLoader.C2700b viewIds;

    /* renamed from: x */
    private float f11061x;

    /* renamed from: x2 */
    private float f11062x2;

    /* renamed from: y */
    private float f11063y;

    /* renamed from: y2 */
    private float f11064y2;
    private View adView = null;
    private Handler handler = new Handler(Looper.getMainLooper());
    private boolean actionDown = false;
    private int VALID_TOUCH_PERCENTAGE = 70;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeBannerAd$a */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2690a implements View.OnClickListener {
        ViewOnClickListenerC2690a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TapsellNativeBannerAd.this.adWrapper != null && TapsellNativeBannerAd.this.adWrapper.getAdSuggestion() != null) {
                if (!TapsellNativeBannerAd.this.adWrapper.isClickedReported()) {
                    TapsellNativeBannerAd.this.adWrapper.setClickedReported(true);
                    HashMap hashMap = new HashMap();
                    hashMap.put("METRIX_DATA_ZONE_ID", TapsellNativeBannerAd.this.adWrapper.getZoneId());
                    hashMap.put("METRIX_DATA_SUGGESTION_ID", TapsellNativeBannerAd.this.adWrapper.getAdSuggestion().getSuggestionId().toString());
                    hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.m16734K().m16757n().getUserId());
                    Metrix.getInstance().newEvent("wzkkm", hashMap, null);
                    if (TapsellNativeBannerAd.this.adWrapper.getAdSuggestion().getCreative() != 0 && ((NativeBannerCreativeModel) TapsellNativeBannerAd.this.adWrapper.getAdSuggestion().getCreative()).getThirdPartyTrackingUrls() != null) {
                        Iterator<String> it = ((NativeBannerCreativeModel) TapsellNativeBannerAd.this.adWrapper.getAdSuggestion().getCreative()).getThirdPartyTrackingUrls().iterator();
                        while (it.hasNext()) {
                            k50.m13618b(it.next());
                        }
                    }
                }
                if (!TapsellNativeBannerAd.this.adWrapper.isDoneStateReported()) {
                    TapsellNativeBannerAd.this.adWrapper.setDoneStateReported(true);
                    TapsellNativeBannerAd.this.adWrapper.getAdSuggestion().reportAdIsDone(TapsellNativeBannerAd.this.context, TapsellNativeBannerAd.this.adWrapper.getZoneId(), TapsellNativeBannerAd.this.adWrapper.getAdSuggestion().getSuggestionId().toString(), null);
                }
                C2771m.m13178a(TapsellNativeBannerAd.this.context, ((NativeBannerCreativeModel) TapsellNativeBannerAd.this.adWrapper.getAdSuggestion().getCreative()).getCallToActionUrl());
            }
            if (TapsellNativeBannerAd.this.onClickListener != null) {
                TapsellNativeBannerAd.this.onClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeBannerAd$b */
    /* loaded from: classes.dex */
    public class ViewOnTouchListenerC2691b implements View.OnTouchListener {

        /* renamed from: b */
        final /* synthetic */ View.OnClickListener f11066b;

        ViewOnTouchListenerC2691b(View.OnClickListener onClickListener) {
            this.f11066b = onClickListener;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        
            if (r5.f11067c.checkTouchIsInOffset() == false) goto L19;
         */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
            /*
                r5 = this;
                int r0 = r7.getAction()
                r1 = 1
                if (r0 == 0) goto L6f
                r2 = 0
                if (r0 == r1) goto L2a
                r6 = 2
                if (r0 == r6) goto Lf
                goto L92
            Lf:
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd r6 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.this
                float r0 = r7.getRawX()
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.access$602(r6, r0)
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd r6 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.this
                float r7 = r7.getRawY()
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.access$702(r6, r7)
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd r6 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.this
                boolean r6 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.access$800(r6)
                if (r6 != 0) goto L92
                goto L69
            L2a:
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd r0 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.this
                float r3 = r7.getRawX()
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.access$602(r0, r3)
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd r0 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.this
                float r7 = r7.getRawY()
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.access$702(r0, r7)
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd r7 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.this
                boolean r7 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.access$300(r7)
                if (r7 == 0) goto L69
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd r7 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.this
                boolean r7 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.access$800(r7)
                if (r7 == 0) goto L69
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd r7 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.this
                android.view.View r0 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.access$900(r7)
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd r3 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.this
                float r3 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.access$600(r3)
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd r4 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.this
                float r4 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.access$700(r4)
                boolean r7 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.access$1000(r7, r0, r3, r4)
                if (r7 == 0) goto L69
                android.view.View$OnClickListener r7 = r5.f11066b
                r7.onClick(r6)
            L69:
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd r6 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.this
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.access$302(r6, r2)
                goto L92
            L6f:
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd r6 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.this
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.access$302(r6, r1)
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd r6 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.this
                float r0 = r7.getRawX()
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.access$402(r6, r0)
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd r6 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.this
                float r7 = r7.getRawY()
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.access$502(r6, r7)
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd r6 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.this
                r7 = -998637568(0xffffffffc47a0000, float:-1000.0)
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.access$602(r6, r7)
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd r6 = ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.this
                ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.access$702(r6, r7)
            L92:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.tapsell.sdk.nativeads.TapsellNativeBannerAd.ViewOnTouchListenerC2691b.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeBannerAd$c */
    /* loaded from: classes.dex */
    public class RunnableC2692c implements Runnable {
        RunnableC2692c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                TapsellNativeBannerAd.this.countMillisecondsOnScreen(200L);
            } catch (Throwable th) {
                g50.m11895a(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeBannerAd$d */
    /* loaded from: classes.dex */
    public class RunnableC2693d implements Runnable {
        RunnableC2693d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                TapsellNativeBannerAd.this.countMillisecondsOnScreen(200L);
            } catch (Throwable th) {
                g50.m11895a(th);
            }
        }
    }

    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeBannerAd$e */
    /* loaded from: classes.dex */
    class RunnableC2694e implements Runnable {
        RunnableC2694e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TapsellNativeBannerAd.this.bindView();
            TapsellNativeBannerAd.this.startCheckingAdViewOnScreen();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeBannerAd$f */
    /* loaded from: classes.dex */
    public class ViewTreeObserverOnScrollChangedListenerC2695f implements ViewTreeObserver.OnScrollChangedListener {
        ViewTreeObserverOnScrollChangedListenerC2695f() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            TapsellNativeBannerAd.this.startCheckingAdViewOnScreen();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeBannerAd$g */
    /* loaded from: classes.dex */
    public class ViewGroupOnHierarchyChangeListenerC2696g implements ViewGroup.OnHierarchyChangeListener {
        ViewGroupOnHierarchyChangeListenerC2696g() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view2 == null || TapsellNativeBannerAd.this.adView == null || !view2.equals(TapsellNativeBannerAd.this.adView)) {
                return;
            }
            TapsellNativeBannerAd.this.startCheckingAdViewOnScreen();
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (TapsellNativeBannerAd.this.adWrapper == null || view2 == null || TapsellNativeBannerAd.this.adView == null || !view2.equals(TapsellNativeBannerAd.this.adView)) {
                return;
            }
            TapsellNativeBannerAd.this.adWrapper.setTotalTimeOnScreen(0L);
            TapsellNativeBannerAd.this.adWrapper.setTotalTimeCountdownStarted(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeBannerAd$h */
    /* loaded from: classes.dex */
    public class RunnableC2697h implements Runnable {
        RunnableC2697h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TapsellNativeBannerAd.this.startCheckingAdViewOnScreen();
        }
    }

    public TapsellNativeBannerAd() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TapsellNativeBannerAd(Context context, TapsellNativeBannerAdModel tapsellNativeBannerAdModel, TapsellNativeBannerAdLoader.C2700b c2700b) {
        this.context = context;
        this.adWrapper = tapsellNativeBannerAdModel;
        this.viewIds = c2700b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkTouchIsInOffset() {
        return Math.abs(this.f11062x2 - this.f11061x) < 25.0f && Math.abs(this.f11064y2 - this.f11063y) < 25.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void countMillisecondsOnScreen(long j) {
        TapsellNativeBannerAdModel tapsellNativeBannerAdModel = this.adWrapper;
        if (tapsellNativeBannerAdModel == null || tapsellNativeBannerAdModel.getAdSuggestion() == null || !this.adWrapper.isTotalTimeCountdownStarted()) {
            return;
        }
        long totalTimeOnScreen = this.adWrapper.getTotalTimeOnScreen() + j;
        View view = this.adView;
        if (view == null || !C2771m.m13179a(view, this.context)) {
            this.adWrapper.setTotalTimeOnScreen(0L);
            this.adWrapper.setTotalTimeCountdownStarted(false);
        } else if (totalTimeOnScreen < 2000) {
            this.adWrapper.setTotalTimeOnScreen(totalTimeOnScreen);
            this.handler.postDelayed(new RunnableC2692c(), 200L);
        } else {
            if (this.adWrapper.isDoneStateReported()) {
                return;
            }
            this.adWrapper.setDoneStateReported(true);
            this.adWrapper.setTotalTimeCountdownStarted(false);
            this.adWrapper.getAdSuggestion().reportAdIsDone(this.context, this.adWrapper.getZoneId(), this.adWrapper.getAdSuggestion().getSuggestionId().toString(), null);
        }
    }

    public static TapsellNativeBannerAd createFromStateBundle(Context context, Bundle bundle, int i, int i2) {
        if (!bundle.containsKey("adWrapper")) {
            throw new RuntimeException("Invalid state bundle, not containing ad data");
        }
        if (!bundle.containsKey("viewIds")) {
            throw new RuntimeException("Invalid state bundle, not containing view data");
        }
        TapsellNativeBannerAd tapsellNativeBannerAd = new TapsellNativeBannerAd(context, (TapsellNativeBannerAdModel) GsonHelper.getCustomGson().fromJson(bundle.getString("adWrapper"), TapsellNativeBannerAdModel.class), TapsellNativeBannerAdLoader.C2700b.m12941a(bundle.getBundle("viewIds")));
        tapsellNativeBannerAd.createView(LayoutInflater.from(context), i, i2, new ImageLoader(context));
        return tapsellNativeBannerAd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isInValidArea(View view, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width = view.getWidth();
        view.getHeight();
        int i3 = (((100 - this.VALID_TOUCH_PERCENTAGE) / 2) * width) / 100;
        return f > ((float) (i + i3)) && f < ((float) ((i + width) - i3));
    }

    private void setHierarchyChangeListener(ViewGroup viewGroup) {
        viewGroup.getRootView().getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserverOnScrollChangedListenerC2695f());
        viewGroup.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC2696g());
        this.handler.postDelayed(new RunnableC2697h(), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCheckingAdViewOnScreen() {
        if (this.adWrapper == null || !C2771m.m13179a(this.adView, this.context) || this.adWrapper.isDoingStateReported() || this.adWrapper.isTotalTimeCountdownStarted() || this.adWrapper.isDoneStateReported()) {
            return;
        }
        if (!this.adWrapper.isDoingStateReported()) {
            this.adWrapper.setDoingStateReported(true);
            if (this.adWrapper.getAdSuggestion() != null) {
                this.adWrapper.getAdSuggestion().reportAdIsDoing(this.context, this.adWrapper.getZoneId(), this.adWrapper.getAdSuggestion().getSuggestionId().toString());
            }
        }
        this.adWrapper.setTotalTimeCountdownStarted(true);
        this.handler.postDelayed(new RunnableC2693d(), 200L);
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
        if (viewGroup == null) {
            throw new RuntimeException("Null value passed for parent ViewGroup.");
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.adView.getParent()).removeView(this.adView);
        }
        setHierarchyChangeListener(viewGroup);
        if (layoutParams != null) {
            viewGroup.addView(this.adView, i, layoutParams);
        } else {
            viewGroup.addView(this.adView, i);
        }
        startCheckingAdViewOnScreen();
    }

    public void addToParentView(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        addToParentView(viewGroup, -1, layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void bindView() {
        if (this.adWrapper == null) {
            return;
        }
        ViewGroup viewGroup = this.viewGroup;
        if (viewGroup != null && viewGroup.getChildCount() == 0) {
            this.viewGroup.addView(this.adView, -1);
        }
        View view = this.sponsoredView;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.ctaButtonView;
        if (view2 != null) {
            if (!(view2 instanceof TextView)) {
                throw new IllegalArgumentException("Id passed for call-to-action button of native banner ad points to a non-TextView view.");
            }
            ((TextView) view2).setText(((NativeBannerCreativeModel) this.adWrapper.getAdSuggestion().getCreative()).getCallToActionText());
        }
        View view3 = this.titleView;
        if (view3 != null) {
            if (!(view3 instanceof TextView)) {
                throw new IllegalArgumentException("Id passed for title of native banner ad points to a non-TextView view.");
            }
            ((TextView) view3).setText(this.adWrapper.getAdSuggestion().getTitle());
        }
        View view4 = this.logoView;
        if (view4 != null) {
            if (!(view4 instanceof ImageView)) {
                throw new IllegalArgumentException("Id passed for logo of native banner ad points to a non-ImageView view.");
            }
            this.imageLoader.DisplayImage(this.adWrapper.getAdSuggestion().getIconUrl(), (ImageView) this.logoView, null, null, new ImageLoadOptions());
        }
        View view5 = this.bannerView;
        if (view5 != null) {
            if (!(view5 instanceof ImageView)) {
                throw new IllegalArgumentException("Id passed for banner of native banner ad points to a non-ImageView view.");
            }
            String landscapeStaticImageUrl = ((NativeBannerCreativeModel) this.adWrapper.getAdSuggestion().getCreative()).getLandscapeStaticImageUrl();
            if (landscapeStaticImageUrl == null) {
                landscapeStaticImageUrl = ((NativeBannerCreativeModel) this.adWrapper.getAdSuggestion().getCreative()).getPortraitStaticImageUrl();
            }
            ImageLoadOptions imageLoadOptions = new ImageLoadOptions();
            imageLoadOptions.setBitmapDecodingMethod(ImageLoadOptions.EnumC2729b.HIGHEST_CONFIG_LOW_MEMORY);
            this.imageLoader.DisplayImage(landscapeStaticImageUrl, (ImageView) this.bannerView, null, null, imageLoadOptions);
        }
        View view6 = this.descriptionView;
        if (view6 != null) {
            if (!(view6 instanceof TextView)) {
                throw new IllegalArgumentException("Id passed for description of native banner ad points to a non-TextView view.");
            }
            ((TextView) view6).setText(Html.fromHtml(this.adWrapper.getAdSuggestion().getDescription()));
        }
        View view7 = this.rateBarView;
        if (view7 == null) {
            return;
        }
        if (!(view7 instanceof RatingBar) && !(view7 instanceof RateStarView)) {
            throw new IllegalArgumentException("Id passed for rate bar of native banner ad points to a non-RatingBar and non-RateStar view.");
        }
        View view8 = this.rateBarView;
        if (!(view8 instanceof RatingBar)) {
            ((RateStarView) view8).setRate(((NativeBannerCreativeModel) this.adWrapper.getAdSuggestion().getCreative()).getRate().floatValue());
        } else {
            ((RatingBar) view8).setRating(((NativeBannerCreativeModel) this.adWrapper.getAdSuggestion().getCreative()).getRate().floatValue());
            ((RatingBar) this.rateBarView).setIsIndicator(true);
        }
    }

    public void bindView(TapsellNativeAdHolder tapsellNativeAdHolder) {
        if (tapsellNativeAdHolder == null || tapsellNativeAdHolder.getAdWrapper() == null) {
            return;
        }
        this.adWrapper = tapsellNativeAdHolder.getAdWrapper();
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.handler.post(new RunnableC2694e());
        } else {
            bindView();
            startCheckingAdViewOnScreen();
        }
    }

    public void createView(LayoutInflater layoutInflater, int i, int i2, ImageLoader imageLoader) {
        TapsellNativeBannerAdModel tapsellNativeBannerAdModel = this.adWrapper;
        if (tapsellNativeBannerAdModel != null && tapsellNativeBannerAdModel.getAdSuggestion().m11292a() && i2 != 0) {
            i = i2;
        }
        View inflate = layoutInflater.inflate(i, (ViewGroup) null, false);
        this.adView = inflate;
        this.imageLoader = imageLoader;
        this.sponsoredView = inflate.findViewById(this.viewIds.f11086g);
        ViewOnClickListenerC2690a viewOnClickListenerC2690a = new ViewOnClickListenerC2690a();
        ViewOnTouchListenerC2691b viewOnTouchListenerC2691b = new ViewOnTouchListenerC2691b(viewOnClickListenerC2690a);
        View findViewById = this.adView.findViewById(this.viewIds.f11084e);
        this.ctaButtonView = findViewById;
        if (findViewById == null) {
            int i3 = this.viewIds.f11087h;
            if (i3 == 0 || this.adView.findViewById(i3) == null) {
                this.adView.setOnTouchListener(viewOnTouchListenerC2691b);
            } else {
                this.adView.findViewById(this.viewIds.f11087h).setOnClickListener(viewOnClickListenerC2690a);
            }
        } else {
            if (!(findViewById instanceof TextView)) {
                throw new IllegalArgumentException("Id passed for call-to-action button of native banner ad points to a non-TextView view.");
            }
            findViewById.setOnClickListener(viewOnClickListenerC2690a);
        }
        this.titleView = this.adView.findViewById(this.viewIds.f11080a);
        int i4 = this.viewIds.f11083d;
        if (i4 != 0) {
            this.logoView = this.adView.findViewById(i4);
        }
        int i5 = this.viewIds.f11082c;
        if (i5 != 0) {
            this.bannerView = this.adView.findViewById(i5);
        }
        int i6 = this.viewIds.f11081b;
        if (i6 != 0) {
            this.descriptionView = this.adView.findViewById(i6);
        }
        this.rateBarView = this.adView.findViewById(this.viewIds.f11085f);
        if (this.adWrapper != null) {
            bindView();
        }
    }

    public View findViewById(int i) {
        View view = this.adView;
        if (view == null) {
            return null;
        }
        return view.findViewById(i);
    }

    public TapsellNativeAdHolder getAdHolder() {
        return new TapsellNativeAdHolder(this.adWrapper);
    }

    public TapsellNativeBannerAdModel getAdWrapper() {
        return this.adWrapper;
    }

    public Bundle getStateBundle() {
        Bundle bundle = new Bundle();
        TapsellNativeBannerAdLoader.C2700b c2700b = this.viewIds;
        if (c2700b != null) {
            bundle.putBundle("viewIds", c2700b.m12942a());
        }
        bundle.putString("adWrapper", GsonHelper.getCustomGson().toJson(this.adWrapper));
        return bundle;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void setParent(ViewGroup viewGroup) {
        this.viewGroup = viewGroup;
    }
}
