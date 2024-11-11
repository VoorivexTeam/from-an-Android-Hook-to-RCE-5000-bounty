package p000;

import com.google.gson.Gson;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public abstract class m50<R, E> implements ra0<R> {

    /* renamed from: a */
    private Type f12078a = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];

    /* renamed from: a */
    public abstract void mo12854a(pa0<R> pa0Var, E e);

    /* renamed from: a */
    public abstract void mo12855a(pa0<R> pa0Var, Throwable th);

    /* renamed from: b */
    public abstract void mo12856b(pa0<R> pa0Var, R r);

    @Override // p000.ra0
    public final void onFailure(pa0<R> pa0Var, Throwable th) {
        mo12855a((pa0) pa0Var, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ra0
    public void onResponse(pa0<R> pa0Var, fb0<R> fb0Var) {
        try {
            if (fb0Var.m11755e()) {
                mo12856b(pa0Var, fb0Var.m11751a());
            } else if (fb0Var.m11752b() >= 400) {
                mo12854a(pa0Var, (pa0<R>) new Gson().fromJson(fb0Var.m11753c().m13428f(), this.f12078a));
            }
        } catch (Throwable th) {
            th.printStackTrace();
            mo12855a((pa0) pa0Var, th);
        }
    }
}
