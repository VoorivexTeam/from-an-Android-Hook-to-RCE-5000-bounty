package p000;

import p000.AbstractC2852k9;

/* renamed from: i8 */
/* loaded from: classes.dex */
class C2582i8 {

    /* renamed from: a */
    private static final AbstractC2852k9.a f10576a = AbstractC2852k9.a.m13650a("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0451b6 m12384a(AbstractC2852k9 abstractC2852k9) {
        abstractC2852k9.mo13638c();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = 0.0f;
        while (abstractC2852k9.mo13642h()) {
            int mo13634a = abstractC2852k9.mo13634a(f10576a);
            if (mo13634a == 0) {
                str = abstractC2852k9.mo13647m();
            } else if (mo13634a == 1) {
                str2 = abstractC2852k9.mo13647m();
            } else if (mo13634a == 2) {
                str3 = abstractC2852k9.mo13647m();
            } else if (mo13634a != 3) {
                abstractC2852k9.mo13648n();
                abstractC2852k9.mo13649o();
            } else {
                f = (float) abstractC2852k9.mo13644j();
            }
        }
        abstractC2852k9.mo13640e();
        return new C0451b6(str, str2, str3, f);
    }
}
