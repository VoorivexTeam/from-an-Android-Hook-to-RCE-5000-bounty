package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: gi */
/* loaded from: classes.dex */
public class C2514gi<T, Y> {

    /* renamed from: a */
    private final Map<T, Y> f10319a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private long f10320b;

    /* renamed from: c */
    private long f10321c;

    public C2514gi(long j) {
        this.f10320b = j;
    }

    /* renamed from: c */
    private void m12000c() {
        m12003a(this.f10320b);
    }

    /* renamed from: a */
    public synchronized Y m12001a(T t) {
        return this.f10319a.get(t);
    }

    /* renamed from: a */
    public void m12002a() {
        m12003a(0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void m12003a(long j) {
        while (this.f10321c > j) {
            Iterator<Map.Entry<T, Y>> it = this.f10319a.entrySet().iterator();
            Map.Entry<T, Y> next = it.next();
            Y value = next.getValue();
            this.f10321c -= mo12005b(value);
            T key = next.getKey();
            it.remove();
            mo12004a(key, value);
        }
    }

    /* renamed from: a */
    protected void mo12004a(T t, Y y) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int mo12005b(Y y) {
        return 1;
    }

    /* renamed from: b */
    public synchronized long m12006b() {
        return this.f10320b;
    }

    /* renamed from: b */
    public synchronized Y m12007b(T t, Y y) {
        long mo12005b = mo12005b(y);
        if (mo12005b >= this.f10320b) {
            mo12004a(t, y);
            return null;
        }
        if (y != null) {
            this.f10321c += mo12005b;
        }
        Y put = this.f10319a.put(t, y);
        if (put != null) {
            this.f10321c -= mo12005b(put);
            if (!put.equals(y)) {
                mo12004a(t, put);
            }
        }
        m12000c();
        return put;
    }

    /* renamed from: c */
    public synchronized Y m12008c(T t) {
        Y remove;
        remove = this.f10319a.remove(t);
        if (remove != null) {
            this.f10321c -= mo12005b(remove);
        }
        return remove;
    }
}
