package defpackage;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.g;
import defpackage.vc;

/* loaded from: classes.dex */
public class uc extends gi<g, vb<?>> implements vc {
    private vc.a d;

    public uc(long j) {
        super(j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gi
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int b(vb<?> vbVar) {
        return vbVar == null ? super.b(null) : vbVar.c();
    }

    @Override // defpackage.vc
    public /* bridge */ /* synthetic */ vb a(g gVar) {
        return (vb) super.c(gVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.vc
    public /* bridge */ /* synthetic */ vb a(g gVar, vb vbVar) {
        return (vb) super.b((uc) gVar, (g) vbVar);
    }

    @Override // defpackage.vc
    @SuppressLint({"InlinedApi"})
    public void a(int i) {
        if (i >= 40) {
            a();
        } else if (i >= 20 || i == 15) {
            a(b() / 2);
        }
    }

    @Override // defpackage.vc
    public void a(vc.a aVar) {
        this.d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gi
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(g gVar, vb<?> vbVar) {
        vc.a aVar = this.d;
        if (aVar == null || vbVar == null) {
            return;
        }
        aVar.a(vbVar);
    }
}
