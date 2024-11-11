package defpackage;

import defpackage.g80;
import ir.tapsell.sdk.models.responseModels.TokenModel;

/* loaded from: classes.dex */
public class o50 implements h70 {
    @Override // defpackage.h70
    public g80 a(k80 k80Var, i80 i80Var) {
        fb0<TokenModel> e = ((l50) n50.a(l50.class)).a(z40.K().o()).e();
        if (!e.e()) {
            return null;
        }
        e50.b(e.a().getToken());
        g80.a f = i80Var.m().f();
        f.b("authorization", b50.c());
        return f.a();
    }
}
