package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class gi<T, Y> {
    private final Map<T, Y> a = new LinkedHashMap(100, 0.75f, true);
    private long b;
    private long c;

    public gi(long j) {
        this.b = j;
    }

    private void c() {
        a(this.b);
    }

    public synchronized Y a(T t) {
        return this.a.get(t);
    }

    public void a() {
        a(0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void a(long j) {
        while (this.c > j) {
            Iterator<Map.Entry<T, Y>> it = this.a.entrySet().iterator();
            Map.Entry<T, Y> next = it.next();
            Y value = next.getValue();
            this.c -= b(value);
            T key = next.getKey();
            it.remove();
            a(key, value);
        }
    }

    protected void a(T t, Y y) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b(Y y) {
        return 1;
    }

    public synchronized long b() {
        return this.b;
    }

    public synchronized Y b(T t, Y y) {
        long b = b(y);
        if (b >= this.b) {
            a(t, y);
            return null;
        }
        if (y != null) {
            this.c += b;
        }
        Y put = this.a.put(t, y);
        if (put != null) {
            this.c -= b(put);
            if (!put.equals(y)) {
                a(t, put);
            }
        }
        c();
        return put;
    }

    public synchronized Y c(T t) {
        Y remove;
        remove = this.a.remove(t);
        if (remove != null) {
            this.c -= b(remove);
        }
        return remove;
    }
}
