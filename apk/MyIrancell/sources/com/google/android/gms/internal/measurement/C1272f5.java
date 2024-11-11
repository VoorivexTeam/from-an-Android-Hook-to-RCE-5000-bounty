package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f5 */
/* loaded from: classes.dex */
public class C1272f5 {

    /* renamed from: a */
    private volatile InterfaceC1533x5 f6613a;

    /* renamed from: b */
    private volatile AbstractC1300h3 f6614b;

    static {
        C1196a4.m7530a();
    }

    /* renamed from: b */
    private final InterfaceC1533x5 m7827b(InterfaceC1533x5 interfaceC1533x5) {
        if (this.f6613a == null) {
            synchronized (this) {
                if (this.f6613a == null) {
                    try {
                        this.f6613a = interfaceC1533x5;
                        this.f6614b = AbstractC1300h3.f6635c;
                    } catch (C1518w4 unused) {
                        this.f6613a = interfaceC1533x5;
                        this.f6614b = AbstractC1300h3.f6635c;
                    }
                }
            }
        }
        return this.f6613a;
    }

    /* renamed from: a */
    public final int m7828a() {
        if (this.f6614b != null) {
            return this.f6614b.zza();
        }
        if (this.f6613a != null) {
            return this.f6613a.mo8094c();
        }
        return 0;
    }

    /* renamed from: a */
    public final InterfaceC1533x5 m7829a(InterfaceC1533x5 interfaceC1533x5) {
        InterfaceC1533x5 interfaceC1533x52 = this.f6613a;
        this.f6614b = null;
        this.f6613a = interfaceC1533x5;
        return interfaceC1533x52;
    }

    /* renamed from: b */
    public final AbstractC1300h3 m7830b() {
        if (this.f6614b != null) {
            return this.f6614b;
        }
        synchronized (this) {
            if (this.f6614b != null) {
                return this.f6614b;
            }
            this.f6614b = this.f6613a == null ? AbstractC1300h3.f6635c : this.f6613a.mo8881h();
            return this.f6614b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1272f5)) {
            return false;
        }
        C1272f5 c1272f5 = (C1272f5) obj;
        InterfaceC1533x5 interfaceC1533x5 = this.f6613a;
        InterfaceC1533x5 interfaceC1533x52 = c1272f5.f6613a;
        return (interfaceC1533x5 == null && interfaceC1533x52 == null) ? m7830b().equals(c1272f5.m7830b()) : (interfaceC1533x5 == null || interfaceC1533x52 == null) ? interfaceC1533x5 != null ? interfaceC1533x5.equals(c1272f5.m7827b(interfaceC1533x5.mo8093b())) : m7827b(interfaceC1533x52.mo8093b()).equals(interfaceC1533x52) : interfaceC1533x5.equals(interfaceC1533x52);
    }

    public int hashCode() {
        return 1;
    }
}
