package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import defpackage.ds;
import defpackage.ks;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p {
    private final Executor a;

    @GuardedBy("this")
    private final Map<Pair<String, String>, ks<a>> b = new defpackage.c0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Executor executor) {
        this.a = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ks a(Pair pair, ks ksVar) {
        synchronized (this) {
            this.b.remove(pair);
        }
        return ksVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized ks<a> a(String str, String str2, r rVar) {
        final Pair pair = new Pair(str, str2);
        ks<a> ksVar = this.b.get(pair);
        if (ksVar != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(valueOf);
                sb.toString();
            }
            return ksVar;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(valueOf2);
            sb2.toString();
        }
        ks b = rVar.zza().b(this.a, new ds(this, pair) { // from class: com.google.firebase.iid.o
            private final p a;
            private final Pair b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.b = pair;
            }

            @Override // defpackage.ds
            public final Object a(ks ksVar2) {
                this.a.a(this.b, ksVar2);
                return ksVar2;
            }
        });
        this.b.put(pair, b);
        return b;
    }
}
