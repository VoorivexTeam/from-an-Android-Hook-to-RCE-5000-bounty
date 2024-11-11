package ir.tapsell.sdk.utils;

import android.content.Context;
import android.util.Pair;
import ir.tapsell.sdk.models.internalModels.ClientDoneAndDoingRecordCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        final /* synthetic */ Context b;
        final /* synthetic */ int c;

        a(Context context, int i) {
            this.b = context;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ClientDoneAndDoingRecordCache[] a = ir.tapsell.sdk.b.a().a(this.b);
            if (a == null) {
                ClientDoneAndDoingRecordCache clientDoneAndDoingRecordCache = new ClientDoneAndDoingRecordCache();
                clientDoneAndDoingRecordCache.setState(this.c);
                clientDoneAndDoingRecordCache.setRecordTimeInMillis(System.currentTimeMillis());
                ir.tapsell.sdk.b.a().a(this.b, new ClientDoneAndDoingRecordCache[]{clientDoneAndDoingRecordCache});
                return;
            }
            ArrayList arrayList = new ArrayList(Arrays.asList(a));
            ClientDoneAndDoingRecordCache clientDoneAndDoingRecordCache2 = new ClientDoneAndDoingRecordCache();
            clientDoneAndDoingRecordCache2.setState(this.c);
            clientDoneAndDoingRecordCache2.setRecordTimeInMillis(System.currentTimeMillis());
            arrayList.add(clientDoneAndDoingRecordCache2);
            ir.tapsell.sdk.b.a().a(this.b, (ClientDoneAndDoingRecordCache[]) arrayList.toArray(new ClientDoneAndDoingRecordCache[arrayList.size()]));
        }
    }

    public static void a(Context context) {
        a(context, 3);
    }

    private static void a(Context context, int i) {
        e.a(new a(context, i));
    }

    public static void b(Context context) {
        a(context, 2);
    }

    public static ClientDoneAndDoingRecordCache[] c(Context context) {
        ClientDoneAndDoingRecordCache[] a2 = ir.tapsell.sdk.b.a().a(context);
        if (a2 == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(Arrays.asList(a2));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ClientDoneAndDoingRecordCache clientDoneAndDoingRecordCache = (ClientDoneAndDoingRecordCache) it.next();
            if (clientDoneAndDoingRecordCache == null || clientDoneAndDoingRecordCache.getRecordTimeInMillis() + 1209600000 < currentTimeMillis) {
                it.remove();
            }
        }
        ClientDoneAndDoingRecordCache[] clientDoneAndDoingRecordCacheArr = (ClientDoneAndDoingRecordCache[]) arrayList.toArray(new ClientDoneAndDoingRecordCache[arrayList.size()]);
        ir.tapsell.sdk.b.a().a(context, clientDoneAndDoingRecordCacheArr);
        return clientDoneAndDoingRecordCacheArr;
    }

    public static Pair<Integer, Integer> d(Context context) {
        ClientDoneAndDoingRecordCache[] c = c(context);
        if (c == null) {
            return new Pair<>(0, 0);
        }
        int i = 0;
        int i2 = 0;
        for (ClientDoneAndDoingRecordCache clientDoneAndDoingRecordCache : c) {
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
