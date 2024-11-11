package ir.tapsell.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.webkit.URLUtil;
import android.webkit.WebView;
import ir.tapsell.sdk.models.responseModels.DefaultErrorModel;
import ir.tapsell.sdk.models.responseModels.SuggestionListDirectResponseModel;
import ir.tapsell.sdk.networkcacheutils.C2750d;
import ir.tapsell.sdk.networkcacheutils.C2751e;
import ir.tapsell.sdk.networkcacheutils.C2753g;
import ir.tapsell.sdk.utils.C2760b;
import ir.tapsell.sdk.utils.C2762d;
import ir.tapsell.sdk.utils.FontManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p000.b70;
import p000.c70;
import p000.g50;
import p000.i50;
import p000.k50;
import p000.m50;
import p000.pa0;
import p000.v40;

/* renamed from: ir.tapsell.sdk.e */
/* loaded from: classes.dex */
public class C2686e extends C2670a {

    /* renamed from: a */
    private static final Map<String, Boolean> f11004a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private static final Map<String, Runnable> f11005b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    public static Handler f11006c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.e$a */
    /* loaded from: classes.dex */
    public class a extends m50<SuggestionListDirectResponseModel, DefaultErrorModel> {

        /* renamed from: b */
        final /* synthetic */ Context f11007b;

        /* renamed from: c */
        final /* synthetic */ String f11008c;

        /* renamed from: d */
        final /* synthetic */ TapsellAdRequestOptions f11009d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ir.tapsell.sdk.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C3569a implements C2753g.b {

            /* renamed from: a */
            final /* synthetic */ b70 f11010a;

            /* renamed from: ir.tapsell.sdk.e$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class RunnableC3570a implements Runnable {

                /* renamed from: b */
                final /* synthetic */ TapsellAd f11012b;

                RunnableC3570a(TapsellAd tapsellAd) {
                    this.f11012b = tapsellAd;
                }

                @Override // java.lang.Runnable
                public void run() {
                    v40.m15925a().m15936b(a.this.f11008c, this.f11012b);
                }
            }

            C3569a(b70 b70Var) {
                this.f11010a = b70Var;
            }

            @Override // ir.tapsell.sdk.networkcacheutils.C2753g.b
            /* renamed from: a */
            public void mo12857a(String str) {
                C2686e.m12887c(a.this.f11008c);
                v40.m15925a().m15934a(a.this.f11008c, str);
            }

