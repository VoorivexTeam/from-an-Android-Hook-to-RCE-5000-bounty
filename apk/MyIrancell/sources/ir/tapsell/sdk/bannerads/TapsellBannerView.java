package ir.tapsell.sdk.bannerads;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ir.tapsell.sdk.NoProguard;
import ir.tapsell.sdk.models.SdkPlatformEnum;
import ir.tapsell.sdk.utils.C2770l;
import p000.e50;
import p000.s40;

/* loaded from: classes.dex */
public class TapsellBannerView extends FrameLayout implements NoProguard {
    TapsellBannerType mBannerType;
    String mZoneId;
    private TapsellBannerWebView tapsellBannerWebView;
    boolean webViewError;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class TapsellBannerViewSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<TapsellBannerViewSavedState> CREATOR = new C2672a();

        /* renamed from: b */
        int f10990b;

        /* renamed from: ir.tapsell.sdk.bannerads.TapsellBannerView$TapsellBannerViewSavedState$a */
        /* loaded from: classes.dex */
        class C2672a implements Parcelable.Creator<TapsellBannerViewSavedState> {
            C2672a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TapsellBannerViewSavedState createFromParcel(Parcel parcel) {
                return new TapsellBannerViewSavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TapsellBannerViewSavedState[] newArray(int i) {
                return new TapsellBannerViewSavedState[i];
            }
        }

        private TapsellBannerViewSavedState(Parcel parcel) {
            super(parcel);
            this.f10990b = parcel.readInt();
        }

        /* synthetic */ TapsellBannerViewSavedState(Parcel parcel, C2673a c2673a) {
            this(parcel);
        }

        TapsellBannerViewSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10990b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.bannerads.TapsellBannerView$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2673a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10991a;

