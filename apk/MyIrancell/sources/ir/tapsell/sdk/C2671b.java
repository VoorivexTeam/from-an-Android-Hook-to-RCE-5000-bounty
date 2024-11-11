package ir.tapsell.sdk;

import android.content.Context;
import ir.tapsell.sdk.models.internalModels.ClientDoneAndDoingRecordCache;
import ir.tapsell.sdk.utils.C2763e;
import ir.tapsell.sdk.utils.GsonHelper;
import java.util.concurrent.Semaphore;
import p000.g50;

/* renamed from: ir.tapsell.sdk.b */
/* loaded from: classes.dex */
public class C2671b {

    /* renamed from: a */
    private static final Semaphore f10986a = new Semaphore(1);

    /* renamed from: b */
    private static C2671b f10987b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.b$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Context f10988b;

        /* renamed from: c */
        final /* synthetic */ TapsellAd f10989c;

        a(C2671b c2671b, Context context, TapsellAd tapsellAd) {
            this.f10988b = context;
            this.f10989c = tapsellAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2763e.m13141a(this.f10988b).m13151b(this.f10989c);
        }
    }

    /* renamed from: a */
    public static C2671b m12861a() {
        if (f10987b == null) {
            try {
                f10986a.acquire();
            } catch (Throwable th) {
                g50.m11895a(th);
            }
            if (f10987b == null) {
                f10987b = new C2671b();
            }
            f10986a.release();
        }
        return f10987b;
    }

    /* renamed from: a */
    private String m12862a(Context context, String str) {
        if (context == null) {
            return null;
        }
        return C2763e.m13141a(context).m13153c(str, null);
    }

    /* renamed from: a */
    private void m12863a(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        C2763e.m13141a(context).m13147a(str, str2);
    }

    /* renamed from: a */
    public void m12864a(Context context, TapsellAd tapsellAd) {
        if (context == null || tapsellAd == null || tapsellAd.getAd() == null || tapsellAd.getAd().getSuggestionId() == null) {
            return;
        }
        C2763e.m13141a(context).m13146a(tapsellAd);
    }

    /* renamed from: a */
    public void m12865a(Context context, TapsellAd[] tapsellAdArr) {
        if (context == null || tapsellAdArr == null || tapsellAdArr.length == 0) {
            return;
        }
        for (TapsellAd tapsellAd : tapsellAdArr) {
            m12864a(context, tapsellAd);
        }
    }

    /* renamed from: a */
    public void m12866a(Context context, ClientDoneAndDoingRecordCache[] clientDoneAndDoingRecordCacheArr) {
        m12863a(context, "client-done-doing-record", clientDoneAndDoingRecordCacheArr == null ? null : GsonHelper.getCustomGson().toJson(clientDoneAndDoingRecordCacheArr));
    }

    /* renamed from: a */
    public ClientDoneAndDoingRecordCache[] m12867a(Context context) {
        String m12862a = m12862a(context, "client-done-doing-record");
        if (m12862a == null) {
            return null;
        }
        return (ClientDoneAndDoingRecordCache[]) GsonHelper.getCustomGson().fromJson(m12862a, ClientDoneAndDoingRecordCache[].class);
    }

    /* renamed from: b */
    public void m12868b(Context context, TapsellAd tapsellAd) {
        if (context == null || tapsellAd == null || tapsellAd.getAd() == null) {
            return;
        }
        C2763e.m13143a(new a(this, context, tapsellAd));
    }

    /* renamed from: b */
    public TapsellAd[] m12869b(Context context) {
        return context == null ? new TapsellAd[0] : C2763e.m13141a(context).m13150a();
    }
}
