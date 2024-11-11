package com.google.android.gms.common;

import android.os.RemoteException;
import com.google.android.gms.common.internal.q0;
import com.google.android.gms.common.internal.s0;
import defpackage.fp;
import defpackage.gp;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class o extends s0 {
    private int a;

    /* JADX INFO: Access modifiers changed from: protected */
    public o(byte[] bArr) {
        com.google.android.gms.common.internal.u.a(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte[] a();

    @Override // com.google.android.gms.common.internal.q0
    public final int b() {
        return hashCode();
    }

    public boolean equals(Object obj) {
        fp zzb;
        if (obj != null && (obj instanceof q0)) {
            try {
                q0 q0Var = (q0) obj;
                if (q0Var.b() == hashCode() && (zzb = q0Var.zzb()) != null) {
                    return Arrays.equals(a(), (byte[]) gp.a(zzb));
                }
                return false;
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return this.a;
    }

    @Override // com.google.android.gms.common.internal.q0
    public final fp zzb() {
        return gp.a(a());
    }
}
