package p000;

import p000.AbstractC2852k9;
import p000.C0007a6;

/* renamed from: f8 */
/* loaded from: classes.dex */
public class C2462f8 implements InterfaceC2545h9<C0007a6> {

    /* renamed from: a */
    public static final C2462f8 f10094a = new C2462f8();

    /* renamed from: b */
    private static final AbstractC2852k9.a f10095b = AbstractC2852k9.a.m13650a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private C2462f8() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.InterfaceC2545h9
    /* renamed from: a */
    public C0007a6 mo101a(AbstractC2852k9 abstractC2852k9, float f) {
        C0007a6.a aVar = C0007a6.a.CENTER;
        abstractC2852k9.mo13638c();
        C0007a6.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (abstractC2852k9.mo13642h()) {
            switch (abstractC2852k9.mo13634a(f10095b)) {
                case 0:
                    str = abstractC2852k9.mo13647m();
                    break;
                case 1:
                    str2 = abstractC2852k9.mo13647m();
                    break;
                case 2:
                    f2 = (float) abstractC2852k9.mo13644j();
                    break;
                case 3:
                    int mo13645k = abstractC2852k9.mo13645k();
                    if (mo13645k <= C0007a6.a.CENTER.ordinal() && mo13645k >= 0) {
                        aVar2 = C0007a6.a.values()[mo13645k];
                        break;
                    } else {
                        aVar2 = C0007a6.a.CENTER;
                        break;
                    }
                case 4:
                    i = abstractC2852k9.mo13645k();
                    break;
                case 5:
                    f3 = (float) abstractC2852k9.mo13644j();
                    break;
                case 6:
                    f4 = (float) abstractC2852k9.mo13644j();
                    break;
                case 7:
                    i2 = C2978n8.m14293a(abstractC2852k9);
                    break;
                case 8:
                    i3 = C2978n8.m14293a(abstractC2852k9);
                    break;
                case 9:
                    f5 = (float) abstractC2852k9.mo13644j();
                    break;
                case 10:
                    z = abstractC2852k9.mo13643i();
                    break;
                default:
                    abstractC2852k9.mo13648n();
                    abstractC2852k9.mo13649o();
                    break;
            }
        }
        abstractC2852k9.mo13640e();
        return new C0007a6(str, str2, f2, aVar2, i, f3, f4, i2, i3, f5, z);
    }
}
