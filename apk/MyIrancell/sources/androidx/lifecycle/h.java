package androidx.lifecycle;

import androidx.lifecycle.e;
import defpackage.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends e {
    private final WeakReference<g> c;
    private defpackage.s<f, b> a = new defpackage.s<>();
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private ArrayList<e.b> g = new ArrayList<>();
    private e.b b = e.b.INITIALIZED;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[e.b.values().length];
            b = iArr;
            try {
                iArr[e.b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[e.b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[e.b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[e.b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[e.b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[e.a.values().length];
            a = iArr2;
            try {
                iArr2[e.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[e.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[e.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[e.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[e.a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[e.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[e.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        e.b a;
        d b;

        b(f fVar, e.b bVar) {
            this.b = j.a(fVar);
            this.a = bVar;
        }

        void a(g gVar, e.a aVar) {
            e.b b = h.b(aVar);
            this.a = h.a(this.a, b);
            this.b.a(gVar, aVar);
            this.a = b;
        }
    }

    public h(g gVar) {
        this.c = new WeakReference<>(gVar);
    }

    static e.b a(e.b bVar, e.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void a(g gVar) {
        Iterator<Map.Entry<f, b>> b2 = this.a.b();
        while (b2.hasNext() && !this.f) {
            Map.Entry<f, b> next = b2.next();
            b value = next.getValue();
            while (value.a.compareTo(this.b) > 0 && !this.f && this.a.contains(next.getKey())) {
                e.a b3 = b(value.a);
                d(b(b3));
                value.a(gVar, b3);
                c();
            }
        }
    }

    private static e.a b(e.b bVar) {
        int i = a.b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        }
        if (i == 2) {
            return e.a.ON_DESTROY;
        }
        if (i == 3) {
            return e.a.ON_STOP;
        }
        if (i == 4) {
            return e.a.ON_PAUSE;
        }
        if (i == 5) {
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Unexpected state value " + bVar);
    }

    static e.b b(e.a aVar) {
        switch (a.a[aVar.ordinal()]) {
            case 1:
            case 2:
                return e.b.CREATED;
            case 3:
            case 4:
                return e.b.STARTED;
            case 5:
                return e.b.RESUMED;
            case 6:
                return e.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(g gVar) {
        t<f, b>.d e = this.a.e();
        while (e.hasNext() && !this.f) {
            Map.Entry next = e.next();
            b bVar = (b) next.getValue();
            while (bVar.a.compareTo(this.b) < 0 && !this.f && this.a.contains(next.getKey())) {
                d(bVar.a);
                bVar.a(gVar, e(bVar.a));
                c();
            }
        }
    }

    private boolean b() {
        if (this.a.size() == 0) {
            return true;
        }
        e.b bVar = this.a.d().getValue().a;
        e.b bVar2 = this.a.f().getValue().a;
        return bVar == bVar2 && this.b == bVar2;
    }

    private e.b c(f fVar) {
        Map.Entry<f, b> b2 = this.a.b(fVar);
        e.b bVar = null;
        e.b bVar2 = b2 != null ? b2.getValue().a : null;
        if (!this.g.isEmpty()) {
            bVar = this.g.get(r0.size() - 1);
        }
        return a(a(this.b, bVar2), bVar);
    }

    private void c() {
        this.g.remove(r0.size() - 1);
    }

    private void c(e.b bVar) {
        if (this.b == bVar) {
            return;
        }
        this.b = bVar;
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        d();
        this.e = false;
    }

    private void d() {
        g gVar = this.c.get();
        if (gVar == null) {
            return;
        }
        while (true) {
            boolean b2 = b();
            this.f = false;
            if (b2) {
                return;
            }
            if (this.b.compareTo(this.a.d().getValue().a) < 0) {
                a(gVar);
            }
            Map.Entry<f, b> f = this.a.f();
            if (!this.f && f != null && this.b.compareTo(f.getValue().a) > 0) {
                b(gVar);
            }
        }
    }

    private void d(e.b bVar) {
        this.g.add(bVar);
    }

    private static e.a e(e.b bVar) {
        int i = a.b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return e.a.ON_START;
            }
            if (i == 3) {
                return e.a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return e.a.ON_CREATE;
    }

    @Override // androidx.lifecycle.e
    public e.b a() {
        return this.b;
    }

    public void a(e.a aVar) {
        c(b(aVar));
    }

    public void a(e.b bVar) {
        c(bVar);
    }

    @Override // androidx.lifecycle.e
    public void a(f fVar) {
        g gVar;
        e.b bVar = this.b;
        e.b bVar2 = e.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = e.b.INITIALIZED;
        }
        b bVar3 = new b(fVar, bVar2);
        if (this.a.b(fVar, bVar3) == null && (gVar = this.c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            e.b c = c(fVar);
            this.d++;
            while (bVar3.a.compareTo(c) < 0 && this.a.contains(fVar)) {
                d(bVar3.a);
                bVar3.a(gVar, e(bVar3.a));
                c();
                c = c(fVar);
            }
            if (!z) {
                d();
            }
            this.d--;
        }
    }

    @Override // androidx.lifecycle.e
    public void b(f fVar) {
        this.a.remove(fVar);
    }
}
