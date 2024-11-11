package defpackage;

import com.bumptech.glide.load.g;
import defpackage.li;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class xc {
    private final gi<g, String> a = new gi<>(1000);
    private final u1<b> b = li.a(10, new a(this));

    /* loaded from: classes.dex */
    class a implements li.d<b> {
        a(xc xcVar) {
        }

        @Override // li.d
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements li.f {
        final MessageDigest b;
        private final ni c = ni.b();

        b(MessageDigest messageDigest) {
            this.b = messageDigest;
        }

        @Override // li.f
        public ni e() {
            return this.c;
        }
    }

    private String b(g gVar) {
        b a2 = this.b.a();
        ji.a(a2);
        b bVar = a2;
        try {
            gVar.a(bVar.b);
            return ki.a(bVar.b.digest());
        } finally {
            this.b.a(bVar);
        }
    }

    public String a(g gVar) {
        String a2;
        synchronized (this.a) {
            a2 = this.a.a((gi<g, String>) gVar);
        }
        if (a2 == null) {
            a2 = b(gVar);
        }
        synchronized (this.a) {
            this.a.b(gVar, a2);
        }
        return a2;
    }
}
