package ir.tapsell.sdk.utils;

import android.content.Context;
import defpackage.a70;
import ir.tapsell.sdk.models.responseModels.SuggestionListResponseModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class b {
    public static <T extends a70> List<T> a(Context context, SuggestionListResponseModel<T> suggestionListResponseModel) {
        ArrayList arrayList = new ArrayList();
        List<T> suggestions = suggestionListResponseModel.getSuggestions();
        if (suggestions != null && suggestions.size() > 0) {
            Iterator<T> it = suggestions.iterator();
            while (it.hasNext()) {
                T next = it.next();
                if (!next.isValidForThisUser(context)) {
                    arrayList.add(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static void a(SuggestionListResponseModel suggestionListResponseModel) {
        Collections.shuffle(suggestionListResponseModel.getSuggestions(), new Random(new Date().getTime()));
    }
}
