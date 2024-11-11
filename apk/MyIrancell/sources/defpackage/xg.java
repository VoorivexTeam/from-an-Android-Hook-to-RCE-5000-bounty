package defpackage;

import com.bumptech.glide.load.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class xg {
    private final List<a<?>> a = new ArrayList();

    /* loaded from: classes.dex */
    private static final class a<T> {
        private final Class<T> a;
        final d<T> b;

        a(Class<T> cls, d<T> dVar) {
            this.a = cls;
            this.b = dVar;
        }

        boolean a(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> d<T> a(Class<T> cls) {
        for (a<?> aVar : this.a) {
            if (aVar.a(cls)) {
                return (d<T>) aVar.b;
            }
        }
        return null;
    }

    public synchronized <T> void a(Class<T> cls, d<T> dVar) {
        this.a.add(new a<>(cls, dVar));
    }
}
