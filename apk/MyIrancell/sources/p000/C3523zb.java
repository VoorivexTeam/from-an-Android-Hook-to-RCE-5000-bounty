package p000;

import android.util.Log;
import com.bumptech.glide.load.EnumC0567a;
import com.bumptech.glide.load.InterfaceC0570d;
import com.bumptech.glide.load.InterfaceC0573g;
import java.util.Collections;
import java.util.List;
import p000.InterfaceC2467fb;
import p000.InterfaceC2853ka;
import p000.InterfaceC3031od;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zb */
/* loaded from: classes.dex */
public class C3523zb implements InterfaceC2467fb, InterfaceC2853ka.a<Object>, InterfaceC2467fb.a {

    /* renamed from: b */
    private final C2505gb<?> f14435b;

    /* renamed from: c */
    private final InterfaceC2467fb.a f14436c;

    /* renamed from: d */
    private int f14437d;

    /* renamed from: e */
    private C0514cb f14438e;

    /* renamed from: f */
    private Object f14439f;

    /* renamed from: g */
    private volatile InterfaceC3031od.a<?> f14440g;

    /* renamed from: h */
    private C2382db f14441h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3523zb(C2505gb<?> c2505gb, InterfaceC2467fb.a aVar) {
        this.f14435b = c2505gb;
        this.f14436c = aVar;
    }

    /* renamed from: b */
    private void m16918b(Object obj) {
        long m11768a = C2474fi.m11768a();
        try {
            InterfaceC0570d<X> m11955a = this.f14435b.m11955a((C2505gb<?>) obj);
            C2425eb c2425eb = new C2425eb(m11955a, obj, this.f14435b.m11972i());
            this.f14441h = new C2382db(this.f14440g.f12454a, this.f14435b.m11975l());
            this.f14435b.m11967d().mo14481a(this.f14441h, c2425eb);
            if (Log.isLoggable("SourceGenerator", 2)) {
                String str = "Finished encoding source to cache, key: " + this.f14441h + ", data: " + obj + ", encoder: " + m11955a + ", duration: " + C2474fi.m11767a(m11768a);
            }
            this.f14440g.f12456c.mo3665b();
            this.f14438e = new C0514cb(Collections.singletonList(this.f14440g.f12454a), this.f14435b, this);
        } catch (Throwable th) {
            this.f14440g.f12456c.mo3665b();
            throw th;
        }
    }

    /* renamed from: b */
    private boolean m16919b() {
        return this.f14437d < this.f14435b.m11970g().size();
    }

    @Override // p000.InterfaceC2467fb.a
    /* renamed from: a */
    public void mo11746a(InterfaceC0573g interfaceC0573g, Exception exc, InterfaceC2853ka<?> interfaceC2853ka, EnumC0567a enumC0567a) {
        this.f14436c.mo11746a(interfaceC0573g, exc, interfaceC2853ka, this.f14440g.f12456c.mo3666c());
    }

    @Override // p000.InterfaceC2467fb.a
    /* renamed from: a */
    public void mo11747a(InterfaceC0573g interfaceC0573g, Object obj, InterfaceC2853ka<?> interfaceC2853ka, EnumC0567a enumC0567a, InterfaceC0573g interfaceC0573g2) {
        this.f14436c.mo11747a(interfaceC0573g, obj, interfaceC2853ka, this.f14440g.f12456c.mo3666c(), interfaceC0573g);
    }

    @Override // p000.InterfaceC2853ka.a
    /* renamed from: a */
    public void mo3638a(Exception exc) {
        this.f14436c.mo11746a(this.f14441h, exc, this.f14440g.f12456c, this.f14440g.f12456c.mo3666c());
    }

    @Override // p000.InterfaceC2853ka.a
    /* renamed from: a */
    public void mo3639a(Object obj) {
        AbstractC2809jb m11968e = this.f14435b.m11968e();
        if (obj == null || !m11968e.mo13436a(this.f14440g.f12456c.mo3666c())) {
            this.f14436c.mo11747a(this.f14440g.f12454a, obj, this.f14440g.f12456c, this.f14440g.f12456c.mo3666c(), this.f14441h);
        } else {
            this.f14439f = obj;
            this.f14436c.mo11748d();
        }
    }

    @Override // p000.InterfaceC2467fb
    /* renamed from: a */
    public boolean mo3640a() {
        Object obj = this.f14439f;
        if (obj != null) {
            this.f14439f = null;
            m16918b(obj);
        }
        C0514cb c0514cb = this.f14438e;
        if (c0514cb != null && c0514cb.mo3640a()) {
            return true;
        }
        this.f14438e = null;
        this.f14440g = null;
        boolean z = false;
        while (!z && m16919b()) {
            List<InterfaceC3031od.a<?>> m11970g = this.f14435b.m11970g();
            int i = this.f14437d;
            this.f14437d = i + 1;
            this.f14440g = m11970g.get(i);
            if (this.f14440g != null && (this.f14435b.m11968e().mo13436a(this.f14440g.f12456c.mo3666c()) || this.f14435b.m11966c(this.f14440g.f12456c.mo3663a()))) {
                this.f14440g.f12456c.mo3664a(this.f14435b.m11973j(), this);
                z = true;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC2467fb
    public void cancel() {
        InterfaceC3031od.a<?> aVar = this.f14440g;
        if (aVar != null) {
            aVar.f12456c.cancel();
        }
    }

    @Override // p000.InterfaceC2467fb.a
    /* renamed from: d */
    public void mo11748d() {
        throw new UnsupportedOperationException();
    }
}