            @Override // ir.tapsell.sdk.networkcacheutils.C2753g.b
            /* renamed from: a */
            public void mo12858a(String str, File file) {
                i50.m12368a("ad file downloaded");
                TapsellAd tapsellAd = new TapsellAd();
                tapsellAd.setAd(this.f11010a);
                tapsellAd.setCacheTime(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
                tapsellAd.setZoneId(a.this.f11008c);
                tapsellAd.setRequestOptions(a.this.f11009d);
                tapsellAd.setVideoFilePath(file.getAbsolutePath());
                C2671b.m12861a().m12868b(a.this.f11007b, tapsellAd);
                C2686e.m12887c(a.this.f11008c);
                v40.m15925a().m15931a(a.this.f11008c, tapsellAd);
                if (tapsellAd.getAd() == null || tapsellAd.getAd().getExpirationTimeInMillis() == null) {
                    return;
                }
                RunnableC3570a runnableC3570a = new RunnableC3570a(tapsellAd);
                C2686e.f11005b.put(tapsellAd.getZoneId(), runnableC3570a);
                C2686e.m12874a().postDelayed(runnableC3570a, tapsellAd.getAd().getExpirationTimeInMillis().longValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ir.tapsell.sdk.e$a$b */
        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: b */
            final /* synthetic */ TapsellAd f11014b;

            b(TapsellAd tapsellAd) {
                this.f11014b = tapsellAd;
            }

            @Override // java.lang.Runnable
            public void run() {
                v40.m15925a().m15936b(a.this.f11008c, this.f11014b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ir.tapsell.sdk.e$a$c */
        /* loaded from: classes.dex */
        public class c implements Runnable {

            /* renamed from: b */
            final /* synthetic */ TapsellAd f11016b;

            c(TapsellAd tapsellAd) {
                this.f11016b = tapsellAd;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    new WebView(a.this.f11007b).loadUrl(((c70) this.f11016b.getAd().getCreative()).getCtaUrl());
                } catch (Throwable unused) {
                    i50.m12368a("web view error");
                    C2686e.m12887c(a.this.f11008c);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ir.tapsell.sdk.e$a$d */
        /* loaded from: classes.dex */
        public class d implements Runnable {

            /* renamed from: b */
            final /* synthetic */ TapsellAd f11018b;

            d(TapsellAd tapsellAd) {
                this.f11018b = tapsellAd;
            }

            @Override // java.lang.Runnable
            public void run() {
                v40.m15925a().m15936b(a.this.f11008c, this.f11018b);
            }
        }

        a(Context context, String str, TapsellAdRequestOptions tapsellAdRequestOptions) {
            this.f11007b = context;
            this.f11008c = str;
            this.f11009d = tapsellAdRequestOptions;
        }

        @Override // p000.m50
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo12854a(pa0<SuggestionListDirectResponseModel> pa0Var, DefaultErrorModel defaultErrorModel) {
            C2686e.m12887c(this.f11008c);
            v40.m15925a().m15934a(this.f11008c, defaultErrorModel.getMessage());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.m50
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo12856b(pa0<SuggestionListDirectResponseModel> pa0Var, SuggestionListDirectResponseModel suggestionListDirectResponseModel) {
            String str;
            TapsellAd tapsellAd;
            Runnable bVar;
            if (suggestionListDirectResponseModel != null && suggestionListDirectResponseModel.getTapsellUserId() != null) {
                C2688g.m12913j().m12919b(suggestionListDirectResponseModel.getTapsellUserId().toString());
            }
            if (suggestionListDirectResponseModel != null && suggestionListDirectResponseModel.getSelectDirectAdRandomly() != null && suggestionListDirectResponseModel.getSelectDirectAdRandomly().booleanValue()) {
                C2760b.m13134a(suggestionListDirectResponseModel);
            }
            b70 m12875a = C2686e.m12875a(this.f11007b, suggestionListDirectResponseModel);
            if (m12875a == null) {
                i50.m12368a("suitable ad not found! :(");
                C2686e.m12887c(this.f11008c);
                v40.m15925a().m15935b(this.f11008c);
                return;
            }
            i50.m12368a("suitable ad found");
            m12875a.reportAdIsFilled(this.f11007b, this.f11008c, m12875a.getSuggestionId().toString());
            if (m12875a.getCreative() == 0 || ((c70) m12875a.getCreative()).getCtaType() == null) {
                C2686e.m12887c(this.f11008c);
                str = "The ad creative is not supported";
            } else {
                String ctaUrl = ((c70) m12875a.getCreative()).getCtaUrl();
                int intValue = ((c70) m12875a.getCreative()).getCtaType().intValue();
                if (intValue != 1) {
                    if (intValue == 2) {
                        i50.m12368a("Interstitial webview ad");
                        tapsellAd = new TapsellAd();
                        tapsellAd.setAd(m12875a);
                        tapsellAd.setCacheTime(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
                        tapsellAd.setZoneId(this.f11008c);
                        tapsellAd.setRequestOptions(this.f11009d);
                        tapsellAd.setVideoFilePath(null);
                        C2671b.m12861a().m12868b(this.f11007b, tapsellAd);
                        C2686e.m12887c(this.f11008c);
                        v40.m15925a().m15931a(this.f11008c, tapsellAd);
                        C2686e.m12874a().post(new c(tapsellAd));
                        if (tapsellAd.getAd() == null || tapsellAd.getAd().getExpirationTimeInMillis() == null) {
                            return;
                        }
                        bVar = new d(tapsellAd);
                        C2686e.f11005b.put(tapsellAd.getZoneId(), bVar);
                        C2686e.m12874a().postDelayed(bVar, tapsellAd.getAd().getExpirationTimeInMillis().longValue());
                        return;
                    }
                    if (intValue != 3) {
                        C2686e.m12887c(this.f11008c);
                        str = "The ad cta type" + String.valueOf(((c70) m12875a.getCreative()).getCtaType()) + " is not supported";
                    }
                }
                if (suggestionListDirectResponseModel != null && suggestionListDirectResponseModel.getServerSuggestedCacheType() == null) {
                    C2686e.m12887c(this.f11008c);
                    str = "The server suggested cache type is null";
                } else {
                    if (suggestionListDirectResponseModel.getServerSuggestedCacheType().intValue() == 1) {
                        this.f11009d.setCacheType(suggestionListDirectResponseModel.getServerSuggestedCacheType().intValue());
                        i50.m12368a("downloading video of suitable ad");
                        String guessFileName = URLUtil.guessFileName(ctaUrl, null, null);
                        C2753g m13118a = C2753g.m13118a();
                        Context context = this.f11007b;
                        m13118a.m13123a(context, ctaUrl, C2751e.m13102a(context), guessFileName, new C3569a(m12875a));
                        return;
                    }
                    if (suggestionListDirectResponseModel.getServerSuggestedCacheType().intValue() == 2) {
                        i50.m12368a("streamed no need to download");
                        tapsellAd = new TapsellAd();
                        tapsellAd.setAd(m12875a);
                        tapsellAd.setCacheTime(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
                        tapsellAd.setZoneId(this.f11008c);
                        String guessFileName2 = URLUtil.guessFileName(ctaUrl, null, null);
                        Context context2 = this.f11007b;
                        String m13120a = C2753g.m13120a(context2, C2751e.m13102a(context2), guessFileName2);
                        if (m13120a != null) {
                            this.f11009d.setCacheType(1);
                            tapsellAd.setVideoFilePath(m13120a);
                        } else {
                            this.f11009d.setCacheType(2);
                            tapsellAd.setVideoFilePath(null);
                        }
                        tapsellAd.setRequestOptions(this.f11009d);
                        C2671b.m12861a().m12868b(this.f11007b, tapsellAd);
                        C2686e.m12887c(this.f11008c);
                        v40.m15925a().m15931a(this.f11008c, tapsellAd);
                        if (tapsellAd.getAd() == null || tapsellAd.getAd().getExpirationTimeInMillis() == null) {
                            return;
                        }
                        bVar = new b(tapsellAd);
                        C2686e.f11005b.put(tapsellAd.getZoneId(), bVar);
                        C2686e.m12874a().postDelayed(bVar, tapsellAd.getAd().getExpirationTimeInMillis().longValue());
                        return;
                    }
                    C2686e.m12887c(this.f11008c);
                    str = "The server suggested cache type " + String.valueOf(suggestionListDirectResponseModel.getServerSuggestedCacheType()) + " ad is not supported";
                }
            }
            i50.m12368a(str);
            v40.m15925a().m15934a(this.f11008c, "This ad is not supported");
        }

        @Override // p000.m50
        /* renamed from: a */
        public void mo12855a(pa0<SuggestionListDirectResponseModel> pa0Var, Throwable th) {
            C2686e.m12887c(this.f11008c);
            v40.m15925a().m15934a(this.f11008c, th.getMessage());
        }
    }

    /* renamed from: a */
    public static Handler m12874a() {
        if (f11006c == null) {
            f11006c = new Handler(Looper.getMainLooper());
        }
        return f11006c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static b70 m12875a(Context context, SuggestionListDirectResponseModel suggestionListDirectResponseModel) {
        if (context == null || suggestionListDirectResponseModel == null) {
            i50.m12368a("Null context");
            return null;
        }
        C2760b.m13133a(context, suggestionListDirectResponseModel);
        if (suggestionListDirectResponseModel.getSuggestions() != null && suggestionListDirectResponseModel.getSuggestions().size() > 0) {
            Iterator<b70> it = suggestionListDirectResponseModel.getSuggestions().iterator();
            while (it.hasNext()) {
                b70 next = it.next();
                if (next.getCreative() == 0 || ((c70) next.getCreative()).getCtaUrl() == null || ((c70) next.getCreative()).getCtaType() == null || !((c70) next.getCreative()).isSupported()) {
                    it.remove();
                }
            }
        }
        if (suggestionListDirectResponseModel.getSuggestions() == null || suggestionListDirectResponseModel.getSuggestions().size() == 0) {
            return null;
        }
        return suggestionListDirectResponseModel.getSuggestions().get(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12876a(int i) {
        C2750d.m13096a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12877a(long j) {
        C2750d.m13097a(j);
    }

    /* renamed from: a */
    public static void m12878a(Context context) {
        FontManager.initialize(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12879a(Context context, String str, TapsellAdRequestOptions tapsellAdRequestOptions) {
        if (context == null) {
            i50.m12368a("null context");
            v40.m15925a().m15934a(str, "null context");
            return;
        }
        Pair<Integer, Integer> m13140d = C2762d.m13140d(context);
        int intValue = ((Integer) m13140d.first).intValue();
        int intValue2 = ((Integer) m13140d.second).intValue();
        i50.m12368a("invalid strategy, refresh");
        HashMap hashMap = new HashMap();
        hashMap.put("doneCount", String.valueOf(intValue2));
        hashMap.put("doingCount", String.valueOf(intValue));
        if (str != null) {
            hashMap.put("zoneId", str);
        }
        m12886c(context, str, tapsellAdRequestOptions);
    }

    /* renamed from: a */
    public static void m12880a(String str) {
        m12874a().removeCallbacks(f11005b.get(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m12881a(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        if (Build.VERSION.SDK_INT <= 16) {
            return true;
        }
        try {
            return !activity.isDestroyed();
        } catch (Throwable th) {
            g50.m11895a(th);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static TapsellAd m12882b(Context context, String str, TapsellAdRequestOptions tapsellAdRequestOptions) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TapsellAd[] m12869b = C2671b.m12861a().m12869b(context);
        if (m12869b != null && m12869b.length > 0) {
            for (TapsellAd tapsellAd : m12869b) {
                if (tapsellAd != null) {
                    if (!tapsellAd.isValid() || tapsellAd.isShown()) {
                        arrayList2.add(tapsellAd);
                    } else if ((tapsellAdRequestOptions == null || tapsellAdRequestOptions.isContentEqualTo(tapsellAd.getRequestOptions())) && ((tapsellAd.getZoneId() == null && str == null) || (tapsellAd.getZoneId() != null && str != null && tapsellAd.getZoneId().equalsIgnoreCase(str)))) {
                        arrayList.add(tapsellAd);
                    }
                }
            }
        }
        C2671b.m12861a().m12865a(context, (TapsellAd[]) arrayList2.toArray(new TapsellAd[arrayList2.size()]));
        if (arrayList.size() > 0) {
            return (TapsellAd) arrayList.get(0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m12883b() {
        C2750d.m13095a();
    }

    /* renamed from: c */
    private static void m12886c(Context context, String str, TapsellAdRequestOptions tapsellAdRequestOptions) {
        k50.m13614a(str, tapsellAdRequestOptions.getCacheType(), new a(context, str, tapsellAdRequestOptions));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m12887c(String str) {
        f11004a.put(str, false);
    }
}
