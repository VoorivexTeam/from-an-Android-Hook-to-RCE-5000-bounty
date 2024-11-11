package com.google.android.gms.common;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractBinderC1051s0;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.InterfaceC1047q0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p000.BinderC2521gp;
import p000.InterfaceC2481fp;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.o */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1073o extends AbstractBinderC1051s0 {

    /* renamed from: a */
    private int f6285a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractBinderC1073o(byte[] bArr) {
        C1057u.m7293a(bArr.length == 25);
        this.f6285a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static byte[] m7312a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract byte[] mo7313a();

    @Override // com.google.android.gms.common.internal.InterfaceC1047q0
    /* renamed from: b */
    public final int mo7200b() {
        return hashCode();
    }

    public boolean equals(Object obj) {
        InterfaceC2481fp zzb;
        if (obj != null && (obj instanceof InterfaceC1047q0)) {
            try {
                InterfaceC1047q0 interfaceC1047q0 = (InterfaceC1047q0) obj;
                if (interfaceC1047q0.mo7200b() == hashCode() && (zzb = interfaceC1047q0.zzb()) != null) {
                    return Arrays.equals(mo7313a(), (byte[]) BinderC2521gp.m12037a(zzb));
                }
                return false;
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f6285a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1047q0
    public final InterfaceC2481fp zzb() {
        return BinderC2521gp.m12036a(mo7313a());
    }
}
