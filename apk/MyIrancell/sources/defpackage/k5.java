package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public class k5 extends m5<y6> {
    private final y6 i;

    public k5(List<v9<y6>> list) {
        super(list);
        y6 y6Var = list.get(0).b;
        int c = y6Var != null ? y6Var.c() : 0;
        this.i = new y6(new float[c], new int[c]);
    }

    @Override // defpackage.h5
    /* bridge */ /* synthetic */ Object a(v9 v9Var, float f) {
        return a((v9<y6>) v9Var, f);
    }

    @Override // defpackage.h5
    y6 a(v9<y6> v9Var, float f) {
        this.i.a(v9Var.b, v9Var.c, f);
        return this.i;
    }
}
