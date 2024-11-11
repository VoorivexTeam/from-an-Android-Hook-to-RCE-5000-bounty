package p000;

import android.graphics.PointF;
import p000.AbstractC2852k9;

/* renamed from: w8 */
/* loaded from: classes.dex */
public class C3389w8 implements InterfaceC2545h9<PointF> {

    /* renamed from: a */
    public static final C3389w8 f13783a = new C3389w8();

    private C3389w8() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.InterfaceC2545h9
    /* renamed from: a */
    public PointF mo101a(AbstractC2852k9 abstractC2852k9, float f) {
        AbstractC2852k9.b peek = abstractC2852k9.peek();
        if (peek != AbstractC2852k9.b.BEGIN_ARRAY && peek != AbstractC2852k9.b.BEGIN_OBJECT) {
            if (peek == AbstractC2852k9.b.NUMBER) {
                PointF pointF = new PointF(((float) abstractC2852k9.mo13644j()) * f, ((float) abstractC2852k9.mo13644j()) * f);
                while (abstractC2852k9.mo13642h()) {
                    abstractC2852k9.mo13649o();
                }
                return pointF;
            }
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + peek);
        }
        return C2978n8.m14298d(abstractC2852k9, f);
    }
}
