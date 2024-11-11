package defpackage;

import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k60 {
    public final File a;
    public final w50 b;
    public final u50 c;
    public final i60 d;
    public final e60 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k60(File file, w50 w50Var, u50 u50Var, i60 i60Var, e60 e60Var) {
        this.a = file;
        this.b = w50Var;
        this.c = u50Var;
        this.d = i60Var;
        this.e = e60Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File a(String str) {
        return new File(this.a, this.b.a(str));
    }
}
