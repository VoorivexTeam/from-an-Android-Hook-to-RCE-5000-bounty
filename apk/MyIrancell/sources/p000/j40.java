package p000;

import android.content.Context;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class j40<Any> implements ra0<Any> {

    /* renamed from: a */
    protected g40 f11459a;

    /* renamed from: b */
    private int f11460b;

    public j40(Context context, int i, g40 g40Var) {
        this.f11460b = i;
        this.f11459a = g40Var;
    }

    @Override // p000.ra0
    public final void onFailure(pa0<Any> pa0Var, Throwable th) {
        if (th instanceof SocketTimeoutException) {
            new StringBuilder("timeout exception ").append(th);
            this.f11459a.mo11887a(th, this.f11460b);
        }
        if (th instanceof ConnectException) {
            new StringBuilder("Connection Exception").append(th);
            this.f11459a.mo11887a(th, this.f11460b);
        }
        if (th instanceof NoRouteToHostException) {
            new StringBuilder("No Route Exception").append(th);
            this.f11459a.mo11887a(th, this.f11460b);
        }
    }

    @Override // p000.ra0
    public final void onResponse(pa0<Any> pa0Var, fb0<Any> fb0Var) {
        this.f11459a.mo11886a(this.f11460b, fb0Var.m11752b(), fb0Var.m11751a());
    }
}
