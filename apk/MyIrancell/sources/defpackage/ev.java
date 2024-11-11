package defpackage;

import android.content.Context;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.n;
import defpackage.fv;

/* loaded from: classes.dex */
public class ev implements fv {
    private gv a;

    private ev(Context context) {
        this.a = gv.a(context);
    }

    public static d<fv> a() {
        d.b a = d.a(fv.class);
        a.a(n.b(Context.class));
        a.a(dv.a());
        return a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ fv a(e eVar) {
        return new ev((Context) eVar.a(Context.class));
    }

    @Override // defpackage.fv
    public fv.a a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean a = this.a.a(str, currentTimeMillis);
        boolean a2 = this.a.a(currentTimeMillis);
        return (a && a2) ? fv.a.COMBINED : a2 ? fv.a.GLOBAL : a ? fv.a.SDK : fv.a.NONE;
    }
}
