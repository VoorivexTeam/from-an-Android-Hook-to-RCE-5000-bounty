package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C1057u;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.common.a */
/* loaded from: classes.dex */
public class ServiceConnectionC0858a implements ServiceConnection {

    /* renamed from: a */
    private boolean f5663a = false;

    /* renamed from: b */
    private final BlockingQueue<IBinder> f5664b = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder m6491a(long j, TimeUnit timeUnit) {
        C1057u.m7300c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f5663a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f5663a = true;
        IBinder poll = this.f5664b.poll(j, timeUnit);
        if (poll != null) {
            return poll;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5664b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
