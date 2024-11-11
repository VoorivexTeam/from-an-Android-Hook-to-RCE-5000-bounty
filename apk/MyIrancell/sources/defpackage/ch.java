package defpackage;

import com.bumptech.glide.load.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ch {
    private final List<a<?>> a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a<T> {
        private final Class<T> a;
        final k<T> b;

        a(Class<T> cls, k<T> kVar) {
            this.a = cls;
            this.b = kVar;
        }

        boolean a(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> k<Z> a(Class<Z> cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            a<?> aVar = this.a.get(i);
            if (aVar.a(cls)) {
                return (k<Z>) aVar.b;
            }
        }
        return null;
    }

    public synchronized <Z> void a(Class<Z> cls, k<Z> kVar) {
        this.a.add(new a<>(cls, kVar));
    }
}
