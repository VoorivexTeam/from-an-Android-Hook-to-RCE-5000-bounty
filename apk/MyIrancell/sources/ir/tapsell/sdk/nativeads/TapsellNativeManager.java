package ir.tapsell.sdk.nativeads;

import android.content.Context;
import ir.tapsell.sdk.C2670a;
import ir.tapsell.sdk.NoProguard;
import ir.tapsell.sdk.models.responseModels.DefaultErrorModel;
import ir.tapsell.sdk.models.responseModels.SuggestionListNativeBannerResponseModel;
import ir.tapsell.sdk.models.responseModels.SuggestionListNativeVideoResponseModel;
import ir.tapsell.sdk.utils.C2760b;
import ir.tapsell.sdk.utils.C2767i;
import p000.d70;
import p000.e70;
import p000.i50;
import p000.k50;
import p000.m50;
import p000.pa0;

/* loaded from: classes.dex */
public class TapsellNativeManager extends C2670a implements NoProguard {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeManager$a */
    /* loaded from: classes.dex */
    public class C2702a extends m50<SuggestionListNativeBannerResponseModel, DefaultErrorModel> {

        /* renamed from: b */
        final /* synthetic */ Context f11096b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC2719e f11097c;

        C2702a(Context context, InterfaceC2719e interfaceC2719e) {
            this.f11096b = context;
            this.f11097c = interfaceC2719e;
        }

        @Override // p000.m50
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo12854a(pa0<SuggestionListNativeBannerResponseModel> pa0Var, DefaultErrorModel defaultErrorModel) {
            this.f11097c.mo12940a(defaultErrorModel.getMessage());
        }

        @Override // p000.m50
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo12856b(pa0<SuggestionListNativeBannerResponseModel> pa0Var, SuggestionListNativeBannerResponseModel suggestionListNativeBannerResponseModel) {
            if (suggestionListNativeBannerResponseModel != null && suggestionListNativeBannerResponseModel.getSelectDirectAdRandomly() != null && suggestionListNativeBannerResponseModel.getSelectDirectAdRandomly().booleanValue()) {
                C2760b.m13134a(suggestionListNativeBannerResponseModel);
            }
            d70 m13167a = C2767i.m13167a(this.f11096b, suggestionListNativeBannerResponseModel);
            if (m13167a == null) {
                this.f11097c.mo12938a();
            } else {
                this.f11097c.mo12939a(m13167a);
            }
        }

        @Override // p000.m50
        /* renamed from: a */
        public void mo12855a(pa0<SuggestionListNativeBannerResponseModel> pa0Var, Throwable th) {
            this.f11097c.mo12940a(th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.nativeads.TapsellNativeManager$b */
    /* loaded from: classes.dex */
    public class C2703b extends m50<SuggestionListNativeVideoResponseModel, DefaultErrorModel> {

        /* renamed from: b */
        final /* synthetic */ Context f11098b;

        /* renamed from: c */
        final /* synthetic */ TapsellNativeVideoAdRequestListener f11099c;

        C2703b(Context context, TapsellNativeVideoAdRequestListener tapsellNativeVideoAdRequestListener) {
            this.f11098b = context;
            this.f11099c = tapsellNativeVideoAdRequestListener;
        }

        @Override // p000.m50
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo12854a(pa0<SuggestionListNativeVideoResponseModel> pa0Var, DefaultErrorModel defaultErrorModel) {
            this.f11099c.onError(defaultErrorModel.getMessage());
        }

        @Override // p000.m50
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo12856b(pa0<SuggestionListNativeVideoResponseModel> pa0Var, SuggestionListNativeVideoResponseModel suggestionListNativeVideoResponseModel) {
            if (suggestionListNativeVideoResponseModel != null && suggestionListNativeVideoResponseModel.getSelectDirectAdRandomly() != null && suggestionListNativeVideoResponseModel.getSelectDirectAdRandomly().booleanValue()) {
                C2760b.m13134a(suggestionListNativeVideoResponseModel);
            }
            e70 m13168a = C2767i.m13168a(this.f11098b, suggestionListNativeVideoResponseModel);
            if (m13168a == null) {
                this.f11099c.onNoAdAvailable();
            } else {
                this.f11099c.onAdAvailable(m13168a);
            }
        }

        @Override // p000.m50
        /* renamed from: a */
        public void mo12855a(pa0<SuggestionListNativeVideoResponseModel> pa0Var, Throwable th) {
            this.f11099c.onError(th.getMessage());
        }
    }

    public static void getNativeBannerAd(Context context, String str, InterfaceC2719e interfaceC2719e) {
        if (context == null) {
            throw new IllegalArgumentException("Context for loading native banner ad is null.");
        }
        if (interfaceC2719e == null) {
            throw new IllegalArgumentException("Request listener for loading native banner ad is null.");
        }
        getNativeBannerAdWithPermissions(context, str, interfaceC2719e);
    }

    public static void getNativeBannerAdWithPermissions(Context context, String str, InterfaceC2719e interfaceC2719e) {
        if (context != null) {
            k50.m13619b(str, new C2702a(context, interfaceC2719e));
            return;
        }
        i50.m12368a("null context");
        if (interfaceC2719e != null) {
            interfaceC2719e.mo12940a("null context");
        }
    }

    public static void getNativeVideoAd(Context context, String str, TapsellNativeVideoAdRequestListener tapsellNativeVideoAdRequestListener) {
        if (context == null) {
            throw new IllegalArgumentException("Context for loading native video ad is null.");
        }
        if (tapsellNativeVideoAdRequestListener == null) {
            throw new IllegalArgumentException("Request listener for loading native video ad is null.");
        }
        getNativeVideoAdWithPermissions(context, str, tapsellNativeVideoAdRequestListener);
    }

    public static void getNativeVideoAdWithPermissions(Context context, String str, TapsellNativeVideoAdRequestListener tapsellNativeVideoAdRequestListener) {
        if (context != null) {
            k50.m13615a(str, new C2703b(context, tapsellNativeVideoAdRequestListener));
            return;
        }
        i50.m12368a("null context");
        if (tapsellNativeVideoAdRequestListener != null) {
            tapsellNativeVideoAdRequestListener.onError("null context");
        }
    }
}
