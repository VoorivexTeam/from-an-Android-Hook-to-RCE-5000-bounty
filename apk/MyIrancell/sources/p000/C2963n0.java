package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import androidx.core.R$styleable;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: n0 */
/* loaded from: classes.dex */
public final class C2963n0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final int[] f12207a;

        /* renamed from: b */
        final float[] f12208b;

        a(int i, int i2) {
            this.f12207a = new int[]{i, i2};
            this.f12208b = new float[]{0.0f, 1.0f};
        }

        a(int i, int i2, int i3) {
            this.f12207a = new int[]{i, i2, i3};
            this.f12208b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f12207a = new int[size];
            this.f12208b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f12207a[i] = list.get(i).intValue();
                this.f12208b[i] = list2.get(i).floatValue();
            }
        }
    }

    /* renamed from: a */
    private static Shader.TileMode m14217a(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Shader m14218a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray m14861a = C3105q0.m14861a(resources, theme, attributeSet, R$styleable.GradientColor);
        float m14859a = C3105q0.m14859a(m14861a, xmlPullParser, "startX", R$styleable.GradientColor_android_startX, 0.0f);
        float m14859a2 = C3105q0.m14859a(m14861a, xmlPullParser, "startY", R$styleable.GradientColor_android_startY, 0.0f);
        float m14859a3 = C3105q0.m14859a(m14861a, xmlPullParser, "endX", R$styleable.GradientColor_android_endX, 0.0f);
        float m14859a4 = C3105q0.m14859a(m14861a, xmlPullParser, "endY", R$styleable.GradientColor_android_endY, 0.0f);
        float m14859a5 = C3105q0.m14859a(m14861a, xmlPullParser, "centerX", R$styleable.GradientColor_android_centerX, 0.0f);
        float m14859a6 = C3105q0.m14859a(m14861a, xmlPullParser, "centerY", R$styleable.GradientColor_android_centerY, 0.0f);
        int m14866b = C3105q0.m14866b(m14861a, xmlPullParser, "type", R$styleable.GradientColor_android_type, 0);
        int m14860a = C3105q0.m14860a(m14861a, xmlPullParser, "startColor", R$styleable.GradientColor_android_startColor, 0);
        boolean m14865a = C3105q0.m14865a(xmlPullParser, "centerColor");
        int m14860a2 = C3105q0.m14860a(m14861a, xmlPullParser, "centerColor", R$styleable.GradientColor_android_centerColor, 0);
        int m14860a3 = C3105q0.m14860a(m14861a, xmlPullParser, "endColor", R$styleable.GradientColor_android_endColor, 0);
        int m14866b2 = C3105q0.m14866b(m14861a, xmlPullParser, "tileMode", R$styleable.GradientColor_android_tileMode, 0);
        float m14859a7 = C3105q0.m14859a(m14861a, xmlPullParser, "gradientRadius", R$styleable.GradientColor_android_gradientRadius, 0.0f);
        m14861a.recycle();
        a m14219a = m14219a(m14220b(resources, xmlPullParser, attributeSet, theme), m14860a, m14860a3, m14865a, m14860a2);
        if (m14866b != 1) {
            return m14866b != 2 ? new LinearGradient(m14859a, m14859a2, m14859a3, m14859a4, m14219a.f12207a, m14219a.f12208b, m14217a(m14866b2)) : new SweepGradient(m14859a5, m14859a6, m14219a.f12207a, m14219a.f12208b);
        }
        if (m14859a7 > 0.0f) {
            return new RadialGradient(m14859a5, m14859a6, m14859a7, m14219a.f12207a, m14219a.f12208b, m14217a(m14866b2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* renamed from: a */
    private static a m14219a(a aVar, int i, int i2, boolean z, int i3) {
        return aVar != null ? aVar : z ? new a(i, i3, i2) : new a(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static p000.C2963n0.a m14220b(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L8a
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L8a
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = androidx.core.R$styleable.GradientColorItem
            android.content.res.TypedArray r3 = p000.C3105q0.m14861a(r8, r11, r10, r3)
            int r5 = androidx.core.R$styleable.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = androidx.core.R$styleable.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = androidx.core.R$styleable.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = androidx.core.R$styleable.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' "
            r10.append(r9)
            java.lang.String r9 = "attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L8a:
            int r8 = r4.size()
            if (r8 <= 0) goto L96
            n0$a r8 = new n0$a
            r8.<init>(r4, r2)
            return r8
        L96:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2963n0.m14220b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):n0$a");
    }
}
