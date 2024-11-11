package p000;

import java.io.File;

/* loaded from: classes.dex */
public class a60 extends y50 {

    /* renamed from: b */
    private final int f45b;

    public a60(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.f45b = i;
    }

    @Override // p000.y50
    /* renamed from: a */
    protected boolean mo73a(File file, long j, int i) {
        return i <= this.f45b;
    }
}
