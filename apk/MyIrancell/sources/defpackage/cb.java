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
public class cb implements fb, ka.a<Object> {
    private final List<g> b;
    private final gb<?> c;
    private final fb.a d;
    private int e;
    private g f;
    private List<od<File, ?>> g;
    private int h;
    private volatile od.a<?> i;
    private File j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cb(gb<?> gbVar, fb.a aVar) {
        this(gbVar.c(), gbVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public cb(List<g> list, gb<?> gbVar, fb.a aVar) {
        this.e = -1;
        this.b = list;
        this.c = gbVar;
        this.d = aVar;
    }

    private boolean b() {
        return this.h < this.g.size();
    }

    @Override // ka.a
    public void a(Exception exc) {
        this.d.a(this.f, exc, this.i.c, a.DATA_DISK_CACHE);
    }

    @Override // ka.a
    public void a(Object obj) {
        this.d.a(this.f, obj, this.i.c, a.DATA_DISK_CACHE, this.f);
    }

    @Override // defpackage.fb
    public boolean a() {
        while (true) {
            boolean z = false;
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
            if (i2 >= this.b.size()) {
                return false;
            }
            g gVar = this.b.get(this.e);
            File a = this.c.d().a(new db(gVar, this.c.l()));
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
