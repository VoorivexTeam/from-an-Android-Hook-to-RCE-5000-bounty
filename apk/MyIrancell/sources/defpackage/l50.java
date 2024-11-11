package defpackage;

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
    pa0<LocationEuropean> a();

    @jc0("sdk-error-log/")
    pa0<Void> a(@xb0 SdkErrorLogModel sdkErrorLogModel);

    @bc0("token/")
    pa0<TokenModel> a(@ec0("developer-key") String str);

    @jc0
    pa0<Void> a(@sc0 String str, @ec0("X-Sentry-Auth") String str2, @xb0 SentryCrashModel sentryCrashModel);

    @jc0("suggestions/{suggestionsId}/status/")
    pa0<Void> a(@nc0("suggestionsId") String str, @fc0 Map<String, String> map, @xb0 UpdateSuggestionJsonParams updateSuggestionJsonParams);

    @jc0("native/banner")
    pa0<SuggestionListNativeBannerResponseModel> a(@fc0 Map<String, String> map, @xb0 RequestAdSuggestionJsonParams requestAdSuggestionJsonParams);

    @bc0
    pa0<Void> b(@sc0 String str);

    @jc0("suggestions/")
    pa0<SuggestionListDirectResponseModel> b(@fc0 Map<String, String> map, @xb0 RequestAdSuggestionJsonParams requestAdSuggestionJsonParams);

    @jc0("native/video")
    pa0<SuggestionListNativeVideoResponseModel> c(@fc0 Map<String, String> map, @xb0 RequestAdSuggestionJsonParams requestAdSuggestionJsonParams);
}
