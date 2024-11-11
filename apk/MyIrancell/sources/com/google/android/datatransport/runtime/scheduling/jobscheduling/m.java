package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.g;
import defpackage.bm;
import defpackage.qm;
import defpackage.tl;
import defpackage.un;
import defpackage.vm;
import defpackage.vn;
import defpackage.wn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class m {
    private final Context a;
    private final com.google.android.datatransport.runtime.backends.e b;
    private final qm c;
    private final s d;
    private final Executor e;
    private final vn f;
    private final wn g;

    public m(Context context, com.google.android.datatransport.runtime.backends.e eVar, qm qmVar, s sVar, Executor executor, vn vnVar, wn wnVar) {
        this.a = context;
        this.b = eVar;
        this.c = qmVar;
        this.d = sVar;
        this.e = executor;
        this.f = vnVar;
        this.g = wnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(m mVar, com.google.android.datatransport.runtime.backends.g gVar, Iterable iterable, tl tlVar, int i) {
        if (gVar.b() == g.a.TRANSIENT_ERROR) {
            mVar.c.b((Iterable<vm>) iterable);
            mVar.d.a(tlVar, i + 1);
            return null;
        }
        mVar.c.a((Iterable<vm>) iterable);
        if (gVar.b() == g.a.OK) {
            mVar.c.a(tlVar, mVar.g.a() + gVar.a());
        }
        if (!mVar.c.c(tlVar)) {
            return null;
        }
        mVar.d.a(tlVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(m mVar, tl tlVar, int i) {
        mVar.d.a(tlVar, i + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(m mVar, tl tlVar, int i, Runnable runnable) {
        try {
            try {
                vn vnVar = mVar.f;
                qm qmVar = mVar.c;
                qmVar.getClass();
                vnVar.a(k.a(qmVar));
                if (mVar.a()) {
                    mVar.a(tlVar, i);
                } else {
                    mVar.f.a(l.a(mVar, tlVar, i));
                }
            } catch (un unused) {
                mVar.d.a(tlVar, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    void a(tl tlVar, int i) {
        com.google.android.datatransport.runtime.backends.g a;
        com.google.android.datatransport.runtime.backends.m a2 = this.b.a(tlVar.a());
        Iterable iterable = (Iterable) this.f.a(i.a(this, tlVar));
        if (iterable.iterator().hasNext()) {
            if (a2 == null) {
                bm.a("Uploader", "Unknown backend for %s, deleting event batch for it...", tlVar);
                a = com.google.android.datatransport.runtime.backends.g.c();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((vm) it.next()).a());
                }
                f.a c = com.google.android.datatransport.runtime.backends.f.c();
                c.a(arrayList);
                c.a(tlVar.b());
                a = a2.a(c.a());
            }
            this.f.a(j.a(this, a, iterable, tlVar, i));
        }
    }

    public void a(tl tlVar, int i, Runnable runnable) {
        this.e.execute(h.a(this, tlVar, i, runnable));
    }

    boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
