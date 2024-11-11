package p000;

import java.io.IOException;

/* loaded from: classes.dex */
public final class y80 extends RuntimeException {

    /* renamed from: b */
    private IOException f14115b;

    /* renamed from: c */
    private IOException f14116c;

    public y80(IOException iOException) {
        super(iOException);
        this.f14115b = iOException;
        this.f14116c = iOException;
    }

    /* renamed from: a */
    public IOException m16605a() {
        return this.f14115b;
    }

    /* renamed from: a */
    public void m16606a(IOException iOException) {
        o80.m14458a((Throwable) this.f14115b, (Throwable) iOException);
        this.f14116c = iOException;
    }

    /* renamed from: b */
    public IOException m16607b() {
        return this.f14116c;
    }
}
