package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import p000.C2908ls;

/* renamed from: com.google.firebase.iid.j */
/* loaded from: classes.dex */
abstract class AbstractC2101j<T> {

    /* renamed from: a */
    final int f8914a;

    /* renamed from: b */
    final C2908ls<T> f8915b = new C2908ls<>();

    /* renamed from: c */
    final int f8916c;

    /* renamed from: d */
    final Bundle f8917d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2101j(int i, int i2, Bundle bundle) {
        this.f8914a = i;
        this.f8916c = i2;
        this.f8917d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo10647a(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m10652a(C2099i c2099i) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(c2099i);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            sb.toString();
        }
        this.f8915b.m13925a(c2099i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m10653a(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            sb.toString();
        }
        this.f8915b.m13926a((C2908ls<T>) t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo10648a();

    public String toString() {
        int i = this.f8916c;
        int i2 = this.f8914a;
        boolean mo10648a = mo10648a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(mo10648a);
        sb.append("}");
        return sb.toString();
    }
}
