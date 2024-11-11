package p000;

import javax.annotation.Nullable;
import okio.BufferedSource;

/* loaded from: classes.dex */
public final class i90 extends j80 {

    /* renamed from: c */
    @Nullable
    private final String f10602c;

    /* renamed from: d */
    private final long f10603d;

    /* renamed from: e */
    private final BufferedSource f10604e;

    public i90(@Nullable String str, long j, BufferedSource bufferedSource) {
        this.f10602c = str;
        this.f10603d = j;
        this.f10604e = bufferedSource;
    }

    @Override // p000.j80
    /* renamed from: c */
    public long mo12416c() {
        return this.f10603d;
    }

    @Override // p000.j80
    /* renamed from: d */
    public b80 mo12417d() {
        String str = this.f10602c;
        if (str != null) {
            return b80.m3341b(str);
        }
        return null;
    }

    @Override // p000.j80
    /* renamed from: e */
    public BufferedSource mo12418e() {
        return this.f10604e;
    }
}
