package defpackage;

import ir.tapsell.sdk.models.responseModels.TapsellNativeBannerAdModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class q50<T extends TapsellNativeBannerAdModel> {
    HashMap<String, T> a = new HashMap<>();

    public T a(String str) {
        return this.a.get(str);
    }

    public ArrayList a() {
        return new ArrayList(this.a.values());
    }

    public void a(T t) {
        this.a.put(t.getAdSuggestion().getSuggestionId().toString(), t);
    }

    public void a(ArrayList<T> arrayList) {
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            T next = it.next();
            this.a.put(next.getAdSuggestion().getSuggestionId().toString(), next);
        }
    }
}
