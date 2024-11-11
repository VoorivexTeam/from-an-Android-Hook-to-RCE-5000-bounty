package p000;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC2852k9;

/* renamed from: n8 */
/* loaded from: classes.dex */
class C2978n8 {

    /* renamed from: a */
    private static final AbstractC2852k9.a f12286a = AbstractC2852k9.a.m13650a("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n8$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12287a;

        static {
            int[] iArr = new int[AbstractC2852k9.b.values().length];
            f12287a = iArr;
            try {
                iArr[AbstractC2852k9.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12287a[AbstractC2852k9.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12287a[AbstractC2852k9.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m14293a(AbstractC2852k9 abstractC2852k9) {
        abstractC2852k9.mo13636a();
        int mo13644j = (int) (abstractC2852k9.mo13644j() * 255.0d);
        int mo13644j2 = (int) (abstractC2852k9.mo13644j() * 255.0d);
        int mo13644j3 = (int) (abstractC2852k9.mo13644j() * 255.0d);
        while (abstractC2852k9.mo13642h()) {
            abstractC2852k9.mo13649o();
        }
        abstractC2852k9.mo13639d();
        return Color.argb(255, mo13644j, mo13644j2, mo13644j3);
    }

    /* renamed from: a */
    private static PointF m14294a(AbstractC2852k9 abstractC2852k9, float f) {
        abstractC2852k9.mo13636a();
        float mo13644j = (float) abstractC2852k9.mo13644j();
        float mo13644j2 = (float) abstractC2852k9.mo13644j();
        while (abstractC2852k9.peek() != AbstractC2852k9.b.END_ARRAY) {
            abstractC2852k9.mo13649o();
        }
        abstractC2852k9.mo13639d();
        return new PointF(mo13644j * f, mo13644j2 * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static float m14295b(AbstractC2852k9 abstractC2852k9) {
        AbstractC2852k9.b peek = abstractC2852k9.peek();
        int i = a.f12287a[peek.ordinal()];
        if (i == 1) {
            return (float) abstractC2852k9.mo13644j();
        }
        if (i != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + peek);
        }
        abstractC2852k9.mo13636a();
        float mo13644j = (float) abstractC2852k9.mo13644j();
        while (abstractC2852k9.mo13642h()) {
            abstractC2852k9.mo13649o();
        }
        abstractC2852k9.mo13639d();
        return mo13644j;
    }

    /* renamed from: b */
    private static PointF m14296b(AbstractC2852k9 abstractC2852k9, float f) {
        float mo13644j = (float) abstractC2852k9.mo13644j();
        float mo13644j2 = (float) abstractC2852k9.mo13644j();
        while (abstractC2852k9.mo13642h()) {
            abstractC2852k9.mo13649o();
        }
        return new PointF(mo13644j * f, mo13644j2 * f);
    }

    /* renamed from: c */
    private static PointF m14297c(AbstractC2852k9 abstractC2852k9, float f) {
        abstractC2852k9.mo13638c();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (abstractC2852k9.mo13642h()) {
            int mo13634a = abstractC2852k9.mo13634a(f12286a);
            if (mo13634a == 0) {
                f2 = m14295b(abstractC2852k9);
            } else if (mo13634a != 1) {
                abstractC2852k9.mo13648n();
                abstractC2852k9.mo13649o();
            } else {
                f3 = m14295b(abstractC2852k9);
            }
        }
        abstractC2852k9.mo13640e();
        return new PointF(f2 * f, f3 * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static PointF m14298d(AbstractC2852k9 abstractC2852k9, float f) {
        int i = a.f12287a[abstractC2852k9.peek().ordinal()];
        if (i == 1) {
            return m14296b(abstractC2852k9, f);
        }
        if (i == 2) {
            return m14294a(abstractC2852k9, f);
        }
        if (i == 3) {
            return m14297c(abstractC2852k9, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + abstractC2852k9.peek());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static List<PointF> m14299e(AbstractC2852k9 abstractC2852k9, float f) {
        ArrayList arrayList = new ArrayList();
        abstractC2852k9.mo13636a();
        while (abstractC2852k9.peek() == AbstractC2852k9.b.BEGIN_ARRAY) {
            abstractC2852k9.mo13636a();
            arrayList.add(m14298d(abstractC2852k9, f));
            abstractC2852k9.mo13639d();
        }
        abstractC2852k9.mo13639d();
        return arrayList;
    }
}
