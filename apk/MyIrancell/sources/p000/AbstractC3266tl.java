package p000;

import android.util.Base64;
import p000.C2864kl;

/* renamed from: tl */
/* loaded from: classes.dex */
public abstract class AbstractC3266tl {

    /* renamed from: tl$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract a mo13738a(EnumC2556hk enumC2556hk);

        /* renamed from: a */
        public abstract a mo13739a(String str);

        /* renamed from: a */
        public abstract a mo13740a(byte[] bArr);

        /* renamed from: a */
        public abstract AbstractC3266tl mo13741a();
    }

    /* renamed from: d */
    public static a m15657d() {
        C2864kl.b bVar = new C2864kl.b();
        bVar.mo13738a(EnumC2556hk.DEFAULT);
        return bVar;
    }

    /* renamed from: a */
    public abstract String mo13735a();

    /* renamed from: a */
    public AbstractC3266tl m15658a(EnumC2556hk enumC2556hk) {
        a m15657d = m15657d();
        m15657d.mo13739a(mo13735a());
        m15657d.mo13738a(enumC2556hk);
        m15657d.mo13740a(mo13736b());
        return m15657d.mo13741a();
    }

    /* renamed from: b */
    public abstract byte[] mo13736b();

    /* renamed from: c */
    public abstract EnumC2556hk mo13737c();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo13735a();
        objArr[1] = mo13737c();
        objArr[2] = mo13736b() == null ? "" : Base64.encodeToString(mo13736b(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
