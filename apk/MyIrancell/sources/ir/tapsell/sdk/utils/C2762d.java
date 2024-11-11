package ir.tapsell.sdk.utils;

import android.content.Context;
import android.util.Pair;
import ir.tapsell.sdk.C2671b;
import ir.tapsell.sdk.models.internalModels.ClientDoneAndDoingRecordCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: ir.tapsell.sdk.utils.d */
/* loaded from: classes.dex */
public class C2762d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.utils.d$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Context f11260b;

        /* renamed from: c */
        final /* synthetic */ int f11261c;

        a(Context context, int i) {
            this.f11260b = context;
            this.f11261c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ClientDoneAndDoingRecordCache[] m12867a = C2671b.m12861a().m12867a(this.f11260b);
            if (m12867a == null) {
                ClientDoneAndDoingRecordCache clientDoneAndDoingRecordCache = new ClientDoneAndDoingRecordCache();
                clientDoneAndDoingRecordCache.setState(this.f11261c);
                clientDoneAndDoingRecordCache.setRecordTimeInMillis(System.currentTimeMillis());
                C2671b.m12861a().m12866a(this.f11260b, new ClientDoneAndDoingRecordCache[]{clientDoneAndDoingRecordCache});
                return;
            }
            ArrayList arrayList = new ArrayList(Arrays.asList(m12867a));
            ClientDoneAndDoingRecordCache clientDoneAndDoingRecordCache2 = new ClientDoneAndDoingRecordCache();
            clientDoneAndDoingRecordCache2.setState(this.f11261c);
            clientDoneAndDoingRecordCache2.setRecordTimeInMillis(System.currentTimeMillis());
            arrayList.add(clientDoneAndDoingRecordCache2);
            C2671b.m12861a().m12866a(this.f11260b, (ClientDoneAndDoingRecordCache[]) arrayList.toArray(new ClientDoneAndDoingRecordCache[arrayList.size()]));
        }
    }

    /* renamed from: a */
    public static void m13136a(Context context) {
        m13137a(context, 3);
    }

    /* renamed from: a */
    private static void m13137a(Context context, int i) {
        C2763e.m13143a(new a(context, i));
    }

    /* renamed from: b */
    public static void m13138b(Context context) {
        m13137a(context, 2);
    }

    /* renamed from: c */
    public static ClientDoneAndDoingRecordCache[] m13139c(Context context) {
        ClientDoneAndDoingRecordCache[] m12867a = C2671b.m12861a().m12867a(context);
        if (m12867a == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(Arrays.asList(m12867a));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ClientDoneAndDoingRecordCache clientDoneAndDoingRecordCache = (ClientDoneAndDoingRecordCache) it.next();
            if (clientDoneAndDoingRecordCache == null || clientDoneAndDoingRecordCache.getRecordTimeInMillis() + 1209600000 < currentTimeMillis) {
                it.remove();
            }
        }
        ClientDoneAndDoingRecordCache[] clientDoneAndDoingRecordCacheArr = (ClientDoneAndDoingRecordCache[]) arrayList.toArray(new ClientDoneAndDoingRecordCache[arrayList.size()]);
        C2671b.m12861a().m12866a(context, clientDoneAndDoingRecordCacheArr);
        return clientDoneAndDoingRecordCacheArr;
    }

    /* renamed from: d */
    public static Pair<Integer, Integer> m13140d(Context context) {
        ClientDoneAndDoingRecordCache[] m13139c = m13139c(context);
        if (m13139c == null) {
            return new Pair<>(0, 0);
        }
        int i = 0;
        int i2 = 0;
        for (ClientDoneAndDoingRecordCache clientDoneAndDoingRecordCache : m13139c) {
            if (clientDoneAndDoingRecordCache != null) {
                if (clientDoneAndDoingRecordCache.getState() == 2) {
                    i++;
                } else if (clientDoneAndDoingRecordCache.getState() == 3) {
                    i2++;
                }
            }
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
