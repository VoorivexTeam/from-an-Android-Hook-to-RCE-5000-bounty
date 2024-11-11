package p000;

import ir.tapsell.sdk.models.requestModels.RequestAdSuggestionJsonParams;
import ir.tapsell.sdk.models.requestModels.UpdateSuggestionJsonParams;
import ir.tapsell.sdk.models.responseModels.LocationEuropean;
import ir.tapsell.sdk.models.responseModels.SuggestionListDirectResponseModel;
import ir.tapsell.sdk.models.responseModels.SuggestionListNativeBannerResponseModel;
import ir.tapsell.sdk.models.responseModels.SuggestionListNativeVideoResponseModel;
import ir.tapsell.sdk.models.responseModels.TokenModel;
import ir.tapsell.sdk.models.sdkErrorLogModels.SdkErrorLogModel;
import ir.tapsell.sdk.models.sentry.SentryCrashModel;
import java.util.Map;

/* loaded from: classes.dex */
public interface l50 {
    @bc0("location/european")
    /* renamed from: a */
    pa0<LocationEuropean> m13807a();

    @jc0("sdk-error-log/")
    /* renamed from: a */
    pa0<Void> m13808a(@xb0 SdkErrorLogModel sdkErrorLogModel);

    @bc0("token/")
    /* renamed from: a */
    pa0<TokenModel> m13809a(@ec0("developer-key") String str);

    @jc0
    /* renamed from: a */
    pa0<Void> m13810a(@sc0 String str, @ec0("X-Sentry-Auth") String str2, @xb0 SentryCrashModel sentryCrashModel);

    @jc0("suggestions/{suggestionsId}/status/")
    /* renamed from: a */
    pa0<Void> m13811a(@nc0("suggestionsId") String str, @fc0 Map<String, String> map, @xb0 UpdateSuggestionJsonParams updateSuggestionJsonParams);

    @jc0("native/banner")
    /* renamed from: a */
    pa0<SuggestionListNativeBannerResponseModel> m13812a(@fc0 Map<String, String> map, @xb0 RequestAdSuggestionJsonParams requestAdSuggestionJsonParams);

    @bc0
    /* renamed from: b */
    pa0<Void> m13813b(@sc0 String str);

    @jc0("suggestions/")
    /* renamed from: b */
    pa0<SuggestionListDirectResponseModel> m13814b(@fc0 Map<String, String> map, @xb0 RequestAdSuggestionJsonParams requestAdSuggestionJsonParams);

    @jc0("native/video")
    /* renamed from: c */
    pa0<SuggestionListNativeVideoResponseModel> m13815c(@fc0 Map<String, String> map, @xb0 RequestAdSuggestionJsonParams requestAdSuggestionJsonParams);
}
