package p000;

import ir.tapsell.sdk.models.responseModels.TapsellNativeBannerAdModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class q50<T extends TapsellNativeBannerAdModel> {

    /* renamed from: a */
    HashMap<String, T> f12695a = new HashMap<>();

    /* renamed from: a */
    public T m14952a(String str) {
        return this.f12695a.get(str);
    }

    /* renamed from: a */
    public ArrayList m14953a() {
        return new ArrayList(this.f12695a.values());
    }

    /* renamed from: a */
    public void m14954a(T t) {
        this.f12695a.put(t.getAdSuggestion().getSuggestionId().toString(), t);
    }

    /* renamed from: a */
    public void m14955a(ArrayList<T> arrayList) {
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            T next = it.next();
            this.f12695a.put(next.getAdSuggestion().getSuggestionId().toString(), next);
        }
    }
}
