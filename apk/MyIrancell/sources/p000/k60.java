package p000;

import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k60 {

    /* renamed from: a */
    public final File f11651a;

    /* renamed from: b */
    public final w50 f11652b;

    /* renamed from: c */
    public final u50 f11653c;

    /* renamed from: d */
    public final i60 f11654d;

    /* renamed from: e */
    public final e60 f11655e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k60(File file, w50 w50Var, u50 u50Var, i60 i60Var, e60 e60Var) {
        this.f11651a = file;
        this.f11652b = w50Var;
        this.f11653c = u50Var;
        this.f11654d = i60Var;
        this.f11655e = e60Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public File m13622a(String str) {
        return new File(this.f11651a, this.f11652b.mo16135a(str));
    }
}
