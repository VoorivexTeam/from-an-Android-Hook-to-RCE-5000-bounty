package p000;

import android.graphics.Color;
import p000.AbstractC2852k9;

/* renamed from: d8 */
/* loaded from: classes.dex */
public class C2377d8 implements InterfaceC2545h9<Integer> {

    /* renamed from: a */
    public static final C2377d8 f9716a = new C2377d8();

    private C2377d8() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.InterfaceC2545h9
    /* renamed from: a */
    public Integer mo101a(AbstractC2852k9 abstractC2852k9, float f) {
        boolean z = abstractC2852k9.peek() == AbstractC2852k9.b.BEGIN_ARRAY;
        if (z) {
            abstractC2852k9.mo13636a();
        }
        double mo13644j = abstractC2852k9.mo13644j();
        double mo13644j2 = abstractC2852k9.mo13644j();
        double mo13644j3 = abstractC2852k9.mo13644j();
        double mo13644j4 = abstractC2852k9.mo13644j();
        if (z) {
            abstractC2852k9.mo13639d();
        }
        if (mo13644j <= 1.0d && mo13644j2 <= 1.0d && mo13644j3 <= 1.0d && mo13644j4 <= 1.0d) {
            mo13644j *= 255.0d;
            mo13644j2 *= 255.0d;
            mo13644j3 *= 255.0d;
            mo13644j4 *= 255.0d;
        }
        return Integer.valueOf(Color.argb((int) mo13644j4, (int) mo13644j, (int) mo13644j2, (int) mo13644j3));
    }
}
