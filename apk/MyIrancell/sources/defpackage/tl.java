package defpackage;

import android.util.Base64;
import defpackage.kl;

/* loaded from: classes.dex */
public abstract class tl {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract a a(hk hkVar);

        public abstract a a(String str);

        public abstract a a(byte[] bArr);

        public abstract tl a();
    }

    public static a d() {
        kl.b bVar = new kl.b();
        bVar.a(hk.DEFAULT);
        return bVar;
    }

    public abstract String a();

    public tl a(hk hkVar) {
        a d = d();
        d.a(a());
        d.a(hkVar);
        d.a(b());
        return d.a();
    }

    public abstract byte[] b();

    public abstract hk c();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = a();
        objArr[1] = c();
        objArr[2] = b() == null ? "" : Base64.encodeToString(b(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
