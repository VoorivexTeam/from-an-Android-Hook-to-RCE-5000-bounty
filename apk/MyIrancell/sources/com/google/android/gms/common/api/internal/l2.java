package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import defpackage.jq;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class l2 extends LifecycleCallback implements DialogInterface.OnCancelListener {
    protected volatile boolean c;
    protected final AtomicReference<n2> d;
    private final Handler e;
    protected final com.google.android.gms.common.c f;

    /* JADX INFO: Access modifiers changed from: protected */
    public l2(j jVar) {
        this(jVar, com.google.android.gms.common.c.a());
    }

    private l2(j jVar, com.google.android.gms.common.c cVar) {
        super(jVar);
        this.d = new AtomicReference<>(null);
        this.e = new jq(Looper.getMainLooper());
        this.f = cVar;
    }

    private static int a(n2 n2Var) {
        if (n2Var == null) {
            return -1;
        }
        return n2Var.b();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void a(int i, int i2, Intent intent) {
        n2 n2Var = this.d.get();
        if (i != 1) {
            if (i == 2) {
                int c = this.f.c(a());
                r1 = c == 0;
                if (n2Var == null) {
                    return;
                }
                if (n2Var.a().j() == 18 && c == 18) {
                    return;
                }
            }
            r1 = false;
        } else if (i2 != -1) {
            if (i2 == 0) {
                n2 n2Var2 = new n2(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, n2Var.a().toString()), a(n2Var));
                this.d.set(n2Var2);
                n2Var = n2Var2;
            }
            r1 = false;
        }
        if (r1) {
            g();
        } else if (n2Var != null) {
            a(n2Var.a(), n2Var.b());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null) {
            this.d.set(bundle.getBoolean("resolving_error", false) ? new n2(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(ConnectionResult connectionResult, int i);

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void b(Bundle bundle) {
        super.b(bundle);
        n2 n2Var = this.d.get();
        if (n2Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", n2Var.b());
            bundle.putInt("failed_status", n2Var.a().j());
            bundle.putParcelable("failed_resolution", n2Var.a().l());
        }
    }

    public final void b(ConnectionResult connectionResult, int i) {
        n2 n2Var = new n2(connectionResult, i);
        if (this.d.compareAndSet(null, n2Var)) {
            this.e.post(new m2(this, n2Var));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void d() {
        super.d();
        this.c = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void e() {
        super.e();
        this.c = false;
    }

    protected abstract void f();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        this.d.set(null);
        f();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        a(new ConnectionResult(13, null), a(this.d.get()));
        g();
    }
}
