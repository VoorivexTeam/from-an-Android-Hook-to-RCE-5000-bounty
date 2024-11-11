package defpackage;

import android.util.Log;
import com.bumptech.glide.e;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.l;
import defpackage.hb;
import defpackage.li;
import defpackage.oc;
import defpackage.pb;
import defpackage.vc;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class kb implements mb, vc.a, pb.a {
    private static final boolean i = Log.isLoggable("Engine", 2);
    private final sb a;
    private final ob b;
    private final vc c;
    private final b d;
    private final yb e;
    private final c f;
    private final a g;
    private final ab h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        final hb.e a;
        final u1<hb<?>> b = li.a(150, new C0076a());
        private int c;

        /* renamed from: kb$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0076a implements li.d<hb<?>> {
            C0076a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // li.d
            public hb<?> a() {
                a aVar = a.this;
                return new hb<>(aVar.a, aVar.b);
            }
        }

        a(hb.e eVar) {
            this.a = eVar;
        }

        <R> hb<R> a(e eVar, Object obj, nb nbVar, g gVar, int i, int i2, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, jb jbVar, Map<Class<?>, l<?>> map, boolean z, boolean z2, boolean z3, i iVar, hb.b<R> bVar) {
            hb a = this.b.a();
            ji.a(a);
            hb hbVar = a;
            int i3 = this.c;
            this.c = i3 + 1;
            hbVar.a(eVar, obj, nbVar, gVar, i, i2, cls, cls2, gVar2, jbVar, map, z, z2, z3, iVar, bVar, i3);
            return hbVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        final yc a;
        final yc b;
        final yc c;
        final yc d;
        final mb e;
        final u1<lb<?>> f = li.a(150, new a());

        /* loaded from: classes.dex */
        class a implements li.d<lb<?>> {
            a() {
            }

            @Override // li.d
            public lb<?> a() {
                b bVar = b.this;
                return new lb<>(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f);
            }
        }

        b(yc ycVar, yc ycVar2, yc ycVar3, yc ycVar4, mb mbVar) {
            this.a = ycVar;
            this.b = ycVar2;
            this.c = ycVar3;
            this.d = ycVar4;
            this.e = mbVar;
        }

        <R> lb<R> a(g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
            lb a2 = this.f.a();
            ji.a(a2);
            lb lbVar = a2;
            lbVar.a(gVar, z, z2, z3, z4);
            return lbVar;
        }
    }

    /* loaded from: classes.dex */
    private static class c implements hb.e {
        private final oc.a a;
        private volatile oc b;

        c(oc.a aVar) {
            this.a = aVar;
        }

        @Override // hb.e
        public oc a() {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        this.b = this.a.a();
                    }
                    if (this.b == null) {
                        this.b = new pc();
                    }
                }
            }
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public class d {
        private final lb<?> a;
        private final jh b;

        d(jh jhVar, lb<?> lbVar) {
            this.b = jhVar;
            this.a = lbVar;
        }

        public void a() {
            synchronized (kb.this) {
                this.a.c(this.b);
            }
        }
    }

    kb(vc vcVar, oc.a aVar, yc ycVar, yc ycVar2, yc ycVar3, yc ycVar4, sb sbVar, ob obVar, ab abVar, b bVar, a aVar2, yb ybVar, boolean z) {
        this.c = vcVar;
        this.f = new c(aVar);
        ab abVar2 = abVar == null ? new ab(z) : abVar;
        this.h = abVar2;
        abVar2.a(this);
        this.b = obVar == null ? new ob() : obVar;
        this.a = sbVar == null ? new sb() : sbVar;
        this.d = bVar == null ? new b(ycVar, ycVar2, ycVar3, ycVar4, this) : bVar;
        this.g = aVar2 == null ? new a(this.f) : aVar2;
        this.e = ybVar == null ? new yb() : ybVar;
        vcVar.a(this);
    }

    public kb(vc vcVar, oc.a aVar, yc ycVar, yc ycVar2, yc ycVar3, yc ycVar4, boolean z) {
        this(vcVar, aVar, ycVar, ycVar2, ycVar3, ycVar4, null, null, null, null, null, null, z);
    }

    private pb<?> a(g gVar) {
        vb<?> a2 = this.c.a(gVar);
        if (a2 == null) {
            return null;
        }
        return a2 instanceof pb ? (pb) a2 : new pb<>(a2, true, true);
    }

    private pb<?> a(g gVar, boolean z) {
        if (!z) {
            return null;
        }
        pb<?> b2 = this.h.b(gVar);
        if (b2 != null) {
            b2.a();
        }
        return b2;
    }

    private static void a(String str, long j, g gVar) {
        String str2 = str + " in " + fi.a(j) + "ms, key: " + gVar;
    }

    private pb<?> b(g gVar, boolean z) {
        if (!z) {
            return null;
        }
        pb<?> a2 = a(gVar);
        if (a2 != null) {
            a2.a();
            this.h.a(gVar, a2);
        }
        return a2;
    }

    public synchronized <R> d a(e eVar, Object obj, g gVar, int i2, int i3, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, jb jbVar, Map<Class<?>, l<?>> map, boolean z, boolean z2, i iVar, boolean z3, boolean z4, boolean z5, boolean z6, jh jhVar, Executor executor) {
        long a2 = i ? fi.a() : 0L;
        nb a3 = this.b.a(obj, gVar, i2, i3, map, cls, cls2, iVar);
        pb<?> a4 = a(a3, z3);
        if (a4 != null) {
            jhVar.a(a4, com.bumptech.glide.load.a.MEMORY_CACHE);
            if (i) {
                a("Loaded resource from active resources", a2, a3);
            }
            return null;
        }
        pb<?> b2 = b(a3, z3);
        if (b2 != null) {
            jhVar.a(b2, com.bumptech.glide.load.a.MEMORY_CACHE);
            if (i) {
                a("Loaded resource from cache", a2, a3);
            }
            return null;
        }
        lb<?> a5 = this.a.a(a3, z6);
        if (a5 != null) {
            a5.a(jhVar, executor);
            if (i) {
                a("Added to existing load", a2, a3);
            }
            return new d(jhVar, a5);
        }
        lb<R> a6 = this.d.a(a3, z3, z4, z5, z6);
        hb<R> a7 = this.g.a(eVar, obj, a3, gVar, i2, i3, cls, cls2, gVar2, jbVar, map, z, z2, z6, iVar, a6);
        this.a.a((g) a3, (lb<?>) a6);
        a6.a(jhVar, executor);
        a6.b(a7);
        if (i) {
            a("Started new load", a2, a3);
        }
        return new d(jhVar, a6);
    }

    @Override // pb.a
    public synchronized void a(g gVar, pb<?> pbVar) {
        this.h.a(gVar);
        if (pbVar.f()) {
            this.c.a(gVar, pbVar);
        } else {
            this.e.a(pbVar);
        }
    }

    @Override // defpackage.mb
    public synchronized void a(lb<?> lbVar, g gVar) {
        this.a.b(gVar, lbVar);
    }

    @Override // defpackage.mb
    public synchronized void a(lb<?> lbVar, g gVar, pb<?> pbVar) {
        if (pbVar != null) {
            pbVar.a(gVar, this);
            if (pbVar.f()) {
                this.h.a(gVar, pbVar);
            }
        }
        this.a.b(gVar, lbVar);
    }

    @Override // vc.a
    public void a(vb<?> vbVar) {
        this.e.a(vbVar);
    }

    public void b(vb<?> vbVar) {
        if (!(vbVar instanceof pb)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((pb) vbVar).g();
    }
}
