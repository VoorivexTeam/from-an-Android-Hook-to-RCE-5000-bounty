package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class j2 extends l2 {
    private final SparseArray<a> g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements f.c {
        public final int a;
        public final com.google.android.gms.common.api.f b;
        public final f.c c;

        public a(int i, com.google.android.gms.common.api.f fVar, f.c cVar) {
            this.a = i;
            this.b = fVar;
            this.c = cVar;
            fVar.a(this);
        }

        @Override // com.google.android.gms.common.api.internal.m
        public final void a(ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("beginFailureResolution for ");
            sb.append(valueOf);
            sb.toString();
            j2.this.b(connectionResult, this.a);
        }
    }

    private j2(j jVar) {
        super(jVar);
        this.g = new SparseArray<>();
        this.b.a("AutoManageHelper", this);
    }

    private final a b(int i) {
        if (this.g.size() <= i) {
            return null;
        }
        SparseArray<a> sparseArray = this.g;
        return sparseArray.get(sparseArray.keyAt(i));
    }

    public static j2 b(i iVar) {
        j a2 = LifecycleCallback.a(iVar);
        j2 j2Var = (j2) a2.a("AutoManageHelper", j2.class);
        return j2Var != null ? j2Var : new j2(a2);
    }

    public final void a(int i) {
        a aVar = this.g.get(i);
        this.g.remove(i);
        if (aVar != null) {
            aVar.b.b(aVar);
            aVar.b.d();
        }
    }

    public final void a(int i, com.google.android.gms.common.api.f fVar, f.c cVar) {
        com.google.android.gms.common.internal.u.a(fVar, "GoogleApiClient instance cannot be null");
        boolean z = this.g.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        com.google.android.gms.common.internal.u.b(z, sb.toString());
        n2 n2Var = this.d.get();
        boolean z2 = this.c;
        String valueOf = String.valueOf(n2Var);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        sb2.append(" ");
        sb2.append(z2);
        sb2.append(" ");
        sb2.append(valueOf);
        sb2.toString();
        this.g.put(i, new a(i, fVar, cVar));
        if (this.c && n2Var == null) {
            String valueOf2 = String.valueOf(fVar);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
            sb3.append("connecting ");
            sb3.append(valueOf2);
            sb3.toString();
            fVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.l2
    public final void a(ConnectionResult connectionResult, int i) {
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        a aVar = this.g.get(i);
        if (aVar != null) {
            a(i);
            f.c cVar = aVar.c;
            if (cVar != null) {
                cVar.a(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.g.size(); i++) {
            a b = b(i);
            if (b != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(b.a);
                printWriter.println(":");
                b.b.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.l2, com.google.android.gms.common.api.internal.LifecycleCallback
    public void d() {
        super.d();
        boolean z = this.c;
        String valueOf = String.valueOf(this.g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        sb.toString();
        if (this.d.get() == null) {
            for (int i = 0; i < this.g.size(); i++) {
                a b = b(i);
                if (b != null) {
                    b.b.c();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.l2, com.google.android.gms.common.api.internal.LifecycleCallback
    public void e() {
        super.e();
        for (int i = 0; i < this.g.size(); i++) {
            a b = b(i);
            if (b != null) {
                b.b.d();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.l2
    protected final void f() {
        for (int i = 0; i < this.g.size(); i++) {
            a b = b(i);
            if (b != null) {
                b.b.c();
            }
        }
    }
}
