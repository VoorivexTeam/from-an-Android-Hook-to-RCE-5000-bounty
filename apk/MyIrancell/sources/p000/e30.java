package p000;

/* loaded from: classes.dex */
public final class e30 {

    /* renamed from: a */
    private final boolean f9911a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e30(boolean z) {
        this.f9911a = z;
    }

    /* renamed from: a */
    public void m11540a(C2568hw[] c2568hwArr) {
        if (!this.f9911a || c2568hwArr == null || c2568hwArr.length < 3) {
            return;
        }
        C2568hw c2568hw = c2568hwArr[0];
        c2568hwArr[0] = c2568hwArr[2];
        c2568hwArr[2] = c2568hw;
    }
}
