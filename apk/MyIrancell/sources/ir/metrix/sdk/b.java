package ir.metrix.sdk;

import android.content.Context;

/* loaded from: classes.dex */
class b {

    /* loaded from: classes.dex */
    interface a {
        void a();

        void a(c cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(final Context context, final a aVar) {
        new Thread(new Runnable() { // from class: ir.metrix.sdk.b.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    c a2 = ir.metrix.sdk.a.a(context);
                    if (aVar != null) {
                        if (a2 == null || a2.a() == null) {
                            aVar.a();
                        } else {
                            aVar.a(a2);
                        }
                    }
                } catch (Throwable unused) {
                    aVar.a();
                }
            }
        }).start();
    }
}
