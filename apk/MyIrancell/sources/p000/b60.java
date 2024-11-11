package p000;

import java.io.File;

/* loaded from: classes.dex */
public class b60 extends y50 {

    /* renamed from: b */
    private final long f2743b;

    public b60(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("Max size must be positive number!");
        }
        this.f2743b = j;
    }

    @Override // p000.y50
    /* renamed from: a */
    protected boolean mo73a(File file, long j, int i) {
        return j <= this.f2743b;
    }
}
