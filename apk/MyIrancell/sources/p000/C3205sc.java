package p000;

import android.util.Log;
import com.bumptech.glide.load.InterfaceC0573g;
import java.io.File;
import java.io.IOException;
import p000.C3518z9;
import p000.InterfaceC3030oc;

/* renamed from: sc */
/* loaded from: classes.dex */
public class C3205sc implements InterfaceC3030oc {

    /* renamed from: b */
    private final File f13078b;

    /* renamed from: c */
    private final long f13079c;

    /* renamed from: e */
    private C3518z9 f13081e;

    /* renamed from: d */
    private final C3122qc f13080d = new C3122qc();

    /* renamed from: a */
    private final C3433xc f13077a = new C3433xc();

    @Deprecated
    protected C3205sc(File file, long j) {
        this.f13078b = file;
        this.f13079c = j;
    }

    /* renamed from: a */
    public static InterfaceC3030oc m15394a(File file, long j) {
        return new C3205sc(file, j);
    }

    /* renamed from: a */
    private synchronized C3518z9 m15395a() {
        if (this.f13081e == null) {
            this.f13081e = C3518z9.m16858a(this.f13078b, 1, 1, this.f13079c);
        }
        return this.f13081e;
    }

    @Override // p000.InterfaceC3030oc
    /* renamed from: a */
    public File mo14480a(InterfaceC0573g interfaceC0573g) {
        String m16485a = this.f13077a.m16485a(interfaceC0573g);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            String str = "Get: Obtained: " + m16485a + " for for Key: " + interfaceC0573g;
        }
        try {
            C3518z9.e m16877b = m15395a().m16877b(m16485a);
            if (m16877b != null) {
                return m16877b.m16899a(0);
            }
            return null;
        } catch (IOException unused) {
            Log.isLoggable("DiskLruCacheWrapper", 5);
            return null;
        }
    }

    @Override // p000.InterfaceC3030oc
    /* renamed from: a */
    public void mo14481a(InterfaceC0573g interfaceC0573g, InterfaceC3030oc.b bVar) {
        C3518z9 m15395a;
        String m16485a = this.f13077a.m16485a(interfaceC0573g);
        this.f13080d.m15053a(m16485a);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                String str = "Put: Obtained: " + m16485a + " for for Key: " + interfaceC0573g;
            }
            try {
                m15395a = m15395a();
            } catch (IOException unused) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
            }
            if (m15395a.m16877b(m16485a) != null) {
                return;
            }
            C3518z9.c m16875a = m15395a.m16875a(m16485a);
            if (m16875a == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + m16485a);
            }
            try {
                if (bVar.mo11575a(m16875a.m16881a(0))) {
                    m16875a.m16884c();
                }
                m16875a.m16883b();
            } catch (Throwable th) {
                m16875a.m16883b();
                throw th;
            }
        } finally {
            this.f13080d.m15054b(m16485a);
        }
    }
}
