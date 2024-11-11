package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: qg */
/* loaded from: classes.dex */
public class C3126qg {

    /* renamed from: a */
    private final Set<InterfaceC2473fh> f12801a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<InterfaceC2473fh> f12802b = new ArrayList();

    /* renamed from: c */
    private boolean f12803c;

    /* renamed from: a */
    private boolean m15089a(InterfaceC2473fh interfaceC2473fh, boolean z) {
        boolean z2 = true;
        if (interfaceC2473fh == null) {
            return true;
        }
        boolean remove = this.f12801a.remove(interfaceC2473fh);
        if (!this.f12802b.remove(interfaceC2473fh) && !remove) {
            z2 = false;
        }
        if (z2) {
            interfaceC2473fh.clear();
            if (z) {
                interfaceC2473fh.mo11601b();
            }
        }
        return z2;
    }

    /* renamed from: a */
    public void m15090a() {
        Iterator it = C2861ki.m13726a(this.f12801a).iterator();
        while (it.hasNext()) {
            m15089a((InterfaceC2473fh) it.next(), false);
        }
        this.f12802b.clear();
    }

    /* renamed from: a */
    public boolean m15091a(InterfaceC2473fh interfaceC2473fh) {
        return m15089a(interfaceC2473fh, true);
    }

    /* renamed from: b */
    public void m15092b() {
        this.f12803c = true;
        for (InterfaceC2473fh interfaceC2473fh : C2861ki.m13726a(this.f12801a)) {
            if (interfaceC2473fh.isRunning()) {
                interfaceC2473fh.clear();
                this.f12802b.add(interfaceC2473fh);
            }
        }
    }

    /* renamed from: b */
    public void m15093b(InterfaceC2473fh interfaceC2473fh) {
        this.f12801a.add(interfaceC2473fh);
        if (!this.f12803c) {
            interfaceC2473fh.mo11598a();
            return;
        }
        interfaceC2473fh.clear();
        Log.isLoggable("RequestTracker", 2);
        this.f12802b.add(interfaceC2473fh);
    }

    /* renamed from: c */
    public void m15094c() {
        for (InterfaceC2473fh interfaceC2473fh : C2861ki.m13726a(this.f12801a)) {
            if (!interfaceC2473fh.mo11611g() && !interfaceC2473fh.mo11605d()) {
                interfaceC2473fh.clear();
                if (this.f12803c) {
                    this.f12802b.add(interfaceC2473fh);
                } else {
                    interfaceC2473fh.mo11598a();
                }
            }
        }
    }

    /* renamed from: d */
    public void m15095d() {
        this.f12803c = false;
        for (InterfaceC2473fh interfaceC2473fh : C2861ki.m13726a(this.f12801a)) {
            if (!interfaceC2473fh.mo11611g() && !interfaceC2473fh.isRunning()) {
                interfaceC2473fh.mo11598a();
            }
        }
        this.f12802b.clear();
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f12801a.size() + ", isPaused=" + this.f12803c + "}";
    }
}
