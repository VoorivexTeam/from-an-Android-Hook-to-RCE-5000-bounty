package defpackage;

import android.content.Context;
import ir.tapsell.sdk.g;
import ir.tapsell.sdk.models.responseModels.DefaultErrorModel;
import ir.tapsell.sdk.models.responseModels.LocationEuropean;
import ir.tapsell.sdk.models.responseModels.SuggestionListNativeBannerResponseModel;
import ir.tapsell.sdk.utils.i;

/* loaded from: classes.dex */
public class r50 {

    /* loaded from: classes.dex */
    class a extends m50<SuggestionListNativeBannerResponseModel, DefaultErrorModel> {
        final /* synthetic */ Context b;
        final /* synthetic */ p50 c;

        a(Context context, p50 p50Var) {
            this.b = context;
            this.c = p50Var;
        }

        @Override // defpackage.m50
        public void a(pa0<SuggestionListNativeBannerResponseModel> pa0Var, DefaultErrorModel defaultErrorModel) {
            this.c.a(defaultErrorModel.getMessage());
        }

        @Override // defpackage.m50
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(pa0<SuggestionListNativeBannerResponseModel> pa0Var, SuggestionListNativeBannerResponseModel suggestionListNativeBannerResponseModel) {
            if (suggestionListNativeBannerResponseModel != null && suggestionListNativeBannerResponseModel.getSelectDirectAdRandomly() != null && suggestionListNativeBannerResponseModel.getSelectDirectAdRandomly().booleanValue()) {
                ir.tapsell.sdk.utils.b.a(suggestionListNativeBannerResponseModel);
            }
            if (i.a(this.b, suggestionListNativeBannerResponseModel) == null) {
                this.c.a("Ad UnAvailable");
            } else {
                this.c.a((p50) suggestionListNativeBannerResponseModel);
            }
        }

        @Override // defpackage.m50
        public void a(pa0<SuggestionListNativeBannerResponseModel> pa0Var, Throwable th) {
            this.c.a(th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends m50<LocationEuropean, DefaultErrorModel> {
        b() {
        }

        @Override // defpackage.m50
        public void a(pa0<LocationEuropean> pa0Var, DefaultErrorModel defaultErrorModel) {
        }

        @Override // defpackage.m50
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(pa0<LocationEuropean> pa0Var, LocationEuropean locationEuropean) {
            r50.b(locationEuropean);
        }

        @Override // defpackage.m50
        public void a(pa0<LocationEuropean> pa0Var, Throwable th) {
        }
    }

    public static void a() {
        k50.a(new b());
    }

    public static void a(Context context, String str, p50 p50Var) {
        k50.b(str, new a(context, p50Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(LocationEuropean locationEuropean) {
        g j;
        String str;
        if (locationEuropean.result) {
            j = g.j();
            str = "GDPR_EU";
        } else {
            j = g.j();
            str = "GDPR_OUTSIDE_EU";
        }
        j.f(str);
        z40.K().i();
    }
}
