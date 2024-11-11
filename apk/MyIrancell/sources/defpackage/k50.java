package defpackage;

import android.content.Context;
import ir.tapsell.sdk.models.requestModels.RequestAdSuggestionJsonParams;
import ir.tapsell.sdk.models.requestModels.UpdateSuggestionJsonParams;
import ir.tapsell.sdk.models.responseModels.DefaultErrorModel;
import ir.tapsell.sdk.models.responseModels.LocationEuropean;
import ir.tapsell.sdk.models.responseModels.SuggestionListDirectResponseModel;
import ir.tapsell.sdk.models.responseModels.SuggestionListNativeBannerResponseModel;
import ir.tapsell.sdk.models.responseModels.SuggestionListNativeVideoResponseModel;
import ir.tapsell.sdk.models.sdkErrorLogModels.SdkErrorTypeEnum;
import java.util.UUID;

/* loaded from: classes.dex */
public class k50 {
    private static m50<Void, DefaultErrorModel> a = new a();
    private static m50<Void, DefaultErrorModel> b = new b();

    /* loaded from: classes.dex */
    class a extends m50<Void, DefaultErrorModel> {
        a() {
        }

        @Override // defpackage.m50
        public void a(pa0<Void> pa0Var, DefaultErrorModel defaultErrorModel) {
        }

        @Override // defpackage.m50
        public void a(pa0<Void> pa0Var, Throwable th) {
        }

        @Override // defpackage.m50
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(pa0<Void> pa0Var, Void r2) {
        }
    }

    /* loaded from: classes.dex */
    class b extends m50<Void, DefaultErrorModel> {
        b() {
        }

        @Override // defpackage.m50
        public void a(pa0<Void> pa0Var, DefaultErrorModel defaultErrorModel) {
        }

        @Override // defpackage.m50
        public void a(pa0<Void> pa0Var, Throwable th) {
        }

        @Override // defpackage.m50
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(pa0<Void> pa0Var, Void r2) {
        }
    }

    public static void a(Context context, String str, SdkErrorTypeEnum sdkErrorTypeEnum) {
        h50.c(false, "WebServices", "sendSdkErrorLog " + str);
        ((l50) n50.a(l50.class)).a(f50.a(context, str, sdkErrorTypeEnum)).a(a);
    }

    public static void a(Context context, Throwable th) {
        h50.c(false, "WebServices", "sendCrashReport");
        ((l50) n50.a(l50.class)).a("https://sdk-sentry.tapsell.ir/api/3/store/", "Sentry sentry_version=6,sentry_client=sentry-java/1.7.14-548f5,sentry_key=e88bb77dd4354f61ac8b8e448098b03c", y40.a(context, th)).a(a);
    }

    public static void a(String str) {
        h50.c(false, "WebServices", "callUrl");
        ((l50) n50.a(l50.class)).b(str).a(a);
    }

    public static void a(String str, int i, m50<SuggestionListDirectResponseModel, DefaultErrorModel> m50Var) {
        h50.c(false, "WebServices", "getAllSuggestions");
        ((l50) n50.a(l50.class)).b(b50.a(), new RequestAdSuggestionJsonParams(str, i)).a(m50Var);
    }

    public static void a(String str, m50<SuggestionListNativeVideoResponseModel, DefaultErrorModel> m50Var) {
        h50.c(false, "WebServices", "getNativeVideoSuggestions");
        ((l50) n50.a(l50.class)).c(b50.a(), new RequestAdSuggestionJsonParams(str, 2)).a(m50Var);
    }

    public static void a(UUID uuid, int i, int i2) {
        h50.c(false, "WebServices", "updateSuggestionState");
        ((l50) n50.a(l50.class)).a(uuid.toString(), b50.a(), new UpdateSuggestionJsonParams(uuid, i, i2)).a(a);
    }

    public static void a(m50<LocationEuropean, DefaultErrorModel> m50Var) {
        h50.c(false, "WebServices", "getSdkConfigurations");
        ((l50) n50.a(l50.class)).a().a(m50Var);
    }

    public static void b(String str) {
        h50.c(false, "WebServices", "callUrlWithCache");
        ((l50) n50.a(l50.class)).b(str).a(b);
    }

    public static void b(String str, m50<SuggestionListNativeBannerResponseModel, DefaultErrorModel> m50Var) {
        h50.c(false, "WebServices", "getNativeBannerSuggestions");
        ((l50) n50.a(l50.class)).a(b50.a(), new RequestAdSuggestionJsonParams(str, 2)).a(m50Var);
    }
}
