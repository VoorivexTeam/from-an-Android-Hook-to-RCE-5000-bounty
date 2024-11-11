package defpackage;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;
import defpackage.pl;
import defpackage.tl;
import defpackage.zl;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public class yl implements xl {
    private static volatile zl e;
    private final wn a;
    private final wn b;
    private final jm c;
    private final m d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yl(wn wnVar, wn wnVar2, jm jmVar, m mVar, q qVar) {
        this.a = wnVar;
        this.b = wnVar2;
        this.c = jmVar;
        this.d = mVar;
        qVar.a();
    }

    private pl a(sl slVar) {
        pl.a i = pl.i();
        i.a(this.a.a());
        i.b(this.b.a());
        i.a(slVar.f());
        i.a(new ol(slVar.a(), slVar.c()));
        i.a(slVar.b().a());
        return i.a();
    }

    public static void a(Context context) {
        if (e == null) {
            synchronized (yl.class) {
                if (e == null) {
                    zl.a d = ll.d();
                    d.a(context);
                    e = d.a();
                }
            }
        }
    }

    private static Set<fk> b(ml mlVar) {
        return mlVar instanceof nl ? Collections.unmodifiableSet(((nl) mlVar).b()) : Collections.singleton(fk.a("proto"));
    }

    public static yl b() {
        zl zlVar = e;
        if (zlVar != null) {
            return zlVar.c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public m a() {
        return this.d;
    }

    public kk a(ml mlVar) {
        Set<fk> b = b(mlVar);
        tl.a d = tl.d();
        d.a(mlVar.a());
        d.a(mlVar.c());
        return new ul(b, d.a(), this);
    }

    @Override // defpackage.xl
    public void a(sl slVar, lk lkVar) {
        this.c.a(slVar.e().a(slVar.b().c()), a(slVar), lkVar);
    }
}
