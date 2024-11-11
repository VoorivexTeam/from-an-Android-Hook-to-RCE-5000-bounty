package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.internal.AbstractBinderC1056t0;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.InterfaceC1058u0;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import p000.BinderC2521gp;

/* JADX INFO: Access modifiers changed from: package-private */
@CheckReturnValue
/* renamed from: com.google.android.gms.common.n */
/* loaded from: classes.dex */
public final class C1072n {

    /* renamed from: a */
    private static volatile InterfaceC1058u0 f6282a;

    /* renamed from: b */
    private static final Object f6283b = new Object();

    /* renamed from: c */
    private static Context f6284c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1116v m7308a(String str, AbstractBinderC1073o abstractBinderC1073o, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m7311b(str, abstractBinderC1073o, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized void m7310a(Context context) {
        synchronized (C1072n.class) {
            if (f6284c != null || context == null) {
                return;
            }
            f6284c = context.getApplicationContext();
        }
    }

    /* renamed from: b */
    private static C1116v m7311b(final String str, final AbstractBinderC1073o abstractBinderC1073o, final boolean z, boolean z2) {
        try {
            if (f6282a == null) {
                C1057u.m7286a(f6284c);
                synchronized (f6283b) {
                    if (f6282a == null) {
                        f6282a = AbstractBinderC1056t0.m7284a(DynamiteModule.m7440a(f6284c, DynamiteModule.f6384j, "com.google.android.gms.googlecertificates").m7450a("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            C1057u.m7286a(f6284c);
            try {
                return f6282a.mo7301a(new zzj(str, abstractBinderC1073o, z, z2), BinderC2521gp.m12036a(f6284c.getPackageManager())) ? C1116v.m7434c() : C1116v.m7432a((Callable<String>) new Callable(z, str, abstractBinderC1073o) { // from class: com.google.android.gms.common.p

                    /* renamed from: a */
                    private final boolean f6286a;

                    /* renamed from: b */
                    private final String f6287b;

                    /* renamed from: c */
                    private final AbstractBinderC1073o f6288c;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.f6286a = z;
                        this.f6287b = str;
                        this.f6288c = abstractBinderC1073o;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        String m7433a;
                        m7433a = C1116v.m7433a(this.f6287b, this.f6288c, this.f6286a, !r3 && C1072n.m7311b(r4, r5, true, false).f6368a);
                        return m7433a;
                    }
                });
            } catch (RemoteException e) {
                return C1116v.m7431a("module call", e);
            }
        } catch (DynamiteModule.C1120a e2) {
            String valueOf = String.valueOf(e2.getMessage());
            return C1116v.m7431a(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
        }
    }
}
