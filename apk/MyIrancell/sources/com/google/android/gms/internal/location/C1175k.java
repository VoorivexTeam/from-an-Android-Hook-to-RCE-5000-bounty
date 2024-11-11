package com.google.android.gms.internal.location;

import android.content.Context;
import com.google.android.gms.common.api.internal.C0915k;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.location.C1574b;
import com.google.android.gms.location.InterfaceC1576c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.location.k */
/* loaded from: classes.dex */
public final class C1175k {

    /* renamed from: a */
    private final InterfaceC1188x<InterfaceC1170g> f6434a;

    /* renamed from: b */
    private boolean f6435b = false;

    /* renamed from: c */
    private final Map<C0915k.a<InterfaceC1576c>, BinderC1180p> f6436c = new HashMap();

    /* renamed from: d */
    private final Map<C0915k.a<Object>, BinderC1179o> f6437d = new HashMap();

    /* renamed from: e */
    private final Map<C0915k.a<C1574b>, BinderC1176l> f6438e = new HashMap();

    public C1175k(Context context, InterfaceC1188x<InterfaceC1170g> interfaceC1188x) {
        this.f6434a = interfaceC1188x;
    }

    /* renamed from: a */
    private final BinderC1176l m7485a(C0915k<C1574b> c0915k) {
        BinderC1176l binderC1176l;
        synchronized (this.f6438e) {
            binderC1176l = this.f6438e.get(c0915k.m6789b());
            if (binderC1176l == null) {
                binderC1176l = new BinderC1176l(c0915k);
            }
            this.f6438e.put(c0915k.m6789b(), binderC1176l);
        }
        return binderC1176l;
    }

    /* renamed from: a */
    public final void m7486a() {
        synchronized (this.f6436c) {
            for (BinderC1180p binderC1180p : this.f6436c.values()) {
                if (binderC1180p != null) {
                    this.f6434a.mo7478b().mo7480a(zzbf.m7501a(binderC1180p, (InterfaceC1164d) null));
                }
            }
            this.f6436c.clear();
        }
        synchronized (this.f6438e) {
            for (BinderC1176l binderC1176l : this.f6438e.values()) {
                if (binderC1176l != null) {
                    this.f6434a.mo7478b().mo7480a(zzbf.m7500a(binderC1176l, (InterfaceC1164d) null));
                }
            }
            this.f6438e.clear();
        }
        synchronized (this.f6437d) {
            for (BinderC1179o binderC1179o : this.f6437d.values()) {
                if (binderC1179o != null) {
                    this.f6434a.mo7478b().mo7481a(new zzo(2, null, binderC1179o.asBinder(), null));
                }
            }
            this.f6437d.clear();
        }
    }

    /* renamed from: a */
    public final void m7487a(C0915k.a<C1574b> aVar, InterfaceC1164d interfaceC1164d) {
        this.f6434a.mo7477a();
        C1057u.m7287a(aVar, "Invalid null listener key");
        synchronized (this.f6438e) {
            BinderC1176l remove = this.f6438e.remove(aVar);
            if (remove != null) {
                remove.m7491a();
                this.f6434a.mo7478b().mo7480a(zzbf.m7500a(remove, interfaceC1164d));
            }
        }
    }

    /* renamed from: a */
    public final void m7488a(zzbd zzbdVar, C0915k<C1574b> c0915k, InterfaceC1164d interfaceC1164d) {
        this.f6434a.mo7477a();
        this.f6434a.mo7478b().mo7480a(new zzbf(1, zzbdVar, null, null, m7485a(c0915k).asBinder(), interfaceC1164d != null ? interfaceC1164d.asBinder() : null));
    }

    /* renamed from: a */
    public final void m7489a(boolean z) {
        this.f6434a.mo7477a();
        this.f6434a.mo7478b().mo7483d(z);
        this.f6435b = z;
    }

    /* renamed from: b */
    public final void m7490b() {
        if (this.f6435b) {
            m7489a(false);
        }
    }
}
