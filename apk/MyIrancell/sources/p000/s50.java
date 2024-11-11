package p000;

import android.content.Context;
import android.os.Bundle;
import ir.tapsell.sdk.AdRequestCallback;
import ir.tapsell.sdk.CacheSize;
import ir.tapsell.sdk.models.responseModels.TapsellNativeBannerAdModel;
import java.util.HashMap;

/* loaded from: classes.dex */
public class s50 {

    /* renamed from: c */
    private static s50 f13025c;

    /* renamed from: a */
    private HashMap<String, t50> f13026a = new HashMap<>();

    /* renamed from: b */
    private Context f13027b;

    private s50(Context context) {
        this.f13027b = context;
    }

    /* renamed from: a */
    public static s50 m15359a(Context context) {
        if (f13025c == null) {
            f13025c = new s50(context);
        }
        return f13025c;
    }

    /* renamed from: a */
    private <T extends TapsellNativeBannerAdModel> t50<T> m15360a(String str) {
        t50<T> t50Var = this.f13026a.get(str);
        return t50Var == null ? m15361b(str, CacheSize.NONE) : t50Var;
    }

    /* renamed from: b */
    private <T extends TapsellNativeBannerAdModel> t50<T> m15361b(String str, CacheSize cacheSize) {
        t50<T> t50Var = new t50<>(this.f13027b, str, cacheSize);
        this.f13026a.put(str, t50Var);
        return t50Var;
    }

    /* renamed from: a */
    public <T extends TapsellNativeBannerAdModel> T m15362a(String str, String str2) {
        return m15360a(str).m15534a(str2);
    }

    /* renamed from: a */
    public void m15363a(String str, Bundle bundle) {
        this.f13026a.get(str).m15535a(bundle);
    }

    /* renamed from: a */
    public <T extends TapsellNativeBannerAdModel> void m15364a(String str, AdRequestCallback adRequestCallback) {
        m15360a(str).m15536a(adRequestCallback);
    }

    /* renamed from: a */
    public void m15365a(String str, CacheSize cacheSize) {
        if (this.f13026a.containsKey(str)) {
            return;
        }
        m15361b(str, cacheSize);
    }

    /* renamed from: b */
    public void m15366b(String str, Bundle bundle) {
        m15360a(str).m15537b(bundle);
    }

    /* renamed from: b */
    public <T extends TapsellNativeBannerAdModel> void m15367b(String str, AdRequestCallback adRequestCallback) {
        m15360a(str).m15538b(adRequestCallback);
    }
}
