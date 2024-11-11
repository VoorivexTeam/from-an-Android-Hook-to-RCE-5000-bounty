package defpackage;

import javax.annotation.Nullable;
import okio.BufferedSource;

/* loaded from: classes.dex */
public final class i90 extends j80 {

    @Nullable
    private final String c;
    private final long d;
    private final BufferedSource e;

    public i90(@Nullable String str, long j, BufferedSource bufferedSource) {
        this.c = str;
        this.d = j;
        this.e = bufferedSource;
    }

    @Override // defpackage.j80
    public long c() {
        return this.d;
    }

    @Override // defpackage.j80
    public b80 d() {
        String str = this.c;
        if (str != null) {
            return b80.b(str);
        }
        return null;
    }

    @Override // defpackage.j80
    public BufferedSource e() {
        return this.e;
    }
}
