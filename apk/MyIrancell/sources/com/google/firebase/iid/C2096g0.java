package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.g0 */
/* loaded from: classes.dex */
final class C2096g0 {

    /* renamed from: a */
    final Intent f8905a;

    /* renamed from: b */
    private final BroadcastReceiver.PendingResult f8906b;

    /* renamed from: c */
    private boolean f8907c = false;

    /* renamed from: d */
    private final ScheduledFuture<?> f8908d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2096g0(final Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f8905a = intent;
        this.f8906b = pendingResult;
        this.f8908d = scheduledExecutorService.schedule(new Runnable(this, intent) { // from class: com.google.firebase.iid.f0

            /* renamed from: b */
            private final C2096g0 f8903b;

            /* renamed from: c */
            private final Intent f8904c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8903b = this;
                this.f8904c = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2096g0 c2096g0 = this.f8903b;
                String action = this.f8904c.getAction();
                StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
                sb.append("Service took too long to process intent: ");
                sb.append(action);
                sb.append(" App may get closed.");
                sb.toString();
                c2096g0.m10649a();
            }
        }, 9000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void m10649a() {
        if (!this.f8907c) {
            this.f8906b.finish();
            this.f8908d.cancel(false);
            this.f8907c = true;
        }
    }
}
