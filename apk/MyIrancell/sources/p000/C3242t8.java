package p000;

import p000.AbstractC2852k9;
import p000.C2376d7;

/* renamed from: t8 */
/* loaded from: classes.dex */
class C3242t8 {

    /* renamed from: a */
    private static final AbstractC2852k9.a f13233a = AbstractC2852k9.a.m13650a("nm", "mm", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2376d7 m15563a(AbstractC2852k9 abstractC2852k9) {
        String str = null;
        C2376d7.a aVar = null;
        boolean z = false;
        while (abstractC2852k9.mo13642h()) {
            int mo13634a = abstractC2852k9.mo13634a(f13233a);
            if (mo13634a == 0) {
                str = abstractC2852k9.mo13647m();
            } else if (mo13634a == 1) {
                aVar = C2376d7.a.forId(abstractC2852k9.mo13645k());
            } else if (mo13634a != 2) {
                abstractC2852k9.mo13648n();
                abstractC2852k9.mo13649o();
            } else {
                z = abstractC2852k9.mo13643i();
            }
        }
        return new C2376d7(str, aVar, z);
    }
}
