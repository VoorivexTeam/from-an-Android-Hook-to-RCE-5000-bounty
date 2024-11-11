package defpackage;

import android.util.Log;
import com.bumptech.glide.load.g;
import defpackage.oc;
import defpackage.z9;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class sc implements oc {
    private final File b;
    private final long c;
    private z9 e;
    private final qc d = new qc();
    private final xc a = new xc();

    @Deprecated
    protected sc(File file, long j) {
        this.b = file;
        this.c = j;
    }

    public static oc a(File file, long j) {
        return new sc(file, j);
    }

    private synchronized z9 a() {
        if (this.e == null) {
            this.e = z9.a(this.b, 1, 1, this.c);
        }
        return this.e;
    }

    @Override // defpackage.oc
    public File a(g gVar) {
        String a = this.a.a(gVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            String str = "Get: Obtained: " + a + " for for Key: " + gVar;
        }
        try {
            z9.e b = a().b(a);
            if (b != null) {
                return b.a(0);
            }
            return null;
        } catch (IOException unused) {
            Log.isLoggable("DiskLruCacheWrapper", 5);
            return null;
        }
    }

    @Override // defpackage.oc
    public void a(g gVar, oc.b bVar) {
        z9 a;
        String a2 = this.a.a(gVar);
        this.d.a(a2);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                String str = "Put: Obtained: " + a2 + " for for Key: " + gVar;
            }
            try {
                a = a();
            } catch (IOException unused) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
            }
            if (a.b(a2) != null) {
                return;
            }
            z9.c a3 = a.a(a2);
            if (a3 == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + a2);
            }
            try {
                if (bVar.a(a3.a(0))) {
                    a3.c();
                }
                a3.b();
            } catch (Throwable th) {
                a3.b();
                throw th;
            }
        } finally {
            this.d.b(a2);
        }
    }
}
