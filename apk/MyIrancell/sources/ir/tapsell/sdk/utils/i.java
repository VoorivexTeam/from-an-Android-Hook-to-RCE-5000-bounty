package ir.tapsell.sdk.utils;

import android.content.Context;
import defpackage.d70;
import defpackage.e70;
import ir.tapsell.sdk.models.responseModels.SuggestionListNativeBannerResponseModel;
import ir.tapsell.sdk.models.responseModels.SuggestionListNativeVideoResponseModel;
import ir.tapsell.sdk.models.responseModels.subModels.NativeBannerCreativeModel;
import ir.tapsell.sdk.models.responseModels.subModels.NativeVideoCreativeModel;
import java.util.Iterator;

/* loaded from: classes.dex */
public class i {
    /* JADX WARN: Multi-variable type inference failed */
    public static d70 a(Context context, SuggestionListNativeBannerResponseModel suggestionListNativeBannerResponseModel) {
        if (context == null || suggestionListNativeBannerResponseModel == null) {
            return null;
        }
        if (suggestionListNativeBannerResponseModel.getTapsellUserId() != null) {
            ir.tapsell.sdk.g.j().b(suggestionListNativeBannerResponseModel.getTapsellUserId().toString());
        }
        b.a(context, suggestionListNativeBannerResponseModel);
        if (suggestionListNativeBannerResponseModel.getSuggestions() != null && suggestionListNativeBannerResponseModel.getSuggestions().size() > 0) {
            Iterator<d70> it = suggestionListNativeBannerResponseModel.getSuggestions().iterator();
            while (it.hasNext()) {
                d70 next = it.next();
                if (next.getCreative() == 0 || ((NativeBannerCreativeModel) next.getCreative()).getCallToActionUrl() == null || ((NativeBannerCreativeModel) next.getCreative()).getCallToActionText() == null || !((NativeBannerCreativeModel) next.getCreative()).isSupported()) {
                    it.remove();
                }
            }
        }
        if (suggestionListNativeBannerResponseModel.getSuggestions() == null || suggestionListNativeBannerResponseModel.getSuggestions().size() == 0) {
            return null;
        }
        return suggestionListNativeBannerResponseModel.getSuggestions().get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e70 a(Context context, SuggestionListNativeVideoResponseModel suggestionListNativeVideoResponseModel) {
        if (context == null || suggestionListNativeVideoResponseModel == null) {
            return null;
        }
        if (suggestionListNativeVideoResponseModel.getTapsellUserId() != null) {
            ir.tapsell.sdk.g.j().b(suggestionListNativeVideoResponseModel.getTapsellUserId().toString());
        }
        b.a(context, suggestionListNativeVideoResponseModel);
        if (suggestionListNativeVideoResponseModel.getSuggestions() != null && suggestionListNativeVideoResponseModel.getSuggestions().size() > 0) {
            Iterator<e70> it = suggestionListNativeVideoResponseModel.getSuggestions().iterator();
            while (it.hasNext()) {
                e70 next = it.next();
                if (next.getCreative() == 0 || ((NativeVideoCreativeModel) next.getCreative()).getCallToActionUrl() == null || ((NativeVideoCreativeModel) next.getCreative()).getCallToActionText() == null || !((NativeVideoCreativeModel) next.getCreative()).isSupported()) {
                    it.remove();
                }
            }
        }
        if (suggestionListNativeVideoResponseModel.getSuggestions() == null || suggestionListNativeVideoResponseModel.getSuggestions().size() == 0) {
            return null;
        }
        return suggestionListNativeVideoResponseModel.getSuggestions().get(0);
    }
}
