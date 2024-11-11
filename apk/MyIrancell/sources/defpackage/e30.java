package defpackage;

/* loaded from: classes.dex */
public final class e30 {
    private final boolean a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e30(boolean z) {
        this.a = z;
    }

    public void a(hw[] hwVarArr) {
        if (!this.a || hwVarArr == null || hwVarArr.length < 3) {
            return;
        }
        hw hwVar = hwVarArr[0];
        hwVarArr[0] = hwVarArr[2];
        hwVarArr[2] = hwVar;
    }
}
