package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.measurement.m1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1373m1 {
    /* renamed from: a */
    public static <V> V m8020a(InterfaceC1417p1<V> interfaceC1417p1) {
        try {
            return interfaceC1417p1.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC1417p1.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
