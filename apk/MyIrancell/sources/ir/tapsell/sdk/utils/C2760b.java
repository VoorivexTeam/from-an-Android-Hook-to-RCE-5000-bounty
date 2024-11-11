package ir.tapsell.sdk.utils;

import android.content.Context;
import ir.tapsell.sdk.models.responseModels.SuggestionListResponseModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import p000.a70;

/* renamed from: ir.tapsell.sdk.utils.b */
/* loaded from: classes.dex */
public class C2760b {
    /* renamed from: a */
    public static <T extends a70> List<T> m13133a(Context context, SuggestionListResponseModel<T> suggestionListResponseModel) {
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

    /* renamed from: a */
    public static void m13134a(SuggestionListResponseModel suggestionListResponseModel) {
        Collections.shuffle(suggestionListResponseModel.getSuggestions(), new Random(new Date().getTime()));
    }
}
