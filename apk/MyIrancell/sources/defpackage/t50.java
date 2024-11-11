package defpackage;

import android.content.Context;
import android.os.Bundle;
import ir.metrix.sdk.Metrix;
import ir.tapsell.sdk.AdRequestCallback;
import ir.tapsell.sdk.CacheSize;
import ir.tapsell.sdk.models.responseModels.SuggestionListNativeBannerResponseModel;
import ir.tapsell.sdk.models.responseModels.TapsellNativeBannerAdModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public class t50<T extends TapsellNativeBannerAdModel> {
    private static final Semaphore k = new Semaphore(1);
    private final String a;
    private final String b;
    private int e;
    private int h;
    private Context i;
    private String j = "RepositoryManager";
    private q50<T> c = new q50<>();
    private List<String> d = new ArrayList();
    private List<AdRequestCallback> f = new ArrayList();
    private List<AdRequestCallback> g = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements p50<SuggestionListNativeBannerResponseModel> {
        a() {
        }

        @Override // defpackage.p50
        public void a(SuggestionListNativeBannerResponseModel suggestionListNativeBannerResponseModel) {
            t50 t50Var = t50.this;
            t50Var.a(t50Var.b, suggestionListNativeBannerResponseModel);
        }

        @Override // defpackage.p50
        public void a(String str) {
            t50.this.b(str);
        }
    }

    public t50(Context context, String str, CacheSize cacheSize) {
        this.i = context;
        this.b = str;
        this.a = "STORE_" + str;
        h50.a(false, this.j, "create repository");
        a(cacheSize);
    }

    private void a() {
        if (k.tryAcquire()) {
            b();
        } else {
            h50.a(this.j, "previous request is still trying ...");
        }
    }

    private void a(CacheSize cacheSize) {
        if (cacheSize == CacheSize.MEDIUM) {
            this.e = 5;
            h50.c(false, this.j, "set cache size 5");
            c();
        } else if (cacheSize != CacheSize.SMALL) {
            this.e = 0;
            h50.c(false, this.j, "set cache size 0");
        } else {
            this.e = 2;
            h50.c(false, this.j, "set cache size 2");
            c();
        }
    }

    private void a(T t) {
        t.setFilledStateReported(true);
        t.getAdSuggestion().reportAdIsFilled(this.i, this.b, t.getAdSuggestion().getSuggestionId().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(String str, SuggestionListNativeBannerResponseModel suggestionListNativeBannerResponseModel) {
        h50.b(false, "successful ad request");
        this.h = 0;
        k.release();
        TapsellNativeBannerAdModel tapsellNativeBannerAdModel = new TapsellNativeBannerAdModel();
        tapsellNativeBannerAdModel.setAdSuggestion(suggestionListNativeBannerResponseModel.getSuggestions().get(0));
        tapsellNativeBannerAdModel.setZoneId(str);
        b((t50<T>) tapsellNativeBannerAdModel);
        a((t50<T>) tapsellNativeBannerAdModel);
        d();
        c();
    }

    private void b() {
        h50.c(false, this.j, "request ad ...");
        HashMap hashMap = new HashMap();
        hashMap.put("METRIX_DATA_ZONE_ID", this.b);
        hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.K().n().getUserId());
        Metrix.getInstance().newEvent("mxzqz", hashMap, null);
        r50.a(this.i, this.b, new a());
    }

    private void b(T t) {
        h50.c(false, this.j, "new ad stored in cache");
        this.c.a((q50<T>) t);
        this.d.add(t.getAdSuggestion().getSuggestionId().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        this.h++;
        h50.b(this.j, "request failed " + this.h + " time!");
        k.release();
        if (this.h > 3) {
            c(str);
        } else {
            c();
        }
    }

    private void c() {
        if (this.d.size() <= this.e) {
            h50.c(false, this.j, "request ad to fill cache up to minimumCacheSize");
            a();
        }
    }

    private void c(String str) {
        d(str);
        e(str);
    }

    private void d() {
        e();
        f();
    }

    private void d(String str) {
        if (this.f.isEmpty()) {
            return;
        }
        this.f.remove(0).onFailed(str);
        h50.c(false, this.j, "call failed callback");
    }

    private void e() {
        while (!this.f.isEmpty()) {
            int size = this.d.size();
            int i = this.e;
            if (size < i) {
                return;
            }
            String[] strArr = new String[i];
            for (int i2 = 0; i2 < this.e; i2++) {
                strArr[i2] = this.d.remove(0);
            }
            this.f.remove(0).onResponse(strArr);
            c();
        }
    }

    private void e(String str) {
        while (!this.g.isEmpty()) {
            this.g.remove(0).onFailed(str);
            h50.c(false, this.j, "call failed callback");
        }
    }

    private void f() {
        while (!this.g.isEmpty() && !this.d.isEmpty()) {
            this.g.remove(0).onResponse(new String[]{this.d.remove(0)});
            c();
        }
    }

    public T a(String str) {
        return this.c.a(str);
    }

    public void a(Bundle bundle) {
        h50.c(false, this.j, "put cache in save state");
        bundle.putSerializable(this.a, this.c.a());
    }

    public void a(AdRequestCallback adRequestCallback) {
        this.g.add(adRequestCallback);
        if (this.d.isEmpty()) {
            h50.c(false, this.j, "unusedAds is empty");
            a();
        }
        d();
    }

    public void b(Bundle bundle) {
        h50.c(false, this.j, "restore cache from save state");
        this.c.a((ArrayList) bundle.getSerializable(this.a));
    }

    public void b(AdRequestCallback adRequestCallback) {
        this.f.add(adRequestCallback);
        if (this.d.size() < this.e) {
            a();
        }
        d();
    }
}
