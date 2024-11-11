package defpackage;

import android.content.Context;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class j40<Any> implements ra0<Any> {
    protected g40 a;
    private int b;

    public j40(Context context, int i, g40 g40Var) {
        this.b = i;
        this.a = g40Var;
    }

    @Override // defpackage.ra0
    public final void onFailure(pa0<Any> pa0Var, Throwable th) {
        if (th instanceof SocketTimeoutException) {
            new StringBuilder("timeout exception ").append(th);
            this.a.a(th, this.b);
        }
        if (th instanceof ConnectException) {
            new StringBuilder("Connection Exception").append(th);
            this.a.a(th, this.b);
        }
        if (th instanceof NoRouteToHostException) {
            new StringBuilder("No Route Exception").append(th);
            this.a.a(th, this.b);
        }
    }

    @Override // defpackage.ra0
    public final void onResponse(pa0<Any> pa0Var, fb0<Any> fb0Var) {
        this.a.a(this.b, fb0Var.b(), fb0Var.a());
    }
}
