package ir.tapsell.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.webkit.URLUtil;
import android.webkit.WebView;
import defpackage.b70;
import defpackage.c70;
import defpackage.g50;
import defpackage.i50;
import defpackage.k50;
import defpackage.m50;
import defpackage.pa0;
import defpackage.v40;
import ir.tapsell.sdk.models.responseModels.DefaultErrorModel;
import ir.tapsell.sdk.models.responseModels.SuggestionListDirectResponseModel;
import ir.tapsell.sdk.networkcacheutils.g;
import ir.tapsell.sdk.utils.FontManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class e extends ir.tapsell.sdk.a {
    private static final Map<String, Boolean> a = Collections.synchronizedMap(new WeakHashMap());
    private static final Map<String, Runnable> b = Collections.synchronizedMap(new HashMap());
    public static Handler c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends m50<SuggestionListDirectResponseModel, DefaultErrorModel> {
        final /* synthetic */ Context b;
        final /* synthetic */ String c;
        final /* synthetic */ TapsellAdRequestOptions d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ir.tapsell.sdk.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0064a implements g.b {
            final /* synthetic */ b70 a;

            /* renamed from: ir.tapsell.sdk.e$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class RunnableC0065a implements Runnable {
                final /* synthetic */ TapsellAd b;

                RunnableC0065a(TapsellAd tapsellAd) {
                    this.b = tapsellAd;
                }

                @Override // java.lang.Runnable
                public void run() {
                    v40.a().b(a.this.c, this.b);
                }
            }

            C0064a(b70 b70Var) {
                this.a = b70Var;
            }

            @Override // ir.tapsell.sdk.networkcacheutils.g.b
            public void a(String str) {
                e.c(a.this.c);
                v40.a().a(a.this.c, str);
            }

            @Override // ir.tapsell.sdk.networkcacheutils.g.b
            public void a(String str, File file) {
                i50.a("ad file downloaded");
                TapsellAd tapsellAd = new TapsellAd();
                tapsellAd.setAd(this.a);
                tapsellAd.setCacheTime(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
                tapsellAd.setZoneId(a.this.c);
                tapsellAd.setRequestOptions(a.this.d);
                tapsellAd.setVideoFilePath(file.getAbsolutePath());
                ir.tapsell.sdk.b.a().b(a.this.b, tapsellAd);
                e.c(a.this.c);
                v40.a().a(a.this.c, tapsellAd);
                if (tapsellAd.getAd() == null || tapsellAd.getAd().getExpirationTimeInMillis() == null) {
                    return;
                }
                RunnableC0065a runnableC0065a = new RunnableC0065a(tapsellAd);
                e.b.put(tapsellAd.getZoneId(), runnableC0065a);
                e.a().postDelayed(runnableC0065a, tapsellAd.getAd().getExpirationTimeInMillis().longValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b implements Runnable {
            final /* synthetic */ TapsellAd b;

            b(TapsellAd tapsellAd) {
                this.b = tapsellAd;
            }

            @Override // java.lang.Runnable
            public void run() {
                v40.a().b(a.this.c, this.b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class c implements Runnable {
            final /* synthetic */ TapsellAd b;

            c(TapsellAd tapsellAd) {
                this.b = tapsellAd;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    new WebView(a.this.b).loadUrl(((c70) this.b.getAd().getCreative()).getCtaUrl());
                } catch (Throwable unused) {
                    i50.a("web view error");
                    e.c(a.this.c);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class d implements Runnable {
            final /* synthetic */ TapsellAd b;

            d(TapsellAd tapsellAd) {
                this.b = tapsellAd;
            }

            @Override // java.lang.Runnable
            public void run() {
                v40.a().b(a.this.c, this.b);
            }
        }

        a(Context context, String str, TapsellAdRequestOptions tapsellAdRequestOptions) {
            this.b = context;
            this.c = str;
            this.d = tapsellAdRequestOptions;
        }

        @Override // defpackage.m50
        public void a(pa0<SuggestionListDirectResponseModel> pa0Var, DefaultErrorModel defaultErrorModel) {
            e.c(this.c);
            v40.a().a(this.c, defaultErrorModel.getMessage());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.m50
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(pa0<SuggestionListDirectResponseModel> pa0Var, SuggestionListDirectResponseModel suggestionListDirectResponseModel) {
            String str;
            TapsellAd tapsellAd;
            Runnable bVar;
            if (suggestionListDirectResponseModel != null && suggestionListDirectResponseModel.getTapsellUserId() != null) {
                g.j().b(suggestionListDirectResponseModel.getTapsellUserId().toString());
            }
            if (suggestionListDirectResponseModel != null && suggestionListDirectResponseModel.getSelectDirectAdRandomly() != null && suggestionListDirectResponseModel.getSelectDirectAdRandomly().booleanValue()) {
                ir.tapsell.sdk.utils.b.a(suggestionListDirectResponseModel);
            }
            b70 a = e.a(this.b, suggestionListDirectResponseModel);
            if (a == null) {
                i50.a("suitable ad not found! :(");
                e.c(this.c);
                v40.a().b(this.c);
                return;
            }
            i50.a("suitable ad found");
            a.reportAdIsFilled(this.b, this.c, a.getSuggestionId().toString());
            if (a.getCreative() == 0 || ((c70) a.getCreative()).getCtaType() == null) {
                e.c(this.c);
                str = "The ad creative is not supported";
            } else {
                String ctaUrl = ((c70) a.getCreative()).getCtaUrl();
                int intValue = ((c70) a.getCreative()).getCtaType().intValue();
                if (intValue != 1) {
                    if (intValue == 2) {
                        i50.a("Interstitial webview ad");
                        tapsellAd = new TapsellAd();
                        tapsellAd.setAd(a);
                        tapsellAd.setCacheTime(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
                        tapsellAd.setZoneId(this.c);
                        tapsellAd.setRequestOptions(this.d);
                        tapsellAd.setVideoFilePath(null);
                        ir.tapsell.sdk.b.a().b(this.b, tapsellAd);
                        e.c(this.c);
                        v40.a().a(this.c, tapsellAd);
                        e.a().post(new c(tapsellAd));
                        if (tapsellAd.getAd() == null || tapsellAd.getAd().getExpirationTimeInMillis() == null) {
                            return;
                        }
                        bVar = new d(tapsellAd);
                        e.b.put(tapsellAd.getZoneId(), bVar);
                        e.a().postDelayed(bVar, tapsellAd.getAd().getExpirationTimeInMillis().longValue());
                        return;
                    }
                    if (intValue != 3) {
                        e.c(this.c);
                        str = "The ad cta type" + String.valueOf(((c70) a.getCreative()).getCtaType()) + " is not supported";
                    }
                }
                if (suggestionListDirectResponseModel != null && suggestionListDirectResponseModel.getServerSuggestedCacheType() == null) {
                    e.c(this.c);
                    str = "The server suggested cache type is null";
                } else {
                    if (suggestionListDirectResponseModel.getServerSuggestedCacheType().intValue() == 1) {
                        this.d.setCacheType(suggestionListDirectResponseModel.getServerSuggestedCacheType().intValue());
                        i50.a("downloading video of suitable ad");
                        String guessFileName = URLUtil.guessFileName(ctaUrl, null, null);
                        ir.tapsell.sdk.networkcacheutils.g a2 = ir.tapsell.sdk.networkcacheutils.g.a();
                        Context context = this.b;
                        a2.a(context, ctaUrl, ir.tapsell.sdk.networkcacheutils.e.a(context), guessFileName, new C0064a(a));
                        return;
                    }
                    if (suggestionListDirectResponseModel.getServerSuggestedCacheType().intValue() == 2) {
                        i50.a("streamed no need to download");
                        tapsellAd = new TapsellAd();
                        tapsellAd.setAd(a);
                        tapsellAd.setCacheTime(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
                        tapsellAd.setZoneId(this.c);
                        String guessFileName2 = URLUtil.guessFileName(ctaUrl, null, null);
                        Context context2 = this.b;
                        String a3 = ir.tapsell.sdk.networkcacheutils.g.a(context2, ir.tapsell.sdk.networkcacheutils.e.a(context2), guessFileName2);
                        if (a3 != null) {
                            this.d.setCacheType(1);
                            tapsellAd.setVideoFilePath(a3);
                        } else {
                            this.d.setCacheType(2);
                            tapsellAd.setVideoFilePath(null);
                        }
                        tapsellAd.setRequestOptions(this.d);
                        ir.tapsell.sdk.b.a().b(this.b, tapsellAd);
                        e.c(this.c);
                        v40.a().a(this.c, tapsellAd);
                        if (tapsellAd.getAd() == null || tapsellAd.getAd().getExpirationTimeInMillis() == null) {
                            return;
                        }
                        bVar = new b(tapsellAd);
                        e.b.put(tapsellAd.getZoneId(), bVar);
                        e.a().postDelayed(bVar, tapsellAd.getAd().getExpirationTimeInMillis().longValue());
                        return;
                    }
                    e.c(this.c);
                    str = "The server suggested cache type " + String.valueOf(suggestionListDirectResponseModel.getServerSuggestedCacheType()) + " ad is not supported";
                }
            }
            i50.a(str);
            v40.a().a(this.c, "This ad is not supported");
        }

        @Override // defpackage.m50
        public void a(pa0<SuggestionListDirectResponseModel> pa0Var, Throwable th) {
            e.c(this.c);
            v40.a().a(this.c, th.getMessage());
        }
    }

    public static Handler a() {
        if (c == null) {
            c = new Handler(Looper.getMainLooper());
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static b70 a(Context context, SuggestionListDirectResponseModel suggestionListDirectResponseModel) {
        if (context == null || suggestionListDirectResponseModel == null) {
            i50.a("Null context");
            return null;
        }
        ir.tapsell.sdk.utils.b.a(context, suggestionListDirectResponseModel);
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
    public static void a(int i) {
        ir.tapsell.sdk.networkcacheutils.d.a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(long j) {
        ir.tapsell.sdk.networkcacheutils.d.a(j);
    }

    public static void a(Context context) {
        FontManager.initialize(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, String str, TapsellAdRequestOptions tapsellAdRequestOptions) {
        if (context == null) {
            i50.a("null context");
            v40.a().a(str, "null context");
            return;
        }
        Pair<Integer, Integer> d = ir.tapsell.sdk.utils.d.d(context);
        int intValue = ((Integer) d.first).intValue();
        int intValue2 = ((Integer) d.second).intValue();
        i50.a("invalid strategy, refresh");
        HashMap hashMap = new HashMap();
        hashMap.put("doneCount", String.valueOf(intValue2));
        hashMap.put("doingCount", String.valueOf(intValue));
        if (str != null) {
            hashMap.put("zoneId", str);
        }
        c(context, str, tapsellAdRequestOptions);
    }

    public static void a(String str) {
        a().removeCallbacks(b.get(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        if (Build.VERSION.SDK_INT <= 16) {
            return true;
        }
        try {
            return !activity.isDestroyed();
        } catch (Throwable th) {
            g50.a(th);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TapsellAd b(Context context, String str, TapsellAdRequestOptions tapsellAdRequestOptions) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TapsellAd[] b2 = b.a().b(context);
        if (b2 != null && b2.length > 0) {
            for (TapsellAd tapsellAd : b2) {
                if (tapsellAd != null) {
                    if (!tapsellAd.isValid() || tapsellAd.isShown()) {
                        arrayList2.add(tapsellAd);
                    } else if ((tapsellAdRequestOptions == null || tapsellAdRequestOptions.isContentEqualTo(tapsellAd.getRequestOptions())) && ((tapsellAd.getZoneId() == null && str == null) || (tapsellAd.getZoneId() != null && str != null && tapsellAd.getZoneId().equalsIgnoreCase(str)))) {
                        arrayList.add(tapsellAd);
                    }
                }
            }
        }
        b.a().a(context, (TapsellAd[]) arrayList2.toArray(new TapsellAd[arrayList2.size()]));
        if (arrayList.size() > 0) {
            return (TapsellAd) arrayList.get(0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b() {
        ir.tapsell.sdk.networkcacheutils.d.a();
    }

    private static void c(Context context, String str, TapsellAdRequestOptions tapsellAdRequestOptions) {
        k50.a(str, tapsellAdRequestOptions.getCacheType(), new a(context, str, tapsellAdRequestOptions));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        a.put(str, false);
    }
}
