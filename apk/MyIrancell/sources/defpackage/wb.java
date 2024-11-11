package defpackage;

import com.bumptech.glide.load.a;
import com.bumptech.glide.load.g;
import defpackage.fb;
import defpackage.ka;
import defpackage.od;
import java.io.File;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class wb implements fb, ka.a<Object> {
    private final fb.a b;
    private final gb<?> c;
    private int d;
    private int e = -1;
    private g f;
    private List<od<File, ?>> g;
    private int h;
    private volatile od.a<?> i;
    private File j;
    private xb k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wb(gb<?> gbVar, fb.a aVar) {
        this.c = gbVar;
        this.b = aVar;
    }

    private boolean b() {
        return this.h < this.g.size();
    }

    @Override // ka.a
    public void a(Exception exc) {
        this.b.a(this.k, exc, this.i.c, a.RESOURCE_DISK_CACHE);
    }

    @Override // ka.a
    public void a(Object obj) {
        this.b.a(this.f, obj, this.i.c, a.RESOURCE_DISK_CACHE, this.k);
    }

    @Override // defpackage.fb
    public boolean a() {
        List<g> c = this.c.c();
        boolean z = false;
        if (c.isEmpty()) {
            return false;
        }
        List<Class<?>> k = this.c.k();
        if (k.isEmpty()) {
            if (File.class.equals(this.c.m())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.c.h() + " to " + this.c.m());
        }
        while (true) {
            if (this.g != null && b()) {
                this.i = null;
                while (!z && b()) {
                    List<od<File, ?>> list = this.g;
                    int i = this.h;
                    this.h = i + 1;
                    this.i = list.get(i).a(this.j, this.c.n(), this.c.f(), this.c.i());
                    if (this.i != null && this.c.c(this.i.c.a())) {
                        this.i.c.a(this.c.j(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.e + 1;
            this.e = i2;
            if (i2 >= k.size()) {
                int i3 = this.d + 1;
                this.d = i3;
                if (i3 >= c.size()) {
                    return false;
                }
                this.e = 0;
            }
            g gVar = c.get(this.d);
            Class<?> cls = k.get(this.e);
            this.k = new xb(this.c.b(), gVar, this.c.l(), this.c.n(), this.c.f(), this.c.b(cls), cls, this.c.i());
            File a = this.c.d().a(this.k);
            this.j = a;
            if (a != null) {
                this.f = gVar;
                this.g = this.c.a(a);
                this.h = 0;
            }
        }
    }

    @Override // defpackage.fb
    public void cancel() {
        od.a<?> aVar = this.i;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }
}
