package p000;

import com.bumptech.glide.load.InterfaceC0573g;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p000.C2898li;

/* renamed from: xc */
/* loaded from: classes.dex */
public class C3433xc {

    /* renamed from: a */
    private final C2514gi<InterfaceC0573g, String> f14033a = new C2514gi<>(1000);

    /* renamed from: b */
    private final InterfaceC3283u1<b> f14034b = C2898li.m13868a(10, new a(this));

    /* renamed from: xc$a */
    /* loaded from: classes.dex */
    class a implements C2898li.d<b> {
        a(C3433xc c3433xc) {
        }

        @Override // p000.C2898li.d
        /* renamed from: a, reason: avoid collision after fix types in other method */
        public b mo13672a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xc$b */
    /* loaded from: classes.dex */
    public static final class b implements C2898li.f {

        /* renamed from: b */
        final MessageDigest f14035b;

        /* renamed from: c */
        private final AbstractC2990ni f14036c = AbstractC2990ni.m14334b();

        b(MessageDigest messageDigest) {
            this.f14035b = messageDigest;
        }

        @Override // p000.C2898li.f
        /* renamed from: e */
        public AbstractC2990ni mo12179e() {
            return this.f14036c;
        }
    }

    /* renamed from: b */
    private String m16484b(InterfaceC0573g interfaceC0573g) {
        b mo13874a = this.f14034b.mo13874a();
        C2816ji.m13459a(mo13874a);
        b bVar = mo13874a;
        try {
            interfaceC0573g.mo3954a(bVar.f14035b);
            return C2861ki.m13724a(bVar.f14035b.digest());
        } finally {
            this.f14034b.mo13875a(bVar);
        }
    }

    /* renamed from: a */
    public String m16485a(InterfaceC0573g interfaceC0573g) {
        String m12001a;
        synchronized (this.f14033a) {
            m12001a = this.f14033a.m12001a((C2514gi<InterfaceC0573g, String>) interfaceC0573g);
        }
        if (m12001a == null) {
            m12001a = m16484b(interfaceC0573g);
        }
        synchronized (this.f14033a) {
            this.f14033a.m12007b(interfaceC0573g, m12001a);
        }
        return m12001a;
    }
}
