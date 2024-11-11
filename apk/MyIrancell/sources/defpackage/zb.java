package defpackage;

import android.util.Log;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.g;
import defpackage.fb;
import defpackage.ka;
import defpackage.od;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zb implements fb, ka.a<Object>, fb.a {
    private final gb<?> b;
    private final fb.a c;
    private int d;
    private cb e;
    private Object f;
    private volatile od.a<?> g;
    private db h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zb(gb<?> gbVar, fb.a aVar) {
        this.b = gbVar;
        this.c = aVar;
    }

    private void b(Object obj) {
        long a = fi.a();
        try {
            d<X> a2 = this.b.a((gb<?>) obj);
            eb ebVar = new eb(a2, obj, this.b.i());
            this.h = new db(this.g.a, this.b.l());
            this.b.d().a(this.h, ebVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                String str = "Finished encoding source to cache, key: " + this.h + ", data: " + obj + ", encoder: " + a2 + ", duration: " + fi.a(a);
            }
            this.g.c.b();
            this.e = new cb(Collections.singletonList(this.g.a), this.b, this);
        } catch (Throwable th) {
            this.g.c.b();
            throw th;
        }
    }

    private boolean b() {
        return this.d < this.b.g().size();
    }

    @Override // fb.a
    public void a(g gVar, Exception exc, ka<?> kaVar, a aVar) {
        this.c.a(gVar, exc, kaVar, this.g.c.c());
    }

    @Override // fb.a
    public void a(g gVar, Object obj, ka<?> kaVar, a aVar, g gVar2) {
        this.c.a(gVar, obj, kaVar, this.g.c.c(), gVar);
    }

    @Override // ka.a
    public void a(Exception exc) {
        this.c.a(this.h, exc, this.g.c, this.g.c.c());
    }

    @Override // ka.a
    public void a(Object obj) {
        jb e = this.b.e();
        if (obj == null || !e.a(this.g.c.c())) {
            this.c.a(this.g.a, obj, this.g.c, this.g.c.c(), this.h);
        } else {
            this.f = obj;
            this.c.d();
        }
    }

    @Override // defpackage.fb
    public boolean a() {
        Object obj = this.f;
        if (obj != null) {
            this.f = null;
            b(obj);
        }
        cb cbVar = this.e;
        if (cbVar != null && cbVar.a()) {
            return true;
        }
        this.e = null;
        this.g = null;
        boolean z = false;
        while (!z && b()) {
            List<od.a<?>> g = this.b.g();
            int i = this.d;
            this.d = i + 1;
            this.g = g.get(i);
            if (this.g != null && (this.b.e().a(this.g.c.c()) || this.b.c(this.g.c.a()))) {
                this.g.c.a(this.b.j(), this);
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.fb
    public void cancel() {
        od.a<?> aVar = this.g;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // fb.a
    public void d() {
        throw new UnsupportedOperationException();
    }
}
