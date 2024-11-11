package p000;

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

    /* renamed from: k */
    private static final Semaphore f13199k = new Semaphore(1);

    /* renamed from: a */
    private final String f13200a;

    /* renamed from: b */
    private final String f13201b;

    /* renamed from: e */
    private int f13204e;

    /* renamed from: h */
    private int f13207h;

    /* renamed from: i */
    private Context f13208i;

    /* renamed from: j */
    private String f13209j = "RepositoryManager";

    /* renamed from: c */
    private q50<T> f13202c = new q50<>();

    /* renamed from: d */
    private List<String> f13203d = new ArrayList();

    /* renamed from: f */
    private List<AdRequestCallback> f13205f = new ArrayList();

    /* renamed from: g */
    private List<AdRequestCallback> f13206g = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t50$a */
    /* loaded from: classes.dex */
    public class C3239a implements p50<SuggestionListNativeBannerResponseModel> {
        C3239a() {
        }

        @Override // p000.p50
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo14716a(SuggestionListNativeBannerResponseModel suggestionListNativeBannerResponseModel) {
            t50 t50Var = t50.this;
            t50Var.m15521a(t50Var.f13201b, suggestionListNativeBannerResponseModel);
        }

        @Override // p000.p50
        /* renamed from: a */
        public void mo14717a(String str) {
            t50.this.m15526b(str);
        }
    }

    public t50(Context context, String str, CacheSize cacheSize) {
        this.f13208i = context;
        this.f13201b = str;
        this.f13200a = "STORE_" + str;
        h50.m12127a(false, this.f13209j, "create repository");
        m15519a(cacheSize);
    }

    /* renamed from: a */
    private void m15518a() {
        if (f13199k.tryAcquire()) {
            m15524b();
        } else {
            h50.m12121a(this.f13209j, "previous request is still trying ...");
        }
    }

    /* renamed from: a */
    private void m15519a(CacheSize cacheSize) {
        if (cacheSize == CacheSize.MEDIUM) {
            this.f13204e = 5;
            h50.m12135c(false, this.f13209j, "set cache size 5");
            m15527c();
        } else if (cacheSize != CacheSize.SMALL) {
            this.f13204e = 0;
            h50.m12135c(false, this.f13209j, "set cache size 0");
        } else {
            this.f13204e = 2;
            h50.m12135c(false, this.f13209j, "set cache size 2");
            m15527c();
        }
    }

    /* renamed from: a */
    private void m15520a(T t) {
        t.setFilledStateReported(true);
        t.getAdSuggestion().reportAdIsFilled(this.f13208i, this.f13201b, t.getAdSuggestion().getSuggestionId().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m15521a(String str, SuggestionListNativeBannerResponseModel suggestionListNativeBannerResponseModel) {
        h50.m12133b(false, "successful ad request");
        this.f13207h = 0;
        f13199k.release();
        TapsellNativeBannerAdModel tapsellNativeBannerAdModel = new TapsellNativeBannerAdModel();
        tapsellNativeBannerAdModel.setAdSuggestion(suggestionListNativeBannerResponseModel.getSuggestions().get(0));
        tapsellNativeBannerAdModel.setZoneId(str);
        m15525b((t50<T>) tapsellNativeBannerAdModel);
        m15520a((t50<T>) tapsellNativeBannerAdModel);
        m15529d();
        m15527c();
    }

    /* renamed from: b */
    private void m15524b() {
        h50.m12135c(false, this.f13209j, "request ad ...");
        HashMap hashMap = new HashMap();
        hashMap.put("METRIX_DATA_ZONE_ID", this.f13201b);
        hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.m16734K().m16757n().getUserId());
        Metrix.getInstance().newEvent("mxzqz", hashMap, null);
        r50.m15207a(this.f13208i, this.f13201b, new C3239a());
    }

    /* renamed from: b */
    private void m15525b(T t) {
        h50.m12135c(false, this.f13209j, "new ad stored in cache");
        this.f13202c.m14954a((q50<T>) t);
        this.f13203d.add(t.getAdSuggestion().getSuggestionId().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m15526b(String str) {
        this.f13207h++;
        h50.m12132b(this.f13209j, "request failed " + this.f13207h + " time!");
        f13199k.release();
        if (this.f13207h > 3) {
            m15528c(str);
        } else {
            m15527c();
        }
    }

    /* renamed from: c */
    private void m15527c() {
        if (this.f13203d.size() <= this.f13204e) {
            h50.m12135c(false, this.f13209j, "request ad to fill cache up to minimumCacheSize");
            m15518a();
        }
    }

    /* renamed from: c */
    private void m15528c(String str) {
        m15530d(str);
        m15532e(str);
    }

    /* renamed from: d */
    private void m15529d() {
        m15531e();
        m15533f();
    }

    /* renamed from: d */
    private void m15530d(String str) {
        if (this.f13205f.isEmpty()) {
            return;
        }
        this.f13205f.remove(0).onFailed(str);
        h50.m12135c(false, this.f13209j, "call failed callback");
    }

    /* renamed from: e */
    private void m15531e() {
        while (!this.f13205f.isEmpty()) {
            int size = this.f13203d.size();
            int i = this.f13204e;
            if (size < i) {
                return;
            }
            String[] strArr = new String[i];
            for (int i2 = 0; i2 < this.f13204e; i2++) {
                strArr[i2] = this.f13203d.remove(0);
            }
            this.f13205f.remove(0).onResponse(strArr);
            m15527c();
        }
    }

    /* renamed from: e */
    private void m15532e(String str) {
        while (!this.f13206g.isEmpty()) {
            this.f13206g.remove(0).onFailed(str);
            h50.m12135c(false, this.f13209j, "call failed callback");
        }
    }

    /* renamed from: f */
    private void m15533f() {
        while (!this.f13206g.isEmpty() && !this.f13203d.isEmpty()) {
            this.f13206g.remove(0).onResponse(new String[]{this.f13203d.remove(0)});
            m15527c();
        }
    }

    /* renamed from: a */
    public T m15534a(String str) {
        return this.f13202c.m14952a(str);
    }

    /* renamed from: a */
    public void m15535a(Bundle bundle) {
        h50.m12135c(false, this.f13209j, "put cache in save state");
        bundle.putSerializable(this.f13200a, this.f13202c.m14953a());
    }

    /* renamed from: a */
    public void m15536a(AdRequestCallback adRequestCallback) {
        this.f13206g.add(adRequestCallback);
        if (this.f13203d.isEmpty()) {
            h50.m12135c(false, this.f13209j, "unusedAds is empty");
            m15518a();
        }
        m15529d();
    }

    /* renamed from: b */
    public void m15537b(Bundle bundle) {
        h50.m12135c(false, this.f13209j, "restore cache from save state");
        this.f13202c.m14955a((ArrayList) bundle.getSerializable(this.f13200a));
    }

    /* renamed from: b */
    public void m15538b(AdRequestCallback adRequestCallback) {
        this.f13205f.add(adRequestCallback);
        if (this.f13203d.size() < this.f13204e) {
            m15518a();
        }
        m15529d();
    }
}
