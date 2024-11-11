package p000;

import ir.tapsell.sdk.models.responseModels.TokenModel;
import p000.g80;

/* loaded from: classes.dex */
public class o50 implements h70 {
    @Override // p000.h70
    /* renamed from: a */
    public g80 mo12143a(k80 k80Var, i80 i80Var) {
        fb0<TokenModel> mo14742e = ((l50) n50.m14236a(l50.class)).m13809a(z40.m16734K().m16758o()).mo14742e();
        if (!mo14742e.m11755e()) {
            return null;
        }
        e50.m11547b(mo14742e.m11751a().getToken());
        g80.C2502a m11924f = i80Var.m12397m().m11924f();
        m11924f.m11933b("authorization", b50.m3325c());
        return m11924f.m11932a();
    }
}
