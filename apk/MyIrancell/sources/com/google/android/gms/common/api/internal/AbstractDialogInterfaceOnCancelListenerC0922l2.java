package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C0993c;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;
import p000.HandlerC2824jq;

/* renamed from: com.google.android.gms.common.api.internal.l2 */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC0922l2 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: c */
    protected volatile boolean f5890c;

    /* renamed from: d */
    protected final AtomicReference<C0930n2> f5891d;

    /* renamed from: e */
    private final Handler f5892e;

    /* renamed from: f */
    protected final C0993c f5893f;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractDialogInterfaceOnCancelListenerC0922l2(InterfaceC0911j interfaceC0911j) {
        this(interfaceC0911j, C0993c.m6949a());
    }

    private AbstractDialogInterfaceOnCancelListenerC0922l2(InterfaceC0911j interfaceC0911j, C0993c c0993c) {
        super(interfaceC0911j);
        this.f5891d = new AtomicReference<>(null);
        this.f5892e = new HandlerC2824jq(Looper.getMainLooper());
        this.f5893f = c0993c;
    }

    /* renamed from: a */
    private static int m6802a(C0930n2 c0930n2) {
        if (c0930n2 == null) {
            return -1;
        }
        return c0930n2.m6824b();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: a */
    public void mo6596a(int i, int i2, Intent intent) {
        C0930n2 c0930n2 = this.f5891d.get();
        if (i != 1) {
            if (i == 2) {
                int mo6964c = this.f5893f.mo6964c(m6595a());
                r1 = mo6964c == 0;
                if (c0930n2 == null) {
                    return;
                }
                if (c0930n2.m6823a().m6484j() == 18 && mo6964c == 18) {
                    return;
                }
            }
            r1 = false;
        } else if (i2 != -1) {
            if (i2 == 0) {
                C0930n2 c0930n22 = new C0930n2(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, c0930n2.m6823a().toString()), m6802a(c0930n2));
                this.f5891d.set(c0930n22);
                c0930n2 = c0930n22;
            }
            r1 = false;
        }
        if (r1) {
            m6804g();
        } else if (c0930n2 != null) {
            mo6785a(c0930n2.m6823a(), c0930n2.m6824b());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: a */
    public void mo6597a(Bundle bundle) {
        super.mo6597a(bundle);
        if (bundle != null) {
            this.f5891d.set(bundle.getBoolean("resolving_error", false) ? new C0930n2(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6785a(ConnectionResult connectionResult, int i);

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: b */
    public void mo6600b(Bundle bundle) {
        super.mo6600b(bundle);
        C0930n2 c0930n2 = this.f5891d.get();
        if (c0930n2 != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", c0930n2.m6824b());
            bundle.putInt("failed_status", c0930n2.m6823a().m6484j());
            bundle.putParcelable("failed_resolution", c0930n2.m6823a().m6486l());
        }
    }

    /* renamed from: b */
    public final void m6803b(ConnectionResult connectionResult, int i) {
        C0930n2 c0930n2 = new C0930n2(connectionResult, i);
        if (this.f5891d.compareAndSet(null, c0930n2)) {
            this.f5892e.post(new RunnableC0926m2(this, c0930n2));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: d */
    public void mo6602d() {
        super.mo6602d();
        this.f5890c = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: e */
    public void mo6603e() {
        super.mo6603e();
        this.f5890c = false;
    }

    /* renamed from: f */
    protected abstract void mo6786f();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final void m6804g() {
        this.f5891d.set(null);
        mo6786f();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        mo6785a(new ConnectionResult(13, null), m6802a(this.f5891d.get()));
        m6804g();
    }
}
