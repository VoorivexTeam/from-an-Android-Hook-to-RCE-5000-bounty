package p000;

import android.content.Context;
import ir.tapsell.sdk.C2688g;
import ir.tapsell.sdk.models.responseModels.DefaultErrorModel;
import ir.tapsell.sdk.models.responseModels.LocationEuropean;
import ir.tapsell.sdk.models.responseModels.SuggestionListNativeBannerResponseModel;
import ir.tapsell.sdk.utils.C2760b;
import ir.tapsell.sdk.utils.C2767i;

/* loaded from: classes.dex */
public class r50 {

    /* renamed from: r50$a */
    /* loaded from: classes.dex */
    class C3153a extends m50<SuggestionListNativeBannerResponseModel, DefaultErrorModel> {

        /* renamed from: b */
        final /* synthetic */ Context f12912b;

        /* renamed from: c */
        final /* synthetic */ p50 f12913c;

        C3153a(Context context, p50 p50Var) {
            this.f12912b = context;
            this.f12913c = p50Var;
        }

        @Override // p000.m50
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo12854a(pa0<SuggestionListNativeBannerResponseModel> pa0Var, DefaultErrorModel defaultErrorModel) {
            this.f12913c.mo14717a(defaultErrorModel.getMessage());
        }

        @Override // p000.m50
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo12856b(pa0<SuggestionListNativeBannerResponseModel> pa0Var, SuggestionListNativeBannerResponseModel suggestionListNativeBannerResponseModel) {
            if (suggestionListNativeBannerResponseModel != null && suggestionListNativeBannerResponseModel.getSelectDirectAdRandomly() != null && suggestionListNativeBannerResponseModel.getSelectDirectAdRandomly().booleanValue()) {
                C2760b.m13134a(suggestionListNativeBannerResponseModel);
            }
            if (C2767i.m13167a(this.f12912b, suggestionListNativeBannerResponseModel) == null) {
                this.f12913c.mo14717a("Ad UnAvailable");
            } else {
                this.f12913c.mo14716a((p50) suggestionListNativeBannerResponseModel);
            }
        }

        @Override // p000.m50
        /* renamed from: a */
        public void mo12855a(pa0<SuggestionListNativeBannerResponseModel> pa0Var, Throwable th) {
            this.f12913c.mo14717a(th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r50$b */
    /* loaded from: classes.dex */
    public class C3154b extends m50<LocationEuropean, DefaultErrorModel> {
        C3154b() {
        }

        @Override // p000.m50
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo12854a(pa0<LocationEuropean> pa0Var, DefaultErrorModel defaultErrorModel) {
        }

        @Override // p000.m50
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo12856b(pa0<LocationEuropean> pa0Var, LocationEuropean locationEuropean) {
            r50.m15209b(locationEuropean);
        }

        @Override // p000.m50
        /* renamed from: a */
        public void mo12855a(pa0<LocationEuropean> pa0Var, Throwable th) {
        }
    }

    /* renamed from: a */
    public static void m15206a() {
        k50.m13617a(new C3154b());
    }

    /* renamed from: a */
    public static void m15207a(Context context, String str, p50 p50Var) {
        k50.m13619b(str, new C3153a(context, p50Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m15209b(LocationEuropean locationEuropean) {
        C2688g m12913j;
        String str;
        if (locationEuropean.result) {
            m12913j = C2688g.m12913j();
            str = "GDPR_EU";
        } else {
            m12913j = C2688g.m12913j();
            str = "GDPR_OUTSIDE_EU";
        }
        m12913j.m12929f(str);
        z40.m16734K().m16752i();
    }
}
