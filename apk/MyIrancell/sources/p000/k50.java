package p000;

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

    /* renamed from: a */
    private static m50<Void, DefaultErrorModel> f11649a = new C2846a();

    /* renamed from: b */
    private static m50<Void, DefaultErrorModel> f11650b = new C2847b();

    /* renamed from: k50$a */
    /* loaded from: classes.dex */
    class C2846a extends m50<Void, DefaultErrorModel> {
        C2846a() {
        }

        @Override // p000.m50
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo12854a(pa0<Void> pa0Var, DefaultErrorModel defaultErrorModel) {
        }

        @Override // p000.m50
        /* renamed from: a */
        public void mo12855a(pa0<Void> pa0Var, Throwable th) {
        }

        @Override // p000.m50
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo12856b(pa0<Void> pa0Var, Void r2) {
        }
    }

    /* renamed from: k50$b */
    /* loaded from: classes.dex */
    class C2847b extends m50<Void, DefaultErrorModel> {
        C2847b() {
        }

        @Override // p000.m50
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo12854a(pa0<Void> pa0Var, DefaultErrorModel defaultErrorModel) {
        }

        @Override // p000.m50
        /* renamed from: a */
        public void mo12855a(pa0<Void> pa0Var, Throwable th) {
        }

        @Override // p000.m50
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo12856b(pa0<Void> pa0Var, Void r2) {
        }
    }

    /* renamed from: a */
    public static void m13611a(Context context, String str, SdkErrorTypeEnum sdkErrorTypeEnum) {
        h50.m12135c(false, "WebServices", "sendSdkErrorLog " + str);
        ((l50) n50.m14236a(l50.class)).m13808a(f50.m11688a(context, str, sdkErrorTypeEnum)).mo14741a(f11649a);
    }

    /* renamed from: a */
    public static void m13612a(Context context, Throwable th) {
        h50.m12135c(false, "WebServices", "sendCrashReport");
        ((l50) n50.m14236a(l50.class)).m13810a("https://sdk-sentry.tapsell.ir/api/3/store/", "Sentry sentry_version=6,sentry_client=sentry-java/1.7.14-548f5,sentry_key=e88bb77dd4354f61ac8b8e448098b03c", y40.m16564a(context, th)).mo14741a(f11649a);
    }

    /* renamed from: a */
    public static void m13613a(String str) {
        h50.m12135c(false, "WebServices", "callUrl");
        ((l50) n50.m14236a(l50.class)).m13813b(str).mo14741a(f11649a);
    }

    /* renamed from: a */
    public static void m13614a(String str, int i, m50<SuggestionListDirectResponseModel, DefaultErrorModel> m50Var) {
        h50.m12135c(false, "WebServices", "getAllSuggestions");
        ((l50) n50.m14236a(l50.class)).m13814b(b50.m3323a(), new RequestAdSuggestionJsonParams(str, i)).mo14741a(m50Var);
    }

    /* renamed from: a */
    public static void m13615a(String str, m50<SuggestionListNativeVideoResponseModel, DefaultErrorModel> m50Var) {
        h50.m12135c(false, "WebServices", "getNativeVideoSuggestions");
        ((l50) n50.m14236a(l50.class)).m13815c(b50.m3323a(), new RequestAdSuggestionJsonParams(str, 2)).mo14741a(m50Var);
    }

    /* renamed from: a */
    public static void m13616a(UUID uuid, int i, int i2) {
        h50.m12135c(false, "WebServices", "updateSuggestionState");
        ((l50) n50.m14236a(l50.class)).m13811a(uuid.toString(), b50.m3323a(), new UpdateSuggestionJsonParams(uuid, i, i2)).mo14741a(f11649a);
    }

    /* renamed from: a */
    public static void m13617a(m50<LocationEuropean, DefaultErrorModel> m50Var) {
        h50.m12135c(false, "WebServices", "getSdkConfigurations");
        ((l50) n50.m14236a(l50.class)).m13807a().mo14741a(m50Var);
    }

    /* renamed from: b */
    public static void m13618b(String str) {
        h50.m12135c(false, "WebServices", "callUrlWithCache");
        ((l50) n50.m14236a(l50.class)).m13813b(str).mo14741a(f11650b);
    }

    /* renamed from: b */
    public static void m13619b(String str, m50<SuggestionListNativeBannerResponseModel, DefaultErrorModel> m50Var) {
        h50.m12135c(false, "WebServices", "getNativeBannerSuggestions");
        ((l50) n50.m14236a(l50.class)).m13812a(b50.m3323a(), new RequestAdSuggestionJsonParams(str, 2)).mo14741a(m50Var);
    }
}
