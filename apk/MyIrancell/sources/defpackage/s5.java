package defpackage;

import android.graphics.Path;
import java.util.List;

/* loaded from: classes.dex */
public class s5 extends h5<h7, Path> {
    private final h7 i;
    private final Path j;

    public s5(List<v9<h7>> list) {
        super(list);
        this.i = new h7();
        this.j = new Path();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.h5
    public Path a(v9<h7> v9Var, float f) {
        this.i.a(v9Var.b, v9Var.c, f);
        t9.a(this.i, this.j);
        return this.j;
    }
}
