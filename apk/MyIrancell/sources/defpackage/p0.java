package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;

/* loaded from: classes.dex */
public final class p0 {

    /* loaded from: classes.dex */
    public static abstract class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: p0$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0078a implements Runnable {
            final /* synthetic */ Typeface b;

            RunnableC0078a(Typeface typeface) {
                this.b = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a(this.b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b implements Runnable {
            final /* synthetic */ int b;

            b(int i) {
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a(this.b);
            }
        }

        public abstract void a(int i);

        public final void a(int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new b(i));
        }

        public abstract void a(Typeface typeface);

        public final void a(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC0078a(typeface));
        }
    }

    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, a aVar) {
        if (context.isRestricted()) {
            return null;
        }
        return a(context, i, typedValue, i2, aVar, null, true);
    }

    private static Typeface a(Context context, int i, TypedValue typedValue, int i2, a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a2 = a(context, resources, typedValue, i, i2, aVar, handler, z);
        if (a2 != null || aVar != null) {
            return a2;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface a(android.content.Context r13, android.content.res.Resources r14, android.util.TypedValue r15, int r16, int r17, p0.a r18, android.os.Handler r19, boolean r20) {
        /*
            r2 = r14
            r0 = r15
            r3 = r16
            r4 = r17
            r8 = r18
            r9 = r19
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L8a
            java.lang.String r10 = r1.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r10.startsWith(r0)
            r11 = 0
            r12 = -3
            if (r0 != 0) goto L22
            if (r8 == 0) goto L21
            r8.a(r12, r9)
        L21:
            return r11
        L22:
            android.graphics.Typeface r0 = defpackage.t0.b(r14, r3, r4)
            if (r0 == 0) goto L2e
            if (r8 == 0) goto L2d
            r8.a(r0, r9)
        L2d:
            return r0
        L2e:
            java.lang.String r0 = r10.toLowerCase()     // Catch: java.io.IOException -> L6c org.xmlpull.v1.XmlPullParserException -> L74
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch: java.io.IOException -> L6c org.xmlpull.v1.XmlPullParserException -> L74
            if (r0 == 0) goto L5b
            android.content.res.XmlResourceParser r0 = r14.getXml(r3)     // Catch: java.io.IOException -> L6c org.xmlpull.v1.XmlPullParserException -> L74
            m0$a r1 = defpackage.m0.a(r0, r14)     // Catch: java.io.IOException -> L6c org.xmlpull.v1.XmlPullParserException -> L74
            if (r1 != 0) goto L4a
            if (r8 == 0) goto L49
            r8.a(r12, r9)     // Catch: java.io.IOException -> L6c org.xmlpull.v1.XmlPullParserException -> L74
        L49:
            return r11
        L4a:
            r0 = r13
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            android.graphics.Typeface r0 = defpackage.t0.a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.io.IOException -> L6c org.xmlpull.v1.XmlPullParserException -> L74
            return r0
        L5b:
            r0 = r13
            android.graphics.Typeface r0 = defpackage.t0.a(r13, r14, r3, r10, r4)     // Catch: java.io.IOException -> L6c org.xmlpull.v1.XmlPullParserException -> L74
            if (r8 == 0) goto L6b
            if (r0 == 0) goto L68
            r8.a(r0, r9)     // Catch: java.io.IOException -> L6c org.xmlpull.v1.XmlPullParserException -> L74
            goto L6b
        L68:
            r8.a(r12, r9)     // Catch: java.io.IOException -> L6c org.xmlpull.v1.XmlPullParserException -> L74
        L6b:
            return r0
        L6c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to read xml resource "
            goto L7b
        L74:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to parse xml resource "
        L7b:
            r0.append(r1)
            r0.append(r10)
            r0.toString()
            if (r8 == 0) goto L89
            r8.a(r12, r9)
        L89:
            return r11
        L8a:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Resource \""
            r4.append(r5)
            java.lang.String r2 = r14.getResourceName(r3)
            r4.append(r2)
            java.lang.String r2 = "\" ("
            r4.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r16)
            r4.append(r2)
            java.lang.String r2 = ") is not a Font: "
            r4.append(r2)
            r4.append(r15)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p0.a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, p0$a, android.os.Handler, boolean):android.graphics.Typeface");
    }

    public static Drawable a(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }
}
