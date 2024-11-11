package ir.metrix.sdk;

import android.content.Context;

/* renamed from: ir.metrix.sdk.b */
/* loaded from: classes.dex */
class C2619b {

    /* renamed from: ir.metrix.sdk.b$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        void mo12562a();

        /* renamed from: a */
        void mo12563a(C2620c c2620c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12561a(final Context context, final a aVar) {
        new Thread(new Runnable() { // from class: ir.metrix.sdk.b.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C2620c m12501a = C2608a.m12501a(context);
                    if (aVar != null) {
                        if (m12501a == null || m12501a.m12564a() == null) {
                            aVar.mo12562a();
                        } else {
                            aVar.mo12563a(m12501a);
                        }
                    }
                } catch (Throwable unused) {
                    aVar.mo12562a();
                }
            }
        }).start();
    }
}