        static {
            int[] iArr = new int[TapsellBannerType.values().length];
            f10991a = iArr;
            try {
                iArr[TapsellBannerType.BANNER_320x50.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10991a[TapsellBannerType.BANNER_320x100.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10991a[TapsellBannerType.BANNER_250x250.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10991a[TapsellBannerType.BANNER_300x250.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public TapsellBannerView(Context context, int i, String str) {
        super(context);
        this.mBannerType = TapsellBannerType.fromValue(i);
        this.mZoneId = str;
        try {
            TapsellBannerWebView tapsellBannerWebView = new TapsellBannerWebView(context, i, str);
            this.tapsellBannerWebView = tapsellBannerWebView;
            addView(tapsellBannerWebView);
        } catch (Throwable unused) {
            this.webViewError = true;
        }
    }

    public TapsellBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            TapsellBannerWebView tapsellBannerWebView = new TapsellBannerWebView(context, attributeSet);
            this.tapsellBannerWebView = tapsellBannerWebView;
            addView(tapsellBannerWebView);
            C2683b.m12873a(this, this.tapsellBannerWebView, context, attributeSet, 0);
        } catch (Throwable unused) {
            this.webViewError = true;
        }
    }

    public TapsellBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            TapsellBannerWebView tapsellBannerWebView = new TapsellBannerWebView(context, attributeSet, i);
            this.tapsellBannerWebView = tapsellBannerWebView;
            addView(tapsellBannerWebView);
            C2683b.m12873a(this, this.tapsellBannerWebView, context, attributeSet, i);
        } catch (Throwable unused) {
            this.webViewError = true;
        }
    }

    public TapsellBannerView(Context context, TapsellBannerType tapsellBannerType, String str) {
        super(context);
        this.mBannerType = tapsellBannerType;
        this.mZoneId = str;
        try {
            TapsellBannerWebView tapsellBannerWebView = new TapsellBannerWebView(context, tapsellBannerType, str);
            this.tapsellBannerWebView = tapsellBannerWebView;
            addView(tapsellBannerWebView);
        } catch (Throwable unused) {
            this.webViewError = true;
        }
    }

    public TapsellBannerView(Context context, TapsellBannerType tapsellBannerType, String str, TapsellBannerViewEventListener tapsellBannerViewEventListener) {
        super(context);
        this.mBannerType = tapsellBannerType;
        this.mZoneId = str;
        try {
            TapsellBannerWebView tapsellBannerWebView = new TapsellBannerWebView(context, tapsellBannerType, str, tapsellBannerViewEventListener);
            this.tapsellBannerWebView = tapsellBannerWebView;
            addView(tapsellBannerWebView);
        } catch (Throwable unused) {
            this.webViewError = true;
        }
    }

    public TapsellBannerView(Context context, TapsellBannerType tapsellBannerType, String str, SdkPlatformEnum sdkPlatformEnum) {
        super(context);
        this.mBannerType = tapsellBannerType;
        this.mZoneId = str;
        try {
            e50.m11543a(sdkPlatformEnum);
            TapsellBannerWebView tapsellBannerWebView = new TapsellBannerWebView(context, tapsellBannerType, str);
            this.tapsellBannerWebView = tapsellBannerWebView;
            addView(tapsellBannerWebView);
        } catch (Throwable unused) {
            this.webViewError = true;
        }
    }

    public TapsellBannerType getBannerType() {
        return this.mBannerType;
    }

    public String getZoneId() {
        return this.mZoneId;
    }

    public void hideBannerView() {
        TapsellBannerWebView tapsellBannerWebView = this.tapsellBannerWebView;
        if (tapsellBannerWebView != null) {
            tapsellBannerWebView.hideBannerView();
        }
    }

    public void loadAd(Context context, String str, TapsellBannerType tapsellBannerType) {
        TapsellBannerWebView tapsellBannerWebView = this.tapsellBannerWebView;
        if (tapsellBannerWebView == null) {
            return;
        }
        this.mZoneId = str;
        this.mBannerType = tapsellBannerType;
        tapsellBannerWebView.loadAd(context, str, tapsellBannerType);
    }

    public void loadAd(Context context, String str, SdkPlatformEnum sdkPlatformEnum, TapsellBannerType tapsellBannerType) {
        if (this.tapsellBannerWebView == null) {
            return;
        }
        e50.m11543a(sdkPlatformEnum);
        this.mZoneId = str;
        this.mBannerType = tapsellBannerType;
        this.tapsellBannerWebView.loadAd(context, str, tapsellBannerType);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int m13173a;
        float f;
        float f2;
        float m13173a2;
        if (this.webViewError) {
            super.onMeasure(i, i2);
            return;
        }
        Resources resources = getResources();
        if (s40.m15356c() && this.mBannerType == null) {
            this.mBannerType = TapsellBannerType.BANNER_320x50;
        }
        int i3 = C2673a.f10991a[this.mBannerType.ordinal()];
        if (i3 == 1) {
            m13173a = (int) C2770l.m13173a(resources, 320.0f);
            f = 50.0f;
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    m13173a2 = C2770l.m13173a(resources, 250.0f);
                } else if (i3 != 4) {
                    f = 0.0f;
                    m13173a = (int) C2770l.m13173a(resources, 0.0f);
                } else {
                    m13173a2 = C2770l.m13173a(resources, 300.0f);
                }
                m13173a = (int) m13173a2;
                f2 = C2770l.m13173a(resources, 250.0f);
                int i4 = (int) f2;
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.width = m13173a;
                layoutParams.height = i4;
                setLayoutParams(layoutParams);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(m13173a, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            }
            m13173a = (int) C2770l.m13173a(resources, 320.0f);
            f = 100.0f;
        }
        f2 = C2770l.m13173a(resources, f);
        int i42 = (int) f2;
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        layoutParams2.width = m13173a;
        layoutParams2.height = i42;
        setLayoutParams(layoutParams2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(m13173a, 1073741824), View.MeasureSpec.makeMeasureSpec(i42, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof TapsellBannerViewSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        TapsellBannerViewSavedState tapsellBannerViewSavedState = (TapsellBannerViewSavedState) parcelable;
        super.onRestoreInstanceState(tapsellBannerViewSavedState.getSuperState());
        this.mBannerType = TapsellBannerType.fromValue(tapsellBannerViewSavedState.f10990b);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        if (this.webViewError) {
            return super.onSaveInstanceState();
        }
        TapsellBannerViewSavedState tapsellBannerViewSavedState = new TapsellBannerViewSavedState(super.onSaveInstanceState());
        tapsellBannerViewSavedState.f10990b = this.mBannerType.getValue();
        return tapsellBannerViewSavedState;
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setEventListener(TapsellBannerViewEventListener tapsellBannerViewEventListener) {
        if (this.webViewError) {
            tapsellBannerViewEventListener.onError("can't access webView");
        } else {
            this.tapsellBannerWebView.setEventListener(tapsellBannerViewEventListener);
        }
    }

    public void showBannerView() {
        TapsellBannerWebView tapsellBannerWebView = this.tapsellBannerWebView;
        if (tapsellBannerWebView == null) {
            return;
        }
        tapsellBannerWebView.showBannerView();
    }
}
