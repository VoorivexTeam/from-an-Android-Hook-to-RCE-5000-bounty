package p000;

import java.io.File;
import p000.InterfaceC3030oc;

/* renamed from: rc */
/* loaded from: classes.dex */
public class C3161rc implements InterfaceC3030oc.a {

    /* renamed from: a */
    private final long f12947a;

    /* renamed from: b */
    private final a f12948b;

    /* renamed from: rc$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        File mo15258a();
    }

    public C3161rc(a aVar, long j) {
        this.f12947a = j;
        this.f12948b = aVar;
    }

    @Override // p000.InterfaceC3030oc.a
    /* renamed from: a */
    public InterfaceC3030oc mo14482a() {
        File mo15258a = this.f12948b.mo15258a();
        if (mo15258a == null) {
            return null;
        }
        if (mo15258a.mkdirs() || (mo15258a.exists() && mo15258a.isDirectory())) {
            return C3205sc.m15394a(mo15258a, this.f12947a);
        }
        return null;
    }
}
