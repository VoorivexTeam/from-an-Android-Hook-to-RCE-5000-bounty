package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: j */
    static final PorterDuff.Mode f1457j = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f1458a;

    /* renamed from: b */
    Object f1459b;

    /* renamed from: c */
    public byte[] f1460c;

    /* renamed from: d */
    public Parcelable f1461d;

    /* renamed from: e */
    public int f1462e;

    /* renamed from: f */
    public int f1463f;

    /* renamed from: g */
    public ColorStateList f1464g = null;

    /* renamed from: h */
    PorterDuff.Mode f1465h = f1457j;

    /* renamed from: i */
    public String f1466i;

    /* renamed from: a */
    private static int m1471a(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private static String m1472a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "BITMAP_MASKABLE" : "URI" : "DATA" : "RESOURCE" : "BITMAP";
    }

    /* renamed from: b */
    private static String m1473b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public int m1474a() {
        if (this.f1458a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m1471a((Icon) this.f1459b);
        }
        if (this.f1458a == 2) {
            return this.f1462e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: a */
    public void m1475a(boolean z) {
        this.f1466i = this.f1465h.name();
        int i = this.f1458a;
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    this.f1460c = ((String) this.f1459b).getBytes(Charset.forName("UTF-16"));
                    return;
                }
                if (i == 3) {
                    this.f1460c = (byte[]) this.f1459b;
                    return;
                } else if (i == 4) {
                    this.f1460c = this.f1459b.toString().getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i != 5) {
                    return;
                }
            }
            if (z) {
                Bitmap bitmap = (Bitmap) this.f1459b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f1460c = byteArrayOutputStream.toByteArray();
                return;
            }
        } else if (z) {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
        this.f1461d = (Parcelable) this.f1459b;
    }

    /* renamed from: b */
    public String m1476b() {
        if (this.f1458a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m1473b((Icon) this.f1459b);
        }
        if (this.f1458a == 2) {
            return ((String) this.f1459b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: c */
    public void m1477c() {
        Parcelable parcelable;
        this.f1465h = PorterDuff.Mode.valueOf(this.f1466i);
        int i = this.f1458a;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.f1459b = this.f1460c;
                        return;
                    } else if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                    }
                }
                this.f1459b = new String(this.f1460c, Charset.forName("UTF-16"));
                return;
            }
            parcelable = this.f1461d;
            if (parcelable == null) {
                byte[] bArr = this.f1460c;
                this.f1459b = bArr;
                this.f1458a = 3;
                this.f1462e = 0;
                this.f1463f = bArr.length;
                return;
            }
        } else {
            parcelable = this.f1461d;
            if (parcelable == null) {
                throw new IllegalArgumentException("Invalid icon");
            }
        }
        this.f1459b = parcelable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (r1 != 5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f1458a
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r0 = r4.f1459b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f1458a
            java.lang.String r1 = m1472a(r1)
            r0.append(r1)
            int r1 = r4.f1458a
            r2 = 1
            if (r1 == r2) goto L77
            r3 = 2
            if (r1 == r3) goto L4f
            r2 = 3
            if (r1 == r2) goto L39
            r2 = 4
            if (r1 == r2) goto L2e
            r2 = 5
            if (r1 == r2) goto L77
            goto L97
        L2e:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f1459b
            r0.append(r1)
            goto L97
        L39:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f1462e
            r0.append(r1)
            int r1 = r4.f1463f
            if (r1 == 0) goto L97
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f1463f
            goto L94
        L4f:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.m1476b()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            int r3 = r4.m1474a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L97
        L77:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f1459b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f1459b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L94:
            r0.append(r1)
        L97:
            android.content.res.ColorStateList r1 = r4.f1464g
            if (r1 == 0) goto La5
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f1464g
            r0.append(r1)
        La5:
            android.graphics.PorterDuff$Mode r1 = r4.f1465h
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.f1457j
            if (r1 == r2) goto Lb5
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f1465h
            r0.append(r1)
        Lb5:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
