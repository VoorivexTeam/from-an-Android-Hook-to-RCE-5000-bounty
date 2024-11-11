package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;
import com.google.android.gms.internal.measurement.C1528x0;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w0 */
/* loaded from: classes.dex */
public final class C1514w0 extends AbstractC1406o4<C1514w0, a> implements InterfaceC1561z5 {
    private static final C1514w0 zzd;
    private static volatile InterfaceC1348k6<C1514w0> zze;
    private InterfaceC1532x4<C1528x0> zzc = AbstractC1406o4.m8089o();

    /* renamed from: com.google.android.gms.internal.measurement.w0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1406o4.a<C1514w0, a> implements InterfaceC1561z5 {
        private a() {
            super(C1514w0.zzd);
        }

        /* synthetic */ a(C1430q0 c1430q0) {
            this();
        }

        /* renamed from: a */
        public final a m8628a(C1528x0.a aVar) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1514w0) this.f6791c).m8624a((C1528x0) ((AbstractC1406o4) aVar.mo7537i()));
            return this;
        }

        /* renamed from: a */
        public final C1528x0 m8629a(int i) {
            return ((C1514w0) this.f6791c).m8627b(0);
        }
    }

    static {
        C1514w0 c1514w0 = new C1514w0();
        zzd = c1514w0;
        AbstractC1406o4.m8085a((Class<C1514w0>) C1514w0.class, c1514w0);
    }

    private C1514w0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m8624a(C1528x0 c1528x0) {
        c1528x0.getClass();
        if (!this.zzc.zza()) {
            this.zzc = AbstractC1406o4.m8082a(this.zzc);
        }
        this.zzc.add(c1528x0);
    }

    /* renamed from: p */
    public static a m8625p() {
        return zzd.m8098k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1406o4
    /* renamed from: a */
    public final Object mo7518a(int i, Object obj, Object obj2) {
        C1430q0 c1430q0 = null;
        switch (C1430q0.f6843a[i - 1]) {
            case 1:
                return new C1514w0();
            case 2:
                return new a(c1430q0);
            case 3:
                return AbstractC1406o4.m8083a(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C1528x0.class});
            case 4:
                return zzd;
            case 5:
                InterfaceC1348k6<C1514w0> interfaceC1348k6 = zze;
                if (interfaceC1348k6 == null) {
                    synchronized (C1514w0.class) {
                        interfaceC1348k6 = zze;
                        if (interfaceC1348k6 == null) {
                            interfaceC1348k6 = new AbstractC1406o4.c<>(zzd);
                            zze = interfaceC1348k6;
                        }
                    }
                }
                return interfaceC1348k6;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final C1528x0 m8627b(int i) {
        return this.zzc.get(0);
    }

    public final List<C1528x0> zza() {
        return this.zzc;
    }
}
