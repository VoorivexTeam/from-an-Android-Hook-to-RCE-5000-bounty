package defpackage;

import com.google.gson.Gson;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public abstract class m50<R, E> implements ra0<R> {
    private Type a = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];

    public abstract void a(pa0<R> pa0Var, E e);

    public abstract void a(pa0<R> pa0Var, Throwable th);

    public abstract void b(pa0<R> pa0Var, R r);

    @Override // defpackage.ra0
    public final void onFailure(pa0<R> pa0Var, Throwable th) {
        a((pa0) pa0Var, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ra0
    public void onResponse(pa0<R> pa0Var, fb0<R> fb0Var) {
        try {
            if (fb0Var.e()) {
                b(pa0Var, fb0Var.a());
            } else if (fb0Var.b() >= 400) {
                a(pa0Var, (pa0<R>) new Gson().fromJson(fb0Var.c().f(), this.a));
            }
        } catch (Throwable th) {
            th.printStackTrace();
            a((pa0) pa0Var, th);
        }
    }
}
