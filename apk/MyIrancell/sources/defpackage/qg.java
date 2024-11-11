package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class qg {
    private final Set<fh> a = Collections.newSetFromMap(new WeakHashMap());
    private final List<fh> b = new ArrayList();
    private boolean c;

    private boolean a(fh fhVar, boolean z) {
        boolean z2 = true;
        if (fhVar == null) {
            return true;
        }
        boolean remove = this.a.remove(fhVar);
        if (!this.b.remove(fhVar) && !remove) {
            z2 = false;
        }
        if (z2) {
            fhVar.clear();
            if (z) {
                fhVar.b();
            }
        }
        return z2;
    }

    public void a() {
        Iterator it = ki.a(this.a).iterator();
        while (it.hasNext()) {
            a((fh) it.next(), false);
        }
        this.b.clear();
    }

    public boolean a(fh fhVar) {
        return a(fhVar, true);
    }

    public void b() {
        this.c = true;
        for (fh fhVar : ki.a(this.a)) {
            if (fhVar.isRunning()) {
                fhVar.clear();
                this.b.add(fhVar);
            }
        }
    }

    public void b(fh fhVar) {
        this.a.add(fhVar);
        if (!this.c) {
            fhVar.a();
            return;
        }
        fhVar.clear();
        Log.isLoggable("RequestTracker", 2);
        this.b.add(fhVar);
    }

    public void c() {
        for (fh fhVar : ki.a(this.a)) {
            if (!fhVar.g() && !fhVar.d()) {
                fhVar.clear();
                if (this.c) {
                    this.b.add(fhVar);
                } else {
                    fhVar.a();
                }
            }
        }
    }

    public void d() {
        this.c = false;
        for (fh fhVar : ki.a(this.a)) {
            if (!fhVar.g() && !fhVar.isRunning()) {
                fhVar.a();
            }
        }
        this.b.clear();
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.c + "}";
    }
}
