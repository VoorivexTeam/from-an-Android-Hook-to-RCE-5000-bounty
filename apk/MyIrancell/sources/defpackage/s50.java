package defpackage;

import android.content.Context;
import android.os.Bundle;
import ir.tapsell.sdk.AdRequestCallback;
import ir.tapsell.sdk.CacheSize;
import ir.tapsell.sdk.models.responseModels.TapsellNativeBannerAdModel;
import java.util.HashMap;

/* loaded from: classes.dex */
public class s50 {
    private static s50 c;
    private HashMap<String, t50> a = new HashMap<>();
    private Context b;

    private s50(Context context) {
        this.b = context;
    }

    public static s50 a(Context context) {
        if (c == null) {
            c = new s50(context);
        }
        return c;
    }

    private <T extends TapsellNativeBannerAdModel> t50<T> a(String str) {
        t50<T> t50Var = this.a.get(str);
        return t50Var == null ? b(str, CacheSize.NONE) : t50Var;
    }

    private <T extends TapsellNativeBannerAdModel> t50<T> b(String str, CacheSize cacheSize) {
        t50<T> t50Var = new t50<>(this.b, str, cacheSize);
        this.a.put(str, t50Var);
        return t50Var;
    }

    public <T extends TapsellNativeBannerAdModel> T a(String str, String str2) {
        return a(str).a(str2);
    }

    public void a(String str, Bundle bundle) {
        this.a.get(str).a(bundle);
    }

    public <T extends TapsellNativeBannerAdModel> void a(String str, AdRequestCallback adRequestCallback) {
        a(str).a(adRequestCallback);
    }

    public void a(String str, CacheSize cacheSize) {
        if (this.a.containsKey(str)) {
            return;
        }
        b(str, cacheSize);
    }

    public void b(String str, Bundle bundle) {
        a(str).b(bundle);
    }

    public <T extends TapsellNativeBannerAdModel> void b(String str, AdRequestCallback adRequestCallback) {
        a(str).b(adRequestCallback);
    }
}
