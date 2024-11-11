package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public class a60 extends y50 {
    private final int b;

    public a60(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.b = i;
    }

    @Override // defpackage.y50
    protected boolean a(File file, long j, int i) {
        return i <= this.b;
    }
}
