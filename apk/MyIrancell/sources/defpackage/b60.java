package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public class b60 extends y50 {
    private final long b;

    public b60(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("Max size must be positive number!");
        }
        this.b = j;
    }

    @Override // defpackage.y50
    protected boolean a(File file, long j, int i) {
        return j <= this.b;
    }
}
