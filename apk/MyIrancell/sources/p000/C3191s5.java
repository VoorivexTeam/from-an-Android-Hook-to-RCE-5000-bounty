package p000;

import android.graphics.Path;
import java.util.List;

/* renamed from: s5 */
/* loaded from: classes.dex */
public class C3191s5 extends AbstractC2538h5<C2540h7, Path> {

    /* renamed from: i */
    private final C2540h7 f13023i;

    /* renamed from: j */
    private final Path f13024j;

    public C3191s5(List<C3346v9<C2540h7>> list) {
        super(list);
        this.f13023i = new C2540h7();
        this.f13024j = new Path();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC2538h5
    /* renamed from: a */
    public Path mo12099a(C3346v9<C2540h7> c3346v9, float f) {
        this.f13023i.m12140a(c3346v9.f13631b, c3346v9.f13632c, f);
        C3243t9.m15578a(this.f13023i, this.f13024j);
        return this.f13024j;
    }
}
