package p000;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C0574h;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.EnumC0569c;
import com.bumptech.glide.load.InterfaceC0577k;

/* renamed from: ie */
/* loaded from: classes.dex */
public class C2592ie implements InterfaceC0577k<Bitmap> {

    /* renamed from: b */
    public static final C0574h<Integer> f10622b = C0574h.m3956a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c */
    public static final C0574h<Bitmap.CompressFormat> f10623c = C0574h.m3955a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: a */
    private final InterfaceC0475bc f10624a;

    public C2592ie(InterfaceC0475bc interfaceC0475bc) {
        this.f10624a = interfaceC0475bc;
    }

    /* renamed from: a */
    private Bitmap.CompressFormat m12448a(Bitmap bitmap, C0575i c0575i) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c0575i.m3964a(f10623c);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // com.bumptech.glide.load.InterfaceC0577k
    /* renamed from: a */
    public EnumC0569c mo3966a(C0575i c0575i) {
        return EnumC0569c.TRANSFORMED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r6 == null) goto L24;
     */
    @Override // com.bumptech.glide.load.InterfaceC0570d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo3950a(p000.InterfaceC3353vb<android.graphics.Bitmap> r9, java.io.File r10, com.bumptech.glide.load.C0575i r11) {
        /*
            r8 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            android.graphics.Bitmap$CompressFormat r1 = r8.m12448a(r9, r11)
            int r2 = r9.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r9.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            p000.C2944mi.m14112a(r4, r2, r3, r1)
            long r2 = p000.C2474fi.m11768a()     // Catch: java.lang.Throwable -> Lb3
            com.bumptech.glide.load.h<java.lang.Integer> r4 = p000.C2592ie.f10622b     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r4 = r11.m3964a(r4)     // Catch: java.lang.Throwable -> Lb3
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Lb3
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lb3
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            bc r10 = r8.f10624a     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            if (r10 == 0) goto L45
            ja r10 = new ja     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            bc r6 = r8.f10624a     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            r10.<init>(r7, r6)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            r6 = r10
            goto L46
        L45:
            r6 = r7
        L46:
            r9.compress(r1, r4, r6)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r6.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r5 = 1
        L4d:
            r6.close()     // Catch: java.io.IOException -> L60 java.lang.Throwable -> Lb3
            goto L60
        L51:
            r9 = move-exception
            r6 = r7
            goto Lad
        L54:
            r6 = r7
            goto L58
        L56:
            r9 = move-exception
            goto Lad
        L58:
            r10 = 3
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch: java.lang.Throwable -> L56
            if (r6 == 0) goto L60
            goto L4d
        L60:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch: java.lang.Throwable -> Lb3
            if (r10 == 0) goto La9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3
            r10.<init>()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r0 = "Compressed with type: "
            r10.append(r0)     // Catch: java.lang.Throwable -> Lb3
            r10.append(r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r0 = " of size "
            r10.append(r0)     // Catch: java.lang.Throwable -> Lb3
            int r0 = p000.C2861ki.m13721a(r9)     // Catch: java.lang.Throwable -> Lb3
            r10.append(r0)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r0 = " in "
            r10.append(r0)     // Catch: java.lang.Throwable -> Lb3
            double r0 = p000.C2474fi.m11767a(r2)     // Catch: java.lang.Throwable -> Lb3
            r10.append(r0)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r0 = ", options format: "
            r10.append(r0)     // Catch: java.lang.Throwable -> Lb3
            com.bumptech.glide.load.h<android.graphics.Bitmap$CompressFormat> r0 = p000.C2592ie.f10623c     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r11 = r11.m3964a(r0)     // Catch: java.lang.Throwable -> Lb3
            r10.append(r11)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch: java.lang.Throwable -> Lb3
            boolean r9 = r9.hasAlpha()     // Catch: java.lang.Throwable -> Lb3
            r10.append(r9)     // Catch: java.lang.Throwable -> Lb3
            r10.toString()     // Catch: java.lang.Throwable -> Lb3
        La9:
            p000.C2944mi.m14109a()
            return r5
        Lad:
            if (r6 == 0) goto Lb2
            r6.close()     // Catch: java.io.IOException -> Lb2 java.lang.Throwable -> Lb3
        Lb2:
            throw r9     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r9 = move-exception
            p000.C2944mi.m14109a()
            goto Lb9
        Lb8:
            throw r9
        Lb9:
            goto Lb8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2592ie.mo3950a(vb, java.io.File, com.bumptech.glide.load.i):boolean");
    }
}
