package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class u00 extends y00 {
    private final y00 h = new n00();

    private static fw a(fw fwVar) {
        String e = fwVar.e();
        if (e.charAt(0) == '0') {
            return new fw(e.substring(1), null, fwVar.d(), sv.UPC_A);
        }
        throw xv.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.y00
    public int a(gz gzVar, int[] iArr, StringBuilder sb) {
        return this.h.a(gzVar, iArr, sb);
    }

    @Override // defpackage.y00, defpackage.t00
    public fw a(int i, gz gzVar, Map<wv, ?> map) {
        return a(this.h.a(i, gzVar, map));
    }

    @Override // defpackage.y00
    public fw a(int i, gz gzVar, int[] iArr, Map<wv, ?> map) {
        return a(this.h.a(i, gzVar, iArr, map));
    }

    @Override // defpackage.t00, defpackage.dw
    public fw a(uv uvVar) {
        return a(this.h.a(uvVar));
    }

    @Override // defpackage.t00, defpackage.dw
    public fw a(uv uvVar, Map<wv, ?> map) {
        return a(this.h.a(uvVar, map));
    }

    @Override // defpackage.y00
    sv b() {
        return sv.UPC_A;
    }
}
