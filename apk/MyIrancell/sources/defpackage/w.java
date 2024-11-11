package defpackage;

import android.content.res.ColorStateList;

/* loaded from: classes.dex */
class w implements z {
    private a0 j(y yVar) {
        return (a0) yVar.d();
    }

    @Override // defpackage.z
    public float a(y yVar) {
        return j(yVar).b();
    }

    @Override // defpackage.z
    public void a() {
    }

    @Override // defpackage.z
    public void a(y yVar, float f) {
        j(yVar).a(f);
    }

    @Override // defpackage.z
    public void a(y yVar, ColorStateList colorStateList) {
        j(yVar).a(colorStateList);
    }

    @Override // defpackage.z
    public ColorStateList b(y yVar) {
        return j(yVar).a();
    }

    @Override // defpackage.z
    public void b(y yVar, float f) {
        yVar.a().setElevation(f);
    }

    @Override // defpackage.z
    public float c(y yVar) {
        return yVar.a().getElevation();
    }

    @Override // defpackage.z
    public void c(y yVar, float f) {
        j(yVar).a(f, yVar.c(), yVar.b());
        i(yVar);
    }

    @Override // defpackage.z
    public float d(y yVar) {
        return j(yVar).c();
    }

    @Override // defpackage.z
    public float e(y yVar) {
        return d(yVar) * 2.0f;
    }

    @Override // defpackage.z
    public float f(y yVar) {
        return d(yVar) * 2.0f;
    }

    @Override // defpackage.z
    public void g(y yVar) {
        c(yVar, a(yVar));
    }

    @Override // defpackage.z
    public void h(y yVar) {
        c(yVar, a(yVar));
    }

    public void i(y yVar) {
        if (!yVar.c()) {
            yVar.a(0, 0, 0, 0);
            return;
        }
        float a = a(yVar);
        float d = d(yVar);
        int ceil = (int) Math.ceil(b0.a(a, d, yVar.b()));
        int ceil2 = (int) Math.ceil(b0.b(a, d, yVar.b()));
        yVar.a(ceil, ceil2, ceil, ceil2);
    }
}
