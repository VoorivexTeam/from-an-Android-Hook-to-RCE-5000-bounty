package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class h3 implements Serializable, Iterable<Byte> {
    public static final h3 c = new r3(r4.b);
    private static final n3 d;
    private int b = 0;

    static {
        g3 g3Var = null;
        d = a3.a() ? new q3(g3Var) : new l3(g3Var);
        new j3();
    }

    public static h3 a(String str) {
        return new r3(str.getBytes(r4.a));
    }

    public static h3 a(byte[] bArr, int i, int i2) {
        b(i, i + i2, bArr.length);
        return new r3(d.a(bArr, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(byte b) {
        return b & 255;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p3 c(int i) {
        return new p3(i, null);
    }

    public abstract byte a(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int a() {
        return this.b;
    }

    protected abstract int a(int i, int i2, int i3);

    public abstract h3 a(int i, int i2);

    protected abstract String a(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(e3 e3Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte b(int i);

    public abstract boolean b();

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            int zza = zza();
            i = a(zza, 0, zza);
            if (i == 0) {
                i = 1;
            }
            this.b = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new g3(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zza());
        objArr[2] = zza() <= 50 ? e7.a(this) : String.valueOf(e7.a(a(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract int zza();

    public final String zzb() {
        return zza() == 0 ? "" : a(r4.a);
    }
}
