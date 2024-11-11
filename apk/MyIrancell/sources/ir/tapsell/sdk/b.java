package ir.tapsell.sdk;

import android.content.Context;
import defpackage.g50;
import ir.tapsell.sdk.models.internalModels.ClientDoneAndDoingRecordCache;
import ir.tapsell.sdk.utils.GsonHelper;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public class b {
    private static final Semaphore a = new Semaphore(1);
    private static b b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        final /* synthetic */ Context b;
        final /* synthetic */ TapsellAd c;

        a(b bVar, Context context, TapsellAd tapsellAd) {
            this.b = context;
            this.c = tapsellAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            ir.tapsell.sdk.utils.e.a(this.b).b(this.c);
        }
    }

    public static b a() {
        if (b == null) {
            try {
                a.acquire();
            } catch (Throwable th) {
                g50.a(th);
            }
            if (b == null) {
                b = new b();
            }
            a.release();
        }
        return b;
    }

    private String a(Context context, String str) {
        if (context == null) {
            return null;
        }
        return ir.tapsell.sdk.utils.e.a(context).c(str, null);
    }

    private void a(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        ir.tapsell.sdk.utils.e.a(context).a(str, str2);
    }

    public void a(Context context, TapsellAd tapsellAd) {
        if (context == null || tapsellAd == null || tapsellAd.getAd() == null || tapsellAd.getAd().getSuggestionId() == null) {
            return;
        }
        ir.tapsell.sdk.utils.e.a(context).a(tapsellAd);
    }

    public void a(Context context, TapsellAd[] tapsellAdArr) {
        if (context == null || tapsellAdArr == null || tapsellAdArr.length == 0) {
            return;
        }
        for (TapsellAd tapsellAd : tapsellAdArr) {
            a(context, tapsellAd);
        }
    }

    public void a(Context context, ClientDoneAndDoingRecordCache[] clientDoneAndDoingRecordCacheArr) {
        a(context, "client-done-doing-record", clientDoneAndDoingRecordCacheArr == null ? null : GsonHelper.getCustomGson().toJson(clientDoneAndDoingRecordCacheArr));
    }

    public ClientDoneAndDoingRecordCache[] a(Context context) {
        String a2 = a(context, "client-done-doing-record");
        if (a2 == null) {
            return null;
        }
        return (ClientDoneAndDoingRecordCache[]) GsonHelper.getCustomGson().fromJson(a2, ClientDoneAndDoingRecordCache[].class);
    }

    public void b(Context context, TapsellAd tapsellAd) {
        if (context == null || tapsellAd == null || tapsellAd.getAd() == null) {
            return;
        }
        ir.tapsell.sdk.utils.e.a(new a(this, context, tapsellAd));
    }

    public TapsellAd[] b(Context context) {
        return context == null ? new TapsellAd[0] : ir.tapsell.sdk.utils.e.a(context).a();
    }
}
